/* Class528_Sub21_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class528_Sub21_Sub4 extends Class528_Sub21
{
    Class46 aClass46_11528;
    String[] aStringArray11529;
    int[] anIntArray11530;
    int[][] anIntArrayArray11531;
    public int[] anIntArray11532;
    public boolean aBool11533 = true;
    
    void method10464(ByteBuffer class528_sub42) {
	for (;;) {
	    int i = class528_sub42.readUnsignedByte((byte) 60);
	    if (0 == i)
		break;
	    method10466(class528_sub42, i, -721939783);
	}
    }
    
    void method10465(ByteBuffer class528_sub42, byte i) {
	for (;;) {
	    int i_0_ = class528_sub42.readUnsignedByte((byte) 122);
	    if (0 == i_0_)
		break;
	    method10466(class528_sub42, i_0_, 1786360382);
	}
    }
    
    void method10466(ByteBuffer class528_sub42, int i, int i_1_) {
	if (1 == i)
	    ((Class528_Sub21_Sub4) this).aStringArray11529
		= Class520.method6348(class528_sub42.readString(1539060091),
				      '<', (byte) -61);
	else if (i == 2) {
	    int i_2_ = class528_sub42.readUnsignedByte((byte) 112);
	    anIntArray11532 = new int[i_2_];
	    for (int i_3_ = 0; i_3_ < i_2_; i_3_++)
		anIntArray11532[i_3_] = class528_sub42.readUnsignedShort(-822431348);
	} else if (i == 3) {
	    int i_4_ = class528_sub42.readUnsignedByte((byte) 6);
	    ((Class528_Sub21_Sub4) this).anIntArray11530 = new int[i_4_];
	    ((Class528_Sub21_Sub4) this).anIntArrayArray11531
		= new int[i_4_][];
	    for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
		int i_6_ = class528_sub42.readUnsignedShort(-2043089341);
		Class628 class628 = Class233.method3255(i_6_, 266264668);
		if (class628 != null) {
		    ((Class528_Sub21_Sub4) this).anIntArray11530[i_5_] = i_6_;
		    ((Class528_Sub21_Sub4) this).anIntArrayArray11531[i_5_]
			= new int[-338627193 * class628.anInt8184];
		    for (int i_7_ = 0; i_7_ < class628.anInt8184 * -338627193;
			 i_7_++)
			((Class528_Sub21_Sub4) this).anIntArrayArray11531
			    [i_5_][i_7_]
			    = class528_sub42.readUnsignedShort(-802768109);
		}
	    }
	} else if (i == 4)
	    aBool11533 = false;
    }
    
    public int method10467(int i) {
	if (((Class528_Sub21_Sub4) this).anIntArray11530 == null)
	    return 0;
	return ((Class528_Sub21_Sub4) this).anIntArray11530.length;
    }
    
    Class528_Sub21_Sub4() {
	/* empty */
    }
    
    void method10468(int i) {
	if (null != anIntArray11532) {
	    for (int i_8_ = 0; i_8_ < anIntArray11532.length; i_8_++)
		anIntArray11532[i_8_] |= 0x8000;
	}
    }
    
    public Class628 method10469(int i, byte i_9_) {
	if (null == ((Class528_Sub21_Sub4) this).anIntArray11530 || i < 0
	    || i > ((Class528_Sub21_Sub4) this).anIntArray11530.length)
	    return null;
	return Class233.method3255((((Class528_Sub21_Sub4) this)
				    .anIntArray11530[i]),
				   -1971599775);
    }
    
    public int method10470(int i, int i_10_, byte i_11_) {
	if (((Class528_Sub21_Sub4) this).anIntArray11530 == null || i < 0
	    || i > ((Class528_Sub21_Sub4) this).anIntArray11530.length)
	    return -1;
	if (null == ((Class528_Sub21_Sub4) this).anIntArrayArray11531[i]
	    || i_10_ < 0
	    || (i_10_
		> ((Class528_Sub21_Sub4) this).anIntArrayArray11531[i].length))
	    return -1;
	return ((Class528_Sub21_Sub4) this).anIntArrayArray11531[i][i_10_];
    }
    
    public int method10471() {
	if (((Class528_Sub21_Sub4) this).anIntArray11530 == null)
	    return 0;
	return ((Class528_Sub21_Sub4) this).anIntArray11530.length;
    }
    
    void method10472(ByteBuffer class528_sub42, int i) {
	if (1 == i)
	    ((Class528_Sub21_Sub4) this).aStringArray11529
		= Class520.method6348(class528_sub42.readString(2089348670),
				      '<', (byte) 47);
	else if (i == 2) {
	    int i_12_ = class528_sub42.readUnsignedByte((byte) 33);
	    anIntArray11532 = new int[i_12_];
	    for (int i_13_ = 0; i_13_ < i_12_; i_13_++)
		anIntArray11532[i_13_] = class528_sub42.readUnsignedShort(105173644);
	} else if (i == 3) {
	    int i_14_ = class528_sub42.readUnsignedByte((byte) 41);
	    ((Class528_Sub21_Sub4) this).anIntArray11530 = new int[i_14_];
	    ((Class528_Sub21_Sub4) this).anIntArrayArray11531
		= new int[i_14_][];
	    for (int i_15_ = 0; i_15_ < i_14_; i_15_++) {
		int i_16_ = class528_sub42.readUnsignedShort(451444611);
		Class628 class628 = Class233.method3255(i_16_, -1195840919);
		if (class628 != null) {
		    ((Class528_Sub21_Sub4) this).anIntArray11530[i_15_]
			= i_16_;
		    ((Class528_Sub21_Sub4) this).anIntArrayArray11531[i_15_]
			= new int[-338627193 * class628.anInt8184];
		    for (int i_17_ = 0;
			 i_17_ < class628.anInt8184 * -338627193; i_17_++)
			((Class528_Sub21_Sub4) this).anIntArrayArray11531
			    [i_15_][i_17_]
			    = class528_sub42.readUnsignedShort(-1935682581);
		}
	    }
	} else if (i == 4)
	    aBool11533 = false;
    }
    
    public void method10473(ByteBuffer class528_sub42, int[] is, int i) {
	if (null != ((Class528_Sub21_Sub4) this).anIntArray11530) {
	    for (int i_18_ = 0;
		 (i_18_ < ((Class528_Sub21_Sub4) this).anIntArray11530.length
		  && i_18_ < is.length);
		 i_18_++) {
		int i_19_ = method10469(i_18_, (byte) 1).anInt8173 * 489679685;
		if (i_19_ > 0)
		    class528_sub42.method9691((long) is[i_18_], i_19_,
					      1790966943);
	    }
	}
    }
    
    public String method10474() {
	StringBuilder stringbuilder = new StringBuilder(80);
	if (null == ((Class528_Sub21_Sub4) this).aStringArray11529)
	    return "";
	stringbuilder
	    .append(((Class528_Sub21_Sub4) this).aStringArray11529[0]);
	for (int i = 1;
	     i < ((Class528_Sub21_Sub4) this).aStringArray11529.length; i++) {
	    for (int i_20_ = 0; i_20_ < 3; i_20_++)
		stringbuilder.append('.');
	    stringbuilder
		.append(((Class528_Sub21_Sub4) this).aStringArray11529[i]);
	}
	return stringbuilder.toString();
    }
    
    public int method10475() {
	if (((Class528_Sub21_Sub4) this).anIntArray11530 == null)
	    return 0;
	return ((Class528_Sub21_Sub4) this).anIntArray11530.length;
    }
    
    public String method10476(int i) {
	StringBuilder stringbuilder = new StringBuilder(80);
	if (null == ((Class528_Sub21_Sub4) this).aStringArray11529)
	    return "";
	stringbuilder
	    .append(((Class528_Sub21_Sub4) this).aStringArray11529[0]);
	for (int i_21_ = 1;
	     i_21_ < ((Class528_Sub21_Sub4) this).aStringArray11529.length;
	     i_21_++) {
	    for (int i_22_ = 0; i_22_ < 3; i_22_++)
		stringbuilder.append('.');
	    stringbuilder
		.append(((Class528_Sub21_Sub4) this).aStringArray11529[i_21_]);
	}
	return stringbuilder.toString();
    }
    
    public int method10477() {
	if (((Class528_Sub21_Sub4) this).anIntArray11530 == null)
	    return 0;
	return ((Class528_Sub21_Sub4) this).anIntArray11530.length;
    }
    
    void method10478(ByteBuffer class528_sub42) {
	for (;;) {
	    int i = class528_sub42.readUnsignedByte((byte) 65);
	    if (0 == i)
		break;
	    method10466(class528_sub42, i, 273279826);
	}
    }
    
    public String method10479(ByteBuffer class528_sub42, byte i) {
	StringBuilder stringbuilder = new StringBuilder(80);
	if (null != ((Class528_Sub21_Sub4) this).anIntArray11530) {
	    for (int i_23_ = 0;
		 i_23_ < ((Class528_Sub21_Sub4) this).anIntArray11530.length;
		 i_23_++) {
		stringbuilder.append(((Class528_Sub21_Sub4) this)
				     .aStringArray11529[i_23_]);
		stringbuilder.append
		    (((Class528_Sub21_Sub4) this).aClass46_11528.method862
		     (method10469(i_23_, (byte) 1),
		      ((Class528_Sub21_Sub4) this).anIntArrayArray11531[i_23_],
		      class528_sub42.method9634((Class233.method3255
						 ((((Class528_Sub21_Sub4) this)
						   .anIntArray11530[i_23_]),
						  856125615)
						 .anInt8183) * 517862789,
						-271960672)));
	    }
	}
	stringbuilder.append(((Class528_Sub21_Sub4) this).aStringArray11529
			     [(((Class528_Sub21_Sub4) this)
			       .aStringArray11529).length - 1]);
	return stringbuilder.toString();
    }
    
    void method10480() {
	if (null != anIntArray11532) {
	    for (int i = 0; i < anIntArray11532.length; i++)
		anIntArray11532[i] |= 0x8000;
	}
    }
}
