/* Class137_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;

import jaggl.OpenGL;

public class Class137_Sub3 extends Class137
{
    byte[][] aByteArrayArray8997;
    int[][][] anIntArrayArrayArray8998;
    Class173_Sub2 aClass173_Sub2_8999;
    int anInt9000;
    int anInt9001;
    int[][][] anIntArrayArrayArray9002;
    int anInt9003;
    int anInt9004;
    static final int anInt9005 = 1;
    short[][] aShortArrayArray9006;
    Node[] aClass528Array9007;
    int[][][] anIntArrayArrayArray9008;
    int[][][] anIntArrayArrayArray9009;
    Class122 aClass122_9010;
    Class528_Sub10[][][] aClass528_Sub10ArrayArrayArray9011;
    int[][][] anIntArrayArrayArray9012;
    int[][][] anIntArrayArrayArray9013;
    Interface14 anInterface14_9014;
    Class155 aClass155_9015;
    static float[] aFloatArray9016 = new float[16];
    Class688 aClass688_9017 = new Class688();
    static final int anInt9018 = 74;
    Class122 aClass122_9019;
    int anInt9020;
    float[][] aFloatArrayArray9021;
    Class122 aClass122_9022;
    int anInt9023;
    int anInt9024;
    byte[][] aByteArrayArray9025;
    int anInt9026;
    float[][] aFloatArrayArray9027;
    float[][] aFloatArrayArray9028;
    Class692 aClass692_9029;
    Class122 aClass122_9030;
    
    public void method1689(Class528_Sub21_Sub12 class528_sub21_sub12, int i,
			   int i_0_, int i_1_, int i_2_, boolean bool) {
	if (((Class137_Sub3) this).aClass155_9015 != null
	    && class528_sub21_sub12 != null) {
	    int i_3_ = (i - (i_0_ * (((Class173_Sub2) (((Class137_Sub3) this)
						       .aClass173_Sub2_8999))
				     .anInt9508)
			     >> 8)
			>> ((Class173_Sub2) (((Class137_Sub3) this)
					     .aClass173_Sub2_8999)).anInt9438);
	    int i_4_
		= (i_1_ - (i_0_ * (((Class173_Sub2)
				    ((Class137_Sub3) this).aClass173_Sub2_8999)
				   .anInt9462)
			   >> 8)
		   >> ((Class173_Sub2)
		       ((Class137_Sub3) this).aClass173_Sub2_8999).anInt9438);
	    ((Class137_Sub3) this).aClass155_9015
		.method1840(class528_sub21_sub12, i_3_, i_4_);
	}
    }
    
    public void method1651(int i, int i_5_, int i_6_) {
	i = Math.min(((Class137_Sub3) this).aByteArrayArray9025.length - 1,
		     Math.max(0, i));
	i_5_ = Math.min((((Class137_Sub3) this).aByteArrayArray9025[i].length
			 - 1),
			Math.max(0, i_5_));
	if ((((Class137_Sub3) this).aByteArrayArray9025[i][i_5_] & 0xff)
	    < i_6_)
	    ((Class137_Sub3) this).aByteArrayArray9025[i][i_5_] = (byte) i_6_;
    }
    
    public void method1686(int i, int i_7_, int[] is, int[] is_8_, int[] is_9_,
			   int[] is_10_, int[] is_11_, int[] is_12_,
			   int[] is_13_, int[] is_14_, Class164 class164,
			   boolean bool) {
	Class165 class165
	    = ((Class137_Sub3) this).aClass173_Sub2_8999.aClass165_1984;
	if (is_10_ != null
	    && ((Class137_Sub3) this).anIntArrayArrayArray9013 == null)
	    ((Class137_Sub3) this).anIntArrayArrayArray9013
		= new int[anInt1627 * -657933437][anInt1626 * 1769495707][];
	if (is_8_ != null
	    && ((Class137_Sub3) this).anIntArrayArrayArray9012 == null)
	    ((Class137_Sub3) this).anIntArrayArrayArray9012
		= new int[anInt1627 * -657933437][anInt1626 * 1769495707][];
	((Class137_Sub3) this).anIntArrayArrayArray8998[i][i_7_] = is;
	((Class137_Sub3) this).anIntArrayArrayArray9002[i][i_7_] = is_9_;
	((Class137_Sub3) this).anIntArrayArrayArray9008[i][i_7_] = is_11_;
	((Class137_Sub3) this).anIntArrayArrayArray9009[i][i_7_] = is_12_;
	if (((Class137_Sub3) this).anIntArrayArrayArray9013 != null)
	    ((Class137_Sub3) this).anIntArrayArrayArray9013[i][i_7_] = is_10_;
	if (((Class137_Sub3) this).anIntArrayArrayArray9012 != null)
	    ((Class137_Sub3) this).anIntArrayArrayArray9012[i][i_7_] = is_8_;
	Class528_Sub10[] class528_sub10s
	    = (((Class137_Sub3) this).aClass528_Sub10ArrayArrayArray9011[i]
		   [i_7_]
	       = new Class528_Sub10[is_11_.length]);
	for (int i_15_ = 0; i_15_ < is_11_.length; i_15_++) {
	    int i_16_ = is_13_[i_15_];
	    int i_17_ = is_14_[i_15_];
	    if ((((Class137_Sub3) this).anInt9003 & 0x20) != 0 && i_16_ != -1
		&& class165.method2093(i_16_, (byte) -48).aBool1800) {
		i_17_ = 128;
		i_16_ = -1;
	    }
	    long l = ((long) (class164.anInt1829 * 1802884547) << 48
		      | (long) (class164.anInt1828 * -386339441) << 42
		      | (long) (class164.anInt1827 * -222719641) << 28
		      | (long) (i_17_ << 14) | (long) i_16_);
	    Node node;
	    for (node
		     = ((Class137_Sub3) this).aClass692_9029.method8137(l);
		 node != null;
		 node = ((Class137_Sub3) this).aClass692_9029
				.method8143((short) 255)) {
		Class528_Sub10 class528_sub10 = (Class528_Sub10) node;
		if (((Class528_Sub10) class528_sub10).anInt10293 == i_16_
		    && (((Class528_Sub10) class528_sub10).aFloat10295
			== (float) i_17_)
		    && ((Class528_Sub10) class528_sub10).aClass164_10299
			   .method2085(class164, (short) 30749))
		    break;
	    }
	    if (node == null) {
		class528_sub10s[i_15_]
		    = new Class528_Sub10(this, i_16_, i_17_, class164);
		((Class137_Sub3) this).aClass692_9029
		    .method8142(class528_sub10s[i_15_], l);
	    } else
		class528_sub10s[i_15_] = (Class528_Sub10) node;
	}
	if (bool)
	    ((Class137_Sub3) this).aByteArrayArray8997[i][i_7_] |= 0x1;
	if (is_11_.length > ((Class137_Sub3) this).anInt9024)
	    ((Class137_Sub3) this).anInt9024 = is_11_.length;
	((Class137_Sub3) this).anInt9023 += is_11_.length;
    }
    
    public void method1652
	(int i, int i_18_, int[] is, int[] is_19_, int[] is_20_, int[] is_21_,
	 int[] is_22_, int[] is_23_, int[] is_24_, int[] is_25_, int[] is_26_,
	 int[] is_27_, int[] is_28_, Class164 class164, boolean bool) {
	int i_29_ = is_25_.length;
	int[] is_30_ = new int[i_29_ * 3];
	int[] is_31_ = new int[i_29_ * 3];
	int[] is_32_ = new int[i_29_ * 3];
	int[] is_33_ = is_26_ != null ? new int[i_29_ * 3] : null;
	int[] is_34_ = new int[i_29_ * 3];
	int[] is_35_ = new int[i_29_ * 3];
	int[] is_36_ = is_19_ != null ? new int[i_29_ * 3] : null;
	int[] is_37_ = is_21_ != null ? new int[i_29_ * 3] : null;
	int i_38_ = 0;
	for (int i_39_ = 0; i_39_ < i_29_; i_39_++) {
	    int i_40_ = is_22_[i_39_];
	    int i_41_ = is_23_[i_39_];
	    int i_42_ = is_24_[i_39_];
	    is_30_[i_38_] = is[i_40_];
	    is_31_[i_38_] = is_20_[i_40_];
	    is_32_[i_38_] = is_25_[i_39_];
	    is_34_[i_38_] = is_27_[i_39_];
	    is_35_[i_38_] = is_28_[i_39_];
	    if (is_26_ != null)
		is_33_[i_38_] = is_26_[i_39_];
	    if (is_19_ != null)
		is_36_[i_38_] = is_19_[i_40_];
	    if (is_21_ != null)
		is_37_[i_38_] = is_21_[i_40_];
	    i_38_++;
	    is_30_[i_38_] = is[i_41_];
	    is_31_[i_38_] = is_20_[i_41_];
	    is_32_[i_38_] = is_25_[i_39_];
	    is_34_[i_38_] = is_27_[i_39_];
	    is_35_[i_38_] = is_28_[i_39_];
	    if (is_26_ != null)
		is_33_[i_38_] = is_26_[i_39_];
	    if (is_19_ != null)
		is_36_[i_38_] = is_19_[i_41_];
	    if (is_21_ != null)
		is_37_[i_38_] = is_21_[i_41_];
	    i_38_++;
	    is_30_[i_38_] = is[i_42_];
	    is_31_[i_38_] = is_20_[i_42_];
	    is_32_[i_38_] = is_25_[i_39_];
	    is_34_[i_38_] = is_27_[i_39_];
	    is_35_[i_38_] = is_28_[i_39_];
	    if (is_26_ != null)
		is_33_[i_38_] = is_26_[i_39_];
	    if (is_19_ != null)
		is_36_[i_38_] = is_19_[i_42_];
	    if (is_21_ != null)
		is_37_[i_38_] = is_21_[i_42_];
	    i_38_++;
	}
	method1686(i, i_18_, is_30_, is_36_, is_31_, is_37_, is_32_, is_33_,
		   is_34_, is_35_, class164, bool);
    }
    
    public void method1653() {
	if (((Class137_Sub3) this).anInt9023 > 0) {
	    byte[][] is = (new byte[anInt1627 * -657933437 + 1]
			   [anInt1626 * 1769495707 + 1]);
	    for (int i = 1; i < anInt1627 * -657933437; i++) {
		for (int i_43_ = 1; i_43_ < anInt1626 * 1769495707; i_43_++)
		    is[i][i_43_]
			= (byte) (((((Class137_Sub3) this).aByteArrayArray9025
				    [i - 1][i_43_])
				   >> 2)
				  + ((((Class137_Sub3) this)
				      .aByteArrayArray9025[i + 1][i_43_])
				     >> 3)
				  + ((((Class137_Sub3) this)
				      .aByteArrayArray9025[i][i_43_ - 1])
				     >> 2)
				  + ((((Class137_Sub3) this)
				      .aByteArrayArray9025[i][i_43_ + 1])
				     >> 3)
				  + ((((Class137_Sub3) this)
				      .aByteArrayArray9025[i][i_43_])
				     >> 1));
	    }
	    ((Class137_Sub3) this).aClass528Array9007
		= new Node[((Class137_Sub3) this).aClass692_9029
				   .method8139((short) 1369)];
	    ((Class137_Sub3) this).aClass692_9029.method8136
		(((Class137_Sub3) this).aClass528Array9007, -1135270402);
	    for (int i = 0;
		 i < ((Class137_Sub3) this).aClass528Array9007.length; i++)
		((Class528_Sub10) ((Class137_Sub3) this).aClass528Array9007[i])
		    .method9333(((Class137_Sub3) this).anInt9023);
	    int i = 24;
	    if (((Class137_Sub3) this).anIntArrayArrayArray9013 != null)
		i += 4;
	    if ((((Class137_Sub3) this).anInt9003 & 0x7) != 0)
		i += 12;
	    NativeHeapBuffer nativeheapbuffer
		= ((Class173_Sub2) ((Class137_Sub3) this).aClass173_Sub2_8999)
		      .aNativeHeap9459
		      .method1342(((Class137_Sub3) this).anInt9023 * i, false);
	    Stream stream = new Stream(nativeheapbuffer);
	    Class528_Sub10[] class528_sub10s
		= new Class528_Sub10[((Class137_Sub3) this).anInt9023];
	    int i_44_ = ItemStyleOverride.method531(((Class137_Sub3) this).anInt9023 / 4,
					 850580958);
	    if (i_44_ < 1)
		i_44_ = 1;
	    Class692 class692 = new Class692(i_44_);
	    Class528_Sub10[] class528_sub10s_45_
		= new Class528_Sub10[((Class137_Sub3) this).anInt9024];
	    for (int i_46_ = 0; i_46_ < anInt1627 * -657933437; i_46_++) {
		for (int i_47_ = 0; i_47_ < anInt1626 * 1769495707; i_47_++) {
		    if ((((Class137_Sub3) this).anIntArrayArrayArray9008[i_46_]
			 [i_47_])
			!= null) {
			Class528_Sub10[] class528_sub10s_48_
			    = (((Class137_Sub3) this)
			       .aClass528_Sub10ArrayArrayArray9011[i_46_]
			       [i_47_]);
			int[] is_49_
			    = (((Class137_Sub3) this).anIntArrayArrayArray8998
			       [i_46_][i_47_]);
			int[] is_50_
			    = (((Class137_Sub3) this).anIntArrayArrayArray9002
			       [i_46_][i_47_]);
			int[] is_51_
			    = (((Class137_Sub3) this).anIntArrayArrayArray9009
			       [i_46_][i_47_]);
			int[] is_52_
			    = (((Class137_Sub3) this).anIntArrayArrayArray9008
			       [i_46_][i_47_]);
			int[] is_53_
			    = ((((Class137_Sub3) this).anIntArrayArrayArray9012
				!= null)
			       ? (((Class137_Sub3) this)
				  .anIntArrayArrayArray9012[i_46_][i_47_])
			       : null);
			int[] is_54_
			    = ((((Class137_Sub3) this).anIntArrayArrayArray9013
				!= null)
			       ? (((Class137_Sub3) this)
				  .anIntArrayArrayArray9013[i_46_][i_47_])
			       : null);
			if (is_51_ == null)
			    is_51_ = is_52_;
			float f = (((Class137_Sub3) this).aFloatArrayArray9021
				   [i_46_][i_47_]);
			float f_55_ = (((Class137_Sub3) this)
				       .aFloatArrayArray9027[i_46_][i_47_]);
			float f_56_ = (((Class137_Sub3) this)
				       .aFloatArrayArray9028[i_46_][i_47_]);
			float f_57_
			    = (((Class137_Sub3) this).aFloatArrayArray9021
			       [i_46_][i_47_ + 1]);
			float f_58_
			    = (((Class137_Sub3) this).aFloatArrayArray9027
			       [i_46_][i_47_ + 1]);
			float f_59_
			    = (((Class137_Sub3) this).aFloatArrayArray9028
			       [i_46_][i_47_ + 1]);
			float f_60_
			    = (((Class137_Sub3) this).aFloatArrayArray9021
			       [i_46_ + 1][i_47_ + 1]);
			float f_61_
			    = (((Class137_Sub3) this).aFloatArrayArray9027
			       [i_46_ + 1][i_47_ + 1]);
			float f_62_
			    = (((Class137_Sub3) this).aFloatArrayArray9028
			       [i_46_ + 1][i_47_ + 1]);
			float f_63_
			    = (((Class137_Sub3) this).aFloatArrayArray9021
			       [i_46_ + 1][i_47_]);
			float f_64_
			    = (((Class137_Sub3) this).aFloatArrayArray9027
			       [i_46_ + 1][i_47_]);
			float f_65_
			    = (((Class137_Sub3) this).aFloatArrayArray9028
			       [i_46_ + 1][i_47_]);
			int i_66_ = is[i_46_][i_47_] & 0xff;
			int i_67_ = is[i_46_][i_47_ + 1] & 0xff;
			int i_68_ = is[i_46_ + 1][i_47_ + 1] & 0xff;
			int i_69_ = is[i_46_ + 1][i_47_] & 0xff;
			int i_70_ = 0;
		    while_42_:
			for (int i_71_ = 0; i_71_ < is_52_.length; i_71_++) {
			    Class528_Sub10 class528_sub10
				= class528_sub10s_48_[i_71_];
			    for (int i_72_ = 0; i_72_ < i_70_; i_72_++) {
				if (class528_sub10s_45_[i_72_]
				    == class528_sub10)
				    continue while_42_;
			    }
			    class528_sub10s_45_[i_70_++] = class528_sub10;
			}
			short[] is_73_
			    = (((Class137_Sub3) this).aShortArrayArray9006
				   [i_47_ * (anInt1627 * -657933437) + i_46_]
			       = new short[is_52_.length]);
			for (int i_74_ = 0; i_74_ < is_52_.length; i_74_++) {
			    int i_75_ = ((i_46_ << anInt1625 * 1543345989)
					 + is_49_[i_74_]);
			    int i_76_ = ((i_47_ << anInt1625 * 1543345989)
					 + is_50_[i_74_]);
			    int i_77_
				= i_75_ >> ((Class137_Sub3) this).anInt9000;
			    int i_78_
				= i_76_ >> ((Class137_Sub3) this).anInt9000;
			    int i_79_ = is_52_[i_74_];
			    int i_80_ = is_51_[i_74_];
			    int i_81_ = is_53_ != null ? is_53_[i_74_] : 0;
			    long l = ((long) i_80_ << 48 | (long) i_79_ << 32
				      | (long) (i_77_ << 16) | (long) i_78_);
			    int i_82_ = is_49_[i_74_];
			    int i_83_ = is_50_[i_74_];
			    int i_84_ = 74;
			    int i_85_ = 0;
			    float f_86_ = 1.0F;
			    float f_87_;
			    float f_88_;
			    float f_89_;
			    if (i_82_ == 0 && i_83_ == 0) {
				f_87_ = f;
				f_88_ = f_55_;
				f_89_ = f_56_;
				i_84_ -= i_66_;
			    } else if (i_82_ == 0
				       && i_83_ == anInt1628 * 2130003981) {
				f_87_ = f_57_;
				f_88_ = f_58_;
				f_89_ = f_59_;
				i_84_ -= i_67_;
			    } else if (i_82_ == anInt1628 * 2130003981
				       && i_83_ == anInt1628 * 2130003981) {
				f_87_ = f_60_;
				f_88_ = f_61_;
				f_89_ = f_62_;
				i_84_ -= i_68_;
			    } else if (i_82_ == anInt1628 * 2130003981
				       && i_83_ == 0) {
				f_87_ = f_63_;
				f_88_ = f_64_;
				f_89_ = f_65_;
				i_84_ -= i_69_;
			    } else {
				float f_90_
				    = ((float) i_82_
				       / (float) (anInt1628 * 2130003981));
				float f_91_
				    = ((float) i_83_
				       / (float) (anInt1628 * 2130003981));
				float f_92_ = f + (f_63_ - f) * f_90_;
				float f_93_ = f_55_ + (f_64_ - f_55_) * f_90_;
				float f_94_ = f_56_ + (f_65_ - f_56_) * f_90_;
				float f_95_ = f_57_ + (f_60_ - f_57_) * f_90_;
				float f_96_ = f_58_ + (f_61_ - f_58_) * f_90_;
				float f_97_ = f_59_ + (f_62_ - f_59_) * f_90_;
				f_87_ = f_92_ + (f_95_ - f_92_) * f_91_;
				f_88_ = f_93_ + (f_96_ - f_93_) * f_91_;
				f_89_ = f_94_ + (f_97_ - f_94_) * f_91_;
				int i_98_
				    = i_66_ + ((i_69_ - i_66_) * i_82_
					       >> anInt1625 * 1543345989);
				int i_99_
				    = i_67_ + ((i_68_ - i_67_) * i_82_
					       >> anInt1625 * 1543345989);
				i_84_ -= i_98_ + ((i_99_ - i_98_) * i_83_
						  >> anInt1625 * 1543345989);
			    }
			    if (i_79_ != -1) {
				int i_100_ = (i_79_ & 0x7f) * i_84_ >> 7;
				if (i_100_ < 2)
				    i_100_ = 2;
				else if (i_100_ > 126)
				    i_100_ = 126;
				i_85_ = (Class649.anIntArray8420
					 [i_79_ & 0xff80 | i_100_]);
				if ((((Class137_Sub3) this).anInt9003 & 0x7)
				    == 0) {
				    f_86_ = ((((Class173_Sub2)
					       (((Class137_Sub3) this)
						.aClass173_Sub2_8999))
					      .aFloatArray9521[0]) * f_87_
					     + (((Class173_Sub2)
						 (((Class137_Sub3) this)
						  .aClass173_Sub2_8999))
						.aFloatArray9521[1]) * f_88_
					     + (((Class173_Sub2)
						 (((Class137_Sub3) this)
						  .aClass173_Sub2_8999))
						.aFloatArray9521[2]) * f_89_);
				    f_86_
					= (((Class173_Sub2)
					    (((Class137_Sub3) this)
					     .aClass173_Sub2_8999)).aFloat9527
					   + (f_86_
					      * (f_86_ > 0.0F
						 ? (((Class173_Sub2)
						     (((Class137_Sub3) this)
						      .aClass173_Sub2_8999))
						    .aFloat9484)
						 : (((Class173_Sub2)
						     (((Class137_Sub3) this)
						      .aClass173_Sub2_8999))
						    .aFloat9464))));
				}
			    }
			    Node node = null;
			    if (((i_75_ & ((Class137_Sub3) this).anInt9001 - 1)
				 == 0)
				&& ((i_76_
				     & ((Class137_Sub3) this).anInt9001 - 1)
				    == 0))
				node = class692.method8137(l);
			    int i_101_;
			    if (node == null) {
				int i_102_;
				if (i_80_ != i_79_) {
				    int i_103_ = (i_80_ & 0x7f) * i_84_ >> 7;
				    if (i_103_ < 2)
					i_103_ = 2;
				    else if (i_103_ > 126)
					i_103_ = 126;
				    i_102_ = (Class649.anIntArray8420
					      [i_80_ & 0xff80 | i_103_]);
				    if ((((Class137_Sub3) this).anInt9003
					 & 0x7)
					== 0) {
					float f_104_
					    = ((((Class173_Sub2)
						 (((Class137_Sub3) this)
						  .aClass173_Sub2_8999))
						.aFloatArray9521[0]) * f_87_
					       + (((Class173_Sub2)
						   (((Class137_Sub3) this)
						    .aClass173_Sub2_8999))
						  .aFloatArray9521[1]) * f_88_
					       + ((((Class173_Sub2)
						    (((Class137_Sub3) this)
						     .aClass173_Sub2_8999))
						   .aFloatArray9521[2])
						  * f_89_));
					f_104_
					    = ((((Class173_Sub2)
						 (((Class137_Sub3) this)
						  .aClass173_Sub2_8999))
						.aFloat9527)
					       + (f_86_
						  * (f_86_ > 0.0F
						     ? (((Class173_Sub2)
							 (((Class137_Sub3)
							   this)
							  .aClass173_Sub2_8999))
							.aFloat9484)
						     : (((Class173_Sub2)
							 (((Class137_Sub3)
							   this)
							  .aClass173_Sub2_8999))
							.aFloat9464))));
					int i_105_ = i_102_ >> 16 & 0xff;
					int i_106_ = i_102_ >> 8 & 0xff;
					int i_107_ = i_102_ & 0xff;
					i_105_ *= f_104_;
					if (i_105_ < 0)
					    i_105_ = 0;
					else if (i_105_ > 255)
					    i_105_ = 255;
					i_106_ *= f_104_;
					if (i_106_ < 0)
					    i_106_ = 0;
					else if (i_106_ > 255)
					    i_106_ = 255;
					i_107_ *= f_104_;
					if (i_107_ < 0)
					    i_107_ = 0;
					else if (i_107_ > 255)
					    i_107_ = 255;
					i_102_ = (i_105_ << 16 | i_106_ << 8
						  | i_107_);
				    }
				} else
				    i_102_ = i_85_;
				if (((Class173_Sub2) (((Class137_Sub3) this)
						      .aClass173_Sub2_8999))
				    .aBool9561) {
				    stream.method1187((float) i_75_);
				    stream.method1187
					((float) (method1656(i_75_, i_76_,
							     1844012289)
						  + i_81_));
				    stream.method1187((float) i_76_);
				    stream.method1186((byte) (i_102_ >> 16));
				    stream.method1186((byte) (i_102_ >> 8));
				    stream.method1186((byte) i_102_);
				    stream.method1186(-1);
				    stream.method1187((float) i_75_);
				    stream.method1187((float) i_76_);
				    if ((((Class137_Sub3) this)
					 .anIntArrayArrayArray9013)
					!= null)
					stream.method1187(is_54_ != null
							  ? (float) ((is_54_
								      [i_74_])
								     - 1)
							  : 0.0F);
				    if ((((Class137_Sub3) this).anInt9003
					 & 0x7)
					!= 0) {
					stream.method1187(f_87_);
					stream.method1187(f_88_);
					stream.method1187(f_89_);
				    }
				} else {
				    stream.method1188((float) i_75_);
				    stream.method1188
					((float) (method1656(i_75_, i_76_,
							     1662969497)
						  + i_81_));
				    stream.method1188((float) i_76_);
				    stream.method1186((byte) (i_102_ >> 16));
				    stream.method1186((byte) (i_102_ >> 8));
				    stream.method1186((byte) i_102_);
				    stream.method1186(-1);
				    stream.method1188((float) i_75_);
				    stream.method1188((float) i_76_);
				    if ((((Class137_Sub3) this)
					 .anIntArrayArrayArray9013)
					!= null)
					stream.method1188(is_54_ != null
							  ? (float) ((is_54_
								      [i_74_])
								     - 1)
							  : 0.0F);
				    if ((((Class137_Sub3) this).anInt9003
					 & 0x7)
					!= 0) {
					stream.method1188(f_87_);
					stream.method1188(f_88_);
					stream.method1188(f_89_);
				    }
				}
				i_101_ = ((Class137_Sub3) this).anInt9004++;
				is_73_[i_74_] = (short) i_101_;
				if (i_79_ != -1)
				    class528_sub10s[i_101_]
					= class528_sub10s_48_[i_74_];
				class692.method8142
				    (new Class528_Sub18(is_73_[i_74_]), l);
			    } else {
				is_73_[i_74_]
				    = ((Class528_Sub18) node).aShort10389;
				i_101_ = is_73_[i_74_] & 0xffff;
				if (i_79_ != -1
				    && ((class528_sub10s_48_[i_74_].aLong7107
					 * -4849232331708333273L)
					< (class528_sub10s[i_101_].aLong7107
					   * -4849232331708333273L)))
				    class528_sub10s[i_101_]
					= class528_sub10s_48_[i_74_];
			    }
			    for (int i_108_ = 0; i_108_ < i_70_; i_108_++)
				class528_sub10s_45_[i_108_]
				    .method9336(i_101_, i_85_, i_84_, f_86_);
			    ((Class137_Sub3) this).anInt9020++;
			}
		    }
		}
	    }
	    for (int i_109_ = 0; i_109_ < ((Class137_Sub3) this).anInt9004;
		 i_109_++) {
		Class528_Sub10 class528_sub10 = class528_sub10s[i_109_];
		if (class528_sub10 != null)
		    class528_sub10.method9339(i_109_);
	    }
	    for (int i_110_ = 0; i_110_ < anInt1627 * -657933437; i_110_++) {
		for (int i_111_ = 0; i_111_ < anInt1626 * 1769495707;
		     i_111_++) {
		    short[] is_112_
			= (((Class137_Sub3) this).aShortArrayArray9006
			   [i_111_ * (anInt1627 * -657933437) + i_110_]);
		    if (is_112_ != null) {
			int i_113_ = 0;
			int i_114_ = 0;
			while (i_114_ < is_112_.length) {
			    int i_115_ = is_112_[i_114_++] & 0xffff;
			    int i_116_ = is_112_[i_114_++] & 0xffff;
			    int i_117_ = is_112_[i_114_++] & 0xffff;
			    Class528_Sub10 class528_sub10
				= class528_sub10s[i_115_];
			    Class528_Sub10 class528_sub10_118_
				= class528_sub10s[i_116_];
			    Class528_Sub10 class528_sub10_119_
				= class528_sub10s[i_117_];
			    Class528_Sub10 class528_sub10_120_ = null;
			    if (class528_sub10 != null) {
				class528_sub10.method9335(i_110_, i_111_,
							  i_113_);
				class528_sub10_120_ = class528_sub10;
			    }
			    if (class528_sub10_118_ != null) {
				class528_sub10_118_.method9335(i_110_, i_111_,
							       i_113_);
				if (class528_sub10_120_ == null
				    || ((class528_sub10_118_.aLong7107
					 * -4849232331708333273L)
					< (class528_sub10_120_.aLong7107
					   * -4849232331708333273L)))
				    class528_sub10_120_ = class528_sub10_118_;
			    }
			    if (class528_sub10_119_ != null) {
				class528_sub10_119_.method9335(i_110_, i_111_,
							       i_113_);
				if (class528_sub10_120_ == null
				    || ((class528_sub10_119_.aLong7107
					 * -4849232331708333273L)
					< (class528_sub10_120_.aLong7107
					   * -4849232331708333273L)))
				    class528_sub10_120_ = class528_sub10_119_;
			    }
			    if (class528_sub10_120_ != null) {
				if (class528_sub10 != null)
				    class528_sub10_120_.method9339(i_115_);
				if (class528_sub10_118_ != null)
				    class528_sub10_120_.method9339(i_116_);
				if (class528_sub10_119_ != null)
				    class528_sub10_120_.method9339(i_117_);
				class528_sub10_120_.method9335(i_110_, i_111_,
							       i_113_);
			    }
			    i_113_++;
			}
		    }
		}
	    }
	    stream.method1189();
	    ((Class137_Sub3) this).anInterface14_9014
		= (((Class137_Sub3) this).aClass173_Sub2_8999.method8766
		   (i, nativeheapbuffer, stream.method1184(), false));
	    if (((Class137_Sub3) this).anInterface14_9014
		instanceof Class123_Sub2)
		nativeheapbuffer.method1168();
	    ((Class137_Sub3) this).aClass122_9019
		= new Class122(((Class137_Sub3) this).anInterface14_9014, 5126,
			       3, 0);
	    ((Class137_Sub3) this).aClass122_9010
		= new Class122(((Class137_Sub3) this).anInterface14_9014, 5121,
			       4, 12);
	    int i_121_;
	    if (((Class137_Sub3) this).anIntArrayArrayArray9013 != null) {
		((Class137_Sub3) this).aClass122_9022
		    = new Class122(((Class137_Sub3) this).anInterface14_9014,
				   5126, 3, 16);
		i_121_ = 28;
	    } else {
		((Class137_Sub3) this).aClass122_9022
		    = new Class122(((Class137_Sub3) this).anInterface14_9014,
				   5126, 2, 16);
		i_121_ = 24;
	    }
	    if ((((Class137_Sub3) this).anInt9003 & 0x7) != 0)
		((Class137_Sub3) this).aClass122_9030
		    = new Class122(((Class137_Sub3) this).anInterface14_9014,
				   5126, 3, i_121_);
	    long[] ls
		= new long[((Class137_Sub3) this).aClass528Array9007.length];
	    for (int i_122_ = 0;
		 i_122_ < ((Class137_Sub3) this).aClass528Array9007.length;
		 i_122_++) {
		Class528_Sub10 class528_sub10
		    = ((Class528_Sub10)
		       ((Class137_Sub3) this).aClass528Array9007[i_122_]);
		ls[i_122_] = class528_sub10.aLong7107 * -4849232331708333273L;
		class528_sub10.method9337(((Class137_Sub3) this).anInt9004);
	    }
	    Class650.method7738(ls, ((Class137_Sub3) this).aClass528Array9007,
				(short) 14710);
	    if (((Class137_Sub3) this).aClass155_9015 != null)
		((Class137_Sub3) this).aClass155_9015.method1846();
	} else
	    ((Class137_Sub3) this).aClass155_9015 = null;
	if ((((Class137_Sub3) this).anInt9026 & 0x2) == 0) {
	    ((Class137_Sub3) this).anIntArrayArrayArray9002 = null;
	    ((Class137_Sub3) this).anIntArrayArrayArray8998 = null;
	    ((Class137_Sub3) this).anIntArrayArrayArray9008 = null;
	}
	((Class137_Sub3) this).anIntArrayArrayArray9013 = null;
	((Class137_Sub3) this).anIntArrayArrayArray9009 = null;
	((Class137_Sub3) this).anIntArrayArrayArray9012 = null;
	((Class137_Sub3) this).aClass528_Sub10ArrayArrayArray9011 = null;
	((Class137_Sub3) this).aByteArrayArray9025 = null;
	((Class137_Sub3) this).aClass692_9029 = null;
	((Class137_Sub3) this).aFloatArrayArray9028 = null;
	((Class137_Sub3) this).aFloatArrayArray9027 = null;
	((Class137_Sub3) this).aFloatArrayArray9021 = null;
    }
    
    public Class528_Sub21_Sub12 method1674
	(int i, int i_123_, Class528_Sub21_Sub12 class528_sub21_sub12) {
	if ((((Class137_Sub3) this).aByteArrayArray8997[i][i_123_] & 0x1) == 0)
	    return null;
	int i_124_
	    = (anInt1628 * 2130003981
	       >> (((Class173_Sub2) ((Class137_Sub3) this).aClass173_Sub2_8999)
		   .anInt9438));
	Class528_Sub21_Sub12_Sub2 class528_sub21_sub12_sub2
	    = (Class528_Sub21_Sub12_Sub2) class528_sub21_sub12;
	Class528_Sub21_Sub12_Sub2 class528_sub21_sub12_sub2_125_;
	if (class528_sub21_sub12_sub2 != null
	    && class528_sub21_sub12_sub2.method10873(i_124_, i_124_)) {
	    class528_sub21_sub12_sub2_125_ = class528_sub21_sub12_sub2;
	    class528_sub21_sub12_sub2_125_.method10875();
	} else
	    class528_sub21_sub12_sub2_125_
		= new Class528_Sub21_Sub12_Sub2((((Class137_Sub3) this)
						 .aClass173_Sub2_8999),
						i_124_, i_124_);
	class528_sub21_sub12_sub2_125_.method10866(0, 0, i_124_, i_124_);
	method8351(class528_sub21_sub12_sub2_125_, i, i_123_);
	return class528_sub21_sub12_sub2_125_;
    }
    
    void method8350(int i, int i_126_, int i_127_, boolean[][] bools,
		    boolean bool, int i_128_) {
	if (((Class137_Sub3) this).aClass528Array9007 != null) {
	    int i_129_ = i_127_ + i_127_ + 1;
	    i_129_ *= i_129_;
	    if ((((Class173_Sub2) ((Class137_Sub3) this).aClass173_Sub2_8999)
		 .anIntArray9600).length
		< i_129_)
		((Class173_Sub2) ((Class137_Sub3) this).aClass173_Sub2_8999)
		    .anIntArray9600
		    = new int[i_129_];
	    if ((((Class173_Sub2) ((Class137_Sub3) this).aClass173_Sub2_8999)
		 .aClass528_Sub42_Sub1_9597.payload).length
		< ((Class137_Sub3) this).anInt9020 * 2)
		((Class173_Sub2) ((Class137_Sub3) this).aClass173_Sub2_8999)
		    .aClass528_Sub42_Sub1_9597
		    = new Class528_Sub42_Sub1(((Class137_Sub3) this).anInt9020
					      * 2);
	    int i_130_ = i - i_127_;
	    int i_131_ = i_130_;
	    if (i_130_ < 0)
		i_130_ = 0;
	    int i_132_ = i_126_ - i_127_;
	    int i_133_ = i_132_;
	    if (i_132_ < 0)
		i_132_ = 0;
	    int i_134_ = i + i_127_;
	    if (i_134_ > anInt1627 * -657933437 - 1)
		i_134_ = anInt1627 * -657933437 - 1;
	    int i_135_ = i_126_ + i_127_;
	    if (i_135_ > anInt1626 * 1769495707 - 1)
		i_135_ = anInt1626 * 1769495707 - 1;
	    int i_136_ = 0;
	    int[] is
		= (((Class173_Sub2) ((Class137_Sub3) this).aClass173_Sub2_8999)
		   .anIntArray9600);
	    for (int i_137_ = i_130_; i_137_ <= i_134_; i_137_++) {
		boolean[] bools_138_ = bools[i_137_ - i_131_];
		for (int i_139_ = i_132_; i_139_ <= i_135_; i_139_++) {
		    if (bools_138_[i_139_ - i_133_])
			is[i_136_++]
			    = i_139_ * (anInt1627 * -657933437) + i_137_;
		}
	    }
	    ((Class137_Sub3) this).aClass173_Sub2_8999.method8772();
	    ((Class137_Sub3) this).aClass173_Sub2_8999
		.method8784((((Class137_Sub3) this).anInt9003 & 0x7) != 0);
	    for (int i_140_ = 0;
		 i_140_ < ((Class137_Sub3) this).aClass528Array9007.length - 0;
		 i_140_++)
		((Class528_Sub10)
		 ((Class137_Sub3) this).aClass528Array9007[i_140_])
		    .method9340(is, i_136_);
	    if (!((Class137_Sub3) this).aClass688_9017
		     .method8040((byte) -124)) {
		int i_141_ = (((Class173_Sub2)
			       ((Class137_Sub3) this).aClass173_Sub2_8999)
			      .anInt9536);
		int i_142_ = (((Class173_Sub2)
			       ((Class137_Sub3) this).aClass173_Sub2_8999)
			      .anInt9435);
		((Class137_Sub3) this).aClass173_Sub2_8999.method2549
		    (0, i_142_,
		     ((Class173_Sub2)
		      ((Class137_Sub3) this).aClass173_Sub2_8999).anInt9538);
		((Class137_Sub3) this).aClass173_Sub2_8999.method8784(false);
		((Class137_Sub3) this).aClass173_Sub2_8999.method8787(false);
		((Class137_Sub3) this).aClass173_Sub2_8999.method8788(128);
		((Class137_Sub3) this).aClass173_Sub2_8999.method8840(-2);
		((Class137_Sub3) this).aClass173_Sub2_8999.method8775
		    (((Class173_Sub2)
		      ((Class137_Sub3) this).aClass173_Sub2_8999)
		     .aClass120_Sub4_9555);
		((Class137_Sub3) this).aClass173_Sub2_8999.method8754(8448,
								      7681);
		((Class137_Sub3) this).aClass173_Sub2_8999.method8778(0, 34166,
								      770);
		((Class137_Sub3) this).aClass173_Sub2_8999.method8808(0, 34167,
								      770);
		for (Node node = ((Class137_Sub3) this)
					     .aClass688_9017
					     .method8034(1476090801);
		     node != null;
		     node = ((Class137_Sub3) this).aClass688_9017
				    .method8037(55727674)) {
		    Class528_Sub5 class528_sub5 = (Class528_Sub5) node;
		    class528_sub5.method9260(i, i_126_, i_127_, bools);
		}
		((Class137_Sub3) this).aClass173_Sub2_8999.method8778(0, 5890,
								      768);
		((Class137_Sub3) this).aClass173_Sub2_8999.method8808(0, 5890,
								      770);
		((Class137_Sub3) this).aClass173_Sub2_8999.method8775(null);
		((Class137_Sub3) this).aClass173_Sub2_8999.method2549
		    (i_141_, i_142_,
		     ((Class173_Sub2)
		      ((Class137_Sub3) this).aClass173_Sub2_8999).anInt9538);
	    }
	    if (((Class137_Sub3) this).aClass155_9015 != null) {
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		((Class137_Sub3) this).aClass173_Sub2_8999.method8779
		    (((Class137_Sub3) this).aClass122_9019, null, null,
		     ((Class137_Sub3) this).aClass122_9022);
		((Class137_Sub3) this).aClass155_9015
		    .method1839(i, i_126_, i_127_, bools, bool);
		OpenGL.glPopMatrix();
	    }
	}
    }
    
    public void method1682(Class528_Sub21_Sub12 class528_sub21_sub12, int i,
			   int i_143_, int i_144_, int i_145_, boolean bool) {
	if (((Class137_Sub3) this).aClass155_9015 != null
	    && class528_sub21_sub12 != null) {
	    int i_146_
		= (i - (i_143_ * (((Class173_Sub2)
				   ((Class137_Sub3) this).aClass173_Sub2_8999)
				  .anInt9508)
			>> 8)
		   >> ((Class173_Sub2)
		       ((Class137_Sub3) this).aClass173_Sub2_8999).anInt9438);
	    int i_147_
		= (i_144_ - (i_143_ * (((Class173_Sub2) (((Class137_Sub3) this)
							 .aClass173_Sub2_8999))
				       .anInt9462)
			     >> 8)
		   >> ((Class173_Sub2)
		       ((Class137_Sub3) this).aClass173_Sub2_8999).anInt9438);
	    ((Class137_Sub3) this).aClass155_9015
		.method1841(class528_sub21_sub12, i_146_, i_147_);
	}
    }
    
    public void method1654(int i, int i_148_, int i_149_, boolean[][] bools,
			   boolean bool, int i_150_) {
	method8350(i, i_148_, i_149_, bools, bool, i_150_);
    }
    
    public boolean method1663(Class528_Sub21_Sub12 class528_sub21_sub12, int i,
			      int i_151_, int i_152_, int i_153_,
			      boolean bool) {
	if (((Class137_Sub3) this).aClass155_9015 == null
	    || class528_sub21_sub12 == null)
	    return false;
	int i_154_
	    = (i - (i_151_ * ((Class173_Sub2) (((Class137_Sub3) this)
					       .aClass173_Sub2_8999)).anInt9508
		    >> 8)
	       >> (((Class173_Sub2) ((Class137_Sub3) this).aClass173_Sub2_8999)
		   .anInt9438));
	int i_155_
	    = (i_152_ - (i_151_ * (((Class173_Sub2)
				    ((Class137_Sub3) this).aClass173_Sub2_8999)
				   .anInt9462)
			 >> 8)
	       >> (((Class173_Sub2) ((Class137_Sub3) this).aClass173_Sub2_8999)
		   .anInt9438));
	return ((Class137_Sub3) this).aClass155_9015
		   .method1842(class528_sub21_sub12, i_154_, i_155_);
    }
    
    public void method1661(Class528_Sub21_Sub12 class528_sub21_sub12, int i,
			   int i_156_, int i_157_, int i_158_, boolean bool) {
	if (((Class137_Sub3) this).aClass155_9015 != null
	    && class528_sub21_sub12 != null) {
	    int i_159_
		= (i - (i_156_ * (((Class173_Sub2)
				   ((Class137_Sub3) this).aClass173_Sub2_8999)
				  .anInt9508)
			>> 8)
		   >> ((Class173_Sub2)
		       ((Class137_Sub3) this).aClass173_Sub2_8999).anInt9438);
	    int i_160_
		= (i_157_ - (i_156_ * (((Class173_Sub2) (((Class137_Sub3) this)
							 .aClass173_Sub2_8999))
				       .anInt9462)
			     >> 8)
		   >> ((Class173_Sub2)
		       ((Class137_Sub3) this).aClass173_Sub2_8999).anInt9438);
	    ((Class137_Sub3) this).aClass155_9015
		.method1840(class528_sub21_sub12, i_159_, i_160_);
	}
    }
    
    public void method1687(int i, int i_161_, int i_162_, boolean[][] bools,
			   boolean bool, int i_163_) {
	method8350(i, i_161_, i_162_, bools, bool, i_163_);
    }
    
    public void method1672(int i, int i_164_, int i_165_, int i_166_,
			   int i_167_, int i_168_, int i_169_,
			   boolean[][] bools) {
	Class163 class163
	    = ((Class137_Sub3) this).aClass173_Sub2_8999.method2403((byte) -5);
	if (((Class137_Sub3) this).anInt9023 > 0 && class163 != null) {
	    ((Class137_Sub3) this).aClass173_Sub2_8999.method8837();
	    ((Class137_Sub3) this).aClass173_Sub2_8999.method8783(false);
	    ((Class137_Sub3) this).aClass173_Sub2_8999.method8784(false);
	    ((Class137_Sub3) this).aClass173_Sub2_8999.method8786(false);
	    ((Class137_Sub3) this).aClass173_Sub2_8999.method8787(false);
	    ((Class137_Sub3) this).aClass173_Sub2_8999.method8788(0);
	    ((Class137_Sub3) this).aClass173_Sub2_8999.method8840(-2);
	    ((Class137_Sub3) this).aClass173_Sub2_8999.method8775(null);
	    aFloatArray9016[0]
		= (float) i_165_ / (128.0F * (float) (anInt1628 * 2130003981)
				    * (float) class163.method2074());
	    aFloatArray9016[1] = 0.0F;
	    aFloatArray9016[2] = 0.0F;
	    aFloatArray9016[3] = 0.0F;
	    aFloatArray9016[4] = 0.0F;
	    aFloatArray9016[5]
		= (float) i_165_ / (128.0F * (float) (anInt1628 * 2130003981)
				    * (float) class163.method2070());
	    aFloatArray9016[6] = 0.0F;
	    aFloatArray9016[7] = 0.0F;
	    aFloatArray9016[8] = 0.0F;
	    aFloatArray9016[9] = 0.0F;
	    aFloatArray9016[10] = 0.0F;
	    aFloatArray9016[11] = 0.0F;
	    aFloatArray9016[12]
		= -1.0F - ((float) (i_166_ * i_165_) / 128.0F
			   - (float) (i * 2)) / (float) class163.method2074();
	    aFloatArray9016[13]
		= 1.0F - (((float) (2 * i_164_)
			   + (float) (i_169_ * i_165_) / 128.0F)
			  / (float) class163.method2070());
	    aFloatArray9016[14] = 0.0F;
	    aFloatArray9016[15] = 1.0F;
	    OpenGL.glMatrixMode(5889);
	    OpenGL.glLoadMatrixf(aFloatArray9016, 0);
	    aFloatArray9016[0] = 1.0F;
	    aFloatArray9016[1] = 0.0F;
	    aFloatArray9016[2] = 0.0F;
	    aFloatArray9016[3] = 0.0F;
	    aFloatArray9016[4] = 0.0F;
	    aFloatArray9016[5] = 0.0F;
	    aFloatArray9016[6] = 1.0F;
	    aFloatArray9016[7] = 0.0F;
	    aFloatArray9016[8] = 0.0F;
	    aFloatArray9016[9] = 1.0F;
	    aFloatArray9016[10] = 0.0F;
	    aFloatArray9016[11] = 0.0F;
	    aFloatArray9016[12] = 0.0F;
	    aFloatArray9016[13] = 0.0F;
	    aFloatArray9016[14] = 0.0F;
	    aFloatArray9016[15] = 1.0F;
	    OpenGL.glMatrixMode(5888);
	    OpenGL.glLoadMatrixf(aFloatArray9016, 0);
	    if ((((Class137_Sub3) this).anInt9003 & 0x7) != 0) {
		((Class137_Sub3) this).aClass173_Sub2_8999.method8784(true);
		((Class137_Sub3) this).aClass173_Sub2_8999.method8762();
	    } else
		((Class137_Sub3) this).aClass173_Sub2_8999.method8784(false);
	    ((Class137_Sub3) this).aClass173_Sub2_8999.method8779
		(((Class137_Sub3) this).aClass122_9019,
		 ((Class137_Sub3) this).aClass122_9030,
		 ((Class137_Sub3) this).aClass122_9010,
		 ((Class137_Sub3) this).aClass122_9022);
	    if ((((Class173_Sub2) ((Class137_Sub3) this).aClass173_Sub2_8999)
		 .aClass528_Sub42_Sub1_9597.payload).length
		< ((Class137_Sub3) this).anInt9020 * 2)
		((Class173_Sub2) ((Class137_Sub3) this).aClass173_Sub2_8999)
		    .aClass528_Sub42_Sub1_9597
		    = new Class528_Sub42_Sub1(((Class137_Sub3) this).anInt9020
					      * 2);
	    else
		((Class173_Sub2) ((Class137_Sub3) this).aClass173_Sub2_8999)
		    .aClass528_Sub42_Sub1_9597.pointer
		    = 0;
	    int i_170_ = 0;
	    Class528_Sub42_Sub1 class528_sub42_sub1
		= (((Class173_Sub2) ((Class137_Sub3) this).aClass173_Sub2_8999)
		   .aClass528_Sub42_Sub1_9597);
	    if (((Class173_Sub2) ((Class137_Sub3) this).aClass173_Sub2_8999)
		.aBool9561) {
		for (int i_171_ = i_167_; i_171_ < i_169_; i_171_++) {
		    int i_172_ = i_171_ * (anInt1627 * -657933437) + i_166_;
		    for (int i_173_ = i_166_; i_173_ < i_168_; i_173_++) {
			if (bools[i_173_ - i_166_][i_171_ - i_167_]) {
			    short[] is = (((Class137_Sub3) this)
					  .aShortArrayArray9006[i_172_]);
			    if (is != null) {
				for (int i_174_ = 0; i_174_ < is.length;
				     i_174_++) {
				    class528_sub42_sub1.method9717((is[i_174_]
								    & 0xffff),
								   (byte) 66);
				    i_170_++;
				}
			    }
			}
			i_172_++;
		    }
		}
	    } else {
		for (int i_175_ = i_167_; i_175_ < i_169_; i_175_++) {
		    int i_176_ = i_175_ * (anInt1627 * -657933437) + i_166_;
		    for (int i_177_ = i_166_; i_177_ < i_168_; i_177_++) {
			if (bools[i_177_ - i_166_][i_175_ - i_167_]) {
			    short[] is = (((Class137_Sub3) this)
					  .aShortArrayArray9006[i_176_]);
			    if (is != null) {
				for (int i_178_ = 0; i_178_ < is.length;
				     i_178_++) {
				    class528_sub42_sub1.writeLEShort
					(is[i_178_] & 0xffff, -1102718643);
				    i_170_++;
				}
			    }
			}
			i_176_++;
		    }
		}
	    }
	    if (i_170_ > 0) {
		Class126_Sub1 class126_sub1
		    = new Class126_Sub1((((Class137_Sub3) this)
					 .aClass173_Sub2_8999),
					5123,
					class528_sub42_sub1.payload,
					(class528_sub42_sub1.pointer
					 * -185904669));
		((Class137_Sub3) this).aClass173_Sub2_8999
		    .method8769(class126_sub1, 4, 0, i_170_);
	    }
	}
    }
    
    public void method1666(int i, int i_179_, int i_180_) {
	i = Math.min(((Class137_Sub3) this).aByteArrayArray9025.length - 1,
		     Math.max(0, i));
	i_179_ = Math.min((((Class137_Sub3) this).aByteArrayArray9025[i].length
			   - 1),
			  Math.max(0, i_179_));
	if ((((Class137_Sub3) this).aByteArrayArray9025[i][i_179_] & 0xff)
	    < i_180_)
	    ((Class137_Sub3) this).aByteArrayArray9025[i][i_179_]
		= (byte) i_180_;
    }
    
    public void method1664(int i, int i_181_, int i_182_) {
	i = Math.min(((Class137_Sub3) this).aByteArrayArray9025.length - 1,
		     Math.max(0, i));
	i_181_ = Math.min((((Class137_Sub3) this).aByteArrayArray9025[i].length
			   - 1),
			  Math.max(0, i_181_));
	if ((((Class137_Sub3) this).aByteArrayArray9025[i][i_181_] & 0xff)
	    < i_182_)
	    ((Class137_Sub3) this).aByteArrayArray9025[i][i_181_]
		= (byte) i_182_;
    }
    
    public void method1665(int i, int i_183_, int[] is, int[] is_184_,
			   int[] is_185_, int[] is_186_, int[] is_187_,
			   int[] is_188_, int[] is_189_, int[] is_190_,
			   int[] is_191_, int[] is_192_, int[] is_193_,
			   Class164 class164, boolean bool) {
	int i_194_ = is_190_.length;
	int[] is_195_ = new int[i_194_ * 3];
	int[] is_196_ = new int[i_194_ * 3];
	int[] is_197_ = new int[i_194_ * 3];
	int[] is_198_ = is_191_ != null ? new int[i_194_ * 3] : null;
	int[] is_199_ = new int[i_194_ * 3];
	int[] is_200_ = new int[i_194_ * 3];
	int[] is_201_ = is_184_ != null ? new int[i_194_ * 3] : null;
	int[] is_202_ = is_186_ != null ? new int[i_194_ * 3] : null;
	int i_203_ = 0;
	for (int i_204_ = 0; i_204_ < i_194_; i_204_++) {
	    int i_205_ = is_187_[i_204_];
	    int i_206_ = is_188_[i_204_];
	    int i_207_ = is_189_[i_204_];
	    is_195_[i_203_] = is[i_205_];
	    is_196_[i_203_] = is_185_[i_205_];
	    is_197_[i_203_] = is_190_[i_204_];
	    is_199_[i_203_] = is_192_[i_204_];
	    is_200_[i_203_] = is_193_[i_204_];
	    if (is_191_ != null)
		is_198_[i_203_] = is_191_[i_204_];
	    if (is_184_ != null)
		is_201_[i_203_] = is_184_[i_205_];
	    if (is_186_ != null)
		is_202_[i_203_] = is_186_[i_205_];
	    i_203_++;
	    is_195_[i_203_] = is[i_206_];
	    is_196_[i_203_] = is_185_[i_206_];
	    is_197_[i_203_] = is_190_[i_204_];
	    is_199_[i_203_] = is_192_[i_204_];
	    is_200_[i_203_] = is_193_[i_204_];
	    if (is_191_ != null)
		is_198_[i_203_] = is_191_[i_204_];
	    if (is_184_ != null)
		is_201_[i_203_] = is_184_[i_206_];
	    if (is_186_ != null)
		is_202_[i_203_] = is_186_[i_206_];
	    i_203_++;
	    is_195_[i_203_] = is[i_207_];
	    is_196_[i_203_] = is_185_[i_207_];
	    is_197_[i_203_] = is_190_[i_204_];
	    is_199_[i_203_] = is_192_[i_204_];
	    is_200_[i_203_] = is_193_[i_204_];
	    if (is_191_ != null)
		is_198_[i_203_] = is_191_[i_204_];
	    if (is_184_ != null)
		is_201_[i_203_] = is_184_[i_207_];
	    if (is_186_ != null)
		is_202_[i_203_] = is_186_[i_207_];
	    i_203_++;
	}
	method1686(i, i_183_, is_195_, is_201_, is_196_, is_202_, is_197_,
		   is_198_, is_199_, is_200_, class164, bool);
    }
    
    public void method1655(int i, int i_208_, int i_209_, int i_210_,
			   int i_211_, int i_212_, int i_213_,
			   boolean[][] bools) {
	Class163 class163 = ((Class137_Sub3) this).aClass173_Sub2_8999
				.method2403((byte) -125);
	if (((Class137_Sub3) this).anInt9023 > 0 && class163 != null) {
	    ((Class137_Sub3) this).aClass173_Sub2_8999.method8837();
	    ((Class137_Sub3) this).aClass173_Sub2_8999.method8783(false);
	    ((Class137_Sub3) this).aClass173_Sub2_8999.method8784(false);
	    ((Class137_Sub3) this).aClass173_Sub2_8999.method8786(false);
	    ((Class137_Sub3) this).aClass173_Sub2_8999.method8787(false);
	    ((Class137_Sub3) this).aClass173_Sub2_8999.method8788(0);
	    ((Class137_Sub3) this).aClass173_Sub2_8999.method8840(-2);
	    ((Class137_Sub3) this).aClass173_Sub2_8999.method8775(null);
	    aFloatArray9016[0]
		= (float) i_209_ / (128.0F * (float) (anInt1628 * 2130003981)
				    * (float) class163.method2074());
	    aFloatArray9016[1] = 0.0F;
	    aFloatArray9016[2] = 0.0F;
	    aFloatArray9016[3] = 0.0F;
	    aFloatArray9016[4] = 0.0F;
	    aFloatArray9016[5]
		= (float) i_209_ / (128.0F * (float) (anInt1628 * 2130003981)
				    * (float) class163.method2070());
	    aFloatArray9016[6] = 0.0F;
	    aFloatArray9016[7] = 0.0F;
	    aFloatArray9016[8] = 0.0F;
	    aFloatArray9016[9] = 0.0F;
	    aFloatArray9016[10] = 0.0F;
	    aFloatArray9016[11] = 0.0F;
	    aFloatArray9016[12]
		= -1.0F - ((float) (i_210_ * i_209_) / 128.0F
			   - (float) (i * 2)) / (float) class163.method2074();
	    aFloatArray9016[13]
		= 1.0F - (((float) (2 * i_208_)
			   + (float) (i_213_ * i_209_) / 128.0F)
			  / (float) class163.method2070());
	    aFloatArray9016[14] = 0.0F;
	    aFloatArray9016[15] = 1.0F;
	    OpenGL.glMatrixMode(5889);
	    OpenGL.glLoadMatrixf(aFloatArray9016, 0);
	    aFloatArray9016[0] = 1.0F;
	    aFloatArray9016[1] = 0.0F;
	    aFloatArray9016[2] = 0.0F;
	    aFloatArray9016[3] = 0.0F;
	    aFloatArray9016[4] = 0.0F;
	    aFloatArray9016[5] = 0.0F;
	    aFloatArray9016[6] = 1.0F;
	    aFloatArray9016[7] = 0.0F;
	    aFloatArray9016[8] = 0.0F;
	    aFloatArray9016[9] = 1.0F;
	    aFloatArray9016[10] = 0.0F;
	    aFloatArray9016[11] = 0.0F;
	    aFloatArray9016[12] = 0.0F;
	    aFloatArray9016[13] = 0.0F;
	    aFloatArray9016[14] = 0.0F;
	    aFloatArray9016[15] = 1.0F;
	    OpenGL.glMatrixMode(5888);
	    OpenGL.glLoadMatrixf(aFloatArray9016, 0);
	    if ((((Class137_Sub3) this).anInt9003 & 0x7) != 0) {
		((Class137_Sub3) this).aClass173_Sub2_8999.method8784(true);
		((Class137_Sub3) this).aClass173_Sub2_8999.method8762();
	    } else
		((Class137_Sub3) this).aClass173_Sub2_8999.method8784(false);
	    ((Class137_Sub3) this).aClass173_Sub2_8999.method8779
		(((Class137_Sub3) this).aClass122_9019,
		 ((Class137_Sub3) this).aClass122_9030,
		 ((Class137_Sub3) this).aClass122_9010,
		 ((Class137_Sub3) this).aClass122_9022);
	    if ((((Class173_Sub2) ((Class137_Sub3) this).aClass173_Sub2_8999)
		 .aClass528_Sub42_Sub1_9597.payload).length
		< ((Class137_Sub3) this).anInt9020 * 2)
		((Class173_Sub2) ((Class137_Sub3) this).aClass173_Sub2_8999)
		    .aClass528_Sub42_Sub1_9597
		    = new Class528_Sub42_Sub1(((Class137_Sub3) this).anInt9020
					      * 2);
	    else
		((Class173_Sub2) ((Class137_Sub3) this).aClass173_Sub2_8999)
		    .aClass528_Sub42_Sub1_9597.pointer
		    = 0;
	    int i_214_ = 0;
	    Class528_Sub42_Sub1 class528_sub42_sub1
		= (((Class173_Sub2) ((Class137_Sub3) this).aClass173_Sub2_8999)
		   .aClass528_Sub42_Sub1_9597);
	    if (((Class173_Sub2) ((Class137_Sub3) this).aClass173_Sub2_8999)
		.aBool9561) {
		for (int i_215_ = i_211_; i_215_ < i_213_; i_215_++) {
		    int i_216_ = i_215_ * (anInt1627 * -657933437) + i_210_;
		    for (int i_217_ = i_210_; i_217_ < i_212_; i_217_++) {
			if (bools[i_217_ - i_210_][i_215_ - i_211_]) {
			    short[] is = (((Class137_Sub3) this)
					  .aShortArrayArray9006[i_216_]);
			    if (is != null) {
				for (int i_218_ = 0; i_218_ < is.length;
				     i_218_++) {
				    class528_sub42_sub1.method9717((is[i_218_]
								    & 0xffff),
								   (byte) -6);
				    i_214_++;
				}
			    }
			}
			i_216_++;
		    }
		}
	    } else {
		for (int i_219_ = i_211_; i_219_ < i_213_; i_219_++) {
		    int i_220_ = i_219_ * (anInt1627 * -657933437) + i_210_;
		    for (int i_221_ = i_210_; i_221_ < i_212_; i_221_++) {
			if (bools[i_221_ - i_210_][i_219_ - i_211_]) {
			    short[] is = (((Class137_Sub3) this)
					  .aShortArrayArray9006[i_220_]);
			    if (is != null) {
				for (int i_222_ = 0; i_222_ < is.length;
				     i_222_++) {
				    class528_sub42_sub1.writeLEShort
					(is[i_222_] & 0xffff, -1102718643);
				    i_214_++;
				}
			    }
			}
			i_220_++;
		    }
		}
	    }
	    if (i_214_ > 0) {
		Class126_Sub1 class126_sub1
		    = new Class126_Sub1((((Class137_Sub3) this)
					 .aClass173_Sub2_8999),
					5123,
					class528_sub42_sub1.payload,
					(class528_sub42_sub1.pointer
					 * -185904669));
		((Class137_Sub3) this).aClass173_Sub2_8999
		    .method8769(class126_sub1, 4, 0, i_214_);
	    }
	}
    }
    
    public void method1667() {
	if (((Class137_Sub3) this).anInt9023 > 0) {
	    byte[][] is = (new byte[anInt1627 * -657933437 + 1]
			   [anInt1626 * 1769495707 + 1]);
	    for (int i = 1; i < anInt1627 * -657933437; i++) {
		for (int i_223_ = 1; i_223_ < anInt1626 * 1769495707; i_223_++)
		    is[i][i_223_]
			= (byte) (((((Class137_Sub3) this).aByteArrayArray9025
				    [i - 1][i_223_])
				   >> 2)
				  + ((((Class137_Sub3) this)
				      .aByteArrayArray9025[i + 1][i_223_])
				     >> 3)
				  + ((((Class137_Sub3) this)
				      .aByteArrayArray9025[i][i_223_ - 1])
				     >> 2)
				  + ((((Class137_Sub3) this)
				      .aByteArrayArray9025[i][i_223_ + 1])
				     >> 3)
				  + ((((Class137_Sub3) this)
				      .aByteArrayArray9025[i][i_223_])
				     >> 1));
	    }
	    ((Class137_Sub3) this).aClass528Array9007
		= new Node[((Class137_Sub3) this).aClass692_9029
				   .method8139((short) 5064)];
	    ((Class137_Sub3) this).aClass692_9029.method8136
		(((Class137_Sub3) this).aClass528Array9007, -1259439607);
	    for (int i = 0;
		 i < ((Class137_Sub3) this).aClass528Array9007.length; i++)
		((Class528_Sub10) ((Class137_Sub3) this).aClass528Array9007[i])
		    .method9333(((Class137_Sub3) this).anInt9023);
	    int i = 24;
	    if (((Class137_Sub3) this).anIntArrayArrayArray9013 != null)
		i += 4;
	    if ((((Class137_Sub3) this).anInt9003 & 0x7) != 0)
		i += 12;
	    NativeHeapBuffer nativeheapbuffer
		= ((Class173_Sub2) ((Class137_Sub3) this).aClass173_Sub2_8999)
		      .aNativeHeap9459
		      .method1342(((Class137_Sub3) this).anInt9023 * i, false);
	    Stream stream = new Stream(nativeheapbuffer);
	    Class528_Sub10[] class528_sub10s
		= new Class528_Sub10[((Class137_Sub3) this).anInt9023];
	    int i_224_ = ItemStyleOverride.method531(((Class137_Sub3) this).anInt9023 / 4,
					  -9137916);
	    if (i_224_ < 1)
		i_224_ = 1;
	    Class692 class692 = new Class692(i_224_);
	    Class528_Sub10[] class528_sub10s_225_
		= new Class528_Sub10[((Class137_Sub3) this).anInt9024];
	    for (int i_226_ = 0; i_226_ < anInt1627 * -657933437; i_226_++) {
		for (int i_227_ = 0; i_227_ < anInt1626 * 1769495707;
		     i_227_++) {
		    if ((((Class137_Sub3) this).anIntArrayArrayArray9008
			 [i_226_][i_227_])
			!= null) {
			Class528_Sub10[] class528_sub10s_228_
			    = (((Class137_Sub3) this)
			       .aClass528_Sub10ArrayArrayArray9011[i_226_]
			       [i_227_]);
			int[] is_229_
			    = (((Class137_Sub3) this).anIntArrayArrayArray8998
			       [i_226_][i_227_]);
			int[] is_230_
			    = (((Class137_Sub3) this).anIntArrayArrayArray9002
			       [i_226_][i_227_]);
			int[] is_231_
			    = (((Class137_Sub3) this).anIntArrayArrayArray9009
			       [i_226_][i_227_]);
			int[] is_232_
			    = (((Class137_Sub3) this).anIntArrayArrayArray9008
			       [i_226_][i_227_]);
			int[] is_233_
			    = ((((Class137_Sub3) this).anIntArrayArrayArray9012
				!= null)
			       ? (((Class137_Sub3) this)
				  .anIntArrayArrayArray9012[i_226_][i_227_])
			       : null);
			int[] is_234_
			    = ((((Class137_Sub3) this).anIntArrayArrayArray9013
				!= null)
			       ? (((Class137_Sub3) this)
				  .anIntArrayArrayArray9013[i_226_][i_227_])
			       : null);
			if (is_231_ == null)
			    is_231_ = is_232_;
			float f = (((Class137_Sub3) this).aFloatArrayArray9021
				   [i_226_][i_227_]);
			float f_235_ = (((Class137_Sub3) this)
					.aFloatArrayArray9027[i_226_][i_227_]);
			float f_236_ = (((Class137_Sub3) this)
					.aFloatArrayArray9028[i_226_][i_227_]);
			float f_237_
			    = (((Class137_Sub3) this).aFloatArrayArray9021
			       [i_226_][i_227_ + 1]);
			float f_238_
			    = (((Class137_Sub3) this).aFloatArrayArray9027
			       [i_226_][i_227_ + 1]);
			float f_239_
			    = (((Class137_Sub3) this).aFloatArrayArray9028
			       [i_226_][i_227_ + 1]);
			float f_240_
			    = (((Class137_Sub3) this).aFloatArrayArray9021
			       [i_226_ + 1][i_227_ + 1]);
			float f_241_
			    = (((Class137_Sub3) this).aFloatArrayArray9027
			       [i_226_ + 1][i_227_ + 1]);
			float f_242_
			    = (((Class137_Sub3) this).aFloatArrayArray9028
			       [i_226_ + 1][i_227_ + 1]);
			float f_243_
			    = (((Class137_Sub3) this).aFloatArrayArray9021
			       [i_226_ + 1][i_227_]);
			float f_244_
			    = (((Class137_Sub3) this).aFloatArrayArray9027
			       [i_226_ + 1][i_227_]);
			float f_245_
			    = (((Class137_Sub3) this).aFloatArrayArray9028
			       [i_226_ + 1][i_227_]);
			int i_246_ = is[i_226_][i_227_] & 0xff;
			int i_247_ = is[i_226_][i_227_ + 1] & 0xff;
			int i_248_ = is[i_226_ + 1][i_227_ + 1] & 0xff;
			int i_249_ = is[i_226_ + 1][i_227_] & 0xff;
			int i_250_ = 0;
		    while_44_:
			for (int i_251_ = 0; i_251_ < is_232_.length;
			     i_251_++) {
			    Class528_Sub10 class528_sub10
				= class528_sub10s_228_[i_251_];
			    for (int i_252_ = 0; i_252_ < i_250_; i_252_++) {
				if (class528_sub10s_225_[i_252_]
				    == class528_sub10)
				    continue while_44_;
			    }
			    class528_sub10s_225_[i_250_++] = class528_sub10;
			}
			short[] is_253_
			    = (((Class137_Sub3) this).aShortArrayArray9006
				   [i_227_ * (anInt1627 * -657933437) + i_226_]
			       = new short[is_232_.length]);
			for (int i_254_ = 0; i_254_ < is_232_.length;
			     i_254_++) {
			    int i_255_ = ((i_226_ << anInt1625 * 1543345989)
					  + is_229_[i_254_]);
			    int i_256_ = ((i_227_ << anInt1625 * 1543345989)
					  + is_230_[i_254_]);
			    int i_257_
				= i_255_ >> ((Class137_Sub3) this).anInt9000;
			    int i_258_
				= i_256_ >> ((Class137_Sub3) this).anInt9000;
			    int i_259_ = is_232_[i_254_];
			    int i_260_ = is_231_[i_254_];
			    int i_261_ = is_233_ != null ? is_233_[i_254_] : 0;
			    long l = ((long) i_260_ << 48 | (long) i_259_ << 32
				      | (long) (i_257_ << 16) | (long) i_258_);
			    int i_262_ = is_229_[i_254_];
			    int i_263_ = is_230_[i_254_];
			    int i_264_ = 74;
			    int i_265_ = 0;
			    float f_266_ = 1.0F;
			    float f_267_;
			    float f_268_;
			    float f_269_;
			    if (i_262_ == 0 && i_263_ == 0) {
				f_267_ = f;
				f_268_ = f_235_;
				f_269_ = f_236_;
				i_264_ -= i_246_;
			    } else if (i_262_ == 0
				       && i_263_ == anInt1628 * 2130003981) {
				f_267_ = f_237_;
				f_268_ = f_238_;
				f_269_ = f_239_;
				i_264_ -= i_247_;
			    } else if (i_262_ == anInt1628 * 2130003981
				       && i_263_ == anInt1628 * 2130003981) {
				f_267_ = f_240_;
				f_268_ = f_241_;
				f_269_ = f_242_;
				i_264_ -= i_248_;
			    } else if (i_262_ == anInt1628 * 2130003981
				       && i_263_ == 0) {
				f_267_ = f_243_;
				f_268_ = f_244_;
				f_269_ = f_245_;
				i_264_ -= i_249_;
			    } else {
				float f_270_
				    = ((float) i_262_
				       / (float) (anInt1628 * 2130003981));
				float f_271_
				    = ((float) i_263_
				       / (float) (anInt1628 * 2130003981));
				float f_272_ = f + (f_243_ - f) * f_270_;
				float f_273_
				    = f_235_ + (f_244_ - f_235_) * f_270_;
				float f_274_
				    = f_236_ + (f_245_ - f_236_) * f_270_;
				float f_275_
				    = f_237_ + (f_240_ - f_237_) * f_270_;
				float f_276_
				    = f_238_ + (f_241_ - f_238_) * f_270_;
				float f_277_
				    = f_239_ + (f_242_ - f_239_) * f_270_;
				f_267_ = f_272_ + (f_275_ - f_272_) * f_271_;
				f_268_ = f_273_ + (f_276_ - f_273_) * f_271_;
				f_269_ = f_274_ + (f_277_ - f_274_) * f_271_;
				int i_278_
				    = i_246_ + ((i_249_ - i_246_) * i_262_
						>> anInt1625 * 1543345989);
				int i_279_
				    = i_247_ + ((i_248_ - i_247_) * i_262_
						>> anInt1625 * 1543345989);
				i_264_ -= i_278_ + ((i_279_ - i_278_) * i_263_
						    >> anInt1625 * 1543345989);
			    }
			    if (i_259_ != -1) {
				int i_280_ = (i_259_ & 0x7f) * i_264_ >> 7;
				if (i_280_ < 2)
				    i_280_ = 2;
				else if (i_280_ > 126)
				    i_280_ = 126;
				i_265_ = (Class649.anIntArray8420
					  [i_259_ & 0xff80 | i_280_]);
				if ((((Class137_Sub3) this).anInt9003 & 0x7)
				    == 0) {
				    f_266_
					= ((((Class173_Sub2)
					     (((Class137_Sub3) this)
					      .aClass173_Sub2_8999))
					    .aFloatArray9521[0]) * f_267_
					   + (((Class173_Sub2)
					       (((Class137_Sub3) this)
						.aClass173_Sub2_8999))
					      .aFloatArray9521[1]) * f_268_
					   + (((Class173_Sub2)
					       (((Class137_Sub3) this)
						.aClass173_Sub2_8999))
					      .aFloatArray9521[2]) * f_269_);
				    f_266_
					= (((Class173_Sub2)
					    (((Class137_Sub3) this)
					     .aClass173_Sub2_8999)).aFloat9527
					   + (f_266_
					      * (f_266_ > 0.0F
						 ? (((Class173_Sub2)
						     (((Class137_Sub3) this)
						      .aClass173_Sub2_8999))
						    .aFloat9484)
						 : (((Class173_Sub2)
						     (((Class137_Sub3) this)
						      .aClass173_Sub2_8999))
						    .aFloat9464))));
				}
			    }
			    Node node = null;
			    if ((i_255_
				 & ((Class137_Sub3) this).anInt9001 - 1) == 0
				&& ((i_256_
				     & ((Class137_Sub3) this).anInt9001 - 1)
				    == 0))
				node = class692.method8137(l);
			    int i_281_;
			    if (node == null) {
				int i_282_;
				if (i_260_ != i_259_) {
				    int i_283_ = (i_260_ & 0x7f) * i_264_ >> 7;
				    if (i_283_ < 2)
					i_283_ = 2;
				    else if (i_283_ > 126)
					i_283_ = 126;
				    i_282_ = (Class649.anIntArray8420
					      [i_260_ & 0xff80 | i_283_]);
				    if ((((Class137_Sub3) this).anInt9003
					 & 0x7)
					== 0) {
					float f_284_
					    = ((((Class173_Sub2)
						 (((Class137_Sub3) this)
						  .aClass173_Sub2_8999))
						.aFloatArray9521[0]) * f_267_
					       + (((Class173_Sub2)
						   (((Class137_Sub3) this)
						    .aClass173_Sub2_8999))
						  .aFloatArray9521[1]) * f_268_
					       + ((((Class173_Sub2)
						    (((Class137_Sub3) this)
						     .aClass173_Sub2_8999))
						   .aFloatArray9521[2])
						  * f_269_));
					f_284_
					    = ((((Class173_Sub2)
						 (((Class137_Sub3) this)
						  .aClass173_Sub2_8999))
						.aFloat9527)
					       + (f_266_
						  * (f_266_ > 0.0F
						     ? (((Class173_Sub2)
							 (((Class137_Sub3)
							   this)
							  .aClass173_Sub2_8999))
							.aFloat9484)
						     : (((Class173_Sub2)
							 (((Class137_Sub3)
							   this)
							  .aClass173_Sub2_8999))
							.aFloat9464))));
					int i_285_ = i_282_ >> 16 & 0xff;
					int i_286_ = i_282_ >> 8 & 0xff;
					int i_287_ = i_282_ & 0xff;
					i_285_ *= f_284_;
					if (i_285_ < 0)
					    i_285_ = 0;
					else if (i_285_ > 255)
					    i_285_ = 255;
					i_286_ *= f_284_;
					if (i_286_ < 0)
					    i_286_ = 0;
					else if (i_286_ > 255)
					    i_286_ = 255;
					i_287_ *= f_284_;
					if (i_287_ < 0)
					    i_287_ = 0;
					else if (i_287_ > 255)
					    i_287_ = 255;
					i_282_ = (i_285_ << 16 | i_286_ << 8
						  | i_287_);
				    }
				} else
				    i_282_ = i_265_;
				if (((Class173_Sub2) (((Class137_Sub3) this)
						      .aClass173_Sub2_8999))
				    .aBool9561) {
				    stream.method1187((float) i_255_);
				    stream.method1187
					((float) (method1656(i_255_, i_256_,
							     1272227875)
						  + i_261_));
				    stream.method1187((float) i_256_);
				    stream.method1186((byte) (i_282_ >> 16));
				    stream.method1186((byte) (i_282_ >> 8));
				    stream.method1186((byte) i_282_);
				    stream.method1186(-1);
				    stream.method1187((float) i_255_);
				    stream.method1187((float) i_256_);
				    if ((((Class137_Sub3) this)
					 .anIntArrayArrayArray9013)
					!= null)
					stream.method1187(is_234_ != null
							  ? (float) ((is_234_
								      [i_254_])
								     - 1)
							  : 0.0F);
				    if ((((Class137_Sub3) this).anInt9003
					 & 0x7)
					!= 0) {
					stream.method1187(f_267_);
					stream.method1187(f_268_);
					stream.method1187(f_269_);
				    }
				} else {
				    stream.method1188((float) i_255_);
				    stream.method1188
					((float) (method1656(i_255_, i_256_,
							     1241368507)
						  + i_261_));
				    stream.method1188((float) i_256_);
				    stream.method1186((byte) (i_282_ >> 16));
				    stream.method1186((byte) (i_282_ >> 8));
				    stream.method1186((byte) i_282_);
				    stream.method1186(-1);
				    stream.method1188((float) i_255_);
				    stream.method1188((float) i_256_);
				    if ((((Class137_Sub3) this)
					 .anIntArrayArrayArray9013)
					!= null)
					stream.method1188(is_234_ != null
							  ? (float) ((is_234_
								      [i_254_])
								     - 1)
							  : 0.0F);
				    if ((((Class137_Sub3) this).anInt9003
					 & 0x7)
					!= 0) {
					stream.method1188(f_267_);
					stream.method1188(f_268_);
					stream.method1188(f_269_);
				    }
				}
				i_281_ = ((Class137_Sub3) this).anInt9004++;
				is_253_[i_254_] = (short) i_281_;
				if (i_259_ != -1)
				    class528_sub10s[i_281_]
					= class528_sub10s_228_[i_254_];
				class692.method8142
				    (new Class528_Sub18(is_253_[i_254_]), l);
			    } else {
				is_253_[i_254_]
				    = ((Class528_Sub18) node).aShort10389;
				i_281_ = is_253_[i_254_] & 0xffff;
				if (i_259_ != -1
				    && ((class528_sub10s_228_[i_254_].aLong7107
					 * -4849232331708333273L)
					< (class528_sub10s[i_281_].aLong7107
					   * -4849232331708333273L)))
				    class528_sub10s[i_281_]
					= class528_sub10s_228_[i_254_];
			    }
			    for (int i_288_ = 0; i_288_ < i_250_; i_288_++)
				class528_sub10s_225_[i_288_].method9336
				    (i_281_, i_265_, i_264_, f_266_);
			    ((Class137_Sub3) this).anInt9020++;
			}
		    }
		}
	    }
	    for (int i_289_ = 0; i_289_ < ((Class137_Sub3) this).anInt9004;
		 i_289_++) {
		Class528_Sub10 class528_sub10 = class528_sub10s[i_289_];
		if (class528_sub10 != null)
		    class528_sub10.method9339(i_289_);
	    }
	    for (int i_290_ = 0; i_290_ < anInt1627 * -657933437; i_290_++) {
		for (int i_291_ = 0; i_291_ < anInt1626 * 1769495707;
		     i_291_++) {
		    short[] is_292_
			= (((Class137_Sub3) this).aShortArrayArray9006
			   [i_291_ * (anInt1627 * -657933437) + i_290_]);
		    if (is_292_ != null) {
			int i_293_ = 0;
			int i_294_ = 0;
			while (i_294_ < is_292_.length) {
			    int i_295_ = is_292_[i_294_++] & 0xffff;
			    int i_296_ = is_292_[i_294_++] & 0xffff;
			    int i_297_ = is_292_[i_294_++] & 0xffff;
			    Class528_Sub10 class528_sub10
				= class528_sub10s[i_295_];
			    Class528_Sub10 class528_sub10_298_
				= class528_sub10s[i_296_];
			    Class528_Sub10 class528_sub10_299_
				= class528_sub10s[i_297_];
			    Class528_Sub10 class528_sub10_300_ = null;
			    if (class528_sub10 != null) {
				class528_sub10.method9335(i_290_, i_291_,
							  i_293_);
				class528_sub10_300_ = class528_sub10;
			    }
			    if (class528_sub10_298_ != null) {
				class528_sub10_298_.method9335(i_290_, i_291_,
							       i_293_);
				if (class528_sub10_300_ == null
				    || ((class528_sub10_298_.aLong7107
					 * -4849232331708333273L)
					< (class528_sub10_300_.aLong7107
					   * -4849232331708333273L)))
				    class528_sub10_300_ = class528_sub10_298_;
			    }
			    if (class528_sub10_299_ != null) {
				class528_sub10_299_.method9335(i_290_, i_291_,
							       i_293_);
				if (class528_sub10_300_ == null
				    || ((class528_sub10_299_.aLong7107
					 * -4849232331708333273L)
					< (class528_sub10_300_.aLong7107
					   * -4849232331708333273L)))
				    class528_sub10_300_ = class528_sub10_299_;
			    }
			    if (class528_sub10_300_ != null) {
				if (class528_sub10 != null)
				    class528_sub10_300_.method9339(i_295_);
				if (class528_sub10_298_ != null)
				    class528_sub10_300_.method9339(i_296_);
				if (class528_sub10_299_ != null)
				    class528_sub10_300_.method9339(i_297_);
				class528_sub10_300_.method9335(i_290_, i_291_,
							       i_293_);
			    }
			    i_293_++;
			}
		    }
		}
	    }
	    stream.method1189();
	    ((Class137_Sub3) this).anInterface14_9014
		= (((Class137_Sub3) this).aClass173_Sub2_8999.method8766
		   (i, nativeheapbuffer, stream.method1184(), false));
	    if (((Class137_Sub3) this).anInterface14_9014
		instanceof Class123_Sub2)
		nativeheapbuffer.method1168();
	    ((Class137_Sub3) this).aClass122_9019
		= new Class122(((Class137_Sub3) this).anInterface14_9014, 5126,
			       3, 0);
	    ((Class137_Sub3) this).aClass122_9010
		= new Class122(((Class137_Sub3) this).anInterface14_9014, 5121,
			       4, 12);
	    int i_301_;
	    if (((Class137_Sub3) this).anIntArrayArrayArray9013 != null) {
		((Class137_Sub3) this).aClass122_9022
		    = new Class122(((Class137_Sub3) this).anInterface14_9014,
				   5126, 3, 16);
		i_301_ = 28;
	    } else {
		((Class137_Sub3) this).aClass122_9022
		    = new Class122(((Class137_Sub3) this).anInterface14_9014,
				   5126, 2, 16);
		i_301_ = 24;
	    }
	    if ((((Class137_Sub3) this).anInt9003 & 0x7) != 0)
		((Class137_Sub3) this).aClass122_9030
		    = new Class122(((Class137_Sub3) this).anInterface14_9014,
				   5126, 3, i_301_);
	    long[] ls
		= new long[((Class137_Sub3) this).aClass528Array9007.length];
	    for (int i_302_ = 0;
		 i_302_ < ((Class137_Sub3) this).aClass528Array9007.length;
		 i_302_++) {
		Class528_Sub10 class528_sub10
		    = ((Class528_Sub10)
		       ((Class137_Sub3) this).aClass528Array9007[i_302_]);
		ls[i_302_] = class528_sub10.aLong7107 * -4849232331708333273L;
		class528_sub10.method9337(((Class137_Sub3) this).anInt9004);
	    }
	    Class650.method7738(ls, ((Class137_Sub3) this).aClass528Array9007,
				(short) 32274);
	    if (((Class137_Sub3) this).aClass155_9015 != null)
		((Class137_Sub3) this).aClass155_9015.method1846();
	} else
	    ((Class137_Sub3) this).aClass155_9015 = null;
	if ((((Class137_Sub3) this).anInt9026 & 0x2) == 0) {
	    ((Class137_Sub3) this).anIntArrayArrayArray9002 = null;
	    ((Class137_Sub3) this).anIntArrayArrayArray8998 = null;
	    ((Class137_Sub3) this).anIntArrayArrayArray9008 = null;
	}
	((Class137_Sub3) this).anIntArrayArrayArray9013 = null;
	((Class137_Sub3) this).anIntArrayArrayArray9009 = null;
	((Class137_Sub3) this).anIntArrayArrayArray9012 = null;
	((Class137_Sub3) this).aClass528_Sub10ArrayArrayArray9011 = null;
	((Class137_Sub3) this).aByteArrayArray9025 = null;
	((Class137_Sub3) this).aClass692_9029 = null;
	((Class137_Sub3) this).aFloatArrayArray9028 = null;
	((Class137_Sub3) this).aFloatArrayArray9027 = null;
	((Class137_Sub3) this).aFloatArrayArray9021 = null;
    }
    
    public void method1670(Class528_Sub12 class528_sub12, int[] is) {
	((Class137_Sub3) this).aClass688_9017.method8031
	    (new Class528_Sub5(((Class137_Sub3) this).aClass173_Sub2_8999,
			       this, class528_sub12, is),
	     (byte) 27);
    }
    
    void method8351(Class528_Sub21_Sub12_Sub2 class528_sub21_sub12_sub2, int i,
		    int i_303_) {
	int[] is = ((Class137_Sub3) this).anIntArrayArrayArray8998[i][i_303_];
	int[] is_304_
	    = ((Class137_Sub3) this).anIntArrayArrayArray9002[i][i_303_];
	int i_305_ = is.length;
	if ((((Class173_Sub2) ((Class137_Sub3) this).aClass173_Sub2_8999)
	     .anIntArray9408).length
	    < i_305_) {
	    ((Class173_Sub2) ((Class137_Sub3) this).aClass173_Sub2_8999)
		.anIntArray9408
		= new int[i_305_];
	    ((Class173_Sub2) ((Class137_Sub3) this).aClass173_Sub2_8999)
		.anIntArray9558
		= new int[i_305_];
	}
	int[] is_306_
	    = (((Class173_Sub2) ((Class137_Sub3) this).aClass173_Sub2_8999)
	       .anIntArray9408);
	int[] is_307_
	    = (((Class173_Sub2) ((Class137_Sub3) this).aClass173_Sub2_8999)
	       .anIntArray9558);
	for (int i_308_ = 0; i_308_ < i_305_; i_308_++) {
	    is_306_[i_308_]
		= is[i_308_] >> (((Class173_Sub2)
				  ((Class137_Sub3) this).aClass173_Sub2_8999)
				 .anInt9438);
	    is_307_[i_308_]
		= is_304_[i_308_] >> (((Class173_Sub2) (((Class137_Sub3) this)
							.aClass173_Sub2_8999))
				      .anInt9438);
	}
	int i_309_ = 0;
	while (i_309_ < i_305_) {
	    int i_310_ = is_306_[i_309_];
	    int i_311_ = is_307_[i_309_++];
	    int i_312_ = is_306_[i_309_];
	    int i_313_ = is_307_[i_309_++];
	    int i_314_ = is_306_[i_309_];
	    int i_315_ = is_307_[i_309_++];
	    if (((i_310_ - i_312_) * (i_313_ - i_315_)
		 - (i_313_ - i_311_) * (i_314_ - i_312_))
		> 0)
		class528_sub21_sub12_sub2.method10867(i_311_, i_313_, i_315_,
						      i_310_, i_312_, i_314_);
	}
    }
    
    public void method1658(int i, int i_316_, int i_317_, int i_318_,
			   int i_319_, int i_320_, int i_321_,
			   boolean[][] bools) {
	Class163 class163 = ((Class137_Sub3) this).aClass173_Sub2_8999
				.method2403((byte) -61);
	if (((Class137_Sub3) this).anInt9023 > 0 && class163 != null) {
	    ((Class137_Sub3) this).aClass173_Sub2_8999.method8837();
	    ((Class137_Sub3) this).aClass173_Sub2_8999.method8783(false);
	    ((Class137_Sub3) this).aClass173_Sub2_8999.method8784(false);
	    ((Class137_Sub3) this).aClass173_Sub2_8999.method8786(false);
	    ((Class137_Sub3) this).aClass173_Sub2_8999.method8787(false);
	    ((Class137_Sub3) this).aClass173_Sub2_8999.method8788(0);
	    ((Class137_Sub3) this).aClass173_Sub2_8999.method8840(-2);
	    ((Class137_Sub3) this).aClass173_Sub2_8999.method8775(null);
	    aFloatArray9016[0]
		= (float) i_317_ / (128.0F * (float) (anInt1628 * 2130003981)
				    * (float) class163.method2074());
	    aFloatArray9016[1] = 0.0F;
	    aFloatArray9016[2] = 0.0F;
	    aFloatArray9016[3] = 0.0F;
	    aFloatArray9016[4] = 0.0F;
	    aFloatArray9016[5]
		= (float) i_317_ / (128.0F * (float) (anInt1628 * 2130003981)
				    * (float) class163.method2070());
	    aFloatArray9016[6] = 0.0F;
	    aFloatArray9016[7] = 0.0F;
	    aFloatArray9016[8] = 0.0F;
	    aFloatArray9016[9] = 0.0F;
	    aFloatArray9016[10] = 0.0F;
	    aFloatArray9016[11] = 0.0F;
	    aFloatArray9016[12]
		= -1.0F - ((float) (i_318_ * i_317_) / 128.0F
			   - (float) (i * 2)) / (float) class163.method2074();
	    aFloatArray9016[13]
		= 1.0F - (((float) (2 * i_316_)
			   + (float) (i_321_ * i_317_) / 128.0F)
			  / (float) class163.method2070());
	    aFloatArray9016[14] = 0.0F;
	    aFloatArray9016[15] = 1.0F;
	    OpenGL.glMatrixMode(5889);
	    OpenGL.glLoadMatrixf(aFloatArray9016, 0);
	    aFloatArray9016[0] = 1.0F;
	    aFloatArray9016[1] = 0.0F;
	    aFloatArray9016[2] = 0.0F;
	    aFloatArray9016[3] = 0.0F;
	    aFloatArray9016[4] = 0.0F;
	    aFloatArray9016[5] = 0.0F;
	    aFloatArray9016[6] = 1.0F;
	    aFloatArray9016[7] = 0.0F;
	    aFloatArray9016[8] = 0.0F;
	    aFloatArray9016[9] = 1.0F;
	    aFloatArray9016[10] = 0.0F;
	    aFloatArray9016[11] = 0.0F;
	    aFloatArray9016[12] = 0.0F;
	    aFloatArray9016[13] = 0.0F;
	    aFloatArray9016[14] = 0.0F;
	    aFloatArray9016[15] = 1.0F;
	    OpenGL.glMatrixMode(5888);
	    OpenGL.glLoadMatrixf(aFloatArray9016, 0);
	    if ((((Class137_Sub3) this).anInt9003 & 0x7) != 0) {
		((Class137_Sub3) this).aClass173_Sub2_8999.method8784(true);
		((Class137_Sub3) this).aClass173_Sub2_8999.method8762();
	    } else
		((Class137_Sub3) this).aClass173_Sub2_8999.method8784(false);
	    ((Class137_Sub3) this).aClass173_Sub2_8999.method8779
		(((Class137_Sub3) this).aClass122_9019,
		 ((Class137_Sub3) this).aClass122_9030,
		 ((Class137_Sub3) this).aClass122_9010,
		 ((Class137_Sub3) this).aClass122_9022);
	    if ((((Class173_Sub2) ((Class137_Sub3) this).aClass173_Sub2_8999)
		 .aClass528_Sub42_Sub1_9597.payload).length
		< ((Class137_Sub3) this).anInt9020 * 2)
		((Class173_Sub2) ((Class137_Sub3) this).aClass173_Sub2_8999)
		    .aClass528_Sub42_Sub1_9597
		    = new Class528_Sub42_Sub1(((Class137_Sub3) this).anInt9020
					      * 2);
	    else
		((Class173_Sub2) ((Class137_Sub3) this).aClass173_Sub2_8999)
		    .aClass528_Sub42_Sub1_9597.pointer
		    = 0;
	    int i_322_ = 0;
	    Class528_Sub42_Sub1 class528_sub42_sub1
		= (((Class173_Sub2) ((Class137_Sub3) this).aClass173_Sub2_8999)
		   .aClass528_Sub42_Sub1_9597);
	    if (((Class173_Sub2) ((Class137_Sub3) this).aClass173_Sub2_8999)
		.aBool9561) {
		for (int i_323_ = i_319_; i_323_ < i_321_; i_323_++) {
		    int i_324_ = i_323_ * (anInt1627 * -657933437) + i_318_;
		    for (int i_325_ = i_318_; i_325_ < i_320_; i_325_++) {
			if (bools[i_325_ - i_318_][i_323_ - i_319_]) {
			    short[] is = (((Class137_Sub3) this)
					  .aShortArrayArray9006[i_324_]);
			    if (is != null) {
				for (int i_326_ = 0; i_326_ < is.length;
				     i_326_++) {
				    class528_sub42_sub1.method9717((is[i_326_]
								    & 0xffff),
								   (byte) 48);
				    i_322_++;
				}
			    }
			}
			i_324_++;
		    }
		}
	    } else {
		for (int i_327_ = i_319_; i_327_ < i_321_; i_327_++) {
		    int i_328_ = i_327_ * (anInt1627 * -657933437) + i_318_;
		    for (int i_329_ = i_318_; i_329_ < i_320_; i_329_++) {
			if (bools[i_329_ - i_318_][i_327_ - i_319_]) {
			    short[] is = (((Class137_Sub3) this)
					  .aShortArrayArray9006[i_328_]);
			    if (is != null) {
				for (int i_330_ = 0; i_330_ < is.length;
				     i_330_++) {
				    class528_sub42_sub1.writeLEShort
					(is[i_330_] & 0xffff, -1102718643);
				    i_322_++;
				}
			    }
			}
			i_328_++;
		    }
		}
	    }
	    if (i_322_ > 0) {
		Class126_Sub1 class126_sub1
		    = new Class126_Sub1((((Class137_Sub3) this)
					 .aClass173_Sub2_8999),
					5123,
					class528_sub42_sub1.payload,
					(class528_sub42_sub1.pointer
					 * -185904669));
		((Class137_Sub3) this).aClass173_Sub2_8999
		    .method8769(class126_sub1, 4, 0, i_322_);
	    }
	}
    }
    
    public void method1671(int i, int i_331_, int i_332_, int i_333_,
			   int i_334_, int i_335_, int i_336_,
			   boolean[][] bools) {
	Class163 class163 = ((Class137_Sub3) this).aClass173_Sub2_8999
				.method2403((byte) -20);
	if (((Class137_Sub3) this).anInt9023 > 0 && class163 != null) {
	    ((Class137_Sub3) this).aClass173_Sub2_8999.method8837();
	    ((Class137_Sub3) this).aClass173_Sub2_8999.method8783(false);
	    ((Class137_Sub3) this).aClass173_Sub2_8999.method8784(false);
	    ((Class137_Sub3) this).aClass173_Sub2_8999.method8786(false);
	    ((Class137_Sub3) this).aClass173_Sub2_8999.method8787(false);
	    ((Class137_Sub3) this).aClass173_Sub2_8999.method8788(0);
	    ((Class137_Sub3) this).aClass173_Sub2_8999.method8840(-2);
	    ((Class137_Sub3) this).aClass173_Sub2_8999.method8775(null);
	    aFloatArray9016[0]
		= (float) i_332_ / (128.0F * (float) (anInt1628 * 2130003981)
				    * (float) class163.method2074());
	    aFloatArray9016[1] = 0.0F;
	    aFloatArray9016[2] = 0.0F;
	    aFloatArray9016[3] = 0.0F;
	    aFloatArray9016[4] = 0.0F;
	    aFloatArray9016[5]
		= (float) i_332_ / (128.0F * (float) (anInt1628 * 2130003981)
				    * (float) class163.method2070());
	    aFloatArray9016[6] = 0.0F;
	    aFloatArray9016[7] = 0.0F;
	    aFloatArray9016[8] = 0.0F;
	    aFloatArray9016[9] = 0.0F;
	    aFloatArray9016[10] = 0.0F;
	    aFloatArray9016[11] = 0.0F;
	    aFloatArray9016[12]
		= -1.0F - ((float) (i_333_ * i_332_) / 128.0F
			   - (float) (i * 2)) / (float) class163.method2074();
	    aFloatArray9016[13]
		= 1.0F - (((float) (2 * i_331_)
			   + (float) (i_336_ * i_332_) / 128.0F)
			  / (float) class163.method2070());
	    aFloatArray9016[14] = 0.0F;
	    aFloatArray9016[15] = 1.0F;
	    OpenGL.glMatrixMode(5889);
	    OpenGL.glLoadMatrixf(aFloatArray9016, 0);
	    aFloatArray9016[0] = 1.0F;
	    aFloatArray9016[1] = 0.0F;
	    aFloatArray9016[2] = 0.0F;
	    aFloatArray9016[3] = 0.0F;
	    aFloatArray9016[4] = 0.0F;
	    aFloatArray9016[5] = 0.0F;
	    aFloatArray9016[6] = 1.0F;
	    aFloatArray9016[7] = 0.0F;
	    aFloatArray9016[8] = 0.0F;
	    aFloatArray9016[9] = 1.0F;
	    aFloatArray9016[10] = 0.0F;
	    aFloatArray9016[11] = 0.0F;
	    aFloatArray9016[12] = 0.0F;
	    aFloatArray9016[13] = 0.0F;
	    aFloatArray9016[14] = 0.0F;
	    aFloatArray9016[15] = 1.0F;
	    OpenGL.glMatrixMode(5888);
	    OpenGL.glLoadMatrixf(aFloatArray9016, 0);
	    if ((((Class137_Sub3) this).anInt9003 & 0x7) != 0) {
		((Class137_Sub3) this).aClass173_Sub2_8999.method8784(true);
		((Class137_Sub3) this).aClass173_Sub2_8999.method8762();
	    } else
		((Class137_Sub3) this).aClass173_Sub2_8999.method8784(false);
	    ((Class137_Sub3) this).aClass173_Sub2_8999.method8779
		(((Class137_Sub3) this).aClass122_9019,
		 ((Class137_Sub3) this).aClass122_9030,
		 ((Class137_Sub3) this).aClass122_9010,
		 ((Class137_Sub3) this).aClass122_9022);
	    if ((((Class173_Sub2) ((Class137_Sub3) this).aClass173_Sub2_8999)
		 .aClass528_Sub42_Sub1_9597.payload).length
		< ((Class137_Sub3) this).anInt9020 * 2)
		((Class173_Sub2) ((Class137_Sub3) this).aClass173_Sub2_8999)
		    .aClass528_Sub42_Sub1_9597
		    = new Class528_Sub42_Sub1(((Class137_Sub3) this).anInt9020
					      * 2);
	    else
		((Class173_Sub2) ((Class137_Sub3) this).aClass173_Sub2_8999)
		    .aClass528_Sub42_Sub1_9597.pointer
		    = 0;
	    int i_337_ = 0;
	    Class528_Sub42_Sub1 class528_sub42_sub1
		= (((Class173_Sub2) ((Class137_Sub3) this).aClass173_Sub2_8999)
		   .aClass528_Sub42_Sub1_9597);
	    if (((Class173_Sub2) ((Class137_Sub3) this).aClass173_Sub2_8999)
		.aBool9561) {
		for (int i_338_ = i_334_; i_338_ < i_336_; i_338_++) {
		    int i_339_ = i_338_ * (anInt1627 * -657933437) + i_333_;
		    for (int i_340_ = i_333_; i_340_ < i_335_; i_340_++) {
			if (bools[i_340_ - i_333_][i_338_ - i_334_]) {
			    short[] is = (((Class137_Sub3) this)
					  .aShortArrayArray9006[i_339_]);
			    if (is != null) {
				for (int i_341_ = 0; i_341_ < is.length;
				     i_341_++) {
				    class528_sub42_sub1.method9717((is[i_341_]
								    & 0xffff),
								   (byte) -30);
				    i_337_++;
				}
			    }
			}
			i_339_++;
		    }
		}
	    } else {
		for (int i_342_ = i_334_; i_342_ < i_336_; i_342_++) {
		    int i_343_ = i_342_ * (anInt1627 * -657933437) + i_333_;
		    for (int i_344_ = i_333_; i_344_ < i_335_; i_344_++) {
			if (bools[i_344_ - i_333_][i_342_ - i_334_]) {
			    short[] is = (((Class137_Sub3) this)
					  .aShortArrayArray9006[i_343_]);
			    if (is != null) {
				for (int i_345_ = 0; i_345_ < is.length;
				     i_345_++) {
				    class528_sub42_sub1.writeLEShort
					(is[i_345_] & 0xffff, -1102718643);
				    i_337_++;
				}
			    }
			}
			i_343_++;
		    }
		}
	    }
	    if (i_337_ > 0) {
		Class126_Sub1 class126_sub1
		    = new Class126_Sub1((((Class137_Sub3) this)
					 .aClass173_Sub2_8999),
					5123,
					class528_sub42_sub1.payload,
					(class528_sub42_sub1.pointer
					 * -185904669));
		((Class137_Sub3) this).aClass173_Sub2_8999
		    .method8769(class126_sub1, 4, 0, i_337_);
	    }
	}
    }
    
    public void method1668() {
	if (((Class137_Sub3) this).anInt9023 > 0) {
	    byte[][] is = (new byte[anInt1627 * -657933437 + 1]
			   [anInt1626 * 1769495707 + 1]);
	    for (int i = 1; i < anInt1627 * -657933437; i++) {
		for (int i_346_ = 1; i_346_ < anInt1626 * 1769495707; i_346_++)
		    is[i][i_346_]
			= (byte) (((((Class137_Sub3) this).aByteArrayArray9025
				    [i - 1][i_346_])
				   >> 2)
				  + ((((Class137_Sub3) this)
				      .aByteArrayArray9025[i + 1][i_346_])
				     >> 3)
				  + ((((Class137_Sub3) this)
				      .aByteArrayArray9025[i][i_346_ - 1])
				     >> 2)
				  + ((((Class137_Sub3) this)
				      .aByteArrayArray9025[i][i_346_ + 1])
				     >> 3)
				  + ((((Class137_Sub3) this)
				      .aByteArrayArray9025[i][i_346_])
				     >> 1));
	    }
	    ((Class137_Sub3) this).aClass528Array9007
		= new Node[((Class137_Sub3) this).aClass692_9029
				   .method8139((short) 8459)];
	    ((Class137_Sub3) this).aClass692_9029.method8136
		(((Class137_Sub3) this).aClass528Array9007, -1506963409);
	    for (int i = 0;
		 i < ((Class137_Sub3) this).aClass528Array9007.length; i++)
		((Class528_Sub10) ((Class137_Sub3) this).aClass528Array9007[i])
		    .method9333(((Class137_Sub3) this).anInt9023);
	    int i = 24;
	    if (((Class137_Sub3) this).anIntArrayArrayArray9013 != null)
		i += 4;
	    if ((((Class137_Sub3) this).anInt9003 & 0x7) != 0)
		i += 12;
	    NativeHeapBuffer nativeheapbuffer
		= ((Class173_Sub2) ((Class137_Sub3) this).aClass173_Sub2_8999)
		      .aNativeHeap9459
		      .method1342(((Class137_Sub3) this).anInt9023 * i, false);
	    Stream stream = new Stream(nativeheapbuffer);
	    Class528_Sub10[] class528_sub10s
		= new Class528_Sub10[((Class137_Sub3) this).anInt9023];
	    int i_347_ = ItemStyleOverride.method531(((Class137_Sub3) this).anInt9023 / 4,
					  567899572);
	    if (i_347_ < 1)
		i_347_ = 1;
	    Class692 class692 = new Class692(i_347_);
	    Class528_Sub10[] class528_sub10s_348_
		= new Class528_Sub10[((Class137_Sub3) this).anInt9024];
	    for (int i_349_ = 0; i_349_ < anInt1627 * -657933437; i_349_++) {
		for (int i_350_ = 0; i_350_ < anInt1626 * 1769495707;
		     i_350_++) {
		    if ((((Class137_Sub3) this).anIntArrayArrayArray9008
			 [i_349_][i_350_])
			!= null) {
			Class528_Sub10[] class528_sub10s_351_
			    = (((Class137_Sub3) this)
			       .aClass528_Sub10ArrayArrayArray9011[i_349_]
			       [i_350_]);
			int[] is_352_
			    = (((Class137_Sub3) this).anIntArrayArrayArray8998
			       [i_349_][i_350_]);
			int[] is_353_
			    = (((Class137_Sub3) this).anIntArrayArrayArray9002
			       [i_349_][i_350_]);
			int[] is_354_
			    = (((Class137_Sub3) this).anIntArrayArrayArray9009
			       [i_349_][i_350_]);
			int[] is_355_
			    = (((Class137_Sub3) this).anIntArrayArrayArray9008
			       [i_349_][i_350_]);
			int[] is_356_
			    = ((((Class137_Sub3) this).anIntArrayArrayArray9012
				!= null)
			       ? (((Class137_Sub3) this)
				  .anIntArrayArrayArray9012[i_349_][i_350_])
			       : null);
			int[] is_357_
			    = ((((Class137_Sub3) this).anIntArrayArrayArray9013
				!= null)
			       ? (((Class137_Sub3) this)
				  .anIntArrayArrayArray9013[i_349_][i_350_])
			       : null);
			if (is_354_ == null)
			    is_354_ = is_355_;
			float f = (((Class137_Sub3) this).aFloatArrayArray9021
				   [i_349_][i_350_]);
			float f_358_ = (((Class137_Sub3) this)
					.aFloatArrayArray9027[i_349_][i_350_]);
			float f_359_ = (((Class137_Sub3) this)
					.aFloatArrayArray9028[i_349_][i_350_]);
			float f_360_
			    = (((Class137_Sub3) this).aFloatArrayArray9021
			       [i_349_][i_350_ + 1]);
			float f_361_
			    = (((Class137_Sub3) this).aFloatArrayArray9027
			       [i_349_][i_350_ + 1]);
			float f_362_
			    = (((Class137_Sub3) this).aFloatArrayArray9028
			       [i_349_][i_350_ + 1]);
			float f_363_
			    = (((Class137_Sub3) this).aFloatArrayArray9021
			       [i_349_ + 1][i_350_ + 1]);
			float f_364_
			    = (((Class137_Sub3) this).aFloatArrayArray9027
			       [i_349_ + 1][i_350_ + 1]);
			float f_365_
			    = (((Class137_Sub3) this).aFloatArrayArray9028
			       [i_349_ + 1][i_350_ + 1]);
			float f_366_
			    = (((Class137_Sub3) this).aFloatArrayArray9021
			       [i_349_ + 1][i_350_]);
			float f_367_
			    = (((Class137_Sub3) this).aFloatArrayArray9027
			       [i_349_ + 1][i_350_]);
			float f_368_
			    = (((Class137_Sub3) this).aFloatArrayArray9028
			       [i_349_ + 1][i_350_]);
			int i_369_ = is[i_349_][i_350_] & 0xff;
			int i_370_ = is[i_349_][i_350_ + 1] & 0xff;
			int i_371_ = is[i_349_ + 1][i_350_ + 1] & 0xff;
			int i_372_ = is[i_349_ + 1][i_350_] & 0xff;
			int i_373_ = 0;
		    while_46_:
			for (int i_374_ = 0; i_374_ < is_355_.length;
			     i_374_++) {
			    Class528_Sub10 class528_sub10
				= class528_sub10s_351_[i_374_];
			    for (int i_375_ = 0; i_375_ < i_373_; i_375_++) {
				if (class528_sub10s_348_[i_375_]
				    == class528_sub10)
				    continue while_46_;
			    }
			    class528_sub10s_348_[i_373_++] = class528_sub10;
			}
			short[] is_376_
			    = (((Class137_Sub3) this).aShortArrayArray9006
				   [i_350_ * (anInt1627 * -657933437) + i_349_]
			       = new short[is_355_.length]);
			for (int i_377_ = 0; i_377_ < is_355_.length;
			     i_377_++) {
			    int i_378_ = ((i_349_ << anInt1625 * 1543345989)
					  + is_352_[i_377_]);
			    int i_379_ = ((i_350_ << anInt1625 * 1543345989)
					  + is_353_[i_377_]);
			    int i_380_
				= i_378_ >> ((Class137_Sub3) this).anInt9000;
			    int i_381_
				= i_379_ >> ((Class137_Sub3) this).anInt9000;
			    int i_382_ = is_355_[i_377_];
			    int i_383_ = is_354_[i_377_];
			    int i_384_ = is_356_ != null ? is_356_[i_377_] : 0;
			    long l = ((long) i_383_ << 48 | (long) i_382_ << 32
				      | (long) (i_380_ << 16) | (long) i_381_);
			    int i_385_ = is_352_[i_377_];
			    int i_386_ = is_353_[i_377_];
			    int i_387_ = 74;
			    int i_388_ = 0;
			    float f_389_ = 1.0F;
			    float f_390_;
			    float f_391_;
			    float f_392_;
			    if (i_385_ == 0 && i_386_ == 0) {
				f_390_ = f;
				f_391_ = f_358_;
				f_392_ = f_359_;
				i_387_ -= i_369_;
			    } else if (i_385_ == 0
				       && i_386_ == anInt1628 * 2130003981) {
				f_390_ = f_360_;
				f_391_ = f_361_;
				f_392_ = f_362_;
				i_387_ -= i_370_;
			    } else if (i_385_ == anInt1628 * 2130003981
				       && i_386_ == anInt1628 * 2130003981) {
				f_390_ = f_363_;
				f_391_ = f_364_;
				f_392_ = f_365_;
				i_387_ -= i_371_;
			    } else if (i_385_ == anInt1628 * 2130003981
				       && i_386_ == 0) {
				f_390_ = f_366_;
				f_391_ = f_367_;
				f_392_ = f_368_;
				i_387_ -= i_372_;
			    } else {
				float f_393_
				    = ((float) i_385_
				       / (float) (anInt1628 * 2130003981));
				float f_394_
				    = ((float) i_386_
				       / (float) (anInt1628 * 2130003981));
				float f_395_ = f + (f_366_ - f) * f_393_;
				float f_396_
				    = f_358_ + (f_367_ - f_358_) * f_393_;
				float f_397_
				    = f_359_ + (f_368_ - f_359_) * f_393_;
				float f_398_
				    = f_360_ + (f_363_ - f_360_) * f_393_;
				float f_399_
				    = f_361_ + (f_364_ - f_361_) * f_393_;
				float f_400_
				    = f_362_ + (f_365_ - f_362_) * f_393_;
				f_390_ = f_395_ + (f_398_ - f_395_) * f_394_;
				f_391_ = f_396_ + (f_399_ - f_396_) * f_394_;
				f_392_ = f_397_ + (f_400_ - f_397_) * f_394_;
				int i_401_
				    = i_369_ + ((i_372_ - i_369_) * i_385_
						>> anInt1625 * 1543345989);
				int i_402_
				    = i_370_ + ((i_371_ - i_370_) * i_385_
						>> anInt1625 * 1543345989);
				i_387_ -= i_401_ + ((i_402_ - i_401_) * i_386_
						    >> anInt1625 * 1543345989);
			    }
			    if (i_382_ != -1) {
				int i_403_ = (i_382_ & 0x7f) * i_387_ >> 7;
				if (i_403_ < 2)
				    i_403_ = 2;
				else if (i_403_ > 126)
				    i_403_ = 126;
				i_388_ = (Class649.anIntArray8420
					  [i_382_ & 0xff80 | i_403_]);
				if ((((Class137_Sub3) this).anInt9003 & 0x7)
				    == 0) {
				    f_389_
					= ((((Class173_Sub2)
					     (((Class137_Sub3) this)
					      .aClass173_Sub2_8999))
					    .aFloatArray9521[0]) * f_390_
					   + (((Class173_Sub2)
					       (((Class137_Sub3) this)
						.aClass173_Sub2_8999))
					      .aFloatArray9521[1]) * f_391_
					   + (((Class173_Sub2)
					       (((Class137_Sub3) this)
						.aClass173_Sub2_8999))
					      .aFloatArray9521[2]) * f_392_);
				    f_389_
					= (((Class173_Sub2)
					    (((Class137_Sub3) this)
					     .aClass173_Sub2_8999)).aFloat9527
					   + (f_389_
					      * (f_389_ > 0.0F
						 ? (((Class173_Sub2)
						     (((Class137_Sub3) this)
						      .aClass173_Sub2_8999))
						    .aFloat9484)
						 : (((Class173_Sub2)
						     (((Class137_Sub3) this)
						      .aClass173_Sub2_8999))
						    .aFloat9464))));
				}
			    }
			    Node node = null;
			    if ((i_378_
				 & ((Class137_Sub3) this).anInt9001 - 1) == 0
				&& ((i_379_
				     & ((Class137_Sub3) this).anInt9001 - 1)
				    == 0))
				node = class692.method8137(l);
			    int i_404_;
			    if (node == null) {
				int i_405_;
				if (i_383_ != i_382_) {
				    int i_406_ = (i_383_ & 0x7f) * i_387_ >> 7;
				    if (i_406_ < 2)
					i_406_ = 2;
				    else if (i_406_ > 126)
					i_406_ = 126;
				    i_405_ = (Class649.anIntArray8420
					      [i_383_ & 0xff80 | i_406_]);
				    if ((((Class137_Sub3) this).anInt9003
					 & 0x7)
					== 0) {
					float f_407_
					    = ((((Class173_Sub2)
						 (((Class137_Sub3) this)
						  .aClass173_Sub2_8999))
						.aFloatArray9521[0]) * f_390_
					       + (((Class173_Sub2)
						   (((Class137_Sub3) this)
						    .aClass173_Sub2_8999))
						  .aFloatArray9521[1]) * f_391_
					       + ((((Class173_Sub2)
						    (((Class137_Sub3) this)
						     .aClass173_Sub2_8999))
						   .aFloatArray9521[2])
						  * f_392_));
					f_407_
					    = ((((Class173_Sub2)
						 (((Class137_Sub3) this)
						  .aClass173_Sub2_8999))
						.aFloat9527)
					       + (f_389_
						  * (f_389_ > 0.0F
						     ? (((Class173_Sub2)
							 (((Class137_Sub3)
							   this)
							  .aClass173_Sub2_8999))
							.aFloat9484)
						     : (((Class173_Sub2)
							 (((Class137_Sub3)
							   this)
							  .aClass173_Sub2_8999))
							.aFloat9464))));
					int i_408_ = i_405_ >> 16 & 0xff;
					int i_409_ = i_405_ >> 8 & 0xff;
					int i_410_ = i_405_ & 0xff;
					i_408_ *= f_407_;
					if (i_408_ < 0)
					    i_408_ = 0;
					else if (i_408_ > 255)
					    i_408_ = 255;
					i_409_ *= f_407_;
					if (i_409_ < 0)
					    i_409_ = 0;
					else if (i_409_ > 255)
					    i_409_ = 255;
					i_410_ *= f_407_;
					if (i_410_ < 0)
					    i_410_ = 0;
					else if (i_410_ > 255)
					    i_410_ = 255;
					i_405_ = (i_408_ << 16 | i_409_ << 8
						  | i_410_);
				    }
				} else
				    i_405_ = i_388_;
				if (((Class173_Sub2) (((Class137_Sub3) this)
						      .aClass173_Sub2_8999))
				    .aBool9561) {
				    stream.method1187((float) i_378_);
				    stream.method1187
					((float) (method1656(i_378_, i_379_,
							     1679855643)
						  + i_384_));
				    stream.method1187((float) i_379_);
				    stream.method1186((byte) (i_405_ >> 16));
				    stream.method1186((byte) (i_405_ >> 8));
				    stream.method1186((byte) i_405_);
				    stream.method1186(-1);
				    stream.method1187((float) i_378_);
				    stream.method1187((float) i_379_);
				    if ((((Class137_Sub3) this)
					 .anIntArrayArrayArray9013)
					!= null)
					stream.method1187(is_357_ != null
							  ? (float) ((is_357_
								      [i_377_])
								     - 1)
							  : 0.0F);
				    if ((((Class137_Sub3) this).anInt9003
					 & 0x7)
					!= 0) {
					stream.method1187(f_390_);
					stream.method1187(f_391_);
					stream.method1187(f_392_);
				    }
				} else {
				    stream.method1188((float) i_378_);
				    stream.method1188
					((float) (method1656(i_378_, i_379_,
							     896680307)
						  + i_384_));
				    stream.method1188((float) i_379_);
				    stream.method1186((byte) (i_405_ >> 16));
				    stream.method1186((byte) (i_405_ >> 8));
				    stream.method1186((byte) i_405_);
				    stream.method1186(-1);
				    stream.method1188((float) i_378_);
				    stream.method1188((float) i_379_);
				    if ((((Class137_Sub3) this)
					 .anIntArrayArrayArray9013)
					!= null)
					stream.method1188(is_357_ != null
							  ? (float) ((is_357_
								      [i_377_])
								     - 1)
							  : 0.0F);
				    if ((((Class137_Sub3) this).anInt9003
					 & 0x7)
					!= 0) {
					stream.method1188(f_390_);
					stream.method1188(f_391_);
					stream.method1188(f_392_);
				    }
				}
				i_404_ = ((Class137_Sub3) this).anInt9004++;
				is_376_[i_377_] = (short) i_404_;
				if (i_382_ != -1)
				    class528_sub10s[i_404_]
					= class528_sub10s_351_[i_377_];
				class692.method8142
				    (new Class528_Sub18(is_376_[i_377_]), l);
			    } else {
				is_376_[i_377_]
				    = ((Class528_Sub18) node).aShort10389;
				i_404_ = is_376_[i_377_] & 0xffff;
				if (i_382_ != -1
				    && ((class528_sub10s_351_[i_377_].aLong7107
					 * -4849232331708333273L)
					< (class528_sub10s[i_404_].aLong7107
					   * -4849232331708333273L)))
				    class528_sub10s[i_404_]
					= class528_sub10s_351_[i_377_];
			    }
			    for (int i_411_ = 0; i_411_ < i_373_; i_411_++)
				class528_sub10s_348_[i_411_].method9336
				    (i_404_, i_388_, i_387_, f_389_);
			    ((Class137_Sub3) this).anInt9020++;
			}
		    }
		}
	    }
	    for (int i_412_ = 0; i_412_ < ((Class137_Sub3) this).anInt9004;
		 i_412_++) {
		Class528_Sub10 class528_sub10 = class528_sub10s[i_412_];
		if (class528_sub10 != null)
		    class528_sub10.method9339(i_412_);
	    }
	    for (int i_413_ = 0; i_413_ < anInt1627 * -657933437; i_413_++) {
		for (int i_414_ = 0; i_414_ < anInt1626 * 1769495707;
		     i_414_++) {
		    short[] is_415_
			= (((Class137_Sub3) this).aShortArrayArray9006
			   [i_414_ * (anInt1627 * -657933437) + i_413_]);
		    if (is_415_ != null) {
			int i_416_ = 0;
			int i_417_ = 0;
			while (i_417_ < is_415_.length) {
			    int i_418_ = is_415_[i_417_++] & 0xffff;
			    int i_419_ = is_415_[i_417_++] & 0xffff;
			    int i_420_ = is_415_[i_417_++] & 0xffff;
			    Class528_Sub10 class528_sub10
				= class528_sub10s[i_418_];
			    Class528_Sub10 class528_sub10_421_
				= class528_sub10s[i_419_];
			    Class528_Sub10 class528_sub10_422_
				= class528_sub10s[i_420_];
			    Class528_Sub10 class528_sub10_423_ = null;
			    if (class528_sub10 != null) {
				class528_sub10.method9335(i_413_, i_414_,
							  i_416_);
				class528_sub10_423_ = class528_sub10;
			    }
			    if (class528_sub10_421_ != null) {
				class528_sub10_421_.method9335(i_413_, i_414_,
							       i_416_);
				if (class528_sub10_423_ == null
				    || ((class528_sub10_421_.aLong7107
					 * -4849232331708333273L)
					< (class528_sub10_423_.aLong7107
					   * -4849232331708333273L)))
				    class528_sub10_423_ = class528_sub10_421_;
			    }
			    if (class528_sub10_422_ != null) {
				class528_sub10_422_.method9335(i_413_, i_414_,
							       i_416_);
				if (class528_sub10_423_ == null
				    || ((class528_sub10_422_.aLong7107
					 * -4849232331708333273L)
					< (class528_sub10_423_.aLong7107
					   * -4849232331708333273L)))
				    class528_sub10_423_ = class528_sub10_422_;
			    }
			    if (class528_sub10_423_ != null) {
				if (class528_sub10 != null)
				    class528_sub10_423_.method9339(i_418_);
				if (class528_sub10_421_ != null)
				    class528_sub10_423_.method9339(i_419_);
				if (class528_sub10_422_ != null)
				    class528_sub10_423_.method9339(i_420_);
				class528_sub10_423_.method9335(i_413_, i_414_,
							       i_416_);
			    }
			    i_416_++;
			}
		    }
		}
	    }
	    stream.method1189();
	    ((Class137_Sub3) this).anInterface14_9014
		= (((Class137_Sub3) this).aClass173_Sub2_8999.method8766
		   (i, nativeheapbuffer, stream.method1184(), false));
	    if (((Class137_Sub3) this).anInterface14_9014
		instanceof Class123_Sub2)
		nativeheapbuffer.method1168();
	    ((Class137_Sub3) this).aClass122_9019
		= new Class122(((Class137_Sub3) this).anInterface14_9014, 5126,
			       3, 0);
	    ((Class137_Sub3) this).aClass122_9010
		= new Class122(((Class137_Sub3) this).anInterface14_9014, 5121,
			       4, 12);
	    int i_424_;
	    if (((Class137_Sub3) this).anIntArrayArrayArray9013 != null) {
		((Class137_Sub3) this).aClass122_9022
		    = new Class122(((Class137_Sub3) this).anInterface14_9014,
				   5126, 3, 16);
		i_424_ = 28;
	    } else {
		((Class137_Sub3) this).aClass122_9022
		    = new Class122(((Class137_Sub3) this).anInterface14_9014,
				   5126, 2, 16);
		i_424_ = 24;
	    }
	    if ((((Class137_Sub3) this).anInt9003 & 0x7) != 0)
		((Class137_Sub3) this).aClass122_9030
		    = new Class122(((Class137_Sub3) this).anInterface14_9014,
				   5126, 3, i_424_);
	    long[] ls
		= new long[((Class137_Sub3) this).aClass528Array9007.length];
	    for (int i_425_ = 0;
		 i_425_ < ((Class137_Sub3) this).aClass528Array9007.length;
		 i_425_++) {
		Class528_Sub10 class528_sub10
		    = ((Class528_Sub10)
		       ((Class137_Sub3) this).aClass528Array9007[i_425_]);
		ls[i_425_] = class528_sub10.aLong7107 * -4849232331708333273L;
		class528_sub10.method9337(((Class137_Sub3) this).anInt9004);
	    }
	    Class650.method7738(ls, ((Class137_Sub3) this).aClass528Array9007,
				(short) 23005);
	    if (((Class137_Sub3) this).aClass155_9015 != null)
		((Class137_Sub3) this).aClass155_9015.method1846();
	} else
	    ((Class137_Sub3) this).aClass155_9015 = null;
	if ((((Class137_Sub3) this).anInt9026 & 0x2) == 0) {
	    ((Class137_Sub3) this).anIntArrayArrayArray9002 = null;
	    ((Class137_Sub3) this).anIntArrayArrayArray8998 = null;
	    ((Class137_Sub3) this).anIntArrayArrayArray9008 = null;
	}
	((Class137_Sub3) this).anIntArrayArrayArray9013 = null;
	((Class137_Sub3) this).anIntArrayArrayArray9009 = null;
	((Class137_Sub3) this).anIntArrayArrayArray9012 = null;
	((Class137_Sub3) this).aClass528_Sub10ArrayArrayArray9011 = null;
	((Class137_Sub3) this).aByteArrayArray9025 = null;
	((Class137_Sub3) this).aClass692_9029 = null;
	((Class137_Sub3) this).aFloatArrayArray9028 = null;
	((Class137_Sub3) this).aFloatArrayArray9027 = null;
	((Class137_Sub3) this).aFloatArrayArray9021 = null;
    }
    
    public Class528_Sub21_Sub12 method1673
	(int i, int i_426_, Class528_Sub21_Sub12 class528_sub21_sub12) {
	if ((((Class137_Sub3) this).aByteArrayArray8997[i][i_426_] & 0x1) == 0)
	    return null;
	int i_427_
	    = (anInt1628 * 2130003981
	       >> (((Class173_Sub2) ((Class137_Sub3) this).aClass173_Sub2_8999)
		   .anInt9438));
	Class528_Sub21_Sub12_Sub2 class528_sub21_sub12_sub2
	    = (Class528_Sub21_Sub12_Sub2) class528_sub21_sub12;
	Class528_Sub21_Sub12_Sub2 class528_sub21_sub12_sub2_428_;
	if (class528_sub21_sub12_sub2 != null
	    && class528_sub21_sub12_sub2.method10873(i_427_, i_427_)) {
	    class528_sub21_sub12_sub2_428_ = class528_sub21_sub12_sub2;
	    class528_sub21_sub12_sub2_428_.method10875();
	} else
	    class528_sub21_sub12_sub2_428_
		= new Class528_Sub21_Sub12_Sub2((((Class137_Sub3) this)
						 .aClass173_Sub2_8999),
						i_427_, i_427_);
	class528_sub21_sub12_sub2_428_.method10866(0, 0, i_427_, i_427_);
	method8351(class528_sub21_sub12_sub2_428_, i, i_426_);
	return class528_sub21_sub12_sub2_428_;
    }
    
    public void method1676(Class528_Sub21_Sub12 class528_sub21_sub12, int i,
			   int i_429_, int i_430_, int i_431_, boolean bool) {
	if (((Class137_Sub3) this).aClass155_9015 != null
	    && class528_sub21_sub12 != null) {
	    int i_432_
		= (i - (i_429_ * (((Class173_Sub2)
				   ((Class137_Sub3) this).aClass173_Sub2_8999)
				  .anInt9508)
			>> 8)
		   >> ((Class173_Sub2)
		       ((Class137_Sub3) this).aClass173_Sub2_8999).anInt9438);
	    int i_433_
		= (i_430_ - (i_429_ * (((Class173_Sub2) (((Class137_Sub3) this)
							 .aClass173_Sub2_8999))
				       .anInt9462)
			     >> 8)
		   >> ((Class173_Sub2)
		       ((Class137_Sub3) this).aClass173_Sub2_8999).anInt9438);
	    ((Class137_Sub3) this).aClass155_9015
		.method1840(class528_sub21_sub12, i_432_, i_433_);
	}
    }
    
    public void method1662(Class528_Sub21_Sub12 class528_sub21_sub12, int i,
			   int i_434_, int i_435_, int i_436_, boolean bool) {
	if (((Class137_Sub3) this).aClass155_9015 != null
	    && class528_sub21_sub12 != null) {
	    int i_437_
		= (i - (i_434_ * (((Class173_Sub2)
				   ((Class137_Sub3) this).aClass173_Sub2_8999)
				  .anInt9508)
			>> 8)
		   >> ((Class173_Sub2)
		       ((Class137_Sub3) this).aClass173_Sub2_8999).anInt9438);
	    int i_438_
		= (i_435_ - (i_434_ * (((Class173_Sub2) (((Class137_Sub3) this)
							 .aClass173_Sub2_8999))
				       .anInt9462)
			     >> 8)
		   >> ((Class173_Sub2)
		       ((Class137_Sub3) this).aClass173_Sub2_8999).anInt9438);
	    ((Class137_Sub3) this).aClass155_9015
		.method1841(class528_sub21_sub12, i_437_, i_438_);
	}
    }
    
    public void method1678(Class528_Sub21_Sub12 class528_sub21_sub12, int i,
			   int i_439_, int i_440_, int i_441_, boolean bool) {
	if (((Class137_Sub3) this).aClass155_9015 != null
	    && class528_sub21_sub12 != null) {
	    int i_442_
		= (i - (i_439_ * (((Class173_Sub2)
				   ((Class137_Sub3) this).aClass173_Sub2_8999)
				  .anInt9508)
			>> 8)
		   >> ((Class173_Sub2)
		       ((Class137_Sub3) this).aClass173_Sub2_8999).anInt9438);
	    int i_443_
		= (i_440_ - (i_439_ * (((Class173_Sub2) (((Class137_Sub3) this)
							 .aClass173_Sub2_8999))
				       .anInt9462)
			     >> 8)
		   >> ((Class173_Sub2)
		       ((Class137_Sub3) this).aClass173_Sub2_8999).anInt9438);
	    ((Class137_Sub3) this).aClass155_9015
		.method1840(class528_sub21_sub12, i_442_, i_443_);
	}
    }
    
    public boolean method1679(Class528_Sub21_Sub12 class528_sub21_sub12, int i,
			      int i_444_, int i_445_, int i_446_,
			      boolean bool) {
	if (((Class137_Sub3) this).aClass155_9015 == null
	    || class528_sub21_sub12 == null)
	    return false;
	int i_447_
	    = (i - (i_444_ * ((Class173_Sub2) (((Class137_Sub3) this)
					       .aClass173_Sub2_8999)).anInt9508
		    >> 8)
	       >> (((Class173_Sub2) ((Class137_Sub3) this).aClass173_Sub2_8999)
		   .anInt9438));
	int i_448_
	    = (i_445_ - (i_444_ * (((Class173_Sub2)
				    ((Class137_Sub3) this).aClass173_Sub2_8999)
				   .anInt9462)
			 >> 8)
	       >> (((Class173_Sub2) ((Class137_Sub3) this).aClass173_Sub2_8999)
		   .anInt9438));
	return ((Class137_Sub3) this).aClass155_9015
		   .method1842(class528_sub21_sub12, i_447_, i_448_);
    }
    
    public boolean method1680(Class528_Sub21_Sub12 class528_sub21_sub12, int i,
			      int i_449_, int i_450_, int i_451_,
			      boolean bool) {
	if (((Class137_Sub3) this).aClass155_9015 == null
	    || class528_sub21_sub12 == null)
	    return false;
	int i_452_
	    = (i - (i_449_ * ((Class173_Sub2) (((Class137_Sub3) this)
					       .aClass173_Sub2_8999)).anInt9508
		    >> 8)
	       >> (((Class173_Sub2) ((Class137_Sub3) this).aClass173_Sub2_8999)
		   .anInt9438));
	int i_453_
	    = (i_450_ - (i_449_ * (((Class173_Sub2)
				    ((Class137_Sub3) this).aClass173_Sub2_8999)
				   .anInt9462)
			 >> 8)
	       >> (((Class173_Sub2) ((Class137_Sub3) this).aClass173_Sub2_8999)
		   .anInt9438));
	return ((Class137_Sub3) this).aClass155_9015
		   .method1842(class528_sub21_sub12, i_452_, i_453_);
    }
    
    public boolean method1681(Class528_Sub21_Sub12 class528_sub21_sub12, int i,
			      int i_454_, int i_455_, int i_456_,
			      boolean bool) {
	if (((Class137_Sub3) this).aClass155_9015 == null
	    || class528_sub21_sub12 == null)
	    return false;
	int i_457_
	    = (i - (i_454_ * ((Class173_Sub2) (((Class137_Sub3) this)
					       .aClass173_Sub2_8999)).anInt9508
		    >> 8)
	       >> (((Class173_Sub2) ((Class137_Sub3) this).aClass173_Sub2_8999)
		   .anInt9438));
	int i_458_
	    = (i_455_ - (i_454_ * (((Class173_Sub2)
				    ((Class137_Sub3) this).aClass173_Sub2_8999)
				   .anInt9462)
			 >> 8)
	       >> (((Class173_Sub2) ((Class137_Sub3) this).aClass173_Sub2_8999)
		   .anInt9438));
	return ((Class137_Sub3) this).aClass155_9015
		   .method1842(class528_sub21_sub12, i_457_, i_458_);
    }
    
    public Class528_Sub21_Sub12 method1677
	(int i, int i_459_, Class528_Sub21_Sub12 class528_sub21_sub12) {
	if ((((Class137_Sub3) this).aByteArrayArray8997[i][i_459_] & 0x1) == 0)
	    return null;
	int i_460_
	    = (anInt1628 * 2130003981
	       >> (((Class173_Sub2) ((Class137_Sub3) this).aClass173_Sub2_8999)
		   .anInt9438));
	Class528_Sub21_Sub12_Sub2 class528_sub21_sub12_sub2
	    = (Class528_Sub21_Sub12_Sub2) class528_sub21_sub12;
	Class528_Sub21_Sub12_Sub2 class528_sub21_sub12_sub2_461_;
	if (class528_sub21_sub12_sub2 != null
	    && class528_sub21_sub12_sub2.method10873(i_460_, i_460_)) {
	    class528_sub21_sub12_sub2_461_ = class528_sub21_sub12_sub2;
	    class528_sub21_sub12_sub2_461_.method10875();
	} else
	    class528_sub21_sub12_sub2_461_
		= new Class528_Sub21_Sub12_Sub2((((Class137_Sub3) this)
						 .aClass173_Sub2_8999),
						i_460_, i_460_);
	class528_sub21_sub12_sub2_461_.method10866(0, 0, i_460_, i_460_);
	method8351(class528_sub21_sub12_sub2_461_, i, i_459_);
	return class528_sub21_sub12_sub2_461_;
    }
    
    public void method1650(Class528_Sub12 class528_sub12, int[] is) {
	((Class137_Sub3) this).aClass688_9017.method8031
	    (new Class528_Sub5(((Class137_Sub3) this).aClass173_Sub2_8999,
			       this, class528_sub12, is),
	     (byte) -114);
    }
    
    public void method1684(Class528_Sub12 class528_sub12, int[] is) {
	((Class137_Sub3) this).aClass688_9017.method8031
	    (new Class528_Sub5(((Class137_Sub3) this).aClass173_Sub2_8999,
			       this, class528_sub12, is),
	     (byte) -55);
    }
    
    public void method1685(Class528_Sub12 class528_sub12, int[] is) {
	((Class137_Sub3) this).aClass688_9017.method8031
	    (new Class528_Sub5(((Class137_Sub3) this).aClass173_Sub2_8999,
			       this, class528_sub12, is),
	     (byte) -70);
    }
    
    Class137_Sub3(Class173_Sub2 class173_sub2, int i, int i_462_, int i_463_,
		  int i_464_, int[][] is, int[][] is_465_, int i_466_) {
	super(i_463_, i_464_, i_466_, is);
	((Class137_Sub3) this).aClass173_Sub2_8999 = class173_sub2;
	((Class137_Sub3) this).anInt9000 = anInt1625 * 1543345989 - 2;
	((Class137_Sub3) this).anInt9001
	    = 1 << ((Class137_Sub3) this).anInt9000;
	((Class137_Sub3) this).anInt9026 = i;
	((Class137_Sub3) this).anInt9003 = i_462_;
	((Class137_Sub3) this).anIntArrayArrayArray9012
	    = new int[i_463_][i_464_][];
	((Class137_Sub3) this).aClass528_Sub10ArrayArrayArray9011
	    = new Class528_Sub10[i_463_][i_464_][];
	((Class137_Sub3) this).anIntArrayArrayArray8998
	    = new int[i_463_][i_464_][];
	((Class137_Sub3) this).anIntArrayArrayArray9002
	    = new int[i_463_][i_464_][];
	((Class137_Sub3) this).anIntArrayArrayArray9008
	    = new int[i_463_][i_464_][];
	((Class137_Sub3) this).anIntArrayArrayArray9009
	    = new int[i_463_][i_464_][];
	((Class137_Sub3) this).aShortArrayArray9006
	    = new short[i_463_ * i_464_][];
	((Class137_Sub3) this).aByteArrayArray8997 = new byte[i_463_][i_464_];
	((Class137_Sub3) this).aByteArrayArray9025
	    = new byte[i_463_ + 1][i_464_ + 1];
	((Class137_Sub3) this).aFloatArrayArray9021
	    = (new float[anInt1627 * -657933437 + 1]
	       [anInt1626 * 1769495707 + 1]);
	((Class137_Sub3) this).aFloatArrayArray9027
	    = (new float[anInt1627 * -657933437 + 1]
	       [anInt1626 * 1769495707 + 1]);
	((Class137_Sub3) this).aFloatArrayArray9028
	    = (new float[anInt1627 * -657933437 + 1]
	       [anInt1626 * 1769495707 + 1]);
	for (int i_467_ = 1; i_467_ < anInt1626 * 1769495707; i_467_++) {
	    for (int i_468_ = 1; i_468_ < anInt1627 * -657933437; i_468_++) {
		int i_469_ = (is_465_[i_468_ + 1][i_467_]
			      - is_465_[i_468_ - 1][i_467_]);
		int i_470_ = (is_465_[i_468_][i_467_ + 1]
			      - is_465_[i_468_][i_467_ - 1]);
		float f
		    = (float) (1.0 / Math.sqrt((double) (i_469_ * i_469_
							 + 4 * i_466_ * i_466_
							 + i_470_ * i_470_)));
		((Class137_Sub3) this).aFloatArrayArray9021[i_468_][i_467_]
		    = (float) i_469_ * f;
		((Class137_Sub3) this).aFloatArrayArray9027[i_468_][i_467_]
		    = (float) (-i_466_ * 2) * f;
		((Class137_Sub3) this).aFloatArrayArray9028[i_468_][i_467_]
		    = (float) i_470_ * f;
	    }
	}
	((Class137_Sub3) this).aClass692_9029 = new Class692(128);
	if ((((Class137_Sub3) this).anInt9003 & 0x10) != 0)
	    ((Class137_Sub3) this).aClass155_9015
		= new Class155(((Class137_Sub3) this).aClass173_Sub2_8999,
			       this);
    }
    
    public Class528_Sub21_Sub12 method1660
	(int i, int i_471_, Class528_Sub21_Sub12 class528_sub21_sub12) {
	if ((((Class137_Sub3) this).aByteArrayArray8997[i][i_471_] & 0x1) == 0)
	    return null;
	int i_472_
	    = (anInt1628 * 2130003981
	       >> (((Class173_Sub2) ((Class137_Sub3) this).aClass173_Sub2_8999)
		   .anInt9438));
	Class528_Sub21_Sub12_Sub2 class528_sub21_sub12_sub2
	    = (Class528_Sub21_Sub12_Sub2) class528_sub21_sub12;
	Class528_Sub21_Sub12_Sub2 class528_sub21_sub12_sub2_473_;
	if (class528_sub21_sub12_sub2 != null
	    && class528_sub21_sub12_sub2.method10873(i_472_, i_472_)) {
	    class528_sub21_sub12_sub2_473_ = class528_sub21_sub12_sub2;
	    class528_sub21_sub12_sub2_473_.method10875();
	} else
	    class528_sub21_sub12_sub2_473_
		= new Class528_Sub21_Sub12_Sub2((((Class137_Sub3) this)
						 .aClass173_Sub2_8999),
						i_472_, i_472_);
	class528_sub21_sub12_sub2_473_.method10866(0, 0, i_472_, i_472_);
	method8351(class528_sub21_sub12_sub2_473_, i, i_471_);
	return class528_sub21_sub12_sub2_473_;
    }
    
    public void method1675(int i, int i_474_, int[] is, int[] is_475_,
			   int[] is_476_, int[] is_477_, int[] is_478_,
			   int[] is_479_, int[] is_480_, int[] is_481_,
			   Class164 class164, boolean bool) {
	Class165 class165
	    = ((Class137_Sub3) this).aClass173_Sub2_8999.aClass165_1984;
	if (is_477_ != null
	    && ((Class137_Sub3) this).anIntArrayArrayArray9013 == null)
	    ((Class137_Sub3) this).anIntArrayArrayArray9013
		= new int[anInt1627 * -657933437][anInt1626 * 1769495707][];
	if (is_475_ != null
	    && ((Class137_Sub3) this).anIntArrayArrayArray9012 == null)
	    ((Class137_Sub3) this).anIntArrayArrayArray9012
		= new int[anInt1627 * -657933437][anInt1626 * 1769495707][];
	((Class137_Sub3) this).anIntArrayArrayArray8998[i][i_474_] = is;
	((Class137_Sub3) this).anIntArrayArrayArray9002[i][i_474_] = is_476_;
	((Class137_Sub3) this).anIntArrayArrayArray9008[i][i_474_] = is_478_;
	((Class137_Sub3) this).anIntArrayArrayArray9009[i][i_474_] = is_479_;
	if (((Class137_Sub3) this).anIntArrayArrayArray9013 != null)
	    ((Class137_Sub3) this).anIntArrayArrayArray9013[i][i_474_]
		= is_477_;
	if (((Class137_Sub3) this).anIntArrayArrayArray9012 != null)
	    ((Class137_Sub3) this).anIntArrayArrayArray9012[i][i_474_]
		= is_475_;
	Class528_Sub10[] class528_sub10s
	    = (((Class137_Sub3) this).aClass528_Sub10ArrayArrayArray9011[i]
		   [i_474_]
	       = new Class528_Sub10[is_478_.length]);
	for (int i_482_ = 0; i_482_ < is_478_.length; i_482_++) {
	    int i_483_ = is_480_[i_482_];
	    int i_484_ = is_481_[i_482_];
	    if ((((Class137_Sub3) this).anInt9003 & 0x20) != 0 && i_483_ != -1
		&& class165.method2093(i_483_, (byte) -47).aBool1800) {
		i_484_ = 128;
		i_483_ = -1;
	    }
	    long l = ((long) (class164.anInt1829 * 1802884547) << 48
		      | (long) (class164.anInt1828 * -386339441) << 42
		      | (long) (class164.anInt1827 * -222719641) << 28
		      | (long) (i_484_ << 14) | (long) i_483_);
	    Node node;
	    for (node
		     = ((Class137_Sub3) this).aClass692_9029.method8137(l);
		 node != null;
		 node = ((Class137_Sub3) this).aClass692_9029
				.method8143((short) 255)) {
		Class528_Sub10 class528_sub10 = (Class528_Sub10) node;
		if (((Class528_Sub10) class528_sub10).anInt10293 == i_483_
		    && (((Class528_Sub10) class528_sub10).aFloat10295
			== (float) i_484_)
		    && ((Class528_Sub10) class528_sub10).aClass164_10299
			   .method2085(class164, (short) 28240))
		    break;
	    }
	    if (node == null) {
		class528_sub10s[i_482_]
		    = new Class528_Sub10(this, i_483_, i_484_, class164);
		((Class137_Sub3) this).aClass692_9029
		    .method8142(class528_sub10s[i_482_], l);
	    } else
		class528_sub10s[i_482_] = (Class528_Sub10) node;
	}
	if (bool)
	    ((Class137_Sub3) this).aByteArrayArray8997[i][i_474_] |= 0x1;
	if (is_478_.length > ((Class137_Sub3) this).anInt9024)
	    ((Class137_Sub3) this).anInt9024 = is_478_.length;
	((Class137_Sub3) this).anInt9023 += is_478_.length;
    }
}
