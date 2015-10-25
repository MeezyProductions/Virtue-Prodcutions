/* Class231 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

class Class231 implements Iterator
{
    Class95_Sub1_Sub2 this$0;
    int anInt2574;
    public static int anInt2575;
    
    public void method3242() {
	throw new UnsupportedOperationException();
    }
    
    public boolean hasNext() {
	return (((Class231) this).anInt2574 * 1963323417
		< ((Class231) this).this$0.method62((short) 3553));
    }
    
    public Object next() {
	int i = (((Class231) this).anInt2574 += -1223529431) * 1963323417 - 1;
	Class142_Sub1 class142_sub1
	    = (Class142_Sub1) ((Class95_Sub1_Sub2) ((Class231) this).this$0)
				  .aClass186_11199.method2727((long) i);
	if (class142_sub1 != null)
	    return class142_sub1;
	return ((Class231) this).this$0.method10295(i, 1222691372);
    }
    
    Class231(Class95_Sub1_Sub2 class95_sub1_sub2) {
	((Class231) this).this$0 = class95_sub1_sub2;
    }
    
    public Object method3243() {
	int i = (((Class231) this).anInt2574 += -1223529431) * 1963323417 - 1;
	Class142_Sub1 class142_sub1
	    = (Class142_Sub1) ((Class95_Sub1_Sub2) ((Class231) this).this$0)
				  .aClass186_11199.method2727((long) i);
	if (class142_sub1 != null)
	    return class142_sub1;
	return ((Class231) this).this$0.method10295(i, 977027020);
    }
    
    public void method3244() {
	throw new UnsupportedOperationException();
    }
    
    public boolean method3245() {
	return (((Class231) this).anInt2574 * 1963323417
		< ((Class231) this).this$0.method62((short) 3553));
    }
    
    public void remove() {
	throw new UnsupportedOperationException();
    }
    
    public boolean method3246() {
	return (((Class231) this).anInt2574 * 1963323417
		< ((Class231) this).this$0.method62((short) 3553));
    }
    
    public static Interface65 method3247(ByteBuffer class528_sub42,
					 int i) {
	Class569 class569
	    = Class140.method1698(class528_sub42.readUnsignedByte((byte) 79),
				  1386279525);
	if (Class569.aClass569_7554 == class569)
	    return Class216.method3064(class528_sub42, (byte) 3);
	if (class569 == Class569.aClass569_7553)
	    return Class446.method5398(class528_sub42, 1557289212);
	if (class569 == Class569.aClass569_7555)
	    return Class698.method8210(class528_sub42, -1498139189);
	return null;
    }
    
    static final void method3248(Class648 class648, byte i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = 843027253 * Class181_Sub16.anInt9834;
    }
    
    static final void method3249(Class648 class648, int i) {
	((Class648) class648).anInt8395 -= 1239022665;
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class108.myPlayer.method10688
		  ((byte) 13).method6899(1899574518);
    }
    
    static final void method3250(Class648 class648, byte i) {
	int i_0_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = i_0_ ^ 0xffffffff;
    }
    
    static final void method3251(Class648 class648, byte i) {
	if (Class700.aBool8733 && Class207.aFrame2236 != null)
	    Class289.method3875(Class514.aClass528_Sub38_6967
				    .aClass691_Sub3_10593
				    .method9844((byte) 111),
				-1, -1, false, 2130003981);
	String string = (String) (((Class648) class648).anObjectArray8396
				  [(((Class648) class648).anInt8410
				    -= 1600226731) * -520794877]);
	boolean bool
	    = ((((Class648) class648).anIntArray8394
		[(((Class648) class648).anInt8395 -= 1239022665) * 717927929])
	       == 1);
	String string_1_
	    = new StringBuilder().append
		  (Player.method10932((byte) 16)).append
		  (string).toString();
	Class215.method3016(string_1_, bool, client.aBool10869, -1838926376);
    }
    
    static final void method3252(Class648 class648, byte i) {
	((Class648) class648).anInt8395 -= 661123364;
	client.aShort11148
	    = (short) (((Class648) class648).anIntArray8394
		       [717927929 * ((Class648) class648).anInt8395]);
	if (client.aShort11148 <= 0)
	    client.aShort11148 = (short) 1;
	client.aShort11149
	    = (short) (((Class648) class648).anIntArray8394
		       [717927929 * ((Class648) class648).anInt8395 + 1]);
	if (client.aShort11149 <= 0)
	    client.aShort11149 = (short) 32767;
	else if (client.aShort11149 < client.aShort11148)
	    client.aShort11149 = client.aShort11148;
	client.aShort10969
	    = (short) (((Class648) class648).anIntArray8394
		       [2 + ((Class648) class648).anInt8395 * 717927929]);
	if (client.aShort10969 <= 0)
	    client.aShort10969 = (short) 1;
	client.aShort11151
	    = (short) (((Class648) class648).anIntArray8394
		       [3 + ((Class648) class648).anInt8395 * 717927929]);
	if (client.aShort11151 <= 0)
	    client.aShort11151 = (short) 32767;
	else if (client.aShort11151 < client.aShort10969)
	    client.aShort11151 = client.aShort10969;
    }
}
