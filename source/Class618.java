/* Class618 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class618
{
    public Interface65 anInterface65_8046;
    
    void method7377(ByteBuffer class528_sub42) {
	for (;;) {
	    int i = class528_sub42.readUnsignedByte((byte) 113);
	    if (i == 0)
		break;
	    if (i == 1)
		anInterface65_8046
		    = Class231.method3247(class528_sub42, 1026016612);
	}
    }
    
    void method7378(ByteBuffer class528_sub42, short i) {
	for (;;) {
	    int i_0_ = class528_sub42.readUnsignedByte((byte) 11);
	    if (i_0_ == 0)
		break;
	    if (i_0_ == 1)
		anInterface65_8046
		    = Class231.method3247(class528_sub42, 383090228);
	}
    }
    
    public Class618(Class446 class446) {
	byte[] is = class446.method5395((-2082684943
					 * Class606.aClass606_7925.anInt7921),
					-111923655);
	if (is != null)
	    method7378(new ByteBuffer(is), (short) 4402);
    }
    
    static final void method7379(Class648 class648, byte i) {
	if (Class18.aShortArray207 == null
	    || (Class181_Sub18.anInt9847 * 673772487
		>= Class552.anInt7428 * 939068291))
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= -1;
	else
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= (Class18.aShortArray207[(Class181_Sub18.anInt9847
					   += -1784226313) * 673772487 - 1]
		   & 0xffff);
    }
}
