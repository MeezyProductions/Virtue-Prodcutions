/* Class326_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class326_Sub3_Sub1 extends Class326_Sub3
{
    float[] aFloatArray11234;
    float[] aFloatArray11235;
    float[] aFloatArray11236;
    int anInt11237 = 0;
    
    void method9134() {
	((Class326_Sub3_Sub1) this).anInt11237 += -403743863;
    }
    
    float method9128(float f, float f_0_, float f_1_, int i) {
	float f_2_ = ((Class326_Sub3_Sub1) this).aFloat10060 / f;
	if (f_2_ < 0.0F)
	    f_2_ = 0.0F;
	if (f_2_ > 1.0F)
	    f_2_ = 1.0F;
	return (f
		/ (((Class326_Sub3_Sub1) this).aFloatArray11236
		   [((Class326_Sub3_Sub1) this).anInt11237 * 1350011577])
		* ((((Class326_Sub3_Sub1) this).aFloatArray11234
		    [((Class326_Sub3_Sub1) this).anInt11237 * 1350011577])
		   + ((((Class326_Sub3_Sub1) this).aFloatArray11235
		       [((Class326_Sub3_Sub1) this).anInt11237 * 1350011577])
		      - (((Class326_Sub3_Sub1) this).aFloatArray11234
			 [(((Class326_Sub3_Sub1) this).anInt11237
			   * 1350011577)])) * f_2_));
    }
    
    void method9129(int i) {
	((Class326_Sub3_Sub1) this).anInt11237 += -403743863;
    }
    
    void method9139(ByteBuffer class528_sub42, int i, byte i_3_) {
	((Class326_Sub3_Sub1) this).aFloatArray11234 = new float[i];
	((Class326_Sub3_Sub1) this).aFloatArray11235 = new float[i];
	((Class326_Sub3_Sub1) this).aFloatArray11236 = new float[i];
	((Class326_Sub3_Sub1) this).anInt11237 = 0;
	for (int i_4_ = 0; i_4_ < i; i_4_++) {
	    ((Class326_Sub3_Sub1) this).aFloatArray11234[i_4_]
		= class528_sub42.method9635(-1559382505);
	    ((Class326_Sub3_Sub1) this).aFloatArray11235[i_4_]
		= class528_sub42.method9635(-1377945062);
	    ((Class326_Sub3_Sub1) this).aFloatArray11236[i_4_]
		= class528_sub42.method9635(-1627747662);
	}
    }
    
    float method9133(float f, float f_5_, float f_6_) {
	float f_7_ = ((Class326_Sub3_Sub1) this).aFloat10060 / f;
	if (f_7_ < 0.0F)
	    f_7_ = 0.0F;
	if (f_7_ > 1.0F)
	    f_7_ = 1.0F;
	return (f
		/ (((Class326_Sub3_Sub1) this).aFloatArray11236
		   [((Class326_Sub3_Sub1) this).anInt11237 * 1350011577])
		* ((((Class326_Sub3_Sub1) this).aFloatArray11234
		    [((Class326_Sub3_Sub1) this).anInt11237 * 1350011577])
		   + ((((Class326_Sub3_Sub1) this).aFloatArray11235
		       [((Class326_Sub3_Sub1) this).anInt11237 * 1350011577])
		      - (((Class326_Sub3_Sub1) this).aFloatArray11234
			 [(((Class326_Sub3_Sub1) this).anInt11237
			   * 1350011577)])) * f_7_));
    }
    
    public Class326_Sub3_Sub1(Class283 class283) {
	super(class283);
    }
    
    void method9132(ByteBuffer class528_sub42, int i) {
	((Class326_Sub3_Sub1) this).aFloatArray11234 = new float[i];
	((Class326_Sub3_Sub1) this).aFloatArray11235 = new float[i];
	((Class326_Sub3_Sub1) this).aFloatArray11236 = new float[i];
	((Class326_Sub3_Sub1) this).anInt11237 = 0;
	for (int i_8_ = 0; i_8_ < i; i_8_++) {
	    ((Class326_Sub3_Sub1) this).aFloatArray11234[i_8_]
		= class528_sub42.method9635(-1685842340);
	    ((Class326_Sub3_Sub1) this).aFloatArray11235[i_8_]
		= class528_sub42.method9635(-1626640868);
	    ((Class326_Sub3_Sub1) this).aFloatArray11236[i_8_]
		= class528_sub42.method9635(-1593304970);
	}
    }
    
    void method9136(ByteBuffer class528_sub42, int i) {
	((Class326_Sub3_Sub1) this).aFloatArray11234 = new float[i];
	((Class326_Sub3_Sub1) this).aFloatArray11235 = new float[i];
	((Class326_Sub3_Sub1) this).aFloatArray11236 = new float[i];
	((Class326_Sub3_Sub1) this).anInt11237 = 0;
	for (int i_9_ = 0; i_9_ < i; i_9_++) {
	    ((Class326_Sub3_Sub1) this).aFloatArray11234[i_9_]
		= class528_sub42.method9635(-1551498827);
	    ((Class326_Sub3_Sub1) this).aFloatArray11235[i_9_]
		= class528_sub42.method9635(-1670524721);
	    ((Class326_Sub3_Sub1) this).aFloatArray11236[i_9_]
		= class528_sub42.method9635(-1540381653);
	}
    }
}
