/* Class528_Sub21_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class528_Sub21_Sub2 extends Class528_Sub21
    implements Definition, Interface1
{
    public int anInt11201 = 0;
    public int[] anIntArray11202;
    public int[] anIntArray11203;
    public int anInt11204 = 0;
    
    public void method59() {
	/* empty */
    }
    
    public void method58(ByteBuffer class528_sub42, byte i) {
	for (;;) {
	    int i_0_ = class528_sub42.readUnsignedByte((byte) 127);
	    if (i_0_ == 0)
		break;
	    method10306(class528_sub42, i_0_, (byte) 32);
	}
    }
    
    void method10306(ByteBuffer class528_sub42, int i, byte i_1_) {
	if (i == 2)
	    anInt11204 = class528_sub42.readUnsignedShort(-402802221) * -1947741041;
	else if (i == 4) {
	    anInt11201 = class528_sub42.readUnsignedByte((byte) 108) * 72178707;
	    anIntArray11202 = new int[2101399067 * anInt11201];
	    anIntArray11203 = new int[2101399067 * anInt11201];
	    for (int i_2_ = 0; i_2_ < 2101399067 * anInt11201; i_2_++) {
		anIntArray11202[i_2_] = class528_sub42.readUnsignedShort(185310884);
		anIntArray11203[i_2_] = class528_sub42.readUnsignedShort(254963357);
	    }
	}
    }
    
    public void method60(ByteBuffer class528_sub42) {
	for (;;) {
	    int i = class528_sub42.readUnsignedByte((byte) 22);
	    if (i == 0)
		break;
	    method10306(class528_sub42, i, (byte) 9);
	}
    }
    
    public void method9(int i, byte i_3_) {
	/* empty */
    }
    
    public void method57(ByteBuffer class528_sub42) {
	for (;;) {
	    int i = class528_sub42.readUnsignedByte((byte) 92);
	    if (i == 0)
		break;
	    method10306(class528_sub42, i, (byte) 13);
	}
    }
    
    public void method8(int i) {
	/* empty */
    }
    
    public void method61(int i) {
	/* empty */
    }
    
    Class528_Sub21_Sub2() {
	/* empty */
    }
    
    void method10307(ByteBuffer class528_sub42, int i) {
	if (i == 2)
	    anInt11204 = class528_sub42.readUnsignedShort(226818203) * -1947741041;
	else if (i == 4) {
	    anInt11201 = class528_sub42.readUnsignedByte((byte) 22) * 72178707;
	    anIntArray11202 = new int[2101399067 * anInt11201];
	    anIntArray11203 = new int[2101399067 * anInt11201];
	    for (int i_4_ = 0; i_4_ < 2101399067 * anInt11201; i_4_++) {
		anIntArray11202[i_4_] = class528_sub42.readUnsignedShort(-1816194040);
		anIntArray11203[i_4_] = class528_sub42.readUnsignedShort(-1001073076);
	    }
	}
    }
}
