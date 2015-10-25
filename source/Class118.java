/* Class118 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class118 implements IClientEnum
{
    static Class118 aClass118_1427;
    int anInt1428;
    static Class118 aClass118_1429;
    static Class118 aClass118_1430;
    static Class118 aClass118_1431;
    static Class118 aClass118_1432;
    static Class118 aClass118_1433;
    static Class118 aClass118_1434;
    static Class118 aClass118_1435;
    public int anInt1436;
    static Class118 aClass118_1437;
    static Class118 aClass118_1438;
    static Class118 aClass118_1439;
    static Class118 aClass118_1440;
    static Class118 aClass118_1441;
    static Class118 aClass118_1442;
    static Class118 aClass118_1443;
    static Class118 aClass118_1444;
    static Class118 aClass118_1445;
    static Class118 aClass118_1446
	= new Class118(0, "COMPRESSED_RGB_S3TC_DXT1_EXT (0x83f0)", 33776);
    static Class118 aClass118_1447;
    static Class118 aClass118_1448;
    static Class118 aClass118_1449;
    static Class118 aClass118_1450;
    static Class118 aClass118_1451;
    static Class118 aClass118_1452;
    static Class118 aClass118_1453;
    static Class118 aClass118_1454;
    static Class118 aClass118_1455;
    static Class118 aClass118_1456
	= new Class118(1, "COMPRESSED_RGBA_S3TC_DXT1_EXT (0x83f1)", 33777);
    static Class118 aClass118_1457;
    static Class118 aClass118_1458;
    static Class118 aClass118_1459;
    static Class118 aClass118_1460;
    static Class118 aClass118_1461;
    static Class118 aClass118_1462;
    static Class118 aClass118_1463;
    static Class118 aClass118_1464;
    static Class118 aClass118_1465;
    static Class118 aClass118_1466;
    static Class118 aClass118_1467;
    static Class118 aClass118_1468;
    static Class118 aClass118_1469;
    static Class118 aClass118_1470;
    static Class118 aClass118_1471;
    static Class118 aClass118_1472;
    static Class118 aClass118_1473;
    static Class118 aClass118_1474;
    static Class118 aClass118_1475;
    static Class118 aClass118_1476;
    static Class118 aClass118_1477;
    static Class118 aClass118_1478;
    static Class118 aClass118_1479;
    static Class118 aClass118_1480;
    
    Class118(int i, String string, int i_0_) {
	((Class118) this).anInt1428 = i;
	anInt1436 = i_0_;
    }
    
    static {
	aClass118_1429
	    = new Class118(2, "COMPRESSED_RGBA_S3TC_DXT3_EXT (0x83f2)", 33778);
	aClass118_1430
	    = new Class118(3, "COMPRESSED_RGBA_S3TC_DXT5_EXT (0x83f3)", 33779);
	aClass118_1431 = new Class118(4, "PALETTE4_RGB8_OES (0x8b90)", 35728);
	aClass118_1471 = new Class118(5, "PALETTE4_RGBA8_OES (0x8b91)", 35729);
	aClass118_1433
	    = new Class118(6, "PALETTE4_R5_G6_B5_OES (0x8b92)", 35730);
	aClass118_1434 = new Class118(7, "PALETTE4_RGBA4_OES (0x8b93)", 35731);
	aClass118_1477
	    = new Class118(8, "PALETTE4_RGB5_A1_OES (0x8b94)", 35732);
	aClass118_1467 = new Class118(9, "PALETTE8_RGB8_OES (0x8b95)", 35733);
	aClass118_1437
	    = new Class118(10, "PALETTE8_RGBA8_OES (0x8b96)", 35734);
	aClass118_1438
	    = new Class118(11, "PALETTE8_R5_G6_B5_OES (0x8b97)", 35735);
	aClass118_1445
	    = new Class118(12, "PALETTE8_RGBA4_OES (0x8b98)", 35736);
	aClass118_1440
	    = new Class118(13, "PALETTE8_RGB5_A1_OES (0x8b99)", 35737);
	aClass118_1441
	    = new Class118(14, "COMPRESSED_RGB8_ETC2 (0x9274)", 37492);
	aClass118_1442
	    = new Class118(15, "COMPRESSED_SRGB8_ETC2 (0x9275)", 37493);
	aClass118_1443
	    = new Class118(16,
			   "COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 (0x9276)",
			   37494);
	aClass118_1444
	    = (new Class118
	       (17, "COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 (0x9277)",
		37495));
	aClass118_1427
	    = new Class118(18, "COMPRESSED_RGBA8_ETC2_EAC (0x9278)", 37496);
	aClass118_1479
	    = new Class118(19, "COMPRESSED_SRGB8_ALPHA8_ETC2_EAC (0x9279)",
			   37497);
	aClass118_1447
	    = new Class118(20, "COMPRESSED_R11_EAC (0x9270)", 37488);
	aClass118_1448
	    = new Class118(21, "COMPRESSED_SIGNED_R11_EAC (0x9271)", 37489);
	aClass118_1472
	    = new Class118(22, "COMPRESSED_RG11_EAC (0x9272)", 37490);
	aClass118_1450
	    = new Class118(23, "COMPRESSED_SIGNED_RG11_EAC (0x9273)", 37491);
	aClass118_1451
	    = new Class118(24, "COMPRESSED_RGBA_ASTC_4x4_KHR (0x93b0)", 37808);
	aClass118_1466
	    = new Class118(25, "COMPRESSED_RGBA_ASTC_5x4_KHR (0x93b1)", 37809);
	aClass118_1453
	    = new Class118(26, "COMPRESSED_RGBA_ASTC_5x5_KHR (0x93b2)", 37810);
	aClass118_1454
	    = new Class118(27, "COMPRESSED_RGBA_ASTC_6x5_KHR (0x93b3)", 37811);
	aClass118_1452
	    = new Class118(28, "COMPRESSED_RGBA_ASTC_6x6_KHR (0x93b4)", 37812);
	aClass118_1457
	    = new Class118(29, "COMPRESSED_RGBA_ASTC_8x5_KHR (0x93b5)", 37813);
	aClass118_1432
	    = new Class118(30, "COMPRESSED_RGBA_ASTC_8x6_KHR (0x93b6)", 37814);
	aClass118_1458
	    = new Class118(31, "COMPRESSED_RGBA_ASTC_8x8_KHR (0x93b7)", 37815);
	aClass118_1459
	    = new Class118(32, "COMPRESSED_RGBA_ASTC_10x5_KHR (0x93b8)",
			   37816);
	aClass118_1460
	    = new Class118(33, "COMPRESSED_RGBA_ASTC_10x6_KHR (0x93b9)",
			   37817);
	aClass118_1461
	    = new Class118(34, "COMPRESSED_RGBA_ASTC_10x8_KHR (0x93ba)",
			   37818);
	aClass118_1462
	    = new Class118(35, "COMPRESSED_RGBA_ASTC_10x10_KHR (0x93bb)",
			   37819);
	aClass118_1449
	    = new Class118(36, "COMPRESSED_RGBA_ASTC_12x10_KHR (0x93bc)",
			   37820);
	aClass118_1464
	    = new Class118(37, "COMPRESSED_RGBA_ASTC_12x12_KHR (0x93bd)",
			   37821);
	aClass118_1465
	    = new Class118(38, "COMPRESSED_SRGB8_ALPHA8_ASTC_4x4_KHR (0x93d0)",
			   37840);
	aClass118_1439
	    = new Class118(39, "COMPRESSED_SRGB8_ALPHA8_ASTC_5x4_KHR (0x93d1)",
			   37841);
	aClass118_1463
	    = new Class118(40, "COMPRESSED_SRGB8_ALPHA8_ASTC_5x5_KHR (0x93d2)",
			   37842);
	aClass118_1455
	    = new Class118(41, "COMPRESSED_SRGB8_ALPHA8_ASTC_6x5_KHR (0x93d3)",
			   37843);
	aClass118_1469
	    = new Class118(42, "COMPRESSED_SRGB8_ALPHA8_ASTC_6x6_KHR (0x93d4)",
			   37844);
	aClass118_1470
	    = new Class118(43, "COMPRESSED_SRGB8_ALPHA8_ASTC_8x5_KHR (0x93d5)",
			   37845);
	aClass118_1480
	    = new Class118(44, "COMPRESSED_SRGB8_ALPHA8_ASTC_8x6_KHR (0x93d6)",
			   37846);
	aClass118_1468
	    = new Class118(45, "COMPRESSED_SRGB8_ALPHA8_ASTC_8x8_KHR (0x93d7)",
			   37847);
	aClass118_1473
	    = new Class118(46,
			   "COMPRESSED_SRGB8_ALPHA8_ASTC_10x5_KHR (0x93d8)",
			   37848);
	aClass118_1474
	    = new Class118(47,
			   "COMPRESSED_SRGB8_ALPHA8_ASTC_10x6_KHR (0x93d9)",
			   37849);
	aClass118_1475
	    = new Class118(48,
			   "COMPRESSED_SRGB8_ALPHA8_ASTC_10x8_KHR (0x93da)",
			   37850);
	aClass118_1476
	    = new Class118(49,
			   "COMPRESSED_SRGB8_ALPHA8_ASTC_10x10_KHR (0x93db)",
			   37851);
	aClass118_1435
	    = new Class118(50,
			   "COMPRESSED_SRGB8_ALPHA8_ASTC_12x10_KHR (0x93dc)",
			   37852);
	aClass118_1478
	    = new Class118(51,
			   "COMPRESSED_SRGB8_ALPHA8_ASTC_12x12_KHR (0x93dd)",
			   37853);
    }
    
    public int method68() {
	return ((Class118) this).anInt1428;
    }
    
    public int method5() {
	return ((Class118) this).anInt1428;
    }
    
    public static Class118[] method1544(byte i) {
	return new Class118[] { aClass118_1446, aClass118_1456, aClass118_1429,
				aClass118_1430, aClass118_1431, aClass118_1471,
				aClass118_1433, aClass118_1434, aClass118_1477,
				aClass118_1467, aClass118_1437, aClass118_1438,
				aClass118_1445, aClass118_1440, aClass118_1441,
				aClass118_1442, aClass118_1443, aClass118_1444,
				aClass118_1427, aClass118_1479, aClass118_1447,
				aClass118_1448, aClass118_1472, aClass118_1450,
				aClass118_1451, aClass118_1466, aClass118_1453,
				aClass118_1454, aClass118_1452, aClass118_1457,
				aClass118_1432, aClass118_1458, aClass118_1459,
				aClass118_1460, aClass118_1461, aClass118_1462,
				aClass118_1449, aClass118_1464, aClass118_1465,
				aClass118_1439, aClass118_1463, aClass118_1455,
				aClass118_1469, aClass118_1470, aClass118_1480,
				aClass118_1468, aClass118_1473, aClass118_1474,
				aClass118_1475, aClass118_1476, aClass118_1435,
				aClass118_1478 };
    }
    
    public int method6() {
	return ((Class118) this).anInt1428;
    }
    
    public int method72() {
	return ((Class118) this).anInt1428;
    }
    
    public int method71() {
	return ((Class118) this).anInt1428;
    }
    
    public int method73() {
	return ((Class118) this).anInt1428;
    }
}
