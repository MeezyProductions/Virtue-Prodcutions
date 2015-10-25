/* Class372 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;


public class Class372 implements Interface47
{
    public int anInt3884;
    public Class381 aClass381_3885;
    public Class377 aClass377_3886;
    public int anInt3887;
    public int anInt3888;
    
    @Override
	public Class379 method330() {
	return Class379.aClass379_3960;
    }
    
    @Override
	public Class379 method331(int i) {
	return Class379.aClass379_3960;
    }
    
    Class372(int i, Class381 class381, Class377 class377, int i_0_, int i_1_) {
	anInt3887 = -323803377 * i;
	aClass381_3885 = class381;
	aClass377_3886 = class377;
	anInt3888 = i_0_ * 1356087043;
	anInt3884 = -1705069239 * i_1_;
    }
    
    public static void method4676(Class173 class173, long l) {
	if (3 != Class581.anInt7630 * -244674793
	    && 0 != -244674793 * Class581.anInt7630) {
	    if (1 == -244674793 * Class581.anInt7630) {
		if (Class581.aStringArray7631 == null
		    || 0 == Class581.aStringArray7631.length)
		    throw new RuntimeException("");
		int i = 0;
		for (int i_2_ = 0; i_2_ < Class581.aStringArray7631.length;
		     i_2_++) {
		    if (Class581.aStringArray7631[i_2_] != null) {
			try {
			    i += (Class605.aClass525_7916.method6384
				  (Class581.aStringArray7631[i_2_],
				   1285973504));
			} catch (Exception_Sub7 exception_sub7) {
			    Class33.method761(Class67.aClass67_763,
					      exception_sub7.aString11223,
					      (1878010781
					       * exception_sub7.anInt11224),
					      exception_sub7.getCause(),
					      (byte) 127);
			    Class581.anInt7630 = -701183499;
			    return;
			}
		    } else
			i += 100;
		}
		Class581.anInt7629
		    = -1130063399 * (i / Class581.aStringArray7631.length);
		if (Class581.anInt7629 * -58829207 == 100) {
		    Class581.anInt7630
			= Class269.method3677(1559146962) * -233727833;
		    if (Class581.anInt7630 * -244674793 != 2)
			return;
		} else
		    return;
	    }
	    TwitchEvent[] twitchevents = Canvas_Sub1.aTwitchTV11693.Service();
	    if (twitchevents != null) {
		for (int i = 0; i < twitchevents.length; i++) {
		    TwitchEvent twitchevent = twitchevents[i];
		    if (null != twitchevent
			&& Class223.method3161(twitchevent, l)) {
			Class571 class571 = twitchevent.method4837();
			if (class571 != null)
			    Class630.method7526(class571.method68(),
						twitchevent, 1003943554);
		    }
		}
	    }
	    if (Canvas_Sub1.aTwitchTV11693.IsStreaming()
		&& (l - 8409090311343079139L * Class581.aLong7615
		    > -1764066874199068401L * Class278.aLong3051)) {
		Class581.aLong7615 = l * -6979641754184403253L;
		if (class173.method2188())
		    Class581.aBool7637 = true;
	    }
	    if (Canvas_Sub1.aTwitchTV11693.IsStreaming()) {
		if (l - -7642190462102646613L * Class581.aLong7644
		    < Class581.anInt7636 * -1272051643)
		    Class581.anInt7638 = 271126774;
		else if (l - Class581.aLong7635 * -2620733109595218817L
			 < Class581.anInt7636 * -1272051643)
		    Class581.anInt7638 = -2011920261;
		else
		    Class581.anInt7638 = 0;
	    } else
		Class581.anInt7638 = 0;
	    if ((l - Class581.aLong7619 * 7775449292391149555L
		 > -1767562195 * Class581.anInt7627)
		&& Canvas_Sub1.aTwitchTV11693.GetWebcamState() == 5) {
		Canvas_Sub1.aTwitchTV11693.RestartWebcamDevice();
		Class581.aLong7619 = -7131929054418058949L * l;
	    }
	}
    }
    
    static final void method4677(Class229 class229, Class226 class226,
				 Class648 class648, int i) {
	String string = (String) (class648.anObjectArray8396
				  [(class648.anInt8410
				    -= 1600226731) * -520794877]);
	if (Class494.method5957(string, class648, (short) 520) != null)
	    string = string.substring(0, string.length() - 1);
	class229.anObjectArray2487
	    = Class181_Sub23.method8999(string, class648, (byte) -16);
	class229.aBool2483 = true;
    }
    
    static final void method4678(int i) {
	Iterator iterator = client.aClass692_11044.iterator();
	while (iterator.hasNext()) {
	    Class528_Sub21_Sub19 class528_sub21_sub19
		= (Class528_Sub21_Sub19) iterator.next();
	    Class645_Sub1_Sub5_Sub4 class645_sub1_sub5_sub4
		= (class528_sub21_sub19
		   .aClass645_Sub1_Sub5_Sub4_11688);
	    class645_sub1_sub5_sub4.method10847(1, 219867759);
	    if (class645_sub1_sub5_sub4.method10849((byte) -85)) {
		class528_sub21_sub19.method6443(-913894512);
		class645_sub1_sub5_sub4.method10848(329746089);
	    }
	}
    }
    
    public static int method4679(int i) {
	return Class184.aClass622_2103.aBool8097 ? 6 : 4;
    }
    
    static Class554 method4680(int i, int i_3_, int i_4_, Class157 class157,
			       int i_5_) {
	if (null == class157)
	    return null;
	Class554 class554
	    = new Class554(i, i_3_, i_4_, class157.method1937(),
			   class157.method1902(), class157.method1882(),
			   class157.method2018(), class157.method1905(),
			   class157.method1900(), class157.method2004());
	return class554;
    }
    
    static final void method4681(Class648 class648, int i) {
	class648.anInt8395 -= -1816921966;
	int i_6_ = (class648.anIntArray8394
		    [class648.anInt8395 * 717927929]);
	int i_7_ = (class648.anIntArray8394
		    [1 + class648.anInt8395 * 717927929]);
	class648.anIntArray8394
	    [(class648.anInt8395 += 1239022665) * 717927929 - 1]
	    = (Class196.aClass447_2200.method5401(i_6_, -438432000)
	       .aCharArray11539[i_7_]);
    }
}
