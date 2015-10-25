/* Class345 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class345
{
    long aLong3640;
    int anInt3641;
    
    Class345(Class331[] class331s) {
	for (int i = 0; i < class331s.length; i++)
	    method4532(class331s[i]);
    }
    
    public final int method4529() {
	return ((Class345) this).anInt3641;
    }
    
    public final Class331 method4530(int i) {
	return Class331.method4329(method4531(i));
    }
    
    final int method4531(int i) {
	return ((int) (((Class345) this).aLong3640 >> Class331.anInt3528 * i)
		& 0xf);
    }
    
    final void method4532(Class331 class331) {
	((Class345) this).aLong3640
	    |= (long) (((Class331) class331).anInt3529
		       << Class331.anInt3528 * ((Class345) this).anInt3641++);
    }
    
    public final int method4533() {
	return ((Class345) this).anInt3641;
    }
    
    Class345(Class331 class331) {
	((Class345) this).aLong3640 = (long) ((Class331) class331).anInt3529;
	((Class345) this).anInt3641 = 1;
    }
    
    final int method4534(int i) {
	return ((int) (((Class345) this).aLong3640 >> Class331.anInt3528 * i)
		& 0xf);
    }
}
