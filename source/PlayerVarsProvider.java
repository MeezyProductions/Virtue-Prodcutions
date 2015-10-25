/* PlayerVarsProvider - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class PlayerVarsProvider implements IMultiVarValueReader, IMultiVarDefinitionsLoader, Interface70 {

	Class95_Sub1_Sub2 aClass95_Sub1_Sub2_1207;
	Class5_Sub5 aClass5_Sub5_1208;
	public Class586 aClass586_1209;
	Class620[] aClass620Array1210;

	public int method1238(int i) {
		return this.aClass620Array1210[i].method7393(1698431814);
	}

	public int method1239(int i, int i_0_) {
		return (this.aClass620Array1210[i]
				.method7391((client.aBool10966 ? Class660.aClass660_8449 : Class660.aClass660_8450), 187879287));
	}

	public int method1240(int i, int i_1_) {
		return this.aClass620Array1210[i].method7395((byte) 69);
	}

	@Override
	public int method471(int i, int i_2_) {
		return (this.aClass620Array1210[i]
				.method7403((client.aBool10966 ? Class660.aClass660_8449 : Class660.aClass660_8450), (byte) 1));
	}

	public int method1241(int i) {
		return this.aClass620Array1210[i].method7390(-1085946275);
	}

	public int method1242(int i) {
		return (this.aClass620Array1210[i]
				.method7391((client.aBool10966 ? Class660.aClass660_8449 : Class660.aClass660_8450), 187879287));
	}

	@Override
	public Class142 method82(VarDomainType varDomainType, int i, int i_3_) {
		if (varDomainType != VarDomainType.PLAYER_CONFIGS)
			return null;
		return (Class142) this.aClass95_Sub1_Sub2_1207.method63(i, -1555398271);
	}

	@Override
	public VarDefinition method79(int i, byte i_4_) {
		VarDefinition varDefinition = ((VarDefinition) this.aClass5_Sub5_1208.method63(i, -978292342));
		if (VarDomainType.PLAYER_CONFIGS != varDefinition.aClass142_3415.aClass445_1639)
			return null;
		return varDefinition;
	}

	@Override
	public int method114(Class142 class142, byte i) {
		return aClass586_1209.method114(class142, (byte) 43);
	}

	@Override
	public int method97(VarDefinition varDefinition, int i) {
		return aClass586_1209.method97(varDefinition, -1860881523);
	}

	public int method1243(int i) {
		return this.aClass620Array1210[i].method7393(-400885008);
	}

	public int method1244(int i) {
		return this.aClass620Array1210[i].method7395((byte) -18);
	}

	public int method1245(int i) {
		return this.aClass620Array1210[i].method7390(-1085946275);
	}

	@Override
	public Class142 method81(VarDomainType varDomainType, int i) {
		if (varDomainType != VarDomainType.PLAYER_CONFIGS)
			return null;
		return ((Class142) this.aClass95_Sub1_Sub2_1207.method63(i, -699282745));
	}

	public int method1246(int i) {
		return this.aClass620Array1210[i].method7393(707370840);
	}

	@Override
	public int method110(Class142 class142) {
		return aClass586_1209.method114(class142, (byte) -7);
	}

	public int method1247(int i) {
		return this.aClass620Array1210[i].method7393(1999983568);
	}

	@Override
	public int method102(VarDefinition varDefinition) {
		return aClass586_1209.method97(varDefinition, -1860881523);
	}

	@Override
	public VarDefinition method84(int i) {
		VarDefinition varDefinition = ((VarDefinition) this.aClass5_Sub5_1208.method63(i, -1313705363));
		if (VarDomainType.PLAYER_CONFIGS != varDefinition.aClass142_3415.aClass445_1639)
			return null;
		return varDefinition;
	}

	@Override
	public int method472(int i) {
		return (this.aClass620Array1210[i]
				.method7403((client.aBool10966 ? Class660.aClass660_8449 : Class660.aClass660_8450), (byte) 1));
	}

	@Override
	public VarDefinition method78(int i) {
		VarDefinition varDefinition = ((VarDefinition) this.aClass5_Sub5_1208.method63(i, 885210929));
		if (VarDomainType.PLAYER_CONFIGS != varDefinition.aClass142_3415.aClass445_1639)
			return null;
		return varDefinition;
	}

	@Override
	public VarDefinition method83(int i) {
		VarDefinition varDefinition = ((VarDefinition) this.aClass5_Sub5_1208.method63(i, 989019243));
		if (VarDomainType.PLAYER_CONFIGS != varDefinition.aClass142_3415.aClass445_1639)
			return null;
		return varDefinition;
	}

	public PlayerVarsProvider(Class95_Sub1_Sub2 class95_sub1_sub2, Class5_Sub5 class5_sub5, int i) {
		this.aClass620Array1210 = new Class620[i];
		aClass586_1209 = new Class586();
		this.aClass95_Sub1_Sub2_1207 = class95_sub1_sub2;
		this.aClass5_Sub5_1208 = class5_sub5;
	}

	public int method1248(int i, int i_5_) {
		return this.aClass620Array1210[i].method7393(971599749);
	}

	@Override
	public Class142 method80(VarDomainType varDomainType, int i) {
		if (varDomainType != VarDomainType.PLAYER_CONFIGS)
			return null;
		return ((Class142) this.aClass95_Sub1_Sub2_1207.method63(i, 1187574472));
	}

	@Override
	public int method101(VarDefinition varDefinition) {
		return aClass586_1209.method97(varDefinition, -1860881523);
	}

	@Override
	public int method100(Class142 class142) {
		return aClass586_1209.method114(class142, (byte) 32);
	}

	@Override
	public int method103(VarDefinition varDefinition) {
		return aClass586_1209.method97(varDefinition, -1860881523);
	}

	@Override
	public int method470(int i) {
		return (this.aClass620Array1210[i]
				.method7403((client.aBool10966 ? Class660.aClass660_8449 : Class660.aClass660_8450), (byte) 1));
	}

	public int method1249(int i, int i_6_) {
		return this.aClass620Array1210[i].method7390(-1085946275);
	}

	static final void method1250(Class648 class648, byte i) {
		int i_7_ = (class648.anIntArray8394[(class648.anInt8395 -= 1239022665) * 717927929]);
		Class229 class229 = Class623_Sub1.method9755(i_7_, (byte) 25);
		Class226 class226 = Class380.aClass226Array3970[i_7_ >> 16];
		Class516_Sub1.method9258(class229, class226, class648, 1979268351);
	}

	static final void method1251(Class648 class648, int i) {
		class648.anInt8395 -= -1816921966;
		int i_8_ = (class648.anIntArray8394[717927929 * class648.anInt8395]);
		int i_9_ = (class648.anIntArray8394[717927929 * class648.anInt8395 + 1]);
		Class229 class229 = Class230.method3236(i_8_, i_9_, 96030929);
		Class7.method565(-1187426900);
		Class528_Sub29 class528_sub29 = client.method10201(class229);
		Class181_Sub1.method8397(class229, class528_sub29.method9474(-1202115560),
				-547002555 * class528_sub29.anInt10456, 689923714);
	}

	public static Class389 method1252(ByteBuffer class528_sub42, int i) {
		Class381 class381 = (Class577.method6896(1339646909)[class528_sub42.readUnsignedByte((byte) 101)]);
		Class377 class377 = (Class95.method1256((byte) 1)[class528_sub42.readUnsignedByte((byte) 68)]);
		int i_10_ = class528_sub42.method9642(26814864);
		int i_11_ = class528_sub42.method9642(-227622310);
		int i_12_ = class528_sub42.method9645((short) -9090);
		int i_13_ = class528_sub42.readInt(-19934162);
		int i_14_ = class528_sub42.readUnsignedByte((byte) 82);
		return new Class389(class381, class377, i_10_, i_11_, i_12_, i_13_, i_14_);
	}

	public static Class269 method1253(int i, int i_15_) {
		Class269[] class269s = Class305.method4052((byte) 14);
		for (int i_16_ = 0; i_16_ < class269s.length; i_16_++) {
			Class269 class269 = class269s[i_16_];
			if (i == class269.anInt2889 * 258290039)
				return class269;
		}
		return null;
	}

	static final void method1254(Class648 class648, int i) {
		class648.anIntArray8394[(class648.anInt8395 += 1239022665) * 717927929 - 1] = Class691_Sub32.aClass216_10805
				.method3018(-1393453599).size();
	}
}
