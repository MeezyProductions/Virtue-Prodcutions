/* Class551 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public abstract class Class551
{
    public static Class5_Sub17 aClass5_Sub17_7422;
    
    public abstract int method6689(byte[] is, int i, int i_0_, int i_1_)
	throws IOException;
    
    public abstract boolean method6690(int i, int i_2_) throws IOException;
    
    public abstract int method6691(int i) throws IOException;
    
    public abstract void method6692(byte[] is, int i, int i_3_)
	throws IOException;
    
    public abstract void method6693(byte[] is, int i, int i_4_, byte i_5_)
	throws IOException;
    
    public abstract void method6694(int i);
    
    public abstract void method6695(int i);
    
    public abstract void method6696();
    
    public abstract boolean method6697(int i) throws IOException;
    
    public abstract boolean method6698(int i) throws IOException;
    
    public abstract int method6699() throws IOException;
    
    public abstract int method6700(byte[] is, int i, int i_6_)
	throws IOException;
    
    public abstract int method6701(byte[] is, int i, int i_7_)
	throws IOException;
    
    public abstract int method6702() throws IOException;
    
    public abstract void method6703();
    
    public abstract void method6704();
    
    Class551() {
	/* empty */
    }
    
    public abstract boolean method6705(int i) throws IOException;
    
    public abstract void method6706();
    
    static ItemStyleOverride method6707(ItemType itemType, ByteBuffer class528_sub42,
			     int i, int i_8_) {
	ItemStyleOverride itemStyleOverride = new ItemStyleOverride(itemType);
	int i_9_ = class528_sub42.readUnsignedByte((byte) 29);
	boolean bool = (i_9_ & 0x1) != 0;
	boolean bool_10_ = (i_9_ & 0x2) != 0;
	boolean bool_11_ = (i_9_ & 0x4) != 0;
	boolean bool_12_ = 0 != (i_9_ & 0x8);
	if (bool) {
	    if (i <= 1) {
		itemStyleOverride.anIntArray109[0] = class528_sub42.readUnsignedShort(169776354);
		itemStyleOverride.anIntArray111[0]
		    = class528_sub42.readUnsignedShort(-648290070);
	    } else {
		itemStyleOverride.anIntArray109[0]
		    = class528_sub42.method9645((short) -6285);
		itemStyleOverride.anIntArray111[0]
		    = class528_sub42.method9645((short) -3130);
	    }
	    if (((ItemType) itemType).anInt62 * -1888064087 != -1
		|| -1 != ((ItemType) itemType).anInt64 * 934463075) {
		if (i <= 1) {
		    itemStyleOverride.anIntArray109[1]
			= class528_sub42.readUnsignedShort(-1148961413);
		    itemStyleOverride.anIntArray111[1]
			= class528_sub42.readUnsignedShort(-965960045);
		} else {
		    itemStyleOverride.anIntArray109[1]
			= class528_sub42.method9645((short) 31327);
		    itemStyleOverride.anIntArray111[1]
			= class528_sub42.method9645((short) 3547);
		}
	    }
	    if (((ItemType) itemType).anInt32 * 1346281605 != -1
		|| -1 != 2127708255 * ((ItemType) itemType).anInt66) {
		if (i <= 1) {
		    itemStyleOverride.anIntArray109[2]
			= class528_sub42.readUnsignedShort(-609441304);
		    itemStyleOverride.anIntArray111[2]
			= class528_sub42.readUnsignedShort(24505224);
		} else {
		    itemStyleOverride.anIntArray109[2]
			= class528_sub42.method9645((short) -20993);
		    itemStyleOverride.anIntArray111[2]
			= class528_sub42.method9645((short) 10777);
		}
	    }
	}
	if (bool_10_) {
	    if (i <= 1) {
		itemStyleOverride.anIntArray112[0]
		    = class528_sub42.readUnsignedShort(-522777079);
		itemStyleOverride.anIntArray105[0] = class528_sub42.readUnsignedShort(433946562);
	    } else {
		itemStyleOverride.anIntArray112[0]
		    = class528_sub42.method9645((short) -16625);
		itemStyleOverride.anIntArray105[0]
		    = class528_sub42.method9645((short) 4968);
	    }
	    if (-1 != ((ItemType) itemType).anInt74 * 31399827
		|| ((ItemType) itemType).anInt76 * 294798949 != -1) {
		if (i <= 1) {
		    itemStyleOverride.anIntArray112[1]
			= class528_sub42.readUnsignedShort(-2092956298);
		    itemStyleOverride.anIntArray105[1]
			= class528_sub42.readUnsignedShort(-665644088);
		} else {
		    itemStyleOverride.anIntArray112[1]
			= class528_sub42.method9645((short) -22684);
		    itemStyleOverride.anIntArray105[1]
			= class528_sub42.method9645((short) -691);
		}
	    }
	}
	if (bool_11_) {
	    int i_13_ = class528_sub42.readUnsignedShort(-1397426958);
	    int[] is = new int[4];
	    is[0] = i_13_ & 0xf;
	    is[1] = i_13_ >> 4 & 0xf;
	    is[2] = i_13_ >> 8 & 0xf;
	    is[3] = i_13_ >> 12 & 0xf;
	    for (int i_14_ = 0; i_14_ < 4; i_14_++) {
		if (15 != is[i_14_])
		    itemStyleOverride.aShortArray114[is[i_14_]]
			= (short) class528_sub42.readUnsignedShort(108505976);
	    }
	}
	if (bool_12_) {
	    int i_15_ = class528_sub42.readUnsignedByte((byte) 21);
	    int[] is = new int[2];
	    is[0] = i_15_ & 0xf;
	    is[1] = i_15_ >> 4 & 0xf;
	    for (int i_16_ = 0; i_16_ < 2; i_16_++) {
		if (is[i_16_] != 15)
		    itemStyleOverride.aShortArray115[is[i_16_]]
			= (short) class528_sub42.readUnsignedShort(-256269921);
	    }
	}
	return itemStyleOverride;
    }
}
