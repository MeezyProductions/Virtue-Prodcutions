/* Class528_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.LinkedList;

public class Class528_Sub6 extends Node
{
    static Class186 aClass186_10250;
    static int anInt10251;
    int[] anIntArray10252;
    int[] anIntArray10253 = { -1 };
    static Class692 aClass692_10254 = new Class692(32);
    static int anInt10255;
    
    long method9264(int[] is, int i, int[] is_0_, boolean bool, int i_1_) {
	long[] ls = ByteBuffer.aLongArray10662;
	long l = -1L;
	l = l >>> 8 ^ ls[(int) ((l ^ (long) (i >> 8)) & 0xffL)];
	l = l >>> 8 ^ ls[(int) ((l ^ (long) i) & 0xffL)];
	for (int i_2_ = 0; i_2_ < is.length; i_2_++) {
	    l = l >>> 8 ^ ls[(int) ((l ^ (long) (is[i_2_] >> 24)) & 0xffL)];
	    l = l >>> 8 ^ ls[(int) ((l ^ (long) (is[i_2_] >> 16)) & 0xffL)];
	    l = l >>> 8 ^ ls[(int) ((l ^ (long) (is[i_2_] >> 8)) & 0xffL)];
	    l = l >>> 8 ^ ls[(int) ((l ^ (long) is[i_2_]) & 0xffL)];
	}
	if (null != is_0_) {
	    for (int i_3_ = 0; i_3_ < 5; i_3_++)
		l = l >>> 8 ^ ls[(int) ((l ^ (long) is_0_[i_3_]) & 0xffL)];
	}
	l = l >>> 8 ^ ls[(int) ((l ^ (long) (bool ? 1 : 0)) & 0xffL)];
	return l;
    }
    
    static {
	aClass186_10250 = new Class186(11);
    }
    
    Class528_Sub6() {
	((Class528_Sub6) this).anIntArray10252 = new int[] { 0 };
    }
    
    final Class157 method9265(Class173 class173, int i, Class690 class690,
			      int i_4_, boolean bool, PlayerModel playerModel,
			      byte i_5_) {
	Class157 class157 = null;
	int i_6_ = i;
	RenderType renderType = null;
	if (-1 != i_4_)
	    renderType
		= (RenderType) Class147.aClass5_Sub14_1673.method63(i_4_,
								  1045143228);
	int[] is = ((Class528_Sub6) this).anIntArray10253;
	if (renderType != null && null != renderType.anIntArray7682) {
	    is = new int[renderType.anIntArray7682.length];
	    for (int i_7_ = 0; i_7_ < renderType.anIntArray7682.length; i_7_++) {
		int i_8_ = renderType.anIntArray7682[i_7_];
		if (i_8_ >= 0
		    && i_8_ < ((Class528_Sub6) this).anIntArray10253.length)
		    is[i_7_] = ((Class528_Sub6) this).anIntArray10253[i_8_];
		else
		    is[i_7_] = -1;
	    }
	}
	if (null != class690)
	    i_6_ |= class690.method8078(420477504);
	long l = method9264(is, i_4_,
			    playerModel != null ? playerModel.anIntArray7965 : null,
			    bool, -1991015812);
	if (aClass186_10250 != null)
	    class157 = (Class157) aClass186_10250.method2727(l);
	if (null == class157
	    || class173.method2245(class157.method1874(), i_6_) != 0) {
	    if (null != class157)
		i_6_ = class173.method2366(i_6_, class157.method1874());
	    int i_9_ = i_6_;
	    boolean bool_10_ = false;
	    for (int i_11_ = 0; i_11_ < is.length; i_11_++) {
		if (-1 != is[i_11_]
		    && !((ItemType)
			 Class18.aClass5_Sub13_206.method63(is[i_11_],
							    -1629967184))
			    .method511(bool, null, -1828652472))
		    bool_10_ = true;
	    }
	    if (bool_10_)
		return null;
	    Class177[] class177s = new Class177[is.length];
	    for (int i_12_ = 0; i_12_ < is.length; i_12_++) {
		if (is[i_12_] != -1)
		    class177s[i_12_]
			= ((ItemType)
			   Class18.aClass5_Sub13_206.method63(is[i_12_],
							      74415684))
			      .method519(bool, null, -935032143);
	    }
	    if (null != renderType && renderType.anIntArrayArray7678 != null) {
		for (int i_13_ = 0;
		     i_13_ < renderType.anIntArrayArray7678.length; i_13_++) {
		    if (null != renderType.anIntArrayArray7678[i_13_]
			&& null != class177s[i_13_]) {
			int i_14_ = renderType.anIntArrayArray7678[i_13_][0];
			int i_15_ = renderType.anIntArrayArray7678[i_13_][1];
			int i_16_ = renderType.anIntArrayArray7678[i_13_][2];
			int i_17_ = renderType.anIntArrayArray7678[i_13_][3];
			int i_18_ = renderType.anIntArrayArray7678[i_13_][4];
			int i_19_ = renderType.anIntArrayArray7678[i_13_][5];
			if (i_17_ != 0 || 0 != i_18_ || 0 != i_19_)
			    class177s[i_13_].method2578(i_17_, i_18_, i_19_);
			if (0 != i_14_ || 0 != i_15_ || 0 != i_16_)
			    class177s[i_13_].method2572(i_14_, i_15_, i_16_);
		    }
		}
	    }
	    Class177 class177 = new Class177(class177s, class177s.length);
	    if (null != playerModel)
		i_9_ |= 0x4000;
	    class157 = class173.method2244(class177, i_9_,
					   -1914354377 * anInt10251, 64, 855);
	    if (null != playerModel) {
		for (int i_20_ = 0; i_20_ < 10; i_20_++) {
		    for (int i_21_ = 0;
			 i_21_ < Class590.aShortArrayArray7735[i_20_].length;
			 i_21_++) {
			if (playerModel.anIntArray7965[i_20_]
			    < (Class73.aShortArrayArrayArray782[i_20_]
			       [i_21_]).length)
			    class157.method1914
				(Class590.aShortArrayArray7735[i_20_][i_21_],
				 (Class73.aShortArrayArrayArray782[i_20_]
				  [i_21_][playerModel.anIntArray7965[i_20_]]));
		    }
		}
		for (int i_22_ = 0; i_22_ < 10; i_22_++) {
		    for (int i_23_ = 0;
			 i_23_ < Class439.aShortArrayArray4897[i_22_].length;
			 i_23_++) {
			if (playerModel.anIntArray7957[i_22_]
			    < (Class101.aShortArrayArrayArray1287[i_22_]
			       [i_23_]).length)
			    class157.method1916
				(Class439.aShortArrayArray4897[i_22_][i_23_],
				 (Class101.aShortArrayArrayArray1287[i_22_]
				  [i_23_][playerModel.anIntArray7957[i_22_]]));
		    }
		}
	    }
	    if (aClass186_10250 != null) {
		class157.method1873(i_6_);
		aClass186_10250.method2729(class157, l);
	    }
	}
	if (null == class690)
	    return class157;
	Class157 class157_24_ = class157.method1951((byte) 1, i_6_, true);
	class690.method8079(class157_24_, 0, 885697340);
	return class157_24_;
    }
    
    static void method9266() {
	aClass692_10254.method8141(2127090666);
    }
    
    static void method9267() {
	aClass186_10250.method2731(-1553679623);
    }
    
    static void method9268() {
	aClass186_10250.method2731(-1929288462);
    }
    
    static void method9269(int i) {
	anInt10251 = 15433863 * i;
	aClass186_10250.method2731(-1715291131);
    }
    
    static void method9270() {
	aClass186_10250.method2731(-1408111568);
    }
    
    static void method9271() {
	aClass186_10250.method2731(-862835751);
    }
    
    static void method9272() {
	aClass186_10250.method2731(-1477865132);
    }
    
    static final void method9273(Class648 class648, int i) {
	((Class648) class648).aLongArray8398
	    [(((Class648) class648).anInt8399 += 232005975) * 683825767 - 1]
	    = ((Long) (((Class648) class648).aClass528_Sub21_Sub14_8397
		       .anObjectArray11622
		       [-630179809 * ((Class648) class648).anInt8390]))
		  .longValue();
    }
    
    static void method9274(int i) {
	Class98.anInt1252 = 0;
	Class98.anInt1250 = 713309193;
	Class98.anInt1247 = -620673979;
    }
    
    static final void method9275(Class648 class648, byte i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = ((Class648) class648).aClass528_Sub36_8416.aByte10497;
    }
    
    public static void method9276(Interface45 interface45,
				  Interface46 interface46, int i) {
	Class621.anInt8056 = 0;
	Class621.anInt8057 = 0;
	Class621.aList8063 = new LinkedList();
	Class621.aClass511_Sub2_Sub1_Sub1Array8055
	    = new Class511_Sub2_Sub1_Sub1[1024];
	Class621.aClass612Array8058
	    = (new Class612
	       [1 + Class174.anIntArray2010[Class621.anInt8068 * 2094320943]]);
	Class621.anInt8059 = 0;
	Class621.anInt8060 = 0;
	Class621.anInterface46_8069 = interface46;
    }
    
    static final void method9277(Class648 class648, byte i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class514.aClass528_Sub38_6967.aClass691_Sub29_10575
		  .method10063(-565315778) == 1 ? 1 : 0;
    }
}
