/* Class528_Sub36 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.BitSet;
import java.util.Date;

public class Class528_Sub36 extends Node
{
    public int anInt10495;
    boolean aBool10496;
    public byte aByte10497;
    public Class305[] aClass305Array10498;
    int[] anIntArray10499;
    long aLong10500;
    public String aString10501;
    boolean aBool10502 = true;
    public byte aByte10503;
    
    public int method9519(String string, byte i) {
	for (int i_0_ = 0; i_0_ < 233946487 * anInt10495; i_0_++) {
	    if (aClass305Array10498[i_0_].aString3350.equalsIgnoreCase(string))
		return i_0_;
	}
	return -1;
    }
    
    public Class528_Sub36(ByteBuffer class528_sub42) {
	anInt10495 = 0;
	aString10501 = null;
	method9524(class528_sub42, -1944389393);
    }
    
    void method9520(int i) {
	anInt10495 -= -1631835065;
	if (233946487 * anInt10495 == 0)
	    aClass305Array10498 = null;
	else
	    System.arraycopy(aClass305Array10498, i + 1, aClass305Array10498,
			     i, anInt10495 * 233946487 - i);
	((Class528_Sub36) this).anIntArray10499 = null;
    }
    
    void method9521(Class305 class305, byte i) {
	if (aClass305Array10498 == null
	    || anInt10495 * 233946487 >= aClass305Array10498.length)
	    method9533(anInt10495 * 233946487 + 5, 2144802077);
	aClass305Array10498[(anInt10495 += -1631835065) * 233946487 - 1]
	    = class305;
	((Class528_Sub36) this).anIntArray10499 = null;
    }
    
    void method9522(int i, int i_1_) {
	anInt10495 -= -1631835065;
	if (233946487 * anInt10495 == 0)
	    aClass305Array10498 = null;
	else
	    System.arraycopy(aClass305Array10498, i + 1, aClass305Array10498,
			     i, anInt10495 * 233946487 - i);
	((Class528_Sub36) this).anIntArray10499 = null;
    }
    
    void method9523(int i) {
	if (aClass305Array10498 != null)
	    System.arraycopy(aClass305Array10498, 0,
			     aClass305Array10498 = new Class305[i], 0,
			     233946487 * anInt10495);
	else
	    aClass305Array10498 = new Class305[i];
    }
    
    void method9524(ByteBuffer class528_sub42, int i) {
	int i_2_ = class528_sub42.readUnsignedByte((byte) 39);
	if ((i_2_ & 0x1) != 0)
	    ((Class528_Sub36) this).aBool10496 = true;
	if (0 != (i_2_ & 0x2))
	    ((Class528_Sub36) this).aBool10502 = true;
	int i_3_ = 2;
	if ((i_2_ & 0x4) != 0)
	    i_3_ = class528_sub42.readUnsignedByte((byte) 35);
	aLong7107
	    = class528_sub42.method9633(771973092) * -9171965245836510057L;
	((Class528_Sub36) this).aLong10500
	    = class528_sub42.method9633(771973092) * 6691423751994405L;
	aString10501 = class528_sub42.readString(523619205);
	class528_sub42.readUnsignedByte((byte) 30);
	aByte10503 = class528_sub42.method9627(-2059232063);
	aByte10497 = class528_sub42.method9627(-1206174140);
	anInt10495 = class528_sub42.readUnsignedShort(-304257959) * -1631835065;
	if (233946487 * anInt10495 > 0) {
	    aClass305Array10498 = new Class305[233946487 * anInt10495];
	    for (int i_4_ = 0; i_4_ < anInt10495 * 233946487; i_4_++) {
		Class305 class305 = new Class305();
		if (((Class528_Sub36) this).aBool10496)
		    class528_sub42.method9633(771973092);
		if (((Class528_Sub36) this).aBool10502)
		    class305.aString3350
			= class528_sub42.readString(1026093597);
		class305.aByte3349 = class528_sub42.method9627(-1048086481);
		class305.anInt3348
		    = class528_sub42.readUnsignedShort(-1609438832) * 2915379;
		if (i_3_ >= 3)
		    class528_sub42.readUnsignedByte((byte) 8);
		aClass305Array10498[i_4_] = class305;
	    }
	}
    }
    
    void method9525(int i) {
	if (aClass305Array10498 != null)
	    System.arraycopy(aClass305Array10498, 0,
			     aClass305Array10498 = new Class305[i], 0,
			     233946487 * anInt10495);
	else
	    aClass305Array10498 = new Class305[i];
    }
    
    void method9526(int i) {
	if (aClass305Array10498 != null)
	    System.arraycopy(aClass305Array10498, 0,
			     aClass305Array10498 = new Class305[i], 0,
			     233946487 * anInt10495);
	else
	    aClass305Array10498 = new Class305[i];
    }
    
    void method9527(int i) {
	if (aClass305Array10498 != null)
	    System.arraycopy(aClass305Array10498, 0,
			     aClass305Array10498 = new Class305[i], 0,
			     233946487 * anInt10495);
	else
	    aClass305Array10498 = new Class305[i];
    }
    
    public int[] method9528(int i) {
	if (null == ((Class528_Sub36) this).anIntArray10499) {
	    String[] strings = new String[233946487 * anInt10495];
	    ((Class528_Sub36) this).anIntArray10499
		= new int[anInt10495 * 233946487];
	    for (int i_5_ = 0; i_5_ < anInt10495 * 233946487; i_5_++) {
		strings[i_5_] = aClass305Array10498[i_5_].aString3350;
		((Class528_Sub36) this).anIntArray10499[i_5_] = i_5_;
	    }
	    Class276.method3709(strings,
				((Class528_Sub36) this).anIntArray10499,
				1134321084);
	}
	return ((Class528_Sub36) this).anIntArray10499;
    }
    
    void method9529(int i) {
	if (aClass305Array10498 != null)
	    System.arraycopy(aClass305Array10498, 0,
			     aClass305Array10498 = new Class305[i], 0,
			     233946487 * anInt10495);
	else
	    aClass305Array10498 = new Class305[i];
    }
    
    static {
	new BitSet(65536);
    }
    
    void method9530(ByteBuffer class528_sub42) {
	int i = class528_sub42.readUnsignedByte((byte) 96);
	if ((i & 0x1) != 0)
	    ((Class528_Sub36) this).aBool10496 = true;
	if (0 != (i & 0x2))
	    ((Class528_Sub36) this).aBool10502 = true;
	int i_6_ = 2;
	if ((i & 0x4) != 0)
	    i_6_ = class528_sub42.readUnsignedByte((byte) 100);
	aLong7107
	    = class528_sub42.method9633(771973092) * -9171965245836510057L;
	((Class528_Sub36) this).aLong10500
	    = class528_sub42.method9633(771973092) * 6691423751994405L;
	aString10501 = class528_sub42.readString(2079390924);
	class528_sub42.readUnsignedByte((byte) 17);
	aByte10503 = class528_sub42.method9627(-1360058683);
	aByte10497 = class528_sub42.method9627(-1964391093);
	anInt10495 = class528_sub42.readUnsignedShort(-1096889185) * -1631835065;
	if (233946487 * anInt10495 > 0) {
	    aClass305Array10498 = new Class305[233946487 * anInt10495];
	    for (int i_7_ = 0; i_7_ < anInt10495 * 233946487; i_7_++) {
		Class305 class305 = new Class305();
		if (((Class528_Sub36) this).aBool10496)
		    class528_sub42.method9633(771973092);
		if (((Class528_Sub36) this).aBool10502)
		    class305.aString3350
			= class528_sub42.readString(772517259);
		class305.aByte3349 = class528_sub42.method9627(-1250070119);
		class305.anInt3348
		    = class528_sub42.readUnsignedShort(-290441896) * 2915379;
		if (i_6_ >= 3)
		    class528_sub42.readUnsignedByte((byte) 80);
		aClass305Array10498[i_7_] = class305;
	    }
	}
    }
    
    void method9531(int i) {
	anInt10495 -= -1631835065;
	if (233946487 * anInt10495 == 0)
	    aClass305Array10498 = null;
	else
	    System.arraycopy(aClass305Array10498, i + 1, aClass305Array10498,
			     i, anInt10495 * 233946487 - i);
	((Class528_Sub36) this).anIntArray10499 = null;
    }
    
    void method9532(int i) {
	anInt10495 -= -1631835065;
	if (233946487 * anInt10495 == 0)
	    aClass305Array10498 = null;
	else
	    System.arraycopy(aClass305Array10498, i + 1, aClass305Array10498,
			     i, anInt10495 * 233946487 - i);
	((Class528_Sub36) this).anIntArray10499 = null;
    }
    
    void method9533(int i, int i_8_) {
	if (aClass305Array10498 != null)
	    System.arraycopy(aClass305Array10498, 0,
			     aClass305Array10498 = new Class305[i], 0,
			     233946487 * anInt10495);
	else
	    aClass305Array10498 = new Class305[i];
    }
    
    void method9534(int i) {
	if (aClass305Array10498 != null)
	    System.arraycopy(aClass305Array10498, 0,
			     aClass305Array10498 = new Class305[i], 0,
			     233946487 * anInt10495);
	else
	    aClass305Array10498 = new Class305[i];
    }
    
    static boolean method9535(int i) {
	return Class298.aClass55_3261 != null;
    }
    
    static void method9536(long l) {
	Class38.aCalendar340.setTime(new Date(l));
    }
}
