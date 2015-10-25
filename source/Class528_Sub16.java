/* Class528_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class528_Sub16 extends Node
{
    public static final int anInt10372 = 3;
    public static final int anInt10373 = 1;
    public static final int anInt10374 = 2;
    int anInt10375;
    public static final int anInt10376 = 8;
    public static final int anInt10377 = 7;
    public static final int anInt10378 = 5;
    static final int anInt10379 = 6;
    public static final int anInt10380 = 9;
    public static final int anInt10381 = 10;
    public static final int anInt10382 = 0;
    int anInt10383;
    int[] anIntArray10384;
    int[][] anIntArrayArray10385;
    boolean[] aBoolArray10386;
    int[] anIntArray10387;
    
    Class528_Sub16(int i, byte[] is) {
	((Class528_Sub16) this).anInt10375 = -488944169 * i;
	ByteBuffer class528_sub42 = new ByteBuffer(is);
	((Class528_Sub16) this).anInt10383
	    = class528_sub42.readUnsignedShort(-949032414) * -1771415555;
	((Class528_Sub16) this).anIntArray10384
	    = new int[((Class528_Sub16) this).anInt10383 * 1947712853];
	((Class528_Sub16) this).anIntArrayArray10385
	    = new int[1947712853 * ((Class528_Sub16) this).anInt10383][];
	((Class528_Sub16) this).aBoolArray10386
	    = new boolean[((Class528_Sub16) this).anInt10383 * 1947712853];
	((Class528_Sub16) this).anIntArray10387
	    = new int[1947712853 * ((Class528_Sub16) this).anInt10383];
	for (int i_0_ = 0;
	     i_0_ < 1947712853 * ((Class528_Sub16) this).anInt10383; i_0_++) {
	    ((Class528_Sub16) this).anIntArray10384[i_0_]
		= class528_sub42.readUnsignedByte((byte) 125);
	    if (((Class528_Sub16) this).anIntArray10384[i_0_] == 6)
		((Class528_Sub16) this).anIntArray10384[i_0_] = 2;
	}
	for (int i_1_ = 0;
	     i_1_ < ((Class528_Sub16) this).anInt10383 * 1947712853; i_1_++)
	    ((Class528_Sub16) this).aBoolArray10386[i_1_]
		= class528_sub42.readUnsignedByte((byte) 111) == 1;
	for (int i_2_ = 0;
	     i_2_ < 1947712853 * ((Class528_Sub16) this).anInt10383; i_2_++)
	    ((Class528_Sub16) this).anIntArray10387[i_2_]
		= class528_sub42.readUnsignedShort(268655309);
	for (int i_3_ = 0;
	     i_3_ < 1947712853 * ((Class528_Sub16) this).anInt10383; i_3_++)
	    ((Class528_Sub16) this).anIntArrayArray10385[i_3_]
		= new int[class528_sub42.method9719(65280)];
	for (int i_4_ = 0;
	     i_4_ < ((Class528_Sub16) this).anInt10383 * 1947712853; i_4_++) {
	    for (int i_5_ = 0;
		 (i_5_
		  < ((Class528_Sub16) this).anIntArrayArray10385[i_4_].length);
		 i_5_++)
		((Class528_Sub16) this).anIntArrayArray10385[i_4_][i_5_]
		    = class528_sub42.method9719(65280);
	}
    }
}
