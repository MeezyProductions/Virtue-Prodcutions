/* Class338 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class338
{
    static final boolean method4378(int i, int i_0_) {
	return (i & 0x800) != 0;
    }
    
    static final boolean method4379(int i, int i_1_) {
	return (i & 0x21) != 0;
    }
    
    static final boolean method4380(int i, int i_2_) {
	return (i & 0x22) != 0;
    }
    
    static final boolean method4381(int i, int i_3_) {
	return ((i & 0x70000) != 0 || method4379(i, i_3_)
		|| method4395(i, i_3_));
    }
    
    static final boolean method4382(int i, int i_4_) {
	return (i & 0x37) != 0;
    }
    
    static final boolean method4383(int i, int i_5_) {
	return (i & 0x800) != 0;
    }
    
    static final boolean method4384(int i, int i_6_) {
	return (i & 0x100) != 0;
    }
    
    static final boolean method4385(int i, int i_7_) {
	return (i & 0x10000) != 0;
    }
    
    static final boolean method4386(int i, int i_8_) {
	return method4470(i, i_8_) & method4394(i, i_8_);
    }
    
    static final boolean method4387(int i, int i_9_) {
	return (i & 0x8000) != 0;
    }
    
    static final boolean method4388(int i, int i_10_) {
	return (i & 0xc580) != 0;
    }
    
    static final boolean method4389(int i, int i_11_) {
	return (i & 0x100) != 0;
    }
    
    static final boolean method4390(int i, int i_12_) {
	return (i & 0x22) != 0;
    }
    
    static final boolean method4391(int i, int i_13_) {
	return (i & 0x800) != 0 && (i_13_ & 0x37) != 0;
    }
    
    static final boolean method4392(int i, int i_14_) {
	return (i & 0x800) != 0;
    }
    
    static final boolean method4393(int i, int i_15_) {
	return (i & 0x84080) != 0;
    }
    
    static final boolean method4394(int i, int i_16_) {
	return (i & 0x800) != 0;
    }
    
    static final boolean method4395(int i, int i_17_) {
	return ((method4379(i, i_17_) | method4380(i, i_17_)
		 | method4449(i, i_17_))
		& method4412(i, i_17_));
    }
    
    static final boolean method4396(int i, int i_18_) {
	return method4391(i, i_18_) & ((i & 0x2000) != 0 | method4399(i, i_18_)
				       | method4442(i, i_18_));
    }
    
    static final boolean method4397(int i, int i_19_) {
	if (!method4392(i, i_19_))
	    return false;
	if ((i & 0x9000) != 0 | method4393(i, i_19_) | method4384(i, i_19_))
	    return true;
	return (i_19_ & 0x37) == 0 & ((i & 0x2000) != 0 | method4399(i, i_19_)
				      | method4442(i, i_19_));
    }
    
    static final boolean method4398(int i, int i_20_) {
	return (i & 0x800) != 0;
    }
    
    static final boolean method4399(int i, int i_21_) {
	return (i & 0x220) == 544 | (i & 0x18) != 0;
    }
    
    static final boolean method4400(int i, int i_22_) {
	return (i & 0x800) != 0;
    }
    
    static final boolean method4401(int i, int i_23_) {
	return ((i & 0x70000) != 0 || method4380(i, i_23_)
		|| method4395(i, i_23_));
    }
    
    static final boolean method4402(int i, int i_24_) {
	return ((i & 0x70000) != 0 || method4449(i, i_24_)
		|| method4395(i, i_24_));
    }
    
    static final boolean method4403(int i, int i_25_) {
	return (i & 0x800) != 0;
    }
    
    static final boolean method4404(int i, int i_26_) {
	return method4393(i, i_26_) || method4397(i, i_26_);
    }
    
    static final boolean method4405(int i, int i_27_) {
	return ((i & 0x40000) != 0 | method4384(i, i_27_)
		|| method4397(i, i_27_));
    }
    
    static final boolean method4406(int i, int i_28_) {
	return method4427(i, i_28_) || method4462(i, i_28_);
    }
    
    static final boolean method4407(int i, int i_29_) {
	if (!method4392(i, i_29_))
	    return false;
	if ((i & 0x9000) != 0 | method4393(i, i_29_) | method4384(i, i_29_))
	    return true;
	return (i_29_ & 0x37) == 0 & ((i & 0x2000) != 0 | method4399(i, i_29_)
				      | method4442(i, i_29_));
    }
    
    static final boolean method4408(int i, int i_30_) {
	return ((method4379(i, i_30_) | method4380(i, i_30_)
		 | method4449(i, i_30_))
		& method4412(i, i_30_));
    }
    
    static final boolean method4409(int i, int i_31_) {
	return ((i & 0x60000) != 0 | method4470(i, i_31_)
		|| method4386(i, i_31_));
    }
    
    static final boolean method4410(int i, int i_32_) {
	return (i & 0x800) != 0 | method4387(i, i_32_) || method4397(i, i_32_);
    }
    
    static final boolean method4411(int i, int i_33_) {
	return (i & 0x21) != 0;
    }
    
    static final boolean method4412(int i, int i_34_) {
	return (i & 0x800) != 0;
    }
    
    static final boolean method4413(int i, int i_35_) {
	return (i & 0x22) != 0;
    }
    
    static final boolean method4414(int i, int i_36_) {
	return (i & 0x22) != 0;
    }
    
    static final boolean method4415(int i, int i_37_) {
	return (i & 0x22) != 0;
    }
    
    static final boolean method4416(int i, int i_38_) {
	return method4470(i, i_38_) & method4394(i, i_38_);
    }
    
    static final boolean method4417(int i, int i_39_) {
	return (i & 0x37) != 0;
    }
    
    static final boolean method4418(int i, int i_40_) {
	return (i & 0x37) != 0;
    }
    
    static final boolean method4419(int i, int i_41_) {
	return (i & 0x37) != 0;
    }
    
    static final boolean method4420(int i, int i_42_) {
	return (i & 0x37) != 0;
    }
    
    static final boolean method4421(int i, int i_43_) {
	return (i & 0x220) == 544 | (i & 0x18) != 0;
    }
    
    static final boolean method4422(int i, int i_44_) {
	return (i & 0x220) == 544 | (i & 0x18) != 0;
    }
    
    static final boolean method4423(int i, int i_45_) {
	return (i & 0x220) == 544 | (i & 0x18) != 0;
    }
    
    static final boolean method4424(int i, int i_46_) {
	return (i & 0x220) == 544 | (i & 0x18) != 0;
    }
    
    static final boolean method4425(int i, int i_47_) {
	return ((i & 0x40000) != 0 | method4384(i, i_47_)
		|| method4397(i, i_47_));
    }
    
    static final boolean method4426(int i, int i_48_) {
	return false;
    }
    
    static final boolean method4427(int i, int i_49_) {
	return false;
    }
    
    static final boolean method4428(int i, int i_50_) {
	return false;
    }
    
    static final boolean method4429(int i, int i_51_) {
	return false;
    }
    
    static final boolean method4430(int i, int i_52_) {
	return false;
    }
    
    static final boolean method4431(int i, int i_53_) {
	return (i & 0x800) != 0;
    }
    
    static final boolean method4432(int i, int i_54_) {
	return (i & 0x8000) != 0;
    }
    
    static final boolean method4433(int i, int i_55_) {
	if (!method4392(i, i_55_))
	    return false;
	if ((i & 0x9000) != 0 | method4393(i, i_55_) | method4384(i, i_55_))
	    return true;
	return (i_55_ & 0x37) == 0 & ((i & 0x2000) != 0 | method4399(i, i_55_)
				      | method4442(i, i_55_));
    }
    
    static final boolean method4434(int i, int i_56_) {
	return (i & 0xc580) != 0;
    }
    
    static final boolean method4435(int i, int i_57_) {
	return (i & 0x400) != 0;
    }
    
    static final boolean method4436(int i, int i_58_) {
	if (!method4392(i, i_58_))
	    return false;
	if ((i & 0x9000) != 0 | method4393(i, i_58_) | method4384(i, i_58_))
	    return true;
	return (i_58_ & 0x37) == 0 & ((i & 0x2000) != 0 | method4399(i, i_58_)
				      | method4442(i, i_58_));
    }
    
    static final boolean method4437(int i, int i_59_) {
	return (i & 0x800) != 0;
    }
    
    static final boolean method4438(int i, int i_60_) {
	return (i & 0x180) != 0;
    }
    
    static final boolean method4439(int i, int i_61_) {
	return (i & 0x800) != 0 && (i_61_ & 0x37) != 0;
    }
    
    static final boolean method4440(int i, int i_62_) {
	return (i & 0x800) != 0 && (i_62_ & 0x37) != 0;
    }
    
    static final boolean method4441(int i, int i_63_) {
	boolean bool = ((i_63_ & 0x37) != 0 ? method4396(i, i_63_)
			: method4397(i, i_63_));
	return (i & 0x10000) != 0 | method4399(i, i_63_) | bool;
    }
    
    static final boolean method4442(int i, int i_64_) {
	return (i & 0x10000) != 0;
    }
    
    static final boolean method4443(int i, int i_65_) {
	return false;
    }
    
    static final boolean method4444(int i, int i_66_) {
	return (i & 0x800) != 0;
    }
    
    static final boolean method4445(int i, int i_67_) {
	return (i & 0x800) != 0;
    }
    
    static final boolean method4446(int i, int i_68_) {
	return (i & 0x800) != 0;
    }
    
    static final boolean method4447(int i, int i_69_) {
	return (i & 0x800) != 0;
    }
    
    static final boolean method4448(int i, int i_70_) {
	return method4393(i, i_70_) || method4397(i, i_70_);
    }
    
    static final boolean method4449(int i, int i_71_) {
	return (i & 0x34) != 0;
    }
    
    static final boolean method4450(int i, int i_72_) {
	return ((method4379(i, i_72_) | method4380(i, i_72_)
		 | method4449(i, i_72_))
		& method4412(i, i_72_));
    }
    
    static final boolean method4451(int i, int i_73_) {
	return method4391(i, i_73_) & ((i & 0x2000) != 0 | method4399(i, i_73_)
				       | method4442(i, i_73_));
    }
    
    static final boolean method4452(int i, int i_74_) {
	return ((i & 0x70000) != 0 || method4380(i, i_74_)
		|| method4395(i, i_74_));
    }
    
    static final boolean method4453(int i, int i_75_) {
	return (i & 0x20) != 0;
    }
    
    static final boolean method4454(int i, int i_76_) {
	if (!method4392(i, i_76_))
	    return false;
	if ((i & 0x9000) != 0 | method4393(i, i_76_) | method4384(i, i_76_))
	    return true;
	return (i_76_ & 0x37) == 0 & ((i & 0x2000) != 0 | method4399(i, i_76_)
				      | method4442(i, i_76_));
    }
    
    static final boolean method4455(int i, int i_77_) {
	return (i & 0x21) != 0;
    }
    
    static final boolean method4456(int i, int i_78_) {
	return method4427(i, i_78_) & method4403(i, i_78_);
    }
    
    static final boolean method4457(int i, int i_79_) {
	return method4427(i, i_79_) & method4403(i, i_79_);
    }
    
    static final boolean method4458(int i, int i_80_) {
	return method4427(i, i_80_) & method4403(i, i_80_);
    }
    
    static final boolean method4459(int i, int i_81_) {
	return method4470(i, i_81_) & method4394(i, i_81_);
    }
    
    static final boolean method4460(int i, int i_82_) {
	return method4470(i, i_82_) & method4394(i, i_82_);
    }
    
    static final boolean method4461(int i, int i_83_) {
	return method4470(i, i_83_) & method4394(i, i_83_);
    }
    
    static final boolean method4462(int i, int i_84_) {
	return method4427(i, i_84_) & method4403(i, i_84_);
    }
    
    static final boolean method4463(int i, int i_85_) {
	return ((i & 0x70000) != 0 || method4379(i, i_85_)
		|| method4395(i, i_85_));
    }
    
    static final boolean method4464(int i, int i_86_) {
	return ((i & 0x70000) != 0 || method4380(i, i_86_)
		|| method4395(i, i_86_));
    }
    
    static final boolean method4465(int i, int i_87_) {
	return ((i & 0x70000) != 0 || method4380(i, i_87_)
		|| method4395(i, i_87_));
    }
    
    static final boolean method4466(int i, int i_88_) {
	return (i & 0x10) != 0;
    }
    
    static final boolean method4467(int i, int i_89_) {
	return (i & 0x220) == 544 | (i & 0x18) != 0;
    }
    
    static final boolean method4468(int i, int i_90_) {
	return method4393(i, i_90_) || method4397(i, i_90_);
    }
    
    static final boolean method4469(int i, int i_91_) {
	return method4393(i, i_91_) || method4397(i, i_91_);
    }
    
    Class338() throws Throwable {
	throw new Error();
    }
    
    static final boolean method4470(int i, int i_92_) {
	return (i & 0x10) != 0;
    }
    
    static final boolean method4471(int i, int i_93_) {
	return ((i & 0x40000) != 0 | method4384(i, i_93_)
		|| method4397(i, i_93_));
    }
    
    static final boolean method4472(int i, int i_94_) {
	return ((i & 0x40000) != 0 | method4384(i, i_94_)
		|| method4397(i, i_94_));
    }
    
    static final boolean method4473(int i, int i_95_) {
	return method4427(i, i_95_) || method4462(i, i_95_);
    }
    
    static final boolean method4474(int i, int i_96_) {
	return method4427(i, i_96_) || method4462(i, i_96_);
    }
    
    static final boolean method4475(int i, int i_97_) {
	return (i & 0x180) != 0;
    }
    
    static final boolean method4476(int i, int i_98_) {
	return (i & 0x8000) != 0;
    }
    
    static final boolean method4477(int i, int i_99_) {
	return ((method4379(i, i_99_) | method4380(i, i_99_)
		 | method4449(i, i_99_))
		& method4412(i, i_99_));
    }
    
    static final boolean method4478(int i, int i_100_) {
	boolean bool = ((i_100_ & 0x37) != 0 ? method4396(i, i_100_)
			: method4397(i, i_100_));
	return (i & 0x10000) != 0 | method4399(i, i_100_) | bool;
    }
    
    static final boolean method4479(int i, int i_101_) {
	return (i & 0x180) != 0;
    }
}
