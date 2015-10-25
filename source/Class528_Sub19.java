/* Class528_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class528_Sub19 extends Node implements Interface6
{
    public int anInt10390;
    static int anInt10391;
    public int anInt10392;
    public int anInt10393;
    public int anInt10394;
    static Class528_Sub19[] aClass528_Sub19Array10395 = new Class528_Sub19[0];
    
    Class528_Sub19(Class528_Sub19 class528_sub19_0_) {
	anInt10392 = 1 * class528_sub19_0_.anInt10392;
	anInt10390 = 1 * class528_sub19_0_.anInt10390;
	anInt10394 = class528_sub19_0_.anInt10394 * 1;
	anInt10393 = 1 * class528_sub19_0_.anInt10393;
    }
    
    public Class528_Sub19() {
	anInt10392 = 1247374731;
    }
    
    Class528_Sub19(int i, boolean bool) {
	if (i == -1)
	    anInt10392 = 1247374731;
	else {
	    anInt10392 = (i >> 28 & 0x3) * -1247374731;
	    anInt10390 = ((i >> 14 & 0x3fff) << 9) * -1365751333;
	    anInt10394 = 0;
	    anInt10393 = ((i & 0x3fff) << 9) * -1865403123;
	    if (bool) {
		anInt10390 += -1739990272;
		anInt10393 += -801829632;
	    }
	}
    }
    
    void method9404(Class528_Sub19 class528_sub19_1_, byte i) {
	anInt10392 = 1 * class528_sub19_1_.anInt10392;
	anInt10390 = class528_sub19_1_.anInt10390 * 1;
	anInt10394 = 1 * class528_sub19_1_.anInt10394;
	anInt10393 = class528_sub19_1_.anInt10393 * 1;
    }
    
    void method9405(ByteBuffer class528_sub42, int i) {
	class528_sub42.writeByte(anInt10392 * 1627467229, (byte) 18);
	class528_sub42.writeInt(anInt10390 * 124815955, 2130649013);
	class528_sub42.writeInt(anInt10394 * 1385495327, 2060821525);
	class528_sub42.writeInt(anInt10393 * -1852661307, 2066788069);
    }
    
    @Override
	public String toString() {
	return new StringBuilder().append("Level: ").append
		   (1627467229 * anInt10392).append
		   (" Coord: ").append
		   (124815955 * anInt10390).append
		   (",").append
		   (anInt10394 * 1385495327).append
		   (",").append
		   (-1852661307 * anInt10393).append
		   (" Coord Split: ").append
		   (anInt10390 * 124815955 >> 15).append
		   (",").append
		   (anInt10393 * -1852661307 >> 15).append
		   (",").append
		   (124815955 * anInt10390 >> 9 & 0x3f).append
		   (",").append
		   (-1852661307 * anInt10393 >> 9 & 0x3f).append
		   (",").append
		   (anInt10390 * 124815955 & 0x1ff).append
		   (",").append
		   (-1852661307 * anInt10393 & 0x1ff).toString();
    }
    
    @Override
	public int method48(int i) {
	return Class235.method3280(1605075126);
    }
    
    public Class528_Sub19(int i, int i_2_, int i_3_, int i_4_) {
	anInt10392 = i * -1247374731;
	anInt10390 = i_2_ * -1365751333;
	anInt10394 = -1847672609 * i_3_;
	anInt10393 = i_4_ * -1865403123;
    }
    
    @Override
	public void method52(ByteBuffer class528_sub42, short i) {
	anInt10392 = class528_sub42.readUnsignedByte((byte) 6) * -1247374731;
	anInt10390 = class528_sub42.readInt(-1490579335) * -1365751333;
	anInt10394 = class528_sub42.readInt(76064282) * -1847672609;
	anInt10393 = class528_sub42.readInt(-554460774) * -1865403123;
    }

    @Override
	public void method47(ByteBuffer class528_sub42, int i) {
	method9405(class528_sub42, 1533907553);
    }
    
    void method9410(int i, int i_5_, int i_6_, int i_7_, int i_8_) {
	anInt10392 = i * -1247374731;
	anInt10390 = i_5_ * -1365751333;
	anInt10394 = -1847672609 * i_6_;
	anInt10393 = -1865403123 * i_7_;
    }
    
    public Class422 method9411(int i) {
	return new Class422(124815955 * anInt10390,
			    1385495327 * anInt10394,
			    -1852661307 * anInt10393);
    }

    void method9416(int i, boolean bool, int i_12_) {
	if (-1 == i)
	    anInt10392 = 1247374731;
	else {
	    anInt10392 = -1247374731 * (i >> 28 & 0x3);
	    anInt10390 = -1365751333 * ((i >> 14 & 0x3fff) << 9);
	    anInt10394 = 0;
	    anInt10393 = -1865403123 * ((i & 0x3fff) << 9);
	    if (bool) {
		anInt10390 += -1739990272;
		anInt10393 += -801829632;
	    }
	}
    }
}
