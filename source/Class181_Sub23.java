/* Class181_Sub23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class181_Sub23 extends Class181
{
    int anInt9874;
    int anInt9875;
    int anInt9876;
    int anInt9877;
    Class469 aClass469_9878;
    public static Class446 aClass446_9879;
    static Class682 aClass682_9880;
    
    public void method2675(byte i) {
	if (null != ((Class181_Sub23) this).aClass469_9878)
	    ((Class181_Sub23) this).aClass469_9878.method5741((byte) -125);
    }
    
    Class181_Sub23(ByteBuffer class528_sub42) {
	super(class528_sub42);
	((Class181_Sub23) this).anInt9875
	    = class528_sub42.readUnsignedShort(-844919322) * 203130143;
	((Class181_Sub23) this).anInt9877
	    = class528_sub42.readUnsignedByte((byte) 8) * -1747133259;
	((Class181_Sub23) this).anInt9874
	    = class528_sub42.readUnsignedByte((byte) 117) * 203420583;
	((Class181_Sub23) this).anInt9876
	    = class528_sub42.readUnsignedByte((byte) 18) * -1771958597;
	((Class181_Sub23) this).aClass469_9878
	    = (Class365.aClass218_3848.method3103
	       (Class196.aClass196_2192, this,
		1966978783 * ((Class181_Sub23) this).anInt9875,
		-2036267405 * ((Class181_Sub23) this).anInt9876,
		((Class181_Sub23) this).anInt9877 * -1193922147,
		Class188.aClass188_2130.method2758(-1560776500),
		Class202.aClass202_2211, 0.0F, 0.0F, null, 0,
		-2140568553 * ((Class181_Sub23) this).anInt9874, false,
		1796970287));
	if (((Class181_Sub23) this).aClass469_9878 != null)
	    ((Class181_Sub23) this).aClass469_9878.method5740((byte) -92);
    }
    
    void method2676(byte i) {
	if (null != ((Class181_Sub23) this).aClass469_9878) {
	    ((Class181_Sub23) this).aClass469_9878.method5742(50, 2023054215);
	    Class365.aClass218_3848.method3101((((Class181_Sub23) this)
						.aClass469_9878),
					       1330344124);
	    ((Class181_Sub23) this).aClass469_9878 = null;
	}
    }
    
    public void method2681() {
	if (null != ((Class181_Sub23) this).aClass469_9878)
	    ((Class181_Sub23) this).aClass469_9878.method5741((byte) -125);
    }
    
    public void method2678() {
	if (null != ((Class181_Sub23) this).aClass469_9878)
	    ((Class181_Sub23) this).aClass469_9878.method5741((byte) -125);
    }
    
    void method2682() {
	if (null != ((Class181_Sub23) this).aClass469_9878) {
	    ((Class181_Sub23) this).aClass469_9878.method5742(50, 2144125697);
	    Class365.aClass218_3848.method3101((((Class181_Sub23) this)
						.aClass469_9878),
					       1437559075);
	    ((Class181_Sub23) this).aClass469_9878 = null;
	}
    }
    
    void method2674() {
	if (null != ((Class181_Sub23) this).aClass469_9878) {
	    ((Class181_Sub23) this).aClass469_9878.method5742(50, 2077988103);
	    Class365.aClass218_3848.method3101((((Class181_Sub23) this)
						.aClass469_9878),
					       1119472341);
	    ((Class181_Sub23) this).aClass469_9878 = null;
	}
    }
    
    static final Object[] method8999(String string, Class648 class648,
				     byte i) {
	Object[] objects = new Object[string.length() + 1];
	for (int i_0_ = objects.length - 1; i_0_ >= 1; i_0_--) {
	    if (string.charAt(i_0_ - 1) == 's')
		objects[i_0_] = (((Class648) class648).anObjectArray8396
				 [(((Class648) class648).anInt8410
				   -= 1600226731) * -520794877]);
	    else if (string.charAt(i_0_ - 1) == 'l')
		objects[i_0_] = new Long(((Class648) class648).aLongArray8398
					 [(((Class648) class648).anInt8399
					   -= 232005975) * 683825767]);
	    else
		objects[i_0_]
		    = new Integer(((Class648) class648).anIntArray8394
				  [(((Class648) class648).anInt8395
				    -= 1239022665) * 717927929]);
	}
	int i_1_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	if (-1 != i_1_)
	    objects[0] = new Integer(i_1_);
	else
	    objects = null;
	return objects;
    }
}
