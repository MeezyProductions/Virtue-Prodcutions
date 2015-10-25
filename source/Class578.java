/* Class578 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class578
{
    public int anInt7606;
    public int anInt7607;
    public int anInt7608;
    public static int anInt7609;
    
    public Class578(int i, int i_0_, int i_1_) {
	anInt7606 = i * 71648289;
	anInt7607 = 2080077601 * i_0_;
	anInt7608 = -615837281 * i_1_;
    }
    
    public Class578(int i) {
	if (i == -1)
	    anInt7606 = -71648289;
	else {
	    anInt7606 = 71648289 * (i >> 28 & 0x3);
	    anInt7607 = (i >> 14 & 0x3fff) * 2080077601;
	    anInt7608 = (i & 0x3fff) * -615837281;
	}
    }
    
    public void method6898(Class528_Sub19 class528_sub19, byte i) {
	anInt7606 = -1578721923 * class528_sub19.anInt10392;
	anInt7607 = 2080077601 * (class528_sub19.anInt10390 * 124815955 >> 9);
	anInt7608
	    = (-1852661307 * class528_sub19.anInt10393 >> 9) * -615837281;
    }
    
    public int method6899(int i) {
	return (-2013577247 * anInt7606 << 28 | 961465569 * anInt7607 << 14
		| anInt7608 * -173815201);
    }
    
    public boolean equals(Object object) {
	if (this == object)
	    return true;
	if (!(object instanceof Class578))
	    return false;
	return method6900((Class578) object, -1766325258);
    }
    
    boolean method6900(Class578 class578_2_, int i) {
	if (class578_2_.anInt7606 * -2013577247 != anInt7606 * -2013577247)
	    return false;
	if (961465569 * class578_2_.anInt7607 != 961465569 * anInt7607)
	    return false;
	if (class578_2_.anInt7608 * -173815201 != anInt7608 * -173815201)
	    return false;
	return true;
    }
    
    public int hashCode() {
	return method6899(2088038848);
    }
    
    public String toString() {
	return new StringBuilder().append(-2013577247 * anInt7606).append
		   (",").append
		   (961465569 * anInt7607 >> 6).append
		   (",").append
		   (-173815201 * anInt7608 >> 6).append
		   (",").append
		   (961465569 * anInt7607 & 0x3f).append
		   (",").append
		   (anInt7608 * -173815201 & 0x3f).toString();
    }
    
    public boolean method6901(Object object) {
	if (this == object)
	    return true;
	if (!(object instanceof Class578))
	    return false;
	return method6900((Class578) object, -1766325258);
    }
    
    public boolean method6902(Object object) {
	if (this == object)
	    return true;
	if (!(object instanceof Class578))
	    return false;
	return method6900((Class578) object, -1766325258);
    }
    
    public int method6903() {
	return method6899(1970376067);
    }
    
    public void method6904(Class528_Sub19 class528_sub19) {
	anInt7606 = -1578721923 * class528_sub19.anInt10392;
	anInt7607 = 2080077601 * (class528_sub19.anInt10390 * 124815955 >> 9);
	anInt7608
	    = (-1852661307 * class528_sub19.anInt10393 >> 9) * -615837281;
    }
    
    public Class578() {
	anInt7606 = -71648289;
    }
    
    public String method6905() {
	return new StringBuilder().append(-2013577247 * anInt7606).append
		   (",").append
		   (961465569 * anInt7607 >> 6).append
		   (",").append
		   (-173815201 * anInt7608 >> 6).append
		   (",").append
		   (961465569 * anInt7607 & 0x3f).append
		   (",").append
		   (anInt7608 * -173815201 & 0x3f).toString();
    }
    
    public int method6906() {
	return method6899(1992816709);
    }
    
    public String method6907() {
	return new StringBuilder().append(-2013577247 * anInt7606).append
		   (",").append
		   (961465569 * anInt7607 >> 6).append
		   (",").append
		   (-173815201 * anInt7608 >> 6).append
		   (",").append
		   (961465569 * anInt7607 & 0x3f).append
		   (",").append
		   (anInt7608 * -173815201 & 0x3f).toString();
    }
    
    public String method6908() {
	return new StringBuilder().append(-2013577247 * anInt7606).append
		   (",").append
		   (961465569 * anInt7607 >> 6).append
		   (",").append
		   (-173815201 * anInt7608 >> 6).append
		   (",").append
		   (961465569 * anInt7607 & 0x3f).append
		   (",").append
		   (anInt7608 * -173815201 & 0x3f).toString();
    }
    
    public int method6909() {
	return (-2013577247 * anInt7606 << 28 | 961465569 * anInt7607 << 14
		| anInt7608 * -173815201);
    }
    
    public String method6910() {
	return new StringBuilder().append(-2013577247 * anInt7606).append
		   (",").append
		   (961465569 * anInt7607 >> 6).append
		   (",").append
		   (-173815201 * anInt7608 >> 6).append
		   (",").append
		   (961465569 * anInt7607 & 0x3f).append
		   (",").append
		   (anInt7608 * -173815201 & 0x3f).toString();
    }
    
    public int method6911() {
	return method6899(2019992786);
    }
    
    static final void method6912(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class514.aClass528_Sub38_6967.aClass691_Sub15_10566
		  .method9937(1101957984) ? 1 : 0;
    }
    
    public static boolean method6913(char c, byte i) {
	return (c >= '0' && c <= '9' || c >= 'A' && c <= 'Z'
		|| c >= 'a' && c <= 'z');
    }
    
    static boolean method6914(int i) {
	if (Class54.anInt631 * 1871118701 != -1)
	    return Class511_Sub2.method9284(-1660278304);
	return Class166.method2097(Class54.aString662, Class54.aString663,
				   (byte) 1);
    }
}
