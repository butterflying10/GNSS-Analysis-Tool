// Copyright 2018 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.abecerra.pvt_ephemeris_client.suplclient.asn1.supl2.map_lcs_datatypes;

// Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//
//
import com.abecerra.pvt_ephemeris_client.suplclient.asn1.base.Asn1OctetString;
import com.abecerra.pvt_ephemeris_client.suplclient.asn1.base.Asn1Tag;
import com.abecerra.pvt_ephemeris_client.suplclient.asn1.base.BitStream;
import com.abecerra.pvt_ephemeris_client.suplclient.asn1.base.BitStreamReader;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
 * 
 */
public  class VelocityEstimate extends Asn1OctetString {
  //

  private static final Asn1Tag TAG_VelocityEstimate
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public VelocityEstimate() {
    super();
    setMinSize(4);
setMaxSize(7);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_VelocityEstimate;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_VelocityEstimate != null) {
      return ImmutableList.of(TAG_VelocityEstimate);
    } else {
      return Asn1OctetString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new VelocityEstimate from encoded stream.
   */
  public static VelocityEstimate fromPerUnaligned(byte[] encodedBytes) {
    VelocityEstimate result = new VelocityEstimate();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new VelocityEstimate from encoded stream.
   */
  public static VelocityEstimate fromPerAligned(byte[] encodedBytes) {
    VelocityEstimate result = new VelocityEstimate();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  @Override public Iterable<BitStream> encodePerUnaligned() {
    return super.encodePerUnaligned();
  }

  @Override public Iterable<BitStream> encodePerAligned() {
    return super.encodePerAligned();
  }

  @Override public void decodePerUnaligned(BitStreamReader reader) {
    super.decodePerUnaligned(reader);
  }

  @Override public void decodePerAligned(BitStreamReader reader) {
    super.decodePerAligned(reader);
  }

  @Override protected String getTypeName() {
    return "VelocityEstimate";
  }
}
