/* Class137_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;
import java.util.Iterator;

public class Class137_Sub2 extends Class137
{
    float[][] aFloatArrayArray8955;
    int anInt8956;
    int anInt8957;
    int anInt8958;
    int anInt8959;
    Class344 aClass344_8960;
    int anInt8961;
    Class528_Sub26[][][] aClass528_Sub26ArrayArrayArray8962;
    int anInt8963;
    int anInt8964;
    float aFloat8965 = 3.4028235E38F;
    float aFloat8966 = -3.4028235E38F;
    short[][] aShortArrayArray8967;
    int[][][] anIntArrayArrayArray8968;
    int[][][] anIntArrayArrayArray8969;
    int[][][] anIntArrayArrayArray8970;
    int anInt8971;
    int[][][] anIntArrayArrayArray8972;
    int[][][] anIntArrayArrayArray8973;
    byte[][] aByteArrayArray8974;
    int[] anIntArray8975;
    Class688 aClass688_8976 = new Class688();
    Node[] aClass528Array8977;
    Interface36 anInterface36_8978;
    Interface36 anInterface36_8979;
    Class173_Sub1 aClass173_Sub1_8980;
    int anInt8981;
    int anInt8982;
    static final int anInt8983 = 74;
    static final int anInt8984 = 1;
    float[][] aFloatArrayArray8985;
    float[][] aFloatArrayArray8986;
    Class692 aClass692_8987;
    byte[][] aByteArrayArray8988;
    int[][][] anIntArrayArrayArray8989;
    ByteBuffer aByteBuffer8990;
    ByteBuffer aByteBuffer8991;
    Class334 aClass334_8992;
    Node[] aClass528Array8993;
    int[] anIntArray8994;
    int anInt8995;
    int[] anIntArray8996;
    
    public void method1661(Class528_Sub21_Sub12 class528_sub21_sub12, int i,
			   int i_0_, int i_1_, int i_2_, boolean bool) {
	if (((Class137_Sub2) this).aClass334_8992 != null
	    && class528_sub21_sub12 != null) {
	    int i_3_ = (i - (i_0_ * (((Class173_Sub1) (((Class137_Sub2) this)
						       .aClass173_Sub1_8980))
				     .anInt9306)
			     >> 8)
			>> ((Class173_Sub1) (((Class137_Sub2) this)
					     .aClass173_Sub1_8980)).anInt9305);
	    int i_4_
		= (i_1_ - (i_0_ * (((Class173_Sub1)
				    ((Class137_Sub2) this).aClass173_Sub1_8980)
				   .anInt9307)
			   >> 8)
		   >> ((Class173_Sub1)
		       ((Class137_Sub2) this).aClass173_Sub1_8980).anInt9305);
	    ((Class137_Sub2) this).aClass334_8992
		.method4344(class528_sub21_sub12, i_3_, i_4_);
	}
    }
    
    public void method1685(Class528_Sub12 class528_sub12, int[] is) {
	((Class137_Sub2) this).aClass688_8976.method8031
	    (new Class528_Sub14(((Class137_Sub2) this).aClass173_Sub1_8980,
				this, class528_sub12, is),
	     (byte) -76);
    }
    
    public void method1686(int i, int i_5_, int[] is, int[] is_6_, int[] is_7_,
			   int[] is_8_, int[] is_9_, int[] is_10_,
			   int[] is_11_, int[] is_12_, Class164 class164,
			   boolean bool) {
	Class165 class165
	    = ((Class137_Sub2) this).aClass173_Sub1_8980.aClass165_1984;
	if (is_8_ != null
	    && ((Class137_Sub2) this).anIntArrayArrayArray8973 == null)
	    ((Class137_Sub2) this).anIntArrayArrayArray8973
		= new int[anInt1627 * -657933437][anInt1626 * 1769495707][];
	if (is_6_ != null
	    && ((Class137_Sub2) this).anIntArrayArrayArray8972 == null)
	    ((Class137_Sub2) this).anIntArrayArrayArray8972
		= new int[anInt1627 * -657933437][anInt1626 * 1769495707][];
	((Class137_Sub2) this).anIntArrayArrayArray8970[i][i_5_] = is;
	((Class137_Sub2) this).anIntArrayArrayArray8989[i][i_5_] = is_7_;
	((Class137_Sub2) this).anIntArrayArrayArray8968[i][i_5_] = is_9_;
	((Class137_Sub2) this).anIntArrayArrayArray8969[i][i_5_] = is_10_;
	if (((Class137_Sub2) this).anIntArrayArrayArray8973 != null)
	    ((Class137_Sub2) this).anIntArrayArrayArray8973[i][i_5_] = is_8_;
	if (((Class137_Sub2) this).anIntArrayArrayArray8972 != null)
	    ((Class137_Sub2) this).anIntArrayArrayArray8972[i][i_5_] = is_6_;
	Class528_Sub26[] class528_sub26s
	    = (((Class137_Sub2) this).aClass528_Sub26ArrayArrayArray8962[i]
		   [i_5_]
	       = new Class528_Sub26[is_9_.length]);
	for (int i_13_ = 0; i_13_ < is_9_.length; i_13_++) {
	    int i_14_ = is_11_[i_13_];
	    int i_15_ = is_12_[i_13_];
	    if ((((Class137_Sub2) this).anInt8961 & 0x20) != 0 && i_14_ != -1
		&& class165.method2093(i_14_, (byte) -47).aBool1800) {
		i_15_ = 128;
		i_14_ = -1;
	    }
	    long l = ((long) (class164.anInt1829 * 1802884547) << 48
		      | (long) (class164.anInt1828 * -386339441) << 42
		      | (long) (class164.anInt1827 * -222719641) << 28
		      | (long) (i_15_ << 14) | (long) i_14_);
	    Node node;
	    for (node
		     = ((Class137_Sub2) this).aClass692_8987.method8137(l);
		 node != null;
		 node = ((Class137_Sub2) this).aClass692_8987
				.method8143((short) 255)) {
		Class528_Sub26 class528_sub26 = (Class528_Sub26) node;
		if (((Class528_Sub26) class528_sub26).anInt10439 == i_14_
		    && (((Class528_Sub26) class528_sub26).aFloat10434
			== (float) i_15_)
		    && ((Class528_Sub26) class528_sub26).aClass164_10431
			   .method2085(class164, (short) 19687))
		    break;
	    }
	    if (node == null) {
		class528_sub26s[i_13_]
		    = new Class528_Sub26(this, i_14_, i_15_, class164);
		((Class137_Sub2) this).aClass692_8987
		    .method8142(class528_sub26s[i_13_], l);
	    } else
		class528_sub26s[i_13_] = (Class528_Sub26) node;
	}
	if (bool)
	    ((Class137_Sub2) this).aByteArrayArray8974[i][i_5_] |= 0x1;
	if (is_9_.length > ((Class137_Sub2) this).anInt8982)
	    ((Class137_Sub2) this).anInt8982 = is_9_.length;
	((Class137_Sub2) this).anInt8956 += is_9_.length;
    }
    
    public void method1678(Class528_Sub21_Sub12 class528_sub21_sub12, int i,
			   int i_16_, int i_17_, int i_18_, boolean bool) {
	if (((Class137_Sub2) this).aClass334_8992 != null
	    && class528_sub21_sub12 != null) {
	    int i_19_
		= (i - (i_16_ * (((Class173_Sub1)
				  ((Class137_Sub2) this).aClass173_Sub1_8980)
				 .anInt9306)
			>> 8)
		   >> ((Class173_Sub1)
		       ((Class137_Sub2) this).aClass173_Sub1_8980).anInt9305);
	    int i_20_
		= (i_17_ - (i_16_ * (((Class173_Sub1) (((Class137_Sub2) this)
						       .aClass173_Sub1_8980))
				     .anInt9307)
			    >> 8)
		   >> ((Class173_Sub1)
		       ((Class137_Sub2) this).aClass173_Sub1_8980).anInt9305);
	    ((Class137_Sub2) this).aClass334_8992
		.method4344(class528_sub21_sub12, i_19_, i_20_);
	}
    }
    
    public void method1653() {
	if (((Class137_Sub2) this).anInt8956 <= 0) {
	    ((Class137_Sub2) this).aClass334_8992 = null;
	    method8343();
	} else {
	    byte[][] is = (new byte[anInt1627 * -657933437 + 1]
			   [anInt1626 * 1769495707 + 1]);
	    for (int i = 1; i < anInt1627 * -657933437; i++) {
		for (int i_21_ = 1; i_21_ < anInt1626 * 1769495707; i_21_++)
		    is[i][i_21_]
			= (byte) (((((Class137_Sub2) this).aByteArrayArray8988
				    [i - 1][i_21_])
				   >> 2)
				  + ((((Class137_Sub2) this)
				      .aByteArrayArray8988[i + 1][i_21_])
				     >> 3)
				  + ((((Class137_Sub2) this)
				      .aByteArrayArray8988[i][i_21_ - 1])
				     >> 2)
				  + ((((Class137_Sub2) this)
				      .aByteArrayArray8988[i][i_21_ + 1])
				     >> 3)
				  + ((((Class137_Sub2) this)
				      .aByteArrayArray8988[i][i_21_])
				     >> 1));
	    }
	    ((Class137_Sub2) this).aClass528Array8993
		= new Node[((Class137_Sub2) this).aClass692_8987
				   .method8139((short) 15066)];
	    ((Class137_Sub2) this).aClass692_8987.method8136
		(((Class137_Sub2) this).aClass528Array8993, -2025619823);
	    for (int i = 0;
		 i < ((Class137_Sub2) this).aClass528Array8993.length; i++)
		((Class528_Sub26) ((Class137_Sub2) this).aClass528Array8993[i])
		    .method9448(((Class137_Sub2) this).anInt8956);
	    ((Class137_Sub2) this).anInt8957 = 20;
	    if (((Class137_Sub2) this).anIntArrayArrayArray8973 != null)
		((Class137_Sub2) this).anInt8957 += 4;
	    if ((((Class137_Sub2) this).anInt8961 & 0x7) != 0)
		((Class137_Sub2) this).anInt8957 += 12;
	    ((Class137_Sub2) this).aByteBuffer8990
		= ((Class137_Sub2) this).aClass173_Sub1_8980
		      .method8452(((Class137_Sub2) this).anInt8956 * 4);
	    ((Class137_Sub2) this).aByteBuffer8991
		= (((Class137_Sub2) this).aClass173_Sub1_8980.method8452
		   (((Class137_Sub2) this).anInt8956
		    * ((Class137_Sub2) this).anInt8957));
	    Class528_Sub26[] class528_sub26s
		= new Class528_Sub26[((Class137_Sub2) this).anInt8956];
	    int i = ItemStyleOverride.method531(((Class137_Sub2) this).anInt8956 / 4,
				     -1071797676);
	    if (i < 1)
		i = 1;
	    Class692 class692 = new Class692(i);
	    Class528_Sub26[] class528_sub26s_22_
		= new Class528_Sub26[((Class137_Sub2) this).anInt8982];
	    for (int i_23_ = 0; i_23_ < anInt1627 * -657933437; i_23_++) {
		for (int i_24_ = 0; i_24_ < anInt1626 * 1769495707; i_24_++)
		    method8341(i_23_, i_24_, is, class528_sub26s_22_, class692,
			       class528_sub26s);
	    }
	    for (int i_25_ = 0; i_25_ < ((Class137_Sub2) this).anInt8964;
		 i_25_++) {
		Class528_Sub26 class528_sub26 = class528_sub26s[i_25_];
		if (class528_sub26 != null)
		    class528_sub26.method9447(i_25_);
	    }
	    for (int i_26_ = 0; i_26_ < anInt1627 * -657933437; i_26_++) {
		for (int i_27_ = 0; i_27_ < anInt1626 * 1769495707; i_27_++) {
		    short[] is_28_
			= (((Class137_Sub2) this).aShortArrayArray8967
			   [i_27_ * (anInt1627 * -657933437) + i_26_]);
		    if (is_28_ != null) {
			int i_29_ = 0;
			int i_30_ = 0;
			while (i_30_ < is_28_.length) {
			    int i_31_ = is_28_[i_30_++] & 0xffff;
			    int i_32_ = is_28_[i_30_++] & 0xffff;
			    int i_33_ = is_28_[i_30_++] & 0xffff;
			    Class528_Sub26 class528_sub26
				= class528_sub26s[i_31_];
			    Class528_Sub26 class528_sub26_34_
				= class528_sub26s[i_32_];
			    Class528_Sub26 class528_sub26_35_
				= class528_sub26s[i_33_];
			    Class528_Sub26 class528_sub26_36_ = null;
			    if (class528_sub26 != null) {
				class528_sub26.method9446(i_26_, i_27_, i_29_);
				class528_sub26_36_ = class528_sub26;
			    }
			    if (class528_sub26_34_ != null) {
				class528_sub26_34_.method9446(i_26_, i_27_,
							      i_29_);
				if (class528_sub26_36_ == null
				    || ((class528_sub26_34_.aLong7107
					 * -4849232331708333273L)
					< (class528_sub26_36_.aLong7107
					   * -4849232331708333273L)))
				    class528_sub26_36_ = class528_sub26_34_;
			    }
			    if (class528_sub26_35_ != null) {
				class528_sub26_35_.method9446(i_26_, i_27_,
							      i_29_);
				if (class528_sub26_36_ == null
				    || ((class528_sub26_35_.aLong7107
					 * -4849232331708333273L)
					< (class528_sub26_36_.aLong7107
					   * -4849232331708333273L)))
				    class528_sub26_36_ = class528_sub26_35_;
			    }
			    if (class528_sub26_36_ != null) {
				if (class528_sub26 != null)
				    class528_sub26_36_.method9447(i_31_);
				if (class528_sub26_34_ != null)
				    class528_sub26_36_.method9447(i_32_);
				if (class528_sub26_35_ != null)
				    class528_sub26_36_.method9447(i_33_);
				class528_sub26_36_.method9446(i_26_, i_27_,
							      i_29_);
			    }
			    i_29_++;
			}
		    }
		}
	    }
	    ((Class137_Sub2) this).anInt8981 = 0;
	    for (int i_37_ = 0;
		 i_37_ < ((Class137_Sub2) this).aClass528Array8993.length;
		 i_37_++) {
		Class528_Sub26 class528_sub26
		    = ((Class528_Sub26)
		       ((Class137_Sub2) this).aClass528Array8993[i_37_]);
		if (((Class528_Sub26) class528_sub26).anInt10433 > 0)
		    ((Class137_Sub2) this).aClass528Array8993
			[((Class137_Sub2) this).anInt8981++]
			= class528_sub26;
	    }
	    ((Class137_Sub2) this).aClass528Array8977
		= new Node[((Class137_Sub2) this).anInt8981];
	    long[] ls = new long[((Class137_Sub2) this).anInt8981];
	    for (int i_38_ = 0; i_38_ < ((Class137_Sub2) this).anInt8981;
		 i_38_++) {
		Class528_Sub26 class528_sub26
		    = ((Class528_Sub26)
		       ((Class137_Sub2) this).aClass528Array8993[i_38_]);
		ls[i_38_] = class528_sub26.aLong7107 * -4849232331708333273L;
		((Class137_Sub2) this).aClass528Array8977[i_38_]
		    = class528_sub26;
	    }
	    Class650.method7738(ls, ((Class137_Sub2) this).aClass528Array8977,
				(short) 1263);
	    method8340();
	}
    }
    
    void method8340() {
	((Class137_Sub2) this).anInterface36_8979
	    = ((Class137_Sub2) this).aClass173_Sub1_8980.method8549(false);
	((Class137_Sub2) this).anInterface36_8979
	    .method258(((Class137_Sub2) this).anInt8964 * 4, 4);
	((Class137_Sub2) this).anInterface36_8979.method197
	    (0, ((Class137_Sub2) this).anInt8964 * 4,
	     ((Class137_Sub2) this).aClass173_Sub1_8980
		 .method8453(((Class137_Sub2) this).aByteBuffer8990));
	((Class137_Sub2) this).anInterface36_8978
	    = ((Class137_Sub2) this).aClass173_Sub1_8980.method8549(false);
	((Class137_Sub2) this).anInterface36_8978.method258
	    ((((Class137_Sub2) this).anInt8964
	      * ((Class137_Sub2) this).anInt8957),
	     ((Class137_Sub2) this).anInt8957);
	((Class137_Sub2) this).anInterface36_8978.method197
	    (0,
	     (((Class137_Sub2) this).anInt8964
	      * ((Class137_Sub2) this).anInt8957),
	     ((Class137_Sub2) this).aClass173_Sub1_8980
		 .method8453(((Class137_Sub2) this).aByteBuffer8991));
	((Class137_Sub2) this).aByteBuffer8990.clear();
	((Class137_Sub2) this).aByteBuffer8990 = null;
	((Class137_Sub2) this).aByteBuffer8991.clear();
	((Class137_Sub2) this).aByteBuffer8991 = null;
	if ((((Class137_Sub2) this).anInt8961 & 0x7) != 0) {
	    if (((Class137_Sub2) this).anIntArrayArrayArray8973 != null)
		((Class137_Sub2) this).aClass344_8960
		    = (((Class137_Sub2) this).aClass173_Sub1_8980.method8543
		       (new Class345[]
			{ new Class345(new Class331[]
				       { Class331.aClass331_3521,
					 Class331.aClass331_3518,
					 Class331.aClass331_3517,
					 Class331.aClass331_3515 }),
			  new Class345(Class331.aClass331_3531) }));
	    else
		((Class137_Sub2) this).aClass344_8960
		    = (((Class137_Sub2) this).aClass173_Sub1_8980.method8543
		       (new Class345[]
			{ new Class345(new Class331[]
				       { Class331.aClass331_3521,
					 Class331.aClass331_3518,
					 Class331.aClass331_3515 }),
			  new Class345(Class331.aClass331_3531) }));
	} else if (((Class137_Sub2) this).anIntArrayArrayArray8973 != null)
	    ((Class137_Sub2) this).aClass344_8960
		= (((Class137_Sub2) this).aClass173_Sub1_8980.method8543
		   (new Class345[]
		    { new Class345(new Class331[] { Class331.aClass331_3521,
						    Class331.aClass331_3518,
						    Class331.aClass331_3517 }),
		      new Class345(Class331.aClass331_3531) }));
	else
	    ((Class137_Sub2) this).aClass344_8960
		= (((Class137_Sub2) this).aClass173_Sub1_8980.method8543
		   (new Class345[]
		    { new Class345(new Class331[] { Class331.aClass331_3521,
						    Class331.aClass331_3518 }),
		      new Class345(Class331.aClass331_3531) }));
	for (int i = 0; i < ((Class137_Sub2) this).anInt8981; i++) {
	    Class528_Sub26 class528_sub26
		= ((Class528_Sub26)
		   ((Class137_Sub2) this).aClass528Array8993[i]);
	    class528_sub26.method9450(((Class137_Sub2) this).anInt8964);
	}
	if (((Class137_Sub2) this).aClass334_8992 != null)
	    ((Class137_Sub2) this).aClass334_8992.method4352();
	method8343();
    }
    
    Class137_Sub2(Class173_Sub1 class173_sub1, int i, int i_39_, int i_40_,
		  int i_41_, int[][] is, int[][] is_42_, int i_43_) {
	super(i_40_, i_41_, i_43_, is);
	((Class137_Sub2) this).anIntArray8975 = new int[1];
	((Class137_Sub2) this).anIntArray8994 = new int[1];
	((Class137_Sub2) this).anIntArray8996 = new int[1];
	((Class137_Sub2) this).aClass173_Sub1_8980 = class173_sub1;
	((Class137_Sub2) this).anInt8958 = anInt1625 * 1543345989 - 2;
	((Class137_Sub2) this).anInt8959
	    = 1 << ((Class137_Sub2) this).anInt8958;
	((Class137_Sub2) this).anInt8963 = i;
	((Class137_Sub2) this).anInt8961 = i_39_;
	((Class137_Sub2) this).anIntArrayArrayArray8972
	    = new int[i_40_][i_41_][];
	((Class137_Sub2) this).aClass528_Sub26ArrayArrayArray8962
	    = new Class528_Sub26[i_40_][i_41_][];
	((Class137_Sub2) this).anIntArrayArrayArray8970
	    = new int[i_40_][i_41_][];
	((Class137_Sub2) this).anIntArrayArrayArray8989
	    = new int[i_40_][i_41_][];
	((Class137_Sub2) this).anIntArrayArrayArray8968
	    = new int[i_40_][i_41_][];
	((Class137_Sub2) this).anIntArrayArrayArray8969
	    = new int[i_40_][i_41_][];
	((Class137_Sub2) this).aShortArrayArray8967
	    = new short[i_40_ * i_41_][];
	((Class137_Sub2) this).aByteArrayArray8974 = new byte[i_40_][i_41_];
	((Class137_Sub2) this).aByteArrayArray8988
	    = new byte[i_40_ + 1][i_41_ + 1];
	((Class137_Sub2) this).aFloatArrayArray8955
	    = (new float[anInt1627 * -657933437 + 1]
	       [anInt1626 * 1769495707 + 1]);
	((Class137_Sub2) this).aFloatArrayArray8985
	    = (new float[anInt1627 * -657933437 + 1]
	       [anInt1626 * 1769495707 + 1]);
	((Class137_Sub2) this).aFloatArrayArray8986
	    = (new float[anInt1627 * -657933437 + 1]
	       [anInt1626 * 1769495707 + 1]);
	for (int i_44_ = 0; i_44_ <= anInt1626 * 1769495707; i_44_++) {
	    for (int i_45_ = 0; i_45_ <= anInt1627 * -657933437; i_45_++) {
		int i_46_ = anIntArrayArray1629[i_45_][i_44_];
		if ((float) i_46_ < ((Class137_Sub2) this).aFloat8965)
		    ((Class137_Sub2) this).aFloat8965 = (float) i_46_;
		if ((float) i_46_ > ((Class137_Sub2) this).aFloat8966)
		    ((Class137_Sub2) this).aFloat8966 = (float) i_46_;
		if (i_45_ > 0 && i_44_ > 0 && i_45_ < anInt1627 * -657933437
		    && i_44_ < anInt1626 * 1769495707) {
		    int i_47_
			= is_42_[i_45_ + 1][i_44_] - is_42_[i_45_ - 1][i_44_];
		    int i_48_
			= is_42_[i_45_][i_44_ + 1] - is_42_[i_45_][i_44_ - 1];
		    float f
			= (float) (1.0
				   / Math.sqrt((double) (i_47_ * i_47_
							 + 4 * i_43_ * i_43_
							 + i_48_ * i_48_)));
		    ((Class137_Sub2) this).aFloatArrayArray8955[i_45_][i_44_]
			= (float) i_47_ * f;
		    ((Class137_Sub2) this).aFloatArrayArray8985[i_45_][i_44_]
			= (float) (-i_43_ * 2) * f;
		    ((Class137_Sub2) this).aFloatArrayArray8986[i_45_][i_44_]
			= (float) i_48_ * f;
		}
	    }
	}
	((Class137_Sub2) this).aFloat8965--;
	((Class137_Sub2) this).aFloat8966++;
	((Class137_Sub2) this).aClass692_8987 = new Class692(128);
	if ((((Class137_Sub2) this).anInt8961 & 0x10) != 0)
	    ((Class137_Sub2) this).aClass334_8992
		= new Class334(((Class137_Sub2) this).aClass173_Sub1_8980,
			       this);
    }
    
    void method8341(int i, int i_49_, byte[][] is,
		    Class528_Sub26[] class528_sub26s, Class692 class692,
		    Class528_Sub26[] class528_sub26s_50_) {
	if (((Class137_Sub2) this).anIntArrayArrayArray8968[i][i_49_]
	    != null) {
	    Class528_Sub26[] class528_sub26s_51_
		= (((Class137_Sub2) this).aClass528_Sub26ArrayArrayArray8962[i]
		   [i_49_]);
	    int[] is_52_
		= ((Class137_Sub2) this).anIntArrayArrayArray8970[i][i_49_];
	    int[] is_53_
		= ((Class137_Sub2) this).anIntArrayArrayArray8989[i][i_49_];
	    int[] is_54_
		= ((Class137_Sub2) this).anIntArrayArrayArray8969[i][i_49_];
	    int[] is_55_
		= ((Class137_Sub2) this).anIntArrayArrayArray8968[i][i_49_];
	    int[] is_56_
		= (((Class137_Sub2) this).anIntArrayArrayArray8972 != null
		   ? ((Class137_Sub2) this).anIntArrayArrayArray8972[i][i_49_]
		   : null);
	    int[] is_57_
		= (((Class137_Sub2) this).anIntArrayArrayArray8973 != null
		   ? ((Class137_Sub2) this).anIntArrayArrayArray8973[i][i_49_]
		   : null);
	    if (is_54_ == null)
		is_54_ = is_55_;
	    float f = ((Class137_Sub2) this).aFloatArrayArray8955[i][i_49_];
	    float f_58_
		= ((Class137_Sub2) this).aFloatArrayArray8985[i][i_49_];
	    float f_59_
		= ((Class137_Sub2) this).aFloatArrayArray8986[i][i_49_];
	    float f_60_
		= ((Class137_Sub2) this).aFloatArrayArray8955[i][i_49_ + 1];
	    float f_61_
		= ((Class137_Sub2) this).aFloatArrayArray8985[i][i_49_ + 1];
	    float f_62_
		= ((Class137_Sub2) this).aFloatArrayArray8986[i][i_49_ + 1];
	    float f_63_ = (((Class137_Sub2) this).aFloatArrayArray8955[i + 1]
			   [i_49_ + 1]);
	    float f_64_ = (((Class137_Sub2) this).aFloatArrayArray8985[i + 1]
			   [i_49_ + 1]);
	    float f_65_ = (((Class137_Sub2) this).aFloatArrayArray8986[i + 1]
			   [i_49_ + 1]);
	    float f_66_
		= ((Class137_Sub2) this).aFloatArrayArray8955[i + 1][i_49_];
	    float f_67_
		= ((Class137_Sub2) this).aFloatArrayArray8985[i + 1][i_49_];
	    float f_68_
		= ((Class137_Sub2) this).aFloatArrayArray8986[i + 1][i_49_];
	    int i_69_ = is[i][i_49_] & 0xff;
	    int i_70_ = is[i][i_49_ + 1] & 0xff;
	    int i_71_ = is[i + 1][i_49_ + 1] & 0xff;
	    int i_72_ = is[i + 1][i_49_] & 0xff;
	    int i_73_ = 0;
	while_40_:
	    for (int i_74_ = 0; i_74_ < is_55_.length; i_74_++) {
		Class528_Sub26 class528_sub26 = class528_sub26s_51_[i_74_];
		for (int i_75_ = 0; i_75_ < i_73_; i_75_++) {
		    if (class528_sub26s[i_75_] == class528_sub26)
			continue while_40_;
		}
		class528_sub26s[i_73_++] = class528_sub26;
	    }
	    short[] is_76_ = (((Class137_Sub2) this).aShortArrayArray8967
				  [i_49_ * (anInt1627 * -657933437) + i]
			      = new short[is_55_.length]);
	    for (int i_77_ = 0; i_77_ < is_55_.length; i_77_++) {
		int i_78_ = (i << anInt1625 * 1543345989) + is_52_[i_77_];
		int i_79_ = (i_49_ << anInt1625 * 1543345989) + is_53_[i_77_];
		int i_80_ = i_78_ >> ((Class137_Sub2) this).anInt8958;
		int i_81_ = i_79_ >> ((Class137_Sub2) this).anInt8958;
		int i_82_ = is_55_[i_77_];
		int i_83_ = is_54_[i_77_];
		int i_84_ = is_56_ != null ? is_56_[i_77_] : 0;
		long l = ((long) i_83_ << 48 | (long) i_82_ << 32
			  | (long) (i_80_ << 16) | (long) i_81_);
		int i_85_ = is_52_[i_77_];
		int i_86_ = is_53_[i_77_];
		int i_87_ = 74;
		int i_88_ = 0;
		float f_89_ = 1.0F;
		float f_90_;
		float f_91_;
		float f_92_;
		if (i_85_ == 0 && i_86_ == 0) {
		    f_90_ = f;
		    f_91_ = f_58_;
		    f_92_ = f_59_;
		    i_87_ -= i_69_;
		} else if (i_85_ == 0 && i_86_ == anInt1628 * 2130003981) {
		    f_90_ = f_60_;
		    f_91_ = f_61_;
		    f_92_ = f_62_;
		    i_87_ -= i_70_;
		} else if (i_85_ == anInt1628 * 2130003981
			   && i_86_ == anInt1628 * 2130003981) {
		    f_90_ = f_63_;
		    f_91_ = f_64_;
		    f_92_ = f_65_;
		    i_87_ -= i_71_;
		} else if (i_85_ == anInt1628 * 2130003981 && i_86_ == 0) {
		    f_90_ = f_66_;
		    f_91_ = f_67_;
		    f_92_ = f_68_;
		    i_87_ -= i_72_;
		} else {
		    float f_93_
			= (float) i_85_ / (float) (anInt1628 * 2130003981);
		    float f_94_
			= (float) i_86_ / (float) (anInt1628 * 2130003981);
		    float f_95_ = f + (f_66_ - f) * f_93_;
		    float f_96_ = f_58_ + (f_67_ - f_58_) * f_93_;
		    float f_97_ = f_59_ + (f_68_ - f_59_) * f_93_;
		    float f_98_ = f_60_ + (f_63_ - f_60_) * f_93_;
		    float f_99_ = f_61_ + (f_64_ - f_61_) * f_93_;
		    float f_100_ = f_62_ + (f_65_ - f_62_) * f_93_;
		    f_90_ = f_95_ + (f_98_ - f_95_) * f_94_;
		    f_91_ = f_96_ + (f_99_ - f_96_) * f_94_;
		    f_92_ = f_97_ + (f_100_ - f_97_) * f_94_;
		    int i_101_ = i_69_ + ((i_72_ - i_69_) * i_85_
					  >> anInt1625 * 1543345989);
		    int i_102_ = i_70_ + ((i_71_ - i_70_) * i_85_
					  >> anInt1625 * 1543345989);
		    i_87_ -= i_101_ + ((i_102_ - i_101_) * i_86_
				       >> anInt1625 * 1543345989);
		}
		if (i_82_ != -1) {
		    int i_103_ = (i_82_ & 0x7f) * i_87_ >> 7;
		    if (i_103_ < 2)
			i_103_ = 2;
		    else if (i_103_ > 126)
			i_103_ = 126;
		    i_88_ = (RuntimeException_Sub2.anIntArray11922
			     [i_82_ & 0xff80 | i_103_]);
		    if ((((Class137_Sub2) this).anInt8961 & 0x7) == 0) {
			f_89_ = ((((Class137_Sub2) this).aClass173_Sub1_8980
				  .aFloatArray9290[0]) * f_90_
				 + (((Class137_Sub2) this).aClass173_Sub1_8980
				    .aFloatArray9290[1]) * f_91_
				 + (((Class137_Sub2) this).aClass173_Sub1_8980
				    .aFloatArray9290[2]) * f_92_);
			f_89_ = ((((Class137_Sub2) this).aClass173_Sub1_8980
				  .aFloat9298)
				 + f_89_ * (f_89_ > 0.0F
					    ? (((Class137_Sub2) this)
					       .aClass173_Sub1_8980.aFloat9299)
					    : (((Class137_Sub2) this)
					       .aClass173_Sub1_8980
					       .aFloat9300)));
		    }
		}
		Node node = null;
		if ((i_78_ & ((Class137_Sub2) this).anInt8959 - 1) == 0
		    && (i_79_ & ((Class137_Sub2) this).anInt8959 - 1) == 0)
		    node = class692.method8137(l);
		int i_104_;
		if (node == null) {
		    int i_105_;
		    if (i_83_ != i_82_) {
			int i_106_ = (i_83_ & 0x7f) * i_87_ >> 7;
			if (i_106_ < 2)
			    i_106_ = 2;
			else if (i_106_ > 126)
			    i_106_ = 126;
			i_105_ = (RuntimeException_Sub2.anIntArray11922
				  [i_83_ & 0xff80 | i_106_]);
			if ((((Class137_Sub2) this).anInt8961 & 0x7) == 0) {
			    float f_107_
				= ((((Class137_Sub2) this).aClass173_Sub1_8980
				    .aFloatArray9290[0]) * f_90_
				   + ((((Class137_Sub2) this)
				       .aClass173_Sub1_8980.aFloatArray9290[1])
				      * f_91_)
				   + ((((Class137_Sub2) this)
				       .aClass173_Sub1_8980.aFloatArray9290[2])
				      * f_92_));
			    f_107_ = ((((Class137_Sub2) this)
				       .aClass173_Sub1_8980.aFloat9298)
				      + f_89_ * (f_89_ > 0.0F
						 ? (((Class137_Sub2) this)
						    .aClass173_Sub1_8980
						    .aFloat9299)
						 : (((Class137_Sub2) this)
						    .aClass173_Sub1_8980
						    .aFloat9300)));
			    int i_108_ = i_105_ >> 16 & 0xff;
			    int i_109_ = i_105_ >> 8 & 0xff;
			    int i_110_ = i_105_ & 0xff;
			    i_108_ *= f_107_;
			    if (i_108_ < 0)
				i_108_ = 0;
			    else if (i_108_ > 255)
				i_108_ = 255;
			    i_109_ *= f_107_;
			    if (i_109_ < 0)
				i_109_ = 0;
			    else if (i_109_ > 255)
				i_109_ = 255;
			    i_110_ *= f_107_;
			    if (i_110_ < 0)
				i_110_ = 0;
			    else if (i_110_ > 255)
				i_110_ = 255;
			    i_105_ = i_108_ << 16 | i_109_ << 8 | i_110_;
			}
		    } else
			i_105_ = i_88_;
		    ((Class137_Sub2) this).aByteBuffer8991
			.putFloat((float) i_78_);
		    ((Class137_Sub2) this).aByteBuffer8991.putFloat
			((float) (method1656(i_78_, i_79_, 1915597708)
				  + i_84_));
		    ((Class137_Sub2) this).aByteBuffer8991
			.putFloat((float) i_79_);
		    ((Class137_Sub2) this).aByteBuffer8991
			.putFloat((float) i_78_);
		    ((Class137_Sub2) this).aByteBuffer8991
			.putFloat((float) i_79_);
		    if (((Class137_Sub2) this).anIntArrayArrayArray8973
			!= null)
			((Class137_Sub2) this).aByteBuffer8991.putFloat
			    (is_57_ != null ? (float) (is_57_[i_77_] - 1)
			     : 0.0F);
		    if ((((Class137_Sub2) this).anInt8961 & 0x7) != 0) {
			((Class137_Sub2) this).aByteBuffer8991.putFloat(f_90_);
			((Class137_Sub2) this).aByteBuffer8991.putFloat(f_91_);
			((Class137_Sub2) this).aByteBuffer8991.putFloat(f_92_);
		    }
		    if (((Class173_Sub1)
			 ((Class137_Sub2) this).aClass173_Sub1_8980).anInt9377
			== 0) {
			int i_111_ = i_105_ & ~0xff00ff;
			i_111_ |= (i_105_ & 0xff0000) >> 16;
			i_111_ |= (i_105_ & 0xff) << 16;
			i_105_ = i_111_;
		    }
		    ((Class137_Sub2) this).aByteBuffer8990
			.putInt(~0xffffff | i_105_);
		    i_104_ = ((Class137_Sub2) this).anInt8964++;
		    is_76_[i_77_] = (short) i_104_;
		    if (i_82_ != -1)
			class528_sub26s_50_[i_104_]
			    = class528_sub26s_51_[i_77_];
		    class692.method8142(new Class528_Sub18(is_76_[i_77_]), l);
		} else {
		    is_76_[i_77_] = ((Class528_Sub18) node).aShort10389;
		    i_104_ = is_76_[i_77_] & 0xffff;
		    if (i_82_ != -1
			&& ((class528_sub26s_51_[i_77_].aLong7107
			     * -4849232331708333273L)
			    < (class528_sub26s_50_[i_104_].aLong7107
			       * -4849232331708333273L)))
			class528_sub26s_50_[i_104_]
			    = class528_sub26s_51_[i_77_];
		}
		for (int i_112_ = 0; i_112_ < i_73_; i_112_++)
		    class528_sub26s[i_112_].method9449(i_104_, i_88_, i_87_,
						       f_89_);
		((Class137_Sub2) this).anInt8971++;
	    }
	}
    }
    
    public void method1654(int i, int i_113_, int i_114_, boolean[][] bools,
			   boolean bool, int i_115_) {
	if (((Class137_Sub2) this).aClass528Array8977 != null) {
	    int i_116_ = i_114_ + i_114_ + 1;
	    i_116_ *= i_116_;
	    if (((Class137_Sub2) this).anIntArray8996.length < i_116_)
		((Class137_Sub2) this).anIntArray8996 = new int[i_116_];
	    int i_117_ = i - i_114_;
	    int i_118_ = i_117_;
	    if (i_117_ < 0)
		i_117_ = 0;
	    int i_119_ = i_113_ - i_114_;
	    int i_120_ = i_119_;
	    if (i_119_ < 0)
		i_119_ = 0;
	    int i_121_ = i + i_114_;
	    if (i_121_ > anInt1627 * -657933437 - 1)
		i_121_ = anInt1627 * -657933437 - 1;
	    int i_122_ = i_113_ + i_114_;
	    if (i_122_ > anInt1626 * 1769495707 - 1)
		i_122_ = anInt1626 * 1769495707 - 1;
	    ((Class137_Sub2) this).anInt8995 = 0;
	    for (int i_123_ = i_117_; i_123_ <= i_121_; i_123_++) {
		boolean[] bools_124_ = bools[i_123_ - i_118_];
		for (int i_125_ = i_119_; i_125_ <= i_122_; i_125_++) {
		    if (bools_124_[i_125_ - i_120_])
			((Class137_Sub2) this).anIntArray8996
			    [((Class137_Sub2) this).anInt8995++]
			    = i_125_ * (anInt1627 * -657933437) + i_123_;
		}
	    }
	    ByteBuffer bytebuffer
		= ((Class137_Sub2) this).aClass173_Sub1_8980.aByteBuffer9222;
	    bytebuffer.clear();
	    for (int i_126_ = 0;
		 i_126_ < ((Class137_Sub2) this).aClass528Array8977.length;
		 i_126_++) {
		Class528_Sub26 class528_sub26
		    = ((Class528_Sub26)
		       ((Class137_Sub2) this).aClass528Array8977[i_126_]);
		class528_sub26.method9458((((Class137_Sub2) this)
					   .anIntArray8996),
					  ((Class137_Sub2) this).anInt8995);
	    }
	    int i_127_ = bytebuffer.position();
	    Class306 class306
		= (((Class173_Sub1) ((Class137_Sub2) this).aClass173_Sub1_8980)
		   .aClass306_9324);
	    ((Class137_Sub2) this).aClass173_Sub1_8980.method8587();
	    if (((Class137_Sub2) this).aClass173_Sub1_8980.anInt9236 > 0) {
		class306.aClass422_3368.method5057
		    ((float) ((((Class137_Sub2) this).aClass173_Sub1_8980
			       .anInt9344) >> 16
			      & 0xff) / 255.0F,
		     (float) ((((Class137_Sub2) this).aClass173_Sub1_8980
			       .anInt9344) >> 8
			      & 0xff) / 255.0F,
		     (float) ((((Class137_Sub2) this).aClass173_Sub1_8980
			       .anInt9344) >> 0
			      & 0xff) / 255.0F);
		class306.aClass425_3372.method5120(0.0F, 0.0F, 1.0F,
						   -(((Class137_Sub2) this)
						     .aClass173_Sub1_8980
						     .aFloat9347));
		class306.aClass425_3372.method5126(((Class173_Sub1)
						    (((Class137_Sub2) this)
						     .aClass173_Sub1_8980))
						   .aClass418_9330);
		class306.aClass425_3372.method5136(1.0F
						   / ((((Class137_Sub2) this)
						       .aClass173_Sub1_8980
						       .aFloat9348)
						      - (((Class137_Sub2) this)
							 .aClass173_Sub1_8980
							 .aFloat9347)));
	    } else {
		class306.aClass425_3372.method5120(0.0F, 0.0F, 0.0F, 0.0F);
		class306.aClass422_3368.method5057(0.0F, 0.0F, 0.0F);
	    }
	    if (i_127_ != 0) {
		Interface41 interface41
		    = ((Class137_Sub2) this).aClass173_Sub1_8980
			  .method8478(i_127_ / 2);
		interface41.method197(0, i_127_,
				      (((Class137_Sub2) this)
				       .aClass173_Sub1_8980.aLong9223));
		((Class137_Sub2) this).aClass173_Sub1_8980
		    .method8553(0, ((Class137_Sub2) this).anInterface36_8978);
		((Class137_Sub2) this).aClass173_Sub1_8980
		    .method8554(interface41);
		class306.method4057(Class418.aClass418_4769);
		if ((((Class137_Sub2) this).anInt8961 & 0x7) == 0) {
		    int i_128_ = 0;
		    for (int i_129_ = 0;
			 (i_129_
			  < ((Class137_Sub2) this).aClass528Array8977.length);
			 i_129_++) {
			Class528_Sub26 class528_sub26
			    = (Class528_Sub26) (((Class137_Sub2) this)
						.aClass528Array8977[i_129_]);
			if (((Class528_Sub26) class528_sub26).anInt10435
			    != 0) {
			    if (((Class173_Sub1)
				 ((Class137_Sub2) this).aClass173_Sub1_8980)
				.aBool9289) {
				((Class137_Sub2) this).aClass173_Sub1_8980
				    .method2152
				    (0, (((Class528_Sub26) class528_sub26)
					 .aClass164_10431));
				class306.aClass425_3361.method5120
				    (0.0F, 1.0F, 0.0F,
				     ((float) (((Class173_Sub1)
						(((Class137_Sub2) this)
						 .aClass173_Sub1_8980))
					       .anInt9237)
				      + ((float) ((((Class528_Sub26)
						    class528_sub26)
						   .aClass164_10431.anInt1829)
						  * 1802884547)
					 / 255.0F
					 * (float) ((((Class528_Sub26)
						      class528_sub26)
						     .aClass164_10431
						     .anInt1828)
						    * -386339441))));
				class306.aClass425_3361.method5136
				    (1.0F / (float) ((((Class528_Sub26)
						       class528_sub26)
						      .aClass164_10431
						      .anInt1828)
						     * -386339441));
				class306.aClass422_3362.method5057
				    ((float) (((((Class528_Sub26)
						 class528_sub26)
						.aClass164_10431.anInt1827)
					       * -222719641) >> 16
					      & 0xff) / 255.0F,
				     (float) (((((Class528_Sub26)
						 class528_sub26)
						.aClass164_10431.anInt1827)
					       * -222719641) >> 8
					      & 0xff) / 255.0F,
				     (float) (((((Class528_Sub26)
						 class528_sub26)
						.aClass164_10431.anInt1827)
					       * -222719641) >> 0
					      & 0xff) / 255.0F);
			    } else {
				class306.aClass425_3361.method5120(0.0F, 0.0F,
								   0.0F, 0.0F);
				class306.aClass422_3362.method5057(0.0F, 0.0F,
								   0.0F);
			    }
			    boolean bool_130_ = false;
			    if (((Class528_Sub26) class528_sub26).anInt10439
				!= -1) {
				Class160 class160
				    = (((Class137_Sub2) this)
					   .aClass173_Sub1_8980.aClass165_1984
					   .method2093
				       ((((Class528_Sub26) class528_sub26)
					 .anInt10439),
					(byte) -67));
				class306.anInterface34_3355
				    = ((Class173_Sub1) (((Class137_Sub2) this)
							.aClass173_Sub1_8980))
					  .aClass329_9315.method4265(class160);
				bool_130_
				    = !Class687.method8029(class160.aByte1790,
							   1671611596);
			    } else
				class306.anInterface34_3355
				    = (((Class137_Sub2) this)
				       .aClass173_Sub1_8980
				       .anInterface34_9316);
			    ((Class137_Sub2) this).aClass173_Sub1_8980
				.method8553
				(1, (((Class528_Sub26) class528_sub26)
				     .anInterface36_10427));
			    ((Class137_Sub2) this).aClass173_Sub1_8980
				.method8552
				(((Class137_Sub2) this).aClass344_8960);
			    class306.aClass418_3358.method4976
				(1.0F / (((Class528_Sub26) class528_sub26)
					 .aFloat10434),
				 1.0F / (((Class528_Sub26) class528_sub26)
					 .aFloat10434),
				 1.0F, 1.0F);
			    class306.anInt3370
				= ((Class528_Sub26) class528_sub26).anInt10436;
			    class306.anInt3354
				= (((Class528_Sub26) class528_sub26).anInt10437
				   - (((Class528_Sub26) class528_sub26)
				      .anInt10436)
				   + 1);
			    class306.anInt3351 = i_128_;
			    class306.anInt3373
				= (((Class528_Sub26) class528_sub26).anInt10435
				   / 3);
			    class306.method4058(bool_130_);
			    i_128_ += (((Class528_Sub26) class528_sub26)
				       .anInt10435);
			}
		    }
		} else {
		    class306.aClass422_3365.method5057((((Class137_Sub2) this)
							.aClass173_Sub1_8980
							.aFloatArray9290[0]),
						       (((Class137_Sub2) this)
							.aClass173_Sub1_8980
							.aFloatArray9290[1]),
						       (((Class137_Sub2) this)
							.aClass173_Sub1_8980
							.aFloatArray9290[2]));
		    class306.aClass422_3366.method5057
			((((Class137_Sub2) this).aClass173_Sub1_8980.aFloat9299
			  * (((Class137_Sub2) this).aClass173_Sub1_8980
			     .aFloat9295)),
			 (((Class137_Sub2) this).aClass173_Sub1_8980.aFloat9299
			  * (((Class137_Sub2) this).aClass173_Sub1_8980
			     .aFloat9296)),
			 (((Class137_Sub2) this).aClass173_Sub1_8980.aFloat9299
			  * (((Class137_Sub2) this).aClass173_Sub1_8980
			     .aFloat9251)));
		    class306.aClass422_3367.method5057
			((-(((Class137_Sub2) this).aClass173_Sub1_8980
			    .aFloat9300)
			  * (((Class137_Sub2) this).aClass173_Sub1_8980
			     .aFloat9295)),
			 (-(((Class137_Sub2) this).aClass173_Sub1_8980
			    .aFloat9300)
			  * (((Class137_Sub2) this).aClass173_Sub1_8980
			     .aFloat9296)),
			 (-(((Class137_Sub2) this).aClass173_Sub1_8980
			    .aFloat9300)
			  * (((Class137_Sub2) this).aClass173_Sub1_8980
			     .aFloat9251)));
		    class306.aClass422_3363.method5057
			((((Class137_Sub2) this).aClass173_Sub1_8980.aFloat9298
			  * (((Class137_Sub2) this).aClass173_Sub1_8980
			     .aFloat9295)),
			 (((Class137_Sub2) this).aClass173_Sub1_8980.aFloat9298
			  * (((Class137_Sub2) this).aClass173_Sub1_8980
			     .aFloat9296)),
			 (((Class137_Sub2) this).aClass173_Sub1_8980.aFloat9298
			  * (((Class137_Sub2) this).aClass173_Sub1_8980
			     .aFloat9251)));
		    int i_131_ = 0;
		    for (int i_132_ = 0;
			 (i_132_
			  < ((Class137_Sub2) this).aClass528Array8977.length);
			 i_132_++) {
			Class528_Sub26 class528_sub26
			    = (Class528_Sub26) (((Class137_Sub2) this)
						.aClass528Array8977[i_132_]);
			if (((Class528_Sub26) class528_sub26).anInt10435 > 0) {
			    if (((Class173_Sub1)
				 ((Class137_Sub2) this).aClass173_Sub1_8980)
				.aBool9289) {
				((Class137_Sub2) this).aClass173_Sub1_8980
				    .method2152
				    (0, (((Class528_Sub26) class528_sub26)
					 .aClass164_10431));
				float f = 0.15F;
				class306.aClass425_3361.method5120
				    (0.0F,
				     1.0F / ((float) ((((Class528_Sub26)
							class528_sub26)
						       .aClass164_10431
						       .anInt1828)
						      * -386339441)
					     * f),
				     0.0F,
				     256.0F / ((float) ((((Class528_Sub26)
							  class528_sub26)
							 .aClass164_10431
							 .anInt1828)
							* -386339441)
					       * f));
				class306.aClass422_3362.method5057
				    ((float) (((((Class528_Sub26)
						 class528_sub26)
						.aClass164_10431.anInt1827)
					       * -222719641) >> 16
					      & 0xff) / 255.0F,
				     (float) (((((Class528_Sub26)
						 class528_sub26)
						.aClass164_10431.anInt1827)
					       * -222719641) >> 8
					      & 0xff) / 255.0F,
				     (float) (((((Class528_Sub26)
						 class528_sub26)
						.aClass164_10431.anInt1827)
					       * -222719641) >> 0
					      & 0xff) / 255.0F);
			    } else {
				class306.aClass425_3361.method5120(0.0F, 0.0F,
								   0.0F, 0.0F);
				class306.aClass422_3362.method5057(0.0F, 0.0F,
								   0.0F);
			    }
			    byte i_133_ = 11;
			    if (((Class528_Sub26) class528_sub26).anInt10439
				!= -1) {
				Class160 class160
				    = (((Class137_Sub2) this)
					   .aClass173_Sub1_8980.aClass165_1984
					   .method2093
				       ((((Class528_Sub26) class528_sub26)
					 .anInt10439),
					(byte) -110));
				i_133_ = class160.aByte1790;
				class306.anInterface34_3355
				    = ((Class173_Sub1) (((Class137_Sub2) this)
							.aClass173_Sub1_8980))
					  .aClass329_9315.method4265(class160);
				class306.method4056(class160.aByte1796);
			    } else
				class306.anInterface34_3355
				    = (((Class137_Sub2) this)
				       .aClass173_Sub1_8980
				       .anInterface34_9316);
			    ((Class137_Sub2) this).aClass173_Sub1_8980
				.method8553
				(1, (((Class528_Sub26) class528_sub26)
				     .anInterface36_10427));
			    ((Class137_Sub2) this).aClass173_Sub1_8980
				.method8552
				(((Class137_Sub2) this).aClass344_8960);
			    class306.aClass418_3358.method4976
				(1.0F / (((Class528_Sub26) class528_sub26)
					 .aFloat10434),
				 1.0F / (((Class528_Sub26) class528_sub26)
					 .aFloat10434),
				 1.0F, 1.0F);
			    class306.anInt3370
				= ((Class528_Sub26) class528_sub26).anInt10436;
			    class306.anInt3354
				= (((Class528_Sub26) class528_sub26).anInt10437
				   - (((Class528_Sub26) class528_sub26)
				      .anInt10436)
				   + 1);
			    class306.anInt3351 = i_131_;
			    class306.anInt3373
				= (((Class528_Sub26) class528_sub26).anInt10435
				   / 3);
			    switch (i_133_) {
			    case 1:
				class306.aClass422_3369.method5057
				    ((((Class173_Sub1) (((Class137_Sub2) this)
							.aClass173_Sub1_8980))
				      .aClass418_9363.aFloatArray4768[12]),
				     (((Class173_Sub1) (((Class137_Sub2) this)
							.aClass173_Sub1_8980))
				      .aClass418_9363.aFloatArray4768[13]),
				     (((Class173_Sub1) (((Class137_Sub2) this)
							.aClass173_Sub1_8980))
				      .aClass418_9363.aFloatArray4768[14]));
				if (((Class173_Sub1) (((Class137_Sub2) this)
						      .aClass173_Sub1_8980))
				    .aBool9289)
				    class306.method4055();
				else
				    class306.method4060(0);
				break;
			    case 2:
			    case 4:
			    case 8:
			    case 9:
				if (!(((Class137_Sub2) this)
				      .aClass173_Sub1_8980.aBool9274)
				    && (((Class137_Sub2) this).anInt8961
					& 0x8) != 0
				    && ((Class173_Sub1) (((Class137_Sub2) this)
							 .aClass173_Sub1_8980))
					   .aClass335_Sub1_Sub2_9329
					   .method10405(-533783523)) {
				    Class335_Sub1_Sub2 class335_sub1_sub2
					= (((Class173_Sub1)
					    (((Class137_Sub2) this)
					     .aClass173_Sub1_8980))
					   .aClass335_Sub1_Sub2_9329);
				    if (i_133_ == 2)
					class335_sub1_sub2
					    = (((Class173_Sub1)
						(((Class137_Sub2) this)
						 .aClass173_Sub1_8980))
					       .aClass335_Sub1_Sub2_9345);
				    class335_sub1_sub2.aClass418_11403
					.method4986
					(((Class137_Sub2) this)
					 .aClass173_Sub1_8980.aClass418_9352);
				    class335_sub1_sub2.aClass418_11401
					.method4976
					(1.0F / (((Class528_Sub26)
						  class528_sub26).aFloat10434
						 * (float) ((((Class528_Sub26)
							      class528_sub26)
							     .aClass164_10431
							     .anInt1831)
							    * 861893455)),
					 1.0F / (((Class528_Sub26)
						  class528_sub26).aFloat10434
						 * (float) ((((Class528_Sub26)
							      class528_sub26)
							     .aClass164_10431
							     .anInt1831)
							    * 861893455)),
					 1.0F, 1.0F);
				    class335_sub1_sub2.aClass422_11404
					.method5057
					((((Class173_Sub1)
					   (((Class137_Sub2) this)
					    .aClass173_Sub1_8980))
					  .aClass418_9363.aFloatArray4768[12]),
					 (((Class173_Sub1)
					   (((Class137_Sub2) this)
					    .aClass173_Sub1_8980))
					  .aClass418_9363.aFloatArray4768[13]),
					 (((Class173_Sub1)
					   (((Class137_Sub2) this)
					    .aClass173_Sub1_8980))
					  .aClass418_9363.aFloatArray4768
					  [14]));
				    Class160 class160
					= (((Class137_Sub2) this)
					       .aClass173_Sub1_8980
					       .aClass165_1984.method2093
					   ((((Class528_Sub26) class528_sub26)
					     .anInt10439),
					    (byte) -15));
				    class335_sub1_sub2.anInt11398
					= class160.aByte1796 * 738383601;
				    class335_sub1_sub2.anInt11420
					= (((Class528_Sub26) class528_sub26)
					   .anInt10436) * -1034196007;
				    class335_sub1_sub2.anInt11421
					= ((((Class528_Sub26) class528_sub26)
					    .anInt10437)
					   - (((Class528_Sub26) class528_sub26)
					      .anInt10436)
					   + 1) * -388929093;
				    class335_sub1_sub2.anInt11422
					= i_131_ * -1480814185;
				    class335_sub1_sub2.anInt11417
					= (((Class528_Sub26) class528_sub26)
					   .anInt10435) / 3 * 434710977;
				    class335_sub1_sub2.aClass425_11423
					.method5121(class306.aClass425_3361);
				    class335_sub1_sub2.aClass422_11415
					.method5058(class306.aClass422_3362);
				    class335_sub1_sub2.aClass425_11397
					.method5121(class306.aClass425_3372);
				    class335_sub1_sub2.aClass422_11400
					.method5058(class306.aClass422_3368);
				    class335_sub1_sub2.method10406(212695795);
				} else
				    class306.method4059(0);
				break;
			    case 7:
				class306.aClass422_3369.method5057
				    ((((Class173_Sub1) (((Class137_Sub2) this)
							.aClass173_Sub1_8980))
				      .aClass418_9363.aFloatArray4768[12]),
				     (((Class173_Sub1) (((Class137_Sub2) this)
							.aClass173_Sub1_8980))
				      .aClass418_9363.aFloatArray4768[13]),
				     (((Class173_Sub1) (((Class137_Sub2) this)
							.aClass173_Sub1_8980))
				      .aClass418_9363.aFloatArray4768[14]));
				class306.aClass418_3353.method5013();
				class306.anInterface39_3356
				    = ((Class137_Sub2) this)
					  .aClass173_Sub1_8980.method8584();
				class306.method4071(0);
				break;
			    case 6:
				class306.method4058
				    (!Class687.method8029(i_133_, 1344002143));
				break;
			    default:
				if (((Class173_Sub1) (((Class137_Sub2) this)
						      .aClass173_Sub1_8980))
				    .aBool9289)
				    class306.method4062();
				else
				    class306.method4059(0);
			    }
			    i_131_ += (((Class528_Sub26) class528_sub26)
				       .anInt10435);
			}
		    }
		}
	    }
	    if (!((Class137_Sub2) this).aClass688_8976
		     .method8040((byte) -10)) {
		((Class137_Sub2) this).aClass173_Sub1_8980.method8479(128);
		((Class137_Sub2) this).aClass173_Sub1_8980.method8624(false);
		Class422 class422 = new Class422(class306.aClass422_3368);
		class306.aClass422_3368.method5057(0.0F, 0.0F, 0.0F);
		Iterator iterator
		    = ((Class137_Sub2) this).aClass688_8976.iterator();
		while (iterator.hasNext()) {
		    Class528_Sub14 class528_sub14
			= (Class528_Sub14) iterator.next();
		    class528_sub14.method9392(class306, i, i_113_, i_114_,
					      bools, bool);
		}
		class306.aClass422_3368.method5058(class422);
	    }
	    if (((Class137_Sub2) this).aClass334_8992 != null) {
		((Class137_Sub2) this).aClass173_Sub1_8980.method8479(1);
		((Class137_Sub2) this).aClass173_Sub1_8980
		    .method8553(0, ((Class137_Sub2) this).anInterface36_8978);
		((Class137_Sub2) this).aClass173_Sub1_8980
		    .method8553(1, ((Class137_Sub2) this).anInterface36_8979);
		((Class137_Sub2) this).aClass173_Sub1_8980
		    .method8552(((Class137_Sub2) this).aClass344_8960);
		Class418 class418 = (((Class137_Sub2) this).aClass173_Sub1_8980
				     .aClass418_9243);
		class418.method5013();
		class418.aFloatArray4768[13] = -1.0F;
		class306.method4057(class418);
		((Class137_Sub2) this).aClass334_8992
		    .method4343(class306, i, i_113_, i_114_, bools, bool);
	    }
	}
    }
    
    public void method1655(int i, int i_134_, int i_135_, int i_136_,
			   int i_137_, int i_138_, int i_139_,
			   boolean[][] bools) {
	if (((Class137_Sub2) this).anInt8956 > 0) {
	    Interface41 interface41
		= ((Class137_Sub2) this).aClass173_Sub1_8980
		      .method8478(((Class137_Sub2) this).anInt8971);
	    int i_140_ = 0;
	    int i_141_ = 32767;
	    int i_142_ = -32768;
	    ByteBuffer bytebuffer
		= ((Class137_Sub2) this).aClass173_Sub1_8980.aByteBuffer9222;
	    bytebuffer.clear();
	    for (int i_143_ = i_137_; i_143_ < i_139_; i_143_++) {
		int i_144_ = i_143_ * (anInt1627 * -657933437) + i_136_;
		for (int i_145_ = i_136_; i_145_ < i_138_; i_145_++) {
		    if (bools[i_145_ - i_136_][i_143_ - i_137_]) {
			short[] is = (((Class137_Sub2) this)
				      .aShortArrayArray8967[i_144_]);
			if (is != null) {
			    for (int i_146_ = 0; i_146_ < is.length;
				 i_146_++) {
				int i_147_ = is[i_146_] & 0xffff;
				if (i_147_ > i_142_)
				    i_142_ = i_147_;
				if (i_147_ < i_141_)
				    i_141_ = i_147_;
				bytebuffer.putShort((short) i_147_);
				i_140_++;
			    }
			}
		    }
		    i_144_++;
		}
	    }
	    interface41.method197(0, bytebuffer.position(),
				  (((Class137_Sub2) this).aClass173_Sub1_8980
				   .aLong9223));
	    if (i_140_ > 0) {
		((Class137_Sub2) this).aClass173_Sub1_8980.method8587();
		Class306 class306 = (((Class173_Sub1) (((Class137_Sub2) this)
						       .aClass173_Sub1_8980))
				     .aClass306_9324);
		((Class137_Sub2) this).aClass173_Sub1_8980
		    .method8553(0, ((Class137_Sub2) this).anInterface36_8978);
		((Class137_Sub2) this).aClass173_Sub1_8980
		    .method8553(1, ((Class137_Sub2) this).anInterface36_8979);
		((Class137_Sub2) this).aClass173_Sub1_8980
		    .method8552(((Class137_Sub2) this).aClass344_8960);
		((Class137_Sub2) this).aClass173_Sub1_8980
		    .method8554(interface41);
		((Class137_Sub2) this).aClass173_Sub1_8980
		    .method2465(Class433.aClass433_4838);
		float f = (float) ((Class137_Sub2) this)
				      .aClass173_Sub1_8980.method2403
				      ((byte) -63).method2074();
		float f_148_ = (float) ((Class137_Sub2) this)
					   .aClass173_Sub1_8980.method2403
					   ((byte) -18).method2070();
		Class433 class433 = new Class433();
		Class433 class433_149_ = new Class433();
		class433.method5222(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F,
				    1.0F, 0.0F);
		class433_149_.method5227
		    ((float) i_135_ / (256.0F
				       * (float) (anInt1628 * 2130003981)),
		     (float) -i_135_ / (256.0F
					* (float) (anInt1628 * 2130003981)),
		     1.0F / (((Class137_Sub2) this).aFloat8966
			     - ((Class137_Sub2) this).aFloat8965));
		class433_149_.method5252
		    ((float) i - (float) (i_136_ * i_135_) / 256.0F,
		     (float) i_134_ + (float) (i_139_ * i_135_) / 256.0F,
		     (-((Class137_Sub2) this).aFloat8965
		      / (((Class137_Sub2) this).aFloat8966
			 - ((Class137_Sub2) this).aFloat8965)));
		class433_149_.method5249(2.0F / f, 2.0F / f_148_, 1.0F);
		class433_149_.method5252(-1.0F, -1.0F, 0.0F);
		((Class173_Sub1) ((Class137_Sub2) this).aClass173_Sub1_8980)
		    .aClass433_9242.method5250(class433, class433_149_);
		((Class137_Sub2) this).aClass173_Sub1_8980.aClass418_9243
		    .method5035
		    (((Class173_Sub1) (((Class137_Sub2) this)
				       .aClass173_Sub1_8980)).aClass433_9242);
		((Class137_Sub2) this).aClass173_Sub1_8980.method2252
		    (((Class137_Sub2) this).aClass173_Sub1_8980
		     .aClass418_9243);
		class306.method4057(Class418.aClass418_4769);
		class306.aClass425_3372.method5120(0.0F, 0.0F, 0.0F, 0.0F);
		class306.aClass422_3368.method5057(0.0F, 0.0F, 0.0F);
		class306.aClass425_3361.method5120(0.0F, 0.0F, 0.0F, 0.0F);
		class306.aClass422_3362.method5057(0.0F, 0.0F, 0.0F);
		class306.anInterface34_3355
		    = (((Class137_Sub2) this).aClass173_Sub1_8980
		       .anInterface34_9316);
		class306.aClass418_3358.method5013();
		class306.anInt3370 = i_141_;
		class306.anInt3354 = i_142_ - i_141_ + 1;
		class306.anInt3351 = 0;
		class306.anInt3373 = i_140_ / 3;
		if (((Class137_Sub2) this).aClass173_Sub1_8980.aBool9284) {
		    ((Class137_Sub2) this).aClass173_Sub1_8980
			.method2283(false);
		    class306.method4058(false);
		    ((Class137_Sub2) this).aClass173_Sub1_8980
			.method2283(true);
		} else
		    class306.method4058(false);
	    }
	}
    }
    
    public boolean method1663(Class528_Sub21_Sub12 class528_sub21_sub12, int i,
			      int i_150_, int i_151_, int i_152_,
			      boolean bool) {
	if (((Class137_Sub2) this).aClass334_8992 == null
	    || class528_sub21_sub12 == null)
	    return false;
	int i_153_
	    = (i - (i_150_ * ((Class173_Sub1) (((Class137_Sub2) this)
					       .aClass173_Sub1_8980)).anInt9306
		    >> 8)
	       >> (((Class173_Sub1) ((Class137_Sub2) this).aClass173_Sub1_8980)
		   .anInt9305));
	int i_154_
	    = (i_151_ - (i_150_ * (((Class173_Sub1)
				    ((Class137_Sub2) this).aClass173_Sub1_8980)
				   .anInt9307)
			 >> 8)
	       >> (((Class173_Sub1) ((Class137_Sub2) this).aClass173_Sub1_8980)
		   .anInt9305));
	return ((Class137_Sub2) this).aClass334_8992
		   .method4345(class528_sub21_sub12, i_153_, i_154_);
    }
    
    public Class528_Sub21_Sub12 method1660
	(int i, int i_155_, Class528_Sub21_Sub12 class528_sub21_sub12) {
	if ((((Class137_Sub2) this).aByteArrayArray8974[i][i_155_] & 0x1) == 0)
	    return null;
	int i_156_
	    = (anInt1628 * 2130003981
	       >> (((Class173_Sub1) ((Class137_Sub2) this).aClass173_Sub1_8980)
		   .anInt9305));
	Class528_Sub21_Sub12_Sub1 class528_sub21_sub12_sub1
	    = (Class528_Sub21_Sub12_Sub1) class528_sub21_sub12;
	Class528_Sub21_Sub12_Sub1 class528_sub21_sub12_sub1_157_;
	if (class528_sub21_sub12_sub1 != null
	    && class528_sub21_sub12_sub1.method10823(i_156_, i_156_)) {
	    class528_sub21_sub12_sub1_157_ = class528_sub21_sub12_sub1;
	    class528_sub21_sub12_sub1_157_.method10824();
	} else
	    class528_sub21_sub12_sub1_157_
		= new Class528_Sub21_Sub12_Sub1((((Class137_Sub2) this)
						 .aClass173_Sub1_8980),
						i_156_, i_156_);
	class528_sub21_sub12_sub1_157_.method10829(0, 0, i_156_, i_156_);
	method8345(class528_sub21_sub12_sub1_157_, i, i_155_);
	return class528_sub21_sub12_sub1_157_;
    }
    
    public void method1662(Class528_Sub21_Sub12 class528_sub21_sub12, int i,
			   int i_158_, int i_159_, int i_160_, boolean bool) {
	if (((Class137_Sub2) this).aClass334_8992 != null
	    && class528_sub21_sub12 != null) {
	    int i_161_
		= (i - (i_158_ * (((Class173_Sub1)
				   ((Class137_Sub2) this).aClass173_Sub1_8980)
				  .anInt9306)
			>> 8)
		   >> ((Class173_Sub1)
		       ((Class137_Sub2) this).aClass173_Sub1_8980).anInt9305);
	    int i_162_
		= (i_159_ - (i_158_ * (((Class173_Sub1) (((Class137_Sub2) this)
							 .aClass173_Sub1_8980))
				       .anInt9307)
			     >> 8)
		   >> ((Class173_Sub1)
		       ((Class137_Sub2) this).aClass173_Sub1_8980).anInt9305);
	    ((Class137_Sub2) this).aClass334_8992
		.method4342(class528_sub21_sub12, i_161_, i_162_);
	}
    }
    
    public void method1675(int i, int i_163_, int[] is, int[] is_164_,
			   int[] is_165_, int[] is_166_, int[] is_167_,
			   int[] is_168_, int[] is_169_, int[] is_170_,
			   Class164 class164, boolean bool) {
	Class165 class165
	    = ((Class137_Sub2) this).aClass173_Sub1_8980.aClass165_1984;
	if (is_166_ != null
	    && ((Class137_Sub2) this).anIntArrayArrayArray8973 == null)
	    ((Class137_Sub2) this).anIntArrayArrayArray8973
		= new int[anInt1627 * -657933437][anInt1626 * 1769495707][];
	if (is_164_ != null
	    && ((Class137_Sub2) this).anIntArrayArrayArray8972 == null)
	    ((Class137_Sub2) this).anIntArrayArrayArray8972
		= new int[anInt1627 * -657933437][anInt1626 * 1769495707][];
	((Class137_Sub2) this).anIntArrayArrayArray8970[i][i_163_] = is;
	((Class137_Sub2) this).anIntArrayArrayArray8989[i][i_163_] = is_165_;
	((Class137_Sub2) this).anIntArrayArrayArray8968[i][i_163_] = is_167_;
	((Class137_Sub2) this).anIntArrayArrayArray8969[i][i_163_] = is_168_;
	if (((Class137_Sub2) this).anIntArrayArrayArray8973 != null)
	    ((Class137_Sub2) this).anIntArrayArrayArray8973[i][i_163_]
		= is_166_;
	if (((Class137_Sub2) this).anIntArrayArrayArray8972 != null)
	    ((Class137_Sub2) this).anIntArrayArrayArray8972[i][i_163_]
		= is_164_;
	Class528_Sub26[] class528_sub26s
	    = (((Class137_Sub2) this).aClass528_Sub26ArrayArrayArray8962[i]
		   [i_163_]
	       = new Class528_Sub26[is_167_.length]);
	for (int i_171_ = 0; i_171_ < is_167_.length; i_171_++) {
	    int i_172_ = is_169_[i_171_];
	    int i_173_ = is_170_[i_171_];
	    if ((((Class137_Sub2) this).anInt8961 & 0x20) != 0 && i_172_ != -1
		&& class165.method2093(i_172_, (byte) -17).aBool1800) {
		i_173_ = 128;
		i_172_ = -1;
	    }
	    long l = ((long) (class164.anInt1829 * 1802884547) << 48
		      | (long) (class164.anInt1828 * -386339441) << 42
		      | (long) (class164.anInt1827 * -222719641) << 28
		      | (long) (i_173_ << 14) | (long) i_172_);
	    Node node;
	    for (node
		     = ((Class137_Sub2) this).aClass692_8987.method8137(l);
		 node != null;
		 node = ((Class137_Sub2) this).aClass692_8987
				.method8143((short) 255)) {
		Class528_Sub26 class528_sub26 = (Class528_Sub26) node;
		if (((Class528_Sub26) class528_sub26).anInt10439 == i_172_
		    && (((Class528_Sub26) class528_sub26).aFloat10434
			== (float) i_173_)
		    && ((Class528_Sub26) class528_sub26).aClass164_10431
			   .method2085(class164, (short) 7050))
		    break;
	    }
	    if (node == null) {
		class528_sub26s[i_171_]
		    = new Class528_Sub26(this, i_172_, i_173_, class164);
		((Class137_Sub2) this).aClass692_8987
		    .method8142(class528_sub26s[i_171_], l);
	    } else
		class528_sub26s[i_171_] = (Class528_Sub26) node;
	}
	if (bool)
	    ((Class137_Sub2) this).aByteArrayArray8974[i][i_163_] |= 0x1;
	if (is_167_.length > ((Class137_Sub2) this).anInt8982)
	    ((Class137_Sub2) this).anInt8982 = is_167_.length;
	((Class137_Sub2) this).anInt8956 += is_167_.length;
    }
    
    public void method1652(int i, int i_174_, int[] is, int[] is_175_,
			   int[] is_176_, int[] is_177_, int[] is_178_,
			   int[] is_179_, int[] is_180_, int[] is_181_,
			   int[] is_182_, int[] is_183_, int[] is_184_,
			   Class164 class164, boolean bool) {
	int i_185_ = is_181_.length;
	int[] is_186_ = new int[i_185_ * 3];
	int[] is_187_ = new int[i_185_ * 3];
	int[] is_188_ = new int[i_185_ * 3];
	int[] is_189_ = new int[i_185_ * 3];
	int[] is_190_ = new int[i_185_ * 3];
	int[] is_191_ = new int[i_185_ * 3];
	int[] is_192_ = is_175_ != null ? new int[i_185_ * 3] : null;
	int[] is_193_ = is_177_ != null ? new int[i_185_ * 3] : null;
	int i_194_ = 0;
	for (int i_195_ = 0; i_195_ < i_185_; i_195_++) {
	    int i_196_ = is_178_[i_195_];
	    int i_197_ = is_179_[i_195_];
	    int i_198_ = is_180_[i_195_];
	    is_186_[i_194_] = is[i_196_];
	    is_187_[i_194_] = is_176_[i_196_];
	    is_188_[i_194_] = is_181_[i_195_];
	    is_190_[i_194_] = is_183_[i_195_];
	    is_191_[i_194_] = is_184_[i_195_];
	    is_189_[i_194_]
		= is_182_ != null ? is_182_[i_195_] : is_181_[i_195_];
	    if (is_175_ != null)
		is_192_[i_194_] = is_175_[i_196_];
	    if (is_177_ != null)
		is_193_[i_194_] = is_177_[i_196_];
	    i_194_++;
	    is_186_[i_194_] = is[i_197_];
	    is_187_[i_194_] = is_176_[i_197_];
	    is_188_[i_194_] = is_181_[i_195_];
	    is_190_[i_194_] = is_183_[i_195_];
	    is_191_[i_194_] = is_184_[i_195_];
	    is_189_[i_194_]
		= is_182_ != null ? is_182_[i_195_] : is_181_[i_195_];
	    if (is_175_ != null)
		is_192_[i_194_] = is_175_[i_197_];
	    if (is_177_ != null)
		is_193_[i_194_] = is_177_[i_197_];
	    i_194_++;
	    is_186_[i_194_] = is[i_198_];
	    is_187_[i_194_] = is_176_[i_198_];
	    is_188_[i_194_] = is_181_[i_195_];
	    is_190_[i_194_] = is_183_[i_195_];
	    is_191_[i_194_] = is_184_[i_195_];
	    is_189_[i_194_]
		= is_182_ != null ? is_182_[i_195_] : is_181_[i_195_];
	    if (is_175_ != null)
		is_192_[i_194_] = is_175_[i_198_];
	    if (is_177_ != null)
		is_193_[i_194_] = is_177_[i_198_];
	    i_194_++;
	}
	method1686(i, i_174_, is_186_, is_192_, is_187_, is_193_, is_188_,
		   is_189_, is_190_, is_191_, class164, bool);
    }
    
    public Class528_Sub21_Sub12 method1677
	(int i, int i_199_, Class528_Sub21_Sub12 class528_sub21_sub12) {
	if ((((Class137_Sub2) this).aByteArrayArray8974[i][i_199_] & 0x1) == 0)
	    return null;
	int i_200_
	    = (anInt1628 * 2130003981
	       >> (((Class173_Sub1) ((Class137_Sub2) this).aClass173_Sub1_8980)
		   .anInt9305));
	Class528_Sub21_Sub12_Sub1 class528_sub21_sub12_sub1
	    = (Class528_Sub21_Sub12_Sub1) class528_sub21_sub12;
	Class528_Sub21_Sub12_Sub1 class528_sub21_sub12_sub1_201_;
	if (class528_sub21_sub12_sub1 != null
	    && class528_sub21_sub12_sub1.method10823(i_200_, i_200_)) {
	    class528_sub21_sub12_sub1_201_ = class528_sub21_sub12_sub1;
	    class528_sub21_sub12_sub1_201_.method10824();
	} else
	    class528_sub21_sub12_sub1_201_
		= new Class528_Sub21_Sub12_Sub1((((Class137_Sub2) this)
						 .aClass173_Sub1_8980),
						i_200_, i_200_);
	class528_sub21_sub12_sub1_201_.method10829(0, 0, i_200_, i_200_);
	method8345(class528_sub21_sub12_sub1_201_, i, i_199_);
	return class528_sub21_sub12_sub1_201_;
    }
    
    public void method1665(int i, int i_202_, int[] is, int[] is_203_,
			   int[] is_204_, int[] is_205_, int[] is_206_,
			   int[] is_207_, int[] is_208_, int[] is_209_,
			   int[] is_210_, int[] is_211_, int[] is_212_,
			   Class164 class164, boolean bool) {
	int i_213_ = is_209_.length;
	int[] is_214_ = new int[i_213_ * 3];
	int[] is_215_ = new int[i_213_ * 3];
	int[] is_216_ = new int[i_213_ * 3];
	int[] is_217_ = new int[i_213_ * 3];
	int[] is_218_ = new int[i_213_ * 3];
	int[] is_219_ = new int[i_213_ * 3];
	int[] is_220_ = is_203_ != null ? new int[i_213_ * 3] : null;
	int[] is_221_ = is_205_ != null ? new int[i_213_ * 3] : null;
	int i_222_ = 0;
	for (int i_223_ = 0; i_223_ < i_213_; i_223_++) {
	    int i_224_ = is_206_[i_223_];
	    int i_225_ = is_207_[i_223_];
	    int i_226_ = is_208_[i_223_];
	    is_214_[i_222_] = is[i_224_];
	    is_215_[i_222_] = is_204_[i_224_];
	    is_216_[i_222_] = is_209_[i_223_];
	    is_218_[i_222_] = is_211_[i_223_];
	    is_219_[i_222_] = is_212_[i_223_];
	    is_217_[i_222_]
		= is_210_ != null ? is_210_[i_223_] : is_209_[i_223_];
	    if (is_203_ != null)
		is_220_[i_222_] = is_203_[i_224_];
	    if (is_205_ != null)
		is_221_[i_222_] = is_205_[i_224_];
	    i_222_++;
	    is_214_[i_222_] = is[i_225_];
	    is_215_[i_222_] = is_204_[i_225_];
	    is_216_[i_222_] = is_209_[i_223_];
	    is_218_[i_222_] = is_211_[i_223_];
	    is_219_[i_222_] = is_212_[i_223_];
	    is_217_[i_222_]
		= is_210_ != null ? is_210_[i_223_] : is_209_[i_223_];
	    if (is_203_ != null)
		is_220_[i_222_] = is_203_[i_225_];
	    if (is_205_ != null)
		is_221_[i_222_] = is_205_[i_225_];
	    i_222_++;
	    is_214_[i_222_] = is[i_226_];
	    is_215_[i_222_] = is_204_[i_226_];
	    is_216_[i_222_] = is_209_[i_223_];
	    is_218_[i_222_] = is_211_[i_223_];
	    is_219_[i_222_] = is_212_[i_223_];
	    is_217_[i_222_]
		= is_210_ != null ? is_210_[i_223_] : is_209_[i_223_];
	    if (is_203_ != null)
		is_220_[i_222_] = is_203_[i_226_];
	    if (is_205_ != null)
		is_221_[i_222_] = is_205_[i_226_];
	    i_222_++;
	}
	method1686(i, i_202_, is_214_, is_220_, is_215_, is_221_, is_216_,
		   is_217_, is_218_, is_219_, class164, bool);
    }
    
    public void method1667() {
	if (((Class137_Sub2) this).anInt8956 <= 0) {
	    ((Class137_Sub2) this).aClass334_8992 = null;
	    method8343();
	} else {
	    byte[][] is = (new byte[anInt1627 * -657933437 + 1]
			   [anInt1626 * 1769495707 + 1]);
	    for (int i = 1; i < anInt1627 * -657933437; i++) {
		for (int i_227_ = 1; i_227_ < anInt1626 * 1769495707; i_227_++)
		    is[i][i_227_]
			= (byte) (((((Class137_Sub2) this).aByteArrayArray8988
				    [i - 1][i_227_])
				   >> 2)
				  + ((((Class137_Sub2) this)
				      .aByteArrayArray8988[i + 1][i_227_])
				     >> 3)
				  + ((((Class137_Sub2) this)
				      .aByteArrayArray8988[i][i_227_ - 1])
				     >> 2)
				  + ((((Class137_Sub2) this)
				      .aByteArrayArray8988[i][i_227_ + 1])
				     >> 3)
				  + ((((Class137_Sub2) this)
				      .aByteArrayArray8988[i][i_227_])
				     >> 1));
	    }
	    ((Class137_Sub2) this).aClass528Array8993
		= new Node[((Class137_Sub2) this).aClass692_8987
				   .method8139((short) 18124)];
	    ((Class137_Sub2) this).aClass692_8987.method8136
		(((Class137_Sub2) this).aClass528Array8993, -1470355803);
	    for (int i = 0;
		 i < ((Class137_Sub2) this).aClass528Array8993.length; i++)
		((Class528_Sub26) ((Class137_Sub2) this).aClass528Array8993[i])
		    .method9448(((Class137_Sub2) this).anInt8956);
	    ((Class137_Sub2) this).anInt8957 = 20;
	    if (((Class137_Sub2) this).anIntArrayArrayArray8973 != null)
		((Class137_Sub2) this).anInt8957 += 4;
	    if ((((Class137_Sub2) this).anInt8961 & 0x7) != 0)
		((Class137_Sub2) this).anInt8957 += 12;
	    ((Class137_Sub2) this).aByteBuffer8990
		= ((Class137_Sub2) this).aClass173_Sub1_8980
		      .method8452(((Class137_Sub2) this).anInt8956 * 4);
	    ((Class137_Sub2) this).aByteBuffer8991
		= (((Class137_Sub2) this).aClass173_Sub1_8980.method8452
		   (((Class137_Sub2) this).anInt8956
		    * ((Class137_Sub2) this).anInt8957));
	    Class528_Sub26[] class528_sub26s
		= new Class528_Sub26[((Class137_Sub2) this).anInt8956];
	    int i = ItemStyleOverride.method531(((Class137_Sub2) this).anInt8956 / 4,
				     -222759857);
	    if (i < 1)
		i = 1;
	    Class692 class692 = new Class692(i);
	    Class528_Sub26[] class528_sub26s_228_
		= new Class528_Sub26[((Class137_Sub2) this).anInt8982];
	    for (int i_229_ = 0; i_229_ < anInt1627 * -657933437; i_229_++) {
		for (int i_230_ = 0; i_230_ < anInt1626 * 1769495707; i_230_++)
		    method8341(i_229_, i_230_, is, class528_sub26s_228_,
			       class692, class528_sub26s);
	    }
	    for (int i_231_ = 0; i_231_ < ((Class137_Sub2) this).anInt8964;
		 i_231_++) {
		Class528_Sub26 class528_sub26 = class528_sub26s[i_231_];
		if (class528_sub26 != null)
		    class528_sub26.method9447(i_231_);
	    }
	    for (int i_232_ = 0; i_232_ < anInt1627 * -657933437; i_232_++) {
		for (int i_233_ = 0; i_233_ < anInt1626 * 1769495707;
		     i_233_++) {
		    short[] is_234_
			= (((Class137_Sub2) this).aShortArrayArray8967
			   [i_233_ * (anInt1627 * -657933437) + i_232_]);
		    if (is_234_ != null) {
			int i_235_ = 0;
			int i_236_ = 0;
			while (i_236_ < is_234_.length) {
			    int i_237_ = is_234_[i_236_++] & 0xffff;
			    int i_238_ = is_234_[i_236_++] & 0xffff;
			    int i_239_ = is_234_[i_236_++] & 0xffff;
			    Class528_Sub26 class528_sub26
				= class528_sub26s[i_237_];
			    Class528_Sub26 class528_sub26_240_
				= class528_sub26s[i_238_];
			    Class528_Sub26 class528_sub26_241_
				= class528_sub26s[i_239_];
			    Class528_Sub26 class528_sub26_242_ = null;
			    if (class528_sub26 != null) {
				class528_sub26.method9446(i_232_, i_233_,
							  i_235_);
				class528_sub26_242_ = class528_sub26;
			    }
			    if (class528_sub26_240_ != null) {
				class528_sub26_240_.method9446(i_232_, i_233_,
							       i_235_);
				if (class528_sub26_242_ == null
				    || ((class528_sub26_240_.aLong7107
					 * -4849232331708333273L)
					< (class528_sub26_242_.aLong7107
					   * -4849232331708333273L)))
				    class528_sub26_242_ = class528_sub26_240_;
			    }
			    if (class528_sub26_241_ != null) {
				class528_sub26_241_.method9446(i_232_, i_233_,
							       i_235_);
				if (class528_sub26_242_ == null
				    || ((class528_sub26_241_.aLong7107
					 * -4849232331708333273L)
					< (class528_sub26_242_.aLong7107
					   * -4849232331708333273L)))
				    class528_sub26_242_ = class528_sub26_241_;
			    }
			    if (class528_sub26_242_ != null) {
				if (class528_sub26 != null)
				    class528_sub26_242_.method9447(i_237_);
				if (class528_sub26_240_ != null)
				    class528_sub26_242_.method9447(i_238_);
				if (class528_sub26_241_ != null)
				    class528_sub26_242_.method9447(i_239_);
				class528_sub26_242_.method9446(i_232_, i_233_,
							       i_235_);
			    }
			    i_235_++;
			}
		    }
		}
	    }
	    ((Class137_Sub2) this).anInt8981 = 0;
	    for (int i_243_ = 0;
		 i_243_ < ((Class137_Sub2) this).aClass528Array8993.length;
		 i_243_++) {
		Class528_Sub26 class528_sub26
		    = ((Class528_Sub26)
		       ((Class137_Sub2) this).aClass528Array8993[i_243_]);
		if (((Class528_Sub26) class528_sub26).anInt10433 > 0)
		    ((Class137_Sub2) this).aClass528Array8993
			[((Class137_Sub2) this).anInt8981++]
			= class528_sub26;
	    }
	    ((Class137_Sub2) this).aClass528Array8977
		= new Node[((Class137_Sub2) this).anInt8981];
	    long[] ls = new long[((Class137_Sub2) this).anInt8981];
	    for (int i_244_ = 0; i_244_ < ((Class137_Sub2) this).anInt8981;
		 i_244_++) {
		Class528_Sub26 class528_sub26
		    = ((Class528_Sub26)
		       ((Class137_Sub2) this).aClass528Array8993[i_244_]);
		ls[i_244_] = class528_sub26.aLong7107 * -4849232331708333273L;
		((Class137_Sub2) this).aClass528Array8977[i_244_]
		    = class528_sub26;
	    }
	    Class650.method7738(ls, ((Class137_Sub2) this).aClass528Array8977,
				(short) 13186);
	    method8340();
	}
    }
    
    public void method1668() {
	if (((Class137_Sub2) this).anInt8956 <= 0) {
	    ((Class137_Sub2) this).aClass334_8992 = null;
	    method8343();
	} else {
	    byte[][] is = (new byte[anInt1627 * -657933437 + 1]
			   [anInt1626 * 1769495707 + 1]);
	    for (int i = 1; i < anInt1627 * -657933437; i++) {
		for (int i_245_ = 1; i_245_ < anInt1626 * 1769495707; i_245_++)
		    is[i][i_245_]
			= (byte) (((((Class137_Sub2) this).aByteArrayArray8988
				    [i - 1][i_245_])
				   >> 2)
				  + ((((Class137_Sub2) this)
				      .aByteArrayArray8988[i + 1][i_245_])
				     >> 3)
				  + ((((Class137_Sub2) this)
				      .aByteArrayArray8988[i][i_245_ - 1])
				     >> 2)
				  + ((((Class137_Sub2) this)
				      .aByteArrayArray8988[i][i_245_ + 1])
				     >> 3)
				  + ((((Class137_Sub2) this)
				      .aByteArrayArray8988[i][i_245_])
				     >> 1));
	    }
	    ((Class137_Sub2) this).aClass528Array8993
		= new Node[((Class137_Sub2) this).aClass692_8987
				   .method8139((short) 30127)];
	    ((Class137_Sub2) this).aClass692_8987.method8136
		(((Class137_Sub2) this).aClass528Array8993, -1618480069);
	    for (int i = 0;
		 i < ((Class137_Sub2) this).aClass528Array8993.length; i++)
		((Class528_Sub26) ((Class137_Sub2) this).aClass528Array8993[i])
		    .method9448(((Class137_Sub2) this).anInt8956);
	    ((Class137_Sub2) this).anInt8957 = 20;
	    if (((Class137_Sub2) this).anIntArrayArrayArray8973 != null)
		((Class137_Sub2) this).anInt8957 += 4;
	    if ((((Class137_Sub2) this).anInt8961 & 0x7) != 0)
		((Class137_Sub2) this).anInt8957 += 12;
	    ((Class137_Sub2) this).aByteBuffer8990
		= ((Class137_Sub2) this).aClass173_Sub1_8980
		      .method8452(((Class137_Sub2) this).anInt8956 * 4);
	    ((Class137_Sub2) this).aByteBuffer8991
		= (((Class137_Sub2) this).aClass173_Sub1_8980.method8452
		   (((Class137_Sub2) this).anInt8956
		    * ((Class137_Sub2) this).anInt8957));
	    Class528_Sub26[] class528_sub26s
		= new Class528_Sub26[((Class137_Sub2) this).anInt8956];
	    int i = ItemStyleOverride.method531(((Class137_Sub2) this).anInt8956 / 4,
				     -761911727);
	    if (i < 1)
		i = 1;
	    Class692 class692 = new Class692(i);
	    Class528_Sub26[] class528_sub26s_246_
		= new Class528_Sub26[((Class137_Sub2) this).anInt8982];
	    for (int i_247_ = 0; i_247_ < anInt1627 * -657933437; i_247_++) {
		for (int i_248_ = 0; i_248_ < anInt1626 * 1769495707; i_248_++)
		    method8341(i_247_, i_248_, is, class528_sub26s_246_,
			       class692, class528_sub26s);
	    }
	    for (int i_249_ = 0; i_249_ < ((Class137_Sub2) this).anInt8964;
		 i_249_++) {
		Class528_Sub26 class528_sub26 = class528_sub26s[i_249_];
		if (class528_sub26 != null)
		    class528_sub26.method9447(i_249_);
	    }
	    for (int i_250_ = 0; i_250_ < anInt1627 * -657933437; i_250_++) {
		for (int i_251_ = 0; i_251_ < anInt1626 * 1769495707;
		     i_251_++) {
		    short[] is_252_
			= (((Class137_Sub2) this).aShortArrayArray8967
			   [i_251_ * (anInt1627 * -657933437) + i_250_]);
		    if (is_252_ != null) {
			int i_253_ = 0;
			int i_254_ = 0;
			while (i_254_ < is_252_.length) {
			    int i_255_ = is_252_[i_254_++] & 0xffff;
			    int i_256_ = is_252_[i_254_++] & 0xffff;
			    int i_257_ = is_252_[i_254_++] & 0xffff;
			    Class528_Sub26 class528_sub26
				= class528_sub26s[i_255_];
			    Class528_Sub26 class528_sub26_258_
				= class528_sub26s[i_256_];
			    Class528_Sub26 class528_sub26_259_
				= class528_sub26s[i_257_];
			    Class528_Sub26 class528_sub26_260_ = null;
			    if (class528_sub26 != null) {
				class528_sub26.method9446(i_250_, i_251_,
							  i_253_);
				class528_sub26_260_ = class528_sub26;
			    }
			    if (class528_sub26_258_ != null) {
				class528_sub26_258_.method9446(i_250_, i_251_,
							       i_253_);
				if (class528_sub26_260_ == null
				    || ((class528_sub26_258_.aLong7107
					 * -4849232331708333273L)
					< (class528_sub26_260_.aLong7107
					   * -4849232331708333273L)))
				    class528_sub26_260_ = class528_sub26_258_;
			    }
			    if (class528_sub26_259_ != null) {
				class528_sub26_259_.method9446(i_250_, i_251_,
							       i_253_);
				if (class528_sub26_260_ == null
				    || ((class528_sub26_259_.aLong7107
					 * -4849232331708333273L)
					< (class528_sub26_260_.aLong7107
					   * -4849232331708333273L)))
				    class528_sub26_260_ = class528_sub26_259_;
			    }
			    if (class528_sub26_260_ != null) {
				if (class528_sub26 != null)
				    class528_sub26_260_.method9447(i_255_);
				if (class528_sub26_258_ != null)
				    class528_sub26_260_.method9447(i_256_);
				if (class528_sub26_259_ != null)
				    class528_sub26_260_.method9447(i_257_);
				class528_sub26_260_.method9446(i_250_, i_251_,
							       i_253_);
			    }
			    i_253_++;
			}
		    }
		}
	    }
	    ((Class137_Sub2) this).anInt8981 = 0;
	    for (int i_261_ = 0;
		 i_261_ < ((Class137_Sub2) this).aClass528Array8993.length;
		 i_261_++) {
		Class528_Sub26 class528_sub26
		    = ((Class528_Sub26)
		       ((Class137_Sub2) this).aClass528Array8993[i_261_]);
		if (((Class528_Sub26) class528_sub26).anInt10433 > 0)
		    ((Class137_Sub2) this).aClass528Array8993
			[((Class137_Sub2) this).anInt8981++]
			= class528_sub26;
	    }
	    ((Class137_Sub2) this).aClass528Array8977
		= new Node[((Class137_Sub2) this).anInt8981];
	    long[] ls = new long[((Class137_Sub2) this).anInt8981];
	    for (int i_262_ = 0; i_262_ < ((Class137_Sub2) this).anInt8981;
		 i_262_++) {
		Class528_Sub26 class528_sub26
		    = ((Class528_Sub26)
		       ((Class137_Sub2) this).aClass528Array8993[i_262_]);
		ls[i_262_] = class528_sub26.aLong7107 * -4849232331708333273L;
		((Class137_Sub2) this).aClass528Array8977[i_262_]
		    = class528_sub26;
	    }
	    Class650.method7738(ls, ((Class137_Sub2) this).aClass528Array8977,
				(short) 27288);
	    method8340();
	}
    }
    
    public void method1687(int i, int i_263_, int i_264_, boolean[][] bools,
			   boolean bool, int i_265_) {
	if (((Class137_Sub2) this).aClass528Array8977 != null) {
	    int i_266_ = i_264_ + i_264_ + 1;
	    i_266_ *= i_266_;
	    if (((Class137_Sub2) this).anIntArray8996.length < i_266_)
		((Class137_Sub2) this).anIntArray8996 = new int[i_266_];
	    int i_267_ = i - i_264_;
	    int i_268_ = i_267_;
	    if (i_267_ < 0)
		i_267_ = 0;
	    int i_269_ = i_263_ - i_264_;
	    int i_270_ = i_269_;
	    if (i_269_ < 0)
		i_269_ = 0;
	    int i_271_ = i + i_264_;
	    if (i_271_ > anInt1627 * -657933437 - 1)
		i_271_ = anInt1627 * -657933437 - 1;
	    int i_272_ = i_263_ + i_264_;
	    if (i_272_ > anInt1626 * 1769495707 - 1)
		i_272_ = anInt1626 * 1769495707 - 1;
	    ((Class137_Sub2) this).anInt8995 = 0;
	    for (int i_273_ = i_267_; i_273_ <= i_271_; i_273_++) {
		boolean[] bools_274_ = bools[i_273_ - i_268_];
		for (int i_275_ = i_269_; i_275_ <= i_272_; i_275_++) {
		    if (bools_274_[i_275_ - i_270_])
			((Class137_Sub2) this).anIntArray8996
			    [((Class137_Sub2) this).anInt8995++]
			    = i_275_ * (anInt1627 * -657933437) + i_273_;
		}
	    }
	    ByteBuffer bytebuffer
		= ((Class137_Sub2) this).aClass173_Sub1_8980.aByteBuffer9222;
	    bytebuffer.clear();
	    for (int i_276_ = 0;
		 i_276_ < ((Class137_Sub2) this).aClass528Array8977.length;
		 i_276_++) {
		Class528_Sub26 class528_sub26
		    = ((Class528_Sub26)
		       ((Class137_Sub2) this).aClass528Array8977[i_276_]);
		class528_sub26.method9458((((Class137_Sub2) this)
					   .anIntArray8996),
					  ((Class137_Sub2) this).anInt8995);
	    }
	    int i_277_ = bytebuffer.position();
	    Class306 class306
		= (((Class173_Sub1) ((Class137_Sub2) this).aClass173_Sub1_8980)
		   .aClass306_9324);
	    ((Class137_Sub2) this).aClass173_Sub1_8980.method8587();
	    if (((Class137_Sub2) this).aClass173_Sub1_8980.anInt9236 > 0) {
		class306.aClass422_3368.method5057
		    ((float) ((((Class137_Sub2) this).aClass173_Sub1_8980
			       .anInt9344) >> 16
			      & 0xff) / 255.0F,
		     (float) ((((Class137_Sub2) this).aClass173_Sub1_8980
			       .anInt9344) >> 8
			      & 0xff) / 255.0F,
		     (float) ((((Class137_Sub2) this).aClass173_Sub1_8980
			       .anInt9344) >> 0
			      & 0xff) / 255.0F);
		class306.aClass425_3372.method5120(0.0F, 0.0F, 1.0F,
						   -(((Class137_Sub2) this)
						     .aClass173_Sub1_8980
						     .aFloat9347));
		class306.aClass425_3372.method5126(((Class173_Sub1)
						    (((Class137_Sub2) this)
						     .aClass173_Sub1_8980))
						   .aClass418_9330);
		class306.aClass425_3372.method5136(1.0F
						   / ((((Class137_Sub2) this)
						       .aClass173_Sub1_8980
						       .aFloat9348)
						      - (((Class137_Sub2) this)
							 .aClass173_Sub1_8980
							 .aFloat9347)));
	    } else {
		class306.aClass425_3372.method5120(0.0F, 0.0F, 0.0F, 0.0F);
		class306.aClass422_3368.method5057(0.0F, 0.0F, 0.0F);
	    }
	    if (i_277_ != 0) {
		Interface41 interface41
		    = ((Class137_Sub2) this).aClass173_Sub1_8980
			  .method8478(i_277_ / 2);
		interface41.method197(0, i_277_,
				      (((Class137_Sub2) this)
				       .aClass173_Sub1_8980.aLong9223));
		((Class137_Sub2) this).aClass173_Sub1_8980
		    .method8553(0, ((Class137_Sub2) this).anInterface36_8978);
		((Class137_Sub2) this).aClass173_Sub1_8980
		    .method8554(interface41);
		class306.method4057(Class418.aClass418_4769);
		if ((((Class137_Sub2) this).anInt8961 & 0x7) == 0) {
		    int i_278_ = 0;
		    for (int i_279_ = 0;
			 (i_279_
			  < ((Class137_Sub2) this).aClass528Array8977.length);
			 i_279_++) {
			Class528_Sub26 class528_sub26
			    = (Class528_Sub26) (((Class137_Sub2) this)
						.aClass528Array8977[i_279_]);
			if (((Class528_Sub26) class528_sub26).anInt10435
			    != 0) {
			    if (((Class173_Sub1)
				 ((Class137_Sub2) this).aClass173_Sub1_8980)
				.aBool9289) {
				((Class137_Sub2) this).aClass173_Sub1_8980
				    .method2152
				    (0, (((Class528_Sub26) class528_sub26)
					 .aClass164_10431));
				class306.aClass425_3361.method5120
				    (0.0F, 1.0F, 0.0F,
				     ((float) (((Class173_Sub1)
						(((Class137_Sub2) this)
						 .aClass173_Sub1_8980))
					       .anInt9237)
				      + ((float) ((((Class528_Sub26)
						    class528_sub26)
						   .aClass164_10431.anInt1829)
						  * 1802884547)
					 / 255.0F
					 * (float) ((((Class528_Sub26)
						      class528_sub26)
						     .aClass164_10431
						     .anInt1828)
						    * -386339441))));
				class306.aClass425_3361.method5136
				    (1.0F / (float) ((((Class528_Sub26)
						       class528_sub26)
						      .aClass164_10431
						      .anInt1828)
						     * -386339441));
				class306.aClass422_3362.method5057
				    ((float) (((((Class528_Sub26)
						 class528_sub26)
						.aClass164_10431.anInt1827)
					       * -222719641) >> 16
					      & 0xff) / 255.0F,
				     (float) (((((Class528_Sub26)
						 class528_sub26)
						.aClass164_10431.anInt1827)
					       * -222719641) >> 8
					      & 0xff) / 255.0F,
				     (float) (((((Class528_Sub26)
						 class528_sub26)
						.aClass164_10431.anInt1827)
					       * -222719641) >> 0
					      & 0xff) / 255.0F);
			    } else {
				class306.aClass425_3361.method5120(0.0F, 0.0F,
								   0.0F, 0.0F);
				class306.aClass422_3362.method5057(0.0F, 0.0F,
								   0.0F);
			    }
			    boolean bool_280_ = false;
			    if (((Class528_Sub26) class528_sub26).anInt10439
				!= -1) {
				Class160 class160
				    = (((Class137_Sub2) this)
					   .aClass173_Sub1_8980.aClass165_1984
					   .method2093
				       ((((Class528_Sub26) class528_sub26)
					 .anInt10439),
					(byte) -6));
				class306.anInterface34_3355
				    = ((Class173_Sub1) (((Class137_Sub2) this)
							.aClass173_Sub1_8980))
					  .aClass329_9315.method4265(class160);
				bool_280_
				    = !Class687.method8029(class160.aByte1790,
							   2042899324);
			    } else
				class306.anInterface34_3355
				    = (((Class137_Sub2) this)
				       .aClass173_Sub1_8980
				       .anInterface34_9316);
			    ((Class137_Sub2) this).aClass173_Sub1_8980
				.method8553
				(1, (((Class528_Sub26) class528_sub26)
				     .anInterface36_10427));
			    ((Class137_Sub2) this).aClass173_Sub1_8980
				.method8552
				(((Class137_Sub2) this).aClass344_8960);
			    class306.aClass418_3358.method4976
				(1.0F / (((Class528_Sub26) class528_sub26)
					 .aFloat10434),
				 1.0F / (((Class528_Sub26) class528_sub26)
					 .aFloat10434),
				 1.0F, 1.0F);
			    class306.anInt3370
				= ((Class528_Sub26) class528_sub26).anInt10436;
			    class306.anInt3354
				= (((Class528_Sub26) class528_sub26).anInt10437
				   - (((Class528_Sub26) class528_sub26)
				      .anInt10436)
				   + 1);
			    class306.anInt3351 = i_278_;
			    class306.anInt3373
				= (((Class528_Sub26) class528_sub26).anInt10435
				   / 3);
			    class306.method4058(bool_280_);
			    i_278_ += (((Class528_Sub26) class528_sub26)
				       .anInt10435);
			}
		    }
		} else {
		    class306.aClass422_3365.method5057((((Class137_Sub2) this)
							.aClass173_Sub1_8980
							.aFloatArray9290[0]),
						       (((Class137_Sub2) this)
							.aClass173_Sub1_8980
							.aFloatArray9290[1]),
						       (((Class137_Sub2) this)
							.aClass173_Sub1_8980
							.aFloatArray9290[2]));
		    class306.aClass422_3366.method5057
			((((Class137_Sub2) this).aClass173_Sub1_8980.aFloat9299
			  * (((Class137_Sub2) this).aClass173_Sub1_8980
			     .aFloat9295)),
			 (((Class137_Sub2) this).aClass173_Sub1_8980.aFloat9299
			  * (((Class137_Sub2) this).aClass173_Sub1_8980
			     .aFloat9296)),
			 (((Class137_Sub2) this).aClass173_Sub1_8980.aFloat9299
			  * (((Class137_Sub2) this).aClass173_Sub1_8980
			     .aFloat9251)));
		    class306.aClass422_3367.method5057
			((-(((Class137_Sub2) this).aClass173_Sub1_8980
			    .aFloat9300)
			  * (((Class137_Sub2) this).aClass173_Sub1_8980
			     .aFloat9295)),
			 (-(((Class137_Sub2) this).aClass173_Sub1_8980
			    .aFloat9300)
			  * (((Class137_Sub2) this).aClass173_Sub1_8980
			     .aFloat9296)),
			 (-(((Class137_Sub2) this).aClass173_Sub1_8980
			    .aFloat9300)
			  * (((Class137_Sub2) this).aClass173_Sub1_8980
			     .aFloat9251)));
		    class306.aClass422_3363.method5057
			((((Class137_Sub2) this).aClass173_Sub1_8980.aFloat9298
			  * (((Class137_Sub2) this).aClass173_Sub1_8980
			     .aFloat9295)),
			 (((Class137_Sub2) this).aClass173_Sub1_8980.aFloat9298
			  * (((Class137_Sub2) this).aClass173_Sub1_8980
			     .aFloat9296)),
			 (((Class137_Sub2) this).aClass173_Sub1_8980.aFloat9298
			  * (((Class137_Sub2) this).aClass173_Sub1_8980
			     .aFloat9251)));
		    int i_281_ = 0;
		    for (int i_282_ = 0;
			 (i_282_
			  < ((Class137_Sub2) this).aClass528Array8977.length);
			 i_282_++) {
			Class528_Sub26 class528_sub26
			    = (Class528_Sub26) (((Class137_Sub2) this)
						.aClass528Array8977[i_282_]);
			if (((Class528_Sub26) class528_sub26).anInt10435 > 0) {
			    if (((Class173_Sub1)
				 ((Class137_Sub2) this).aClass173_Sub1_8980)
				.aBool9289) {
				((Class137_Sub2) this).aClass173_Sub1_8980
				    .method2152
				    (0, (((Class528_Sub26) class528_sub26)
					 .aClass164_10431));
				float f = 0.15F;
				class306.aClass425_3361.method5120
				    (0.0F,
				     1.0F / ((float) ((((Class528_Sub26)
							class528_sub26)
						       .aClass164_10431
						       .anInt1828)
						      * -386339441)
					     * f),
				     0.0F,
				     256.0F / ((float) ((((Class528_Sub26)
							  class528_sub26)
							 .aClass164_10431
							 .anInt1828)
							* -386339441)
					       * f));
				class306.aClass422_3362.method5057
				    ((float) (((((Class528_Sub26)
						 class528_sub26)
						.aClass164_10431.anInt1827)
					       * -222719641) >> 16
					      & 0xff) / 255.0F,
				     (float) (((((Class528_Sub26)
						 class528_sub26)
						.aClass164_10431.anInt1827)
					       * -222719641) >> 8
					      & 0xff) / 255.0F,
				     (float) (((((Class528_Sub26)
						 class528_sub26)
						.aClass164_10431.anInt1827)
					       * -222719641) >> 0
					      & 0xff) / 255.0F);
			    } else {
				class306.aClass425_3361.method5120(0.0F, 0.0F,
								   0.0F, 0.0F);
				class306.aClass422_3362.method5057(0.0F, 0.0F,
								   0.0F);
			    }
			    byte i_283_ = 11;
			    if (((Class528_Sub26) class528_sub26).anInt10439
				!= -1) {
				Class160 class160
				    = (((Class137_Sub2) this)
					   .aClass173_Sub1_8980.aClass165_1984
					   .method2093
				       ((((Class528_Sub26) class528_sub26)
					 .anInt10439),
					(byte) -38));
				i_283_ = class160.aByte1790;
				class306.anInterface34_3355
				    = ((Class173_Sub1) (((Class137_Sub2) this)
							.aClass173_Sub1_8980))
					  .aClass329_9315.method4265(class160);
				class306.method4056(class160.aByte1796);
			    } else
				class306.anInterface34_3355
				    = (((Class137_Sub2) this)
				       .aClass173_Sub1_8980
				       .anInterface34_9316);
			    ((Class137_Sub2) this).aClass173_Sub1_8980
				.method8553
				(1, (((Class528_Sub26) class528_sub26)
				     .anInterface36_10427));
			    ((Class137_Sub2) this).aClass173_Sub1_8980
				.method8552
				(((Class137_Sub2) this).aClass344_8960);
			    class306.aClass418_3358.method4976
				(1.0F / (((Class528_Sub26) class528_sub26)
					 .aFloat10434),
				 1.0F / (((Class528_Sub26) class528_sub26)
					 .aFloat10434),
				 1.0F, 1.0F);
			    class306.anInt3370
				= ((Class528_Sub26) class528_sub26).anInt10436;
			    class306.anInt3354
				= (((Class528_Sub26) class528_sub26).anInt10437
				   - (((Class528_Sub26) class528_sub26)
				      .anInt10436)
				   + 1);
			    class306.anInt3351 = i_281_;
			    class306.anInt3373
				= (((Class528_Sub26) class528_sub26).anInt10435
				   / 3);
			    switch (i_283_) {
			    case 1:
				class306.aClass422_3369.method5057
				    ((((Class173_Sub1) (((Class137_Sub2) this)
							.aClass173_Sub1_8980))
				      .aClass418_9363.aFloatArray4768[12]),
				     (((Class173_Sub1) (((Class137_Sub2) this)
							.aClass173_Sub1_8980))
				      .aClass418_9363.aFloatArray4768[13]),
				     (((Class173_Sub1) (((Class137_Sub2) this)
							.aClass173_Sub1_8980))
				      .aClass418_9363.aFloatArray4768[14]));
				if (((Class173_Sub1) (((Class137_Sub2) this)
						      .aClass173_Sub1_8980))
				    .aBool9289)
				    class306.method4055();
				else
				    class306.method4060(0);
				break;
			    case 2:
			    case 4:
			    case 8:
			    case 9:
				if (!(((Class137_Sub2) this)
				      .aClass173_Sub1_8980.aBool9274)
				    && (((Class137_Sub2) this).anInt8961
					& 0x8) != 0
				    && ((Class173_Sub1) (((Class137_Sub2) this)
							 .aClass173_Sub1_8980))
					   .aClass335_Sub1_Sub2_9329
					   .method10405(-533783523)) {
				    Class335_Sub1_Sub2 class335_sub1_sub2
					= (((Class173_Sub1)
					    (((Class137_Sub2) this)
					     .aClass173_Sub1_8980))
					   .aClass335_Sub1_Sub2_9329);
				    if (i_283_ == 2)
					class335_sub1_sub2
					    = (((Class173_Sub1)
						(((Class137_Sub2) this)
						 .aClass173_Sub1_8980))
					       .aClass335_Sub1_Sub2_9345);
				    class335_sub1_sub2.aClass418_11403
					.method4986
					(((Class137_Sub2) this)
					 .aClass173_Sub1_8980.aClass418_9352);
				    class335_sub1_sub2.aClass418_11401
					.method4976
					(1.0F / (((Class528_Sub26)
						  class528_sub26).aFloat10434
						 * (float) ((((Class528_Sub26)
							      class528_sub26)
							     .aClass164_10431
							     .anInt1831)
							    * 861893455)),
					 1.0F / (((Class528_Sub26)
						  class528_sub26).aFloat10434
						 * (float) ((((Class528_Sub26)
							      class528_sub26)
							     .aClass164_10431
							     .anInt1831)
							    * 861893455)),
					 1.0F, 1.0F);
				    class335_sub1_sub2.aClass422_11404
					.method5057
					((((Class173_Sub1)
					   (((Class137_Sub2) this)
					    .aClass173_Sub1_8980))
					  .aClass418_9363.aFloatArray4768[12]),
					 (((Class173_Sub1)
					   (((Class137_Sub2) this)
					    .aClass173_Sub1_8980))
					  .aClass418_9363.aFloatArray4768[13]),
					 (((Class173_Sub1)
					   (((Class137_Sub2) this)
					    .aClass173_Sub1_8980))
					  .aClass418_9363.aFloatArray4768
					  [14]));
				    Class160 class160
					= (((Class137_Sub2) this)
					       .aClass173_Sub1_8980
					       .aClass165_1984.method2093
					   ((((Class528_Sub26) class528_sub26)
					     .anInt10439),
					    (byte) -17));
				    class335_sub1_sub2.anInt11398
					= class160.aByte1796 * 738383601;
				    class335_sub1_sub2.anInt11420
					= (((Class528_Sub26) class528_sub26)
					   .anInt10436) * -1034196007;
				    class335_sub1_sub2.anInt11421
					= ((((Class528_Sub26) class528_sub26)
					    .anInt10437)
					   - (((Class528_Sub26) class528_sub26)
					      .anInt10436)
					   + 1) * -388929093;
				    class335_sub1_sub2.anInt11422
					= i_281_ * -1480814185;
				    class335_sub1_sub2.anInt11417
					= (((Class528_Sub26) class528_sub26)
					   .anInt10435) / 3 * 434710977;
				    class335_sub1_sub2.aClass425_11423
					.method5121(class306.aClass425_3361);
				    class335_sub1_sub2.aClass422_11415
					.method5058(class306.aClass422_3362);
				    class335_sub1_sub2.aClass425_11397
					.method5121(class306.aClass425_3372);
				    class335_sub1_sub2.aClass422_11400
					.method5058(class306.aClass422_3368);
				    class335_sub1_sub2.method10406(-150596431);
				} else
				    class306.method4059(0);
				break;
			    case 7:
				class306.aClass422_3369.method5057
				    ((((Class173_Sub1) (((Class137_Sub2) this)
							.aClass173_Sub1_8980))
				      .aClass418_9363.aFloatArray4768[12]),
				     (((Class173_Sub1) (((Class137_Sub2) this)
							.aClass173_Sub1_8980))
				      .aClass418_9363.aFloatArray4768[13]),
				     (((Class173_Sub1) (((Class137_Sub2) this)
							.aClass173_Sub1_8980))
				      .aClass418_9363.aFloatArray4768[14]));
				class306.aClass418_3353.method5013();
				class306.anInterface39_3356
				    = ((Class137_Sub2) this)
					  .aClass173_Sub1_8980.method8584();
				class306.method4071(0);
				break;
			    case 6:
				class306.method4058
				    (!Class687.method8029(i_283_, 922033925));
				break;
			    default:
				if (((Class173_Sub1) (((Class137_Sub2) this)
						      .aClass173_Sub1_8980))
				    .aBool9289)
				    class306.method4062();
				else
				    class306.method4059(0);
			    }
			    i_281_ += (((Class528_Sub26) class528_sub26)
				       .anInt10435);
			}
		    }
		}
	    }
	    if (!((Class137_Sub2) this).aClass688_8976
		     .method8040((byte) -87)) {
		((Class137_Sub2) this).aClass173_Sub1_8980.method8479(128);
		((Class137_Sub2) this).aClass173_Sub1_8980.method8624(false);
		Class422 class422 = new Class422(class306.aClass422_3368);
		class306.aClass422_3368.method5057(0.0F, 0.0F, 0.0F);
		Iterator iterator
		    = ((Class137_Sub2) this).aClass688_8976.iterator();
		while (iterator.hasNext()) {
		    Class528_Sub14 class528_sub14
			= (Class528_Sub14) iterator.next();
		    class528_sub14.method9392(class306, i, i_263_, i_264_,
					      bools, bool);
		}
		class306.aClass422_3368.method5058(class422);
	    }
	    if (((Class137_Sub2) this).aClass334_8992 != null) {
		((Class137_Sub2) this).aClass173_Sub1_8980.method8479(1);
		((Class137_Sub2) this).aClass173_Sub1_8980
		    .method8553(0, ((Class137_Sub2) this).anInterface36_8978);
		((Class137_Sub2) this).aClass173_Sub1_8980
		    .method8553(1, ((Class137_Sub2) this).anInterface36_8979);
		((Class137_Sub2) this).aClass173_Sub1_8980
		    .method8552(((Class137_Sub2) this).aClass344_8960);
		Class418 class418 = (((Class137_Sub2) this).aClass173_Sub1_8980
				     .aClass418_9243);
		class418.method5013();
		class418.aFloatArray4768[13] = -1.0F;
		class306.method4057(class418);
		((Class137_Sub2) this).aClass334_8992
		    .method4343(class306, i, i_263_, i_264_, bools, bool);
	    }
	}
    }
    
    public void method1658(int i, int i_284_, int i_285_, int i_286_,
			   int i_287_, int i_288_, int i_289_,
			   boolean[][] bools) {
	if (((Class137_Sub2) this).anInt8956 > 0) {
	    Interface41 interface41
		= ((Class137_Sub2) this).aClass173_Sub1_8980
		      .method8478(((Class137_Sub2) this).anInt8971);
	    int i_290_ = 0;
	    int i_291_ = 32767;
	    int i_292_ = -32768;
	    ByteBuffer bytebuffer
		= ((Class137_Sub2) this).aClass173_Sub1_8980.aByteBuffer9222;
	    bytebuffer.clear();
	    for (int i_293_ = i_287_; i_293_ < i_289_; i_293_++) {
		int i_294_ = i_293_ * (anInt1627 * -657933437) + i_286_;
		for (int i_295_ = i_286_; i_295_ < i_288_; i_295_++) {
		    if (bools[i_295_ - i_286_][i_293_ - i_287_]) {
			short[] is = (((Class137_Sub2) this)
				      .aShortArrayArray8967[i_294_]);
			if (is != null) {
			    for (int i_296_ = 0; i_296_ < is.length;
				 i_296_++) {
				int i_297_ = is[i_296_] & 0xffff;
				if (i_297_ > i_292_)
				    i_292_ = i_297_;
				if (i_297_ < i_291_)
				    i_291_ = i_297_;
				bytebuffer.putShort((short) i_297_);
				i_290_++;
			    }
			}
		    }
		    i_294_++;
		}
	    }
	    interface41.method197(0, bytebuffer.position(),
				  (((Class137_Sub2) this).aClass173_Sub1_8980
				   .aLong9223));
	    if (i_290_ > 0) {
		((Class137_Sub2) this).aClass173_Sub1_8980.method8587();
		Class306 class306 = (((Class173_Sub1) (((Class137_Sub2) this)
						       .aClass173_Sub1_8980))
				     .aClass306_9324);
		((Class137_Sub2) this).aClass173_Sub1_8980
		    .method8553(0, ((Class137_Sub2) this).anInterface36_8978);
		((Class137_Sub2) this).aClass173_Sub1_8980
		    .method8553(1, ((Class137_Sub2) this).anInterface36_8979);
		((Class137_Sub2) this).aClass173_Sub1_8980
		    .method8552(((Class137_Sub2) this).aClass344_8960);
		((Class137_Sub2) this).aClass173_Sub1_8980
		    .method8554(interface41);
		((Class137_Sub2) this).aClass173_Sub1_8980
		    .method2465(Class433.aClass433_4838);
		float f = (float) ((Class137_Sub2) this)
				      .aClass173_Sub1_8980.method2403
				      ((byte) -32).method2074();
		float f_298_ = (float) ((Class137_Sub2) this)
					   .aClass173_Sub1_8980.method2403
					   ((byte) -80).method2070();
		Class433 class433 = new Class433();
		Class433 class433_299_ = new Class433();
		class433.method5222(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F,
				    1.0F, 0.0F);
		class433_299_.method5227
		    ((float) i_285_ / (256.0F
				       * (float) (anInt1628 * 2130003981)),
		     (float) -i_285_ / (256.0F
					* (float) (anInt1628 * 2130003981)),
		     1.0F / (((Class137_Sub2) this).aFloat8966
			     - ((Class137_Sub2) this).aFloat8965));
		class433_299_.method5252
		    ((float) i - (float) (i_286_ * i_285_) / 256.0F,
		     (float) i_284_ + (float) (i_289_ * i_285_) / 256.0F,
		     (-((Class137_Sub2) this).aFloat8965
		      / (((Class137_Sub2) this).aFloat8966
			 - ((Class137_Sub2) this).aFloat8965)));
		class433_299_.method5249(2.0F / f, 2.0F / f_298_, 1.0F);
		class433_299_.method5252(-1.0F, -1.0F, 0.0F);
		((Class173_Sub1) ((Class137_Sub2) this).aClass173_Sub1_8980)
		    .aClass433_9242.method5250(class433, class433_299_);
		((Class137_Sub2) this).aClass173_Sub1_8980.aClass418_9243
		    .method5035
		    (((Class173_Sub1) (((Class137_Sub2) this)
				       .aClass173_Sub1_8980)).aClass433_9242);
		((Class137_Sub2) this).aClass173_Sub1_8980.method2252
		    (((Class137_Sub2) this).aClass173_Sub1_8980
		     .aClass418_9243);
		class306.method4057(Class418.aClass418_4769);
		class306.aClass425_3372.method5120(0.0F, 0.0F, 0.0F, 0.0F);
		class306.aClass422_3368.method5057(0.0F, 0.0F, 0.0F);
		class306.aClass425_3361.method5120(0.0F, 0.0F, 0.0F, 0.0F);
		class306.aClass422_3362.method5057(0.0F, 0.0F, 0.0F);
		class306.anInterface34_3355
		    = (((Class137_Sub2) this).aClass173_Sub1_8980
		       .anInterface34_9316);
		class306.aClass418_3358.method5013();
		class306.anInt3370 = i_291_;
		class306.anInt3354 = i_292_ - i_291_ + 1;
		class306.anInt3351 = 0;
		class306.anInt3373 = i_290_ / 3;
		if (((Class137_Sub2) this).aClass173_Sub1_8980.aBool9284) {
		    ((Class137_Sub2) this).aClass173_Sub1_8980
			.method2283(false);
		    class306.method4058(false);
		    ((Class137_Sub2) this).aClass173_Sub1_8980
			.method2283(true);
		} else
		    class306.method4058(false);
	    }
	}
    }
    
    public void method1671(int i, int i_300_, int i_301_, int i_302_,
			   int i_303_, int i_304_, int i_305_,
			   boolean[][] bools) {
	if (((Class137_Sub2) this).anInt8956 > 0) {
	    Interface41 interface41
		= ((Class137_Sub2) this).aClass173_Sub1_8980
		      .method8478(((Class137_Sub2) this).anInt8971);
	    int i_306_ = 0;
	    int i_307_ = 32767;
	    int i_308_ = -32768;
	    ByteBuffer bytebuffer
		= ((Class137_Sub2) this).aClass173_Sub1_8980.aByteBuffer9222;
	    bytebuffer.clear();
	    for (int i_309_ = i_303_; i_309_ < i_305_; i_309_++) {
		int i_310_ = i_309_ * (anInt1627 * -657933437) + i_302_;
		for (int i_311_ = i_302_; i_311_ < i_304_; i_311_++) {
		    if (bools[i_311_ - i_302_][i_309_ - i_303_]) {
			short[] is = (((Class137_Sub2) this)
				      .aShortArrayArray8967[i_310_]);
			if (is != null) {
			    for (int i_312_ = 0; i_312_ < is.length;
				 i_312_++) {
				int i_313_ = is[i_312_] & 0xffff;
				if (i_313_ > i_308_)
				    i_308_ = i_313_;
				if (i_313_ < i_307_)
				    i_307_ = i_313_;
				bytebuffer.putShort((short) i_313_);
				i_306_++;
			    }
			}
		    }
		    i_310_++;
		}
	    }
	    interface41.method197(0, bytebuffer.position(),
				  (((Class137_Sub2) this).aClass173_Sub1_8980
				   .aLong9223));
	    if (i_306_ > 0) {
		((Class137_Sub2) this).aClass173_Sub1_8980.method8587();
		Class306 class306 = (((Class173_Sub1) (((Class137_Sub2) this)
						       .aClass173_Sub1_8980))
				     .aClass306_9324);
		((Class137_Sub2) this).aClass173_Sub1_8980
		    .method8553(0, ((Class137_Sub2) this).anInterface36_8978);
		((Class137_Sub2) this).aClass173_Sub1_8980
		    .method8553(1, ((Class137_Sub2) this).anInterface36_8979);
		((Class137_Sub2) this).aClass173_Sub1_8980
		    .method8552(((Class137_Sub2) this).aClass344_8960);
		((Class137_Sub2) this).aClass173_Sub1_8980
		    .method8554(interface41);
		((Class137_Sub2) this).aClass173_Sub1_8980
		    .method2465(Class433.aClass433_4838);
		float f = (float) ((Class137_Sub2) this)
				      .aClass173_Sub1_8980.method2403
				      ((byte) -99).method2074();
		float f_314_ = (float) ((Class137_Sub2) this)
					   .aClass173_Sub1_8980.method2403
					   ((byte) -32).method2070();
		Class433 class433 = new Class433();
		Class433 class433_315_ = new Class433();
		class433.method5222(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F,
				    1.0F, 0.0F);
		class433_315_.method5227
		    ((float) i_301_ / (256.0F
				       * (float) (anInt1628 * 2130003981)),
		     (float) -i_301_ / (256.0F
					* (float) (anInt1628 * 2130003981)),
		     1.0F / (((Class137_Sub2) this).aFloat8966
			     - ((Class137_Sub2) this).aFloat8965));
		class433_315_.method5252
		    ((float) i - (float) (i_302_ * i_301_) / 256.0F,
		     (float) i_300_ + (float) (i_305_ * i_301_) / 256.0F,
		     (-((Class137_Sub2) this).aFloat8965
		      / (((Class137_Sub2) this).aFloat8966
			 - ((Class137_Sub2) this).aFloat8965)));
		class433_315_.method5249(2.0F / f, 2.0F / f_314_, 1.0F);
		class433_315_.method5252(-1.0F, -1.0F, 0.0F);
		((Class173_Sub1) ((Class137_Sub2) this).aClass173_Sub1_8980)
		    .aClass433_9242.method5250(class433, class433_315_);
		((Class137_Sub2) this).aClass173_Sub1_8980.aClass418_9243
		    .method5035
		    (((Class173_Sub1) (((Class137_Sub2) this)
				       .aClass173_Sub1_8980)).aClass433_9242);
		((Class137_Sub2) this).aClass173_Sub1_8980.method2252
		    (((Class137_Sub2) this).aClass173_Sub1_8980
		     .aClass418_9243);
		class306.method4057(Class418.aClass418_4769);
		class306.aClass425_3372.method5120(0.0F, 0.0F, 0.0F, 0.0F);
		class306.aClass422_3368.method5057(0.0F, 0.0F, 0.0F);
		class306.aClass425_3361.method5120(0.0F, 0.0F, 0.0F, 0.0F);
		class306.aClass422_3362.method5057(0.0F, 0.0F, 0.0F);
		class306.anInterface34_3355
		    = (((Class137_Sub2) this).aClass173_Sub1_8980
		       .anInterface34_9316);
		class306.aClass418_3358.method5013();
		class306.anInt3370 = i_307_;
		class306.anInt3354 = i_308_ - i_307_ + 1;
		class306.anInt3351 = 0;
		class306.anInt3373 = i_306_ / 3;
		if (((Class137_Sub2) this).aClass173_Sub1_8980.aBool9284) {
		    ((Class137_Sub2) this).aClass173_Sub1_8980
			.method2283(false);
		    class306.method4058(false);
		    ((Class137_Sub2) this).aClass173_Sub1_8980
			.method2283(true);
		} else
		    class306.method4058(false);
	    }
	}
    }
    
    public void method1672(int i, int i_316_, int i_317_, int i_318_,
			   int i_319_, int i_320_, int i_321_,
			   boolean[][] bools) {
	if (((Class137_Sub2) this).anInt8956 > 0) {
	    Interface41 interface41
		= ((Class137_Sub2) this).aClass173_Sub1_8980
		      .method8478(((Class137_Sub2) this).anInt8971);
	    int i_322_ = 0;
	    int i_323_ = 32767;
	    int i_324_ = -32768;
	    ByteBuffer bytebuffer
		= ((Class137_Sub2) this).aClass173_Sub1_8980.aByteBuffer9222;
	    bytebuffer.clear();
	    for (int i_325_ = i_319_; i_325_ < i_321_; i_325_++) {
		int i_326_ = i_325_ * (anInt1627 * -657933437) + i_318_;
		for (int i_327_ = i_318_; i_327_ < i_320_; i_327_++) {
		    if (bools[i_327_ - i_318_][i_325_ - i_319_]) {
			short[] is = (((Class137_Sub2) this)
				      .aShortArrayArray8967[i_326_]);
			if (is != null) {
			    for (int i_328_ = 0; i_328_ < is.length;
				 i_328_++) {
				int i_329_ = is[i_328_] & 0xffff;
				if (i_329_ > i_324_)
				    i_324_ = i_329_;
				if (i_329_ < i_323_)
				    i_323_ = i_329_;
				bytebuffer.putShort((short) i_329_);
				i_322_++;
			    }
			}
		    }
		    i_326_++;
		}
	    }
	    interface41.method197(0, bytebuffer.position(),
				  (((Class137_Sub2) this).aClass173_Sub1_8980
				   .aLong9223));
	    if (i_322_ > 0) {
		((Class137_Sub2) this).aClass173_Sub1_8980.method8587();
		Class306 class306 = (((Class173_Sub1) (((Class137_Sub2) this)
						       .aClass173_Sub1_8980))
				     .aClass306_9324);
		((Class137_Sub2) this).aClass173_Sub1_8980
		    .method8553(0, ((Class137_Sub2) this).anInterface36_8978);
		((Class137_Sub2) this).aClass173_Sub1_8980
		    .method8553(1, ((Class137_Sub2) this).anInterface36_8979);
		((Class137_Sub2) this).aClass173_Sub1_8980
		    .method8552(((Class137_Sub2) this).aClass344_8960);
		((Class137_Sub2) this).aClass173_Sub1_8980
		    .method8554(interface41);
		((Class137_Sub2) this).aClass173_Sub1_8980
		    .method2465(Class433.aClass433_4838);
		float f = (float) ((Class137_Sub2) this)
				      .aClass173_Sub1_8980.method2403
				      ((byte) -12).method2074();
		float f_330_ = (float) ((Class137_Sub2) this)
					   .aClass173_Sub1_8980.method2403
					   ((byte) -104).method2070();
		Class433 class433 = new Class433();
		Class433 class433_331_ = new Class433();
		class433.method5222(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F,
				    1.0F, 0.0F);
		class433_331_.method5227
		    ((float) i_317_ / (256.0F
				       * (float) (anInt1628 * 2130003981)),
		     (float) -i_317_ / (256.0F
					* (float) (anInt1628 * 2130003981)),
		     1.0F / (((Class137_Sub2) this).aFloat8966
			     - ((Class137_Sub2) this).aFloat8965));
		class433_331_.method5252
		    ((float) i - (float) (i_318_ * i_317_) / 256.0F,
		     (float) i_316_ + (float) (i_321_ * i_317_) / 256.0F,
		     (-((Class137_Sub2) this).aFloat8965
		      / (((Class137_Sub2) this).aFloat8966
			 - ((Class137_Sub2) this).aFloat8965)));
		class433_331_.method5249(2.0F / f, 2.0F / f_330_, 1.0F);
		class433_331_.method5252(-1.0F, -1.0F, 0.0F);
		((Class173_Sub1) ((Class137_Sub2) this).aClass173_Sub1_8980)
		    .aClass433_9242.method5250(class433, class433_331_);
		((Class137_Sub2) this).aClass173_Sub1_8980.aClass418_9243
		    .method5035
		    (((Class173_Sub1) (((Class137_Sub2) this)
				       .aClass173_Sub1_8980)).aClass433_9242);
		((Class137_Sub2) this).aClass173_Sub1_8980.method2252
		    (((Class137_Sub2) this).aClass173_Sub1_8980
		     .aClass418_9243);
		class306.method4057(Class418.aClass418_4769);
		class306.aClass425_3372.method5120(0.0F, 0.0F, 0.0F, 0.0F);
		class306.aClass422_3368.method5057(0.0F, 0.0F, 0.0F);
		class306.aClass425_3361.method5120(0.0F, 0.0F, 0.0F, 0.0F);
		class306.aClass422_3362.method5057(0.0F, 0.0F, 0.0F);
		class306.anInterface34_3355
		    = (((Class137_Sub2) this).aClass173_Sub1_8980
		       .anInterface34_9316);
		class306.aClass418_3358.method5013();
		class306.anInt3370 = i_323_;
		class306.anInt3354 = i_324_ - i_323_ + 1;
		class306.anInt3351 = 0;
		class306.anInt3373 = i_322_ / 3;
		if (((Class137_Sub2) this).aClass173_Sub1_8980.aBool9284) {
		    ((Class137_Sub2) this).aClass173_Sub1_8980
			.method2283(false);
		    class306.method4058(false);
		    ((Class137_Sub2) this).aClass173_Sub1_8980
			.method2283(true);
		} else
		    class306.method4058(false);
	    }
	}
    }
    
    public Class528_Sub21_Sub12 method1673
	(int i, int i_332_, Class528_Sub21_Sub12 class528_sub21_sub12) {
	if ((((Class137_Sub2) this).aByteArrayArray8974[i][i_332_] & 0x1) == 0)
	    return null;
	int i_333_
	    = (anInt1628 * 2130003981
	       >> (((Class173_Sub1) ((Class137_Sub2) this).aClass173_Sub1_8980)
		   .anInt9305));
	Class528_Sub21_Sub12_Sub1 class528_sub21_sub12_sub1
	    = (Class528_Sub21_Sub12_Sub1) class528_sub21_sub12;
	Class528_Sub21_Sub12_Sub1 class528_sub21_sub12_sub1_334_;
	if (class528_sub21_sub12_sub1 != null
	    && class528_sub21_sub12_sub1.method10823(i_333_, i_333_)) {
	    class528_sub21_sub12_sub1_334_ = class528_sub21_sub12_sub1;
	    class528_sub21_sub12_sub1_334_.method10824();
	} else
	    class528_sub21_sub12_sub1_334_
		= new Class528_Sub21_Sub12_Sub1((((Class137_Sub2) this)
						 .aClass173_Sub1_8980),
						i_333_, i_333_);
	class528_sub21_sub12_sub1_334_.method10829(0, 0, i_333_, i_333_);
	method8345(class528_sub21_sub12_sub1_334_, i, i_332_);
	return class528_sub21_sub12_sub1_334_;
    }
    
    void method8342() {
	((Class137_Sub2) this).anInterface36_8979
	    = ((Class137_Sub2) this).aClass173_Sub1_8980.method8549(false);
	((Class137_Sub2) this).anInterface36_8979
	    .method258(((Class137_Sub2) this).anInt8964 * 4, 4);
	((Class137_Sub2) this).anInterface36_8979.method197
	    (0, ((Class137_Sub2) this).anInt8964 * 4,
	     ((Class137_Sub2) this).aClass173_Sub1_8980
		 .method8453(((Class137_Sub2) this).aByteBuffer8990));
	((Class137_Sub2) this).anInterface36_8978
	    = ((Class137_Sub2) this).aClass173_Sub1_8980.method8549(false);
	((Class137_Sub2) this).anInterface36_8978.method258
	    ((((Class137_Sub2) this).anInt8964
	      * ((Class137_Sub2) this).anInt8957),
	     ((Class137_Sub2) this).anInt8957);
	((Class137_Sub2) this).anInterface36_8978.method197
	    (0,
	     (((Class137_Sub2) this).anInt8964
	      * ((Class137_Sub2) this).anInt8957),
	     ((Class137_Sub2) this).aClass173_Sub1_8980
		 .method8453(((Class137_Sub2) this).aByteBuffer8991));
	((Class137_Sub2) this).aByteBuffer8990.clear();
	((Class137_Sub2) this).aByteBuffer8990 = null;
	((Class137_Sub2) this).aByteBuffer8991.clear();
	((Class137_Sub2) this).aByteBuffer8991 = null;
	if ((((Class137_Sub2) this).anInt8961 & 0x7) != 0) {
	    if (((Class137_Sub2) this).anIntArrayArrayArray8973 != null)
		((Class137_Sub2) this).aClass344_8960
		    = (((Class137_Sub2) this).aClass173_Sub1_8980.method8543
		       (new Class345[]
			{ new Class345(new Class331[]
				       { Class331.aClass331_3521,
					 Class331.aClass331_3518,
					 Class331.aClass331_3517,
					 Class331.aClass331_3515 }),
			  new Class345(Class331.aClass331_3531) }));
	    else
		((Class137_Sub2) this).aClass344_8960
		    = (((Class137_Sub2) this).aClass173_Sub1_8980.method8543
		       (new Class345[]
			{ new Class345(new Class331[]
				       { Class331.aClass331_3521,
					 Class331.aClass331_3518,
					 Class331.aClass331_3515 }),
			  new Class345(Class331.aClass331_3531) }));
	} else if (((Class137_Sub2) this).anIntArrayArrayArray8973 != null)
	    ((Class137_Sub2) this).aClass344_8960
		= (((Class137_Sub2) this).aClass173_Sub1_8980.method8543
		   (new Class345[]
		    { new Class345(new Class331[] { Class331.aClass331_3521,
						    Class331.aClass331_3518,
						    Class331.aClass331_3517 }),
		      new Class345(Class331.aClass331_3531) }));
	else
	    ((Class137_Sub2) this).aClass344_8960
		= (((Class137_Sub2) this).aClass173_Sub1_8980.method8543
		   (new Class345[]
		    { new Class345(new Class331[] { Class331.aClass331_3521,
						    Class331.aClass331_3518 }),
		      new Class345(Class331.aClass331_3531) }));
	for (int i = 0; i < ((Class137_Sub2) this).anInt8981; i++) {
	    Class528_Sub26 class528_sub26
		= ((Class528_Sub26)
		   ((Class137_Sub2) this).aClass528Array8993[i]);
	    class528_sub26.method9450(((Class137_Sub2) this).anInt8964);
	}
	if (((Class137_Sub2) this).aClass334_8992 != null)
	    ((Class137_Sub2) this).aClass334_8992.method4352();
	method8343();
    }
    
    void method8343() {
	if ((((Class137_Sub2) this).anInt8963 & 0x2) == 0) {
	    ((Class137_Sub2) this).anIntArrayArrayArray8989 = null;
	    ((Class137_Sub2) this).anIntArrayArrayArray8970 = null;
	    ((Class137_Sub2) this).anIntArrayArrayArray8968 = null;
	}
	((Class137_Sub2) this).anIntArrayArrayArray8973 = null;
	((Class137_Sub2) this).anIntArrayArrayArray8969 = null;
	((Class137_Sub2) this).anIntArrayArrayArray8972 = null;
	((Class137_Sub2) this).aClass528_Sub26ArrayArrayArray8962 = null;
	((Class137_Sub2) this).aByteArrayArray8988 = null;
	((Class137_Sub2) this).aClass692_8987 = null;
	((Class137_Sub2) this).aClass528Array8993 = null;
	((Class137_Sub2) this).aFloatArrayArray8986 = null;
	((Class137_Sub2) this).aFloatArrayArray8985 = null;
	((Class137_Sub2) this).aFloatArrayArray8955 = null;
    }
    
    public void method1676(Class528_Sub21_Sub12 class528_sub21_sub12, int i,
			   int i_335_, int i_336_, int i_337_, boolean bool) {
	if (((Class137_Sub2) this).aClass334_8992 != null
	    && class528_sub21_sub12 != null) {
	    int i_338_
		= (i - (i_335_ * (((Class173_Sub1)
				   ((Class137_Sub2) this).aClass173_Sub1_8980)
				  .anInt9306)
			>> 8)
		   >> ((Class173_Sub1)
		       ((Class137_Sub2) this).aClass173_Sub1_8980).anInt9305);
	    int i_339_
		= (i_336_ - (i_335_ * (((Class173_Sub1) (((Class137_Sub2) this)
							 .aClass173_Sub1_8980))
				       .anInt9307)
			     >> 8)
		   >> ((Class173_Sub1)
		       ((Class137_Sub2) this).aClass173_Sub1_8980).anInt9305);
	    ((Class137_Sub2) this).aClass334_8992
		.method4344(class528_sub21_sub12, i_338_, i_339_);
	}
    }
    
    public void method1689(Class528_Sub21_Sub12 class528_sub21_sub12, int i,
			   int i_340_, int i_341_, int i_342_, boolean bool) {
	if (((Class137_Sub2) this).aClass334_8992 != null
	    && class528_sub21_sub12 != null) {
	    int i_343_
		= (i - (i_340_ * (((Class173_Sub1)
				   ((Class137_Sub2) this).aClass173_Sub1_8980)
				  .anInt9306)
			>> 8)
		   >> ((Class173_Sub1)
		       ((Class137_Sub2) this).aClass173_Sub1_8980).anInt9305);
	    int i_344_
		= (i_341_ - (i_340_ * (((Class173_Sub1) (((Class137_Sub2) this)
							 .aClass173_Sub1_8980))
				       .anInt9307)
			     >> 8)
		   >> ((Class173_Sub1)
		       ((Class137_Sub2) this).aClass173_Sub1_8980).anInt9305);
	    ((Class137_Sub2) this).aClass334_8992
		.method4344(class528_sub21_sub12, i_343_, i_344_);
	}
    }
    
    public void method1664(int i, int i_345_, int i_346_) {
	i = Math.min(((Class137_Sub2) this).aByteArrayArray8988.length - 1,
		     Math.max(0, i));
	i_345_ = Math.min((((Class137_Sub2) this).aByteArrayArray8988[i].length
			   - 1),
			  Math.max(0, i_345_));
	if ((((Class137_Sub2) this).aByteArrayArray8988[i][i_345_] & 0xff)
	    < i_346_)
	    ((Class137_Sub2) this).aByteArrayArray8988[i][i_345_]
		= (byte) i_346_;
    }
    
    public boolean method1679(Class528_Sub21_Sub12 class528_sub21_sub12, int i,
			      int i_347_, int i_348_, int i_349_,
			      boolean bool) {
	if (((Class137_Sub2) this).aClass334_8992 == null
	    || class528_sub21_sub12 == null)
	    return false;
	int i_350_
	    = (i - (i_347_ * ((Class173_Sub1) (((Class137_Sub2) this)
					       .aClass173_Sub1_8980)).anInt9306
		    >> 8)
	       >> (((Class173_Sub1) ((Class137_Sub2) this).aClass173_Sub1_8980)
		   .anInt9305));
	int i_351_
	    = (i_348_ - (i_347_ * (((Class173_Sub1)
				    ((Class137_Sub2) this).aClass173_Sub1_8980)
				   .anInt9307)
			 >> 8)
	       >> (((Class173_Sub1) ((Class137_Sub2) this).aClass173_Sub1_8980)
		   .anInt9305));
	return ((Class137_Sub2) this).aClass334_8992
		   .method4345(class528_sub21_sub12, i_350_, i_351_);
    }
    
    public boolean method1680(Class528_Sub21_Sub12 class528_sub21_sub12, int i,
			      int i_352_, int i_353_, int i_354_,
			      boolean bool) {
	if (((Class137_Sub2) this).aClass334_8992 == null
	    || class528_sub21_sub12 == null)
	    return false;
	int i_355_
	    = (i - (i_352_ * ((Class173_Sub1) (((Class137_Sub2) this)
					       .aClass173_Sub1_8980)).anInt9306
		    >> 8)
	       >> (((Class173_Sub1) ((Class137_Sub2) this).aClass173_Sub1_8980)
		   .anInt9305));
	int i_356_
	    = (i_353_ - (i_352_ * (((Class173_Sub1)
				    ((Class137_Sub2) this).aClass173_Sub1_8980)
				   .anInt9307)
			 >> 8)
	       >> (((Class173_Sub1) ((Class137_Sub2) this).aClass173_Sub1_8980)
		   .anInt9305));
	return ((Class137_Sub2) this).aClass334_8992
		   .method4345(class528_sub21_sub12, i_355_, i_356_);
    }
    
    public boolean method1681(Class528_Sub21_Sub12 class528_sub21_sub12, int i,
			      int i_357_, int i_358_, int i_359_,
			      boolean bool) {
	if (((Class137_Sub2) this).aClass334_8992 == null
	    || class528_sub21_sub12 == null)
	    return false;
	int i_360_
	    = (i - (i_357_ * ((Class173_Sub1) (((Class137_Sub2) this)
					       .aClass173_Sub1_8980)).anInt9306
		    >> 8)
	       >> (((Class173_Sub1) ((Class137_Sub2) this).aClass173_Sub1_8980)
		   .anInt9305));
	int i_361_
	    = (i_358_ - (i_357_ * (((Class173_Sub1)
				    ((Class137_Sub2) this).aClass173_Sub1_8980)
				   .anInt9307)
			 >> 8)
	       >> (((Class173_Sub1) ((Class137_Sub2) this).aClass173_Sub1_8980)
		   .anInt9305));
	return ((Class137_Sub2) this).aClass334_8992
		   .method4345(class528_sub21_sub12, i_360_, i_361_);
    }
    
    public void method1682(Class528_Sub21_Sub12 class528_sub21_sub12, int i,
			   int i_362_, int i_363_, int i_364_, boolean bool) {
	if (((Class137_Sub2) this).aClass334_8992 != null
	    && class528_sub21_sub12 != null) {
	    int i_365_
		= (i - (i_362_ * (((Class173_Sub1)
				   ((Class137_Sub2) this).aClass173_Sub1_8980)
				  .anInt9306)
			>> 8)
		   >> ((Class173_Sub1)
		       ((Class137_Sub2) this).aClass173_Sub1_8980).anInt9305);
	    int i_366_
		= (i_363_ - (i_362_ * (((Class173_Sub1) (((Class137_Sub2) this)
							 .aClass173_Sub1_8980))
				       .anInt9307)
			     >> 8)
		   >> ((Class173_Sub1)
		       ((Class137_Sub2) this).aClass173_Sub1_8980).anInt9305);
	    ((Class137_Sub2) this).aClass334_8992
		.method4342(class528_sub21_sub12, i_365_, i_366_);
	}
    }
    
    public void method1650(Class528_Sub12 class528_sub12, int[] is) {
	((Class137_Sub2) this).aClass688_8976.method8031
	    (new Class528_Sub14(((Class137_Sub2) this).aClass173_Sub1_8980,
				this, class528_sub12, is),
	     (byte) 6);
    }
    
    public void method1684(Class528_Sub12 class528_sub12, int[] is) {
	((Class137_Sub2) this).aClass688_8976.method8031
	    (new Class528_Sub14(((Class137_Sub2) this).aClass173_Sub1_8980,
				this, class528_sub12, is),
	     (byte) -8);
    }
    
    void method8344() {
	((Class137_Sub2) this).anInterface36_8979
	    = ((Class137_Sub2) this).aClass173_Sub1_8980.method8549(false);
	((Class137_Sub2) this).anInterface36_8979
	    .method258(((Class137_Sub2) this).anInt8964 * 4, 4);
	((Class137_Sub2) this).anInterface36_8979.method197
	    (0, ((Class137_Sub2) this).anInt8964 * 4,
	     ((Class137_Sub2) this).aClass173_Sub1_8980
		 .method8453(((Class137_Sub2) this).aByteBuffer8990));
	((Class137_Sub2) this).anInterface36_8978
	    = ((Class137_Sub2) this).aClass173_Sub1_8980.method8549(false);
	((Class137_Sub2) this).anInterface36_8978.method258
	    ((((Class137_Sub2) this).anInt8964
	      * ((Class137_Sub2) this).anInt8957),
	     ((Class137_Sub2) this).anInt8957);
	((Class137_Sub2) this).anInterface36_8978.method197
	    (0,
	     (((Class137_Sub2) this).anInt8964
	      * ((Class137_Sub2) this).anInt8957),
	     ((Class137_Sub2) this).aClass173_Sub1_8980
		 .method8453(((Class137_Sub2) this).aByteBuffer8991));
	((Class137_Sub2) this).aByteBuffer8990.clear();
	((Class137_Sub2) this).aByteBuffer8990 = null;
	((Class137_Sub2) this).aByteBuffer8991.clear();
	((Class137_Sub2) this).aByteBuffer8991 = null;
	if ((((Class137_Sub2) this).anInt8961 & 0x7) != 0) {
	    if (((Class137_Sub2) this).anIntArrayArrayArray8973 != null)
		((Class137_Sub2) this).aClass344_8960
		    = (((Class137_Sub2) this).aClass173_Sub1_8980.method8543
		       (new Class345[]
			{ new Class345(new Class331[]
				       { Class331.aClass331_3521,
					 Class331.aClass331_3518,
					 Class331.aClass331_3517,
					 Class331.aClass331_3515 }),
			  new Class345(Class331.aClass331_3531) }));
	    else
		((Class137_Sub2) this).aClass344_8960
		    = (((Class137_Sub2) this).aClass173_Sub1_8980.method8543
		       (new Class345[]
			{ new Class345(new Class331[]
				       { Class331.aClass331_3521,
					 Class331.aClass331_3518,
					 Class331.aClass331_3515 }),
			  new Class345(Class331.aClass331_3531) }));
	} else if (((Class137_Sub2) this).anIntArrayArrayArray8973 != null)
	    ((Class137_Sub2) this).aClass344_8960
		= (((Class137_Sub2) this).aClass173_Sub1_8980.method8543
		   (new Class345[]
		    { new Class345(new Class331[] { Class331.aClass331_3521,
						    Class331.aClass331_3518,
						    Class331.aClass331_3517 }),
		      new Class345(Class331.aClass331_3531) }));
	else
	    ((Class137_Sub2) this).aClass344_8960
		= (((Class137_Sub2) this).aClass173_Sub1_8980.method8543
		   (new Class345[]
		    { new Class345(new Class331[] { Class331.aClass331_3521,
						    Class331.aClass331_3518 }),
		      new Class345(Class331.aClass331_3531) }));
	for (int i = 0; i < ((Class137_Sub2) this).anInt8981; i++) {
	    Class528_Sub26 class528_sub26
		= ((Class528_Sub26)
		   ((Class137_Sub2) this).aClass528Array8993[i]);
	    class528_sub26.method9450(((Class137_Sub2) this).anInt8964);
	}
	if (((Class137_Sub2) this).aClass334_8992 != null)
	    ((Class137_Sub2) this).aClass334_8992.method4352();
	method8343();
    }
    
    void method8345(Class528_Sub21_Sub12_Sub1 class528_sub21_sub12_sub1, int i,
		    int i_367_) {
	int[] is = ((Class137_Sub2) this).anIntArrayArrayArray8970[i][i_367_];
	int[] is_368_
	    = ((Class137_Sub2) this).anIntArrayArrayArray8989[i][i_367_];
	int i_369_ = is.length;
	if (((Class137_Sub2) this).anIntArray8975.length < i_369_) {
	    ((Class137_Sub2) this).anIntArray8975 = new int[i_369_];
	    ((Class137_Sub2) this).anIntArray8994 = new int[i_369_];
	}
	for (int i_370_ = 0; i_370_ < i_369_; i_370_++) {
	    ((Class137_Sub2) this).anIntArray8975[i_370_]
		= is[i_370_] >> (((Class173_Sub1)
				  ((Class137_Sub2) this).aClass173_Sub1_8980)
				 .anInt9305);
	    ((Class137_Sub2) this).anIntArray8994[i_370_]
		= is_368_[i_370_] >> (((Class173_Sub1) (((Class137_Sub2) this)
							.aClass173_Sub1_8980))
				      .anInt9305);
	}
	int i_371_ = 0;
	while (i_371_ < i_369_) {
	    int i_372_ = ((Class137_Sub2) this).anIntArray8975[i_371_];
	    int i_373_ = ((Class137_Sub2) this).anIntArray8994[i_371_++];
	    int i_374_ = ((Class137_Sub2) this).anIntArray8975[i_371_];
	    int i_375_ = ((Class137_Sub2) this).anIntArray8994[i_371_++];
	    int i_376_ = ((Class137_Sub2) this).anIntArray8975[i_371_];
	    int i_377_ = ((Class137_Sub2) this).anIntArray8994[i_371_++];
	    if (((i_372_ - i_374_) * (i_375_ - i_377_)
		 - (i_375_ - i_373_) * (i_376_ - i_374_))
		> 0)
		class528_sub21_sub12_sub1.method10825(i_373_, i_375_, i_377_,
						      i_372_, i_374_, i_376_);
	}
    }
    
    void method8346() {
	((Class137_Sub2) this).anInterface36_8979
	    = ((Class137_Sub2) this).aClass173_Sub1_8980.method8549(false);
	((Class137_Sub2) this).anInterface36_8979
	    .method258(((Class137_Sub2) this).anInt8964 * 4, 4);
	((Class137_Sub2) this).anInterface36_8979.method197
	    (0, ((Class137_Sub2) this).anInt8964 * 4,
	     ((Class137_Sub2) this).aClass173_Sub1_8980
		 .method8453(((Class137_Sub2) this).aByteBuffer8990));
	((Class137_Sub2) this).anInterface36_8978
	    = ((Class137_Sub2) this).aClass173_Sub1_8980.method8549(false);
	((Class137_Sub2) this).anInterface36_8978.method258
	    ((((Class137_Sub2) this).anInt8964
	      * ((Class137_Sub2) this).anInt8957),
	     ((Class137_Sub2) this).anInt8957);
	((Class137_Sub2) this).anInterface36_8978.method197
	    (0,
	     (((Class137_Sub2) this).anInt8964
	      * ((Class137_Sub2) this).anInt8957),
	     ((Class137_Sub2) this).aClass173_Sub1_8980
		 .method8453(((Class137_Sub2) this).aByteBuffer8991));
	((Class137_Sub2) this).aByteBuffer8990.clear();
	((Class137_Sub2) this).aByteBuffer8990 = null;
	((Class137_Sub2) this).aByteBuffer8991.clear();
	((Class137_Sub2) this).aByteBuffer8991 = null;
	if ((((Class137_Sub2) this).anInt8961 & 0x7) != 0) {
	    if (((Class137_Sub2) this).anIntArrayArrayArray8973 != null)
		((Class137_Sub2) this).aClass344_8960
		    = (((Class137_Sub2) this).aClass173_Sub1_8980.method8543
		       (new Class345[]
			{ new Class345(new Class331[]
				       { Class331.aClass331_3521,
					 Class331.aClass331_3518,
					 Class331.aClass331_3517,
					 Class331.aClass331_3515 }),
			  new Class345(Class331.aClass331_3531) }));
	    else
		((Class137_Sub2) this).aClass344_8960
		    = (((Class137_Sub2) this).aClass173_Sub1_8980.method8543
		       (new Class345[]
			{ new Class345(new Class331[]
				       { Class331.aClass331_3521,
					 Class331.aClass331_3518,
					 Class331.aClass331_3515 }),
			  new Class345(Class331.aClass331_3531) }));
	} else if (((Class137_Sub2) this).anIntArrayArrayArray8973 != null)
	    ((Class137_Sub2) this).aClass344_8960
		= (((Class137_Sub2) this).aClass173_Sub1_8980.method8543
		   (new Class345[]
		    { new Class345(new Class331[] { Class331.aClass331_3521,
						    Class331.aClass331_3518,
						    Class331.aClass331_3517 }),
		      new Class345(Class331.aClass331_3531) }));
	else
	    ((Class137_Sub2) this).aClass344_8960
		= (((Class137_Sub2) this).aClass173_Sub1_8980.method8543
		   (new Class345[]
		    { new Class345(new Class331[] { Class331.aClass331_3521,
						    Class331.aClass331_3518 }),
		      new Class345(Class331.aClass331_3531) }));
	for (int i = 0; i < ((Class137_Sub2) this).anInt8981; i++) {
	    Class528_Sub26 class528_sub26
		= ((Class528_Sub26)
		   ((Class137_Sub2) this).aClass528Array8993[i]);
	    class528_sub26.method9450(((Class137_Sub2) this).anInt8964);
	}
	if (((Class137_Sub2) this).aClass334_8992 != null)
	    ((Class137_Sub2) this).aClass334_8992.method4352();
	method8343();
    }
    
    public void method1670(Class528_Sub12 class528_sub12, int[] is) {
	((Class137_Sub2) this).aClass688_8976.method8031
	    (new Class528_Sub14(((Class137_Sub2) this).aClass173_Sub1_8980,
				this, class528_sub12, is),
	     (byte) 18);
    }
    
    void method8347() {
	((Class137_Sub2) this).anInterface36_8979
	    = ((Class137_Sub2) this).aClass173_Sub1_8980.method8549(false);
	((Class137_Sub2) this).anInterface36_8979
	    .method258(((Class137_Sub2) this).anInt8964 * 4, 4);
	((Class137_Sub2) this).anInterface36_8979.method197
	    (0, ((Class137_Sub2) this).anInt8964 * 4,
	     ((Class137_Sub2) this).aClass173_Sub1_8980
		 .method8453(((Class137_Sub2) this).aByteBuffer8990));
	((Class137_Sub2) this).anInterface36_8978
	    = ((Class137_Sub2) this).aClass173_Sub1_8980.method8549(false);
	((Class137_Sub2) this).anInterface36_8978.method258
	    ((((Class137_Sub2) this).anInt8964
	      * ((Class137_Sub2) this).anInt8957),
	     ((Class137_Sub2) this).anInt8957);
	((Class137_Sub2) this).anInterface36_8978.method197
	    (0,
	     (((Class137_Sub2) this).anInt8964
	      * ((Class137_Sub2) this).anInt8957),
	     ((Class137_Sub2) this).aClass173_Sub1_8980
		 .method8453(((Class137_Sub2) this).aByteBuffer8991));
	((Class137_Sub2) this).aByteBuffer8990.clear();
	((Class137_Sub2) this).aByteBuffer8990 = null;
	((Class137_Sub2) this).aByteBuffer8991.clear();
	((Class137_Sub2) this).aByteBuffer8991 = null;
	if ((((Class137_Sub2) this).anInt8961 & 0x7) != 0) {
	    if (((Class137_Sub2) this).anIntArrayArrayArray8973 != null)
		((Class137_Sub2) this).aClass344_8960
		    = (((Class137_Sub2) this).aClass173_Sub1_8980.method8543
		       (new Class345[]
			{ new Class345(new Class331[]
				       { Class331.aClass331_3521,
					 Class331.aClass331_3518,
					 Class331.aClass331_3517,
					 Class331.aClass331_3515 }),
			  new Class345(Class331.aClass331_3531) }));
	    else
		((Class137_Sub2) this).aClass344_8960
		    = (((Class137_Sub2) this).aClass173_Sub1_8980.method8543
		       (new Class345[]
			{ new Class345(new Class331[]
				       { Class331.aClass331_3521,
					 Class331.aClass331_3518,
					 Class331.aClass331_3515 }),
			  new Class345(Class331.aClass331_3531) }));
	} else if (((Class137_Sub2) this).anIntArrayArrayArray8973 != null)
	    ((Class137_Sub2) this).aClass344_8960
		= (((Class137_Sub2) this).aClass173_Sub1_8980.method8543
		   (new Class345[]
		    { new Class345(new Class331[] { Class331.aClass331_3521,
						    Class331.aClass331_3518,
						    Class331.aClass331_3517 }),
		      new Class345(Class331.aClass331_3531) }));
	else
	    ((Class137_Sub2) this).aClass344_8960
		= (((Class137_Sub2) this).aClass173_Sub1_8980.method8543
		   (new Class345[]
		    { new Class345(new Class331[] { Class331.aClass331_3521,
						    Class331.aClass331_3518 }),
		      new Class345(Class331.aClass331_3531) }));
	for (int i = 0; i < ((Class137_Sub2) this).anInt8981; i++) {
	    Class528_Sub26 class528_sub26
		= ((Class528_Sub26)
		   ((Class137_Sub2) this).aClass528Array8993[i]);
	    class528_sub26.method9450(((Class137_Sub2) this).anInt8964);
	}
	if (((Class137_Sub2) this).aClass334_8992 != null)
	    ((Class137_Sub2) this).aClass334_8992.method4352();
	method8343();
    }
    
    void method8348() {
	((Class137_Sub2) this).anInterface36_8979
	    = ((Class137_Sub2) this).aClass173_Sub1_8980.method8549(false);
	((Class137_Sub2) this).anInterface36_8979
	    .method258(((Class137_Sub2) this).anInt8964 * 4, 4);
	((Class137_Sub2) this).anInterface36_8979.method197
	    (0, ((Class137_Sub2) this).anInt8964 * 4,
	     ((Class137_Sub2) this).aClass173_Sub1_8980
		 .method8453(((Class137_Sub2) this).aByteBuffer8990));
	((Class137_Sub2) this).anInterface36_8978
	    = ((Class137_Sub2) this).aClass173_Sub1_8980.method8549(false);
	((Class137_Sub2) this).anInterface36_8978.method258
	    ((((Class137_Sub2) this).anInt8964
	      * ((Class137_Sub2) this).anInt8957),
	     ((Class137_Sub2) this).anInt8957);
	((Class137_Sub2) this).anInterface36_8978.method197
	    (0,
	     (((Class137_Sub2) this).anInt8964
	      * ((Class137_Sub2) this).anInt8957),
	     ((Class137_Sub2) this).aClass173_Sub1_8980
		 .method8453(((Class137_Sub2) this).aByteBuffer8991));
	((Class137_Sub2) this).aByteBuffer8990.clear();
	((Class137_Sub2) this).aByteBuffer8990 = null;
	((Class137_Sub2) this).aByteBuffer8991.clear();
	((Class137_Sub2) this).aByteBuffer8991 = null;
	if ((((Class137_Sub2) this).anInt8961 & 0x7) != 0) {
	    if (((Class137_Sub2) this).anIntArrayArrayArray8973 != null)
		((Class137_Sub2) this).aClass344_8960
		    = (((Class137_Sub2) this).aClass173_Sub1_8980.method8543
		       (new Class345[]
			{ new Class345(new Class331[]
				       { Class331.aClass331_3521,
					 Class331.aClass331_3518,
					 Class331.aClass331_3517,
					 Class331.aClass331_3515 }),
			  new Class345(Class331.aClass331_3531) }));
	    else
		((Class137_Sub2) this).aClass344_8960
		    = (((Class137_Sub2) this).aClass173_Sub1_8980.method8543
		       (new Class345[]
			{ new Class345(new Class331[]
				       { Class331.aClass331_3521,
					 Class331.aClass331_3518,
					 Class331.aClass331_3515 }),
			  new Class345(Class331.aClass331_3531) }));
	} else if (((Class137_Sub2) this).anIntArrayArrayArray8973 != null)
	    ((Class137_Sub2) this).aClass344_8960
		= (((Class137_Sub2) this).aClass173_Sub1_8980.method8543
		   (new Class345[]
		    { new Class345(new Class331[] { Class331.aClass331_3521,
						    Class331.aClass331_3518,
						    Class331.aClass331_3517 }),
		      new Class345(Class331.aClass331_3531) }));
	else
	    ((Class137_Sub2) this).aClass344_8960
		= (((Class137_Sub2) this).aClass173_Sub1_8980.method8543
		   (new Class345[]
		    { new Class345(new Class331[] { Class331.aClass331_3521,
						    Class331.aClass331_3518 }),
		      new Class345(Class331.aClass331_3531) }));
	for (int i = 0; i < ((Class137_Sub2) this).anInt8981; i++) {
	    Class528_Sub26 class528_sub26
		= ((Class528_Sub26)
		   ((Class137_Sub2) this).aClass528Array8993[i]);
	    class528_sub26.method9450(((Class137_Sub2) this).anInt8964);
	}
	if (((Class137_Sub2) this).aClass334_8992 != null)
	    ((Class137_Sub2) this).aClass334_8992.method4352();
	method8343();
    }
    
    void method8349() {
	if ((((Class137_Sub2) this).anInt8963 & 0x2) == 0) {
	    ((Class137_Sub2) this).anIntArrayArrayArray8989 = null;
	    ((Class137_Sub2) this).anIntArrayArrayArray8970 = null;
	    ((Class137_Sub2) this).anIntArrayArrayArray8968 = null;
	}
	((Class137_Sub2) this).anIntArrayArrayArray8973 = null;
	((Class137_Sub2) this).anIntArrayArrayArray8969 = null;
	((Class137_Sub2) this).anIntArrayArrayArray8972 = null;
	((Class137_Sub2) this).aClass528_Sub26ArrayArrayArray8962 = null;
	((Class137_Sub2) this).aByteArrayArray8988 = null;
	((Class137_Sub2) this).aClass692_8987 = null;
	((Class137_Sub2) this).aClass528Array8993 = null;
	((Class137_Sub2) this).aFloatArrayArray8986 = null;
	((Class137_Sub2) this).aFloatArrayArray8985 = null;
	((Class137_Sub2) this).aFloatArrayArray8955 = null;
    }
    
    public void method1651(int i, int i_378_, int i_379_) {
	i = Math.min(((Class137_Sub2) this).aByteArrayArray8988.length - 1,
		     Math.max(0, i));
	i_378_ = Math.min((((Class137_Sub2) this).aByteArrayArray8988[i].length
			   - 1),
			  Math.max(0, i_378_));
	if ((((Class137_Sub2) this).aByteArrayArray8988[i][i_378_] & 0xff)
	    < i_379_)
	    ((Class137_Sub2) this).aByteArrayArray8988[i][i_378_]
		= (byte) i_379_;
    }
    
    public Class528_Sub21_Sub12 method1674
	(int i, int i_380_, Class528_Sub21_Sub12 class528_sub21_sub12) {
	if ((((Class137_Sub2) this).aByteArrayArray8974[i][i_380_] & 0x1) == 0)
	    return null;
	int i_381_
	    = (anInt1628 * 2130003981
	       >> (((Class173_Sub1) ((Class137_Sub2) this).aClass173_Sub1_8980)
		   .anInt9305));
	Class528_Sub21_Sub12_Sub1 class528_sub21_sub12_sub1
	    = (Class528_Sub21_Sub12_Sub1) class528_sub21_sub12;
	Class528_Sub21_Sub12_Sub1 class528_sub21_sub12_sub1_382_;
	if (class528_sub21_sub12_sub1 != null
	    && class528_sub21_sub12_sub1.method10823(i_381_, i_381_)) {
	    class528_sub21_sub12_sub1_382_ = class528_sub21_sub12_sub1;
	    class528_sub21_sub12_sub1_382_.method10824();
	} else
	    class528_sub21_sub12_sub1_382_
		= new Class528_Sub21_Sub12_Sub1((((Class137_Sub2) this)
						 .aClass173_Sub1_8980),
						i_381_, i_381_);
	class528_sub21_sub12_sub1_382_.method10829(0, 0, i_381_, i_381_);
	method8345(class528_sub21_sub12_sub1_382_, i, i_380_);
	return class528_sub21_sub12_sub1_382_;
    }
    
    public void method1666(int i, int i_383_, int i_384_) {
	i = Math.min(((Class137_Sub2) this).aByteArrayArray8988.length - 1,
		     Math.max(0, i));
	i_383_ = Math.min((((Class137_Sub2) this).aByteArrayArray8988[i].length
			   - 1),
			  Math.max(0, i_383_));
	if ((((Class137_Sub2) this).aByteArrayArray8988[i][i_383_] & 0xff)
	    < i_384_)
	    ((Class137_Sub2) this).aByteArrayArray8988[i][i_383_]
		= (byte) i_384_;
    }
}
