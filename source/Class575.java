/* Class575 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class575 implements Definition
{
    int anInt7570;
    Class580 aClass580_7571;
    public static final int anInt7572 = -1;
    public static final int anInt7573 = 0;
    public static final int anInt7574 = 1;
    public boolean aBool7575 = false;
    static final int anInt7576 = 70;
    public int anInt7577;
    public int anInt7578 = 631219903;
    static final int anInt7579 = 16777215;
    public int anInt7580;
    int anInt7581;
    public int anInt7582;
    Interface12 anInterface12_7583;
    int anInt7584;
    public int anInt7585;
    public int anInt7586;
    int anInt7587;
    String aString7588;
    public int anInt7589;
    public int anInt7590;
    public int anInt7591 = 832751757;
    int anInt7592;
    public int[] anIntArray7593;
    int anInt7594;
    int anInt7595;
    public int anInt7596;
    int anInt7597;
    
    public void method58(ByteBuffer class528_sub42, byte i) {
	for (;;) {
	    int i_0_ = class528_sub42.readUnsignedByte((byte) 127);
	    if (i_0_ == 0)
		break;
	    method6873(class528_sub42, i_0_, -1498096290);
	}
    }
    
    void method6873(ByteBuffer class528_sub42, int i, int i_1_) {
	if (i == 1)
	    anInt7578 = class528_sub42.method9645((short) -7551) * -631219903;
	else if (2 == i) {
	    anInt7591 = class528_sub42.readTriByte(742803781) * 1096628083;
	    aBool7575 = true;
	} else if (i == 3)
	    ((Class575) this).anInt7581
		= class528_sub42.method9645((short) 17786) * 141216585;
	else if (4 == i)
	    ((Class575) this).anInt7570
		= class528_sub42.method9645((short) -3946) * -290130209;
	else if (i == 5)
	    ((Class575) this).anInt7587
		= class528_sub42.method9645((short) 14777) * -479315385;
	else if (6 == i)
	    ((Class575) this).anInt7584
		= class528_sub42.method9645((short) 27671) * 2018261847;
	else if (7 == i)
	    anInt7582 = class528_sub42.method9642(-1359299246) * 1077691473;
	else if (i == 8)
	    ((Class575) this).aString7588
		= class528_sub42.method9637((byte) -101);
	else if (9 == i)
	    anInt7580 = class528_sub42.readUnsignedShort(-1088582907) * -86452431;
	else if (i == 10)
	    anInt7586 = class528_sub42.method9642(-1944673864) * -1018820835;
	else if (11 == i)
	    anInt7596 = 0;
	else if (i == 12)
	    anInt7589 = class528_sub42.readUnsignedByte((byte) 84) * 335260797;
	else if (i == 13)
	    anInt7590 = class528_sub42.method9642(695703655) * -441360673;
	else if (i == 14)
	    anInt7596 = class528_sub42.readUnsignedShort(-881823784) * 156162683;
	else if (16 == i) {
	    anInt7585 = class528_sub42.method9642(314182766) * -1779324143;
	    anInt7577 = class528_sub42.method9642(-1155653281) * -1118203445;
	} else if (i == 17 || 18 == i) {
	    ((Class575) this).anInt7594
		= class528_sub42.readUnsignedShort(828352374) * -525048347;
	    if (65535 == -23310355 * ((Class575) this).anInt7594)
		((Class575) this).anInt7594 = 525048347;
	    ((Class575) this).anInt7595
		= class528_sub42.readUnsignedShort(-78639706) * 519309499;
	    if (1725496435 * ((Class575) this).anInt7595 == 65535)
		((Class575) this).anInt7595 = -519309499;
	    int i_2_ = -1;
	    if (i == 18) {
		i_2_ = class528_sub42.readUnsignedShort(970210182);
		if (65535 == i_2_)
		    i_2_ = -1;
	    }
	    int i_3_ = class528_sub42.readUnsignedByte((byte) 20);
	    anIntArray7593 = new int[i_3_ + 2];
	    for (int i_4_ = 0; i_4_ <= i_3_; i_4_++) {
		anIntArray7593[i_4_] = class528_sub42.readUnsignedShort(250242928);
		if (65535 == anIntArray7593[i_4_])
		    anIntArray7593[i_4_] = -1;
	    }
	    anIntArray7593[1 + i_3_] = i_2_;
	} else if (i == 19)
	    ((Class575) this).anInt7592
		= class528_sub42.readUnsignedShort(-858393711) * -2022080901;
	else if (i == 20)
	    ((Class575) this).anInt7597
		= class528_sub42.readUnsignedShort(697536016) * 1746971387;
    }
    
    public final Class575 method6874(IMultiVarDefinitionsLoader iMultiVarDefinitionsLoader,
				     IMultiVarValueReader iMultiVarValueReader, int i) {
	int i_5_ = -1;
	if (anIntArray7593 == null)
	    return this;
	if (null == iMultiVarDefinitionsLoader || iMultiVarValueReader == null)
	    return null;
	if (-1 != -23310355 * ((Class575) this).anInt7594) {
	    VarDefinition varDefinition
		= iMultiVarDefinitionsLoader.method79(-23310355 * ((Class575) this).anInt7594,
				       (byte) 10);
	    if (varDefinition != null)
		i_5_ = iMultiVarValueReader.method97(varDefinition, -1860881523);
	} else if (((Class575) this).anInt7595 * 1725496435 != -1) {
	    Class142 class142
		= iMultiVarDefinitionsLoader.method82(VarDomainType.PLAYER_CONFIGS,
				       (1725496435
					* ((Class575) this).anInt7595),
				       -952249469);
	    if (class142 != null)
		i_5_ = iMultiVarValueReader.method114(class142, (byte) -25);
	}
	if (i_5_ < 0 || i_5_ >= anIntArray7593.length - 1) {
	    int i_6_ = anIntArray7593[anIntArray7593.length - 1];
	    if (-1 != i_6_)
		return (Class575) ((Class575) this).anInterface12_7583
				      .method63(i_6_, 1002512947);
	    return null;
	}
	if (-1 == anIntArray7593[i_5_])
	    return null;
	return (Class575) ((Class575) this).anInterface12_7583
			      .method63(anIntArray7593[i_5_], 938424636);
    }
    
    public String method6875(int i, int i_7_) {
	String string = ((Class575) this).aString7588;
	i = (499691699 * ((Class575) this).anInt7592 * i
	     / (-15282125 * ((Class575) this).anInt7597));
	for (;;) {
	    int i_8_ = string.indexOf("%1");
	    if (i_8_ < 0)
		break;
	    string
		= new StringBuilder().append(string.substring(0, i_8_)).append
		      (Class95_Sub1.method8257(i, false, -479703604)).append
		      (string.substring(i_8_ + 2)).toString();
	}
	return string;
    }
    
    public Class151 method6876(Class173 class173, int i) {
	if (-1519905031 * ((Class575) this).anInt7581 < 0)
	    return null;
	Class151 class151
	    = ((Class151)
	       (((Class580) ((Class575) this).aClass580_7571)
		    .aClass186_7613.method2727
		((long) (((Class575) this).anInt7581 * -1519905031))));
	if (null == class151) {
	    method6878(class173, 843607315);
	    class151
		= (Class151) (((Class580) ((Class575) this).aClass580_7571)
				  .aClass186_7613.method2727
			      ((long) (((Class575) this).anInt7581
				       * -1519905031)));
	}
	return class151;
    }
    
    public Class151 method6877(Class173 class173, int i) {
	if (-1678490337 * ((Class575) this).anInt7570 < 0)
	    return null;
	Class151 class151
	    = ((Class151)
	       (((Class580) ((Class575) this).aClass580_7571)
		    .aClass186_7613.method2727
		((long) (((Class575) this).anInt7570 * -1678490337))));
	if (null == class151) {
	    method6878(class173, 843607315);
	    class151
		= (Class151) (((Class580) ((Class575) this).aClass580_7571)
				  .aClass186_7613.method2727
			      ((long) (((Class575) this).anInt7570
				       * -1678490337)));
	}
	return class151;
    }
    
    public void method59() {
	/* empty */
    }
    
    void method6878(Class173 class173, int i) {
	Class446 class446
	    = ((Class580) ((Class575) this).aClass580_7571).aClass446_7614;
	if (-1519905031 * ((Class575) this).anInt7581 >= 0
	    && (((Class580) ((Class575) this).aClass580_7571)
		    .aClass186_7613.method2727
		((long) (((Class575) this).anInt7581 * -1519905031))) == null
	    && class446.method5357(-1519905031 * ((Class575) this).anInt7581,
				   (short) -10459)) {
	    Class178 class178
		= Class175.method2562(class446, (((Class575) this).anInt7581
						 * -1519905031));
	    ((Class580) ((Class575) this).aClass580_7571).aClass186_7613
		.method2729
		(class173.method2334(class178, true),
		 (long) (-1519905031 * ((Class575) this).anInt7581));
	}
	if (-360624265 * ((Class575) this).anInt7587 >= 0
	    && (((Class580) ((Class575) this).aClass580_7571)
		    .aClass186_7613.method2727
		((long) (((Class575) this).anInt7587 * -360624265))) == null
	    && class446.method5357(-360624265 * ((Class575) this).anInt7587,
				   (short) 10305)) {
	    Class178 class178
		= Class175.method2562(class446, -360624265 * (((Class575) this)
							      .anInt7587));
	    ((Class580) ((Class575) this).aClass580_7571).aClass186_7613
		.method2729
		(class173.method2334(class178, true),
		 (long) (-360624265 * ((Class575) this).anInt7587));
	}
	if (((Class575) this).anInt7570 * -1678490337 >= 0
	    && (((Class580) ((Class575) this).aClass580_7571)
		    .aClass186_7613.method2727
		((long) (((Class575) this).anInt7570 * -1678490337))) == null
	    && class446.method5357(((Class575) this).anInt7570 * -1678490337,
				   (short) 447)) {
	    Class178 class178
		= Class175.method2562(class446,
				      (-1678490337
				       * ((Class575) this).anInt7570));
	    ((Class580) ((Class575) this).aClass580_7571).aClass186_7613
		.method2729
		(class173.method2334(class178, true),
		 (long) (-1678490337 * ((Class575) this).anInt7570));
	}
	if (((Class575) this).anInt7584 * 1289281639 >= 0
	    && (((Class580) ((Class575) this).aClass580_7571)
		    .aClass186_7613.method2727
		((long) (((Class575) this).anInt7584 * 1289281639))) == null
	    && class446.method5357(1289281639 * ((Class575) this).anInt7584,
				   (short) -12063)) {
	    Class178 class178
		= Class175.method2562(class446, 1289281639 * (((Class575) this)
							      .anInt7584));
	    ((Class580) ((Class575) this).aClass580_7571).aClass186_7613
		.method2729
		(class173.method2334(class178, true),
		 (long) (((Class575) this).anInt7584 * 1289281639));
	}
    }
    
    public Class151 method6879(Class173 class173, int i) {
	if (((Class575) this).anInt7584 * 1289281639 < 0)
	    return null;
	Class151 class151
	    = (Class151) (((Class580) ((Class575) this).aClass580_7571)
			      .aClass186_7613.method2727
			  ((long) (1289281639 * ((Class575) this).anInt7584)));
	if (null == class151) {
	    method6878(class173, 843607315);
	    class151
		= (Class151) (((Class580) ((Class575) this).aClass580_7571)
				  .aClass186_7613.method2727
			      ((long) (((Class575) this).anInt7584
				       * 1289281639)));
	}
	return class151;
    }
    
    void method6880(Class173 class173) {
	Class446 class446
	    = ((Class580) ((Class575) this).aClass580_7571).aClass446_7614;
	if (-1519905031 * ((Class575) this).anInt7581 >= 0
	    && (((Class580) ((Class575) this).aClass580_7571)
		    .aClass186_7613.method2727
		((long) (((Class575) this).anInt7581 * -1519905031))) == null
	    && class446.method5357(-1519905031 * ((Class575) this).anInt7581,
				   (short) 22447)) {
	    Class178 class178
		= Class175.method2562(class446, (((Class575) this).anInt7581
						 * -1519905031));
	    ((Class580) ((Class575) this).aClass580_7571).aClass186_7613
		.method2729
		(class173.method2334(class178, true),
		 (long) (-1519905031 * ((Class575) this).anInt7581));
	}
	if (-360624265 * ((Class575) this).anInt7587 >= 0
	    && (((Class580) ((Class575) this).aClass580_7571)
		    .aClass186_7613.method2727
		((long) (((Class575) this).anInt7587 * -360624265))) == null
	    && class446.method5357(-360624265 * ((Class575) this).anInt7587,
				   (short) 155)) {
	    Class178 class178
		= Class175.method2562(class446, -360624265 * (((Class575) this)
							      .anInt7587));
	    ((Class580) ((Class575) this).aClass580_7571).aClass186_7613
		.method2729
		(class173.method2334(class178, true),
		 (long) (-360624265 * ((Class575) this).anInt7587));
	}
	if (((Class575) this).anInt7570 * -1678490337 >= 0
	    && (((Class580) ((Class575) this).aClass580_7571)
		    .aClass186_7613.method2727
		((long) (((Class575) this).anInt7570 * -1678490337))) == null
	    && class446.method5357(((Class575) this).anInt7570 * -1678490337,
				   (short) -4598)) {
	    Class178 class178
		= Class175.method2562(class446,
				      (-1678490337
				       * ((Class575) this).anInt7570));
	    ((Class580) ((Class575) this).aClass580_7571).aClass186_7613
		.method2729
		(class173.method2334(class178, true),
		 (long) (-1678490337 * ((Class575) this).anInt7570));
	}
	if (((Class575) this).anInt7584 * 1289281639 >= 0
	    && (((Class580) ((Class575) this).aClass580_7571)
		    .aClass186_7613.method2727
		((long) (((Class575) this).anInt7584 * 1289281639))) == null
	    && class446.method5357(1289281639 * ((Class575) this).anInt7584,
				   (short) -4319)) {
	    Class178 class178
		= Class175.method2562(class446, 1289281639 * (((Class575) this)
							      .anInt7584));
	    ((Class580) ((Class575) this).aClass580_7571).aClass186_7613
		.method2729
		(class173.method2334(class178, true),
		 (long) (((Class575) this).anInt7584 * 1289281639));
	}
    }
    
    public Class151 method6881(Class173 class173, short i) {
	if (-360624265 * ((Class575) this).anInt7587 < 0)
	    return null;
	Class151 class151
	    = (Class151) (((Class580) ((Class575) this).aClass580_7571)
			      .aClass186_7613.method2727
			  ((long) (-360624265 * ((Class575) this).anInt7587)));
	if (class151 == null) {
	    method6878(class173, 843607315);
	    class151
		= (Class151) (((Class580) ((Class575) this).aClass580_7571)
				  .aClass186_7613.method2727
			      ((long) (-360624265
				       * ((Class575) this).anInt7587)));
	}
	return class151;
    }
    
    public void method60(ByteBuffer class528_sub42) {
	for (;;) {
	    int i = class528_sub42.readUnsignedByte((byte) 116);
	    if (i == 0)
		break;
	    method6873(class528_sub42, i, -1965912093);
	}
    }
    
    void method6882(ByteBuffer class528_sub42, int i) {
	if (i == 1)
	    anInt7578 = class528_sub42.method9645((short) 8417) * -631219903;
	else if (2 == i) {
	    anInt7591 = class528_sub42.readTriByte(1241742121) * 1096628083;
	    aBool7575 = true;
	} else if (i == 3)
	    ((Class575) this).anInt7581
		= class528_sub42.method9645((short) -24219) * 141216585;
	else if (4 == i)
	    ((Class575) this).anInt7570
		= class528_sub42.method9645((short) -14208) * -290130209;
	else if (i == 5)
	    ((Class575) this).anInt7587
		= class528_sub42.method9645((short) -1838) * -479315385;
	else if (6 == i)
	    ((Class575) this).anInt7584
		= class528_sub42.method9645((short) 9203) * 2018261847;
	else if (7 == i)
	    anInt7582 = class528_sub42.method9642(901120117) * 1077691473;
	else if (i == 8)
	    ((Class575) this).aString7588
		= class528_sub42.method9637((byte) -7);
	else if (9 == i)
	    anInt7580 = class528_sub42.readUnsignedShort(-704134280) * -86452431;
	else if (i == 10)
	    anInt7586 = class528_sub42.method9642(458654054) * -1018820835;
	else if (11 == i)
	    anInt7596 = 0;
	else if (i == 12)
	    anInt7589 = class528_sub42.readUnsignedByte((byte) 90) * 335260797;
	else if (i == 13)
	    anInt7590 = class528_sub42.method9642(106241714) * -441360673;
	else if (i == 14)
	    anInt7596 = class528_sub42.readUnsignedShort(905553156) * 156162683;
	else if (16 == i) {
	    anInt7585 = class528_sub42.method9642(434879969) * -1779324143;
	    anInt7577 = class528_sub42.method9642(476616049) * -1118203445;
	} else if (i == 17 || 18 == i) {
	    ((Class575) this).anInt7594
		= class528_sub42.readUnsignedShort(-1709403002) * -525048347;
	    if (65535 == -23310355 * ((Class575) this).anInt7594)
		((Class575) this).anInt7594 = 525048347;
	    ((Class575) this).anInt7595
		= class528_sub42.readUnsignedShort(-975035495) * 519309499;
	    if (1725496435 * ((Class575) this).anInt7595 == 65535)
		((Class575) this).anInt7595 = -519309499;
	    int i_9_ = -1;
	    if (i == 18) {
		i_9_ = class528_sub42.readUnsignedShort(-743560013);
		if (65535 == i_9_)
		    i_9_ = -1;
	    }
	    int i_10_ = class528_sub42.readUnsignedByte((byte) 61);
	    anIntArray7593 = new int[i_10_ + 2];
	    for (int i_11_ = 0; i_11_ <= i_10_; i_11_++) {
		anIntArray7593[i_11_] = class528_sub42.readUnsignedShort(-268722921);
		if (65535 == anIntArray7593[i_11_])
		    anIntArray7593[i_11_] = -1;
	    }
	    anIntArray7593[1 + i_10_] = i_9_;
	} else if (i == 19)
	    ((Class575) this).anInt7592
		= class528_sub42.readUnsignedShort(-1593366616) * -2022080901;
	else if (i == 20)
	    ((Class575) this).anInt7597
		= class528_sub42.readUnsignedShort(72445649) * 1746971387;
    }
    
    void method6883(ByteBuffer class528_sub42, int i) {
	if (i == 1)
	    anInt7578 = class528_sub42.method9645((short) 20779) * -631219903;
	else if (2 == i) {
	    anInt7591 = class528_sub42.readTriByte(2015607699) * 1096628083;
	    aBool7575 = true;
	} else if (i == 3)
	    ((Class575) this).anInt7581
		= class528_sub42.method9645((short) -4886) * 141216585;
	else if (4 == i)
	    ((Class575) this).anInt7570
		= class528_sub42.method9645((short) -20709) * -290130209;
	else if (i == 5)
	    ((Class575) this).anInt7587
		= class528_sub42.method9645((short) 7558) * -479315385;
	else if (6 == i)
	    ((Class575) this).anInt7584
		= class528_sub42.method9645((short) 21003) * 2018261847;
	else if (7 == i)
	    anInt7582 = class528_sub42.method9642(214594935) * 1077691473;
	else if (i == 8)
	    ((Class575) this).aString7588
		= class528_sub42.method9637((byte) -125);
	else if (9 == i)
	    anInt7580 = class528_sub42.readUnsignedShort(-1127542398) * -86452431;
	else if (i == 10)
	    anInt7586 = class528_sub42.method9642(-84058218) * -1018820835;
	else if (11 == i)
	    anInt7596 = 0;
	else if (i == 12)
	    anInt7589 = class528_sub42.readUnsignedByte((byte) 18) * 335260797;
	else if (i == 13)
	    anInt7590 = class528_sub42.method9642(-1990324535) * -441360673;
	else if (i == 14)
	    anInt7596 = class528_sub42.readUnsignedShort(-1896856091) * 156162683;
	else if (16 == i) {
	    anInt7585 = class528_sub42.method9642(120959607) * -1779324143;
	    anInt7577 = class528_sub42.method9642(2082899169) * -1118203445;
	} else if (i == 17 || 18 == i) {
	    ((Class575) this).anInt7594
		= class528_sub42.readUnsignedShort(-1168687756) * -525048347;
	    if (65535 == -23310355 * ((Class575) this).anInt7594)
		((Class575) this).anInt7594 = 525048347;
	    ((Class575) this).anInt7595
		= class528_sub42.readUnsignedShort(-1278943778) * 519309499;
	    if (1725496435 * ((Class575) this).anInt7595 == 65535)
		((Class575) this).anInt7595 = -519309499;
	    int i_12_ = -1;
	    if (i == 18) {
		i_12_ = class528_sub42.readUnsignedShort(140680579);
		if (65535 == i_12_)
		    i_12_ = -1;
	    }
	    int i_13_ = class528_sub42.readUnsignedByte((byte) 89);
	    anIntArray7593 = new int[i_13_ + 2];
	    for (int i_14_ = 0; i_14_ <= i_13_; i_14_++) {
		anIntArray7593[i_14_] = class528_sub42.readUnsignedShort(92764078);
		if (65535 == anIntArray7593[i_14_])
		    anIntArray7593[i_14_] = -1;
	    }
	    anIntArray7593[1 + i_13_] = i_12_;
	} else if (i == 19)
	    ((Class575) this).anInt7592
		= class528_sub42.readUnsignedShort(-1447847597) * -2022080901;
	else if (i == 20)
	    ((Class575) this).anInt7597
		= class528_sub42.readUnsignedShort(-461123025) * 1746971387;
    }
    
    public void method61(int i) {
	/* empty */
    }
    
    public void method57(ByteBuffer class528_sub42) {
	for (;;) {
	    int i = class528_sub42.readUnsignedByte((byte) 58);
	    if (i == 0)
		break;
	    method6873(class528_sub42, i, -1374779971);
	}
    }
    
    public String method6884(int i) {
	String string = ((Class575) this).aString7588;
	i = (499691699 * ((Class575) this).anInt7592 * i
	     / (-15282125 * ((Class575) this).anInt7597));
	for (;;) {
	    int i_15_ = string.indexOf("%1");
	    if (i_15_ < 0)
		break;
	    string
		= new StringBuilder().append(string.substring(0, i_15_)).append
		      (Class95_Sub1.method8257(i, false, -479703604)).append
		      (string.substring(i_15_ + 2)).toString();
	}
	return string;
    }
    
    public String method6885(int i) {
	String string = ((Class575) this).aString7588;
	i = (499691699 * ((Class575) this).anInt7592 * i
	     / (-15282125 * ((Class575) this).anInt7597));
	for (;;) {
	    int i_16_ = string.indexOf("%1");
	    if (i_16_ < 0)
		break;
	    string
		= new StringBuilder().append(string.substring(0, i_16_)).append
		      (Class95_Sub1.method8257(i, false, -479703604)).append
		      (string.substring(i_16_ + 2)).toString();
	}
	return string;
    }
    
    Class575(int i, Class580 class580, Interface12 interface12) {
	anInt7580 = -1756702874;
	((Class575) this).anInt7581 = -141216585;
	((Class575) this).anInt7587 = 479315385;
	((Class575) this).anInt7570 = 290130209;
	((Class575) this).anInt7584 = -2018261847;
	anInt7582 = 0;
	anInt7586 = 0;
	anInt7596 = -156162683;
	((Class575) this).aString7588 = "";
	anInt7589 = -335260797;
	anInt7590 = 0;
	anInt7585 = 0;
	anInt7577 = 0;
	((Class575) this).anInt7594 = 525048347;
	((Class575) this).anInt7595 = -519309499;
	((Class575) this).anInt7592 = -2022080901;
	((Class575) this).anInt7597 = 1746971387;
	((Class575) this).aClass580_7571 = class580;
	((Class575) this).anInterface12_7583 = interface12;
    }
    
    void method6886(ByteBuffer class528_sub42, int i) {
	if (i == 1)
	    anInt7578 = class528_sub42.method9645((short) 15729) * -631219903;
	else if (2 == i) {
	    anInt7591 = class528_sub42.readTriByte(-513555679) * 1096628083;
	    aBool7575 = true;
	} else if (i == 3)
	    ((Class575) this).anInt7581
		= class528_sub42.method9645((short) -2063) * 141216585;
	else if (4 == i)
	    ((Class575) this).anInt7570
		= class528_sub42.method9645((short) -15737) * -290130209;
	else if (i == 5)
	    ((Class575) this).anInt7587
		= class528_sub42.method9645((short) -14308) * -479315385;
	else if (6 == i)
	    ((Class575) this).anInt7584
		= class528_sub42.method9645((short) 13768) * 2018261847;
	else if (7 == i)
	    anInt7582 = class528_sub42.method9642(767468288) * 1077691473;
	else if (i == 8)
	    ((Class575) this).aString7588
		= class528_sub42.method9637((byte) -73);
	else if (9 == i)
	    anInt7580 = class528_sub42.readUnsignedShort(386469888) * -86452431;
	else if (i == 10)
	    anInt7586 = class528_sub42.method9642(1356068200) * -1018820835;
	else if (11 == i)
	    anInt7596 = 0;
	else if (i == 12)
	    anInt7589 = class528_sub42.readUnsignedByte((byte) 23) * 335260797;
	else if (i == 13)
	    anInt7590 = class528_sub42.method9642(-1804417207) * -441360673;
	else if (i == 14)
	    anInt7596 = class528_sub42.readUnsignedShort(290652149) * 156162683;
	else if (16 == i) {
	    anInt7585 = class528_sub42.method9642(329730000) * -1779324143;
	    anInt7577 = class528_sub42.method9642(771635246) * -1118203445;
	} else if (i == 17 || 18 == i) {
	    ((Class575) this).anInt7594
		= class528_sub42.readUnsignedShort(-527998235) * -525048347;
	    if (65535 == -23310355 * ((Class575) this).anInt7594)
		((Class575) this).anInt7594 = 525048347;
	    ((Class575) this).anInt7595
		= class528_sub42.readUnsignedShort(-394535252) * 519309499;
	    if (1725496435 * ((Class575) this).anInt7595 == 65535)
		((Class575) this).anInt7595 = -519309499;
	    int i_17_ = -1;
	    if (i == 18) {
		i_17_ = class528_sub42.readUnsignedShort(-56924299);
		if (65535 == i_17_)
		    i_17_ = -1;
	    }
	    int i_18_ = class528_sub42.readUnsignedByte((byte) 51);
	    anIntArray7593 = new int[i_18_ + 2];
	    for (int i_19_ = 0; i_19_ <= i_18_; i_19_++) {
		anIntArray7593[i_19_] = class528_sub42.readUnsignedShort(-63207455);
		if (65535 == anIntArray7593[i_19_])
		    anIntArray7593[i_19_] = -1;
	    }
	    anIntArray7593[1 + i_18_] = i_17_;
	} else if (i == 19)
	    ((Class575) this).anInt7592
		= class528_sub42.readUnsignedShort(43208833) * -2022080901;
	else if (i == 20)
	    ((Class575) this).anInt7597
		= class528_sub42.readUnsignedShort(-1485791878) * 1746971387;
    }
    
    public String method6887(int i) {
	String string = ((Class575) this).aString7588;
	i = (499691699 * ((Class575) this).anInt7592 * i
	     / (-15282125 * ((Class575) this).anInt7597));
	for (;;) {
	    int i_20_ = string.indexOf("%1");
	    if (i_20_ < 0)
		break;
	    string
		= new StringBuilder().append(string.substring(0, i_20_)).append
		      (Class95_Sub1.method8257(i, false, -479703604)).append
		      (string.substring(i_20_ + 2)).toString();
	}
	return string;
    }
    
    static void method6888(Class648 class648, byte i) {
	int i_21_ = Class309.method4128((byte) 2);
	if (i_21_ < 0) {
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= -1;
	    ((Class648) class648).anObjectArray8396
		[((((Class648) class648).anInt8410 += 1600226731) * -520794877
		  - 1)]
		= "";
	    ((Class648) class648).anObjectArray8396
		[((((Class648) class648).anInt8410 += 1600226731) * -520794877
		  - 1)]
		= "";
	    ((Class648) class648).anObjectArray8396
		[((((Class648) class648).anInt8410 += 1600226731) * -520794877
		  - 1)]
		= "";
	    ((Class648) class648).anObjectArray8396
		[((((Class648) class648).anInt8410 += 1600226731) * -520794877
		  - 1)]
		= "";
	} else {
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= Class427.aTwitchEventLiveStreams4800.viewerCounts[i_21_];
	    ((Class648) class648).anObjectArray8396
		[((((Class648) class648).anInt8410 += 1600226731) * -520794877
		  - 1)]
		= Class427.aTwitchEventLiveStreams4800.channelUrls[i_21_];
	    ((Class648) class648).anObjectArray8396
		[((((Class648) class648).anInt8410 += 1600226731) * -520794877
		  - 1)]
		= (Class427.aTwitchEventLiveStreams4800.previewUrlTemplates
		   [i_21_]);
	    ((Class648) class648).anObjectArray8396
		[((((Class648) class648).anInt8410 += 1600226731) * -520794877
		  - 1)]
		= Class427.aTwitchEventLiveStreams4800.streamTitles[i_21_];
	    ((Class648) class648).anObjectArray8396
		[((((Class648) class648).anInt8410 += 1600226731) * -520794877
		  - 1)]
		= (Class427.aTwitchEventLiveStreams4800.channelDisplayNames
		   [i_21_]);
	}
    }
    
    static final void method6889(Class648 class648, int i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	Class226 class226 = ((Class646) class646).aClass226_8384;
	Class528_Sub28_Sub14.method10463(class229, class226, class648,
					 (byte) -70);
    }
    
    public static Class657[] method6890(byte i) {
	return (new Class657[]
		{ Class657.aClass657_8440, Class657.aClass657_8444,
		  Class657.aClass657_8437, Class657.aClass657_8438,
		  Class657.aClass657_8439, Class657.aClass657_8436,
		  Class657.aClass657_8441, Class657.aClass657_8435 });
    }
}
