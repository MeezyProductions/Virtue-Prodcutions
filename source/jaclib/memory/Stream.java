/* Stream - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory;

public final class Stream
{
    private Buffer aBuffer1100;
    private int anInt1101;
    private int anInt1102;
    private int anInt1103;
    private byte[] aByteArray1104;
    private static boolean aBool1105 = getLSB(-65536) == -1;
    
    public Stream() {
	this(4096);
    }
    
    private Stream(int i) {
	aByteArray1104 = new byte[i];
    }
    
    public Stream(Buffer buffer) {
	this(buffer, 0, buffer.method1());
    }
    
    private Stream(Buffer buffer, int i, int i_0_) {
	this(buffer.method1() < 4096 ? buffer.method1() : 4096);
	method1183(buffer, i, i_0_);
    }
    
    private void method1183(Buffer buffer, int i, int i_1_) {
	method1189();
	aBuffer1100 = buffer;
	anInt1102 = i * -2068321503;
	anInt1101 = (i_1_ + i) * -511330135;
	if (-1384748135 * anInt1101 > buffer.method1())
	    throw new RuntimeException();
    }
    
    public int method1184() {
	return -542680863 * anInt1102 + anInt1103 * 2078710351;
    }
    
    public void method1185(int i) {
	method1189();
	anInt1102 = i * -2068321503;
    }
    
    public void method1186(int i) {
	if (2078710351 * anInt1103 >= aByteArray1104.length)
	    method1189();
	aByteArray1104[(anInt1103 += 1227766959) * 2078710351 - 1] = (byte) i;
    }
    
    public void method1187(float f) {
	if (3 + anInt1103 * 2078710351 >= aByteArray1104.length)
	    method1189();
	int i = floatToRawIntBits(f);
	aByteArray1104[(anInt1103 += 1227766959) * 2078710351 - 1]
	    = (byte) (i >> 24);
	aByteArray1104[(anInt1103 += 1227766959) * 2078710351 - 1]
	    = (byte) (i >> 16);
	aByteArray1104[(anInt1103 += 1227766959) * 2078710351 - 1]
	    = (byte) (i >> 8);
	aByteArray1104[(anInt1103 += 1227766959) * 2078710351 - 1] = (byte) i;
    }
    
    public void method1188(float f) {
	if (3 + 2078710351 * anInt1103 >= aByteArray1104.length)
	    method1189();
	int i = floatToRawIntBits(f);
	aByteArray1104[(anInt1103 += 1227766959) * 2078710351 - 1] = (byte) i;
	aByteArray1104[(anInt1103 += 1227766959) * 2078710351 - 1]
	    = (byte) (i >> 8);
	aByteArray1104[(anInt1103 += 1227766959) * 2078710351 - 1]
	    = (byte) (i >> 16);
	aByteArray1104[(anInt1103 += 1227766959) * 2078710351 - 1]
	    = (byte) (i >> 24);
    }
    
    public void method1189() {
	if (anInt1103 * 2078710351 > 0) {
	    if (-542680863 * anInt1102 + anInt1103 * 2078710351
		> -1384748135 * anInt1101)
		throw new RuntimeException();
	    aBuffer1100.method3(aByteArray1104, 0, anInt1102 * -542680863,
				2078710351 * anInt1103);
	    anInt1102 += -1294374609 * anInt1103;
	    anInt1103 = 0;
	}
    }
    
    public static final boolean method1190() {
	return aBool1105;
    }
    
    public static native int floatToRawIntBits(float f);
    
    private static final native byte getLSB(int i);
    
    public int method1191() {
	return -542680863 * anInt1102 + anInt1103 * 2078710351;
    }
    
    public int method1192() {
	return -542680863 * anInt1102 + anInt1103 * 2078710351;
    }
    
    public int method1193() {
	return -542680863 * anInt1102 + anInt1103 * 2078710351;
    }
    
    public int method1194() {
	return -542680863 * anInt1102 + anInt1103 * 2078710351;
    }
    
    public void method1195(int i) {
	method1189();
	anInt1102 = i * -2068321503;
    }
    
    public void method1196(int i) {
	method1189();
	anInt1102 = i * -2068321503;
    }
    
    public void method1197(int i) {
	method1189();
	anInt1102 = i * -2068321503;
    }
    
    public void method1198(int i) {
	method1189();
	anInt1102 = i * -2068321503;
    }
    
    public void method1199(float f) {
	if (3 + anInt1103 * 2078710351 >= aByteArray1104.length)
	    method1189();
	int i = floatToRawIntBits(f);
	aByteArray1104[(anInt1103 += 1227766959) * 2078710351 - 1]
	    = (byte) (i >> 24);
	aByteArray1104[(anInt1103 += 1227766959) * 2078710351 - 1]
	    = (byte) (i >> 16);
	aByteArray1104[(anInt1103 += 1227766959) * 2078710351 - 1]
	    = (byte) (i >> 8);
	aByteArray1104[(anInt1103 += 1227766959) * 2078710351 - 1] = (byte) i;
    }
    
    public void method1200() {
	if (anInt1103 * 2078710351 > 0) {
	    if (-542680863 * anInt1102 + anInt1103 * 2078710351
		> -1384748135 * anInt1101)
		throw new RuntimeException();
	    aBuffer1100.method3(aByteArray1104, 0, anInt1102 * -542680863,
				2078710351 * anInt1103);
	    anInt1102 += -1294374609 * anInt1103;
	    anInt1103 = 0;
	}
    }
    
    public static final boolean method1201() {
	return aBool1105;
    }
}
