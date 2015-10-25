/* Class35 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLConnection;

public class Class35
{
    static final int anInt317 = 1000;
    static final String aString318 = "services";
    static final String aString319 = "passwordchoice.ws";
    static final int anInt320 = 4;
    static BigInteger aBigInteger321
	= (new BigInteger
	   ("80782894952180643741752986186714059433953886149239752893425047584684715842049"));
    static BigInteger aBigInteger322
	= (new BigInteger
	   ("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683"));
    static final int anInt323 = 2;
    static final int anInt324 = 7;
    static final int anInt325 = 2;
    public static final int anInt326 = 5;
    static final int anInt327 = 6;
    static final int anInt328 = 3;
    static final String aString329 = "m=accountappeal/login.ws";
    static int[] anIntArray330;
    
    public static long method779() {
	long l;
	try {
	    URL url = new URL(new StringBuilder().append
				  (Class364_Sub2.method9233("services", false,
							    1636502154))
				  .append
				  ("m=accountappeal/login.ws").toString());
	    URLConnection urlconnection = url.openConnection();
	    urlconnection.setRequestProperty("connection", "close");
	    urlconnection.setDoInput(true);
	    urlconnection.setDoOutput(true);
	    urlconnection.setConnectTimeout(5000);
	    OutputStreamWriter outputstreamwriter
		= new OutputStreamWriter(urlconnection.getOutputStream());
	    outputstreamwriter.write("data1=req");
	    outputstreamwriter.flush();
	    InputStream inputstream = urlconnection.getInputStream();
	    ByteBuffer class528_sub42 = new ByteBuffer(new byte[1000]);
	    for (;;) {
		int i
		    = inputstream.read(class528_sub42.payload,
				       class528_sub42.pointer * -185904669,
				       1000 - (class528_sub42.pointer
					       * -185904669));
		if (-1 == i)
		    break;
		class528_sub42.pointer += 2015001547 * i;
		if (-185904669 * class528_sub42.pointer >= 1000)
		    return 0L;
	    }
	    class528_sub42.pointer = 0;
	    long l_0_ = class528_sub42.method9633(771973092);
	    l = l_0_;
	} catch (Exception exception) {
	    return 0L;
	}
	return l;
    }
    
    Class35() throws Throwable {
	throw new Error();
    }
    
    public static long method780() {
	long l;
	try {
	    URL url = new URL(new StringBuilder().append
				  (Class364_Sub2.method9233("services", false,
							    -1215134692))
				  .append
				  ("m=accountappeal/login.ws").toString());
	    URLConnection urlconnection = url.openConnection();
	    urlconnection.setRequestProperty("connection", "close");
	    urlconnection.setDoInput(true);
	    urlconnection.setDoOutput(true);
	    urlconnection.setConnectTimeout(5000);
	    OutputStreamWriter outputstreamwriter
		= new OutputStreamWriter(urlconnection.getOutputStream());
	    outputstreamwriter.write("data1=req");
	    outputstreamwriter.flush();
	    InputStream inputstream = urlconnection.getInputStream();
	    ByteBuffer class528_sub42 = new ByteBuffer(new byte[1000]);
	    for (;;) {
		int i
		    = inputstream.read(class528_sub42.payload,
				       class528_sub42.pointer * -185904669,
				       1000 - (class528_sub42.pointer
					       * -185904669));
		if (-1 == i)
		    break;
		class528_sub42.pointer += 2015001547 * i;
		if (-185904669 * class528_sub42.pointer >= 1000)
		    return 0L;
	    }
	    class528_sub42.pointer = 0;
	    long l_1_ = class528_sub42.method9633(771973092);
	    l = l_1_;
	} catch (Exception exception) {
	    return 0L;
	}
	return l;
    }
    
    public static Class273 method781(int i, int i_2_) {
	if (i == ((Class273) Class273.aClass273_2904).anInt2906 * 919224881)
	    return Class273.aClass273_2904;
	if (i == 919224881 * ((Class273) Class273.aClass273_2905).anInt2906)
	    return Class273.aClass273_2905;
	return null;
    }
    
    static final void method782(Class648 class648, int i) {
	int i_3_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_3_, (byte) 7);
	Class226 class226 = Class380.aClass226Array3970[i_3_ >> 16];
	Class326_Sub2.method9111(class229, class226, class648, 1782284575);
    }
    
    static final void method783(Class648 class648, int i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = class229.anInt2453 * 1254224115;
    }
    
    static final void method784(Class229 class229, Class226 class226,
				Class648 class648, int i) {
	class229.anInt2510
	    = ((((Class648) class648).anIntArray8394
		[(((Class648) class648).anInt8395 -= 1239022665) * 717927929])
	       * 281346149);
    }
}
