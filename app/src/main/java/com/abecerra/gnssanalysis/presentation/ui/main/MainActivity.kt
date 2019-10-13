package com.abecerra.gnssanalysis.presentation.ui.main

import android.app.PendingIntent
import android.content.Intent
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.abecerra.gnssanalysis.R
import com.abecerra.gnssanalysis.app.utils.CustomViewPagerAdapter
import com.abecerra.gnssanalysis.presentation.view.CustomAHBottomNavigationItem
import com.abecerra.gnssanalysis.presentation.ui.position.PvtComputationFragment
import com.abecerra.gnssanalysis.presentation.ui.skyplot.SkyPlotFragment
import com.abecerra.gnssanalysis.presentation.ui.statistics.StatisticsFragment
import com.abecerra.pvt_acquisition.acquisition.GnssService
import com.abecerra.pvt_acquisition.acquisition.GnssServiceOutput
import com.abecerra.pvt_acquisition.app.NotificationBuilder.buildGnssNotification
import com.abecerra.pvt_acquisition.app.base.BaseGnssActivity
import com.aurelhubert.ahbottomnavigation.AHBottomNavigation
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseGnssActivity(), MainActivityInput {

    private val pvtComputationFragment: PvtComputationFragment = PvtComputationFragment()
    private val skyPlotFragment: SkyPlotFragment = SkyPlotFragment()
    private val statisticsFragment: StatisticsFragment = StatisticsFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setViewPager()
        setupBottomNavigation()
    }

    private fun setViewPager() {
        val pagerAdapter = CustomViewPagerAdapter(supportFragmentManager)

        pagerAdapter.addFragments(pvtComputationFragment, "Position")
        pagerAdapter.addFragments(skyPlotFragment, "GNSS state")
        pagerAdapter.addFragments(statisticsFragment, "Statistics")

        viewPager.setPagingEnabled(false)
        viewPager.offscreenPageLimit = 5
        viewPager.adapter = pagerAdapter
        viewPager.currentItem = 0
    }

    private fun setupBottomNavigation() {
        val position = CustomAHBottomNavigationItem(
            getString(R.string.position_bottom),
            R.drawable.ic_position
        )
        val status = CustomAHBottomNavigationItem(
            getString(R.string.gnss_state_bottom),
            R.drawable.ic_satellite
        )
        val statistics = CustomAHBottomNavigationItem(
            getString(R.string.statistics_bottom),
            R.drawable.ic_statistics
        )

        val itemList = arrayListOf(position, status, statistics)
        bottomNavigation.addItems(itemList)

        bottomNavigation.titleState = AHBottomNavigation.TitleState.ALWAYS_SHOW

        bottomNavigation.defaultBackgroundColor = ContextCompat.getColor(this, R.color.white)
        bottomNavigation.accentColor = ContextCompat.getColor(this, R.color.colorPrimary)

        bottomNavigation.setOnTabSelectedListener { pos, wasSelected ->
            if (!wasSelected) {
                viewPager.setCurrentItem(pos, false)
            }
            true
        }
    }

    override fun getGnssService(): GnssService? = mService

    override fun getNotificationPendingIntent(): PendingIntent {
        val notifIntent = Intent(this, MainActivity::class.java)
        notifIntent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
        return PendingIntent.getActivity(
            this,
            0,
            notifIntent,
            PendingIntent.FLAG_UPDATE_CURRENT
        )
    }

    override fun getActiveListeners(): List<GnssServiceOutput.GnssEventsListener> {
        return arrayListOf(skyPlotFragment, statisticsFragment)
    }
}