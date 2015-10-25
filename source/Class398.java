/* Class398 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

public class Class398
{
    public static Class398 aClass398_4402;
    public static Class398 aClass398_4403 = new Class398(9);
    public static Class398 aClass398_4404 = new Class398(7);
    public static Class398 aClass398_4405;
    public static Class398 aClass398_4406;
    static Class398 aClass398_4407;
    public static Class398 aClass398_4408;
    public static Class398 aClass398_4409;
    public static Class398 aClass398_4410;
    public static Class398 aClass398_4411;
    public static Class398 aClass398_4412;
    public static Class398 aClass398_4413 = new Class398(5);
    static Class398 aClass398_4414;
    int anInt4415;
    
    Class398(int i) {
	((Class398) this).anInt4415 = i * 1731405809;
    }
    
    public String method4818(int i) {
	return new StringBuilder().append("_").append
		   (977332497 * ((Class398) this).anInt4415).toString();
    }
    
    public Object method4819(byte i) throws Throwable {
	return Class70.method1086(Class196.anApplet2198,
				  method4818(-1572034177), (byte) -25);
    }
    
    public void method4820(Object[] objects, int i) {
	try {
	    method4823(objects, -1132228642);
	} catch (Throwable throwable) {
	    /* empty */
	}
    }
    
    public void method4821(int i) {
	try {
	    method4819((byte) -109);
	} catch (Throwable throwable) {
	    /* empty */
	}
    }
    
    static {
	aClass398_4405 = new Class398(2);
	aClass398_4408 = new Class398(11);
	aClass398_4410 = new Class398(10);
	aClass398_4402 = new Class398(6);
	aClass398_4409 = new Class398(13);
	aClass398_4412 = new Class398(12);
	aClass398_4411 = new Class398(8);
	aClass398_4406 = new Class398(3);
	aClass398_4407 = new Class398(4);
	aClass398_4414 = new Class398(1);
    }
    
    public String method4822() {
	return new StringBuilder().append("_").append
		   (977332497 * ((Class398) this).anInt4415).toString();
    }
    
    public Object method4823(Object[] objects, int i) throws Throwable {
	return Class70.method1085(Class196.anApplet2198,
				  method4818(-1572034177), objects, 445184839);
    }
    
    public Object method4824() throws Throwable {
	return Class70.method1086(Class196.anApplet2198,
				  method4818(-1572034177), (byte) 89);
    }
    
    public Object method4825() throws Throwable {
	return Class70.method1086(Class196.anApplet2198,
				  method4818(-1572034177), (byte) -47);
    }
    
    public static void method4826(ByteBuffer class528_sub42, byte i) {
	byte[] is = new byte[24];
	try {
	    Class509.aClass22_6947.method678(0L);
	    Class509.aClass22_6947.method665(is, (byte) -122);
	    int i_0_;
	    for (i_0_ = 0; i_0_ < 24 && is[i_0_] == 0; i_0_++) {
		/* empty */
	    }
	    if (i_0_ >= 24)
		throw new IOException();
	} catch (Exception exception) {
	    for (int i_1_ = 0; i_1_ < 24; i_1_++)
		is[i_1_] = (byte) -1;
	}
	class528_sub42.method9618(is, 0, 24, -611931567);
    }
    
    static void method4827(byte i) {
	client.method10268((byte) 79);
    }
    
    static String method4828(Throwable throwable, int i) throws IOException {
	String string;
	if (throwable instanceof RuntimeException_Sub4) {
	    RuntimeException_Sub4 runtimeexception_sub4
		= (RuntimeException_Sub4) throwable;
	    string = new StringBuilder().append
			 (((RuntimeException_Sub4) runtimeexception_sub4)
			  .aString11934)
			 .append
			 (" | ").toString();
	    throwable = (((RuntimeException_Sub4) runtimeexception_sub4)
			 .aThrowable11936);
	} else
	    string = "";
	StringWriter stringwriter = new StringWriter();
	PrintWriter printwriter = new PrintWriter(stringwriter);
	throwable.printStackTrace(printwriter);
	printwriter.close();
	String string_2_ = stringwriter.toString();
	BufferedReader bufferedreader
	    = new BufferedReader(new StringReader(string_2_));
	String string_3_ = bufferedreader.readLine();
	for (;;) {
	    String string_4_ = bufferedreader.readLine();
	    if (null == string_4_)
		break;
	    int i_5_ = string_4_.indexOf('(');
	    int i_6_ = string_4_.indexOf(')', 1 + i_5_);
	    String string_7_;
	    if (i_5_ != -1)
		string_7_ = string_4_.substring(0, i_5_);
	    else
		string_7_ = string_4_;
	    string_7_ = string_7_.trim();
	    string_7_ = string_7_.substring(string_7_.lastIndexOf(' ') + 1);
	    string_7_ = string_7_.substring(string_7_.lastIndexOf('\t') + 1);
	    string = new StringBuilder().append(string).append(string_7_)
			 .toString();
	    if (i_5_ != -1 && -1 != i_6_) {
		int i_8_ = string_4_.indexOf(".java:", i_5_);
		if (i_8_ >= 0)
		    string
			= new StringBuilder().append(string).append
			      (string_4_.substring(5 + i_8_, i_6_)).toString();
	    }
	    string = new StringBuilder().append(string).append(' ').toString();
	}
	string = new StringBuilder().append(string).append("| ").append
		     (string_3_).toString();
	return string;
    }
}
