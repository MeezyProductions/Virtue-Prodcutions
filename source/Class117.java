/* Class117 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class117
{
    static final boolean method1442(int i, int i_0_) {
	return (i & 0x8000) != 0;
    }
    
    static final boolean method1443(int i, int i_1_) {
	return (i & 0x21) != 0;
    }
    
    static final boolean method1444(int i, int i_2_) {
	return (i & 0x22) != 0;
    }
    
    static final boolean method1445(int i, int i_3_) {
	return (i & 0x34) != 0;
    }
    
    static final boolean method1446(int i, int i_4_) {
	return (i & 0x37) != 0;
    }
    
    static final boolean method1447(int i, int i_5_) {
	return (i & 0x220) == 544 | (i & 0x18) != 0;
    }
    
    static final boolean method1448(int i, int i_6_) {
	return (i & 0x180) != 0;
    }
    
    static final boolean method1449(int i, int i_7_) {
	return (i & 0x100100) != 0;
    }
    
    static final boolean method1450(int i, int i_8_) {
	return (i & 0x220) == 544 | (i & 0x18) != 0;
    }
    
    static final boolean method1451(int i, int i_9_) {
	return (i & 0xc580) != 0;
    }
    
    static final boolean method1452(int i, int i_10_) {
	return (i & 0x8000) != 0;
    }
    
    static final boolean method1453(int i, int i_11_) {
	return (i & 0x800) != 0 | method1452(i, i_11_) || method1462(i, i_11_);
    }
    
    static final boolean method1454(int i, int i_12_) {
	return (i & 0x10000) != 0;
    }
    
    static final boolean method1455(int i, int i_13_) {
	return (i & 0x800) != 0;
    }
    
    static final boolean method1456(int i, int i_14_) {
	return (i & 0x800) != 0 && (i_14_ & 0x37) != 0;
    }
    
    static final boolean method1457(int i, int i_15_) {
	return (i & 0x800) != 0;
    }
    
    static final boolean method1458(int i, int i_16_) {
	return (i & 0x400) != 0;
    }
    
    static final boolean method1459(int i, int i_17_) {
	return (i & 0x800) != 0;
    }
    
    static final boolean method1460(int i, int i_18_) {
	return (i & 0x34) != 0;
    }
    
    static final boolean method1461(int i, int i_19_) {
	return (((i & 0x2000) != 0 | method1447(i, i_19_)
		 | method1454(i, i_19_))
		& method1456(i, i_19_));
    }
    
    static final boolean method1462(int i, int i_20_) {
	if (!method1520(i, i_20_))
	    return false;
	if ((i & 0xb000) != 0 | method1509(i, i_20_) | method1449(i, i_20_))
	    return true;
	return ((i_20_ & 0x37) == 0
		& (method1447(i, i_20_) | method1454(i, i_20_)));
    }
    
    static final boolean method1463(int i, int i_21_) {
	return false;
    }
    
    static final boolean method1464(int i, int i_22_) {
	return ((i & 0x70000) != 0 | method1443(i, i_22_)
		|| method1474(i, i_22_));
    }
    
    static final boolean method1465(int i, int i_23_) {
	return ((i & 0x60000) != 0 | method1507(i, i_23_)
		|| method1462(i, i_23_) || method1492(i, i_23_));
    }
    
    static final boolean method1466(int i, int i_24_) {
	return ((i & 0x70000) != 0 | method1444(i, i_24_)
		|| method1474(i, i_24_));
    }
    
    static final boolean method1467(int i, int i_25_) {
	return ((i & 0x70000) != 0 | method1445(i, i_25_)
		|| method1474(i, i_25_));
    }
    
    static final boolean method1468(int i, int i_26_) {
	if ((i & 0x10000) != 0 | method1447(i, i_26_) || method1461(i, i_26_))
	    return true;
	return (i_26_ & 0x37) == 0 && method1462(i, i_26_);
    }
    
    static final boolean method1469(int i, int i_27_) {
	return method1509(i, i_27_) || method1462(i, i_27_);
    }
    
    static final boolean method1470(int i, int i_28_) {
	return ((i & 0x40000) != 0 | method1449(i, i_28_)
		|| method1462(i, i_28_));
    }
    
    static final boolean method1471(int i, int i_29_) {
	return ((i & 0x60000) != 0 | method1507(i, i_29_)
		|| method1462(i, i_29_) || method1492(i, i_29_));
    }
    
    static final boolean method1472(int i, int i_30_) {
	return (i & 0x180) != 0;
    }
    
    static final boolean method1473(int i, int i_31_) {
	return (i & 0x20) != 0;
    }
    
    static final boolean method1474(int i, int i_32_) {
	return ((method1443(i, i_32_) | method1444(i, i_32_)
		 | method1445(i, i_32_))
		& method1455(i, i_32_));
    }
    
    static final boolean method1475(int i, int i_33_) {
	return method1509(i, i_33_) || method1462(i, i_33_);
    }
    
    static final boolean method1476(int i, int i_34_) {
	return (i & 0x800) != 0 | method1452(i, i_34_) || method1462(i, i_34_);
    }
    
    static final boolean method1477(int i, int i_35_) {
	return (i & 0x22) != 0;
    }
    
    static final boolean method1478(int i, int i_36_) {
	return (i & 0xc580) != 0;
    }
    
    static final boolean method1479(int i, int i_37_) {
	return (i & 0x37) != 0;
    }
    
    static final boolean method1480(int i, int i_38_) {
	return ((method1443(i, i_38_) | method1444(i, i_38_)
		 | method1445(i, i_38_))
		& method1455(i, i_38_));
    }
    
    static final boolean method1481(int i, int i_39_) {
	return (i & 0x100100) != 0;
    }
    
    static final boolean method1482(int i, int i_40_) {
	return ((i & 0x60000) != 0 | method1507(i, i_40_)
		|| method1462(i, i_40_) || method1492(i, i_40_));
    }
    
    static final boolean method1483(int i, int i_41_) {
	return false;
    }
    
    static final boolean method1484(int i, int i_42_) {
	if (!method1520(i, i_42_))
	    return false;
	if ((i & 0xb000) != 0 | method1509(i, i_42_) | method1449(i, i_42_))
	    return true;
	return ((i_42_ & 0x37) == 0
		& (method1447(i, i_42_) | method1454(i, i_42_)));
    }
    
    static final boolean method1485(int i, int i_43_) {
	return (i & 0x10) != 0;
    }
    
    static final boolean method1486(int i, int i_44_) {
	if (!method1520(i, i_44_))
	    return false;
	if ((i & 0xb000) != 0 | method1509(i, i_44_) | method1449(i, i_44_))
	    return true;
	return ((i_44_ & 0x37) == 0
		& (method1447(i, i_44_) | method1454(i, i_44_)));
    }
    
    static final boolean method1487(int i, int i_45_) {
	return (i & 0x10) != 0;
    }
    
    static final boolean method1488(int i, int i_46_) {
	return (i & 0x8000) != 0;
    }
    
    static final boolean method1489(int i, int i_47_) {
	return (i & 0x10000) != 0;
    }
    
    static final boolean method1490(int i, int i_48_) {
	return (i & 0x8000) != 0;
    }
    
    static final boolean method1491(int i, int i_49_) {
	return (i & 0xc580) != 0;
    }
    
    static final boolean method1492(int i, int i_50_) {
	return method1507(i, i_50_) & method1459(i, i_50_);
    }
    
    static final boolean method1493(int i, int i_51_) {
	return (i & 0x10000) != 0;
    }
    
    static final boolean method1494(int i, int i_52_) {
	return (i & 0x20) != 0;
    }
    
    static final boolean method1495(int i, int i_53_) {
	return (i & 0x800) != 0 && (i_53_ & 0x37) != 0;
    }
    
    static final boolean method1496(int i, int i_54_) {
	return (i & 0x800) != 0 && (i_54_ & 0x37) != 0;
    }
    
    static final boolean method1497(int i, int i_55_) {
	return (i & 0x800) != 0;
    }
    
    static final boolean method1498(int i, int i_56_) {
	return (i & 0x800) != 0;
    }
    
    Class117() throws Throwable {
	throw new Error();
    }
    
    static final boolean method1499(int i, int i_57_) {
	return method1507(i, i_57_) & method1459(i, i_57_);
    }
    
    static final boolean method1500(int i, int i_58_) {
	return ((method1443(i, i_58_) | method1444(i, i_58_)
		 | method1445(i, i_58_))
		& method1455(i, i_58_));
    }
    
    static final boolean method1501(int i, int i_59_) {
	return ((method1443(i, i_59_) | method1444(i, i_59_)
		 | method1445(i, i_59_))
		& method1455(i, i_59_));
    }
    
    static final boolean method1502(int i, int i_60_) {
	return (i & 0x10) != 0;
    }
    
    static final boolean method1503(int i, int i_61_) {
	return (((i & 0x2000) != 0 | method1447(i, i_61_)
		 | method1454(i, i_61_))
		& method1456(i, i_61_));
    }
    
    static final boolean method1504(int i, int i_62_) {
	if (!method1520(i, i_62_))
	    return false;
	if ((i & 0xb000) != 0 | method1509(i, i_62_) | method1449(i, i_62_))
	    return true;
	return ((i_62_ & 0x37) == 0
		& (method1447(i, i_62_) | method1454(i, i_62_)));
    }
    
    static final boolean method1505(int i, int i_63_) {
	return method1463(i, i_63_) || method1541(i, i_63_);
    }
    
    static final boolean method1506(int i, int i_64_) {
	if (!method1520(i, i_64_))
	    return false;
	if ((i & 0xb000) != 0 | method1509(i, i_64_) | method1449(i, i_64_))
	    return true;
	return ((i_64_ & 0x37) == 0
		& (method1447(i, i_64_) | method1454(i, i_64_)));
    }
    
    static final boolean method1507(int i, int i_65_) {
	return (i & 0x10) != 0;
    }
    
    static final boolean method1508(int i, int i_66_) {
	return method1463(i, i_66_) & method1529(i, i_66_);
    }
    
    static final boolean method1509(int i, int i_67_) {
	return (i & 0x84080) != 0;
    }
    
    static final boolean method1510(int i, int i_68_) {
	return method1507(i, i_68_) & method1459(i, i_68_);
    }
    
    static final boolean method1511(int i, int i_69_) {
	return method1507(i, i_69_) & method1459(i, i_69_);
    }
    
    static final boolean method1512(int i, int i_70_) {
	return ((i & 0x70000) != 0 | method1444(i, i_70_)
		|| method1474(i, i_70_));
    }
    
    static final boolean method1513(int i, int i_71_) {
	return ((i & 0x70000) != 0 | method1444(i, i_71_)
		|| method1474(i, i_71_));
    }
    
    static final boolean method1514(int i, int i_72_) {
	return ((i & 0x70000) != 0 | method1444(i, i_72_)
		|| method1474(i, i_72_));
    }
    
    static final boolean method1515(int i, int i_73_) {
	return ((i & 0x70000) != 0 | method1445(i, i_73_)
		|| method1474(i, i_73_));
    }
    
    static final boolean method1516(int i, int i_74_) {
	return ((i & 0x70000) != 0 | method1445(i, i_74_)
		|| method1474(i, i_74_));
    }
    
    static final boolean method1517(int i, int i_75_) {
	return ((i & 0x70000) != 0 | method1445(i, i_75_)
		|| method1474(i, i_75_));
    }
    
    static final boolean method1518(int i, int i_76_) {
	return ((i & 0x70000) != 0 | method1445(i, i_76_)
		|| method1474(i, i_76_));
    }
    
    static final boolean method1519(int i, int i_77_) {
	return ((i & 0x70000) != 0 | method1445(i, i_77_)
		|| method1474(i, i_77_));
    }
    
    static final boolean method1520(int i, int i_78_) {
	return (i & 0x800) != 0;
    }
    
    static final boolean method1521(int i, int i_79_) {
	if ((i & 0x10000) != 0 | method1447(i, i_79_) || method1461(i, i_79_))
	    return true;
	return (i_79_ & 0x37) == 0 && method1462(i, i_79_);
    }
    
    static final boolean method1522(int i, int i_80_) {
	if ((i & 0x10000) != 0 | method1447(i, i_80_) || method1461(i, i_80_))
	    return true;
	return (i_80_ & 0x37) == 0 && method1462(i, i_80_);
    }
    
    static final boolean method1523(int i, int i_81_) {
	return ((i & 0x40000) != 0 | method1449(i, i_81_)
		|| method1462(i, i_81_));
    }
    
    static final boolean method1524(int i, int i_82_) {
	return method1463(i, i_82_) || method1541(i, i_82_);
    }
    
    static final boolean method1525(int i, int i_83_) {
	return method1463(i, i_83_) || method1541(i, i_83_);
    }
    
    static final boolean method1526(int i, int i_84_) {
	return (i & 0x180) != 0;
    }
    
    static final boolean method1527(int i, int i_85_) {
	return (i & 0x180) != 0;
    }
    
    static final boolean method1528(int i, int i_86_) {
	return (i & 0x800) != 0;
    }
    
    static final boolean method1529(int i, int i_87_) {
	return (i & 0x800) != 0;
    }
    
    static final boolean method1530(int i, int i_88_) {
	return (i & 0x20) != 0;
    }
    
    static final boolean method1531(int i, int i_89_) {
	return (i & 0x20) != 0;
    }
    
    static final boolean method1532(int i, int i_90_) {
	return (i & 0x400) != 0;
    }
    
    static final boolean method1533(int i, int i_91_) {
	return (i & 0x400) != 0;
    }
    
    static final boolean method1534(int i, int i_92_) {
	return (i & 0x400) != 0;
    }
    
    static final boolean method1535(int i, int i_93_) {
	return false;
    }
    
    static final boolean method1536(int i, int i_94_) {
	return ((i & 0x60000) != 0 | method1507(i, i_94_)
		|| method1462(i, i_94_) || method1492(i, i_94_));
    }
    
    static final boolean method1537(int i, int i_95_) {
	return ((i & 0x60000) != 0 | method1507(i, i_95_)
		|| method1462(i, i_95_) || method1492(i, i_95_));
    }
    
    static final boolean method1538(int i, int i_96_) {
	return false;
    }
    
    static final boolean method1539(int i, int i_97_) {
	return (i & 0x800) != 0 | method1452(i, i_97_) || method1462(i, i_97_);
    }
    
    static final boolean method1540(int i, int i_98_) {
	return ((i & 0x60000) != 0 | method1507(i, i_98_)
		|| method1462(i, i_98_) || method1492(i, i_98_));
    }
    
    static final boolean method1541(int i, int i_99_) {
	return method1463(i, i_99_) & method1529(i, i_99_);
    }
    
    static final boolean method1542(int i, int i_100_) {
	return ((i & 0x800) != 0 | method1452(i, i_100_)
		|| method1462(i, i_100_));
    }
    
    static final boolean method1543(int i, int i_101_) {
	return ((i & 0x800) != 0 | method1452(i, i_101_)
		|| method1462(i, i_101_));
    }
}
