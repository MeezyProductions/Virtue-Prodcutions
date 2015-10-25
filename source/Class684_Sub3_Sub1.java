/* Class684_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class684_Sub3_Sub1 extends Class684_Sub3
{
    float[] aFloatArray11713;
    float[] aFloatArray11714;
    float[] aFloatArray11715;
    int anInt11716 = 0;
    
    void method10090() {
	((Class684_Sub3_Sub1) this).anInt11716 += -95378353;
    }
    
    void method10085(int i) {
	((Class684_Sub3_Sub1) this).anInt11716 += -95378353;
    }
    
    float method10088(float f, float f_0_, float f_1_, int i) {
	float f_2_ = ((Class684_Sub3_Sub1) this).aFloat10795 / f;
	if (f_2_ < 0.0F)
	    f_2_ = 0.0F;
	if (f_2_ > 1.0F)
	    f_2_ = 1.0F;
	return (((((Class684_Sub3_Sub1) this).aFloatArray11715
		  [((Class684_Sub3_Sub1) this).anInt11716 * -748424529])
		 + (f_2_
		    * ((((Class684_Sub3_Sub1) this).aFloatArray11714
			[-748424529 * ((Class684_Sub3_Sub1) this).anInt11716])
		       - (((Class684_Sub3_Sub1) this).aFloatArray11715
			  [(((Class684_Sub3_Sub1) this).anInt11716
			    * -748424529)]))))
		* (f
		   / (((Class684_Sub3_Sub1) this).aFloatArray11713
		      [-748424529 * ((Class684_Sub3_Sub1) this).anInt11716])));
    }
    
    void method10092(ByteBuffer class528_sub42, int i, int i_3_) {
	((Class684_Sub3_Sub1) this).aFloatArray11715 = new float[i];
	((Class684_Sub3_Sub1) this).aFloatArray11714 = new float[i];
	((Class684_Sub3_Sub1) this).aFloatArray11713 = new float[i];
	((Class684_Sub3_Sub1) this).anInt11716 = 0;
	for (int i_4_ = 0; i_4_ < i; i_4_++) {
	    ((Class684_Sub3_Sub1) this).aFloatArray11715[i_4_]
		= class528_sub42.method9635(-1865291862);
	    ((Class684_Sub3_Sub1) this).aFloatArray11714[i_4_]
		= class528_sub42.method9635(-1660533139);
	    ((Class684_Sub3_Sub1) this).aFloatArray11713[i_4_]
		= class528_sub42.method9635(-1398451481);
	}
    }
    
    float method10093(float f, float f_5_, float f_6_) {
	float f_7_ = ((Class684_Sub3_Sub1) this).aFloat10795 / f;
	if (f_7_ < 0.0F)
	    f_7_ = 0.0F;
	if (f_7_ > 1.0F)
	    f_7_ = 1.0F;
	return (((((Class684_Sub3_Sub1) this).aFloatArray11715
		  [((Class684_Sub3_Sub1) this).anInt11716 * -748424529])
		 + (f_7_
		    * ((((Class684_Sub3_Sub1) this).aFloatArray11714
			[-748424529 * ((Class684_Sub3_Sub1) this).anInt11716])
		       - (((Class684_Sub3_Sub1) this).aFloatArray11715
			  [(((Class684_Sub3_Sub1) this).anInt11716
			    * -748424529)]))))
		* (f
		   / (((Class684_Sub3_Sub1) this).aFloatArray11713
		      [-748424529 * ((Class684_Sub3_Sub1) this).anInt11716])));
    }
    
    public Class684_Sub3_Sub1(Class283 class283) {
	super(class283);
    }
    
    void method10095() {
	((Class684_Sub3_Sub1) this).anInt11716 += -95378353;
    }
    
    void method10094(ByteBuffer class528_sub42, int i) {
	((Class684_Sub3_Sub1) this).aFloatArray11715 = new float[i];
	((Class684_Sub3_Sub1) this).aFloatArray11714 = new float[i];
	((Class684_Sub3_Sub1) this).aFloatArray11713 = new float[i];
	((Class684_Sub3_Sub1) this).anInt11716 = 0;
	for (int i_8_ = 0; i_8_ < i; i_8_++) {
	    ((Class684_Sub3_Sub1) this).aFloatArray11715[i_8_]
		= class528_sub42.method9635(-1753972135);
	    ((Class684_Sub3_Sub1) this).aFloatArray11714[i_8_]
		= class528_sub42.method9635(-1661622385);
	    ((Class684_Sub3_Sub1) this).aFloatArray11713[i_8_]
		= class528_sub42.method9635(-1693777057);
	}
    }
}
