/* Class612 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Class612
{
    boolean aBool7974;
    List aList7975;
    int anInt7976;
    int anInt7977;
    long aLong7978;
    public boolean aBool7979 = false;
    Class511_Sub2_Sub1_Sub1[] aClass511_Sub2_Sub1_Sub1Array7980;
    int anInt7981;
    List aList7982;
    int anInt7983;
    boolean aBool7984;
    long aLong7985;
    boolean aBool7986;
    Class171 aClass171_7987;
    static boolean[] aBoolArray7988 = new boolean[64];
    static boolean[] aBoolArray7989 = new boolean[16];
    
    Class612(int i, boolean bool) {
	((Class612) this).aBool7974 = false;
	((Class612) this).anInt7977 = 0;
	((Class612) this).aList7975 = new LinkedList();
	((Class612) this).anInt7981 = 0;
	((Class612) this).aList7982 = new LinkedList();
	((Class612) this).anInt7983 = 0;
	((Class612) this).aBool7984 = false;
	((Class612) this).aBool7986 = false;
	((Class612) this).aClass171_7987 = new Class171();
	((Class612) this).aClass511_Sub2_Sub1_Sub1Array7980
	    = new Class511_Sub2_Sub1_Sub1[8192];
	method7302(i, bool);
    }
    
    void method7302(int i, boolean bool) {
	Class621.aList8063.add(this);
	((Class612) this).aLong7985 = (long) i;
	((Class612) this).aLong7978 = (long) i;
	((Class612) this).aBool7984 = true;
	((Class612) this).aBool7986 = bool;
    }
    
    public void method7303(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
	((Class612) this).anInt7976 = i;
    }
    
    public void method7304() {
	((Class612) this).aBool7974 = true;
    }
    
    public void method7305(long l) {
	((Class612) this).aLong7985 = l;
    }
    
    public void method7306(Class173 class173, long l, Class170[] class170s,
			   Class144[] class144s, boolean bool) {
	if (!aBool7979) {
	    method7307(class173, class170s, bool);
	    method7313(class144s, bool);
	    ((Class612) this).aLong7985 = l;
	}
    }
    
    void method7307(Class173 class173, Class170[] class170s, boolean bool) {
	for (int i = 0; i < 64; i++)
	    aBoolArray7988[i] = false;
	Iterator iterator = ((Class612) this).aList7975.iterator();
    while_74_:
	while (iterator.hasNext()) {
	    Class613 class613 = (Class613) iterator.next();
	    if (class170s != null) {
		for (int i = 0; i < class170s.length && i != 64; i++) {
		    if (((Class613) class613).aClass170_8002 == class170s[i]
			|| (((Class613) class613).aClass170_8002
			    == class170s[i].aClass170_1958)) {
			aBoolArray7988[i] = true;
			class613.method7327((byte) 99);
			((Class613) class613).aBool8003 = false;
			continue while_74_;
		    }
		}
	    }
	    if (!bool) {
		if (((Class613) class613).anInt7995 * 1297815417 == 0) {
		    iterator.remove();
		    ((Class612) this).anInt7981--;
		} else
		    ((Class613) class613).aBool8003 = true;
	    }
	}
	if (class170s != null) {
	    for (int i = 0; (i < class170s.length && i != 64
			     && ((Class612) this).anInt7981 != 64); i++) {
		if (!aBoolArray7988[i]) {
		    Class613 class613
			= new Class613(class173, class170s[i], this,
				       ((Class612) this).aLong7985);
		    ((Class612) this).aList7975.add(class613);
		    ((Class612) this).anInt7981++;
		    aBoolArray7988[i] = true;
		}
	    }
	}
    }
    
    void method7308() {
	aBool7979 = true;
	Iterator iterator = ((Class612) this).aList7982.iterator();
	while (iterator.hasNext()) {
	    Class528_Sub24 class528_sub24 = (Class528_Sub24) iterator.next();
	    if ((((Class528_Sub24) class528_sub24).aClass388_10417.anInt4084
		 * 1035648539)
		== 1)
		class528_sub24.method6443(-1514731932);
	}
	for (int i = 0;
	     i < ((Class612) this).aClass511_Sub2_Sub1_Sub1Array7980.length;
	     i++) {
	    if (((Class612) this).aClass511_Sub2_Sub1_Sub1Array7980[i]
		!= null) {
		((Class612) this).aClass511_Sub2_Sub1_Sub1Array7980[i]
		    .method10810();
		((Class612) this).aClass511_Sub2_Sub1_Sub1Array7980[i] = null;
	    }
	}
	((Class612) this).anInt7977 = 0;
	((Class612) this).aList7975 = new LinkedList();
	((Class612) this).anInt7981 = 0;
	((Class612) this).aList7982 = new LinkedList();
	((Class612) this).anInt7983 = 0;
    }
    
    public Class171 method7309() {
	((Class612) this).aClass171_7987.aClass685_1959
	    .method8012(-1985855632);
	for (int i = 0;
	     i < ((Class612) this).aClass511_Sub2_Sub1_Sub1Array7980.length;
	     i++) {
	    if (((Class612) this).aClass511_Sub2_Sub1_Sub1Array7980[i] != null
		&& (((Class511_Sub2_Sub1_Sub1)
		     ((Class612) this).aClass511_Sub2_Sub1_Sub1Array7980[i])
		    .aClass613_11945) != null)
		((Class612) this).aClass171_7987.aClass685_1959.method8010
		    (((Class612) this).aClass511_Sub2_Sub1_Sub1Array7980[i],
		     (byte) 0);
	}
	return ((Class612) this).aClass171_7987;
    }
    
    void method7310() {
	((Class612) this).aBool7974 = false;
    }
    
    void method7311(Class538 class538, Class173 class173) {
	((Class612) this).aClass171_7987.aClass685_1959.method8012(-15252756);
	Iterator iterator = ((Class612) this).aList7975.iterator();
	while (iterator.hasNext()) {
	    Class613 class613 = (Class613) iterator.next();
	    class613.method7329(class538, class173,
				((Class612) this).aLong7978);
	}
    }
    
    public Class171 method7312() {
	return ((Class612) this).aClass171_7987;
    }
    
    void method7313(Class144[] class144s, boolean bool) {
	for (int i = 0; i < 16; i++)
	    aBoolArray7989[i] = false;
	Iterator iterator = ((Class612) this).aList7982.iterator();
    while_75_:
	while (iterator.hasNext()) {
	    Class528_Sub24 class528_sub24 = (Class528_Sub24) iterator.next();
	    if (class144s != null) {
		for (int i = 0; i < class144s.length; i++) {
		    if ((((Class528_Sub24) class528_sub24).aClass144_10412
			 == class144s[i])
			|| (((Class528_Sub24) class528_sub24).aClass144_10412
			    == class144s[i].aClass144_1646)) {
			aBoolArray7989[i] = true;
			class528_sub24.method9441(234123070);
			continue while_75_;
		    }
		}
	    }
	    if (!bool) {
		class528_sub24.method6443(-867588466);
		((Class612) this).anInt7983--;
		if (class528_sub24.method6441(-219181626)) {
		    class528_sub24.method6443(-366412077);
		    Class621.anInt8064 -= 1009025895;
		}
	    }
	}
	if (class144s != null) {
	    for (int i = 0; (i < class144s.length && i != 16
			     && ((Class612) this).anInt7983 != 16); i++) {
		if (!aBoolArray7989[i]) {
		    Class528_Sub24 class528_sub24 = null;
		    if (((class144s[i].method1712
			  (Class621.anInterface46_8069, (byte) 0).anInt4084)
			 * 1035648539) == 1
			&& Class621.anInt8064 * -1003558825 < 32) {
			class528_sub24
			    = new Class528_Sub24(class144s[i], this);
			Class621.aClass692_8062.method8142
			    (class528_sub24,
			     (long) (class144s[i].anInt1647 * 1343635647));
			Class621.anInt8064 += 1009025895;
		    }
		    if (class528_sub24 == null)
			class528_sub24
			    = new Class528_Sub24(class144s[i], this);
		    ((Class612) this).aList7982.add(class528_sub24);
		    ((Class612) this).anInt7983++;
		    aBoolArray7989[i] = true;
		}
	    }
	}
    }
    
    public void method7314() {
	((Class612) this).aBool7984 = true;
    }
    
    public static Class612 method7315(int i, boolean bool) {
	if (Class621.anInt8060 * 1552383849
	    != Class621.anInt8059 * -874082025) {
	    Class612 class612
		= Class621.aClass612Array8058[Class621.anInt8059 * -874082025];
	    Class621.anInt8059
		= ((Class621.anInt8059 * -874082025 + 1
		    & Class174.anIntArray2010[Class621.anInt8068 * 2094320943])
		   * -1229474137);
	    class612.method7302(i, bool);
	    return class612;
	}
	return new Class612(i, bool);
    }
    
    public void method7316() {
	((Class612) this).aBool7984 = true;
    }
    
    public void method7317() {
	((Class612) this).aBool7984 = true;
    }
    
    void method7318() {
	aBool7979 = true;
	Iterator iterator = ((Class612) this).aList7982.iterator();
	while (iterator.hasNext()) {
	    Class528_Sub24 class528_sub24 = (Class528_Sub24) iterator.next();
	    if ((((Class528_Sub24) class528_sub24).aClass388_10417.anInt4084
		 * 1035648539)
		== 1)
		class528_sub24.method6443(1935678815);
	}
	for (int i = 0;
	     i < ((Class612) this).aClass511_Sub2_Sub1_Sub1Array7980.length;
	     i++) {
	    if (((Class612) this).aClass511_Sub2_Sub1_Sub1Array7980[i]
		!= null) {
		((Class612) this).aClass511_Sub2_Sub1_Sub1Array7980[i]
		    .method10810();
		((Class612) this).aClass511_Sub2_Sub1_Sub1Array7980[i] = null;
	    }
	}
	((Class612) this).anInt7977 = 0;
	((Class612) this).aList7975 = new LinkedList();
	((Class612) this).anInt7981 = 0;
	((Class612) this).aList7982 = new LinkedList();
	((Class612) this).anInt7983 = 0;
    }
    
    public void method7319() {
	((Class612) this).aBool7974 = true;
    }
    
    void method7320() {
	aBool7979 = true;
	Iterator iterator = ((Class612) this).aList7982.iterator();
	while (iterator.hasNext()) {
	    Class528_Sub24 class528_sub24 = (Class528_Sub24) iterator.next();
	    if ((((Class528_Sub24) class528_sub24).aClass388_10417.anInt4084
		 * 1035648539)
		== 1)
		class528_sub24.method6443(1449414702);
	}
	for (int i = 0;
	     i < ((Class612) this).aClass511_Sub2_Sub1_Sub1Array7980.length;
	     i++) {
	    if (((Class612) this).aClass511_Sub2_Sub1_Sub1Array7980[i]
		!= null) {
		((Class612) this).aClass511_Sub2_Sub1_Sub1Array7980[i]
		    .method10810();
		((Class612) this).aClass511_Sub2_Sub1_Sub1Array7980[i] = null;
	    }
	}
	((Class612) this).anInt7977 = 0;
	((Class612) this).aList7975 = new LinkedList();
	((Class612) this).anInt7981 = 0;
	((Class612) this).aList7982 = new LinkedList();
	((Class612) this).anInt7983 = 0;
    }
    
    void method7321() {
	((Class612) this).aBool7974 = false;
    }
    
    public void method7322() {
	((Class612) this).aBool7974 = true;
    }
    
    void method7323() {
	((Class612) this).aBool7974 = false;
    }
    
    public void method7324() {
	((Class612) this).aBool7984 = true;
    }
    
    boolean method7325(Class173 class173, long l) {
	if (((Class612) this).aLong7985 != ((Class612) this).aLong7978)
	    method7304();
	else
	    method7310();
	if (l - ((Class612) this).aLong7985 > 750L) {
	    method7308();
	    return false;
	}
	int i = (int) (l - ((Class612) this).aLong7978);
	if (((Class612) this).aBool7984) {
	    Iterator iterator = ((Class612) this).aList7975.iterator();
	    while (iterator.hasNext()) {
		Class613 class613 = (Class613) iterator.next();
		for (int i_4_ = 0;
		     i_4_ < (((Class613) class613).aClass386_7991.anInt3991
			     * -1483823861);
		     i_4_++)
		    class613.method7328(class173, l, 1,
					!((Class612) this).aBool7974,
					1995796334);
	    }
	    ((Class612) this).aBool7984 = false;
	}
	Iterator iterator = ((Class612) this).aList7975.iterator();
	while (iterator.hasNext()) {
	    Class613 class613 = (Class613) iterator.next();
	    class613.method7328(class173, l, i, !((Class612) this).aBool7974,
				63619730);
	}
	((Class612) this).aLong7978 = l;
	return true;
    }
    
    void method7326() {
	((Class612) this).aBool7974 = false;
    }
}
