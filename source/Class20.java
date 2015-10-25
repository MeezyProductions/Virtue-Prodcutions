/* Class20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class20
{
    public Object anObject208;
    public Object anObject209;
    
    public boolean equals(Object object) {
	if (object == null || !(object instanceof Class20))
	    return false;
	Class20 class20_0_ = (Class20) object;
	if (anObject208 == null) {
	    if (class20_0_.anObject208 != null)
		return false;
	} else if (!anObject208.equals(class20_0_.anObject208))
	    return false;
	if (anObject209 == null) {
	    if (class20_0_.anObject209 != null)
		return false;
	} else if (!anObject209.equals(class20_0_.anObject209))
	    return false;
	return true;
    }
    
    public String method651() {
	return new StringBuilder().append(anObject208).append(", ").append
		   (anObject209).toString();
    }
    
    public boolean method652(Object object) {
	if (object == null || !(object instanceof Class20))
	    return false;
	Class20 class20_1_ = (Class20) object;
	if (anObject208 == null) {
	    if (class20_1_.anObject208 != null)
		return false;
	} else if (!anObject208.equals(class20_1_.anObject208))
	    return false;
	if (anObject209 == null) {
	    if (class20_1_.anObject209 != null)
		return false;
	} else if (!anObject209.equals(class20_1_.anObject209))
	    return false;
	return true;
    }
    
    public int hashCode() {
	int i = 0;
	if (anObject208 != null)
	    i += anObject208.hashCode();
	if (anObject209 != null)
	    i += 31 * anObject209.hashCode();
	return i;
    }
    
    public boolean method653(Object object) {
	if (object == null || !(object instanceof Class20))
	    return false;
	Class20 class20_2_ = (Class20) object;
	if (anObject208 == null) {
	    if (class20_2_.anObject208 != null)
		return false;
	} else if (!anObject208.equals(class20_2_.anObject208))
	    return false;
	if (anObject209 == null) {
	    if (class20_2_.anObject209 != null)
		return false;
	} else if (!anObject209.equals(class20_2_.anObject209))
	    return false;
	return true;
    }
    
    public int method654() {
	int i = 0;
	if (anObject208 != null)
	    i += anObject208.hashCode();
	if (anObject209 != null)
	    i += 31 * anObject209.hashCode();
	return i;
    }
    
    public int method655() {
	int i = 0;
	if (anObject208 != null)
	    i += anObject208.hashCode();
	if (anObject209 != null)
	    i += 31 * anObject209.hashCode();
	return i;
    }
    
    public Class20(Object object, Object object_3_) {
	anObject208 = object;
	anObject209 = object_3_;
    }
    
    public int method656() {
	int i = 0;
	if (anObject208 != null)
	    i += anObject208.hashCode();
	if (anObject209 != null)
	    i += 31 * anObject209.hashCode();
	return i;
    }
    
    public String method657() {
	return new StringBuilder().append(anObject208).append(", ").append
		   (anObject209).toString();
    }
    
    public String method658() {
	return new StringBuilder().append(anObject208).append(", ").append
		   (anObject209).toString();
    }
    
    public String toString() {
	return new StringBuilder().append(anObject208).append(", ").append
		   (anObject209).toString();
    }
    
    public String method659() {
	return new StringBuilder().append(anObject208).append(", ").append
		   (anObject209).toString();
    }
}
