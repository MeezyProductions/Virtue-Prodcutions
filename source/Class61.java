
/* Class61 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.net.InetAddress;
import java.net.UnknownHostException;

import jaclib.ping.Ping;

public class Class61 implements Runnable {
	volatile long aLong709 = -4812038640984627409L;
	InetAddress anInetAddress710;
	String aString711;
	volatile boolean aBool712 = true;

	long method1004(int i) {
		return this.aLong709 * -570532407175823311L;
	}

	void method1005(String string, short i) {
		this.aString711 = string;
		this.anInetAddress710 = null;
		this.aLong709 = -4812038640984627409L;
		if (null != this.aString711) {
			try {
				this.anInetAddress710 = InetAddress.getByName(this.aString711);
			} catch (UnknownHostException unknownhostexception) {
				/* empty */
			}
		}
	}

	void method1006() {
		if (this.anInetAddress710 != null) {
			try {
				byte[] is = this.anInetAddress710.getAddress();
				this.aLong709 = Ping.method593(is[0], is[1], is[2], is[3], 10000L) * 4812038640984627409L;
			} catch (Throwable throwable) {
				/* empty */
			}
		}
		Class511_Sub1.method9241(1000L);
	}

	void method1007(String string) {
		this.aString711 = string;
		this.anInetAddress710 = null;
		this.aLong709 = -4812038640984627409L;
		if (null != this.aString711) {
			try {
				this.anInetAddress710 = InetAddress.getByName(this.aString711);
			} catch (UnknownHostException unknownhostexception) {
				/* empty */
			}
		}
	}

	@Override
	public void run() {
		while (this.aBool712)
			method1008(-484656860);
	}

	void method1008(int i) {
		if (this.anInetAddress710 != null) {
			try {
				byte[] is = this.anInetAddress710.getAddress();
				this.aLong709 = Ping.method593(is[0], is[1], is[2], is[3], 10000L) * 4812038640984627409L;
			} catch (Throwable throwable) {
				/* empty */
			}
		}
		Class511_Sub1.method9241(1000L);
	}

	long method1009() {
		return this.aLong709 * -570532407175823311L;
	}

	long method1010() {
		return this.aLong709 * -570532407175823311L;
	}

	Class61() {
		/* empty */
	}

	void method1011() {
		this.aBool712 = false;
	}

	public void method1012() {
		while (this.aBool712)
			method1008(-19853573);
	}

	void method1013() {
		if (this.anInetAddress710 != null) {
			try {
				byte[] is = this.anInetAddress710.getAddress();
				this.aLong709 = Ping.method593(is[0], is[1], is[2], is[3], 10000L) * 4812038640984627409L;
			} catch (Throwable throwable) {
				/* empty */
			}
		}
		Class511_Sub1.method9241(1000L);
	}

	void method1014(byte i) {
		this.aBool712 = false;
	}

	static void method1015(Class173 class173, byte i) {
		if ((-1024340783 * Class28.anInt303 >= 2 || client.aBool10899) && null == client.aClass229_11067) {
			String string;
			if (client.aBool10899 && Class28.anInt303 * -1024340783 < 2)
				string = new StringBuilder().append(client.aString10902)
						.append(Class39.aClass39_481.method807((Class378_Sub2.aClass668_10123), (byte) 102))
						.append(client.aString11175).append(" ").append(Class49.aString553).toString();
			else if (Class12.method623((byte) 10) && Class28.anInt303 * -1024340783 > 2)
				string = Class511_Sub6.method9344((Class28.aClass528_Sub21_Sub11_271), (byte) -87);
			else {
				Class528_Sub21_Sub11 class528_sub21_sub11 = Class28.aClass528_Sub21_Sub11_271;
				if (class528_sub21_sub11 == null)
					return;
				string = Class511_Sub6.method9344(class528_sub21_sub11, (byte) -118);
				int[] is = Class62.method1022(class528_sub21_sub11, (byte) 58);
				if (null != is)
					string = new StringBuilder().append(string).append(Class262.method3645(is, (byte) 52)).toString();
			}
			if (-1024340783 * Class28.anInt303 > 2)
				string = new StringBuilder().append(string).append(Class666.method7905(16777215, (short) -28750))
						.append(" / ").append(-1024340783 * Class28.anInt303 - 2)
						.append(Class39.aClass39_473.method807((Class378_Sub2.aClass668_10123), (byte) 102)).toString();
			if (null != Class28.aClass229_280) {
				Class172 class172 = Class28.aClass229_280.method3192(Class625.aClass414_8129,
						(client.anInterface50_10917), 939946995);
				if (class172 == null)
					class172 = Class176.aClass172_2027;
				class172.method2127(string, -2023083031 * Class28.anInt281, 2099386953 * Class28.anInt282,
						-1352480433 * Class28.aClass229_280.anInt2476, 1661025435 * Class28.aClass229_280.anInt2458,
						-696699221 * Class28.aClass229_280.anInt2404, Class28.aClass229_280.anInt2413 * -1357003215,
						Class28.aClass229_280.anInt2543 * 339120349, Class28.aClass229_280.anInt2459 * -463395969,
						client.aRandom10970, Class464.anInt5305, client.anIntArray11120, Class298.aClass151Array3262,
						null, -1488433549);
				Class171.method2117(client.anIntArray11120[0], client.anIntArray11120[1], client.anIntArray11120[2],
						client.anIntArray11120[3], (byte) -54);
			}
		}
	}

	static boolean decodeRegionHash(BitBuffer buffer, int i, int i_0_) {
		int i_1_ = buffer.readBits(2, (byte) -25);
		if (0 == i_1_) {
			if (buffer.readBits(1, (byte) -118) != 0)
				decodeRegionHash(buffer, i, -383890694);
			int i_2_ = buffer.readBits(6, (byte) -47);
			int i_3_ = buffer.readBits(6, (byte) -103);
			boolean bool = buffer.readBits(1, (byte) -84) == 1;
			if (bool)
				GPI.anIntArray1206[(GPI.maskCount += 781549791) * -2062664929 - 1] = i;
			if (client.localPlayers[i] != null)
				throw new RuntimeException();
			Class48 class48 = GPI.aClass48Array1204[i];
			Player player = (client.localPlayers[i] = (new Player(client.aClass495_10935.method5973((byte) 110))));
			player.anInt11783 = 1791366607 * i;
			if (null != GPI.cachedAppearances[i])
				player.decodeCharacterData(GPI.cachedAppearances[i], -193937637);
			if (GPI.cachedHeadIcons[i] != null)
				player.decodeHeadIcons(GPI.cachedHeadIcons[i], (byte) -13);
			player.method10663((class48.anInt542) * -1279741851, true, -2127058421);
			player.anInt11780 = 929346105 * class48.anInt544;
			int i_4_ = class48.anInt545 * -211161885;
			int i_5_ = i_4_ >> 28;
			int i_6_ = i_4_ >> 14 & 0xff;
			int i_7_ = i_4_ & 0xff;
			Class578 class578 = client.aClass495_10935.method5966(1273279609);
			int i_8_ = (i_6_ << 6) + i_2_ - 961465569 * class578.anInt7607;
			int i_9_ = (i_7_ << 6) + i_3_ - class578.anInt7608 * -173815201;
			player.aClass213_12066 = class48.aClass213_543;
			player.inClan = class48.aBool546;
			player.moveTypeQueue[0] = GPI.aByteArray1194[i];
			player.aByte10675 = player.aByte10674 = (byte) i_5_;
			if (client.aClass495_10935.method6006((byte) 0).method5633(i_8_, i_9_, (short) -14927))
				player.aByte10674++;
			player.setPosition(i_8_, i_9_, 1684540037);
			GPI.aClass48Array1204[i] = null;
			return true;
		}
		if (i_1_ == 1) {
			int i_10_ = buffer.readBits(2, (byte) -114);
			int i_11_ = (GPI.aClass48Array1204[i].anInt545 * -211161885);
			GPI.aClass48Array1204[i].anInt545 = (((i_10_ + (i_11_ >> 28) & 0x3) << 28) + (i_11_ & 0xfffffff))
					* 1856682187;
			return false;
		}
		if (i_1_ == 2) {
			int i_12_ = buffer.readBits(5, (byte) -73);
			int i_13_ = i_12_ >> 3 & 0x3;
			int i_14_ = i_12_ & 0x7;
			int i_15_ = (GPI.aClass48Array1204[i].anInt545 * -211161885);
			if (!GPI.$assertionsDisabled && (GPI.aByteArray1194[i] < 0 || GPI.aByteArray1194[i] > 3))
				throw new AssertionError();
			int i_16_ = (i_15_ >> 28) + i_13_ & 0x3;
			int i_17_ = i_15_ >> 14 & 0xff;
			int i_18_ = i_15_ & 0xff;
			if (i_14_ == 0) {
				i_17_--;
				i_18_--;
			}
			if (1 == i_14_)
				i_18_--;
			if (i_14_ == 2) {
				i_17_++;
				i_18_--;
			}
			if (i_14_ == 3)
				i_17_--;
			if (i_14_ == 4)
				i_17_++;
			if (5 == i_14_) {
				i_17_--;
				i_18_++;
			}
			if (6 == i_14_)
				i_18_++;
			if (i_14_ == 7) {
				i_17_++;
				i_18_++;
			}
			Class443.method5321(Class666.method7904(-182186036), GPI.aByteArray1194[i], 2048898825);
			GPI.aClass48Array1204[i].anInt545 = (i_18_ + ((i_17_ << 14) + (i_16_ << 28))) * 1856682187;
			return false;
		}
		int i_19_ = buffer.readBits(20, (byte) -103);
		int i_20_ = i_19_ >> 18 & 0x3;
		int i_21_ = i_19_ >> 16 & 0x3;
		int i_22_ = i_19_ >> 8 & 0xff;
		int i_23_ = i_19_ & 0xff;
		int i_24_ = GPI.aClass48Array1204[i].anInt545 * -211161885;
		GPI.aByteArray1194[i] = (byte) (i_20_ - 1);
		if (!GPI.$assertionsDisabled && (GPI.aByteArray1194[i] < 0 || GPI.aByteArray1194[i] > 3))
			throw new AssertionError();
		int i_25_ = (i_24_ >> 28) + i_21_ & 0x3;
		int i_26_ = (i_24_ >> 14) + i_22_ & 0xff;
		int i_27_ = i_23_ + i_24_ & 0xff;
		Class443.method5321(Class666.method7904(-1693209053), i_20_ - 1, 1717631495);
		GPI.aClass48Array1204[i].anInt545 = ((i_26_ << 14) + (i_25_ << 28) + i_27_) * 1856682187;
		return false;
	}

	static final void method1017(Class648 class648, int i) {
		int i_28_ = (class648.anIntArray8394[(class648.anInt8395 -= 1239022665) * 717927929]);
		Class229 class229 = Class623_Sub1.method9755(i_28_, (byte) -106);
		Class226 class226 = Class380.aClass226Array3970[i_28_ >> 16];
		Class201.method2859(class229, class226, class648, 969919383);
	}

	static final void method1018(Class648 class648, int i) {
		int i_29_ = (class648.anIntArray8394[(class648.anInt8395 -= 1239022665) * 717927929]);
		Class229 class229 = Class623_Sub1.method9755(i_29_, (byte) 52);
		Class226 class226 = Class380.aClass226Array3970[i_29_ >> 16];
		Class619.method7385(class229, class226, class648, (byte) 6);
	}

	static final void method1019(Class229 class229, Class226 class226, Class648 class648, int i) {
		String string = (String) (class648.anObjectArray8396[(class648.anInt8410 -= 1600226731) * -520794877]);
		if (Class494.method5957(string, class648, (short) 520) != null)
			string = string.substring(0, string.length() - 1);
		class229.anObjectArray2523 = Class181_Sub23.method8999(string, class648, (byte) -28);
		class229.aBool2483 = true;
	}

	static final void method1020(Class229 class229, Class226 class226, Class648 class648, int i) {
		String string = (String) (class648.anObjectArray8396[(class648.anInt8410 -= 1600226731) * -520794877]);
		int[] is = Class494.method5957(string, class648, (short) 520);
		if (is != null)
			string = string.substring(0, string.length() - 1);
		class229.anObjectArray2546 = Class181_Sub23.method8999(string, class648, (byte) -34);
		class229.anIntArray2463 = is;
		class229.aBool2483 = true;
	}
}
