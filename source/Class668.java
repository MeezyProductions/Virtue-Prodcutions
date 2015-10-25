/* Class668 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Locale;

public class Class668 implements IClientEnum
{
    public static Class668 aClass668_8490;
    public static Class668 aClass668_8491;
    String aString8492;
    public static Class668 aClass668_8493;
    static Class668 aClass668_8494;
    public static Class668 aClass668_8495
	= new Class668("EN", "en", "English", ModeWhere.LIVE, 0,
		       "GB");
    public static Class668 aClass668_8496;
    String aString8497;
    public static final int anInt8498 = 7;
    static Class668[] aClass668Array8499;
    public int anInt8500;
    Locale aLocale8501;
    public static Class668 aClass668_8502;
    
    public String method7911() {
	return method7912(413110701).toLowerCase(Locale.ENGLISH);
    }
    
    String method7912(int i) {
	return ((Class668) this).aString8492;
    }
    
    public String toString() {
	return method7912(-1856230640).toLowerCase(Locale.ENGLISH);
    }
    
    public int method68() {
	return anInt8500 * 1736046843;
    }
    
    Class668(String string, String string_0_, String string_1_,
	     ModeWhere modeWhere, int i, String string_2_) {
	((Class668) this).aString8497 = string;
	((Class668) this).aString8492 = string_0_;
	anInt8500 = i * -160869837;
	if (null != string_2_)
	    ((Class668) this).aLocale8501
		= new Locale(string_0_.substring(0, 2), string_2_);
	else
	    ((Class668) this).aLocale8501
		= new Locale(string_0_.substring(0, 2));
    }
    
    public static Class668 method7913(int i, int i_3_) {
	if (i < 0 || i >= aClass668Array8499.length)
	    return null;
	return aClass668Array8499[i];
    }
    
    static {
	aClass668_8490 = new Class668("DE", "de", "German",
				      ModeWhere.LIVE, 1, "DE");
	aClass668_8491 = new Class668("FR", "fr", "French",
				      ModeWhere.LIVE, 2, "FR");
	aClass668_8493 = new Class668("PT", "pt", "Portuguese",
				      ModeWhere.LIVE, 3, "BR");
	aClass668_8494 = new Class668("NL", "nl", "Dutch",
				      ModeWhere.aClass665_8464, 4, "NL");
	aClass668_8502 = new Class668("ES", "es", "Spanish",
				      ModeWhere.aClass665_8464, 5, "ES");
	aClass668_8496
	    = new Class668("ES_MX", "es-mx", "Spanish (Latin American)",
			   ModeWhere.LIVE, 6, "MX");
	Class668[] class668s = method7918(1539435562);
	aClass668Array8499 = new Class668[class668s.length];
	Class668[] class668s_4_ = class668s;
	for (int i = 0; i < class668s_4_.length; i++) {
	    Class668 class668 = class668s_4_[i];
	    if (null != aClass668Array8499[1736046843 * class668.anInt8500])
		throw new IllegalStateException();
	    aClass668Array8499[class668.anInt8500 * 1736046843] = class668;
	}
    }
    
    public int method5() {
	return anInt8500 * 1736046843;
    }
    
    public int method6() {
	return anInt8500 * 1736046843;
    }
    
    public String method7914() {
	return method7912(-1594646302).toLowerCase(Locale.ENGLISH);
    }
    
    String method7915() {
	return ((Class668) this).aString8492;
    }
    
    public int method73() {
	return anInt8500 * 1736046843;
    }
    
    static final void method7916(Class648 class648, byte i) {
	int i_5_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	if (!Class587.aClass173_7714.method2164())
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= 3;
	else
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= Class514.aClass528_Sub38_6967.aClass691_Sub19_10601
		      .method8126(i_5_, -1955030095);
    }
    
    public String method7917() {
	return method7912(-1909829584).toLowerCase(Locale.ENGLISH);
    }
    
    public static Class668[] method7918(int i) {
	return new Class668[] { aClass668_8496, aClass668_8495, aClass668_8494,
				aClass668_8502, aClass668_8491, aClass668_8493,
				aClass668_8490 };
    }
    
    public String method7919() {
	return method7912(1963423286).toLowerCase(Locale.ENGLISH);
    }
    
    String method7920() {
	return ((Class668) this).aString8492;
    }
    
    public Locale method7921(int i) {
	return ((Class668) this).aLocale8501;
    }
    
    public int method71() {
	return anInt8500 * 1736046843;
    }
    
    static final void method7922(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class514.aClass528_Sub38_6967.aClass691_Sub34_10604
		  .method10132((byte) 52);
    }
    
    public int method72() {
	return anInt8500 * 1736046843;
    }
    
    public static void method7923(int i) {
	Class423.anInt4783 = 0;
	Class423.anInt4782 = 0;
    }
    
    public static int method7924(int i) {
	if (-1 == -681367775 * Class52.anInt616) {
	    Class52[] class52s = Class2.method507(146049478);
	    for (int i_6_ = 0; i_6_ < class52s.length; i_6_++) {
		Class52 class52 = class52s[i_6_];
		if (-1309453659 * ((Class52) class52).anInt614
		    > -681367775 * Class52.anInt616)
		    Class52.anInt616
			= ((Class52) class52).anInt614 * -1060851963;
	    }
	    Class52.anInt616 += 1311972577;
	}
	return Class52.anInt616 * -681367775;
    }
    
    static final void method7925(Class648 class648, byte i) {
	Class304.method4048(class648,
			    Class108.myPlayer,
			    -551281779);
    }
}
