
/* VarDomainType - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.DataInputStream;
import java.net.URL;

public class VarDomainType implements IClientEnum {
	public static int anInt4917;
	public static VarDomainType CLAN_CONFIGS;
	public static VarDomainType CLIENT_CONFIGS;
	static VarDomainType WORLD_CONFIGS;
	static VarDomainType REGION_CONFIGS;
	static VarDomainType OBJECT_CONFIGS;
	int groupID;
	public static VarDomainType CLAN_SETTING;
	static VarDomainType aClass445_4925;
	public static VarDomainType PLAYER_CONFIGS = new Class445_Sub5(SharedConfigsType.configsPlayer, 0, true, true);
	static VarDomainType aClass445_4927;
	SharedConfigsType configType;
	public static VarDomainType NPC_CONFIGS = new Class445_Sub3(SharedConfigsType.configsNpc, 1, false, true);
	public static VarDomainType aClass445_4930;
	static int anInt4931;
	static int anInt4932;

	VarDomainType(SharedConfigsType type, int i, boolean bool, boolean bool_0_) {
		this.configType = type;
		this.groupID = 285205617 * i;
	}

	public static VarDomainType[] method5330(int i) {
		return new VarDomainType[] { NPC_CONFIGS, aClass445_4925, CLAN_SETTING, WORLD_CONFIGS, aClass445_4927,
				REGION_CONFIGS, aClass445_4930, CLAN_CONFIGS, CLIENT_CONFIGS, OBJECT_CONFIGS, PLAYER_CONFIGS };
	}

	@Override
	public int method68() {
		return this.groupID * 937909393;
	}

	public Object method5331(Class142 class142, int i) {
		if (class142.aBool1640)
			return method5332(class142, 1381851056);
		return class142.aClass459_1638.method5565((byte) 4);
	}

	Object method5332(Class142 class142, int i) {
		return class142.aClass459_1638.method5565((byte) -21);
	}

	static {
		CLIENT_CONFIGS = new Class445_Sub4(SharedConfigsType.configsClient, 2, true, true);
		WORLD_CONFIGS = new Class445_Sub1(SharedConfigsType.configsWorld, 3, false, false);
		REGION_CONFIGS = new VarDomainType(SharedConfigsType.aClass644_8367, 4, false, false);
		OBJECT_CONFIGS = new VarDomainType(SharedConfigsType.aClass644_8371, 5, true, false);
		CLAN_CONFIGS = new VarDomainType(SharedConfigsType.aClass644_8357, 6, true, true);
		CLAN_SETTING = new VarDomainType(SharedConfigsType.aClass644_8350, 7, true, false);
		aClass445_4925 = new Class445_Sub2(SharedConfigsType.aClass644_8356, 8, false, false);
		aClass445_4930 = new VarDomainType(SharedConfigsType.aClass644_8307, 9, false, true);
		aClass445_4927 = new VarDomainType(SharedConfigsType.aClass644_8340, 10, false, false);
	}

	public Object method5333(Class142 class142) {
		if (class142.aBool1640)
			return method5332(class142, -1169564369);
		return class142.aClass459_1638.method5565((byte) -68);
	}

	public final SharedConfigsType method5334(byte i) {
		return this.configType;
	}

	Object method5335(Class142 class142) {
		return class142.aClass459_1638.method5565((byte) -25);
	}

	static final void method5336(Class648 class648, int i) {
		class648.anInt8395 -= -1816921966;
		Class528_Sub21_Sub2 class528_sub21_sub2 = ((Class528_Sub21_Sub2) (Class445_Sub1.aClass5_Sub21_10125
				.method63((class648.anIntArray8394[717927929 * class648.anInt8395]), 50062986)));
		int i_2_ = (class648.anIntArray8394[1 + class648.anInt8395 * 717927929]);
		int i_3_ = -1;
		for (int i_4_ = 0; i_4_ < 2101399067 * class528_sub21_sub2.anInt11201; i_4_++) {
			if (i_2_ == class528_sub21_sub2.anIntArray11202[i_4_]) {
				i_3_ = class528_sub21_sub2.anIntArray11203[i_4_];
				break;
			}
		}
		class648.anIntArray8394[(class648.anInt8395 += 1239022665) * 717927929 - 1] = i_3_;
	}

	static final void method5337(Class648 class648, int i) {
		class648.anInt8395 -= -1816921966;
		int i_5_ = (class648.anIntArray8394[class648.anInt8395 * 717927929]);
		int i_6_ = (class648.anIntArray8394[class648.anInt8395 * 717927929 + 1]);
		class648.anIntArray8394[(class648.anInt8395 += 1239022665) * 717927929 - 1] = i_5_ / i_6_;
	}

	static final void method5338(Class648 class648, int i) {
		int i_7_ = (class648.anIntArray8394[(class648.anInt8395 -= 1239022665) * 717927929]);
		Class454.method5496(i_7_ >> 14 & 0x3fff, i_7_ & 0x3fff, -1257480855);
	}

	static final void method5339(Class648 class648, int i) {
		int i_8_ = (class648.anIntArray8394[(class648.anInt8395 -= 1239022665) * 717927929]);
		if (-1 != i_8_) {
			int i_9_ = i_8_ >> 14 & 0x3fff;
			int i_10_ = i_8_ & 0x3fff;
			Class578 class578 = client.gameScene.method5966(1273279609);
			i_9_ -= class578.anInt7607 * 961465569;
			if (i_9_ < 0)
				i_9_ = 0;
			else if (i_9_ >= client.gameScene.method6029((short) 21569))
				i_9_ = client.gameScene.method6029((short) 11641);
			i_10_ -= class578.anInt7608 * -173815201;
			if (i_10_ < 0)
				i_10_ = 0;
			else if (i_10_ >= client.gameScene.method5967(1136868875))
				i_10_ = client.gameScene.method5967(1153746770);
			Class690_Sub2.anInt10780 = (256 + (i_9_ << 9)) * -1603116895;
			Class386.anInt4069 = -1476949137 * ((i_10_ << 9) + 256);
		} else {
			Class690_Sub2.anInt10780 = 1603116895;
			Class386.anInt4069 = 1476949137;
		}
	}

	public static void method5340(String string, Throwable throwable, int i) {
		try {
			String string_11_ = "";
			if (null != throwable)
				string_11_ = Class398.method4828(throwable, -1297036018);
			if (string != null) {
				if (null != throwable)
					string_11_ = new StringBuilder().append(string_11_).append(" | ").toString();
				string_11_ = new StringBuilder().append(string_11_).append(string).toString();
			}
			Class471.method5816(string_11_, -274508396);
			string_11_ = Class388.method4768(string_11_, (short) -13805);
			URL url = null;
			if (RuntimeException_Sub4.anApplet11933 != null)
				url = RuntimeException_Sub4.anApplet11933.getCodeBase();
			else if (RuntimeException_Sub4.anInterface59_11932 != null)
				url = RuntimeException_Sub4.anInterface59_11932.method383((short) -15565);
			if (url != null) {
				String string_12_ = "Unknown";
				String string_13_ = "1.1";
				try {
					string_12_ = System.getProperty("java.vendor");
					string_13_ = System.getProperty("java.version");
				} catch (Exception exception) {
					/* empty */
				}
				URL url_14_ = new URL(url, new StringBuilder().append("clienterror.ws?c=")
						.append(1124206383 * RuntimeException_Sub4.anInt11930).append("&cs=")
						.append(Class387.anInt4073 * 661198895).append("&u=")
						.append(null != RuntimeException_Sub4.aString11931
								? Class388.method4768((RuntimeException_Sub4.aString11931), (short) -14999)
								: new StringBuilder().append("")
										.append(-471984607428222023L * RuntimeException_Sub4.aLong11935).toString())
						.append("&v1=").append(Class388.method4768(string_12_, (short) -18064)).append("&v2=")
						.append(Class388.method4768(string_13_, (short) 13484)).append("&e=").append(string_11_)
						.toString());
				DataInputStream datainputstream = new DataInputStream(url_14_.openStream());
				datainputstream.read();
				datainputstream.close();
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
}
