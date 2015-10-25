/* Class684 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class684
{
    Class283 aClass283_8607;
    
    Class684(Class283 class283) {
	((Class684) this).aClass283_8607 = class283;
    }
    
    public abstract Class422 method7985();
    
    public abstract boolean method7986(int i);
    
    public abstract Class422 method7987(int i);
    
    public abstract Class422 method7988(int i);
    
    public abstract void method7989(Class284 class284, Class433 class433,
				    int i, int i_0_, float f, short i_1_);
    
    public abstract void method7990(ByteBuffer class528_sub42, int i);
    
    public abstract void method7991(float f);
    
    public abstract Class422 method7992();
    
    public abstract void method7993(float f);
    
    public abstract void method7994(float f);
    
    public abstract boolean method7995();
    
    public abstract void method7996(Class284 class284, Class433 class433,
				    int i, int i_2_, float f);
    
    public abstract void method7997(Class284 class284, Class433 class433,
				    int i, int i_3_, float f);
    
    public abstract Class422 method7998();
    
    public abstract void method7999(float f);
    
    public abstract Class422 method8000();
    
    public abstract Class422 method8001();
    
    public abstract void method8002(ByteBuffer class528_sub42);
    
    public abstract void method8003(ByteBuffer class528_sub42);
    
    public abstract void method8004(float f, int i);
    
    public abstract void method8005(ByteBuffer class528_sub42);
    
    static final void method8006(Class648 class648, int i) {
	if (!Class181.method2686(-1712965615))
	    Class223.method3159(-406558126);
    }
    
    public static Class1 method8007(Class446 class446, int i, int i_4_,
				    Interface75 interface75, short i_5_) {
	byte[] is = class446.method5348(i, i_4_, -1973230992);
	if (null == is)
	    return null;
	return new Class1(is, interface75);
    }
    
    static final void method8008(Class648 class648, int i) {
	((Class648) class648).anInt8395 -= 661123364;
	int i_6_ = (((Class648) class648).anIntArray8394
		    [((Class648) class648).anInt8395 * 717927929]);
	int i_7_ = (((Class648) class648).anIntArray8394
		    [717927929 * ((Class648) class648).anInt8395 + 1]);
	int i_8_ = (((Class648) class648).anIntArray8394
		    [((Class648) class648).anInt8395 * 717927929 + 2]);
	int i_9_ = (((Class648) class648).anIntArray8394
		    [((Class648) class648).anInt8395 * 717927929 + 3]);
	Class578 class578 = client.aClass495_10935.method5966(1273279609);
	Class181_Sub15.method8967(((i_6_ >> 14 & 0x3fff)
				   - class578.anInt7607 * 961465569),
				  ((i_6_ & 0x3fff)
				   - class578.anInt7608 * -173815201),
				  i_7_ << 2, i_8_, i_9_, false, (byte) 16);
	client.aBool10982 = true;
    }
}
