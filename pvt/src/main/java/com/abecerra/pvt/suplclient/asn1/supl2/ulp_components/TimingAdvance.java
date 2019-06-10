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

package com.abecerra.pvt.suplclient.asn1.supl2.ulp_components;

// Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//
//
import com.abecerra.pvt.suplclient.asn1.base.Asn1Integer;
import com.abecerra.pvt.suplclient.asn1.base.Asn1Object;
import com.abecerra.pvt.suplclient.asn1.base.Asn1Sequence;
import com.abecerra.pvt.suplclient.asn1.base.Asn1Tag;
import com.abecerra.pvt.suplclient.asn1.base.BitStream;
import com.abecerra.pvt.suplclient.asn1.base.BitStreamReader;
import com.abecerra.pvt.suplclient.asn1.base.SequenceComponent;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
* 
*/
public  class TimingAdvance extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_TimingAdvance
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public TimingAdvance() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_TimingAdvance;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_TimingAdvance != null) {
      return ImmutableList.of(TAG_TimingAdvance);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new TimingAdvance from encoded stream.
   */
  public static TimingAdvance fromPerUnaligned(byte[] encodedBytes) {
    TimingAdvance result = new TimingAdvance();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new TimingAdvance from encoded stream.
   */
  public static TimingAdvance fromPerAligned(byte[] encodedBytes) {
    TimingAdvance result = new TimingAdvance();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }



  @Override protected boolean isExtensible() {
    return true;
  }

  @Override public boolean containsExtensionValues() {
    for (SequenceComponent extensionComponent : getExtensionComponents()) {
      if (extensionComponent.isExplicitlySet()) return true;
    }
    return false;
  }

  
  private TimingAdvance.tAType tA_;
  public TimingAdvance.tAType getTA() {
    return tA_;
  }
  /**
   * @throws ClassCastException if value is not a TimingAdvance.tAType
   */
  public void setTA(Asn1Object value) {
    this.tA_ = (TimingAdvance.tAType) value;
  }
  public TimingAdvance.tAType setTAToNewInstance() {
    tA_ = new TimingAdvance.tAType();
    return tA_;
  }
  
  private TAResolution tAResolution_;
  public TAResolution getTAResolution() {
    return tAResolution_;
  }
  /**
   * @throws ClassCastException if value is not a TAResolution
   */
  public void setTAResolution(Asn1Object value) {
    this.tAResolution_ = (TAResolution) value;
  }
  public TAResolution setTAResolutionToNewInstance() {
    tAResolution_ = new TAResolution();
    return tAResolution_;
  }
  
  private ChipRate chipRate_;
  public ChipRate getChipRate() {
    return chipRate_;
  }
  /**
   * @throws ClassCastException if value is not a ChipRate
   */
  public void setChipRate(Asn1Object value) {
    this.chipRate_ = (ChipRate) value;
  }
  public ChipRate setChipRateToNewInstance() {
    chipRate_ = new ChipRate();
    return chipRate_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getTA() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getTA();
          }

          @Override public void setToNewInstance() {
            setTAToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? TimingAdvance.tAType.getPossibleFirstTags() : ImmutableList.of(tag);
          }

          @Override
          public Asn1Tag getTag() {
            return tag;
          }

          @Override
          public boolean isImplicitTagging() {
            return true;
          }

          @Override public String toIndentedString(String indent) {
                return "tA : "
                    + getTA().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getTAResolution() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getTAResolution();
          }

          @Override public void setToNewInstance() {
            setTAResolutionToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? TAResolution.getPossibleFirstTags() : ImmutableList.of(tag);
          }

          @Override
          public Asn1Tag getTag() {
            return tag;
          }

          @Override
          public boolean isImplicitTagging() {
            return true;
          }

          @Override public String toIndentedString(String indent) {
                return "tAResolution : "
                    + getTAResolution().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getChipRate() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getChipRate();
          }

          @Override public void setToNewInstance() {
            setChipRateToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? ChipRate.getPossibleFirstTags() : ImmutableList.of(tag);
          }

          @Override
          public Asn1Tag getTag() {
            return tag;
          }

          @Override
          public boolean isImplicitTagging() {
            return true;
          }

          @Override public String toIndentedString(String indent) {
                return "chipRate : "
                    + getChipRate().toIndentedString(indent);
              }
        });
    
    return builder.build();
  }

  @Override public Iterable<? extends SequenceComponent>
                                                    getExtensionComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
      
      return builder.build();
    }

  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class tAType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_tAType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public tAType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("8191"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_tAType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_tAType != null) {
      return ImmutableList.of(TAG_tAType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new tAType from encoded stream.
   */
  public static tAType fromPerUnaligned(byte[] encodedBytes) {
    tAType result = new tAType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new tAType from encoded stream.
   */
  public static tAType fromPerAligned(byte[] encodedBytes) {
    tAType result = new tAType();
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

  @Override public String toString() {
    return toIndentedString("");
  }

  public String toIndentedString(String indent) {
    return "tAType = " + getInteger() + ";\n";
  }
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

  @Override public String toString() {
    return toIndentedString("");
  }

  public String toIndentedString(String indent) {
    StringBuilder builder = new StringBuilder();
    builder.append("TimingAdvance = {\n");
    final String internalIndent = indent + "  ";
    for (SequenceComponent component : getComponents()) {
      if (component.isExplicitlySet()) {
        builder.append(internalIndent)
            .append(component.toIndentedString(internalIndent));
      }
    }
    if (isExtensible()) {
      builder.append(internalIndent).append("...\n");
      for (SequenceComponent component : getExtensionComponents()) {
        if (component.isExplicitlySet()) {
          builder.append(internalIndent)
              .append(component.toIndentedString(internalIndent));
        }
      }
    }
    builder.append(indent).append("};\n");
    return builder.toString();
  }
}