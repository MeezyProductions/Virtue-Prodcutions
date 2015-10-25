/* Class637 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

public class Class637 implements Definition
{
    Class623 aClass623_8246;
    int anInt8247;
    public int anInt8248;
    public int anInt8249;
    public static Class446 aClass446_8250;
    
    void method7575(ByteBuffer class528_sub42, int i) {
	if (i == 1)
	    ((Class637) this).anInt8247
		= class528_sub42.method9645((short) 13227) * -1905790123;
	else if (2 == i) {
	    anInt8248 = class528_sub42.readUnsignedByte((byte) 67) * 2092698479;
	    anInt8249 = class528_sub42.readUnsignedByte((byte) 11) * 1467437159;
	}
    }
    
    void method7576(ByteBuffer class528_sub42, int i, int i_0_) {
	if (i == 1)
	    ((Class637) this).anInt8247
		= class528_sub42.method9645((short) -25856) * -1905790123;
	else if (2 == i) {
	    anInt8248 = class528_sub42.readUnsignedByte((byte) 10) * 2092698479;
	    anInt8249 = class528_sub42.readUnsignedByte((byte) 71) * 1467437159;
	}
    }
    
    public void method57(ByteBuffer class528_sub42) {
	for (;;) {
	    int i = class528_sub42.readUnsignedByte((byte) 113);
	    if (0 == i)
		break;
	    method7576(class528_sub42, i, 260405528);
	}
    }
    
    public void method58(ByteBuffer class528_sub42, byte i) {
	for (;;) {
	    int i_1_ = class528_sub42.readUnsignedByte((byte) 106);
	    if (0 == i_1_)
		break;
	    method7576(class528_sub42, i_1_, -2090538657);
	}
    }
    
    public synchronized Class178 method7577(short i) {
	Class178 class178
	    = (Class178) (((Class623) ((Class637) this).aClass623_8246)
			      .aClass186_8117.method2727
			  ((long) (((Class637) this).anInt8247 * -714313219)));
	if (class178 != null)
	    return class178;
	class178
	    = Class175.method2561((((Class623)
				    ((Class637) this).aClass623_8246)
				   .aClass446_8118),
				  ((Class637) this).anInt8247 * -714313219, 0);
	if (class178 != null)
	    ((Class623) ((Class637) this).aClass623_8246).aClass186_8117
		.method2729
		(class178, (long) (((Class637) this).anInt8247 * -714313219));
	return class178;
    }
    
    public void method60(ByteBuffer class528_sub42) {
	for (;;) {
	    int i = class528_sub42.readUnsignedByte((byte) 100);
	    if (0 == i)
		break;
	    method7576(class528_sub42, i, 907570881);
	}
    }
    
    public void method59() {
	/* empty */
    }
    
    public void method61(int i) {
	/* empty */
    }
    
    void method7578(ByteBuffer class528_sub42, int i) {
	if (i == 1)
	    ((Class637) this).anInt8247
		= class528_sub42.method9645((short) -4011) * -1905790123;
	else if (2 == i) {
	    anInt8248 = class528_sub42.readUnsignedByte((byte) 42) * 2092698479;
	    anInt8249 = class528_sub42.readUnsignedByte((byte) 51) * 1467437159;
	}
    }
    
    Class637(int i, Class623 class623) {
	((Class637) this).aClass623_8246 = class623;
    }
    
    public static final int method7579(int i, int i_2_, int i_3_, int i_4_) {
	if (i_3_ > 243)
	    i_2_ >>= 4;
	else if (i_3_ > 217)
	    i_2_ >>= 3;
	else if (i_3_ > 192)
	    i_2_ >>= 2;
	else if (i_3_ > 179)
	    i_2_ >>= 1;
	return ((i & 0xff) >> 2 << 10) + (i_2_ >> 5 << 7) + (i_3_ >> 1);
    }
    
    static void method7580(String string, String string_5_, String string_6_,
			   boolean bool, boolean bool_7_, int i) {
	Class109 class109 = Class591.method7078((byte) 41);
	if (class109.method1384((byte) 107) != null) {
	    Class528_Sub34 class528_sub34
		= Class656.method7845(OutgoingOpcode.aClass403_4484,
				      class109.aClass10_1379, -1877059466);
	    class528_sub34.aClass528_Sub42_Sub2_10481.method9717
		((Class14.method627(string, -492302205)
		  + Class14.method627(string_5_, 43768262)
		  + Class14.method627(string_6_, -1942378631) + 1),
		 (byte) 85);
	    class528_sub34.aClass528_Sub42_Sub2_10481.writeString(string,
								 -1936289654);
	    class528_sub34.aClass528_Sub42_Sub2_10481.writeString(string_5_,
								 -1936289654);
	    class528_sub34.aClass528_Sub42_Sub2_10481.writeString(string_6_,
								 -1936289654);
	    int i_8_ = 0;
	    if (bool)
		i_8_ |= 0x1;
	    if (bool_7_)
		i_8_ |= 0x2;
	    class528_sub34.aClass528_Sub42_Sub2_10481.writeByte(i_8_,
								 (byte) 27);
	    class109.method1380(class528_sub34, 223607845);
	}
    }
    
    public static final int method7581(long l, String string, int i) {
	Random random = new Random();
	ByteBuffer class528_sub42 = new ByteBuffer(128);
	ByteBuffer class528_sub42_9_ = new ByteBuffer(128);
	int[] is = new int[4];
	is[0] = random.nextInt();
	is[1] = random.nextInt();
	is[2] = (int) (l >> 32);
	is[3] = (int) l;
	class528_sub42.writeByte(10, (byte) 11);
	for (int i_10_ = 0; i_10_ < 4; i_10_++)
	    class528_sub42.writeInt(random.nextInt(), 2025028763);
	class528_sub42.writeInt(is[0], 2030709568);
	class528_sub42.writeInt(is[1], 2006611904);
	class528_sub42.method9606(l);
	class528_sub42.method9606(0L);
	for (int i_11_ = 0; i_11_ < 4; i_11_++)
	    class528_sub42.writeInt(random.nextInt(), 2063996916);
	class528_sub42.method9650(Class35.aBigInteger321,
				  Class35.aBigInteger322, 728270902);
	class528_sub42_9_.writeByte(10, (byte) 77);
	for (int i_12_ = 0; i_12_ < 3; i_12_++)
	    class528_sub42_9_.writeInt(random.nextInt(), 2049130145);
	class528_sub42_9_.method9606(random.nextLong());
	class528_sub42_9_.method9613(random.nextLong());
	Class398.method4826(class528_sub42_9_, (byte) -22);
	class528_sub42_9_.method9606(random.nextLong());
	class528_sub42_9_.method9650(Class35.aBigInteger321,
				     Class35.aBigInteger322, 728270902);
	int i_13_ = Class14.method627(string, -2081923200);
	if (0 != i_13_ % 8)
	    i_13_ += 8 - i_13_ % 8;
	ByteBuffer class528_sub42_14_ = new ByteBuffer(i_13_);
	class528_sub42_14_.writeString(string, -1936289654);
	class528_sub42_14_.pointer = 2015001547 * i_13_;
	class528_sub42_14_.method9647(is, 224592418);
	ByteBuffer class528_sub42_15_
	    = new ByteBuffer(class528_sub42_14_.pointer * -185904669
				 + (class528_sub42_9_.pointer * -185904669
				    + (-185904669 * class528_sub42.pointer
				       + 5)));
	class528_sub42_15_.writeByte(2, (byte) 5);
	class528_sub42_15_.writeByte(class528_sub42.pointer * -185904669,
				      (byte) 54);
	class528_sub42_15_.method9618(class528_sub42.payload, 0,
				      class528_sub42.pointer * -185904669,
				      -1299935483);
	class528_sub42_15_
	    .writeByte(class528_sub42_9_.pointer * -185904669, (byte) 29);
	class528_sub42_15_.method9618(class528_sub42_9_.payload, 0,
				      (class528_sub42_9_.pointer
				       * -185904669),
				      323518558);
	class528_sub42_15_.method9717((-185904669
				       * class528_sub42_14_.pointer),
				      (byte) -63);
	class528_sub42_15_.method9618(class528_sub42_14_.payload, 0,
				      (-185904669
				       * class528_sub42_14_.pointer),
				      -1124229061);
	String string_16_
	    = Class613.method7339(class528_sub42_15_.payload,
				  2091742060);
	int i_17_;
	try {
	    URL url = new URL(new StringBuilder().append
				  (Class364_Sub2.method9233("services", false,
							    -2097391457))
				  .append
				  ("m=accountappeal/login.ws").toString());
	    URLConnection urlconnection = url.openConnection();
	    urlconnection.setDoInput(true);
	    urlconnection.setDoOutput(true);
	    urlconnection.setConnectTimeout(5000);
	    OutputStreamWriter outputstreamwriter
		= new OutputStreamWriter(urlconnection.getOutputStream());
	    outputstreamwriter.write
		(new StringBuilder().append("data2=").append
		     (Class388.method4768(string_16_, (short) 5273)).append
		     ("&dest=").append
		     (Class388.method4768("passwordchoice.ws", (short) -10587))
		     .toString());
	    outputstreamwriter.flush();
	    InputStream inputstream = urlconnection.getInputStream();
	    class528_sub42_15_ = new ByteBuffer(new byte[1000]);
	    for (;;) {
		int i_18_
		    = inputstream.read(class528_sub42_15_.payload,
				       (-185904669
					* class528_sub42_15_.pointer),
				       1000 - (class528_sub42_15_.pointer
					       * -185904669));
		if (i_18_ == -1)
		    break;
		class528_sub42_15_.pointer += i_18_ * 2015001547;
		if (class528_sub42_15_.pointer * -185904669 >= 1000)
		    return 5;
	    }
	    outputstreamwriter.close();
	    inputstream.close();
	    String string_19_ = new String(class528_sub42_15_.payload);
	    if (string_19_.startsWith("OFFLINE"))
		return 4;
	    if (string_19_.startsWith("WRONG"))
		return 7;
	    if (string_19_.startsWith("RELOAD"))
		return 3;
	    if (string_19_
		    .startsWith("Not permitted for social network accounts."))
		return 6;
	    class528_sub42_15_.method9648(is, 970556955);
	    for (/**/;
		 (class528_sub42_15_.pointer * -185904669 > 0
		  && (class528_sub42_15_.payload
		      [-185904669 * class528_sub42_15_.pointer - 1]) == 0);
		 class528_sub42_15_.pointer -= 2015001547) {
		/* empty */
	    }
	    string_19_
		= new String(class528_sub42_15_.payload, 0,
			     -185904669 * class528_sub42_15_.pointer);
	    if (Class625.method7445(string_19_, (byte) 88)) {
		Class215.method3016(string_19_, true, client.aBool10869,
				    -1947825621);
		return 2;
	    }
	    i_17_ = 5;
	} catch (Throwable throwable) {
	    throwable.printStackTrace();
	    return 5;
	}
	return i_17_;
    }
}
