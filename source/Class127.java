/* Class127 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class127
{
    int[] anIntArray1566;
    Class528_Sub42_Sub1 aClass528_Sub42_Sub1_1567;
    Interface14 anInterface14_1568;
    Class122 aClass122_1569;
    Class122 aClass122_1570;
    int[] anIntArray1571;
    int anInt1572 = 64;
    int anInt1573 = 768;
    static float aFloat1574;
    int anInt1575;
    int anInt1576 = 1600;
    int[] anIntArray1577;
    Class122 aClass122_1578;
    float[] aFloatArray1579 = new float[16];
    Class511_Sub2_Sub1[][] aClass511_Sub2_Sub1ArrayArray1580;
    int anInt1581 = 64;
    int anInt1582;
    Class511_Sub2_Sub1[][] aClass511_Sub2_Sub1ArrayArray1583;
    
    void method1615(Class173_Sub2 class173_sub2, int i) {
	OpenGL.glGetFloatv(2982, ((Class127) this).aFloatArray1579, 0);
	float f = ((Class127) this).aFloatArray1579[0];
	float f_0_ = ((Class127) this).aFloatArray1579[4];
	float f_1_ = ((Class127) this).aFloatArray1579[8];
	float f_2_ = ((Class127) this).aFloatArray1579[1];
	float f_3_ = ((Class127) this).aFloatArray1579[5];
	float f_4_ = ((Class127) this).aFloatArray1579[9];
	float f_5_ = f + f_2_;
	float f_6_ = f_0_ + f_3_;
	float f_7_ = f_1_ + f_4_;
	float f_8_ = f - f_2_;
	float f_9_ = f_0_ - f_3_;
	float f_10_ = f_1_ - f_4_;
	float f_11_ = f_2_ - f;
	float f_12_ = f_3_ - f_0_;
	float f_13_ = f_4_ - f_1_;
	float[] fs = new float[3];
	float[] fs_14_ = new float[3];
	((Class173_Sub2) class173_sub2).aClass418_9501
	    .method5027(((Class173_Sub2) class173_sub2).aClass418_9486);
	((Class127) this).aClass528_Sub42_Sub1_1567.pointer = 0;
	if (((Class173_Sub2) class173_sub2).aBool9561) {
	    for (int i_15_ = i - 1; i_15_ >= 0; i_15_--) {
		int i_16_ = (((Class127) this).anIntArray1571[i_15_] > 64 ? 64
			     : ((Class127) this).anIntArray1571[i_15_]);
		if (i_16_ > 0) {
		    for (int i_17_ = i_16_ - 1; i_17_ >= 0; i_17_--) {
			Class511_Sub2_Sub1 class511_sub2_sub1
			    = (((Class127) this)
			       .aClass511_Sub2_Sub1ArrayArray1580[i_15_]
			       [i_17_]);
			int i_18_ = class511_sub2_sub1.anInt11513;
			byte i_19_ = (byte) (i_18_ >> 16);
			byte i_20_ = (byte) (i_18_ >> 8);
			byte i_21_ = (byte) i_18_;
			byte i_22_ = (byte) (i_18_ >>> 24);
			float f_23_
			    = (float) (class511_sub2_sub1.anInt11511 >> 12);
			float f_24_
			    = (float) (class511_sub2_sub1.anInt11512 >> 12);
			float f_25_
			    = (float) (class511_sub2_sub1.anInt11509 >> 12);
			int i_26_ = class511_sub2_sub1.anInt11508 >> 12;
			if (class511_sub2_sub1.aShort11516 != 0) {
			    ((Class173_Sub2) class173_sub2).aClass418_9502
				.method5000
				(class511_sub2_sub1.aShort11516, i_26_, i_26_,
				 0.0F, 0.0F, 0.0F);
			    ((Class173_Sub2) class173_sub2).aClass418_9502
				.method4974
				(((Class173_Sub2) class173_sub2)
				 .aClass418_9501);
			    ((Class173_Sub2) class173_sub2).aClass418_9502
				.method5030(1.0F, 0.0F, 0.0F, fs);
			    ((Class173_Sub2) class173_sub2).aClass418_9502
				.method5030(0.0F, 1.0F, 0.0F, fs_14_);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10615(0.0F);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10615(0.0F);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10615(f_23_ - fs[0] - fs_14_[0]);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10615(f_24_ - fs[1] - fs_14_[1]);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10615(f_25_ - fs[2] - fs_14_[2]);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.writeByte(i_19_, (byte) 52);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.writeByte(i_20_, (byte) -16);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.writeByte(i_21_, (byte) 6);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.writeByte(i_22_, (byte) -5);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10615(0.0F);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10615(1.0F);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10615(f_23_ - fs[0] + fs_14_[0]);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10615(f_24_ - fs[1] + fs_14_[1]);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10615(f_25_ - fs[2] + fs_14_[2]);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.writeByte(i_19_, (byte) -94);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.writeByte(i_20_, (byte) -60);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.writeByte(i_21_, (byte) -91);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.writeByte(i_22_, (byte) 26);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10615(1.0F);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10615(1.0F);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10615(f_23_ + fs[0] + fs_14_[0]);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10615(f_24_ + fs[1] + fs_14_[1]);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10615(f_25_ + fs[2] + fs_14_[2]);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.writeByte(i_19_, (byte) 1);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.writeByte(i_20_, (byte) -43);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.writeByte(i_21_, (byte) 4);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.writeByte(i_22_, (byte) -2);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10615(1.0F);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10615(0.0F);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10615(f_23_ + fs[0] - fs_14_[0]);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10615(f_24_ + fs[1] - fs_14_[1]);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10615(f_25_ + fs[2] - fs_14_[2]);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.writeByte(i_19_, (byte) -9);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.writeByte(i_20_, (byte) 54);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.writeByte(i_21_, (byte) -13);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.writeByte(i_22_, (byte) 73);
			} else {
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10615(0.0F);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10615(0.0F);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10615(f_23_ + f_5_ * (float) -i_26_);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10615(f_24_ + f_6_ * (float) -i_26_);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10615(f_25_ + f_7_ * (float) -i_26_);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.writeByte(i_19_, (byte) 78);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.writeByte(i_20_, (byte) -58);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.writeByte(i_21_, (byte) -102);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.writeByte(i_22_, (byte) 28);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10615(0.0F);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10615(1.0F);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10615(f_23_ + f_11_ * (float) i_26_);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10615(f_24_ + f_12_ * (float) i_26_);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10615(f_25_ + f_13_ * (float) i_26_);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.writeByte(i_19_, (byte) -94);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.writeByte(i_20_, (byte) -7);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.writeByte(i_21_, (byte) -3);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.writeByte(i_22_, (byte) -62);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10615(1.0F);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10615(1.0F);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10615(f_23_ + f_5_ * (float) i_26_);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10615(f_24_ + f_6_ * (float) i_26_);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10615(f_25_ + f_7_ * (float) i_26_);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.writeByte(i_19_, (byte) -24);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.writeByte(i_20_, (byte) -30);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.writeByte(i_21_, (byte) 7);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.writeByte(i_22_, (byte) 82);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10615(1.0F);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10615(0.0F);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10615(f_23_ + f_8_ * (float) i_26_);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10615(f_24_ + f_9_ * (float) i_26_);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10615(f_25_ + f_10_ * (float) i_26_);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.writeByte(i_19_, (byte) 13);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.writeByte(i_20_, (byte) -118);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.writeByte(i_21_, (byte) -56);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.writeByte(i_22_, (byte) -60);
			}
		    }
		    if (((Class127) this).anIntArray1571[i_15_] > 64) {
			int i_27_
			    = ((Class127) this).anIntArray1571[i_15_] - 64 - 1;
			for (int i_28_
				 = ((Class127) this).anIntArray1566[i_27_] - 1;
			     i_28_ >= 0; i_28_--) {
			    Class511_Sub2_Sub1 class511_sub2_sub1
				= (((Class127) this)
				   .aClass511_Sub2_Sub1ArrayArray1583[i_27_]
				   [i_28_]);
			    int i_29_ = class511_sub2_sub1.anInt11513;
			    byte i_30_ = (byte) (i_29_ >> 16);
			    byte i_31_ = (byte) (i_29_ >> 8);
			    byte i_32_ = (byte) i_29_;
			    byte i_33_ = (byte) (i_29_ >>> 24);
			    float f_34_
				= (float) (class511_sub2_sub1.anInt11511
					   >> 12);
			    float f_35_
				= (float) (class511_sub2_sub1.anInt11512
					   >> 12);
			    float f_36_
				= (float) (class511_sub2_sub1.anInt11509
					   >> 12);
			    int i_37_ = class511_sub2_sub1.anInt11508 >> 12;
			    if (class511_sub2_sub1.aShort11516 != 0) {
				((Class173_Sub2) class173_sub2)
				    .aClass418_9502.method5000
				    (class511_sub2_sub1.aShort11516, i_37_,
				     i_37_, 0.0F, 0.0F, 0.0F);
				((Class173_Sub2) class173_sub2)
				    .aClass418_9502.method4974
				    (((Class173_Sub2) class173_sub2)
				     .aClass418_9501);
				((Class173_Sub2) class173_sub2)
				    .aClass418_9502
				    .method5030(1.0F, 0.0F, 0.0F, fs);
				((Class173_Sub2) class173_sub2)
				    .aClass418_9502
				    .method5030(0.0F, 1.0F, 0.0F, fs_14_);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10615(0.0F);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10615(0.0F);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10615(f_34_ - fs[0] - fs_14_[0]);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10615(f_35_ - fs[1] - fs_14_[1]);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10615(f_36_ - fs[2] - fs_14_[2]);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .writeByte(i_30_, (byte) -84);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .writeByte(i_31_, (byte) 35);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .writeByte(i_32_, (byte) -79);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .writeByte(i_33_, (byte) 44);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10615(0.0F);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10615(1.0F);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10615(f_34_ - fs[0] + fs_14_[0]);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10615(f_35_ - fs[1] + fs_14_[1]);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10615(f_36_ - fs[2] + fs_14_[2]);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .writeByte(i_30_, (byte) 46);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .writeByte(i_31_, (byte) -36);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .writeByte(i_32_, (byte) 2);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .writeByte(i_33_, (byte) 11);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10615(1.0F);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10615(1.0F);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10615(f_34_ + fs[0] + fs_14_[0]);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10615(f_35_ + fs[1] + fs_14_[1]);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10615(f_36_ + fs[2] + fs_14_[2]);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .writeByte(i_30_, (byte) -34);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .writeByte(i_31_, (byte) -13);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .writeByte(i_32_, (byte) -14);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .writeByte(i_33_, (byte) -29);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10615(1.0F);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10615(0.0F);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10615(f_34_ + fs[0] - fs_14_[0]);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10615(f_35_ + fs[1] - fs_14_[1]);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10615(f_36_ + fs[2] - fs_14_[2]);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .writeByte(i_30_, (byte) -25);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .writeByte(i_31_, (byte) -13);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .writeByte(i_32_, (byte) 54);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .writeByte(i_33_, (byte) -48);
			    } else {
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10615(0.0F);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10615(0.0F);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10615
				    (f_34_ + f_5_ * (float) -i_37_);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10615
				    (f_35_ + f_6_ * (float) -i_37_);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10615
				    (f_36_ + f_7_ * (float) -i_37_);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .writeByte(i_30_, (byte) -76);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .writeByte(i_31_, (byte) -34);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .writeByte(i_32_, (byte) 20);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .writeByte(i_33_, (byte) -61);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10615(0.0F);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10615(1.0F);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10615
				    (f_34_ + f_11_ * (float) i_37_);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10615
				    (f_35_ + f_12_ * (float) i_37_);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10615
				    (f_36_ + f_13_ * (float) i_37_);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .writeByte(i_30_, (byte) -113);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .writeByte(i_31_, (byte) -93);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .writeByte(i_32_, (byte) 37);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .writeByte(i_33_, (byte) -69);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10615(1.0F);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10615(1.0F);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10615(f_34_ + f_5_ * (float) i_37_);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10615(f_35_ + f_6_ * (float) i_37_);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10615(f_36_ + f_7_ * (float) i_37_);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .writeByte(i_30_, (byte) -41);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .writeByte(i_31_, (byte) -21);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .writeByte(i_32_, (byte) 33);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .writeByte(i_33_, (byte) -100);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10615(1.0F);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10615(0.0F);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10615(f_34_ + f_8_ * (float) i_37_);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10615(f_35_ + f_9_ * (float) i_37_);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10615
				    (f_36_ + f_10_ * (float) i_37_);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .writeByte(i_30_, (byte) 67);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .writeByte(i_31_, (byte) -107);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .writeByte(i_32_, (byte) 72);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .writeByte(i_33_, (byte) -27);
			    }
			}
		    }
		}
	    }
	} else {
	    for (int i_38_ = i - 1; i_38_ >= 0; i_38_--) {
		int i_39_ = (((Class127) this).anIntArray1571[i_38_] > 64 ? 64
			     : ((Class127) this).anIntArray1571[i_38_]);
		if (i_39_ > 0) {
		    for (int i_40_ = i_39_ - 1; i_40_ >= 0; i_40_--) {
			Class511_Sub2_Sub1 class511_sub2_sub1
			    = (((Class127) this)
			       .aClass511_Sub2_Sub1ArrayArray1580[i_38_]
			       [i_40_]);
			int i_41_ = class511_sub2_sub1.anInt11513;
			byte i_42_ = (byte) (i_41_ >> 16);
			byte i_43_ = (byte) (i_41_ >> 8);
			byte i_44_ = (byte) i_41_;
			byte i_45_ = (byte) (i_41_ >>> 24);
			float f_46_
			    = (float) (class511_sub2_sub1.anInt11511 >> 12);
			float f_47_
			    = (float) (class511_sub2_sub1.anInt11512 >> 12);
			float f_48_
			    = (float) (class511_sub2_sub1.anInt11509 >> 12);
			int i_49_ = class511_sub2_sub1.anInt11508 >> 12;
			if (class511_sub2_sub1.aShort11516 != 0) {
			    ((Class173_Sub2) class173_sub2).aClass418_9502
				.method5000
				(class511_sub2_sub1.aShort11516, i_49_, i_49_,
				 0.0F, 0.0F, 0.0F);
			    ((Class173_Sub2) class173_sub2).aClass418_9502
				.method4974
				(((Class173_Sub2) class173_sub2)
				 .aClass418_9501);
			    ((Class173_Sub2) class173_sub2).aClass418_9502
				.method5030(1.0F, 0.0F, 0.0F, fs);
			    ((Class173_Sub2) class173_sub2).aClass418_9502
				.method5030(0.0F, 1.0F, 0.0F, fs_14_);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10614(0.0F);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10614(0.0F);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10614(f_46_ - fs[0] - fs_14_[0]);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10614(f_47_ - fs[1] - fs_14_[1]);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10614(f_48_ - fs[2] - fs_14_[2]);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.writeByte(i_42_, (byte) -48);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.writeByte(i_43_, (byte) -97);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.writeByte(i_44_, (byte) -61);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.writeByte(i_45_, (byte) 35);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10614(0.0F);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10614(1.0F);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10614(f_46_ - fs[0] + fs_14_[0]);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10614(f_47_ - fs[1] + fs_14_[1]);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10614(f_48_ - fs[2] + fs_14_[2]);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.writeByte(i_42_, (byte) 22);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.writeByte(i_43_, (byte) 58);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.writeByte(i_44_, (byte) -20);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.writeByte(i_45_, (byte) -51);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10614(1.0F);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10614(1.0F);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10614(f_46_ + fs[0] + fs_14_[0]);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10614(f_47_ + fs[1] + fs_14_[1]);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10614(f_48_ + fs[2] + fs_14_[2]);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.writeByte(i_42_, (byte) 66);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.writeByte(i_43_, (byte) 67);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.writeByte(i_44_, (byte) 28);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.writeByte(i_45_, (byte) 64);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10614(1.0F);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10614(0.0F);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10614(f_46_ + fs[0] - fs_14_[0]);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10614(f_47_ + fs[1] - fs_14_[1]);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10614(f_48_ + fs[2] - fs_14_[2]);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.writeByte(i_42_, (byte) -26);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.writeByte(i_43_, (byte) 4);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.writeByte(i_44_, (byte) -78);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.writeByte(i_45_, (byte) 29);
			} else {
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10614(0.0F);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10614(0.0F);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10614(f_46_ + f_5_ * (float) -i_49_);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10614(f_47_ + f_6_ * (float) -i_49_);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10614(f_48_ + f_7_ * (float) -i_49_);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.writeByte(i_42_, (byte) 13);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.writeByte(i_43_, (byte) -32);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.writeByte(i_44_, (byte) 5);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.writeByte(i_45_, (byte) 30);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10614(0.0F);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10614(1.0F);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10614(f_46_ + f_11_ * (float) i_49_);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10614(f_47_ + f_12_ * (float) i_49_);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10614(f_48_ + f_13_ * (float) i_49_);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.writeByte(i_42_, (byte) -72);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.writeByte(i_43_, (byte) 1);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.writeByte(i_44_, (byte) -26);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.writeByte(i_45_, (byte) 42);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10614(1.0F);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10614(1.0F);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10614(f_46_ + f_5_ * (float) i_49_);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10614(f_47_ + f_6_ * (float) i_49_);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10614(f_48_ + f_7_ * (float) i_49_);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.writeByte(i_42_, (byte) -92);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.writeByte(i_43_, (byte) -52);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.writeByte(i_44_, (byte) 63);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.writeByte(i_45_, (byte) -21);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10614(1.0F);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10614(0.0F);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10614(f_46_ + f_8_ * (float) i_49_);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10614(f_47_ + f_9_ * (float) i_49_);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.method10614(f_48_ + f_10_ * (float) i_49_);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.writeByte(i_42_, (byte) -44);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.writeByte(i_43_, (byte) 59);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.writeByte(i_44_, (byte) 58);
			    ((Class127) this).aClass528_Sub42_Sub1_1567
				.writeByte(i_45_, (byte) 13);
			}
		    }
		    if (((Class127) this).anIntArray1571[i_38_] > 64) {
			int i_50_
			    = ((Class127) this).anIntArray1571[i_38_] - 64 - 1;
			for (int i_51_
				 = ((Class127) this).anIntArray1566[i_50_] - 1;
			     i_51_ >= 0; i_51_--) {
			    Class511_Sub2_Sub1 class511_sub2_sub1
				= (((Class127) this)
				   .aClass511_Sub2_Sub1ArrayArray1583[i_50_]
				   [i_51_]);
			    int i_52_ = class511_sub2_sub1.anInt11513;
			    byte i_53_ = (byte) (i_52_ >> 16);
			    byte i_54_ = (byte) (i_52_ >> 8);
			    byte i_55_ = (byte) i_52_;
			    byte i_56_ = (byte) (i_52_ >>> 24);
			    float f_57_
				= (float) (class511_sub2_sub1.anInt11511
					   >> 12);
			    float f_58_
				= (float) (class511_sub2_sub1.anInt11512
					   >> 12);
			    float f_59_
				= (float) (class511_sub2_sub1.anInt11509
					   >> 12);
			    int i_60_ = class511_sub2_sub1.anInt11508 >> 12;
			    if (class511_sub2_sub1.aShort11516 != 0) {
				((Class173_Sub2) class173_sub2)
				    .aClass418_9502.method5000
				    (class511_sub2_sub1.aShort11516, i_60_,
				     i_60_, 0.0F, 0.0F, 0.0F);
				((Class173_Sub2) class173_sub2)
				    .aClass418_9502.method4974
				    (((Class173_Sub2) class173_sub2)
				     .aClass418_9501);
				((Class173_Sub2) class173_sub2)
				    .aClass418_9502
				    .method5030(1.0F, 0.0F, 0.0F, fs);
				((Class173_Sub2) class173_sub2)
				    .aClass418_9502
				    .method5030(0.0F, 1.0F, 0.0F, fs_14_);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10614(0.0F);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10614(0.0F);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10614(f_57_ - fs[0] - fs_14_[0]);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10614(f_58_ - fs[1] - fs_14_[1]);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10614(f_59_ - fs[2] - fs_14_[2]);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .writeByte(i_53_, (byte) 77);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .writeByte(i_54_, (byte) -89);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .writeByte(i_55_, (byte) 54);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .writeByte(i_56_, (byte) 5);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10614(0.0F);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10614(1.0F);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10614(f_57_ - fs[0] + fs_14_[0]);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10614(f_58_ - fs[1] + fs_14_[1]);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10614(f_59_ - fs[2] + fs_14_[2]);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .writeByte(i_53_, (byte) -104);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .writeByte(i_54_, (byte) 1);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .writeByte(i_55_, (byte) -12);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .writeByte(i_56_, (byte) 55);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10614(1.0F);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10614(1.0F);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10614(f_57_ + fs[0] + fs_14_[0]);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10614(f_58_ + fs[1] + fs_14_[1]);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10614(f_59_ + fs[2] + fs_14_[2]);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .writeByte(i_53_, (byte) 28);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .writeByte(i_54_, (byte) 39);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .writeByte(i_55_, (byte) 54);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .writeByte(i_56_, (byte) -5);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10614(1.0F);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10614(0.0F);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10614(f_57_ + fs[0] - fs_14_[0]);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10614(f_58_ + fs[1] - fs_14_[1]);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10614(f_59_ + fs[2] - fs_14_[2]);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .writeByte(i_53_, (byte) 47);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .writeByte(i_54_, (byte) -50);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .writeByte(i_55_, (byte) 59);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .writeByte(i_56_, (byte) 41);
			    } else {
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10614(0.0F);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10614(0.0F);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10614
				    (f_57_ + f_5_ * (float) -i_60_);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10614
				    (f_58_ + f_6_ * (float) -i_60_);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10614
				    (f_59_ + f_7_ * (float) -i_60_);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .writeByte(i_53_, (byte) -8);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .writeByte(i_54_, (byte) -17);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .writeByte(i_55_, (byte) 81);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .writeByte(i_56_, (byte) -29);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10614(0.0F);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10614(1.0F);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10614
				    (f_57_ + f_11_ * (float) i_60_);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10614
				    (f_58_ + f_12_ * (float) i_60_);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10614
				    (f_59_ + f_13_ * (float) i_60_);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .writeByte(i_53_, (byte) 95);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .writeByte(i_54_, (byte) -22);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .writeByte(i_55_, (byte) -42);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .writeByte(i_56_, (byte) -12);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10614(1.0F);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10614(1.0F);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10614(f_57_ + f_5_ * (float) i_60_);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10614(f_58_ + f_6_ * (float) i_60_);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10614(f_59_ + f_7_ * (float) i_60_);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .writeByte(i_53_, (byte) -40);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .writeByte(i_54_, (byte) -102);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .writeByte(i_55_, (byte) -78);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .writeByte(i_56_, (byte) -40);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10614(1.0F);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10614(0.0F);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10614(f_57_ + f_8_ * (float) i_60_);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10614(f_58_ + f_9_ * (float) i_60_);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .method10614
				    (f_59_ + f_10_ * (float) i_60_);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .writeByte(i_53_, (byte) -8);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .writeByte(i_54_, (byte) -9);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .writeByte(i_55_, (byte) -91);
				((Class127) this).aClass528_Sub42_Sub1_1567
				    .writeByte(i_56_, (byte) 0);
			    }
			}
		    }
		}
	    }
	}
	if (((Class127) this).aClass528_Sub42_Sub1_1567.pointer * -185904669
	    != 0) {
	    ((Class127) this).anInterface14_1568.method70
		(24,
		 ((Class127) this).aClass528_Sub42_Sub1_1567.payload,
		 (((Class127) this).aClass528_Sub42_Sub1_1567.pointer
		  * -185904669));
	    class173_sub2.method8779(((Class127) this).aClass122_1569, null,
				     ((Class127) this).aClass122_1570,
				     ((Class127) this).aClass122_1578);
	    class173_sub2.method8768(7, 0, (((Class127) this)
					    .aClass528_Sub42_Sub1_1567
					    .pointer) * -185904669 / 24);
	}
    }
    
    void method1616(Class173_Sub2 class173_sub2, Class171 class171) {
	if (((Class173_Sub2) class173_sub2).aClass418_9485 != null) {
	    method1617(class173_sub2);
	    float f = (((Class173_Sub2) class173_sub2).aClass418_9485
		       .aFloatArray4768[2]);
	    float f_61_ = (((Class173_Sub2) class173_sub2).aClass418_9485
			   .aFloatArray4768[6]);
	    float f_62_ = (((Class173_Sub2) class173_sub2).aClass418_9485
			   .aFloatArray4768[10]);
	    float f_63_ = (((Class173_Sub2) class173_sub2).aClass418_9485
			   .aFloatArray4768[14]);
	    try {
		int i = 0;
		int i_64_ = 2147483647;
		int i_65_ = 0;
		Class511_Sub2 class511_sub2
		    = class171.aClass685_1959.aClass511_Sub2_8608;
		for (Class511_Sub2 class511_sub2_66_
			 = class511_sub2.aClass511_Sub2_10263;
		     class511_sub2_66_ != class511_sub2;
		     class511_sub2_66_
			 = class511_sub2_66_.aClass511_Sub2_10263) {
		    Class511_Sub2_Sub1 class511_sub2_sub1
			= (Class511_Sub2_Sub1) class511_sub2_66_;
		    int i_67_
			= (int) (f * (float) (class511_sub2_sub1.anInt11511
					      >> 12)
				 + (f_61_
				    * (float) (class511_sub2_sub1.anInt11512
					       >> 12))
				 + (f_62_
				    * (float) (class511_sub2_sub1.anInt11509
					       >> 12))
				 + f_63_);
		    if (i_67_ > i_65_)
			i_65_ = i_67_;
		    if (i_67_ < i_64_)
			i_64_ = i_67_;
		    ((Class127) this).anIntArray1577[i++] = i_67_;
		}
		int i_68_ = i_65_ - i_64_;
		int i_69_;
		if (i_68_ + 2 > 1600) {
		    i_69_ = (1 + Class296.method3974(i_68_, 1782252685)
			     - ((Class127) this).anInt1575);
		    i_68_ = (i_68_ >> i_69_) + 2;
		} else {
		    i_69_ = 0;
		    i_68_ += 2;
		}
		Class511_Sub2 class511_sub2_70_
		    = class511_sub2.aClass511_Sub2_10263;
		i = 0;
		int i_71_ = -2;
		boolean bool = true;
		boolean bool_72_ = true;
		while (class511_sub2_70_ != class511_sub2) {
		    ((Class127) this).anInt1582 = 0;
		    for (int i_73_ = 0; i_73_ < i_68_; i_73_++)
			((Class127) this).anIntArray1571[i_73_] = 0;
		    for (int i_74_ = 0; i_74_ < 64; i_74_++)
			((Class127) this).anIntArray1566[i_74_] = 0;
		    for (/**/; class511_sub2_70_ != class511_sub2;
			 class511_sub2_70_
			     = class511_sub2_70_.aClass511_Sub2_10263) {
			Class511_Sub2_Sub1 class511_sub2_sub1
			    = (Class511_Sub2_Sub1) class511_sub2_70_;
			if (bool_72_) {
			    i_71_ = class511_sub2_sub1.anInt11515;
			    bool = class511_sub2_sub1.aBool11510;
			    bool_72_ = false;
			}
			if (i > 0
			    && (i_71_ != class511_sub2_sub1.anInt11515
				|| bool != class511_sub2_sub1.aBool11510)) {
			    bool_72_ = true;
			    break;
			}
			int i_75_
			    = (((Class127) this).anIntArray1577[i++] - i_64_
			       >> i_69_);
			if (i_75_ < 1600) {
			    if (((Class127) this).anIntArray1571[i_75_] < 64)
				((Class127) this)
				    .aClass511_Sub2_Sub1ArrayArray1580[i_75_]
				    [((Class127) this).anIntArray1571[i_75_]++]
				    = class511_sub2_sub1;
			    else {
				if (((Class127) this).anIntArray1571[i_75_]
				    == 64) {
				    if (((Class127) this).anInt1582 == 64)
					continue;
				    ((Class127) this).anIntArray1571[i_75_]
					+= 1 + ((Class127) this).anInt1582++;
				}
				((Class127) this)
				    .aClass511_Sub2_Sub1ArrayArray1583
				    [(((Class127) this).anIntArray1571[i_75_]
				      - 64 - 1)]
				    [((Class127) this).anIntArray1566
					 [(((Class127) this).anIntArray1571
					   [i_75_]) - 64 - 1]++]
				    = class511_sub2_sub1;
			    }
			}
		    }
		    if (i_71_ >= 0)
			class173_sub2.method8840(i_71_);
		    else
			class173_sub2.method8840(-1);
		    if (bool && (((Class173_Sub2) class173_sub2).aFloat9527
				 != aFloat1574))
			class173_sub2.method2477(aFloat1574);
		    else if (((Class173_Sub2) class173_sub2).aFloat9527
			     != 1.0F)
			class173_sub2.method2477(1.0F);
		    method1615(class173_sub2, i_68_);
		}
	    } catch (Exception exception) {
		/* empty */
	    }
	    method1618(class173_sub2);
	}
    }
    
    void method1617(Class173_Sub2 class173_sub2) {
	aFloat1574 = ((Class173_Sub2) class173_sub2).aFloat9527;
	class173_sub2.method8772();
	OpenGL.glDisable(16384);
	OpenGL.glDisable(16385);
	class173_sub2.method8787(false);
	OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }
    
    void method1618(Class173_Sub2 class173_sub2) {
	class173_sub2.method8787(true);
	OpenGL.glEnable(16384);
	OpenGL.glEnable(16385);
	if (((Class173_Sub2) class173_sub2).aFloat9527 != aFloat1574)
	    class173_sub2.method2477(aFloat1574);
    }
    
    void method1619(Class173_Sub2 class173_sub2) {
	((Class127) this).anInterface14_1568
	    = class173_sub2.method8770(24, null, 196584, true);
	((Class127) this).aClass122_1578
	    = new Class122(((Class127) this).anInterface14_1568, 5126, 2, 0);
	((Class127) this).aClass122_1569
	    = new Class122(((Class127) this).anInterface14_1568, 5126, 3, 8);
	((Class127) this).aClass122_1570
	    = new Class122(((Class127) this).anInterface14_1568, 5121, 4, 20);
    }
    
    Class127() {
	((Class127) this).aClass528_Sub42_Sub1_1567
	    = new Class528_Sub42_Sub1(786336);
	((Class127) this).anInt1572 = 64;
	((Class127) this).anInt1573 = 768;
	((Class127) this).anInt1576 = 1600;
	((Class127) this).anInt1575 = Class296.method3974(1600, 182688324);
	((Class127) this).anInt1581 = 64;
	((Class127) this).anIntArray1577 = new int[8191];
	((Class127) this).anIntArray1571 = new int[1600];
	((Class127) this).anIntArray1566 = new int[64];
	((Class127) this).aClass511_Sub2_Sub1ArrayArray1580
	    = new Class511_Sub2_Sub1[1600][64];
	((Class127) this).aClass511_Sub2_Sub1ArrayArray1583
	    = new Class511_Sub2_Sub1[64][768];
	((Class127) this).anInt1582 = 0;
    }
}
