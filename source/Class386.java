/* Class386 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class386
{
    public int anInt3991;
    public static final int anInt3992 = 1;
    public static final int anInt3993 = 2;
    int anInt3994;
    int anInt3995;
    public short aShort3996;
    public short aShort3997;
    public int anInt3998;
    public int anInt3999;
    public int anInt4000 = 0;
    public int anInt4001;
    public int anInt4002 = 1239897839;
    int anInt4003 = -203441924;
    public int anInt4004;
    public int[] anIntArray4005;
    public int anInt4006 = -962573021;
    public int anInt4007;
    int anInt4008;
    public int anInt4009;
    public int anInt4010;
    public int anInt4011;
    int anInt4012;
    int anInt4013;
    public int anInt4014;
    public int anInt4015;
    public int anInt4016;
    int anInt4017;
    public int anInt4018;
    public int[] anIntArray4019;
    public int anInt4020;
    public int[] anIntArray4021;
    public int[] anIntArray4022;
    public static final int anInt4023 = -1;
    public int anInt4024;
    public int anInt4025;
    public int anInt4026;
    public boolean aBool4027;
    public boolean aBool4028;
    public int anInt4029;
    static final int anInt4030 = 0;
    public int anInt4031;
    public boolean aBool4032;
    public int anInt4033;
    int anInt4034;
    int anInt4035;
    public int anInt4036;
    public int anInt4037;
    int anInt4038;
    public boolean aBool4039;
    public boolean aBool4040;
    public boolean aBool4041;
    public boolean aBool4042;
    public boolean aBool4043;
    public boolean aBool4044;
    public int anInt4045;
    public int anInt4046;
    public int anInt4047;
    public int anInt4048;
    public short aShort4049;
    public int anInt4050;
    public int anInt4051;
    int anInt4052;
    public int anInt4053;
    public int anInt4054;
    int anInt4055;
    public boolean aBool4056;
    public int anInt4057;
    public short aShort4058;
    public int anInt4059;
    public int anInt4060;
    public int anInt4061;
    public int anInt4062;
    public int anInt4063;
    public int anInt4064;
    public int anInt4065;
    public int anInt4066;
    public int anInt4067;
    public int anInt4068;
    public static int anInt4069;
    
    void method4736(ByteBuffer class528_sub42, int i) {
	if (1 == i) {
	    aShort4058 = (short) class528_sub42.readUnsignedShort(-504289646);
	    aShort4049 = (short) class528_sub42.readUnsignedShort(-620134062);
	    aShort3996 = (short) class528_sub42.readUnsignedShort(-938683734);
	    aShort3997 = (short) class528_sub42.readUnsignedShort(-666742942);
	    int i_0_ = 3;
	    aShort4058 <<= i_0_;
	    aShort4049 <<= i_0_;
	    aShort3996 <<= i_0_;
	    aShort3997 <<= i_0_;
	} else if (i == 2)
	    class528_sub42.readUnsignedByte((byte) 88);
	else if (3 == i) {
	    anInt3998 = class528_sub42.readInt(500599036) * -293872823;
	    anInt3999 = class528_sub42.readInt(-1472012657) * 910340483;
	} else if (4 == i) {
	    anInt4000 = class528_sub42.readUnsignedByte((byte) 92) * -1511715989;
	    anInt4001 = class528_sub42.method9627(-1410584751) * -1577178155;
	} else if (i == 5)
	    anInt4004 = (anInt4046 = (class528_sub42.readUnsignedShort(-616159326)
				      << 12 << 2) * -1708258259) * 736720077;
	else if (6 == i) {
	    ((Class386) this).anInt4008
		= class528_sub42.readInt(-927701168) * 301080081;
	    ((Class386) this).anInt4017
		= class528_sub42.readInt(-751120969) * 1896144519;
	} else if (i == 7) {
	    anInt4015 = class528_sub42.readUnsignedShort(-548663843) * 704725103;
	    anInt4016 = class528_sub42.readUnsignedShort(704191425) * -1402302141;
	} else if (i == 8) {
	    anInt4018 = class528_sub42.readUnsignedShort(-856822843) * 266019403;
	    anInt4014 = class528_sub42.readUnsignedShort(-243328938) * 1036190699;
	} else if (i == 9) {
	    int i_1_ = class528_sub42.readUnsignedByte((byte) 104);
	    anIntArray4019 = new int[i_1_];
	    for (int i_2_ = 0; i_2_ < i_1_; i_2_++)
		anIntArray4019[i_2_] = class528_sub42.readUnsignedShort(-1942055674);
	} else if (10 == i) {
	    int i_3_ = class528_sub42.readUnsignedByte((byte) 46);
	    anIntArray4021 = new int[i_3_];
	    for (int i_4_ = 0; i_4_ < i_3_; i_4_++)
		anIntArray4021[i_4_] = class528_sub42.readUnsignedShort(55191566);
	} else if (12 == i)
	    anInt4024 = class528_sub42.method9627(-960474913) * 1538569393;
	else if (i == 13)
	    anInt4025 = class528_sub42.method9627(-1321860584) * -1379316515;
	else if (i == 14)
	    anInt3991 = class528_sub42.readUnsignedShort(484944015) * -993722717;
	else if (15 == i)
	    anInt4009 = class528_sub42.readUnsignedShort(-1279642665) * -387011819;
	else if (16 == i) {
	    aBool4027 = class528_sub42.readUnsignedByte((byte) 69) == 1;
	    anInt4029 = class528_sub42.readUnsignedShort(-252694262) * -1496392321;
	    anInt4007 = class528_sub42.readUnsignedShort(-194723323) * -742994185;
	    aBool4028 = class528_sub42.readUnsignedByte((byte) 12) == 1;
	} else if (17 == i)
	    anInt4033 = class528_sub42.readUnsignedShort(-1930904204) * -1879475801;
	else if (i == 18)
	    anInt4011 = class528_sub42.readInt(-201959031) * 1794341799;
	else if (19 == i)
	    anInt4031 = class528_sub42.readUnsignedByte((byte) 17) * 1065914721;
	else if (i == 20)
	    ((Class386) this).anInt4012
		= class528_sub42.readUnsignedByte((byte) 10) * -988672329;
	else if (21 == i)
	    ((Class386) this).anInt3994
		= class528_sub42.readUnsignedByte((byte) 30) * 247897837;
	else if (i == 22)
	    anInt4002 = class528_sub42.readInt(-38860734) * -1239897839;
	else if (23 == i)
	    ((Class386) this).anInt4003
		= class528_sub42.readUnsignedByte((byte) 54) * -1333474281;
	else if (i == 24)
	    aBool4041 = false;
	else if (i == 25) {
	    int i_5_ = class528_sub42.readUnsignedByte((byte) 101);
	    anIntArray4005 = new int[i_5_];
	    for (int i_6_ = 0; i_6_ < i_5_; i_6_++)
		anIntArray4005[i_6_] = class528_sub42.readUnsignedShort(-307040554);
	} else if (i == 26)
	    aBool4032 = false;
	else if (27 == i)
	    anInt4006 = ((class528_sub42.readUnsignedShort(160605590) << 12 << 2)
			 * 962573021);
	else if (28 == i)
	    ((Class386) this).anInt3995
		= class528_sub42.readUnsignedByte((byte) 123) * 686037509;
	else if (29 == i) {
	    if (class528_sub42.readUnsignedByte((byte) 16) == 0)
		anInt4059
		    = ((((Class386) this).anInt4038
			= class528_sub42.method9642(1208795755) * 861314504)
		       * -76799253);
	    else {
		anInt4059 = class528_sub42.method9642(-171706129) * 1238853272;
		((Class386) this).anInt4038
		    = class528_sub42.method9642(1137498752) * 861314504;
	    }
	} else if (30 == i)
	    aBool4039 = true;
	else if (31 == i) {
	    anInt4004 = ((class528_sub42.readUnsignedShort(-371978132) << 12 << 2)
			 * -128375799);
	    anInt4046 = ((class528_sub42.readUnsignedShort(-608191125) << 12 << 2)
			 * -1708258259);
	} else if (i == 32)
	    aBool4040 = false;
	else if (33 == i)
	    aBool4056 = true;
	else if (i == 34)
	    aBool4042 = false;
	else if (35 == i) {
	    if (class528_sub42.readUnsignedByte((byte) 89) == 0)
		anInt4067
		    = ((((Class386) this).anInt4035
			= class528_sub42.method9642(308063175) * -531813832)
		       * 1623411179);
	    else {
		anInt4067 = class528_sub42.method9642(-1112075026) * 277330280;
		((Class386) this).anInt4035
		    = class528_sub42.method9642(-1649449822) * -531813832;
		anInt4036 = class528_sub42.readUnsignedByte((byte) 44) * -1085553717;
	    }
	} else if (i == 36)
	    aBool4043 = true;
    }
    
    void method4737(ByteBuffer class528_sub42) {
	for (;;) {
	    int i = class528_sub42.readUnsignedByte((byte) 87);
	    if (i == 0)
		break;
	    method4738(class528_sub42, i, -412975572);
	}
    }
    
    void method4738(ByteBuffer class528_sub42, int i, int i_7_) {
	if (1 == i) {
	    aShort4058 = (short) class528_sub42.readUnsignedShort(-1768060871);
	    aShort4049 = (short) class528_sub42.readUnsignedShort(529033062);
	    aShort3996 = (short) class528_sub42.readUnsignedShort(-1719124852);
	    aShort3997 = (short) class528_sub42.readUnsignedShort(-1636996285);
	    int i_8_ = 3;
	    aShort4058 <<= i_8_;
	    aShort4049 <<= i_8_;
	    aShort3996 <<= i_8_;
	    aShort3997 <<= i_8_;
	} else if (i == 2)
	    class528_sub42.readUnsignedByte((byte) 7);
	else if (3 == i) {
	    anInt3998 = class528_sub42.readInt(-332418984) * -293872823;
	    anInt3999 = class528_sub42.readInt(-1056569489) * 910340483;
	} else if (4 == i) {
	    anInt4000 = class528_sub42.readUnsignedByte((byte) 112) * -1511715989;
	    anInt4001 = class528_sub42.method9627(-1555467549) * -1577178155;
	} else if (i == 5)
	    anInt4004 = (anInt4046 = (class528_sub42.readUnsignedShort(-1784375926)
				      << 12 << 2) * -1708258259) * 736720077;
	else if (6 == i) {
	    ((Class386) this).anInt4008
		= class528_sub42.readInt(-351120389) * 301080081;
	    ((Class386) this).anInt4017
		= class528_sub42.readInt(-1234708829) * 1896144519;
	} else if (i == 7) {
	    anInt4015 = class528_sub42.readUnsignedShort(-867495122) * 704725103;
	    anInt4016 = class528_sub42.readUnsignedShort(-982274) * -1402302141;
	} else if (i == 8) {
	    anInt4018 = class528_sub42.readUnsignedShort(-1634505678) * 266019403;
	    anInt4014 = class528_sub42.readUnsignedShort(86832536) * 1036190699;
	} else if (i == 9) {
	    int i_9_ = class528_sub42.readUnsignedByte((byte) 43);
	    anIntArray4019 = new int[i_9_];
	    for (int i_10_ = 0; i_10_ < i_9_; i_10_++)
		anIntArray4019[i_10_] = class528_sub42.readUnsignedShort(-196434921);
	} else if (10 == i) {
	    int i_11_ = class528_sub42.readUnsignedByte((byte) 88);
	    anIntArray4021 = new int[i_11_];
	    for (int i_12_ = 0; i_12_ < i_11_; i_12_++)
		anIntArray4021[i_12_] = class528_sub42.readUnsignedShort(541376479);
	} else if (12 == i)
	    anInt4024 = class528_sub42.method9627(-1373476598) * 1538569393;
	else if (i == 13)
	    anInt4025 = class528_sub42.method9627(-1639534905) * -1379316515;
	else if (i == 14)
	    anInt3991 = class528_sub42.readUnsignedShort(-497440605) * -993722717;
	else if (15 == i)
	    anInt4009 = class528_sub42.readUnsignedShort(68984000) * -387011819;
	else if (16 == i) {
	    aBool4027 = class528_sub42.readUnsignedByte((byte) 47) == 1;
	    anInt4029 = class528_sub42.readUnsignedShort(-1519980886) * -1496392321;
	    anInt4007 = class528_sub42.readUnsignedShort(-1850025929) * -742994185;
	    aBool4028 = class528_sub42.readUnsignedByte((byte) 90) == 1;
	} else if (17 == i)
	    anInt4033 = class528_sub42.readUnsignedShort(-1189993728) * -1879475801;
	else if (i == 18)
	    anInt4011 = class528_sub42.readInt(-912211475) * 1794341799;
	else if (19 == i)
	    anInt4031 = class528_sub42.readUnsignedByte((byte) 113) * 1065914721;
	else if (i == 20)
	    ((Class386) this).anInt4012
		= class528_sub42.readUnsignedByte((byte) 104) * -988672329;
	else if (21 == i)
	    ((Class386) this).anInt3994
		= class528_sub42.readUnsignedByte((byte) 7) * 247897837;
	else if (i == 22)
	    anInt4002 = class528_sub42.readInt(45135773) * -1239897839;
	else if (23 == i)
	    ((Class386) this).anInt4003
		= class528_sub42.readUnsignedByte((byte) 103) * -1333474281;
	else if (i == 24)
	    aBool4041 = false;
	else if (i == 25) {
	    int i_13_ = class528_sub42.readUnsignedByte((byte) 91);
	    anIntArray4005 = new int[i_13_];
	    for (int i_14_ = 0; i_14_ < i_13_; i_14_++)
		anIntArray4005[i_14_] = class528_sub42.readUnsignedShort(-825943715);
	} else if (i == 26)
	    aBool4032 = false;
	else if (27 == i)
	    anInt4006 = ((class528_sub42.readUnsignedShort(886334620) << 12 << 2)
			 * 962573021);
	else if (28 == i)
	    ((Class386) this).anInt3995
		= class528_sub42.readUnsignedByte((byte) 11) * 686037509;
	else if (29 == i) {
	    if (class528_sub42.readUnsignedByte((byte) 38) == 0)
		anInt4059
		    = ((((Class386) this).anInt4038
			= class528_sub42.method9642(-1759239138) * 861314504)
		       * -76799253);
	    else {
		anInt4059 = class528_sub42.method9642(135543782) * 1238853272;
		((Class386) this).anInt4038
		    = class528_sub42.method9642(-1453533784) * 861314504;
	    }
	} else if (30 == i)
	    aBool4039 = true;
	else if (31 == i) {
	    anInt4004 = ((class528_sub42.readUnsignedShort(-1695676622) << 12 << 2)
			 * -128375799);
	    anInt4046 = ((class528_sub42.readUnsignedShort(-1925159506) << 12 << 2)
			 * -1708258259);
	} else if (i == 32)
	    aBool4040 = false;
	else if (33 == i)
	    aBool4056 = true;
	else if (i == 34)
	    aBool4042 = false;
	else if (35 == i) {
	    if (class528_sub42.readUnsignedByte((byte) 107) == 0)
		anInt4067
		    = ((((Class386) this).anInt4035
			= class528_sub42.method9642(-1581821041) * -531813832)
		       * 1623411179);
	    else {
		anInt4067 = class528_sub42.method9642(-1991608174) * 277330280;
		((Class386) this).anInt4035
		    = class528_sub42.method9642(1854379199) * -531813832;
		anInt4036 = class528_sub42.readUnsignedByte((byte) 3) * -1085553717;
	    }
	} else if (i == 36)
	    aBool4043 = true;
    }
    
    void method4739(int i) {
	if (anInt4024 * 1246041169 > -2 || -878318731 * anInt4025 > -2)
	    aBool4044 = true;
	anInt4026 = ((724341489 * ((Class386) this).anInt4008 >> 16 & 0xff)
		     * 617830831);
	((Class386) this).anInt4013
	    = 695688893 * (139298615 * ((Class386) this).anInt4017 >> 16
			   & 0xff);
	anInt4047 = (1663197341 * ((Class386) this).anInt4013
		     - 1406993383 * anInt4026);
	anInt4048 = ((((Class386) this).anInt4008 * 724341489 >> 8 & 0xff)
		     * -1865924157);
	((Class386) this).anInt4034
	    = -1528162623 * (139298615 * ((Class386) this).anInt4017 >> 8
			     & 0xff);
	anInt4010
	    = ((Class386) this).anInt4034 * 1425328575 - anInt4048 * 495487509;
	anInt4051
	    = (((Class386) this).anInt4008 * 724341489 & 0xff) * -1834954903;
	((Class386) this).anInt4052
	    = 1585411157 * (((Class386) this).anInt4017 * 139298615 & 0xff);
	anInt4053 = (1230459603 * ((Class386) this).anInt4052
		     - -1664804681 * anInt4051);
	anInt4057 = ((((Class386) this).anInt4008 * 724341489 >> 24 & 0xff)
		     * 1312692219);
	((Class386) this).anInt4055
	    = 2012118301 * (((Class386) this).anInt4017 * 139298615 >> 24
			    & 0xff);
	anInt4054 = (((Class386) this).anInt4055 * -713590569
		     - anInt4057 * -2133361631);
	if (0 != anInt4011 * 88964119) {
	    anInt4045 = -1188635977 * (((Class386) this).anInt4012 * -459133177
				       * (anInt4016 * 2053145451) / 100);
	    anInt4020 = 1015381053 * (((Class386) this).anInt3994 * -2064486683
				      * (2053145451 * anInt4016) / 100);
	    if (0 == -1690361081 * anInt4045)
		anInt4045 = -1188635977;
	    anInt4062
		= (((anInt4011 * 88964119 >> 16 & 0xff)
		    - (388656729 * anInt4047 / 2 + -2073453233 * anInt4026))
		   << 8) / (anInt4045 * -1690361081) * -1276618611;
	    anInt4060
		= (((anInt4011 * 88964119 >> 8 & 0xff)
		    - (anInt4048 * 1194964715 + 2004778239 * anInt4010 / 2))
		   << 8) / (-1690361081 * anInt4045) * 142896165;
	    anInt4061 = -83090989 * ((((88964119 * anInt4011 & 0xff)
				       - (anInt4051 * -1554468647
					  + anInt4053 * 569660143 / 2))
				      << 8)
				     / (anInt4045 * -1690361081));
	    if (0 == anInt4020 * 469891861)
		anInt4020 = 1015381053;
	    anInt4050 = -488847879 * ((((anInt4011 * 88964119 >> 24 & 0xff)
					- (anInt4054 * -849048365 / 2
					   + anInt4057 * -211723469))
				       << 8)
				      / (anInt4020 * 469891861));
	    Class386 class386_15_ = this;
	    class386_15_.anInt4062
		= (class386_15_.anInt4062
		   + (-2088949179 * anInt4062 > 0 ? -4 : 4) * -1276618611);
	    Class386 class386_16_ = this;
	    class386_16_.anInt4060
		= (class386_16_.anInt4060
		   + 142896165 * (-646066259 * anInt4060 > 0 ? -4 : 4));
	    Class386 class386_17_ = this;
	    class386_17_.anInt4061
		= (class386_17_.anInt4061
		   + -83090989 * (anInt4061 * -1185292709 > 0 ? -4 : 4));
	    Class386 class386_18_ = this;
	    class386_18_.anInt4050
		= (class386_18_.anInt4050
		   + (anInt4050 * 1734011977 > 0 ? -4 : 4) * -488847879);
	}
	if (-1 != 1922263025 * anInt4002) {
	    anInt4063
		= anInt4016 * 2053145451 * (((Class386) this).anInt4003
					    * -1727976537) / 100 * -1543540343;
	    if (0 == anInt4063 * 645289145)
		anInt4063 = -1543540343;
	    anInt4064 = 1576225255 * ((anInt4002 * 1922263025
				       - (-884734215 * anInt3998
					  + (-2007571157 * anInt3999
					     - -884734215 * anInt3998) / 2))
				      / (645289145 * anInt4063));
	}
	if (-1884179083 * anInt4006 != -1) {
	    anInt4065 = -893625595 * (996188877 * ((Class386) this).anInt3995
				      * (2053145451 * anInt4016) / 100);
	    if (anInt4065 * -436520499 == 0)
		anInt4065 = -893625595;
	    anInt4066 = -948137083 * ((anInt4006 * -1884179083
				       - (anInt4004 * -659445191
					  + (anInt4046 * -2008538203
					     - anInt4004 * -659445191) / 2))
				      / (-436520499 * anInt4065));
	}
	anInt4037 = (((Class386) this).anInt4035 * -314166367
		     - anInt4067 * -186209885);
	anInt4068
	    = ((Class386) this).anInt4038 * 707067521 - -880619197 * anInt4059;
    }
    
    void method4740(ByteBuffer class528_sub42, int i) {
	for (;;) {
	    int i_19_ = class528_sub42.readUnsignedByte((byte) 123);
	    if (i_19_ == 0)
		break;
	    method4738(class528_sub42, i_19_, -1461437558);
	}
    }
    
    void method4741(ByteBuffer class528_sub42) {
	for (;;) {
	    int i = class528_sub42.readUnsignedByte((byte) 99);
	    if (i == 0)
		break;
	    method4738(class528_sub42, i, -1724857378);
	}
    }
    
    Class386() {
	((Class386) this).anInt3995 = -115725836;
	aBool4041 = true;
	((Class386) this).anInt4012 = -82985092;
	((Class386) this).anInt3994 = -980020076;
	anInt4009 = 387011819;
	anInt4024 = 1217828510;
	anInt4025 = -1536334266;
	anInt3991 = 0;
	aBool4027 = true;
	aBool4028 = true;
	anInt4029 = 1496392321;
	anInt4007 = 742994185;
	anInt4031 = 0;
	aBool4032 = true;
	anInt4033 = 1879475801;
	anInt4067 = 0;
	((Class386) this).anInt4035 = 0;
	anInt4036 = 0;
	anInt4059 = 0;
	((Class386) this).anInt4038 = 0;
	aBool4039 = false;
	aBool4040 = true;
	aBool4056 = false;
	aBool4042 = true;
	aBool4043 = false;
	aBool4044 = false;
    }
    
    void method4742(ByteBuffer class528_sub42, int i) {
	if (1 == i) {
	    aShort4058 = (short) class528_sub42.readUnsignedShort(-825812365);
	    aShort4049 = (short) class528_sub42.readUnsignedShort(-188750217);
	    aShort3996 = (short) class528_sub42.readUnsignedShort(582029911);
	    aShort3997 = (short) class528_sub42.readUnsignedShort(-847598988);
	    int i_20_ = 3;
	    aShort4058 <<= i_20_;
	    aShort4049 <<= i_20_;
	    aShort3996 <<= i_20_;
	    aShort3997 <<= i_20_;
	} else if (i == 2)
	    class528_sub42.readUnsignedByte((byte) 57);
	else if (3 == i) {
	    anInt3998 = class528_sub42.readInt(1040580078) * -293872823;
	    anInt3999 = class528_sub42.readInt(597087263) * 910340483;
	} else if (4 == i) {
	    anInt4000 = class528_sub42.readUnsignedByte((byte) 39) * -1511715989;
	    anInt4001 = class528_sub42.method9627(-1988827244) * -1577178155;
	} else if (i == 5)
	    anInt4004 = (anInt4046 = (class528_sub42.readUnsignedShort(483164339)
				      << 12 << 2) * -1708258259) * 736720077;
	else if (6 == i) {
	    ((Class386) this).anInt4008
		= class528_sub42.readInt(-1630920480) * 301080081;
	    ((Class386) this).anInt4017
		= class528_sub42.readInt(961791170) * 1896144519;
	} else if (i == 7) {
	    anInt4015 = class528_sub42.readUnsignedShort(850214690) * 704725103;
	    anInt4016 = class528_sub42.readUnsignedShort(-2069769878) * -1402302141;
	} else if (i == 8) {
	    anInt4018 = class528_sub42.readUnsignedShort(-780596599) * 266019403;
	    anInt4014 = class528_sub42.readUnsignedShort(-1946055832) * 1036190699;
	} else if (i == 9) {
	    int i_21_ = class528_sub42.readUnsignedByte((byte) 119);
	    anIntArray4019 = new int[i_21_];
	    for (int i_22_ = 0; i_22_ < i_21_; i_22_++)
		anIntArray4019[i_22_] = class528_sub42.readUnsignedShort(539562998);
	} else if (10 == i) {
	    int i_23_ = class528_sub42.readUnsignedByte((byte) 101);
	    anIntArray4021 = new int[i_23_];
	    for (int i_24_ = 0; i_24_ < i_23_; i_24_++)
		anIntArray4021[i_24_] = class528_sub42.readUnsignedShort(98037489);
	} else if (12 == i)
	    anInt4024 = class528_sub42.method9627(-1459059525) * 1538569393;
	else if (i == 13)
	    anInt4025 = class528_sub42.method9627(-2034093032) * -1379316515;
	else if (i == 14)
	    anInt3991 = class528_sub42.readUnsignedShort(-804811464) * -993722717;
	else if (15 == i)
	    anInt4009 = class528_sub42.readUnsignedShort(-1432821511) * -387011819;
	else if (16 == i) {
	    aBool4027 = class528_sub42.readUnsignedByte((byte) 77) == 1;
	    anInt4029 = class528_sub42.readUnsignedShort(-249682381) * -1496392321;
	    anInt4007 = class528_sub42.readUnsignedShort(-32481385) * -742994185;
	    aBool4028 = class528_sub42.readUnsignedByte((byte) 42) == 1;
	} else if (17 == i)
	    anInt4033 = class528_sub42.readUnsignedShort(493410951) * -1879475801;
	else if (i == 18)
	    anInt4011 = class528_sub42.readInt(509137066) * 1794341799;
	else if (19 == i)
	    anInt4031 = class528_sub42.readUnsignedByte((byte) 43) * 1065914721;
	else if (i == 20)
	    ((Class386) this).anInt4012
		= class528_sub42.readUnsignedByte((byte) 85) * -988672329;
	else if (21 == i)
	    ((Class386) this).anInt3994
		= class528_sub42.readUnsignedByte((byte) 2) * 247897837;
	else if (i == 22)
	    anInt4002 = class528_sub42.readInt(660258347) * -1239897839;
	else if (23 == i)
	    ((Class386) this).anInt4003
		= class528_sub42.readUnsignedByte((byte) 81) * -1333474281;
	else if (i == 24)
	    aBool4041 = false;
	else if (i == 25) {
	    int i_25_ = class528_sub42.readUnsignedByte((byte) 113);
	    anIntArray4005 = new int[i_25_];
	    for (int i_26_ = 0; i_26_ < i_25_; i_26_++)
		anIntArray4005[i_26_] = class528_sub42.readUnsignedShort(786771570);
	} else if (i == 26)
	    aBool4032 = false;
	else if (27 == i)
	    anInt4006 = ((class528_sub42.readUnsignedShort(-784016636) << 12 << 2)
			 * 962573021);
	else if (28 == i)
	    ((Class386) this).anInt3995
		= class528_sub42.readUnsignedByte((byte) 50) * 686037509;
	else if (29 == i) {
	    if (class528_sub42.readUnsignedByte((byte) 34) == 0)
		anInt4059
		    = ((((Class386) this).anInt4038
			= class528_sub42.method9642(314265273) * 861314504)
		       * -76799253);
	    else {
		anInt4059 = class528_sub42.method9642(379176) * 1238853272;
		((Class386) this).anInt4038
		    = class528_sub42.method9642(624753360) * 861314504;
	    }
	} else if (30 == i)
	    aBool4039 = true;
	else if (31 == i) {
	    anInt4004 = ((class528_sub42.readUnsignedShort(519140668) << 12 << 2)
			 * -128375799);
	    anInt4046 = ((class528_sub42.readUnsignedShort(-1102984936) << 12 << 2)
			 * -1708258259);
	} else if (i == 32)
	    aBool4040 = false;
	else if (33 == i)
	    aBool4056 = true;
	else if (i == 34)
	    aBool4042 = false;
	else if (35 == i) {
	    if (class528_sub42.readUnsignedByte((byte) 115) == 0)
		anInt4067
		    = ((((Class386) this).anInt4035
			= class528_sub42.method9642(-1873975080) * -531813832)
		       * 1623411179);
	    else {
		anInt4067 = class528_sub42.method9642(1700589605) * 277330280;
		((Class386) this).anInt4035
		    = class528_sub42.method9642(1651106203) * -531813832;
		anInt4036
		    = class528_sub42.readUnsignedByte((byte) 126) * -1085553717;
	    }
	} else if (i == 36)
	    aBool4043 = true;
    }
    
    void method4743() {
	if (anInt4024 * 1246041169 > -2 || -878318731 * anInt4025 > -2)
	    aBool4044 = true;
	anInt4026 = ((724341489 * ((Class386) this).anInt4008 >> 16 & 0xff)
		     * 617830831);
	((Class386) this).anInt4013
	    = 695688893 * (139298615 * ((Class386) this).anInt4017 >> 16
			   & 0xff);
	anInt4047 = (1663197341 * ((Class386) this).anInt4013
		     - 1406993383 * anInt4026);
	anInt4048 = ((((Class386) this).anInt4008 * 724341489 >> 8 & 0xff)
		     * -1865924157);
	((Class386) this).anInt4034
	    = -1528162623 * (139298615 * ((Class386) this).anInt4017 >> 8
			     & 0xff);
	anInt4010
	    = ((Class386) this).anInt4034 * 1425328575 - anInt4048 * 495487509;
	anInt4051
	    = (((Class386) this).anInt4008 * 724341489 & 0xff) * -1834954903;
	((Class386) this).anInt4052
	    = 1585411157 * (((Class386) this).anInt4017 * 139298615 & 0xff);
	anInt4053 = (1230459603 * ((Class386) this).anInt4052
		     - -1664804681 * anInt4051);
	anInt4057 = ((((Class386) this).anInt4008 * 724341489 >> 24 & 0xff)
		     * 1312692219);
	((Class386) this).anInt4055
	    = 2012118301 * (((Class386) this).anInt4017 * 139298615 >> 24
			    & 0xff);
	anInt4054 = (((Class386) this).anInt4055 * -713590569
		     - anInt4057 * -2133361631);
	if (0 != anInt4011 * 88964119) {
	    anInt4045 = -1188635977 * (((Class386) this).anInt4012 * -459133177
				       * (anInt4016 * 2053145451) / 100);
	    anInt4020 = 1015381053 * (((Class386) this).anInt3994 * -2064486683
				      * (2053145451 * anInt4016) / 100);
	    if (0 == -1690361081 * anInt4045)
		anInt4045 = -1188635977;
	    anInt4062
		= (((anInt4011 * 88964119 >> 16 & 0xff)
		    - (388656729 * anInt4047 / 2 + -2073453233 * anInt4026))
		   << 8) / (anInt4045 * -1690361081) * -1276618611;
	    anInt4060
		= (((anInt4011 * 88964119 >> 8 & 0xff)
		    - (anInt4048 * 1194964715 + 2004778239 * anInt4010 / 2))
		   << 8) / (-1690361081 * anInt4045) * 142896165;
	    anInt4061 = -83090989 * ((((88964119 * anInt4011 & 0xff)
				       - (anInt4051 * -1554468647
					  + anInt4053 * 569660143 / 2))
				      << 8)
				     / (anInt4045 * -1690361081));
	    if (0 == anInt4020 * 469891861)
		anInt4020 = 1015381053;
	    anInt4050 = -488847879 * ((((anInt4011 * 88964119 >> 24 & 0xff)
					- (anInt4054 * -849048365 / 2
					   + anInt4057 * -211723469))
				       << 8)
				      / (anInt4020 * 469891861));
	    Class386 class386_27_ = this;
	    class386_27_.anInt4062
		= (class386_27_.anInt4062
		   + (-2088949179 * anInt4062 > 0 ? -4 : 4) * -1276618611);
	    Class386 class386_28_ = this;
	    class386_28_.anInt4060
		= (class386_28_.anInt4060
		   + 142896165 * (-646066259 * anInt4060 > 0 ? -4 : 4));
	    Class386 class386_29_ = this;
	    class386_29_.anInt4061
		= (class386_29_.anInt4061
		   + -83090989 * (anInt4061 * -1185292709 > 0 ? -4 : 4));
	    Class386 class386_30_ = this;
	    class386_30_.anInt4050
		= (class386_30_.anInt4050
		   + (anInt4050 * 1734011977 > 0 ? -4 : 4) * -488847879);
	}
	if (-1 != 1922263025 * anInt4002) {
	    anInt4063
		= anInt4016 * 2053145451 * (((Class386) this).anInt4003
					    * -1727976537) / 100 * -1543540343;
	    if (0 == anInt4063 * 645289145)
		anInt4063 = -1543540343;
	    anInt4064 = 1576225255 * ((anInt4002 * 1922263025
				       - (-884734215 * anInt3998
					  + (-2007571157 * anInt3999
					     - -884734215 * anInt3998) / 2))
				      / (645289145 * anInt4063));
	}
	if (-1884179083 * anInt4006 != -1) {
	    anInt4065 = -893625595 * (996188877 * ((Class386) this).anInt3995
				      * (2053145451 * anInt4016) / 100);
	    if (anInt4065 * -436520499 == 0)
		anInt4065 = -893625595;
	    anInt4066 = -948137083 * ((anInt4006 * -1884179083
				       - (anInt4004 * -659445191
					  + (anInt4046 * -2008538203
					     - anInt4004 * -659445191) / 2))
				      / (-436520499 * anInt4065));
	}
	anInt4037 = (((Class386) this).anInt4035 * -314166367
		     - anInt4067 * -186209885);
	anInt4068
	    = ((Class386) this).anInt4038 * 707067521 - -880619197 * anInt4059;
    }
    
    public static void method4744(Class538 class538, Class173 class173,
				  int i) {
	Iterator iterator = Class621.aList8063.iterator();
	while (iterator.hasNext()) {
	    Class612 class612 = (Class612) iterator.next();
	    if (((Class612) class612).aBool7986)
		class612.method7311(class538, class173);
	}
    }
    
    static final void method4745(Class229 class229, Class226 class226,
				 Class648 class648, int i) {
	String string = (String) (((Class648) class648).anObjectArray8396
				  [(((Class648) class648).anInt8410
				    -= 1600226731) * -520794877]);
	if (Class494.method5957(string, class648, (short) 520) != null)
	    string = string.substring(0, string.length() - 1);
	class229.anObjectArray2501
	    = Class181_Sub23.method8999(string, class648, (byte) 56);
	class229.aBool2483 = true;
    }
    
    static final void method4746(Class648 class648, int i) {
	throw new RuntimeException("");
    }
    
    static final void method4747(Class648 class648, short i) {
	Class229 class229
	    = Class623_Sub1.method9755((((Class648) class648).anIntArray8394
					[(((Class648) class648).anInt8395
					  -= 1239022665) * 717927929]),
				       (byte) -59);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = class229.anInt2528 * 1272672363;
    }
    
    static final void method4748(Class648 class648, int i) {
	int i_31_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_31_, (byte) -52);
	Class226 class226 = Class380.aClass226Array3970[i_31_ >> 16];
	Class365.method4639(class229, class226, class648, (short) 10644);
    }
}
