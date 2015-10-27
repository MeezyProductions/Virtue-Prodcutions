
/* Class553 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class Class553 implements Runnable {
	byte[] aByteArray7429;
	InputStream anInputStream7430;
	int anInt7431;
	Thread aThread7432;
	int anInt7433 = 0;
	IOException anIOException7434;
	int anInt7435 = 0;
	public static Class308 aClass308_7436;

	boolean method6718(int i, int i_0_) throws IOException {
		if (i <= 0 || i >= this.anInt7431 * 1491645999)
			throw new IOException();
		synchronized (this) {
			int i_1_;
			if (1157051265 * this.anInt7433 <= this.anInt7435 * -1099475661)
				i_1_ = (this.anInt7435 * -1099475661 - 1157051265 * this.anInt7433);
			else
				i_1_ = (this.anInt7431 * 1491645999 - 1157051265 * this.anInt7433 + this.anInt7435 * -1099475661);
			if (i_1_ < i) {
				if (null != this.anIOException7434)
					throw new IOException(this.anIOException7434.toString());
				this.notifyAll();
				boolean bool = false;
				return bool;
			}
			boolean bool = true;
			return bool;
		}
	}

	void method6719() {
		this.anInputStream7430 = new InputStream_Sub1();
	}

	int method6720() throws IOException {
		synchronized (this) {
			int i;
			if (1157051265 * this.anInt7433 <= -1099475661 * this.anInt7435)
				i = (-1099475661 * this.anInt7435 - 1157051265 * this.anInt7433);
			else
				i = (this.anInt7435 * -1099475661 + (1491645999 * this.anInt7431 - 1157051265 * this.anInt7433));
			if (null != this.anIOException7434)
				throw new IOException(this.anIOException7434.toString());
			this.notifyAll();
			int i_2_ = i;
			return i_2_;
		}
	}

	@Override
	public void run() {
		for (;;) {
			int i;
			synchronized (this) {
				for (;;) {
					if (null != this.anIOException7434)
						return;
					if (0 == this.anInt7433 * 1157051265)
						i = (this.anInt7431 * 1491645999 - -1099475661 * this.anInt7435 - 1);
					else if (this.anInt7433 * 1157051265 <= this.anInt7435 * -1099475661)
						i = (1491645999 * this.anInt7431 - this.anInt7435 * -1099475661);
					else
						i = (1157051265 * this.anInt7433 - -1099475661 * this.anInt7435 - 1);
					if (i > 0)
						break;
					try {
						this.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
			}
			int i_3_;
			try {
				i_3_ = (this.anInputStream7430.read(this.aByteArray7429, this.anInt7435 * -1099475661, i));
				if (i_3_ == -1)
					throw new EOFException();
			} catch (IOException ioexception) {
				synchronized (this) {
					this.anIOException7434 = ioexception;
					break;
				}
			}
			synchronized (this) {
				this.anInt7435 = (1508158971 * ((this.anInt7435 * -1099475661 + i_3_) % (1491645999 * this.anInt7431)));
			}
		}
	}

	int method6721(byte[] is, int i, int i_4_, int i_5_) throws IOException {
		if (i_4_ < 0 || i < 0 || i_4_ + i > is.length)
			throw new IOException();
		synchronized (this) {
			int i_6_;
			if (this.anInt7433 * 1157051265 <= this.anInt7435 * -1099475661)
				i_6_ = (this.anInt7435 * -1099475661 - this.anInt7433 * 1157051265);
			else
				i_6_ = (this.anInt7435 * -1099475661 + (1491645999 * this.anInt7431 - 1157051265 * this.anInt7433));
			if (i_4_ > i_6_)
				i_4_ = i_6_;
			if (0 == i_4_ && this.anIOException7434 != null)
				throw new IOException(this.anIOException7434.toString());
			if (i_4_ + this.anInt7433 * 1157051265 <= this.anInt7431 * 1491645999)
				System.arraycopy(this.aByteArray7429, 1157051265 * this.anInt7433, is, i, i_4_);
			else {
				int i_7_ = (1491645999 * this.anInt7431 - 1157051265 * this.anInt7433);
				System.arraycopy(this.aByteArray7429, 1157051265 * this.anInt7433, is, i, i_7_);
				System.arraycopy(this.aByteArray7429, 0, is, i_7_ + i, i_4_ - i_7_);
			}
			this.anInt7433 = 1736772737 * ((i_4_ + this.anInt7433 * 1157051265) % (1491645999 * this.anInt7431));
			this.notifyAll();
			int i_8_ = i_4_;
			return i_8_;
		}
	}

	void method6722(int i) {
		synchronized (this) {
			if (this.anIOException7434 == null)
				this.anIOException7434 = new IOException("");
			this.notifyAll();
		}
		try {
			this.aThread7432.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	void method6723(byte i) {
		this.anInputStream7430 = new InputStream_Sub1();
	}

	public void method6724() {
		for (;;) {
			int i;
			synchronized (this) {
				for (;;) {
					if (null != this.anIOException7434)
						return;
					if (0 == this.anInt7433 * 1157051265)
						i = (this.anInt7431 * 1491645999 - -1099475661 * this.anInt7435 - 1);
					else if (this.anInt7433 * 1157051265 <= this.anInt7435 * -1099475661)
						i = (1491645999 * this.anInt7431 - this.anInt7435 * -1099475661);
					else
						i = (1157051265 * this.anInt7433 - -1099475661 * this.anInt7435 - 1);
					if (i > 0)
						break;
					try {
						this.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
			}
			int i_9_;
			try {
				i_9_ = (this.anInputStream7430.read(this.aByteArray7429, this.anInt7435 * -1099475661, i));
				if (i_9_ == -1)
					throw new EOFException();
			} catch (IOException ioexception) {
				synchronized (this) {
					this.anIOException7434 = ioexception;
					break;
				}
			}
			synchronized (this) {
				this.anInt7435 = (1508158971 * ((this.anInt7435 * -1099475661 + i_9_) % (1491645999 * this.anInt7431)));
			}
		}
	}

	boolean method6725(int i) throws IOException {
		if (i <= 0 || i >= this.anInt7431 * 1491645999)
			throw new IOException();
		synchronized (this) {
			int i_10_;
			if (1157051265 * this.anInt7433 <= this.anInt7435 * -1099475661)
				i_10_ = (this.anInt7435 * -1099475661 - 1157051265 * this.anInt7433);
			else
				i_10_ = (this.anInt7431 * 1491645999 - 1157051265 * this.anInt7433 + this.anInt7435 * -1099475661);
			if (i_10_ < i) {
				if (null != this.anIOException7434)
					throw new IOException(this.anIOException7434.toString());
				this.notifyAll();
				boolean bool = false;
				return bool;
			}
			boolean bool = true;
			return bool;
		}
	}

	Class553(InputStream inputstream, int i) {
		this.anInputStream7430 = inputstream;
		this.anInt7431 = -671461169 * (i + 1);
		this.aByteArray7429 = new byte[this.anInt7431 * 1491645999];
		this.aThread7432 = new Thread(this);
		this.aThread7432.setDaemon(true);
		this.aThread7432.start();
	}

	void method6726() {
		synchronized (this) {
			if (this.anIOException7434 == null)
				this.anIOException7434 = new IOException("");
			this.notifyAll();
		}
		try {
			this.aThread7432.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	int method6727() throws IOException {
		synchronized (this) {
			int i;
			if (1157051265 * this.anInt7433 <= -1099475661 * this.anInt7435)
				i = (-1099475661 * this.anInt7435 - 1157051265 * this.anInt7433);
			else
				i = (this.anInt7435 * -1099475661 + (1491645999 * this.anInt7431 - 1157051265 * this.anInt7433));
			if (null != this.anIOException7434)
				throw new IOException(this.anIOException7434.toString());
			this.notifyAll();
			int i_11_ = i;
			return i_11_;
		}
	}

	int method6728(byte i) throws IOException {
		synchronized (this) {
			int i_12_;
			if (1157051265 * this.anInt7433 <= -1099475661 * this.anInt7435)
				i_12_ = (-1099475661 * this.anInt7435 - 1157051265 * this.anInt7433);
			else
				i_12_ = (this.anInt7435 * -1099475661 + (1491645999 * this.anInt7431 - 1157051265 * this.anInt7433));
			if (null != this.anIOException7434)
				throw new IOException(this.anIOException7434.toString());
			this.notifyAll();
			int i_13_ = i_12_;
			return i_13_;
		}
	}

	void method6729() {
		this.anInputStream7430 = new InputStream_Sub1();
	}

	static final void method6730(Class648 class648, byte i) {
		int i_14_ = (class648.anIntArray8394[(class648.anInt8395 -= 1239022665) * 717927929]);
		class648.anIntArray8394[(class648.anInt8395 += 1239022665) * 717927929 - 1] = Class691_Sub32.aClass216_10805
				.method3028(i_14_, -1640429116).method2991(-855860302).method68();
	}

	static final void method6731(Class648 class648, int i) {
		class648.anIntArray8394[(class648.anInt8395 += 1239022665) * 717927929 - 1] = Class375.method4688(1670899009)
				.method68();
	}

	static final void method6732(Class648 class648, byte i) {
		class648.anInt8410 -= -1094513834;
		String string = (String) (class648.anObjectArray8396[class648.anInt8410 * -520794877]);
		String string_15_ = (String) (class648.anObjectArray8396[class648.anInt8410 * -520794877 + 1]);
		Class265.method3667(string, string_15_, (byte) 32);
	}

	public static final int method6733(String string, int i) {
		if (string == null)
			return -1;
		for (int i_16_ = 0; i_16_ < client.anInt11157 * -1314218023; i_16_++) {
			if (string.equalsIgnoreCase(client.aClass62Array11160[i_16_].aString720))
				return i_16_;
		}
		return -1;
	}

	static void decodeLocation(BitBuffer buf, int i, int i_17_) {
		Class578 class578 = client.gameScene.method5966(1273279609);
		boolean bool = buf.readBits(1, (byte) -26) == 1;
		if (bool)
			GPI.anIntArray1206[(GPI.maskCount += 781549791) * -2062664929 - 1] = i;
		int i_18_ = buf.readBits(2, (byte) -84);
		Player player = client.localPlayers[i];
		if (0 == i_18_) {
			if (!bool) {
				if (-1453744879 * client.anInt11025 == i)
					throw new RuntimeException();
				Class48 class48 = GPI.aClass48Array1204[i] = new Class48();
				Class666.method7904(-291195383);
				class48.anInt545 = (((player.sceneXQueue[0] + 961465569 * class578.anInt7607) >> 6 << 14)
						+ (player.aByte10675 << 28) + ((-173815201 * class578.anInt7608 + player.sceneYQueue[0]) >> 6))
						* 1856682187;
				if (-1 != player.facingDirection * 1063002723)
					class48.anInt542 = -819689689 * player.facingDirection;
				else
					class48.anInt542 = player.aClass37_11809.method795(-1776266371) * 1660060013;
				class48.anInt544 = player.anInt11780 * -1414292471;
				class48.aClass213_543 = player.aClass213_12066;
				class48.aBool546 = player.inClan;
				if (player.anInt12050 * -645857965 > 0)
					Class427.method5149(player, 1607711012);
				client.localPlayers[i] = null;
				if (buf.readBits(1, (byte) -90) != 0)
					Class61.decodeRegionHash(buf, i, -39854434);
			}
		} else if (1 == i_18_) {
			int i_19_ = buf.readBits(3, (byte) -109);
			int i_20_ = buf.readBits(1, (byte) -4);
			int i_21_ = player.sceneXQueue[0];
			int i_22_ = player.sceneYQueue[0];
			if (1 == i_20_) {
				int i_23_ = buf.readBits(2, (byte) -108);
				switch (i_23_) {
				case 2:
					player.method10922(1 + i_21_, i_22_, (GPI.aByteArray1194[i]), 1801565078);
					break;
				case 0:
					player.method10922(i_21_, 1 + i_22_, (GPI.aByteArray1194[i]), 205235963);
					break;
				case 1:
					player.method10922(i_21_ - 1, i_22_, (GPI.aByteArray1194[i]), 1868990126);
					break;
				case 3:
					player.method10922(i_21_, i_22_ - 1, (GPI.aByteArray1194[i]), -2087930875);
					break;
				}
			}
			if (0 == i_19_) {
				i_21_--;
				i_22_--;
			} else if (i_19_ == 1)
				i_22_--;
			else if (2 == i_19_) {
				i_21_++;
				i_22_--;
			} else if (i_19_ == 3)
				i_21_--;
			else if (4 == i_19_)
				i_21_++;
			else if (5 == i_19_) {
				i_21_--;
				i_22_++;
			} else if (i_19_ == 6)
				i_22_++;
			else if (i_19_ == 7) {
				i_21_++;
				i_22_++;
			}
			player.method10922(i_21_, i_22_, GPI.aByteArray1194[i], -938917351);
		} else if (i_18_ == 2) {
			int i_24_ = buf.readBits(4, (byte) -63);
			int i_25_ = player.sceneXQueue[0];
			int i_26_ = player.sceneYQueue[0];
			if (0 == i_24_) {
				i_25_ -= 2;
				i_26_ -= 2;
			} else if (1 == i_24_) {
				i_25_--;
				i_26_ -= 2;
			} else if (i_24_ == 2)
				i_26_ -= 2;
			else if (3 == i_24_) {
				i_25_++;
				i_26_ -= 2;
			} else if (i_24_ == 4) {
				i_25_ += 2;
				i_26_ -= 2;
			} else if (i_24_ == 5) {
				i_25_ -= 2;
				i_26_--;
			} else if (i_24_ == 6) {
				i_25_ += 2;
				i_26_--;
			} else if (7 == i_24_)
				i_25_ -= 2;
			else if (i_24_ == 8)
				i_25_ += 2;
			else if (i_24_ == 9) {
				i_25_ -= 2;
				i_26_++;
			} else if (10 == i_24_) {
				i_25_ += 2;
				i_26_++;
			} else if (11 == i_24_) {
				i_25_ -= 2;
				i_26_ += 2;
			} else if (12 == i_24_) {
				i_25_--;
				i_26_ += 2;
			} else if (13 == i_24_)
				i_26_ += 2;
			else if (14 == i_24_) {
				i_25_++;
				i_26_ += 2;
			} else if (i_24_ == 15) {
				i_25_ += 2;
				i_26_ += 2;
			}
			player.method10922(i_25_, i_26_, GPI.aByteArray1194[i], -1360548762);
		} else {
			int i_27_ = buf.readBits(1, (byte) -97);
			if (0 == i_27_) {
				int i_28_ = buf.readBits(15, (byte) -112);
				int i_29_ = i_28_ >> 12 & 0x7;
				int i_30_ = (byte) (i_28_ >> 10) & 0x3;
				int i_31_ = i_28_ >> 5 & 0x1f;
				if (i_31_ > 15)
					i_31_ -= 32;
				int i_32_ = i_28_ & 0x1f;
				if (i_32_ > 15)
					i_32_ -= 32;
				int i_33_ = i_31_ + player.sceneXQueue[0];
				int i_34_ = i_32_ + player.sceneYQueue[0];
				if (2076868623 * Class666.aClass666_8480.anInt8483 == i_29_)
					player.setPosition(i_33_, i_34_, 563005846);
				else {
					GPI.aByteArray1194[i] = (byte) (i_29_ - 1);
					player.method10922(i_33_, i_34_, (GPI.aByteArray1194[i]), 1549287964);
				}
				player.aByte10675 = player.aByte10674 = (byte) (player.aByte10675 + i_30_ & 0x3);
				if (client.gameScene.method6006((byte) 0).method5633(i_33_, i_34_, (short) -2423))
					player.aByte10674++;
				if (-1453744879 * client.anInt11025 == i && (player.aByte10675 != 1926870089 * Class181_Sub5.anInt9778))
					Class181_Sub5.anInt9778 = (-1552384519 * player.aByte10675);
			} else {
				int i_35_ = buf.readBits(3, (byte) -45);
				int i_36_ = buf.readBits(30, (byte) -103);
				int i_37_ = i_36_ >> 28 & 0x3;
				int i_38_ = i_36_ >> 14 & 0x3fff;
				int i_39_ = i_36_ & 0x3fff;
				int i_40_ = (i_38_ + (player.sceneXQueue[0] + class578.anInt7607 * 961465569) & 0x3fff)
						- class578.anInt7607 * 961465569;
				int i_41_ = ((i_39_ + (class578.anInt7608 * -173815201 + (player.sceneYQueue[0])) & 0x3fff)
						- class578.anInt7608 * -173815201);
				if (Class666.aClass666_8480.anInt8483 * 2076868623 == i_35_)
					player.setPosition(i_40_, i_41_, -1046143054);
				else {
					GPI.aByteArray1194[i] = (byte) (i_35_ - 1);
					player.method10922(i_40_, i_41_, (GPI.aByteArray1194[i]), 1469124776);
				}
				player.aByte10675 = player.aByte10674 = (byte) (player.aByte10675 + i_37_ & 0x3);
				if (client.gameScene.method6006((byte) 0).method5633(i_40_, i_41_, (short) -3402))
					player.aByte10674++;
				if (-1453744879 * client.anInt11025 == i)
					Class181_Sub5.anInt9778 = (-1552384519 * player.aByte10675);
			}
		}
	}
}
