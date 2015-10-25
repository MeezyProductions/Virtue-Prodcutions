
/* Class41 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

class Class41 implements Iterator {
	Class5 this$0;
	int anInt523;

	public void method822() {
		throw new UnsupportedOperationException();
	}

	public boolean method823() {
		return (this.anInt523 * 1610264485 < this.this$0.anInt116 * -1906415229);
	}

	@Override
	public Object next() {
		int i = (this.anInt523 += 1040752685) * 1610264485 - 1;
		synchronized (this.this$0.aClass186_119) {
			Definition definition = (Definition) this.this$0.aClass186_119.method2727(i);
			if (null != definition) {
				Definition interface10_0_ = definition;
				return interface10_0_;
			}
		}
		return this.this$0.method535(i, (byte) 7);
	}

	@Override
	public boolean hasNext() {
		return (this.anInt523 * 1610264485 < this.this$0.anInt116 * -1906415229);
	}

	public Object method824() {
		int i = (this.anInt523 += 1040752685) * 1610264485 - 1;
		synchronized (this.this$0.aClass186_119) {
			Definition definition = (Definition) this.this$0.aClass186_119.method2727(i);
			if (null != definition) {
				Definition interface10_1_ = definition;
				return interface10_1_;
			}
		}
		return this.this$0.method535(i, (byte) 5);
	}

	Class41(Class5 class5) {
		this.this$0 = class5;
	}

	public void method825() {
		throw new UnsupportedOperationException();
	}

	public boolean method826() {
		return (this.anInt523 * 1610264485 < this.this$0.anInt116 * -1906415229);
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

	static void modelOnIComponent(int i, int i_2_, int i_3_, int i_4_, int i_5_) {
		ClientPacket packet = Class79.method1146(4, i);
		packet.method10496(1215772406);
		packet.anInt11543 = 1959780981 * i_2_;
		packet.anInt11544 = i_3_ * 23247007;
		packet.anInt11554 = -1646078671 * i_4_;
	}
}
