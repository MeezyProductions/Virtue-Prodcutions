/* Class292 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class292 implements Runnable
{
    int anInt3201;
    String aString3202;
    long aLong3203;
    Interface28 anInterface28_3204;
    volatile boolean aBool3205;
    int anInt3206;
    long aLong3207;
    String aString3208;
    Interface28 anInterface28_3209 = new Class290();
    Class286 aClass286_3210;
    boolean aBool3211;
    
    int method3904(int i) {
	return ((Class292) this).anInt3206 * -1791827941;
    }
    
    void method3905() {
	((Class292) this).aBool3205 = true;
    }
    
    synchronized void method3906(int i) {
	((Class292) this).aBool3211 = true;
    }
    
    synchronized boolean method3907(int i) {
	return (((Class292) this).anInterface28_3209.method150
		(((Class292) this).aLong3203 * -826665480289503019L));
    }
    
    synchronized void method3908(Interface28 interface28, int i) {
	((Class292) this).anInterface28_3204
	    = ((Class292) this).anInterface28_3209;
	((Class292) this).anInterface28_3209 = interface28;
	((Class292) this).aLong3203
	    = Class249.method3417(1955613299) * -3229529570863529859L;
    }
    
    synchronized void method3909() {
	((Class292) this).aBool3211 = true;
    }
    
    public int method3910(int i) {
	if (null == ((Class292) this).aClass286_3210)
	    return 0;
	int i_0_ = ((Class292) this).aClass286_3210.anInt3143 * -2117598397;
	if (((Class286) ((Class292) this).aClass286_3210).aBool3153
	    && (((Class292) this).anInt3201 * -1950038377
		< (((Class286) ((Class292) this).aClass286_3210).anInt3147
		   * -1615773921)))
	    return -1950038377 * ((Class292) this).anInt3201 + 1;
	if (i_0_ < 0 || i_0_ >= Class293.aClass286Array3212.length - 1)
	    return 100;
	if (((Class292) this).anInt3201 * -1950038377
	    == (402322775
		* ((Class286) ((Class292) this).aClass286_3210).anInt3129))
	    return (-1615773921
		    * ((Class286) ((Class292) this).aClass286_3210).anInt3147);
	return (402322775
		* ((Class286) ((Class292) this).aClass286_3210).anInt3129);
    }
    
    public void run() {
	while (!((Class292) this).aBool3205) {
	    long l = Class249.method3417(2013012467);
	    synchronized (this) {
		try {
		    ((Class292) this).anInt3206 += 1728969235;
		    if (((Class292) this).anInterface28_3209
			instanceof Class290)
			((Class292) this).anInterface28_3209.method146
			    (((Class292) this).aBool3211, 1318450558);
		    else {
			long l_1_ = Class249.method3417(1971453982);
			if (null != Class587.aClass173_7714
			    && ((Class292) this).anInterface28_3204 != null
			    && ((Class292) this).anInterface28_3204
				   .method160(-232476484) != 0
			    && ((-826665480289503019L
				 * ((Class292) this).aLong3203)
				>= (l_1_
				    - (long) ((Class292) this)
						 .anInterface28_3204
						 .method160(-2048549782)))) {
			    int i
				= (int) ((l_1_ - (((Class292) this).aLong3203
						  * -826665480289503019L))
					 * 255L
					 / (long) ((Class292) this)
						      .anInterface28_3204
						      .method160(-319309409));
			    int i_2_ = 255 - i;
			    i = i << 24 | 0xffffff;
			    i_2_ = i_2_ << 24 | 0xffffff;
			    Class162.method2068((byte) 2);
			    Class587.aClass173_7714.method2268(1, 0);
			    Class151 class151
				= (Class587.aClass173_7714.method2230
				   (Class411.anInt4713 * -1117838587,
				    Class509.anInt6933 * -2142152407, true,
				    (byte) 15));
			    Class163_Sub1 class163_sub1
				= Class587.aClass173_7714.method2236();
			    class163_sub1.method8898(0, class151.method1769());
			    Class587.aClass173_7714.method2179(class163_sub1,
							       -1626581653);
			    ((Class292) this).anInterface28_3204
				.method146(true, 1318450558);
			    Class587.aClass173_7714.method2180(class163_sub1,
							       -1742316701);
			    class151.method1780(0, 0, 0, i_2_, 1);
			    Class587.aClass173_7714.method2179(class163_sub1,
							       -1096076926);
			    Class587.aClass173_7714.method2268(1, 0);
			    ((Class292) this).anInterface28_3209
				.method146(true, 1318450558);
			    Class587.aClass173_7714.method2180(class163_sub1,
							       748134849);
			    class151.method1780(0, 0, 0, i, 1);
			} else {
			    if (((Class292) this).anInterface28_3204 != null) {
				((Class292) this).aBool3211 = true;
				((Class292) this).anInterface28_3204
				    .method154(1926870089);
				((Class292) this).anInterface28_3204 = null;
			    }
			    if (((Class292) this).aBool3211) {
				Class162.method2068((byte) 2);
				if (Class587.aClass173_7714 != null)
				    Class587.aClass173_7714.method2268(1, 0);
			    }
			    ((Class292) this).anInterface28_3209.method146
				((((Class292) this).aBool3211
				  || (null != Class587.aClass173_7714
				      && Class587.aClass173_7714
					     .method2161())),
				 1318450558);
			}
			try {
			    if (Class587.aClass173_7714 != null
				&& !(((Class292) this).anInterface28_3209
				     instanceof Class290))
				Class587.aClass173_7714.method2273(1956128100);
			} catch (Exception_Sub5 exception_sub5) {
			    VarDomainType.method5340
				(new StringBuilder().append
				     (exception_sub5.getMessage()).append
				     (Class326.aclient3497
					  .method6214(2029232025))
				     .toString(),
				 exception_sub5, 1774834120);
			    Class186.method2754(0, true, 97376937);
			}
		    }
		    ((Class292) this).aBool3211 = false;
		    if (null != Class587.aClass173_7714
			&& !(((Class292) this).anInterface28_3209
			     instanceof Class290)
			&& ((((Class292) this).aClass286_3210.anInt3143
			     * -2117598397)
			    < Class286.aClass286_3150.anInt3143 * -2117598397))
			Class696.method8190(-612493519);
		} catch (Exception exception) {
		    continue;
		}
	    }
	    long l_3_ = Class249.method3417(1964786838);
	    int i = (int) (20L - (l_3_ - l));
	    if (i > 0)
		Class511_Sub1.method9241((long) i);
	}
    }
    
    public String method3911(byte i) {
	return ((Class292) this).aString3208;
    }
    
    public String method3912(int i) {
	return ((Class292) this).aString3202;
    }
    
    synchronized boolean method3913() {
	return (((Class292) this).anInterface28_3209.method150
		(((Class292) this).aLong3203 * -826665480289503019L));
    }
    
    public Class286 method3914(int i) {
	return ((Class292) this).aClass286_3210;
    }
    
    void method3915(int i) {
	((Class292) this).aBool3205 = true;
    }
    
    public int method3916() {
	if (null == ((Class292) this).aClass286_3210)
	    return 0;
	int i = ((Class292) this).aClass286_3210.anInt3143 * -2117598397;
	if (((Class286) ((Class292) this).aClass286_3210).aBool3153
	    && (((Class292) this).anInt3201 * -1950038377
		< (((Class286) ((Class292) this).aClass286_3210).anInt3147
		   * -1615773921)))
	    return -1950038377 * ((Class292) this).anInt3201 + 1;
	if (i < 0 || i >= Class293.aClass286Array3212.length - 1)
	    return 100;
	if (((Class292) this).anInt3201 * -1950038377
	    == (402322775
		* ((Class286) ((Class292) this).aClass286_3210).anInt3129))
	    return (-1615773921
		    * ((Class286) ((Class292) this).aClass286_3210).anInt3147);
	return (402322775
		* ((Class286) ((Class292) this).aClass286_3210).anInt3129);
    }
    
    public void method3917() {
	while (!((Class292) this).aBool3205) {
	    long l = Class249.method3417(2015702010);
	    synchronized (this) {
		try {
		    ((Class292) this).anInt3206 += 1728969235;
		    if (((Class292) this).anInterface28_3209
			instanceof Class290)
			((Class292) this).anInterface28_3209.method146
			    (((Class292) this).aBool3211, 1318450558);
		    else {
			long l_4_ = Class249.method3417(2001305751);
			if (null != Class587.aClass173_7714
			    && ((Class292) this).anInterface28_3204 != null
			    && ((Class292) this).anInterface28_3204
				   .method160(-1664793290) != 0
			    && ((-826665480289503019L
				 * ((Class292) this).aLong3203)
				>= l_4_ - (long) ((Class292) this)
						     .anInterface28_3204
						     .method160(425940449))) {
			    int i
				= (int) ((l_4_ - (((Class292) this).aLong3203
						  * -826665480289503019L))
					 * 255L
					 / (long) ((Class292) this)
						      .anInterface28_3204
						      .method160(-1435501765));
			    int i_5_ = 255 - i;
			    i = i << 24 | 0xffffff;
			    i_5_ = i_5_ << 24 | 0xffffff;
			    Class162.method2068((byte) 2);
			    Class587.aClass173_7714.method2268(1, 0);
			    Class151 class151
				= (Class587.aClass173_7714.method2230
				   (Class411.anInt4713 * -1117838587,
				    Class509.anInt6933 * -2142152407, true,
				    (byte) 15));
			    Class163_Sub1 class163_sub1
				= Class587.aClass173_7714.method2236();
			    class163_sub1.method8898(0, class151.method1769());
			    Class587.aClass173_7714.method2179(class163_sub1,
							       566413204);
			    ((Class292) this).anInterface28_3204
				.method146(true, 1318450558);
			    Class587.aClass173_7714.method2180(class163_sub1,
							       -865033152);
			    class151.method1780(0, 0, 0, i_5_, 1);
			    Class587.aClass173_7714.method2179(class163_sub1,
							       -1172027632);
			    Class587.aClass173_7714.method2268(1, 0);
			    ((Class292) this).anInterface28_3209
				.method146(true, 1318450558);
			    Class587.aClass173_7714.method2180(class163_sub1,
							       -326058703);
			    class151.method1780(0, 0, 0, i, 1);
			} else {
			    if (((Class292) this).anInterface28_3204 != null) {
				((Class292) this).aBool3211 = true;
				((Class292) this).anInterface28_3204
				    .method154(1926870089);
				((Class292) this).anInterface28_3204 = null;
			    }
			    if (((Class292) this).aBool3211) {
				Class162.method2068((byte) 2);
				if (Class587.aClass173_7714 != null)
				    Class587.aClass173_7714.method2268(1, 0);
			    }
			    ((Class292) this).anInterface28_3209.method146
				((((Class292) this).aBool3211
				  || (null != Class587.aClass173_7714
				      && Class587.aClass173_7714
					     .method2161())),
				 1318450558);
			}
			try {
			    if (Class587.aClass173_7714 != null
				&& !(((Class292) this).anInterface28_3209
				     instanceof Class290))
				Class587.aClass173_7714.method2273(1956128100);
			} catch (Exception_Sub5 exception_sub5) {
			    VarDomainType.method5340
				(new StringBuilder().append
				     (exception_sub5.getMessage()).append
				     (Class326.aclient3497
					  .method6214(1953690233))
				     .toString(),
				 exception_sub5, 1954780617);
			    Class186.method2754(0, true, 33349843);
			}
		    }
		    ((Class292) this).aBool3211 = false;
		    if (null != Class587.aClass173_7714
			&& !(((Class292) this).anInterface28_3209
			     instanceof Class290)
			&& ((((Class292) this).aClass286_3210.anInt3143
			     * -2117598397)
			    < Class286.aClass286_3150.anInt3143 * -2117598397))
			Class696.method8190(928432685);
		} catch (Exception exception) {
		    continue;
		}
	    }
	    long l_6_ = Class249.method3417(2053314412);
	    int i = (int) (20L - (l_6_ - l));
	    if (i > 0)
		Class511_Sub1.method9241((long) i);
	}
    }
    
    synchronized void method3918() {
	((Class292) this).aBool3211 = true;
    }
    
    public long method3919(int i) {
	return -608708609963514703L * ((Class292) this).aLong3207;
    }
    
    synchronized boolean method3920() {
	return (((Class292) this).anInterface28_3209.method150
		(((Class292) this).aLong3203 * -826665480289503019L));
    }
    
    synchronized boolean method3921() {
	return (((Class292) this).anInterface28_3209.method150
		(((Class292) this).aLong3203 * -826665480289503019L));
    }
    
    public int method3922(int i) {
	return ((Class292) this).anInt3201 * -1950038377;
    }
    
    public int method3923() {
	if (null == ((Class292) this).aClass286_3210)
	    return 0;
	int i = ((Class292) this).aClass286_3210.anInt3143 * -2117598397;
	if (((Class286) ((Class292) this).aClass286_3210).aBool3153
	    && (((Class292) this).anInt3201 * -1950038377
		< (((Class286) ((Class292) this).aClass286_3210).anInt3147
		   * -1615773921)))
	    return -1950038377 * ((Class292) this).anInt3201 + 1;
	if (i < 0 || i >= Class293.aClass286Array3212.length - 1)
	    return 100;
	if (((Class292) this).anInt3201 * -1950038377
	    == (402322775
		* ((Class286) ((Class292) this).aClass286_3210).anInt3129))
	    return (-1615773921
		    * ((Class286) ((Class292) this).aClass286_3210).anInt3147);
	return (402322775
		* ((Class286) ((Class292) this).aClass286_3210).anInt3129);
    }
    
    public int method3924() {
	if (null == ((Class292) this).aClass286_3210)
	    return 0;
	int i = ((Class292) this).aClass286_3210.anInt3143 * -2117598397;
	if (((Class286) ((Class292) this).aClass286_3210).aBool3153
	    && (((Class292) this).anInt3201 * -1950038377
		< (((Class286) ((Class292) this).aClass286_3210).anInt3147
		   * -1615773921)))
	    return -1950038377 * ((Class292) this).anInt3201 + 1;
	if (i < 0 || i >= Class293.aClass286Array3212.length - 1)
	    return 100;
	if (((Class292) this).anInt3201 * -1950038377
	    == (402322775
		* ((Class286) ((Class292) this).aClass286_3210).anInt3129))
	    return (-1615773921
		    * ((Class286) ((Class292) this).aClass286_3210).anInt3147);
	return (402322775
		* ((Class286) ((Class292) this).aClass286_3210).anInt3129);
    }
    
    public int method3925() {
	return ((Class292) this).anInt3201 * -1950038377;
    }
    
    public String method3926() {
	return ((Class292) this).aString3208;
    }
    
    synchronized void method3927(long l, String string, String string_7_,
				 int i, Class286 class286, int i_8_) {
	((Class292) this).aLong3207 = -5568884875418885039L * l;
	((Class292) this).aString3202 = string;
	((Class292) this).aString3208 = string_7_;
	((Class292) this).anInt3201 = -595125977 * i;
	((Class292) this).aClass286_3210 = class286;
    }
    
    Class292() {
	((Class292) this).anInterface28_3204 = null;
    }
    
    static boolean method3928(String string, int i, int i_9_) {
	return Class298.method3988(string, i, "openjs", 328379382);
    }
    
    static final void method3929(Class648 class648, byte i) {
	int i_10_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_10_, (byte) -38);
	Class226 class226 = Class380.aClass226Array3970[i_10_ >> 16];
	Class560.method6817(class229, class226, class648,
			    Class227.aClass227_2341, (byte) 20);
    }
    
    static final void method3930(Class648 class648, byte i) {
	((Class648) class648).anInt8395 -= -1816921966;
	int i_11_ = (((Class648) class648).anIntArray8394
		     [((Class648) class648).anInt8395 * 717927929]);
	int i_12_ = (((Class648) class648).anIntArray8394
		     [1 + ((Class648) class648).anInt8395 * 717927929]);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = (Class196.aClass447_2200.method5401(i_11_, -438432000)
	       .anIntArray11540[i_12_]);
    }
    
    static final void method3931(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class514.aClass528_Sub38_6967.aClass691_Sub27_10567
		  .method10040((byte) -112);
    }
    
    static final void method3932(Class648 class648, short i) {
	String string = (String) (((Class648) class648).anObjectArray8396
				  [(((Class648) class648).anInt8410
				    -= 1600226731) * -520794877]);
	((Class648) class648).anInt8395 -= -1816921966;
	int i_13_ = (((Class648) class648).anIntArray8394
		     [717927929 * ((Class648) class648).anInt8395]);
	int i_14_ = (((Class648) class648).anIntArray8394
		     [1 + 717927929 * ((Class648) class648).anInt8395]);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = string.indexOf(i_13_, i_14_);
    }
}
