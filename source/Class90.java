/* Class90 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class Class90
{
    byte aByte1136;
    short aShort1137;
    boolean aBool1138;
    short aShort1139;
    byte aByte1140;
    short aShort1141;
    int anInt1142;
    int anInt1143;
    public static Class393 aClass393_1144;
    
    Class90(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_,
	    int i_6_, int i_7_, boolean bool, int i_8_) {
	((Class90) this).anInt1142 = i * -802085845;
	((Class90) this).aShort1137 = (short) i_3_;
	((Class90) this).aShort1141 = (short) i_4_;
	((Class90) this).aShort1139 = (short) i_5_;
	((Class90) this).aByte1136 = (byte) i_6_;
	((Class90) this).aByte1140 = (byte) i_7_;
	((Class90) this).aBool1138 = bool;
	((Class90) this).anInt1143 = -606144671 * i_8_;
    }
    
    public static boolean method1213(int i) {
	if (Class493.aString5525.startsWith("win")) {
	    String string = "msvcr110.dll";
	    String string_9_ = "msvcp110.dll";
	    String[] strings = { string, string_9_ };
	    String string_10_ = System.getenv("WINDIR");
	    if ("" == string_10_)
		return false;
	    for (int i_11_ = 0; i_11_ < strings.length; i_11_++) {
		File file
		    = new File(new StringBuilder().append(string_10_).append
				   ("\\system32\\").append
				   (strings[i_11_]).toString());
		if (!file.exists() || file.isDirectory())
		    return false;
	    }
	    return true;
	}
	if (Class493.aString5525.startsWith("mac")) {
	    boolean bool;
	    try {
		Process process = Runtime.getRuntime().exec("ps -few");
		BufferedReader bufferedreader
		    = (new BufferedReader
		       (new InputStreamReader(process.getInputStream())));
		do {
		    boolean bool_12_;
		    try {
			int i_13_ = process.waitFor();
			if (i_13_ == 0)
			    break;
			bool_12_ = false;
		    } catch (InterruptedException interruptedexception) {
			return false;
		    }
		    return bool_12_;
		} while (false);
		boolean bool_14_ = false;
	    while_58_:
		do {
		    String string;
		    do {
			if ((string = bufferedreader.readLine()) == null)
			    break while_58_;
		    } while (string.toLowerCase().indexOf("soundflowerbed")
			     == -1);
		    bool_14_ = true;
		} while (false);
		bufferedreader.close();
		bool = bool_14_;
	    } catch (Exception exception) {
		return false;
	    }
	    return bool;
	}
	return false;
    }
    
    static final void method1214(Class648 class648, int i) {
	Class239.method3310(true, (byte) -15);
	Class287.method3864((byte) 1);
	client.aClass495_10935.method5989(2016078152);
	Class243.method3387(2140706657);
	client.aBool11161 = false;
    }
    
    public static boolean method1215(boolean bool, int i) {
	boolean bool_15_ = Class587.aClass173_7714.method2271();
	if (bool != bool_15_) {
	    if (bool) {
		if (!Class587.aClass173_7714.method2269())
		    bool = false;
	    } else
		Class587.aClass173_7714.method2231();
	    if (bool != bool_15_) {
		Class514.aClass528_Sub38_6967.method9556
		    (Class514.aClass528_Sub38_6967.aClass691_Sub19_10601,
		     bool ? 1 : 0, 1611987223);
		Class243.method3387(2141087141);
		return true;
	    }
	    return false;
	}
	return true;
    }
    
    static void method1216(int i, int i_16_, int i_17_, int i_18_,
			   boolean bool, byte i_19_) {
	long l = (long) (i | (bool ? -2147483648 : 0));
	Class528_Sub6 class528_sub6
	    = (Class528_Sub6) Class528_Sub6.aClass692_10254.method8137(l);
	if (null == class528_sub6) {
	    class528_sub6 = new Class528_Sub6();
	    Class528_Sub6.aClass692_10254.method8142(class528_sub6, l);
	}
	if (((Class528_Sub6) class528_sub6).anIntArray10253.length <= i_16_) {
	    int[] is = new int[1 + i_16_];
	    int[] is_20_ = new int[i_16_ + 1];
	    for (int i_21_ = 0;
		 (i_21_
		  < ((Class528_Sub6) class528_sub6).anIntArray10253.length);
		 i_21_++) {
		is[i_21_]
		    = ((Class528_Sub6) class528_sub6).anIntArray10253[i_21_];
		is_20_[i_21_]
		    = ((Class528_Sub6) class528_sub6).anIntArray10252[i_21_];
	    }
	    for (int i_22_
		     = ((Class528_Sub6) class528_sub6).anIntArray10253.length;
		 i_22_ < i_16_; i_22_++) {
		is[i_22_] = -1;
		is_20_[i_22_] = 0;
	    }
	    ((Class528_Sub6) class528_sub6).anIntArray10253 = is;
	    ((Class528_Sub6) class528_sub6).anIntArray10252 = is_20_;
	}
	((Class528_Sub6) class528_sub6).anIntArray10253[i_16_] = i_17_;
	((Class528_Sub6) class528_sub6).anIntArray10252[i_16_] = i_18_;
    }
    
    static final void method1217(byte i) {
	Class209.method2944(836877082);
	client.aClass495_10935.method6049(1839144109);
	for (int i_23_ = 0; i_23_ < client.aClass96Array11016.length; i_23_++)
	    client.aClass96Array11016[i_23_] = null;
	for (int i_24_ = 0; i_24_ < client.aClass527Array11010.length; i_24_++)
	    client.aClass527Array11010[i_24_] = null;
	Class378.method4709(-2146591054);
	for (int i_25_ = 0; i_25_ < 2048; i_25_++)
	    client.localPlayers[i_25_] = null;
	client.anInt10922 = 0;
	client.aClass692_11110.method8141(2110601232);
	client.anInt10921 = 0;
	client.aClass692_11042.method8141(2079471296);
	Class533.method6489(Class372.method4679(-1781426912), -1869375259);
	client.anInt10932 = 0;
	Class570.playerVarsProvider.aClass586_1209.method7006(-489353724);
	Class553.aClass308_7436 = null;
	Class142_Sub2.aClass308_8919 = null;
	Class206.aClass528_Sub36_2231 = null;
	Class272.aClass528_Sub36_2903 = null;
	Class691_Sub32.aClass216_10805 = null;
	Class208.aClass652_2240 = null;
	Class59.aLong708 = 0L;
	Class666.method7903(-1000625145);
	Class24.method698(95190825);
    }
    
    static final void method1218(Class648 class648, int i) {
	int i_26_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_26_, (byte) -1);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = 1661025435 * class229.anInt2458;
    }
}
