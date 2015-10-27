/* Class92 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class92
{
    static final short aShort1146 = 49;
    static final short aShort1147 = 47;
    static final short aShort1148 = 4;
    static final short aShort1149 = 5;
    static final short aShort1150 = 6;
    static final short aShort1151 = 13;
    static final short aShort1152 = 30;
    static final short aShort1153 = 10;
    static final short aShort1154 = 11;
    static final short aShort1155 = 12;
    static final short aShort1156 = 18;
    static final short aShort1157 = 15;
    static final short aShort1158 = 16;
    static final short aShort1159 = 17;
    static final short aShort1160 = 1009;
    static final short aShort1161 = 45;
    static final short aShort1162 = 20;
    static final short aShort1163 = 1010;
    static final short aShort1164 = 46;
    static final short aShort1165 = 23;
    static final short aShort1166 = 25;
    static final short aShort1167 = 3;
    static final short aShort1168 = 44;
    static final short aShort1169 = 1006;
    static final short aShort1170 = 9;
    static final short aShort1171 = 22;
    static final short aShort1172 = 48;
    static final short aShort1173 = 2;
    static final short aShort1174 = 50;
    static final short aShort1175 = 51;
    static final short aShort1176 = 52;
    static final short aShort1177 = 53;
    static final short aShort1178 = 57;
    static final short aShort1179 = 58;
    static final short aShort1180 = 59;
    static final short aShort1181 = 60;
    static final short aShort1182 = 1001;
    static final short aShort1183 = 1002;
    static final short aShort1184 = 1003;
    static final short aShort1185 = 1004;
    static final short aShort1186 = 19;
    static final short aShort1187 = 1007;
    static final short aShort1188 = 1008;
    static final short aShort1189 = 21;
    static final short aShort1190 = 8;
    static final short aShort1191 = 1011;
    static final short aShort1192 = 1012;
    public static int anInt1193;
    
    Class92() throws Throwable {
	throw new Error();
    }
    
    public static void method1224(Class446 class446, Class446 class446_0_,
				  Class446 class446_1_, Class446 class446_2_,
				  int i) {
	Class76.aClass446_792 = class446;
	Class677.aClass446_8556 = class446_0_;
	Class296.aClass446_3248 = class446_1_;
	Class380.aClass226Array3970
	    = new Class226[Class76.aClass446_792.method5356(-569371663)];
	Class95.aBoolArray1212
	    = new boolean[Class76.aClass446_792.method5356(-835234639)];
    }
    
    static final void method1225(Class229 class229, Class226 class226,
				 Class648 class648, int i) {
	String string = (String) (((Class648) class648).anObjectArray8396
				  [(((Class648) class648).anInt8410
				    -= 1600226731) * -520794877]);
	if (Class494.method5957(string, class648, (short) 520) != null)
	    string = string.substring(0, string.length() - 1);
	class229.anObjectArray2557
	    = Class181_Sub23.method8999(string, class648, (byte) -64);
	class229.aBool2483 = true;
    }
    
    static final void method1226(Class648 class648, int i) {
	if (Class495.aClass283_Sub1_5578.method3786((byte) 19)
	    != Class294.aClass294_3227)
	    throw new RuntimeException();
	((Class684_Sub4) Class495.aClass283_Sub1_5578.method3785((byte) -14))
	    .method10111
	    ((((Class648) class648).anIntArray8394
	      [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]),
	     (byte) 28);
    }
    
    static void method1227(int i, int i_3_, Class229 class229, int i_4_) {
	int i_5_ = class229.anInt2476 * -1352480433 + i;
	int i_6_ = i_3_ + 15;
	if (client.aBool10887) {
	    int i_7_ = -256;
	    if (296883021 * client.anInt6953 < 20)
		i_7_ = -65536;
	    Class191.aClass172_2171.method2119
		(new StringBuilder().append("Fps:").append
		     (296883021 * client.anInt6953).append
		     (" (").append
		     (1886312603 * client.anInt6924).append
		     (" ms)").toString(),
		 i_5_, i_6_, i_7_, -1, (byte) -125);
	    i_6_ += 15;
	    Runtime runtime = Runtime.getRuntime();
	    long l = runtime.totalMemory() / 1024L;
	    long l_8_ = l - runtime.freeMemory() / 1024L;
	    int i_9_ = -256;
	    if (l_8_ > 262144L)
		i_9_ = -65536;
	    Class191.aClass172_2171.method2119(new StringBuilder().append
						   ("Mem:").append
						   (l_8_).append
						   ("/").append
						   (l).append
						   ("k").toString(),
					       i_5_, i_6_, i_9_, -1,
					       (byte) -122);
	    i_6_ += 15;
	    long l_10_ = ((Class109) client.aClass109_10930).aClass61_1395
			     .method1004(2036329938);
	    String string = "N/A";
	    if (-1L != l_10_) {
		string = new StringBuilder().append(l_10_).append("ms")
			     .toString();
		if (l_10_ > 500L)
		    string
			= new StringBuilder().append
			      (Class666.method7905(16711680, (short) -18652))
			      .append
			      (string).append
			      (Class666.method7905(16776960, (short) 29863))
			      .toString();
	    }
	    Class191.aClass172_2171.method2119
		(new StringBuilder().append("Game: In:").append
		     (230808865
		      * ((Class109) client.aClass109_10930).anInt1374)
		     .append
		     ("B/s ").append
		     ("Out:").append
		     (((Class109) client.aClass109_10930).anInt1389
		      * -542748523)
		     .append
		     ("B/s ").append
		     ("Ping:").append
		     (string).toString(),
		 i_5_, i_6_, -256, -1, (byte) -17);
	    i_6_ += 15;
	    long l_11_ = ((Class109) client.aClass109_11162).aClass61_1395
			     .method1004(-612882704);
	    String string_12_ = "N/A";
	    if (-1L != l_11_) {
		string_12_ = new StringBuilder().append(l_11_).append("ms")
				 .toString();
		if (l_11_ > 500L)
		    string_12_
			= new StringBuilder().append
			      (Class666.method7905(16711680, (short) -29055))
			      .append
			      (string_12_).append
			      (Class666.method7905(16776960, (short) 19524))
			      .toString();
	    }
	    Class191.aClass172_2171.method2119
		(new StringBuilder().append("Lobby: In:").append
		     (((Class109) client.aClass109_11162).anInt1374
		      * 230808865)
		     .append
		     ("B/s ").append
		     ("Out:").append
		     (((Class109) client.aClass109_11162).anInt1389
		      * -542748523)
		     .append
		     ("B/s ").append
		     ("Ping:").append
		     (string_12_).toString(),
		 i_5_, i_6_, -256, -1, (byte) -45);
	    i_6_ += 15;
	    int i_13_ = Class587.aClass173_7714.method2159() / 1024;
	    Class191.aClass172_2171.method2119(new StringBuilder().append
						   ("Offheap:").append
						   (i_13_).append
						   ("k").toString(),
					       i_5_, i_6_,
					       i_13_ > 65536 ? -65536 : -256,
					       -1, (byte) -108);
	    i_6_ += 15;
	    int i_14_ = 0;
	    int i_15_ = 0;
	    int i_16_ = 0;
	    for (int i_17_ = 0;
		 i_17_ < Class679.aClass460_Sub1Array8563.length; i_17_++) {
		if (Class679.aClass460_Sub1Array8563[i_17_] != null
		    && Class679.aClass460_Sub1Array8563[i_17_]
			   .method9215(-983224589)) {
		    i_14_ += Class679.aClass460_Sub1Array8563[i_17_]
				 .method9190(-1718594554);
		    i_15_ += Class679.aClass460_Sub1Array8563[i_17_]
				 .method9191(202761256);
		    i_16_ += Class679.aClass460_Sub1Array8563[i_17_]
				 .method9194(-1277840847);
		}
	    }
	    int i_18_ = i_14_ == 0 ? 0 : i_16_ * 100 / i_14_;
	    int i_19_ = 0 == i_14_ ? 0 : 10000 * i_15_ / i_14_;
	    String string_20_
		= new StringBuilder().append("Cache:").append
		      (Class312.method4145((long) i_19_, 2, true,
					   Class668.aClass668_8495,
					   1793488466))
		      .append
		      ("% (").append
		      (i_18_).append
		      ("%)").toString();
	    Class378_Sub1_Sub1.aClass172_11264
		.method2119(string_20_, i_5_, i_6_, -256, -1, (byte) -18);
	    i_6_ += 12;
	}
    }
    
    static final void method1228(int i, int i_21_, int i_22_, int i_23_,
				 int i_24_, int i_25_, int i_26_, int i_27_,
				 int i_28_, int i_29_) {
	if (i_22_ >= 1 && i_23_ >= 1
	    && i_22_ <= client.gameScene.method6029((short) 29531) - 2
	    && i_23_ <= client.gameScene.method5967(-74178691) - 2) {
	    int i_30_ = i;
	    if (i_30_ < 3 && client.gameScene.method6006((byte) 0)
				 .method5633(i_22_, i_23_, (short) 414))
		i_30_++;
	    if (client.gameScene.method5973((byte) 52) != null) {
		client.gameScene.method6024(-765386834).method9154
		    (Class587.aClass173_7714, i, i_21_, i_22_, i_23_,
		     (byte) -12);
		if (i_24_ >= 0) {
		    int i_31_
			= Class514.aClass528_Sub38_6967
			      .aClass691_Sub4_10578.method9850((byte) 110);
		    Class514.aClass528_Sub38_6967.method9556
			(Class514.aClass528_Sub38_6967.aClass691_Sub4_10578, 1,
			 1446436853);
		    client.gameScene.method6024(-765386834).method9152
			(Class587.aClass173_7714, i_30_, i, i_22_, i_23_,
			 i_24_, i_25_, i_26_, i_27_, i_28_, (byte) 0);
		    Class514.aClass528_Sub38_6967.method9556
			(Class514.aClass528_Sub38_6967.aClass691_Sub4_10578,
			 i_31_, 1106294545);
		}
		Class501.method6112((Class108
				     .myPlayer
				     .aByte10675),
				    -1411416882);
	    }
	}
    }
    
    static void method1229(int i, int i_32_, int i_33_, int i_34_, int i_35_) {
	float f = ((float) Class518_Sub1.anInt6997
		   / (float) Class518_Sub1.anInt6982);
	int i_36_ = i_33_;
	int i_37_ = i_34_;
	if (f < 1.0F)
	    i_37_ = (int) ((float) i_33_ * f);
	else
	    i_36_ = (int) ((float) i_34_ / f);
	i -= (i_33_ - i_36_) / 2;
	i_32_ -= (i_34_ - i_37_) / 2;
	Class200_Sub1.anInt9820
	    = 7573341 * (i * Class518_Sub1.anInt6982 / i_36_);
	Class98.anInt1256
	    = (Class518_Sub1.anInt6997
	       - Class518_Sub1.anInt6997 * i_32_ / i_37_) * -1406821639;
	Class518_Sub1.anInt10692 = -847541453;
	Class518_Sub1.anInt10687 = 1998421085;
	Class181_Sub5.method8959(-1897906765);
    }
    
    static final void method1230(Class648 class648, int i) {
	((Class648) class648).anInt8395 -= -1816921966;
	int i_38_ = (((Class648) class648).anIntArray8394
		     [((Class648) class648).anInt8395 * 717927929]);
	int i_39_ = (((Class648) class648).anIntArray8394
		     [((Class648) class648).anInt8395 * 717927929 + 1]);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = i_39_ + i_38_;
    }
}
