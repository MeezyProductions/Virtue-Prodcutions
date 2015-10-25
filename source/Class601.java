/* Class601 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class601
{
    Class692 aClass692_7869;
    int anInt7870;
    int anInt7871;
    Class679 aClass679_7872 = new Class679();
    
    final void method7157(Object object, Interface68 interface68, int i) {
	if (i > ((Class601) this).anInt7871)
	    throw new IllegalStateException();
	method7158(interface68);
	((Class601) this).anInt7870 -= i;
	while (((Class601) this).anInt7870 < 0) {
	    Class528_Sub21_Sub18 class528_sub21_sub18
		= ((Class528_Sub21_Sub18)
		   ((Class601) this).aClass679_7872.method7962(2116320015));
	    method7159(class528_sub21_sub18);
	}
	Class528_Sub21_Sub18_Sub2 class528_sub21_sub18_sub2
	    = new Class528_Sub21_Sub18_Sub2(interface68, object, i);
	((Class601) this).aClass692_7869.method8142(class528_sub21_sub18_sub2,
						    interface68.method458());
	((Class601) this).aClass679_7872.method7959(class528_sub21_sub18_sub2,
						    124641233);
	class528_sub21_sub18_sub2.aLong10407 = 0L;
    }
    
    final void method7158(Interface68 interface68) {
	long l = interface68.method458();
	for (Class528_Sub21_Sub18 class528_sub21_sub18
		 = ((Class528_Sub21_Sub18)
		    ((Class601) this).aClass692_7869.method8137(l));
	     class528_sub21_sub18 != null;
	     class528_sub21_sub18
		 = (Class528_Sub21_Sub18) ((Class601) this).aClass692_7869
					      .method8143((short) 255)) {
	    if (((Class528_Sub21_Sub18) class528_sub21_sub18)
		    .anInterface68_11648.method457(interface68)) {
		method7159(class528_sub21_sub18);
		break;
	    }
	}
    }
    
    final void method7159(Class528_Sub21_Sub18 class528_sub21_sub18) {
	if (class528_sub21_sub18 != null) {
	    class528_sub21_sub18.method6443(1569335125);
	    class528_sub21_sub18.method9429((byte) -35);
	    ((Class601) this).anInt7870
		+= ((Class528_Sub21_Sub18) class528_sub21_sub18).anInt11649;
	}
    }
    
    public final void method7160(Object object, Interface68 interface68) {
	method7157(object, interface68, 1);
    }
    
    public Class601(int i) {
	((Class601) this).anInt7871 = i;
	((Class601) this).anInt7870 = i;
	int i_0_;
	for (i_0_ = 1; i_0_ + i_0_ < i; i_0_ += i_0_) {
	    /* empty */
	}
	((Class601) this).aClass692_7869 = new Class692(i_0_);
    }
    
    public final void method7161() {
	((Class601) this).aClass679_7872.method7961(-2039560865);
	((Class601) this).aClass692_7869.method8141(2090710031);
	((Class601) this).anInt7870 = ((Class601) this).anInt7871;
    }
    
    public final void method7162() {
	for (Class528_Sub21_Sub18 class528_sub21_sub18
		 = ((Class528_Sub21_Sub18)
		    ((Class601) this).aClass679_7872.method7960(-1550587110));
	     class528_sub21_sub18 != null;
	     class528_sub21_sub18
		 = ((Class528_Sub21_Sub18)
		    ((Class601) this).aClass679_7872.method7969(-378922719))) {
	    if (class528_sub21_sub18.method10596()) {
		class528_sub21_sub18.method6443(1884357762);
		class528_sub21_sub18.method9429((byte) -34);
		((Class601) this).anInt7870
		    += (((Class528_Sub21_Sub18) class528_sub21_sub18)
			.anInt11649);
	    }
	}
    }
    
    public final void method7163(int i) {
	for (Class528_Sub21_Sub18 class528_sub21_sub18
		 = ((Class528_Sub21_Sub18)
		    ((Class601) this).aClass679_7872.method7960(-1550587110));
	     class528_sub21_sub18 != null;
	     class528_sub21_sub18
		 = (Class528_Sub21_Sub18) ((Class601) this).aClass679_7872
					      .method7969(-1399421635)) {
	    if (class528_sub21_sub18.method10596()) {
		if (class528_sub21_sub18.method10595() == null) {
		    class528_sub21_sub18.method6443(-1137288360);
		    class528_sub21_sub18.method9429((byte) -43);
		    ((Class601) this).anInt7870
			+= (((Class528_Sub21_Sub18) class528_sub21_sub18)
			    .anInt11649);
		}
	    } else if ((class528_sub21_sub18.aLong10407
			+= -7069004085892986779L) * -5214225787304728211L
		       > (long) i) {
		Class528_Sub21_Sub18_Sub1 class528_sub21_sub18_sub1
		    = (new Class528_Sub21_Sub18_Sub1
		       ((((Class528_Sub21_Sub18) class528_sub21_sub18)
			 .anInterface68_11648),
			class528_sub21_sub18.method10595(),
			(((Class528_Sub21_Sub18) class528_sub21_sub18)
			 .anInt11649)));
		((Class601) this).aClass692_7869.method8142
		    (class528_sub21_sub18_sub1,
		     class528_sub21_sub18.aLong7107 * -4849232331708333273L);
		Class509.method6236(class528_sub21_sub18_sub1,
				    class528_sub21_sub18, -998779390);
		class528_sub21_sub18.method6443(-124245796);
		class528_sub21_sub18.method9429((byte) -127);
	    }
	}
    }
    
    public final Object method7164(Interface68 interface68) {
	long l = interface68.method458();
	for (Class528_Sub21_Sub18 class528_sub21_sub18
		 = ((Class528_Sub21_Sub18)
		    ((Class601) this).aClass692_7869.method8137(l));
	     class528_sub21_sub18 != null;
	     class528_sub21_sub18
		 = (Class528_Sub21_Sub18) ((Class601) this).aClass692_7869
					      .method8143((short) 255)) {
	    if (((Class528_Sub21_Sub18) class528_sub21_sub18)
		    .anInterface68_11648.method457(interface68)) {
		Object object = class528_sub21_sub18.method10595();
		if (object == null) {
		    class528_sub21_sub18.method6443(-1677563412);
		    class528_sub21_sub18.method9429((byte) -119);
		    ((Class601) this).anInt7870
			+= (((Class528_Sub21_Sub18) class528_sub21_sub18)
			    .anInt11649);
		} else {
		    if (class528_sub21_sub18.method10596()) {
			Class528_Sub21_Sub18_Sub2 class528_sub21_sub18_sub2
			    = (new Class528_Sub21_Sub18_Sub2
			       (interface68, object,
				(((Class528_Sub21_Sub18) class528_sub21_sub18)
				 .anInt11649)));
			((Class601) this).aClass692_7869.method8142
			    (class528_sub21_sub18_sub2,
			     (class528_sub21_sub18.aLong7107
			      * -4849232331708333273L));
			((Class601) this).aClass679_7872.method7959
			    (class528_sub21_sub18_sub2, -1780917864);
			class528_sub21_sub18_sub2.aLong10407 = 0L;
			class528_sub21_sub18.method6443(1421734554);
			class528_sub21_sub18.method9429((byte) -78);
		    } else {
			((Class601) this).aClass679_7872
			    .method7959(class528_sub21_sub18, -1341838677);
			class528_sub21_sub18.aLong10407 = 0L;
		    }
		    return object;
		}
	    }
	}
	return null;
    }
    
    public final void method7165(int i) {
	for (Class528_Sub21_Sub18 class528_sub21_sub18
		 = ((Class528_Sub21_Sub18)
		    ((Class601) this).aClass679_7872.method7960(-1550587110));
	     class528_sub21_sub18 != null;
	     class528_sub21_sub18
		 = ((Class528_Sub21_Sub18)
		    ((Class601) this).aClass679_7872.method7969(1444088197))) {
	    if (class528_sub21_sub18.method10596()) {
		if (class528_sub21_sub18.method10595() == null) {
		    class528_sub21_sub18.method6443(592782948);
		    class528_sub21_sub18.method9429((byte) -121);
		    ((Class601) this).anInt7870
			+= (((Class528_Sub21_Sub18) class528_sub21_sub18)
			    .anInt11649);
		}
	    } else if ((class528_sub21_sub18.aLong10407
			+= -7069004085892986779L) * -5214225787304728211L
		       > (long) i) {
		Class528_Sub21_Sub18_Sub1 class528_sub21_sub18_sub1
		    = (new Class528_Sub21_Sub18_Sub1
		       ((((Class528_Sub21_Sub18) class528_sub21_sub18)
			 .anInterface68_11648),
			class528_sub21_sub18.method10595(),
			(((Class528_Sub21_Sub18) class528_sub21_sub18)
			 .anInt11649)));
		((Class601) this).aClass692_7869.method8142
		    (class528_sub21_sub18_sub1,
		     class528_sub21_sub18.aLong7107 * -4849232331708333273L);
		Class509.method6236(class528_sub21_sub18_sub1,
				    class528_sub21_sub18, -1417025406);
		class528_sub21_sub18.method6443(-1014310112);
		class528_sub21_sub18.method9429((byte) -50);
	    }
	}
    }
    
    public final void method7166(int i) {
	for (Class528_Sub21_Sub18 class528_sub21_sub18
		 = ((Class528_Sub21_Sub18)
		    ((Class601) this).aClass679_7872.method7960(-1550587110));
	     class528_sub21_sub18 != null;
	     class528_sub21_sub18
		 = ((Class528_Sub21_Sub18)
		    ((Class601) this).aClass679_7872.method7969(1524700751))) {
	    if (class528_sub21_sub18.method10596()) {
		if (class528_sub21_sub18.method10595() == null) {
		    class528_sub21_sub18.method6443(-1762653410);
		    class528_sub21_sub18.method9429((byte) -59);
		    ((Class601) this).anInt7870
			+= (((Class528_Sub21_Sub18) class528_sub21_sub18)
			    .anInt11649);
		}
	    } else if ((class528_sub21_sub18.aLong10407
			+= -7069004085892986779L) * -5214225787304728211L
		       > (long) i) {
		Class528_Sub21_Sub18_Sub1 class528_sub21_sub18_sub1
		    = (new Class528_Sub21_Sub18_Sub1
		       ((((Class528_Sub21_Sub18) class528_sub21_sub18)
			 .anInterface68_11648),
			class528_sub21_sub18.method10595(),
			(((Class528_Sub21_Sub18) class528_sub21_sub18)
			 .anInt11649)));
		((Class601) this).aClass692_7869.method8142
		    (class528_sub21_sub18_sub1,
		     class528_sub21_sub18.aLong7107 * -4849232331708333273L);
		Class509.method6236(class528_sub21_sub18_sub1,
				    class528_sub21_sub18, -946037468);
		class528_sub21_sub18.method6443(426333204);
		class528_sub21_sub18.method9429((byte) -89);
	    }
	}
    }
    
    public final void method7167(int i) {
	for (Class528_Sub21_Sub18 class528_sub21_sub18
		 = ((Class528_Sub21_Sub18)
		    ((Class601) this).aClass679_7872.method7960(-1550587110));
	     class528_sub21_sub18 != null;
	     class528_sub21_sub18
		 = ((Class528_Sub21_Sub18)
		    ((Class601) this).aClass679_7872.method7969(-248267))) {
	    if (class528_sub21_sub18.method10596()) {
		if (class528_sub21_sub18.method10595() == null) {
		    class528_sub21_sub18.method6443(1323646804);
		    class528_sub21_sub18.method9429((byte) -15);
		    ((Class601) this).anInt7870
			+= (((Class528_Sub21_Sub18) class528_sub21_sub18)
			    .anInt11649);
		}
	    } else if ((class528_sub21_sub18.aLong10407
			+= -7069004085892986779L) * -5214225787304728211L
		       > (long) i) {
		Class528_Sub21_Sub18_Sub1 class528_sub21_sub18_sub1
		    = (new Class528_Sub21_Sub18_Sub1
		       ((((Class528_Sub21_Sub18) class528_sub21_sub18)
			 .anInterface68_11648),
			class528_sub21_sub18.method10595(),
			(((Class528_Sub21_Sub18) class528_sub21_sub18)
			 .anInt11649)));
		((Class601) this).aClass692_7869.method8142
		    (class528_sub21_sub18_sub1,
		     class528_sub21_sub18.aLong7107 * -4849232331708333273L);
		Class509.method6236(class528_sub21_sub18_sub1,
				    class528_sub21_sub18, -983115340);
		class528_sub21_sub18.method6443(1047330164);
		class528_sub21_sub18.method9429((byte) -57);
	    }
	}
    }
    
    public final void method7168() {
	((Class601) this).aClass679_7872.method7961(-1257433750);
	((Class601) this).aClass692_7869.method8141(2063238117);
	((Class601) this).anInt7870 = ((Class601) this).anInt7871;
    }
    
    public final void method7169() {
	((Class601) this).aClass679_7872.method7961(-1406397947);
	((Class601) this).aClass692_7869.method8141(2048580291);
	((Class601) this).anInt7870 = ((Class601) this).anInt7871;
    }
}
