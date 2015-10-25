/* Class181_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class181_Sub17 extends Class181
{
    int anInt9839;
    int anInt9840;
    int anInt9841;
    
    public void method2675(byte i) {
	Class182 class182
	    = (Class185.aClass182Array2106
	       [-1318186771 * ((Class181_Sub17) this).anInt9841]);
	Class194 class194 = (Class185.aClass194Array2107
			     [-647058019 * ((Class181_Sub17) this).anInt9839]);
	class194.method2805(class182,
			    ((Class181_Sub17) this).anInt9840 * 383440955,
			    184526417);
    }
    
    public void method2681() {
	Class182 class182
	    = (Class185.aClass182Array2106
	       [-1318186771 * ((Class181_Sub17) this).anInt9841]);
	Class194 class194 = (Class185.aClass194Array2107
			     [-647058019 * ((Class181_Sub17) this).anInt9839]);
	class194.method2805(class182,
			    ((Class181_Sub17) this).anInt9840 * 383440955,
			    184526417);
    }
    
    Class181_Sub17(ByteBuffer class528_sub42) {
	super(class528_sub42);
	((Class181_Sub17) this).anInt9841
	    = class528_sub42.readUnsignedShort(-1067719347) * -1283011355;
	((Class181_Sub17) this).anInt9839
	    = class528_sub42.readUnsignedShort(-40334083) * 1798848693;
	((Class181_Sub17) this).anInt9840
	    = class528_sub42.readUnsignedByte((byte) 111) * -79544077;
    }
    
    public void method2678() {
	Class182 class182
	    = (Class185.aClass182Array2106
	       [-1318186771 * ((Class181_Sub17) this).anInt9841]);
	Class194 class194 = (Class185.aClass194Array2107
			     [-647058019 * ((Class181_Sub17) this).anInt9839]);
	class194.method2805(class182,
			    ((Class181_Sub17) this).anInt9840 * 383440955,
			    184526417);
    }
    
    static final void method8975(Class648 class648, byte i) {
	Class95.method1262(((Class645_Sub1)
			    ((Class648) class648).anInterface60_8408),
			   (((Class648) class648).anIntArray8394
			    [((((Class648) class648).anInt8395 -= 1239022665)
			      * 717927929)]),
			   true, 1881086062);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = (int) client.aFloatArray10888[0];
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = (int) client.aFloatArray10888[1];
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = (int) client.aFloatArray10888[2];
    }
    
    static final void method8976(Class229 class229, Class648 class648,
				 byte i) {
	((Class648) class648).anInt8395 -= -1816921966;
	int i_0_ = ((((Class648) class648).anIntArray8394
		     [717927929 * ((Class648) class648).anInt8395])
		    - 1);
	int i_1_ = (((Class648) class648).anIntArray8394
		    [((Class648) class648).anInt8395 * 717927929 + 1]);
	if (i_0_ < 0 || i_0_ > 9)
	    throw new RuntimeException();
	ByteBuffer.method9729(class229, i_0_, i_1_, class648, (byte) -22);
    }
    
    static final void method8977(Class648 class648, byte i) {
	Class684_Sub2.method10083((((Class648) class648)
				   .aClass645_Sub1_Sub2_Sub1_8409),
				  class648, (byte) -40);
    }
}
