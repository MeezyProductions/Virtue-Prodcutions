/* ItemStyleOverride - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ItemStyleOverride
{
    public int[] anIntArray105;
    static final int anInt106 = 1;
    static final int anInt107 = 2;
    static final int anInt108 = 4;
    public int[] anIntArray109 = new int[3];
    static final int anInt110 = 2;
    public int[] anIntArray111 = new int[3];
    public int[] anIntArray112 = new int[2];
    static final int anInt113 = 8;
    public short[] aShortArray114;
    public short[] aShortArray115;
    
    ItemStyleOverride(ItemType itemType) {
	anIntArray105 = new int[2];
	anIntArray109[0] = -432773855 * ((ItemType) itemType).anInt61;
	anIntArray109[1] = ((ItemType) itemType).anInt62 * -1888064087;
	anIntArray109[2] = ((ItemType) itemType).anInt32 * 1346281605;
	anIntArray111[0] = -861154921 * ((ItemType) itemType).anInt63;
	anIntArray111[1] = 934463075 * ((ItemType) itemType).anInt64;
	anIntArray111[2] = 2127708255 * ((ItemType) itemType).anInt66;
	anIntArray112[0] = -129749525 * ((ItemType) itemType).anInt73;
	anIntArray112[1] = 31399827 * ((ItemType) itemType).anInt74;
	anIntArray105[0] = 1812660549 * ((ItemType) itemType).anInt75;
	anIntArray105[1] = ((ItemType) itemType).anInt76 * 294798949;
	if (null != ((ItemType) itemType).aShortArray38) {
	    aShortArray114 = new short[((ItemType) itemType).aShortArray38.length];
	    System.arraycopy(((ItemType) itemType).aShortArray38, 0,
			     aShortArray114, 0, aShortArray114.length);
	}
	if (null != ((ItemType) itemType).aShortArray97) {
	    aShortArray115 = new short[((ItemType) itemType).aShortArray97.length];
	    System.arraycopy(((ItemType) itemType).aShortArray97, 0,
			     aShortArray115, 0, aShortArray115.length);
	}
    }
    
    public static int method531(int i, int i_0_) {
	int i_1_ = i >>> 1;
	i_1_ |= i_1_ >>> 1;
	i_1_ |= i_1_ >>> 2;
	i_1_ |= i_1_ >>> 4;
	i_1_ |= i_1_ >>> 8;
	i_1_ |= i_1_ >>> 16;
	return i & (i_1_ ^ 0xffffffff);
    }
    
    static final void method532(Class648 class648, int i) {
	int i_2_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_2_, (byte) 51);
	Class226 class226 = Class380.aClass226Array3970[i_2_ >> 16];
	Class287.method3865(class229, class226, class648, 1032974156);
    }
    
    static final void method533(Class648 class648, int i) {
	((Class648) class648).anInt8395 -= -1816921966;
	int i_3_ = (((Class648) class648).anIntArray8394
		    [717927929 * ((Class648) class648).anInt8395]);
	boolean bool = ((((Class648) class648).anIntArray8394
			 [1 + ((Class648) class648).anInt8395 * 717927929])
			== 1);
	if (!Class555.method6747(i_3_, bool, 1785445352))
	    throw new RuntimeException();
    }
}
