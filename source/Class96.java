/* Class96 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class96
{
    static int anInt1214;
    static Class186 aClass186_1215 = new Class186(4);
    public int anInt1216;
    int anInt1217;
    public int anInt1218;
    public int anInt1219;
    int anInt1220;
    public int anInt1221 = -2003470403;
    public int anInt1222;
    int anInt1223;
    public int anInt1224;
    int anInt1225;
    public static Class259 aClass259_1226;
    
    static void method1263() {
	aClass186_1215.method2731(-1007926589);
    }
    
    Class96() {
	/* empty */
    }
    
    static void method1264(int i) {
	aClass186_1215.method2747(i, -250519384);
    }
    
    static void method1265() {
	aClass186_1215.method2731(-1304236799);
    }
    
    static void method1266(int i) {
	aClass186_1215.method2747(i, 393328506);
    }
    
    static void method1267() {
	aClass186_1215.method2735(-1118079747);
    }
    
    static String method1268(String string, int i) {
	String string_0_ = null;
	int i_1_ = string.indexOf("--> ");
	if (i_1_ >= 0) {
	    string_0_ = string.substring(0, i_1_ + 4);
	    string = string.substring(i_1_ + 4);
	}
	int i_2_ = -1;
	if (string.startsWith("directlogin "))
	    i_2_ = string.indexOf(" ", "directlogin ".length());
	if (i_2_ >= 0) {
	    int i_3_ = string.length();
	    string
		= new StringBuilder().append(string.substring(0, i_2_)).append
		      (" ").toString();
	    for (int i_4_ = 1 + i_2_; i_4_ < i_3_; i_4_++)
		string = new StringBuilder().append(string).append("*")
			     .toString();
	}
	if (null != string_0_)
	    return new StringBuilder().append(string_0_).append(string)
		       .toString();
	return string;
    }
    
    static final void method1269(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class108.myPlayer.method10688
		  ((byte) 13).method6899(1832718590);
    }
    
    static final void method1270(Class648 class648, int i) {
	String string = (String) (((Class648) class648).anObjectArray8396
				  [(((Class648) class648).anInt8410
				    -= 1600226731) * -520794877]);
	if (string != null)
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= string.length();
	else
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= 0;
    }
}
