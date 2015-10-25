/* Class652 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class652
{
    volatile String aString8425;
    public volatile int anInt8426 = -378725879;
    static Class528_Sub21_Sub17 aClass528_Sub21_Sub17_8427;
    
    Class652(String string) {
	((Class652) this).aString8425 = string;
    }
    
    static final void method7750(Class648 class648, int i)
	throws Exception_Sub3 {
	VarDefinition varDefinition
	    = (VarDefinition) (((Class648) class648).aClass528_Sub21_Sub14_8397
			  .anObjectArray11622
			  [-630179809 * ((Class648) class648).anInt8390]);
	Interface17 interface17
	    = ((Interface17)
	       ((((Class648) class648).anIntArray8414
		 [((Class648) class648).anInt8390 * -630179809]) == 0
		? ((Class648) class648).aMap8417
		      .get(varDefinition.aClass142_3415.aClass445_1639)
		: ((Class648) class648).aMap8411
		      .get(varDefinition.aClass142_3415.aClass445_1639)));
	try {
	    interface17.method98(varDefinition,
				 (((Class648) class648).anIntArray8394
				  [(((Class648) class648).anInt8395
				    -= 1239022665) * 717927929]),
				 (byte) 40);
	} catch (Exception_Sub3 exception_sub3) {
	    if (interface17 instanceof Class586)
		Class181.method2684(class648, Class496.aClass496_5583,
				    exception_sub3, "VO", 1876505537);
	    else
		throw exception_sub3;
	}
    }
    
    static final void method7751(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = client.anInt11061 * -1666902517;
    }
    
    static final void method7752(Class648 class648, byte i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = (int) (Class181_Sub6.aLong9795 * 6358733121381632681L / 60000L);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = (int) ((Class181_Sub6.aLong9795 * 6358733121381632681L
		      - Class249.method3417(2066575319)
		      - Class521.aLong7049 * -6606547335572370207L)
		     / 60000L);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class669.aBool8523 ? 1 : 0;
    }
    
    static Class528_Sub21_Sub17 method7753(ByteBuffer class528_sub42,
					   int i, int i_0_) {
	Class528_Sub21_Sub17 class528_sub21_sub17
	    = new Class528_Sub21_Sub17(i,
				       class528_sub42.readString(1155859794),
				       class528_sub42.readString(1191968006),
				       class528_sub42.readInt(-1628580240),
				       class528_sub42.readInt(532197417),
				       (class528_sub42.readUnsignedByte((byte) 99)
					== 1),
				       class528_sub42.readUnsignedByte((byte) 79),
				       class528_sub42.readUnsignedByte((byte) 24));
	int i_1_ = class528_sub42.readUnsignedByte((byte) 106);
	for (int i_2_ = 0; i_2_ < i_1_; i_2_++)
	    ((Class528_Sub21_Sub17) class528_sub21_sub17).aClass688_11637
		.method8031
		(new Class528_Sub20(class528_sub42.readUnsignedByte((byte) 79),
				    class528_sub42.readUnsignedShort(636304808),
				    class528_sub42.readUnsignedShort(-1863474994),
				    class528_sub42.readUnsignedShort(-599446970),
				    class528_sub42.readUnsignedShort(-1897844031),
				    class528_sub42.readUnsignedShort(-1971408300),
				    class528_sub42.readUnsignedShort(-686468306),
				    class528_sub42.readUnsignedShort(-247750281),
				    class528_sub42.readUnsignedShort(-445698443)),
		 (byte) 95);
	class528_sub21_sub17.method10587(35591786);
	return class528_sub21_sub17;
    }
}
