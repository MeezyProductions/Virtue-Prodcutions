/* Class645 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class645 {

	protected boolean aBool8373;
	Class437 aClass437_8374;
	Class437 aClass437_8375;
	boolean aBool8376;
	boolean aBool8377;
	Class433 aClass433_8378;
	Class437 aClass437_8379 = new Class437();
	boolean aBool8380;
	Class645 aClass645_8381;
	Class645 aClass645_8382;
	Class645 aClass645_8383;

	public final void method7682(float f, float f_0_, float f_1_) {
		this.aClass437_8379.aClass422_4868.method5057(f, f_0_, f_1_);
		method7690();
		if (this.aClass645_8382 != null)
			this.aClass645_8382.method7691();
	}

	public final Class437 method7683() {
		return this.aClass437_8379;
	}

	final Class437 method7684() {
		if (this.aBool8380) {
			this.aBool8380 = false;
			this.aClass437_8375.method5287(method7693());
			this.aClass437_8375.method5288();
		}
		return this.aClass437_8374;
	}

	final Class433 method7685() {
		if (this.aBool8377) {
			this.aBool8377 = false;
			this.aClass433_8378.method5242(method7693());
		}
		return this.aClass433_8378;
	}

	final void method7686(Class437 class437) {
		this.aClass437_8379.method5287(class437);
		method7690();
		if (this.aClass645_8382 != null)
			this.aClass645_8382.method7691();
	}

	public final void method7687(Class430 class430) {
		this.aClass437_8379.aClass430_4869.method5187(class430);
		method7690();
		if (this.aClass645_8382 != null)
			this.aClass645_8382.method7691();
	}

	public final void method7688(Class422 class422) {
		this.aClass437_8379.aClass422_4868.method5058(class422);
		method7690();
		if (this.aClass645_8382 != null)
			this.aClass645_8382.method7691();
	}

	public final void method7689() {
		if (this.aClass645_8381 != null) {
			Class645 class645_2_ = this.aClass645_8381.aClass645_8382;
			if (class645_2_ == this)
				this.aClass645_8381.aClass645_8382 = this.aClass645_8383;
			else {
				for (/**/; class645_2_.aClass645_8383 != this; class645_2_ = class645_2_.aClass645_8383) {
					/* empty */
				}
				class645_2_.aClass645_8383 = this.aClass645_8383;
			}
		}
		method7690();
		if (this.aClass645_8382 != null) {
			this.aClass645_8382.method7691();
			Class645 class645_3_ = this.aClass645_8382;
			for (;;) {
				class645_3_.aClass437_8379.method5296(this.aClass437_8379);
				class645_3_.aClass645_8381 = this.aClass645_8381;
				if (class645_3_.aClass645_8383 == null) {
					class645_3_.aClass645_8383 = (this.aClass645_8381.aClass645_8382);
					break;
				}
				class645_3_ = class645_3_.aClass645_8383;
			}
			this.aClass645_8381.aClass645_8382 = this.aClass645_8382;
		}
		this.aClass645_8381 = null;
		this.aClass645_8383 = null;
		this.aClass645_8382 = null;
	}

	final void method7690() {
		this.aBool8376 = true;
		this.aBool8380 = true;
		this.aBool8377 = true;
		aBool8373 = true;
	}

	final void method7691() {
		method7690();
		if (this.aClass645_8382 != null)
			this.aClass645_8382.method7691();
		if (this.aClass645_8383 != null)
			this.aClass645_8383.method7691();
	}

	public final void method7692() {
		if (this.aClass645_8381 != null) {
			Class645 class645_4_ = this.aClass645_8381.aClass645_8382;
			if (class645_4_ == this)
				this.aClass645_8381.aClass645_8382 = this.aClass645_8383;
			else {
				for (/**/; class645_4_.aClass645_8383 != this; class645_4_ = class645_4_.aClass645_8383) {
					/* empty */
				}
				class645_4_.aClass645_8383 = this.aClass645_8383;
			}
		}
		method7690();
		if (this.aClass645_8382 != null) {
			this.aClass645_8382.method7691();
			Class645 class645_5_ = this.aClass645_8382;
			for (;;) {
				class645_5_.aClass437_8379.method5296(this.aClass437_8379);
				class645_5_.aClass645_8381 = this.aClass645_8381;
				if (class645_5_.aClass645_8383 == null) {
					class645_5_.aClass645_8383 = (this.aClass645_8381.aClass645_8382);
					break;
				}
				class645_5_ = class645_5_.aClass645_8383;
			}
			this.aClass645_8381.aClass645_8382 = this.aClass645_8382;
		}
		this.aClass645_8381 = null;
		this.aClass645_8383 = null;
		this.aClass645_8382 = null;
	}

	public final Class437 method7693() {
		if (this.aBool8376) {
			this.aBool8376 = false;
			this.aClass437_8374.method5287(this.aClass437_8379);
			if (this.aClass645_8381 != null)
				this.aClass437_8374.method5296(this.aClass645_8381.method7693());
		}
		return this.aClass437_8374;
	}

	Class645() {
		this.aClass437_8374 = new Class437();
		this.aBool8376 = true;
		this.aClass437_8375 = new Class437();
		this.aBool8380 = true;
		new Class418();
		new Class418();
		this.aClass433_8378 = new Class433();
		this.aBool8377 = true;
		aBool8373 = true;
		this.aClass645_8381 = null;
		this.aClass645_8382 = null;
		this.aClass645_8383 = null;
	}

	final void method7698(Class437 class437) {
		if (this.aClass645_8381 != null) {
			Class437 class437_6_ = new Class437(class437);
			class437_6_.method5296(this.aClass645_8381.method7684());
			method7686(class437_6_);
		} else
			method7686(class437);
	}

}
