/* Class528_Sub21_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class528_Sub21_Sub14 extends Class528_Sub21
{
    public Class692[] aClass692Array11618;
    public String aString11619;
    public int anInt11620;
    public int[] anIntArray11621;
    public Object[] anObjectArray11622;
    public int anInt11623;
    public int anInt11624;
    public int anInt11625;
    public Cs2Context aClass561_11626;
    public int anInt11627;
    public int anInt11628;
    public Class496[] aClass496Array11629;
    IMultiVarDefinitionsLoader anInterface15_11630;
    public static Class151 aClass151_11631;
    
    Class496 method10562(ByteBuffer class528_sub42, Class496[] class496s,
			 byte i) {
	int i_0_ = class528_sub42.readUnsignedShort(-830354246);
	if (i_0_ < 0 || i_0_ >= class496s.length)
	    throw new RuntimeException("");
	Class496 class496 = class496s[i_0_];
	return class496;
    }
    
    int method10563(ByteBuffer class528_sub42, int i) {
	class528_sub42.pointer
	    = 2015001547 * (class528_sub42.payload.length - 2);
	int i_1_ = class528_sub42.readUnsignedShort(615770789);
	int i_2_ = class528_sub42.payload.length - 2 - i_1_ - 16;
	class528_sub42.pointer = i_2_ * 2015001547;
	int i_3_ = class528_sub42.readInt(149821741);
	anInt11628 = class528_sub42.readUnsignedShort(508814667) * 1209205087;
	anInt11623 = class528_sub42.readUnsignedShort(-762893752) * -172566907;
	anInt11625 = class528_sub42.readUnsignedShort(-1862229561) * 1249693187;
	anInt11620 = class528_sub42.readUnsignedShort(-1261853525) * -1269626867;
	anInt11627 = class528_sub42.readUnsignedShort(-1654779096) * -1454596721;
	anInt11624 = class528_sub42.readUnsignedShort(-696430222) * 1126666693;
	int i_4_ = class528_sub42.readUnsignedByte((byte) 39);
	if (i_4_ > 0) {
	    aClass692Array11618 = new Class692[i_4_];
	    for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
		int i_6_ = class528_sub42.readUnsignedShort(-780711132);
		Class692 class692
		    = new Class692(Class327.method4259(i_6_, -2134279851));
		aClass692Array11618[i_5_] = class692;
		while (i_6_-- > 0) {
		    int i_7_ = class528_sub42.readInt(-1393653455);
		    int i_8_ = class528_sub42.readInt(-706920350);
		    class692.method8142(new Class528_Sub17(i_8_), (long) i_7_);
		}
	    }
	}
	class528_sub42.pointer = 0;
	aString11619 = class528_sub42.method9684((byte) -35);
	aClass496Array11629 = new Class496[i_3_];
	return i_2_;
    }
    
    public Class528_Sub21_Sub14(ByteBuffer class528_sub42,
				IMultiVarDefinitionsLoader iMultiVarDefinitionsLoader) {
	((Class528_Sub21_Sub14) this).anInterface15_11630 = iMultiVarDefinitionsLoader;
	int i = method10563(class528_sub42, -1227515774);
	int i_9_ = 0;
	Class496[] class496s = Class91.method1219((byte) -102);
	while (-185904669 * class528_sub42.pointer < i) {
	    Class496 class496
		= method10562(class528_sub42, class496s, (byte) 8);
	    method10564(class528_sub42, i_9_, class496, (byte) -49);
	    i_9_++;
	}
    }
    
    void method10564(ByteBuffer class528_sub42, int i, Class496 class496,
		     byte i_10_) {
	int i_11_ = aClass496Array11629.length;
	if (class496 == Class496.aClass496_5580
	    || class496 == Class496.aClass496_5581) {
	    VarDomainType varDomainType
		= ((VarDomainType)
		   Class443.method5321(VarDomainType.method5330(65280),
				       class528_sub42.readUnsignedByte((byte) 45),
				       1654200186));
	    int i_12_ = class528_sub42.readUnsignedShort(-2004185485);
	    if (null == anObjectArray11622)
		anObjectArray11622 = new Object[i_11_];
	    anObjectArray11622[i]
		= ((Class528_Sub21_Sub14) this).anInterface15_11630
		      .method82(varDomainType, i_12_, -4972549);
	    if (anIntArray11621 == null)
		anIntArray11621 = new int[i_11_];
	    anIntArray11621[i] = class528_sub42.readUnsignedByte((byte) 83);
	} else if (class496 == Class496.aClass496_5584) {
	    Class483 class483
		= ((Class483)
		   Class443.method5321(Class483.method5867((byte) 1),
				       class528_sub42.readUnsignedByte((byte) 1),
				       704290336));
	    switch (1711133271 * class483.anInt5477) {
	    default:
		throw new RuntimeException();
	    case 0:
		if (null == anIntArray11621)
		    anIntArray11621 = new int[i_11_];
		class496 = Class496.aClass496_6394;
		anIntArray11621[i] = class528_sub42.readInt(-547688769);
		break;
	    case 3:
		if (anObjectArray11622 == null)
		    anObjectArray11622 = new Object[i_11_];
		class496 = Class496.aClass496_5604;
		anObjectArray11622[i]
		    = Long.valueOf(class528_sub42.method9633(771973092));
		break;
	    case 2:
		if (anObjectArray11622 == null)
		    anObjectArray11622 = new Object[i_11_];
		anObjectArray11622[i]
		    = class528_sub42.readString(1616742708).intern();
	    }
	} else if (Class496.aClass496_5718 == class496
		   || Class496.aClass496_5583 == class496) {
	    int i_13_ = class528_sub42.readUnsignedShort(950777412);
	    if (null == anObjectArray11622)
		anObjectArray11622 = new Object[i_11_];
	    anObjectArray11622[i]
		= ((Class528_Sub21_Sub14) this).anInterface15_11630
		      .method79(i_13_, (byte) 10);
	    if (anIntArray11621 == null)
		anIntArray11621 = new int[i_11_];
	    anIntArray11621[i] = class528_sub42.readUnsignedByte((byte) 34);
	} else {
	    if (anIntArray11621 == null)
		anIntArray11621 = new int[i_11_];
	    if (null != class496 && class496.aBool5706)
		anIntArray11621[i] = class528_sub42.readInt(-418711152);
	    else
		anIntArray11621[i] = class528_sub42.readUnsignedByte((byte) 114);
	}
	aClass496Array11629[i] = class496;
    }
}
