/* Class469 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Class469
{
    boolean aBool5370;
    Interface67 anInterface67_5371;
    Class473 aClass473_5372 = Class473.aClass473_5425;
    Class364 aClass364_5373;
    List aList5374;
    boolean aBool5375;
    int anInt5376;
    float aFloat5377;
    Object anObject5378;
    int anInt5379;
    float aFloat5380;
    Interface55 anInterface55_5381;
    float aFloat5382;
    float aFloat5383;
    int anInt5384;
    boolean aBool5385 = false;
    Object anObject5386;
    int anInt5387 = 0;
    Class422 aClass422_5388;
    
    public boolean method5737(int i) {
	((Class469) this).aBool5370 = false;
	return 123229249 * ((Class469) this).anInt5384 != 0;
    }
    
    public int method5738() {
	return ((Class469) this).anInt5376 * -158133817;
    }
    
    public void method5739(Interface67 interface67, int i) {
	((Class469) this).anInterface67_5371 = interface67;
	((Class469) this).aFloat5380 = 0.0F;
	((Class469) this).aClass473_5372 = Class473.aClass473_5417;
    }
    
    public Class469(Class364 class364) {
	((Class469) this).aClass364_5373 = class364;
	((Class469) this).aList5374 = new ArrayList();
    }
    
    public void method5740(byte i) {
	if (!((Class469) this).aBool5385
	    && (((Class469) this).aClass473_5372 != Class473.aClass473_5419
		&& Class473.aClass473_5424 != ((Class469) this).aClass473_5372
		&& Class473.aClass473_5425 != ((Class469) this).aClass473_5372
		&& ((Class469) this).aClass473_5372 != Class473.aClass473_5416)
	    && (((((Class473) ((Class469) this).aClass473_5372).anInt5426
		  * 1416156255)
		 <= (((Class473) Class473.aClass473_5417).anInt5426
		     * 1416156255))
		|| ((((Class473) ((Class469) this).aClass473_5372).anInt5426
		     * 1416156255)
		    >= (1416156255
			* ((Class473) Class473.aClass473_5422).anInt5426))))
	    ((Class469) this).aClass473_5372 = Class473.aClass473_5418;
    }
    
    public void method5741(byte i) {
	if (Class473.aClass473_5419 != ((Class469) this).aClass473_5372
	    && ((Class469) this).aClass473_5372 != Class473.aClass473_5424
	    && Class473.aClass473_5425 != ((Class469) this).aClass473_5372
	    && ((Class469) this).aClass473_5372 != Class473.aClass473_5416) {
	    if ((((Class469) this).aClass473_5372 == Class473.aClass473_5418
		 || (Class473.aClass473_5421
		     == ((Class469) this).aClass473_5372))
		&& false == ((Class469) this).aBool5385)
		((Class469) this).aBool5385 = true;
	    else if (((((Class473) ((Class469) this).aClass473_5372).anInt5426
		       * 1416156255)
		      < (1416156255
			 * ((Class473) Class473.aClass473_5418).anInt5426))
		     || ((((Class473) ((Class469) this).aClass473_5372)
			  .anInt5426) * 1416156255
			 >= 1416156255 * (((Class473) Class473.aClass473_5422)
					  .anInt5426))) {
		((Class469) this).aClass473_5372 = Class473.aClass473_5418;
		((Class469) this).aBool5385 = true;
	    }
	}
    }
    
    public void method5742(int i, int i_0_) {
	if ((((Class473) ((Class469) this).aClass473_5372).anInt5426
	     * 1416156255)
	    < 1416156255 * ((Class473) Class473.aClass473_5422).anInt5426) {
	    if ((1416156255
		 * ((Class473) ((Class469) this).aClass473_5372).anInt5426)
		< (1416156255
		   * ((Class473) Class473.aClass473_5420).anInt5426)) {
		((Class469) this).aClass473_5372 = Class473.aClass473_5422;
		((Class469) this).aBool5385 = false;
	    } else if (i <= 0) {
		Iterator iterator = ((Class469) this).aList5374.iterator();
		while (iterator.hasNext()) {
		    Class468 class468 = (Class468) iterator.next();
		    if (class468.method5708(28843855) != this)
			iterator.remove();
		    else
			class468.method5696(-2110674715);
		}
		((Class469) this).aClass473_5372 = Class473.aClass473_5422;
		((Class469) this).aBool5385 = false;
	    } else {
		((Class469) this).aClass473_5372 = Class473.aClass473_5416;
		Iterator iterator = ((Class469) this).aList5374.iterator();
		while (iterator.hasNext()) {
		    Class468 class468 = (Class468) iterator.next();
		    if (class468.method5708(28843855) != this)
			iterator.remove();
		    else
			class468.method5657(0.0F, i, 1669690194);
		}
	    }
	}
    }
    
    public void method5743(byte i) {
	Iterator iterator = ((Class469) this).aList5374.iterator();
	((Class469) this).aClass473_5372 = Class473.aClass473_5422;
	while (iterator.hasNext()) {
	    Class468 class468 = (Class468) iterator.next();
	    if (class468.method5708(28843855) == this)
		class468.method5672((short) 133);
	}
    }
    
    public void method5744() {
	if (Class473.aClass473_5419 != ((Class469) this).aClass473_5372
	    && ((Class469) this).aClass473_5372 != Class473.aClass473_5424
	    && Class473.aClass473_5425 != ((Class469) this).aClass473_5372
	    && ((Class469) this).aClass473_5372 != Class473.aClass473_5416) {
	    if ((((Class469) this).aClass473_5372 == Class473.aClass473_5418
		 || (Class473.aClass473_5421
		     == ((Class469) this).aClass473_5372))
		&& false == ((Class469) this).aBool5385)
		((Class469) this).aBool5385 = true;
	    else if (((((Class473) ((Class469) this).aClass473_5372).anInt5426
		       * 1416156255)
		      < (1416156255
			 * ((Class473) Class473.aClass473_5418).anInt5426))
		     || ((((Class473) ((Class469) this).aClass473_5372)
			  .anInt5426) * 1416156255
			 >= 1416156255 * (((Class473) Class473.aClass473_5422)
					  .anInt5426))) {
		((Class469) this).aClass473_5372 = Class473.aClass473_5418;
		((Class469) this).aBool5385 = true;
	    }
	}
    }
    
    public void method5745(float f) {
	if (!(f < 0.0F))
	    ((Class469) this).aFloat5377 = f;
    }
    
    public void method5746(int i) {
	if (((Class469) this).aClass473_5372 == Class473.aClass473_5418) {
	    Class584 class584
		= ((Class469) this).anInterface67_5371.method410((byte) 1);
	    if (Class584.aClass584_7700 == class584)
		((Class469) this).aClass473_5372 = Class473.aClass473_5421;
	}
	if (((Class469) this).aClass473_5372 == Class473.aClass473_5421
	    && true == ((Class469) this).aBool5385) {
	    Class468 class468
		= (((Class469) this).aClass364_5373.method4607
		   (((Class469) this).anInterface67_5371.method453(-69480349),
		    (byte) -69));
	    if (class468 != null) {
		boolean bool = ((Class469) this).anInterface67_5371
				   .method411(865860517);
		Class486 class486 = new Class486(this);
		boolean bool_1_
		    = (class468.method5658
		       (bool ? null : ((Class469) this).anInterface67_5371
					  .method416(0, (byte) 115),
			bool ? class486 : null,
			-158133817 * ((Class469) this).anInt5376,
			(((Class469) this).anInt5387 * -23349301 > 0 ? 0.0F
			 : ((Class469) this).aFloat5380),
			false, ((Class469) this).aBool5375,
			-1299367637 * ((Class469) this).anInt5379,
			((Class469) this).aFloat5377, this, (byte) 1));
		if (true == bool_1_) {
		    ((Class469) this).aClass473_5372 = Class473.aClass473_5420;
		    class468.method5687(((Class469) this).anInterface55_5381,
					1505889369);
		    class468.method5657(((Class469) this).aFloat5380,
					(-23349301
					 * ((Class469) this).anInt5387),
					2058153683);
		    class468.method5659(-304853239);
		    ((Class469) this).aList5374.add(class468);
		    ((Class469) this).aBool5385 = false;
		} else {
		    if (class468.method5722(-1369325982)
			== Class472.aClass472_5413)
			((Class469) this).aClass473_5372
			    = Class473.aClass473_5423;
		    class468.method5656(901156194);
		}
	    }
	}
	Iterator iterator = ((Class469) this).aList5374.iterator();
	boolean bool = true;
	while (iterator.hasNext()) {
	    Class468 class468 = (Class468) iterator.next();
	    if (class468.method5708(28843855) != this)
		iterator.remove();
	    else {
		if (Class473.aClass473_5416
		    == ((Class469) this).aClass473_5372) {
		    if (class468.method5675(692742073) == 0.0F)
			class468.method5696(-2095080003);
		    else
			bool = false;
		}
		if (class468.method5654((byte) 4) == true
		    || class468.method5653(-2108912935) == true) {
		    class468.method5656(260902817);
		    iterator.remove();
		} else
		    bool = false;
	    }
	}
	if (bool
	    && ((((Class473) ((Class469) this).aClass473_5372).anInt5426
		 * 1416156255)
		>= ((Class473) Class473.aClass473_5420).anInt5426 * 1416156255)
	    && ((1416156255
		 * ((Class473) ((Class469) this).aClass473_5372).anInt5426)
		< (1416156255
		   * ((Class473) Class473.aClass473_5422).anInt5426))) {
	    if (((Class469) this).aClass473_5372 == Class473.aClass473_5416)
		((Class469) this).aClass473_5372 = Class473.aClass473_5422;
	    else
		((Class469) this).aClass473_5372 = Class473.aClass473_5423;
	}
    }
    
    public Class473 method5747(byte i) {
	return ((Class469) this).aClass473_5372;
    }
    
    public Object method5748(int i) {
	return ((Class469) this).anObject5378;
    }
    
    public Object method5749(byte i) {
	return ((Class469) this).anObject5386;
    }
    
    public void method5750(int i, int i_2_) {
	((Class469) this).anInt5376 = -1216913417 * i;
    }
    
    public void method5751(boolean bool, int i) {
	/* empty */
    }
    
    public Interface67 method5752(int i) {
	return ((Class469) this).anInterface67_5371;
    }
    
    public void method5753(Interface55 interface55, byte i) {
	((Class469) this).anInterface55_5381 = interface55;
    }
    
    public boolean method5754() {
	((Class469) this).aBool5370 = false;
	return 123229249 * ((Class469) this).anInt5384 != 0;
    }
    
    public void method5755(Class422 class422, int i) {
	((Class469) this).aClass422_5388 = class422;
    }
    
    public float method5756(int i) {
	return ((Class469) this).aFloat5383;
    }
    
    public void method5757(float f, int i) {
	((Class469) this).aFloat5382 = f;
    }
    
    public void method5758() {
	if (!((Class469) this).aBool5385
	    && (((Class469) this).aClass473_5372 != Class473.aClass473_5419
		&& Class473.aClass473_5424 != ((Class469) this).aClass473_5372
		&& Class473.aClass473_5425 != ((Class469) this).aClass473_5372
		&& ((Class469) this).aClass473_5372 != Class473.aClass473_5416)
	    && (((((Class473) ((Class469) this).aClass473_5372).anInt5426
		  * 1416156255)
		 <= (((Class473) Class473.aClass473_5417).anInt5426
		     * 1416156255))
		|| ((((Class473) ((Class469) this).aClass473_5372).anInt5426
		     * 1416156255)
		    >= (1416156255
			* ((Class473) Class473.aClass473_5422).anInt5426))))
	    ((Class469) this).aClass473_5372 = Class473.aClass473_5418;
    }
    
    public void method5759(int i, boolean bool, int i_3_) {
	((Class469) this).aBool5370 = bool;
	((Class469) this).anInt5384 = i * 94223297;
    }
    
    public boolean method5760() {
	((Class469) this).aBool5370 = false;
	return 123229249 * ((Class469) this).anInt5384 != 0;
    }
    
    public void method5761(int i) {
	if (123229249 * ((Class469) this).anInt5384 > -1
	    && !((Class469) this).aBool5370)
	    ((Class469) this).anInt5384 -= 94223297;
	if (((Class469) this).anInt5384 * 123229249 == 0)
	    method5741((byte) -125);
    }
    
    public Class422 method5762(short i) {
	return ((Class469) this).aClass422_5388;
    }
    
    public void method5763(boolean bool, int i, int i_4_) {
	((Class469) this).aBool5375 = bool;
	((Class469) this).anInt5379 = i * 169196931;
    }
    
    public void method5764(float f, int i) {
	if (!(f < 0.0F))
	    ((Class469) this).aFloat5377 = f;
    }
    
    public void method5765() {
	if (((Class469) this).aClass473_5372 != Class473.aClass473_5422
	    && Class473.aClass473_5423 != ((Class469) this).aClass473_5372)
	    method5742(0, 2145258259);
	Iterator iterator = ((Class469) this).aList5374.iterator();
	while (iterator.hasNext()) {
	    Class468 class468 = (Class468) iterator.next();
	    if (class468.method5708(28843855) != this)
		iterator.remove();
	    else
		class468.method5656(-1190581917);
	}
	method5780(542122083);
	((Class469) this).aClass473_5372 = Class473.aClass473_5424;
    }
    
    public void method5766() {
	if (((Class469) this).aClass473_5372 != Class473.aClass473_5422
	    && Class473.aClass473_5423 != ((Class469) this).aClass473_5372)
	    method5742(0, 2145299406);
	Iterator iterator = ((Class469) this).aList5374.iterator();
	while (iterator.hasNext()) {
	    Class468 class468 = (Class468) iterator.next();
	    if (class468.method5708(28843855) != this)
		iterator.remove();
	    else
		class468.method5656(-1996285279);
	}
	method5780(-856621781);
	((Class469) this).aClass473_5372 = Class473.aClass473_5424;
    }
    
    public void method5767(float f, int i, int i_5_) {
	((Class469) this).aFloat5380 = f;
	int i_6_ = 0;
	Iterator iterator = ((Class469) this).aList5374.iterator();
	while (iterator.hasNext()) {
	    Class468 class468 = (Class468) iterator.next();
	    if (class468.method5708(28843855) != this)
		((Class469) this).aList5374.remove(class468);
	    else {
		class468.method5657(((Class469) this).aFloat5380, i,
				    1544335187);
		i_6_++;
	    }
	}
	if (i_6_ == 0)
	    ((Class469) this).anInt5387 = 717043171 * i;
    }
    
    public void method5768() {
	if (!((Class469) this).aBool5385
	    && (((Class469) this).aClass473_5372 != Class473.aClass473_5419
		&& Class473.aClass473_5424 != ((Class469) this).aClass473_5372
		&& Class473.aClass473_5425 != ((Class469) this).aClass473_5372
		&& ((Class469) this).aClass473_5372 != Class473.aClass473_5416)
	    && (((((Class473) ((Class469) this).aClass473_5372).anInt5426
		  * 1416156255)
		 <= (((Class473) Class473.aClass473_5417).anInt5426
		     * 1416156255))
		|| ((((Class473) ((Class469) this).aClass473_5372).anInt5426
		     * 1416156255)
		    >= (1416156255
			* ((Class473) Class473.aClass473_5422).anInt5426))))
	    ((Class469) this).aClass473_5372 = Class473.aClass473_5418;
    }
    
    public void method5769() {
	if (Class473.aClass473_5419 != ((Class469) this).aClass473_5372
	    && ((Class469) this).aClass473_5372 != Class473.aClass473_5424
	    && Class473.aClass473_5425 != ((Class469) this).aClass473_5372
	    && ((Class469) this).aClass473_5372 != Class473.aClass473_5416) {
	    if ((((Class469) this).aClass473_5372 == Class473.aClass473_5418
		 || (Class473.aClass473_5421
		     == ((Class469) this).aClass473_5372))
		&& false == ((Class469) this).aBool5385)
		((Class469) this).aBool5385 = true;
	    else if (((((Class473) ((Class469) this).aClass473_5372).anInt5426
		       * 1416156255)
		      < (1416156255
			 * ((Class473) Class473.aClass473_5418).anInt5426))
		     || ((((Class473) ((Class469) this).aClass473_5372)
			  .anInt5426) * 1416156255
			 >= 1416156255 * (((Class473) Class473.aClass473_5422)
					  .anInt5426))) {
		((Class469) this).aClass473_5372 = Class473.aClass473_5418;
		((Class469) this).aBool5385 = true;
	    }
	}
    }
    
    public void method5770(int i) {
	if ((((Class473) ((Class469) this).aClass473_5372).anInt5426
	     * 1416156255)
	    < 1416156255 * ((Class473) Class473.aClass473_5422).anInt5426) {
	    if ((1416156255
		 * ((Class473) ((Class469) this).aClass473_5372).anInt5426)
		< (1416156255
		   * ((Class473) Class473.aClass473_5420).anInt5426)) {
		((Class469) this).aClass473_5372 = Class473.aClass473_5422;
		((Class469) this).aBool5385 = false;
	    } else if (i <= 0) {
		Iterator iterator = ((Class469) this).aList5374.iterator();
		while (iterator.hasNext()) {
		    Class468 class468 = (Class468) iterator.next();
		    if (class468.method5708(28843855) != this)
			iterator.remove();
		    else
			class468.method5696(-2141230085);
		}
		((Class469) this).aClass473_5372 = Class473.aClass473_5422;
		((Class469) this).aBool5385 = false;
	    } else {
		((Class469) this).aClass473_5372 = Class473.aClass473_5416;
		Iterator iterator = ((Class469) this).aList5374.iterator();
		while (iterator.hasNext()) {
		    Class468 class468 = (Class468) iterator.next();
		    if (class468.method5708(28843855) != this)
			iterator.remove();
		    else
			class468.method5657(0.0F, i, 1908245544);
		}
	    }
	}
    }
    
    public void method5771() {
	Iterator iterator = ((Class469) this).aList5374.iterator();
	((Class469) this).aClass473_5372 = Class473.aClass473_5422;
	while (iterator.hasNext()) {
	    Class468 class468 = (Class468) iterator.next();
	    if (class468.method5708(28843855) == this)
		class468.method5672((short) 133);
	}
    }
    
    public void method5772() {
	Iterator iterator = ((Class469) this).aList5374.iterator();
	((Class469) this).aClass473_5372 = Class473.aClass473_5422;
	while (iterator.hasNext()) {
	    Class468 class468 = (Class468) iterator.next();
	    if (class468.method5708(28843855) == this)
		class468.method5672((short) 133);
	}
    }
    
    public void method5773() {
	if (((Class469) this).aClass473_5372 == Class473.aClass473_5418) {
	    Class584 class584
		= ((Class469) this).anInterface67_5371.method410((byte) 1);
	    if (Class584.aClass584_7700 == class584)
		((Class469) this).aClass473_5372 = Class473.aClass473_5421;
	}
	if (((Class469) this).aClass473_5372 == Class473.aClass473_5421
	    && true == ((Class469) this).aBool5385) {
	    Class468 class468
		= (((Class469) this).aClass364_5373.method4607
		   (((Class469) this).anInterface67_5371.method453(-69480349),
		    (byte) -24));
	    if (class468 != null) {
		boolean bool = ((Class469) this).anInterface67_5371
				   .method411(865860517);
		Class486 class486 = new Class486(this);
		boolean bool_7_
		    = (class468.method5658
		       (bool ? null : ((Class469) this).anInterface67_5371
					  .method416(0, (byte) 49),
			bool ? class486 : null,
			-158133817 * ((Class469) this).anInt5376,
			(((Class469) this).anInt5387 * -23349301 > 0 ? 0.0F
			 : ((Class469) this).aFloat5380),
			false, ((Class469) this).aBool5375,
			-1299367637 * ((Class469) this).anInt5379,
			((Class469) this).aFloat5377, this, (byte) 1));
		if (true == bool_7_) {
		    ((Class469) this).aClass473_5372 = Class473.aClass473_5420;
		    class468.method5687(((Class469) this).anInterface55_5381,
					2130436318);
		    class468.method5657(((Class469) this).aFloat5380,
					(-23349301
					 * ((Class469) this).anInt5387),
					2122271502);
		    class468.method5659(-1117794292);
		    ((Class469) this).aList5374.add(class468);
		    ((Class469) this).aBool5385 = false;
		} else {
		    if (class468.method5722(-1369325982)
			== Class472.aClass472_5413)
			((Class469) this).aClass473_5372
			    = Class473.aClass473_5423;
		    class468.method5656(-1027341147);
		}
	    }
	}
	Iterator iterator = ((Class469) this).aList5374.iterator();
	boolean bool = true;
	while (iterator.hasNext()) {
	    Class468 class468 = (Class468) iterator.next();
	    if (class468.method5708(28843855) != this)
		iterator.remove();
	    else {
		if (Class473.aClass473_5416
		    == ((Class469) this).aClass473_5372) {
		    if (class468.method5675(692742073) == 0.0F)
			class468.method5696(-2092784161);
		    else
			bool = false;
		}
		if (class468.method5654((byte) 16) == true
		    || class468.method5653(-1372704799) == true) {
		    class468.method5656(1200077537);
		    iterator.remove();
		} else
		    bool = false;
	    }
	}
	if (bool
	    && ((((Class473) ((Class469) this).aClass473_5372).anInt5426
		 * 1416156255)
		>= ((Class473) Class473.aClass473_5420).anInt5426 * 1416156255)
	    && ((1416156255
		 * ((Class473) ((Class469) this).aClass473_5372).anInt5426)
		< (1416156255
		   * ((Class473) Class473.aClass473_5422).anInt5426))) {
	    if (((Class469) this).aClass473_5372 == Class473.aClass473_5416)
		((Class469) this).aClass473_5372 = Class473.aClass473_5422;
	    else
		((Class469) this).aClass473_5372 = Class473.aClass473_5423;
	}
    }
    
    void method5774() {
	((Class469) this).anInterface67_5371 = null;
	((Class469) this).aClass473_5372 = Class473.aClass473_5425;
	((Class469) this).aBool5385 = false;
	((Class469) this).aList5374.clear();
	((Class469) this).anObject5378 = null;
	((Class469) this).aClass422_5388 = null;
	((Class469) this).anInt5376 = 1216913417;
	((Class469) this).aBool5375 = false;
	((Class469) this).anInt5379 = 0;
	((Class469) this).aFloat5380 = 0.0F;
	((Class469) this).anInterface55_5381 = null;
	((Class469) this).aFloat5382 = 0.0F;
	((Class469) this).aFloat5383 = 0.0F;
	((Class469) this).anInt5384 = 0;
	((Class469) this).aBool5370 = false;
	((Class469) this).anObject5386 = null;
	((Class469) this).anInt5387 = 0;
	((Class469) this).aFloat5377 = 1.0F;
    }
    
    public void method5775(boolean bool) {
	/* empty */
    }
    
    public void method5776(float f, int i) {
	((Class469) this).aFloat5383 = f;
    }
    
    public boolean method5777() {
	((Class469) this).aBool5370 = false;
	return 123229249 * ((Class469) this).anInt5384 != 0;
    }
    
    public void method5778(Object object, short i) {
	((Class469) this).anObject5386 = object;
    }
    
    public void method5779(boolean bool) {
	/* empty */
    }
    
    void method5780(int i) {
	((Class469) this).anInterface67_5371 = null;
	((Class469) this).aClass473_5372 = Class473.aClass473_5425;
	((Class469) this).aBool5385 = false;
	((Class469) this).aList5374.clear();
	((Class469) this).anObject5378 = null;
	((Class469) this).aClass422_5388 = null;
	((Class469) this).anInt5376 = 1216913417;
	((Class469) this).aBool5375 = false;
	((Class469) this).anInt5379 = 0;
	((Class469) this).aFloat5380 = 0.0F;
	((Class469) this).anInterface55_5381 = null;
	((Class469) this).aFloat5382 = 0.0F;
	((Class469) this).aFloat5383 = 0.0F;
	((Class469) this).anInt5384 = 0;
	((Class469) this).aBool5370 = false;
	((Class469) this).anObject5386 = null;
	((Class469) this).anInt5387 = 0;
	((Class469) this).aFloat5377 = 1.0F;
    }
    
    public void method5781(int i) {
	Iterator iterator = ((Class469) this).aList5374.iterator();
	((Class469) this).aClass473_5372 = Class473.aClass473_5418;
	while (iterator.hasNext()) {
	    Class468 class468 = (Class468) iterator.next();
	    if (class468.method5708(28843855) == this)
		class468.method5688(1111298393);
	}
    }
    
    public void method5782(byte i) {
	if (((Class469) this).aClass473_5372 != Class473.aClass473_5422
	    && Class473.aClass473_5423 != ((Class469) this).aClass473_5372)
	    method5742(0, 2015192229);
	Iterator iterator = ((Class469) this).aList5374.iterator();
	while (iterator.hasNext()) {
	    Class468 class468 = (Class468) iterator.next();
	    if (class468.method5708(28843855) != this)
		iterator.remove();
	    else
		class468.method5656(514345223);
	}
	method5780(-1842810225);
	((Class469) this).aClass473_5372 = Class473.aClass473_5424;
    }
    
    public void method5783() {
	Iterator iterator = ((Class469) this).aList5374.iterator();
	((Class469) this).aClass473_5372 = Class473.aClass473_5418;
	while (iterator.hasNext()) {
	    Class468 class468 = (Class468) iterator.next();
	    if (class468.method5708(28843855) == this)
		class468.method5688(-1007000407);
	}
    }
    
    public float method5784(short i) {
	return ((Class469) this).aFloat5382;
    }
    
    public boolean method5785() {
	((Class469) this).aBool5370 = false;
	return 123229249 * ((Class469) this).anInt5384 != 0;
    }
    
    public void method5786() {
	if (123229249 * ((Class469) this).anInt5384 > -1
	    && !((Class469) this).aBool5370)
	    ((Class469) this).anInt5384 -= 94223297;
	if (((Class469) this).anInt5384 * 123229249 == 0)
	    method5741((byte) -125);
    }
    
    public void method5787(Object object, int i) {
	((Class469) this).anObject5378 = object;
    }
    
    public int method5788(byte i) {
	return ((Class469) this).anInt5376 * -158133817;
    }
    
    static final void method5789(Class648 class648, byte i) {
	String string = (String) (((Class648) class648).anObjectArray8396
				  [(((Class648) class648).anInt8410
				    -= 1600226731) * -520794877]);
	Class691_Sub34.method10136(string, 518302166);
    }
    
    static final void method5790(Class648 class648, int i) {
	if (!Class495.aClass283_Sub1_5578.method3786((byte) 9)
		 .method3965(-1955714541))
	    throw new RuntimeException();
	Class684_Sub3 class684_sub3
	    = ((Class684_Sub3)
	       Class495.aClass283_Sub1_5578.method3785((byte) 36));
	class684_sub3.method10086(Class693.aClass432_8695, -1, 0.0F,
				  2141365607);
	client.aBool10982 = true;
    }
}
