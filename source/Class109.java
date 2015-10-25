/* Class109 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.io.IOException;

public class Class109
{
    int anInt1374;
    Class551 aClass551_1375;
    Class688 aClass688_1376 = new Class688();
    public int anInt1377 = 0;
    BitBuffer aClass528_Sub42_Sub2_1378;
    public ISAACCipher aClass10_1379;
    IncomingPacket aClass396_1380;
    int anInt1381;
    IncomingPacket current;
    int anInt1383;
    boolean aBool1384;
    IncomingPacket aClass396_1385;
    public int anInt1386;
    public boolean aBool1387;
    int anInt1388;
    int anInt1389;
    IncomingPacket aClass396_1390;
    ISAACCipher aClass10_1391;
    static final int anInt1392 = 15000;
    ByteBuffer aClass528_Sub42_1393 = new ByteBuffer(1700);
    int anInt1394;
    Class61 aClass61_1395;
    static File aFile1396;
    
    final void method1378(short i) {
	((Class109) this).aClass688_1376.method8059((byte) -72);
	anInt1377 = 0;
    }
    
    public final void method1379(int i) throws IOException {
	if (null != ((Class109) this).aClass551_1375
	    && anInt1377 * 204132229 > 0) {
	    ((Class109) this).aClass528_Sub42_1393.pointer = 0;
	    for (;;) {
		Class528_Sub34 class528_sub34
		    = (Class528_Sub34) ((Class109) this).aClass688_1376
					   .method8034(1273176935);
		if (class528_sub34 == null
		    || (class528_sub34.anInt10479 * 1203414759
			> ((((Class109) this).aClass528_Sub42_1393
			    .payload).length
			   - -185904669 * (((Class109) this)
					   .aClass528_Sub42_1393.pointer))))
		    break;
		((Class109) this).aClass528_Sub42_1393.method9618
		    (class528_sub34.aClass528_Sub42_Sub2_10481.payload,
		     0, 1203414759 * class528_sub34.anInt10479, 416454335);
		anInt1377 -= class528_sub34.anInt10479 * -454899077;
		class528_sub34.method6443(-530759800);
		class528_sub34.aClass528_Sub42_Sub2_10481
		    .method9632((byte) 27);
		class528_sub34.method9515((byte) 51);
	    }
	    ((Class109) this).aClass551_1375.method6693
		(((Class109) this).aClass528_Sub42_1393.payload, 0,
		 (((Class109) this).aClass528_Sub42_1393.pointer
		  * -185904669),
		 (byte) 33);
	    ((Class109) this).anInt1381
		+= (((Class109) this).aClass528_Sub42_1393.pointer
		    * 120360931);
	    anInt1386 = 0;
	}
    }
    
    public final void method1380(Class528_Sub34 class528_sub34, int i) {
	((Class109) this).aClass688_1376.method8031(class528_sub34, (byte) 43);
	class528_sub34.anInt10479
	    = 728721829 * class528_sub34.aClass528_Sub42_Sub2_10481.pointer;
	class528_sub34.aClass528_Sub42_Sub2_10481.pointer = 0;
	anInt1377 += class528_sub34.anInt10479 * -454899077;
    }
    
    void method1381(Class551 class551, String string, int i) {
	((Class109) this).aClass551_1375 = class551;
	((Class109) this).aClass61_1395.method1005(string, (short) -29966);
    }
    
    void method1382(int i) {
	if (((Class109) this).aClass551_1375 != null) {
	    ((Class109) this).aClass551_1375.method6694(-1051249221);
	    ((Class109) this).aClass551_1375 = null;
	}
	((Class109) this).aClass61_1395.method1005(null, (short) -15382);
    }
    
    void method1383() {
	if (0 == client.anInt11127 % 50) {
	    ((Class109) this).anInt1389
		= ((Class109) this).anInt1381 * -1787496259;
	    ((Class109) this).anInt1381 = 0;
	    ((Class109) this).anInt1374
		= ((Class109) this).anInt1388 * 313708147;
	    ((Class109) this).anInt1388 = 0;
	}
    }
    
    public Class551 method1384(byte i) {
	return ((Class109) this).aClass551_1375;
    }
    
    final void method1385() {
	((Class109) this).aClass688_1376.method8059((byte) -69);
	anInt1377 = 0;
    }
    
    void method1386() {
	((Class109) this).aClass551_1375 = null;
	((Class109) this).aClass61_1395.method1005(null, (short) -19749);
    }
    
    void method1387(int i) {
	if (0 == client.anInt11127 % 50) {
	    ((Class109) this).anInt1389
		= ((Class109) this).anInt1381 * -1787496259;
	    ((Class109) this).anInt1381 = 0;
	    ((Class109) this).anInt1374
		= ((Class109) this).anInt1388 * 313708147;
	    ((Class109) this).anInt1388 = 0;
	}
    }
    
    void method1388() {
	if (0 == client.anInt11127 % 50) {
	    ((Class109) this).anInt1389
		= ((Class109) this).anInt1381 * -1787496259;
	    ((Class109) this).anInt1381 = 0;
	    ((Class109) this).anInt1374
		= ((Class109) this).anInt1388 * 313708147;
	    ((Class109) this).anInt1388 = 0;
	}
    }
    
    public final void method1389() throws IOException {
	if (null != ((Class109) this).aClass551_1375
	    && anInt1377 * 204132229 > 0) {
	    ((Class109) this).aClass528_Sub42_1393.pointer = 0;
	    for (;;) {
		Class528_Sub34 class528_sub34
		    = (Class528_Sub34) ((Class109) this).aClass688_1376
					   .method8034(1458248413);
		if (class528_sub34 == null
		    || (class528_sub34.anInt10479 * 1203414759
			> ((((Class109) this).aClass528_Sub42_1393
			    .payload).length
			   - -185904669 * (((Class109) this)
					   .aClass528_Sub42_1393.pointer))))
		    break;
		((Class109) this).aClass528_Sub42_1393.method9618
		    (class528_sub34.aClass528_Sub42_Sub2_10481.payload,
		     0, 1203414759 * class528_sub34.anInt10479, 1544055268);
		anInt1377 -= class528_sub34.anInt10479 * -454899077;
		class528_sub34.method6443(28335843);
		class528_sub34.aClass528_Sub42_Sub2_10481
		    .method9632((byte) -51);
		class528_sub34.method9515((byte) -35);
	    }
	    ((Class109) this).aClass551_1375.method6693
		(((Class109) this).aClass528_Sub42_1393.payload, 0,
		 (((Class109) this).aClass528_Sub42_1393.pointer
		  * -185904669),
		 (byte) -65);
	    ((Class109) this).anInt1381
		+= (((Class109) this).aClass528_Sub42_1393.pointer
		    * 120360931);
	    anInt1386 = 0;
	}
    }
    
    void method1390() {
	((Class109) this).aClass551_1375 = null;
	((Class109) this).aClass61_1395.method1005(null, (short) -4612);
    }
    
    void method1391() {
	if (((Class109) this).aClass551_1375 != null) {
	    ((Class109) this).aClass551_1375.method6694(-1051249221);
	    ((Class109) this).aClass551_1375 = null;
	}
	((Class109) this).aClass61_1395.method1005(null, (short) -9788);
    }
    
    void method1392() {
	if (((Class109) this).aClass551_1375 != null) {
	    ((Class109) this).aClass551_1375.method6694(-1051249221);
	    ((Class109) this).aClass551_1375 = null;
	}
	((Class109) this).aClass61_1395.method1005(null, (short) 15627);
    }
    
    void method1393() {
	if (((Class109) this).aClass551_1375 != null) {
	    ((Class109) this).aClass551_1375.method6694(-1051249221);
	    ((Class109) this).aClass551_1375 = null;
	}
	((Class109) this).aClass61_1395.method1005(null, (short) 747);
    }
    
    void method1394() {
	if (((Class109) this).aClass551_1375 != null) {
	    ((Class109) this).aClass551_1375.method6694(-1051249221);
	    ((Class109) this).aClass551_1375 = null;
	}
	((Class109) this).aClass61_1395.method1005(null, (short) -1451);
    }
    
    Class109() {
	((Class109) this).aClass528_Sub42_Sub2_1378
	    = new BitBuffer(15000);
	((Class109) this).current = null;
	((Class109) this).anInt1383 = 0;
	((Class109) this).aBool1384 = true;
	((Class109) this).anInt1394 = 0;
	anInt1386 = 0;
	aBool1387 = false;
	((Class109) this).aClass61_1395 = new Class61();
	Thread thread = new Thread(((Class109) this).aClass61_1395);
	thread.setDaemon(true);
	thread.setPriority(1);
	thread.start();
    }
    
    void method1395() {
	if (0 == client.anInt11127 % 50) {
	    ((Class109) this).anInt1389
		= ((Class109) this).anInt1381 * -1787496259;
	    ((Class109) this).anInt1381 = 0;
	    ((Class109) this).anInt1374
		= ((Class109) this).anInt1388 * 313708147;
	    ((Class109) this).anInt1388 = 0;
	}
    }
    
    void method1396() {
	((Class109) this).aClass551_1375 = null;
	((Class109) this).aClass61_1395.method1005(null, (short) -5975);
    }
    
    void method1397(short i) {
	((Class109) this).aClass551_1375 = null;
	((Class109) this).aClass61_1395.method1005(null, (short) 176);
    }
    
    static final void method1398(Class229 class229, Class648 class648, int i) {
	int i_0_ = 10;
	Class169.method2103(class229, i_0_, class648, -193583859);
    }
    
    static final void method1399(Class648 class648, int i) {
	Class474.method5828(-1205300479);
    }
    
    static final void method1400(Class648 class648, int i) {
	((Class648) class648).anInt8395 -= -1816921966;
	int i_1_ = (((Class648) class648).anIntArray8394
		    [717927929 * ((Class648) class648).anInt8395]);
	int i_2_ = (((Class648) class648).anIntArray8394
		    [717927929 * ((Class648) class648).anInt8395 + 1]);
	int i_3_ = client.aClass487ArrayArray11004[i_2_][i_1_]
		       .method5885((byte) 109);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = i_3_ == 1 ? 1 : 0;
    }
    
    public static void method1401(int i, int i_4_, int i_5_, int i_6_,
				  int i_7_) {
	for (Class528_Sub11 class528_sub11
		 = ((Class528_Sub11)
		    Class528_Sub11.aClass688_10318.method8034(2026025706));
	     class528_sub11 != null;
	     class528_sub11 = (Class528_Sub11) Class528_Sub11
						   .aClass688_10318
						   .method8037(1068926004))
	    Class2.method508(class528_sub11, i, i_4_, i_5_, i_6_, 1918868114);
	for (Class528_Sub11 class528_sub11
		 = ((Class528_Sub11)
		    Class528_Sub11.aClass688_10313.method8034(1691738199));
	     null != class528_sub11;
	     class528_sub11 = (Class528_Sub11) Class528_Sub11
						   .aClass688_10313
						   .method8037(-1906385585)) {
	    int i_8_ = 1;
	    RenderType renderType = ((Class528_Sub11) class528_sub11)
				    .aClass645_Sub1_Sub5_Sub1_Sub1_10326
				    .getRender(-765027204);
	    int i_9_ = ((Class528_Sub11) class528_sub11)
			   .aClass645_Sub1_Sub5_Sub1_Sub1_10326
			   .aClass690_Sub3_11803.method8068(-772845955);
	    if (-1 == i_9_ || (((Class528_Sub11) class528_sub11)
			       .aClass645_Sub1_Sub5_Sub1_Sub1_10326
			       .aClass690_Sub3_11803.aBool10798))
		i_8_ = 0;
	    else if (630040273 * renderType.anInt7660 == i_9_
		     || -1724508225 * renderType.anInt7666 == i_9_
		     || renderType.anInt7679 * 384769079 == i_9_
		     || i_9_ == 888920185 * renderType.anInt7662)
		i_8_ = 2;
	    else if (1022705985 * renderType.anInt7664 == i_9_
		     || i_9_ == -1467373345 * renderType.anInt7684
		     || renderType.anInt7667 * 299271595 == i_9_
		     || renderType.anInt7669 * -137509863 == i_9_)
		i_8_ = 3;
	    if (-57805031 * ((Class528_Sub11) class528_sub11).anInt10332
		!= i_8_) {
		int i_10_ = (Class443.method5323
			     ((((Class528_Sub11) class528_sub11)
			       .aClass645_Sub1_Sub5_Sub1_Sub1_10326),
			      -1069440013));
		Class299 class299
		    = (((Class528_Sub11) class528_sub11)
		       .aClass645_Sub1_Sub5_Sub1_Sub1_10326.aClass299_12043);
		if (class299.anIntArray3302 != null)
		    class299 = class299.method3996(Class570.playerVarsProvider,
						   Class570.playerVarsProvider,
						   -178113182);
		if (class299 == null || -1 == i_10_) {
		    ((Class528_Sub11) class528_sub11).anInt10336 = -1704527213;
		    ((Class528_Sub11) class528_sub11).anInt10332
			= 1235055913 * i_8_;
		} else if (i_10_
			   != -389624731 * (((Class528_Sub11) class528_sub11)
					    .anInt10336)) {
		    boolean bool = false;
		    if (((Class528_Sub11) class528_sub11).aClass469_10337
			!= null) {
			((Class528_Sub11) class528_sub11).anInt10334
			    -= 766252544;
			if ((((Class528_Sub11) class528_sub11).anInt10334
			     * -704215645)
			    <= 0) {
			    ((Class528_Sub11) class528_sub11)
				.aClass469_10337.method5742(100, 2038891959);
			    Class365.aClass218_3848.method3101
				((((Class528_Sub11) class528_sub11)
				  .aClass469_10337),
				 2000096727);
			    ((Class528_Sub11) class528_sub11).aClass469_10337
				= null;
			    bool = true;
			}
		    } else
			bool = true;
		    if (bool) {
			((Class528_Sub11) class528_sub11).anInt10334
			    = class299.anInt3300 * 1937393747;
			((Class528_Sub11) class528_sub11).anInt10336
			    = i_10_ * 1704527213;
			((Class528_Sub11) class528_sub11).anInt10332
			    = 1235055913 * i_8_;
		    }
		} else {
		    ((Class528_Sub11) class528_sub11).anInt10332
			= 1235055913 * i_8_;
		    ((Class528_Sub11) class528_sub11).anInt10334
			= 1937393747 * class299.anInt3300;
		}
	    }
	    Class422 class422
		= (((Class528_Sub11) class528_sub11)
		       .aClass645_Sub1_Sub5_Sub1_Sub1_10326.method7693
		   ().aClass422_4868);
	    ((Class528_Sub11) class528_sub11).anInt10316
		= -1170201631 * (int) class422.aFloat4780;
	    ((Class528_Sub11) class528_sub11).anInt10340
		= ((int) class422.aFloat4780
		   + (((Class528_Sub11) class528_sub11)
			  .aClass645_Sub1_Sub5_Sub1_Sub1_10326
			  .method10671((byte) -5)
		      << 8)) * -1794932067;
	    ((Class528_Sub11) class528_sub11).anInt10317
		= 736859269 * (int) class422.aFloat4777;
	    ((Class528_Sub11) class528_sub11).anInt10311
		= ((int) class422.aFloat4777
		   + (((Class528_Sub11) class528_sub11)
			  .aClass645_Sub1_Sub5_Sub1_Sub1_10326
			  .method10671((byte) -75)
		      << 8)) * 1620421083;
	    ((Class528_Sub11) class528_sub11).anInt10315
		= ((((Class528_Sub11) class528_sub11)
		    .aClass645_Sub1_Sub5_Sub1_Sub1_10326.aByte10675)
		   * -855681369);
	    Class2.method508(class528_sub11, i, i_4_, i_5_, i_6_, 1898559547);
	}
	for (Class528_Sub11 class528_sub11
		 = ((Class528_Sub11)
		    Class528_Sub11.aClass692_10325.method8146(-1942855841));
	     class528_sub11 != null;
	     class528_sub11 = (Class528_Sub11) Class528_Sub11
						   .aClass692_10325
						   .method8138(-1401835667)) {
	    int i_11_ = 1;
	    RenderType renderType = ((Class528_Sub11) class528_sub11)
				    .aClass645_Sub1_Sub5_Sub1_Sub2_10327
				    .getRender(-182108937);
	    int i_12_ = ((Class528_Sub11) class528_sub11)
			    .aClass645_Sub1_Sub5_Sub1_Sub2_10327
			    .aClass690_Sub3_11803.method8068(-772845955);
	    if (-1 == i_12_ || (((Class528_Sub11) class528_sub11)
				.aClass645_Sub1_Sub5_Sub1_Sub2_10327
				.aClass690_Sub3_11803.aBool10798))
		i_11_ = 0;
	    else if (i_12_ == renderType.anInt7660 * 630040273
		     || i_12_ == -1724508225 * renderType.anInt7666
		     || i_12_ == 384769079 * renderType.anInt7679
		     || i_12_ == 888920185 * renderType.anInt7662)
		i_11_ = 2;
	    else if (i_12_ == 1022705985 * renderType.anInt7664
		     || renderType.anInt7684 * -1467373345 == i_12_
		     || renderType.anInt7667 * 299271595 == i_12_
		     || renderType.anInt7669 * -137509863 == i_12_)
		i_11_ = 3;
	    if (i_11_
		!= ((Class528_Sub11) class528_sub11).anInt10332 * -57805031) {
		int i_13_ = (Class377.method4706
			     ((((Class528_Sub11) class528_sub11)
			       .aClass645_Sub1_Sub5_Sub1_Sub2_10327),
			      1953968327));
		if (-389624731 * ((Class528_Sub11) class528_sub11).anInt10336
		    != i_13_) {
		    boolean bool = false;
		    if (null
			!= ((Class528_Sub11) class528_sub11).aClass469_10337) {
			((Class528_Sub11) class528_sub11).anInt10334
			    -= 766252544;
			if ((-704215645
			     * ((Class528_Sub11) class528_sub11).anInt10334)
			    <= 0) {
			    ((Class528_Sub11) class528_sub11)
				.aClass469_10337.method5742(100, 2073059613);
			    Class365.aClass218_3848.method3101
				((((Class528_Sub11) class528_sub11)
				  .aClass469_10337),
				 1873695000);
			    ((Class528_Sub11) class528_sub11).aClass469_10337
				= null;
			    bool = true;
			}
		    } else
			bool = true;
		    if (bool) {
			((Class528_Sub11) class528_sub11).anInt10334
			    = (((Class528_Sub11) class528_sub11)
			       .aClass645_Sub1_Sub5_Sub1_Sub2_10327
			       .anInt12067) * -2135058741;
			((Class528_Sub11) class528_sub11).anInt10336
			    = 1704527213 * i_13_;
			((Class528_Sub11) class528_sub11).anInt10332
			    = 1235055913 * i_11_;
		    }
		} else {
		    ((Class528_Sub11) class528_sub11).anInt10334
			= ((((Class528_Sub11) class528_sub11)
			    .aClass645_Sub1_Sub5_Sub1_Sub2_10327.anInt12067)
			   * -2135058741);
		    ((Class528_Sub11) class528_sub11).anInt10332
			= 1235055913 * i_11_;
		}
	    }
	    Class422 class422
		= (((Class528_Sub11) class528_sub11)
		       .aClass645_Sub1_Sub5_Sub1_Sub2_10327.method7693
		   ().aClass422_4868);
	    ((Class528_Sub11) class528_sub11).anInt10316
		= -1170201631 * (int) class422.aFloat4780;
	    ((Class528_Sub11) class528_sub11).anInt10340
		= ((int) class422.aFloat4780
		   + (((Class528_Sub11) class528_sub11)
			  .aClass645_Sub1_Sub5_Sub1_Sub2_10327
			  .method10671((byte) -6)
		      << 8)) * -1794932067;
	    ((Class528_Sub11) class528_sub11).anInt10317
		= (int) class422.aFloat4777 * 736859269;
	    ((Class528_Sub11) class528_sub11).anInt10311
		= ((int) class422.aFloat4777
		   + (((Class528_Sub11) class528_sub11)
			  .aClass645_Sub1_Sub5_Sub1_Sub2_10327
			  .method10671((byte) -103)
		      << 8)) * 1620421083;
	    ((Class528_Sub11) class528_sub11).anInt10315
		= ((((Class528_Sub11) class528_sub11)
		    .aClass645_Sub1_Sub5_Sub1_Sub2_10327.aByte10675)
		   * -855681369);
	    Class2.method508(class528_sub11, i, i_4_, i_5_, i_6_, -49006100);
	}
    }
    
    public static void method1402(int i, int i_14_, float f,
				  Interface42 interface42, int i_15_) {
	if (Class641.aClass364_8273 != null)
	    Class641.aClass364_8273.method4609((byte) 94)
		.method4581(i, i_14_, f, interface42, (byte) 66);
    }
    
    static final void method1403(Class648 class648, byte i) {
	int i_16_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Character.toUpperCase((char) i_16_);
    }
    
    public static void method1404(byte i) {
	Class399.method4831(-247954101);
    }
}
