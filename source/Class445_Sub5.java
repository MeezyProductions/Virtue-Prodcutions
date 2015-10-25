/* Class445_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

final class Class445_Sub5 extends VarDomainType
{
    @Override
	Object method5332(Class142 class142, int i) {
	if (class142.aClass459_1638 == Class459.aClass459_5136)
	    return Integer.valueOf(-1);
	return class142.aClass459_1638.method5565((byte) -65);
    }
    
    Class445_Sub5(SharedConfigsType sharedConfigsType, int i, boolean bool, boolean bool_0_) {
		super(sharedConfigsType, i, bool, bool_0_);
    }
    
    @Override
	Object method5335(Class142 class142) {
	if (class142.aClass459_1638 == Class459.aClass459_5136)
	    return Integer.valueOf(-1);
	return class142.aClass459_1638.method5565((byte) -58);
    }
    
    public static void method9222(String string, boolean bool, boolean bool_1_,
				  int i) {
	do {
	    try {
		if (string.equalsIgnoreCase("commands")
		    || string.equalsIgnoreCase("help")) {
		    Class364_Sub2.method9236("commands - This command",
					     (byte) -102);
		    Class364_Sub2.method9236("cls - Clear console", (byte) 44);
		    Class364_Sub2.method9236
			("displayfps - Toggle FPS and other information",
			 (byte) 54);
		    Class364_Sub2.method9236
			("renderer - Print graphics renderer information",
			 (byte) 62);
		    Class364_Sub2.method9236
			("heap - Print java memory information", (byte) -11);
		    Class364_Sub2.method9236
			("getcamerapos - Print location and direction of camera for use in bug reports",
			 (byte) 56);
		} else if (string.equalsIgnoreCase("cls")) {
		    Class99.anInt1268 = 0;
		    Class99.anInt1261 = 0;
		} else if (string.equalsIgnoreCase("displayfps")) {
		    client.aBool10887 = !client.aBool10887;
		    if (client.aBool10887)
			Class364_Sub2.method9236("FPS on", (byte) 22);
		    else
			Class364_Sub2.method9236("FPS off", (byte) -58);
		} else if (string.equals("renderer")) {
		    Class152 class152 = Class587.aClass173_7714.method2528();
		    Class364_Sub2.method9236
			(new StringBuilder().append("Toolkit ID: ").append
			     (Class514.aClass528_Sub38_6967
				  .aClass691_Sub24_10594
				  .method10014(-1824619963))
			     .toString(),
			 (byte) -114);
		    Class364_Sub2.method9236(new StringBuilder().append
						 ("Vendor: ").append
						 (-1997001775
						  * class152.anInt1714)
						 .toString(),
					     (byte) 9);
		    Class364_Sub2.method9236(new StringBuilder().append
						 ("Name: ").append
						 (class152.aString1709)
						 .toString(),
					     (byte) 40);
		    Class364_Sub2.method9236(new StringBuilder().append
						 ("Version: ").append
						 (class152.anInt1716
						  * -1954440977)
						 .toString(),
					     (byte) 103);
		    Class364_Sub2.method9236(new StringBuilder().append
						 ("Device: ").append
						 (class152.aString1715)
						 .toString(),
					     (byte) 37);
		    Class364_Sub2.method9236(new StringBuilder().append
						 ("Driver Version: ").append
						 (class152.aLong1719
						  * -888169491940115569L)
						 .toString(),
					     (byte) 61);
		    String string_2_ = Class587.aClass173_7714.method2169();
		    if (string_2_.length() > 0)
			Class364_Sub2.method9236(string_2_, (byte) 43);
		} else if (string.equals("heap"))
		    Class364_Sub2.method9236(new StringBuilder().append
						 ("Heap: ").append
						 (1110656915
						  * Class509.anInt6957)
						 .append
						 ("MB").toString(),
					     (byte) -5);
		else if (string.equalsIgnoreCase("getcamerapos")) {
		    Class578 class578
			= client.aClass495_10935.method5966(1273279609);
		    if (6 == Class390.anInt4111 * -1860881523) {
			Class422 class422 = Class495.aClass283_Sub1_5578
						.method3788((short) -14388);
			Class422 class422_3_ = Class495.aClass283_Sub1_5578
						   .method3789(1756514427);
			Class364_Sub2.method9236
			    (new StringBuilder().append("Pos: ").append
				 (new Class578
				      ((Class108
					.myPlayer
					.aByte10675),
				       (int) class422.aFloat4780 >> 9,
				       (int) class422.aFloat4777 >> 9)
				      .toString())
				 .append
				 (" Height: ").append
				 ((Class335_Sub1_Sub1.method10374
				   (((int) class422.aFloat4780
				     - (class578.anInt7607 * 961465569 << 9)),
				    ((int) class422.aFloat4777
				     - (class578.anInt7608 * -173815201 << 9)),
				    (Class108
				     .myPlayer
				     .aByte10675),
				    -759833206)) + (int) class422.aFloat4776)
				 .toString(),
			     (byte) -21);
			Class364_Sub2.method9236
			    (new StringBuilder().append("Look: ").append
				 (new Class578
				      ((Class108
					.myPlayer
					.aByte10675),
				       (int) class422_3_.aFloat4780 >> 9,
				       (int) class422_3_.aFloat4777 >> 9)
				      .toString())
				 .append
				 (" Height: ").append
				 ((Class335_Sub1_Sub1.method10374
				   (((int) class422_3_.aFloat4780
				     - (class578.anInt7607 * 961465569 << 9)),
				    ((int) class422.aFloat4777
				     - (-173815201 * class578.anInt7608 << 9)),
				    (Class108
				     .myPlayer
				     .aByte10675),
				    -759833206)) + (int) class422.aFloat4776)
				 .toString(),
			     (byte) -13);
		    } else {
			Class364_Sub2.method9236
			    (new StringBuilder().append("Pos: ").append
				 (Class108.myPlayer
				  .aByte10675)
				 .append
				 (",").append
				 (((-639218145 * Class626.anInt8136 >> 9)
				   + 961465569 * class578.anInt7607) >> 6)
				 .append
				 (",").append
				 (((Class227.anInt2347 * -1246131271 >> 9)
				   + -173815201 * class578.anInt7608) >> 6)
				 .append
				 (",").append
				 ((class578.anInt7607 * 961465569
				   + (Class626.anInt8136 * -639218145 >> 9))
				  & 0x3f)
				 .append
				 (",").append
				 ((class578.anInt7608 * -173815201
				   + (-1246131271 * Class227.anInt2347 >> 9))
				  & 0x3f)
				 .append
				 (" Height: ").append
				 ((Class335_Sub1_Sub1.method10374
				   (-639218145 * Class626.anInt8136,
				    Class227.anInt2347 * -1246131271,
				    (Class108
				     .myPlayer
				     .aByte10675),
				    -759833206))
				  - Class137.anInt1630 * 950408709)
				 .toString(),
			     (byte) 12);
			Class364_Sub2.method9236
			    (new StringBuilder().append("Look: ").append
				 (Class108.myPlayer
				  .aByte10675)
				 .append
				 (",").append
				 ((Class655.anInt8433 * 1164970819
				   + class578.anInt7607 * 961465569) >> 6)
				 .append
				 (",").append
				 ((Class578.anInt7609 * 1707997835
				   + -173815201 * class578.anInt7608) >> 6)
				 .append
				 (",").append
				 ((961465569 * class578.anInt7607
				   + Class655.anInt8433 * 1164970819) & 0x3f)
				 .append
				 (",").append
				 ((class578.anInt7608 * -173815201
				   + 1707997835 * Class578.anInt7609) & 0x3f)
				 .append
				 (" Height: ").append
				 ((Class335_Sub1_Sub1.method10374
				   (1164970819 * Class655.anInt8433,
				    1707997835 * Class578.anInt7609,
				    (Class108
				     .myPlayer
				     .aByte10675),
				    -759833206))
				  - -1739906383 * Class249.anInt2780)
				 .toString(),
			     (byte) 67);
		    }
		} else if (string.equalsIgnoreCase("cam_shake_test")) {
		    Class528_Sub21_Sub8_Sub1 class528_sub21_sub8_sub1
			= new Class528_Sub21_Sub8_Sub1(0,
						       Class266.aClass266_2876,
						       Class417
							   .method4970(125),
						       2.0F);
		    Class495.aClass283_Sub1_5578
			.method3781(class528_sub21_sub8_sub1, 231901904);
		} else {
		    if (!string.equalsIgnoreCase("cam_shake_reset"))
			break;
		    Class495.aClass283_Sub1_5578.method3762(781940533);
		}
	    } catch (Exception exception) {
		Class364_Sub2.method9236
		    (Class39.aClass39_342
			 .method807(Class378_Sub2.aClass668_10123, (byte) 102),
		     (byte) 77);
	    }
	    return;
	} while (false);
	if (Class646.aClass665_8386 != ModeWhere.LIVE
	    || client.playerRights * 859247239 >= 2) {
	    try {
		if (string.equalsIgnoreCase("wm1")) {
		    Class289.method3875(1, -1, -1, false, 2130003981);
		    if (Class377.method4705(81973209) == 1)
			Class364_Sub2.method9236("Success", (byte) -15);
		    else
			Class364_Sub2.method9236("Failure", (byte) -86);
		    return;
		}
		if (string.equalsIgnoreCase("wm2")) {
		    Class289.method3875(2, -1, -1, false, 2130003981);
		    if (Class377.method4705(-172961616) == 2)
			Class364_Sub2.method9236("Success", (byte) 18);
		    else
			Class364_Sub2.method9236("Failure", (byte) -84);
		    return;
		}
		if (Class700.aBool8733 && string.equalsIgnoreCase("wm3")) {
		    Class289.method3875(3, 1024, 768, false, 2130003981);
		    if (Class377.method4705(-1864276623) == 3)
			Class364_Sub2.method9236("Success", (byte) 73);
		    else
			Class364_Sub2.method9236("Failure", (byte) -17);
		    return;
		}
		if (string.startsWith("setlobby ")) {
		    if (client.anInt10876 * 175711435 != 8)
			Class364_Sub2.method9236("Failure", (byte) 1);
		    else {
			int i_4_ = -1;
			Object object = null;
			string = string.substring(9);
			int i_5_ = string.indexOf(' ');
			if (-1 == i_5_)
			    Class364_Sub2.method9236("Failure", (byte) -28);
			else {
			    try {
				i_4_
				    = Integer.parseInt(string.substring(0,
									i_5_));
			    } catch (NumberFormatException numberformatexception) {
				/* empty */
			    }
			    if (-1 == i_4_)
				Class364_Sub2.method9236("Failure", (byte) 4);
			    else {
				String string_6_
				    = new StringBuilder().append
					  (string.substring(i_5_ + 1).trim())
					  .append
					  (".runescape.com").toString();
				ProtocolLoop.method1057(string_6_, i_4_,
						   1194562377);
				Class364_Sub2.method9236("Success",
							 (byte) -38);
				return;
			    }
			    return;
			}
			return;
		    }
		    return;
		}
		if (string.equalsIgnoreCase("tk0")) {
		    Class186.method2754(0, false, 582719590);
		    if (Class514.aClass528_Sub38_6967.aClass691_Sub24_10594
			    .method10014(-1824619963)
			== 0) {
			Class364_Sub2.method9236("Success", (byte) 24);
			Class514.aClass528_Sub38_6967.method9556
			    ((Class514.aClass528_Sub38_6967
			      .aClass691_Sub24_10577),
			     0, 1000314192);
			Class243.method3387(2137047488);
			client.aBool11161 = false;
		    } else
			Class364_Sub2.method9236("Failure", (byte) -33);
		    return;
		}
		if (string.equalsIgnoreCase("tk1")) {
		    Class186.method2754(1, false, -6708755);
		    if (Class514.aClass528_Sub38_6967.aClass691_Sub24_10594
			    .method10014(-1824619963)
			== 1) {
			Class364_Sub2.method9236("Success", (byte) -78);
			Class514.aClass528_Sub38_6967.method9556
			    ((Class514.aClass528_Sub38_6967
			      .aClass691_Sub24_10577),
			     1, 1665531345);
			Class243.method3387(2145575181);
			client.aBool11161 = false;
		    } else
			Class364_Sub2.method9236("Failure", (byte) -51);
		    return;
		}
		if (string.equalsIgnoreCase("tk3")) {
		    Class186.method2754(3, false, 371783775);
		    if (Class514.aClass528_Sub38_6967.aClass691_Sub24_10594
			    .method10014(-1824619963)
			== 3) {
			Class364_Sub2.method9236("Success", (byte) 64);
			Class514.aClass528_Sub38_6967.method9556
			    ((Class514.aClass528_Sub38_6967
			      .aClass691_Sub24_10577),
			     3, 919504112);
			Class243.method3387(2135707156);
			client.aBool11161 = false;
		    } else
			Class364_Sub2.method9236("Failure", (byte) 95);
		    return;
		}
		if (string.equalsIgnoreCase("tk5")) {
		    Class186.method2754(5, false, 1505219888);
		    if (Class514.aClass528_Sub38_6967.aClass691_Sub24_10594
			    .method10014(-1824619963)
			== 5) {
			Class364_Sub2.method9236("Success", (byte) -3);
			Class514.aClass528_Sub38_6967.method9556
			    ((Class514.aClass528_Sub38_6967
			      .aClass691_Sub24_10577),
			     5, 1704408534);
			Class243.method3387(2137297071);
			client.aBool11161 = false;
		    } else
			Class364_Sub2.method9236("Failure", (byte) -41);
		    return;
		}
		if (string.equalsIgnoreCase("clientdrop")) {
		    if (175711435 * client.anInt10876 == 9)
			Class662.method7879((byte) 96);
		    else if (1 == 175711435 * client.anInt10876)
			client.aClass109_10930.aBool1387 = true;
		    return;
		}
		if (string.equalsIgnoreCase("breakcon")) {
		    Class109[] class109s = client.aClass109Array10931;
		    for (int i_7_ = 0; i_7_ < class109s.length; i_7_++) {
			Class109 class109 = class109s[i_7_];
			if (class109.method1384((byte) 65) != null)
			    class109.method1384((byte) 35)
				.method6695(-1890512618);
		    }
		    Class700.aClass454_8734.method5472((short) -31092);
		    return;
		}
		if (string.startsWith("getclientvarpbit")) {
		    int i_8_ = Integer.parseInt(string.substring(17));
		    Class364_Sub2.method9236
			(new StringBuilder().append("varpbit=").append
			     (Class570.playerVarsProvider.method97
			      (Class570.playerVarsProvider.method79(i_8_,
							       (byte) 10),
			       -1860881523))
			     .toString(),
			 (byte) -79);
		    return;
		}
		if (string.startsWith("getclientvarp")) {
		    int i_9_ = Integer.parseInt(string.substring(14));
		    Class364_Sub2.method9236(new StringBuilder().append
						 ("varp=").append
						 (Class570.playerVarsProvider
						      .method114
						  ((Class570.playerVarsProvider
							.method82
						    (VarDomainType.PLAYER_CONFIGS,
						     i_9_, -783609339)),
						   (byte) -27))
						 .toString(),
					     (byte) -11);
		    return;
		}
		if (string.startsWith("directlogin")) {
		    String[] strings
			= Class520.method6348(string.substring(12), ' ',
					      (byte) 15);
		    if (strings.length == 2 || 3 == strings.length) {
			if (Class181.method2686(-1712965615))
			    Class474.method5828(-1205300479);
			Class567.method6839(strings[0], strings[1],
					    (strings.length > 2 ? strings[2]
					     : ""),
					    true, 106707579);
		    }
		    return;
		}
		if (string.startsWith("snlogin ")) {
		    String[] strings = Class520.method6348(string.substring(8),
							   ' ', (byte) -73);
		    int i_10_ = Integer.parseInt(strings[0]);
		    String string_11_ = strings.length > 1 ? strings[1] : "";
		    Class207.method2931(i_10_, string_11_, true, (byte) 48);
		    return;
		}
		if (string.startsWith("setoutput ")) {
		    File file = new File(string.substring(10));
		    if (file.exists()) {
			file = new File(new StringBuilder().append
					    (string.substring(10)).append
					    (".").append
					    (Class249.method3417(2124355210))
					    .append
					    (".log").toString());
			if (file.exists()) {
			    Class364_Sub2.method9236("file already exists!",
						     (byte) 13);
			    return;
			}
		    }
		    if (null != Class315.aFileOutputStream3446) {
			Class315.aFileOutputStream3446.close();
			Class315.aFileOutputStream3446 = null;
		    }
		    try {
			Class315.aFileOutputStream3446
			    = new FileOutputStream(file);
		    } catch (FileNotFoundException filenotfoundexception) {
			Class364_Sub2.method9236(new StringBuilder().append
						     ("Could not create ")
						     .append
						     (file.getName())
						     .toString(),
						 (byte) 60);
		    } catch (SecurityException securityexception) {
			Class364_Sub2.method9236(new StringBuilder().append
						     ("Cannot write to ")
						     .append
						     (file.getName())
						     .toString(),
						 (byte) 92);
		    }
		    return;
		}
		if (string.equals("closeoutput")) {
		    if (Class315.aFileOutputStream3446 != null)
			Class315.aFileOutputStream3446.close();
		    Class315.aFileOutputStream3446 = null;
		    return;
		}
		if (string.startsWith("runscript ")) {
		    File file = new File(string.substring(10));
		    if (!file.exists()) {
			Class364_Sub2.method9236("No such file", (byte) 5);
			return;
		    }
		    byte[] is = Class543.method6641(file, (byte) 33);
		    if (null == is) {
			Class364_Sub2.method9236("Failed to read file",
						 (byte) 35);
			return;
		    }
		    String[] strings = (Class520.method6348
					((Class255.method3452
					  (Class544.method6659(is, (byte) 111),
					   '\r', "", (byte) 73)),
					 '\n', (byte) -8));
		    Class98.method1308(strings, -2124290184);
		}
		if (9 == client.anInt10876 * 175711435
		    || 12 == client.anInt10876 * 175711435) {
		    Class109 class109 = Class591.method7078((byte) 24);
		    Class528_Sub34 class528_sub34
			= Class656.method7845(OutgoingOpcode.aClass403_4497,
					      class109.aClass10_1379,
					      -2050961205);
		    class528_sub34.aClass528_Sub42_Sub2_10481
			.writeByte(string.length() + 3, (byte) 38);
		    class528_sub34.aClass528_Sub42_Sub2_10481
			.writeByte(bool ? 1 : 0, (byte) 71);
		    class528_sub34.aClass528_Sub42_Sub2_10481
			.writeByte(bool_1_ ? 1 : 0, (byte) 62);
		    class528_sub34.aClass528_Sub42_Sub2_10481
			.writeString(string, -1936289654);
		    class109.method1380(class528_sub34, 1981087536);
		}
	    } catch (Exception exception) {
		Class364_Sub2.method9236
		    (Class39.aClass39_342
			 .method807(Class378_Sub2.aClass668_10123, (byte) 102),
		     (byte) 97);
		return;
	    }
	}
	if (9 != 175711435 * client.anInt10876
	    && 12 != 175711435 * client.anInt10876)
	    Class364_Sub2.method9236(new StringBuilder().append
					 (Class39.aClass39_429.method807
					  (Class378_Sub2.aClass668_10123,
					   (byte) 102))
					 .append
					 (string).toString(),
				     (byte) 77);
    }
    
    static boolean method9223(int i) {
	if (175711435 * client.anInt10876 != 8)
	    return false;
	if (Class181.method2686(-1712965615)
	    || Class528_Sub36.method9535(-1955299567))
	    return false;
	return true;
    }
}
