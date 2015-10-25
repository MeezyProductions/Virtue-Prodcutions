/* Class150 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class150
{
    boolean aBool1688;
    Class163_Sub1_Sub1 aClass163_Sub1_Sub1_1689;
    Class163_Sub1_Sub1 aClass163_Sub1_Sub1_1690;
    Class163_Sub1_Sub1 aClass163_Sub1_Sub1_1691;
    Class528_Sub21_Sub3 aClass528_Sub21_Sub3_1692;
    boolean aBool1693;
    int anInt1694;
    int anInt1695;
    boolean aBool1696;
    int anInt1697 = 0;
    boolean aBool1698;
    boolean aBool1699;
    Class173_Sub2 aClass173_Sub2_1700;
    Class688 aClass688_1701;
    Class120_Sub4[] aClass120_Sub4Array1702;
    Class120_Sub4 aClass120_Sub4_1703;
    int anInt1704;
    Class528_Sub21_Sub3 aClass528_Sub21_Sub3_1705;
    boolean aBool1706;
    int anInt1707;
    Class169 aClass169_1708;
    
    void method1731() {
	int i = 0;
	boolean bool = false;
	Class169 class169 = Class169.aClass169_1935;
	for (Class528_Sub8 class528_sub8
		 = ((Class528_Sub8)
		    ((Class150) this).aClass688_1701.method8034(1214032352));
	     class528_sub8 != null;
	     class528_sub8 = (Class528_Sub8) ((Class150) this)
						 .aClass688_1701
						 .method8037(821139790)) {
	    Class169 class169_0_ = class528_sub8.method9303();
	    if (class169_0_.anInt1942 * -1009481111
		> class169.anInt1942 * -1009481111)
		class169 = class169_0_;
	    bool |= class528_sub8.method9301();
	    i += class528_sub8.method9300();
	}
	if (class169 != ((Class150) this).aClass169_1708) {
	    ((Class150) this).aClass169_1708 = class169;
	    ((Class150) this).aBool1698 = true;
	}
	int i_1_ = (((Class150) this).anInt1707 > 2 ? 2
		    : ((Class150) this).anInt1707);
	int i_2_ = i > 2 ? 2 : i;
	if (i_1_ != i_2_) {
	    ((Class150) this).aBool1698 = true;
	    ((Class150) this).aBool1688 = true;
	}
	if (bool != ((Class150) this).aBool1706) {
	    ((Class150) this).aBool1706 = bool;
	    ((Class150) this).aBool1699 = true;
	}
	((Class150) this).anInt1707 = i;
    }
    
    void method1732() {
	((Class150) this).aClass163_Sub1_Sub1_1689 = null;
	((Class150) this).aClass163_Sub1_Sub1_1690 = null;
	((Class150) this).aClass163_Sub1_Sub1_1691 = null;
	((Class150) this).aClass528_Sub21_Sub3_1705 = null;
	((Class150) this).aClass120_Sub4_1703 = null;
	((Class150) this).aClass120_Sub4Array1702 = null;
	((Class150) this).aClass528_Sub21_Sub3_1692 = null;
	if (!((Class150) this).aClass688_1701.method8040((byte) -118)) {
	    for (Node node
		     = ((Class150) this).aClass688_1701.method8034(1254172360);
		 node != ((Class150) this).aClass688_1701.aClass528_8655;
		 node = node.aClass528_7106)
		((Class528_Sub8) node).method9296();
	}
	((Class150) this).anInt1704 = 1;
	((Class150) this).anInt1694 = 1;
    }
    
    boolean method1733() {
	return ((Class150) this).aBool1696;
    }
    
    boolean method1734() {
	for (Class528_Sub8 class528_sub8
		 = ((Class528_Sub8)
		    ((Class150) this).aClass688_1701.method8034(1726315934));
	     class528_sub8 != null;
	     class528_sub8 = (Class528_Sub8) ((Class150) this)
						 .aClass688_1701
						 .method8037(-1304329939)) {
	    if (!class528_sub8.method9305())
		return false;
	}
	return true;
    }
    
    boolean method1735() {
	if (((Class150) this).aBool1699) {
	    if (((Class150) this).aClass528_Sub21_Sub3_1705 != null) {
		((Class150) this).aClass528_Sub21_Sub3_1705.method115();
		((Class150) this).aClass528_Sub21_Sub3_1705 = null;
	    }
	    if (((Class150) this).aClass120_Sub4_1703 != null) {
		((Class150) this).aClass120_Sub4_1703.method1549();
		((Class150) this).aClass120_Sub4_1703 = null;
	    }
	}
	if (((Class150) this).aBool1698) {
	    if (((Class150) this).aClass528_Sub21_Sub3_1692 != null) {
		((Class150) this).aClass528_Sub21_Sub3_1692.method115();
		((Class150) this).aClass528_Sub21_Sub3_1692 = null;
	    }
	    if (((Class150) this).aClass120_Sub4Array1702[0] != null) {
		((Class150) this).aClass120_Sub4Array1702[0].method1549();
		((Class150) this).aClass120_Sub4Array1702[0] = null;
	    }
	    if (((Class150) this).aClass120_Sub4Array1702[1] != null) {
		((Class150) this).aClass120_Sub4Array1702[1].method1549();
		((Class150) this).aClass120_Sub4Array1702[1] = null;
	    }
	}
	if (((Class150) this).aBool1699) {
	    if (((Class150) this).aClass163_Sub1_Sub1_1690 != null)
		((Class150) this).aClass528_Sub21_Sub3_1705
		    = new Class528_Sub21_Sub3((((Class150) this)
					       .aClass173_Sub2_1700),
					      Class149.aClass149_1683,
					      Class169.aClass169_1937,
					      ((Class150) this).anInt1694,
					      ((Class150) this).anInt1704,
					      (((Class173_Sub2)
						(((Class150) this)
						 .aClass173_Sub2_1700))
					       .anInt9443));
	    if (((Class150) this).aBool1706)
		((Class150) this).aClass120_Sub4_1703
		    = new Class120_Sub4(((Class150) this).aClass173_Sub2_1700,
					34037, Class149.aClass149_1683,
					Class169.aClass169_1937,
					((Class150) this).anInt1694,
					((Class150) this).anInt1704);
	    else if (((Class150) this).aClass528_Sub21_Sub3_1705 == null)
		((Class150) this).aClass528_Sub21_Sub3_1705
		    = new Class528_Sub21_Sub3((((Class150) this)
					       .aClass173_Sub2_1700),
					      Class149.aClass149_1683,
					      Class169.aClass169_1937,
					      ((Class150) this).anInt1694,
					      ((Class150) this).anInt1704);
	    ((Class150) this).aBool1699 = false;
	    ((Class150) this).aBool1688 = true;
	    ((Class150) this).aBool1693 = true;
	}
	if (((Class150) this).aBool1698) {
	    if (((Class150) this).aClass163_Sub1_Sub1_1690 != null)
		((Class150) this).aClass528_Sub21_Sub3_1692
		    = new Class528_Sub21_Sub3((((Class150) this)
					       .aClass173_Sub2_1700),
					      Class149.aClass149_1676,
					      ((Class150) this).aClass169_1708,
					      ((Class150) this).anInt1694,
					      ((Class150) this).anInt1704,
					      (((Class173_Sub2)
						(((Class150) this)
						 .aClass173_Sub2_1700))
					       .anInt9443));
	    ((Class150) this).aClass120_Sub4Array1702[0]
		= new Class120_Sub4(((Class150) this).aClass173_Sub2_1700,
				    34037, Class149.aClass149_1676,
				    ((Class150) this).aClass169_1708,
				    ((Class150) this).anInt1694,
				    ((Class150) this).anInt1704);
	    ((Class150) this).aClass120_Sub4Array1702[1]
		= (((Class150) this).anInt1707 > 1
		   ? new Class120_Sub4(((Class150) this).aClass173_Sub2_1700,
				       34037, Class149.aClass149_1676,
				       ((Class150) this).aClass169_1708,
				       ((Class150) this).anInt1694,
				       ((Class150) this).anInt1704)
		   : null);
	    ((Class150) this).aBool1698 = false;
	    ((Class150) this).aBool1688 = true;
	    ((Class150) this).aBool1693 = true;
	}
	if (((Class150) this).aBool1688) {
	    if (((Class150) this).aClass163_Sub1_Sub1_1690 != null) {
		((Class150) this).aClass173_Sub2_1700.method2179
		    (((Class150) this).aClass163_Sub1_Sub1_1689, 655597111);
		((Class150) this).aClass163_Sub1_Sub1_1689.method8907(null);
		((Class150) this).aClass163_Sub1_Sub1_1689.method8898(0, null);
		((Class150) this).aClass163_Sub1_Sub1_1689.method8898(1, null);
		((Class150) this).aClass163_Sub1_Sub1_1689.method8898
		    (0, ((Class150) this).aClass120_Sub4Array1702[0]
			    .method8263(0));
		((Class150) this).aClass163_Sub1_Sub1_1689.method8898
		    (1, (((Class150) this).anInt1707 > 1
			 ? ((Class150) this).aClass120_Sub4Array1702[1]
			       .method8263(0)
			 : null));
		if (((Class150) this).aBool1706)
		    ((Class150) this).aClass163_Sub1_Sub1_1689.method8907
			(((Class150) this).aClass120_Sub4_1703.method8262(0));
		((Class150) this).aClass173_Sub2_1700.method2180
		    (((Class150) this).aClass163_Sub1_Sub1_1689, 1421353420);
		((Class150) this).aClass173_Sub2_1700.method2179
		    (((Class150) this).aClass163_Sub1_Sub1_1690, -1903324178);
		((Class150) this).aClass163_Sub1_Sub1_1690.method8907(null);
		((Class150) this).aClass163_Sub1_Sub1_1690.method8898(0, null);
		((Class150) this).aClass163_Sub1_Sub1_1690.method8898
		    (0, ((Class150) this).aClass528_Sub21_Sub3_1692);
		((Class150) this).aClass163_Sub1_Sub1_1690
		    .method8907(((Class150) this).aClass528_Sub21_Sub3_1705);
		((Class150) this).aClass173_Sub2_1700.method2180
		    (((Class150) this).aClass163_Sub1_Sub1_1690, 1758533965);
	    } else {
		((Class150) this).aClass173_Sub2_1700.method2179
		    (((Class150) this).aClass163_Sub1_Sub1_1689, -1796261209);
		((Class150) this).aClass163_Sub1_Sub1_1689.method8907(null);
		((Class150) this).aClass163_Sub1_Sub1_1689.method8898(0, null);
		((Class150) this).aClass163_Sub1_Sub1_1689.method8898(1, null);
		((Class150) this).aClass163_Sub1_Sub1_1689.method8898
		    (0, ((Class150) this).aClass120_Sub4Array1702[0]
			    .method8263(0));
		((Class150) this).aClass163_Sub1_Sub1_1689.method8898
		    (1, (((Class150) this).anInt1707 > 1
			 ? ((Class150) this).aClass120_Sub4Array1702[1]
			       .method8263(0)
			 : null));
		if (((Class150) this).aBool1706)
		    ((Class150) this).aClass163_Sub1_Sub1_1689.method8907
			(((Class150) this).aClass120_Sub4_1703.method8262(0));
		else
		    ((Class150) this).aClass163_Sub1_Sub1_1689.method8907
			(((Class150) this).aClass528_Sub21_Sub3_1705);
		((Class150) this).aClass173_Sub2_1700.method2180
		    (((Class150) this).aClass163_Sub1_Sub1_1689, -1104394718);
	    }
	    ((Class150) this).aBool1688 = false;
	    ((Class150) this).aBool1693 = true;
	}
	if (((Class150) this).aBool1693) {
	    ((Class150) this).aClass173_Sub2_1700.method2179
		(((Class150) this).aClass163_Sub1_Sub1_1691, 459423289);
	    ((Class150) this).aBool1693
		= !((Class150) this).aClass163_Sub1_Sub1_1691.method8897();
	    ((Class150) this).aClass173_Sub2_1700.method2180
		(((Class150) this).aClass163_Sub1_Sub1_1691, 2128511187);
	}
	return !((Class150) this).aBool1693;
    }
    
    void method1736() {
	int i = 0;
	boolean bool = false;
	Class169 class169 = Class169.aClass169_1935;
	for (Class528_Sub8 class528_sub8
		 = ((Class528_Sub8)
		    ((Class150) this).aClass688_1701.method8034(944908867));
	     class528_sub8 != null;
	     class528_sub8 = (Class528_Sub8) ((Class150) this)
						 .aClass688_1701
						 .method8037(-1983342267)) {
	    Class169 class169_3_ = class528_sub8.method9303();
	    if (class169_3_.anInt1942 * -1009481111
		> class169.anInt1942 * -1009481111)
		class169 = class169_3_;
	    bool |= class528_sub8.method9301();
	    i += class528_sub8.method9300();
	}
	if (class169 != ((Class150) this).aClass169_1708) {
	    ((Class150) this).aClass169_1708 = class169;
	    ((Class150) this).aBool1698 = true;
	}
	int i_4_ = (((Class150) this).anInt1707 > 2 ? 2
		    : ((Class150) this).anInt1707);
	int i_5_ = i > 2 ? 2 : i;
	if (i_4_ != i_5_) {
	    ((Class150) this).aBool1698 = true;
	    ((Class150) this).aBool1688 = true;
	}
	if (bool != ((Class150) this).aBool1706) {
	    ((Class150) this).aBool1706 = bool;
	    ((Class150) this).aBool1699 = true;
	}
	((Class150) this).anInt1707 = i;
    }
    
    boolean method1737(Class528_Sub8 class528_sub8) {
	if (((Class150) this).aClass163_Sub1_Sub1_1691 != null) {
	    if (class528_sub8.method9304() || class528_sub8.method9295()) {
		((Class150) this).aClass688_1701.method8031(class528_sub8,
							    (byte) 84);
		method1761();
		if (class528_sub8.method9312() >= 0 && method1735()) {
		    if (((Class150) this).anInt1694 != -1
			&& ((Class150) this).anInt1704 != -1)
			class528_sub8.method9297(((Class150) this).anInt1694,
						 ((Class150) this).anInt1704);
		    ((Class528_Sub8) class528_sub8).aBool10269 = true;
		    return true;
		}
	    }
	    method1739(class528_sub8);
	}
	return false;
    }
    
    void method1738() {
	((Class150) this).aClass163_Sub1_Sub1_1689 = null;
	((Class150) this).aClass163_Sub1_Sub1_1690 = null;
	((Class150) this).aClass163_Sub1_Sub1_1691 = null;
	((Class150) this).aClass528_Sub21_Sub3_1705 = null;
	((Class150) this).aClass120_Sub4_1703 = null;
	((Class150) this).aClass120_Sub4Array1702 = null;
	((Class150) this).aClass528_Sub21_Sub3_1692 = null;
	if (!((Class150) this).aClass688_1701.method8040((byte) -40)) {
	    for (Node node
		     = ((Class150) this).aClass688_1701.method8034(1305951169);
		 node != ((Class150) this).aClass688_1701.aClass528_8655;
		 node = node.aClass528_7106)
		((Class528_Sub8) node).method9296();
	}
	((Class150) this).anInt1704 = 1;
	((Class150) this).anInt1694 = 1;
    }
    
    void method1739(Class528_Sub8 class528_sub8) {
	((Class528_Sub8) class528_sub8).aBool10269 = false;
	class528_sub8.method9296();
	class528_sub8.method6443(1869165922);
	method1761();
    }
    
    void method1740(int i, int i_6_) {
	if (((Class150) this).aBool1696) {
	    if (((Class150) this).aClass163_Sub1_Sub1_1690 != null) {
		((Class150) this).aClass173_Sub2_1700.method2180
		    (((Class150) this).aClass163_Sub1_Sub1_1690, -1294362458);
		((Class150) this).aClass173_Sub2_1700.method2179
		    (((Class150) this).aClass163_Sub1_Sub1_1689, 214436181);
		((Class150) this).aClass163_Sub1_Sub1_1689.method10327(0);
		((Class150) this).aClass163_Sub1_Sub1_1690.method8900
		    (0, 0, ((Class150) this).anInt1694,
		     ((Class150) this).anInt1704, 0, 0, true,
		     ((Class150) this).aBool1706);
	    }
	    ((Class150) this).aClass173_Sub2_1700.method8807();
	    ((Class150) this).aClass173_Sub2_1700.method8788(0);
	    ((Class150) this).aClass173_Sub2_1700.method8776(1);
	    ((Class150) this).aClass173_Sub2_1700.method2203();
	    int i_7_ = 0;
	    int i_8_ = 1;
	    int i_9_ = 0;
	    int i_10_ = 0;
	    int i_11_ = 0;
	    Object object = null;
	    for (Class528_Sub8 class528_sub8
		     = (Class528_Sub8) ((Class150) this).aClass688_1701
					   .method8034(1121006788);
		 class528_sub8 != null;
		 class528_sub8
		     = (Class528_Sub8) ((Class150) this).aClass688_1701
					   .method8037(-1106706275)) {
		if (!class528_sub8.method9305())
		    i_10_++;
	    }
	    Class528_Sub8[] class528_sub8s = new Class528_Sub8[i_10_];
	    i_10_ = 0;
	    for (Class528_Sub8 class528_sub8
		     = (Class528_Sub8) ((Class150) this).aClass688_1701
					   .method8034(1197822625);
		 class528_sub8 != null;
		 class528_sub8
		     = (Class528_Sub8) ((Class150) this).aClass688_1701
					   .method8037(-465159297)) {
		if (!class528_sub8.method9305())
		    class528_sub8s[i_10_++] = class528_sub8;
	    }
	    while (i_9_ < i_10_) {
		for (int i_12_ = 0; i_12_ < i_10_; i_12_++) {
		    Class528_Sub8 class528_sub8 = class528_sub8s[i_12_];
		    if (class528_sub8.method9312() == i_11_) {
			int i_13_ = class528_sub8.method9300();
			for (int i_14_ = 0; i_14_ < i_13_; i_14_++) {
			    ((Class150) this).aClass173_Sub2_1700
				.method8873(0, 0);
			    class528_sub8.method9298(i_14_,
						     (((Class150) this)
						      .aClass120_Sub4Array1702
						      [i_7_]),
						     (((Class150) this)
						      .aClass120_Sub4_1703),
						     i_6_, i);
			    if (i_14_ == i_13_ - 1 && i_9_ == i_10_ - 1) {
				((Class150) this).aClass173_Sub2_1700
				    .method2180
				    ((((Class150) this)
				      .aClass163_Sub1_Sub1_1689),
				     -499513379);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F,
						    (float) (0
							     + (((Class150)
								 this)
								.anInt1704)));
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
				OpenGL.glVertex2i(((Class150) this).anInt1697,
						  ((Class150) this).anInt1695);
				OpenGL.glTexCoord2f(0.0F,
						    (float) ((((Class150) this)
							      .anInt1704)
							     - i_6_));
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glVertex2i(((Class150) this).anInt1697,
						  (((Class150) this).anInt1695
						   + i_6_));
				OpenGL.glTexCoord2f((float) (0 + i),
						    (float) ((((Class150) this)
							      .anInt1704)
							     - i_6_));
				OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
				OpenGL.glVertex2i((((Class150) this).anInt1697
						   + i),
						  (((Class150) this).anInt1695
						   + i_6_));
				OpenGL.glTexCoord2f((float) (0 + i),
						    (float) (0
							     + (((Class150)
								 this)
								.anInt1704)));
				OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
				OpenGL.glVertex2i((((Class150) this).anInt1697
						   + i),
						  ((Class150) this).anInt1695);
				OpenGL.glEnd();
			    } else {
				((Class150) this).aClass163_Sub1_Sub1_1689
				    .method10327(i_8_);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F,
						    (float) (((Class150) this)
							     .anInt1704));
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
				OpenGL.glVertex2i(0, 0);
				OpenGL.glTexCoord2f(0.0F,
						    (float) ((((Class150) this)
							      .anInt1704)
							     - i_6_));
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glVertex2i(0, i_6_);
				OpenGL.glTexCoord2f((float) i,
						    (float) ((((Class150) this)
							      .anInt1704)
							     - i_6_));
				OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
				OpenGL.glVertex2i(i, i_6_);
				OpenGL.glTexCoord2f((float) i,
						    (float) (((Class150) this)
							     .anInt1704));
				OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
				OpenGL.glVertex2i(i, 0);
				OpenGL.glEnd();
			    }
			    class528_sub8.method9299(i_14_);
			    i_8_ = i_8_ + 1 & 0x1;
			    i_7_ = i_7_ + 1 & 0x1;
			}
			i_9_++;
		    }
		}
		i_11_++;
	    }
	    ((Class150) this).aBool1696 = false;
	    object = null;
	}
    }
    
    boolean method1741() {
	if (((Class150) this).aBool1699) {
	    if (((Class150) this).aClass528_Sub21_Sub3_1705 != null) {
		((Class150) this).aClass528_Sub21_Sub3_1705.method115();
		((Class150) this).aClass528_Sub21_Sub3_1705 = null;
	    }
	    if (((Class150) this).aClass120_Sub4_1703 != null) {
		((Class150) this).aClass120_Sub4_1703.method1549();
		((Class150) this).aClass120_Sub4_1703 = null;
	    }
	}
	if (((Class150) this).aBool1698) {
	    if (((Class150) this).aClass528_Sub21_Sub3_1692 != null) {
		((Class150) this).aClass528_Sub21_Sub3_1692.method115();
		((Class150) this).aClass528_Sub21_Sub3_1692 = null;
	    }
	    if (((Class150) this).aClass120_Sub4Array1702[0] != null) {
		((Class150) this).aClass120_Sub4Array1702[0].method1549();
		((Class150) this).aClass120_Sub4Array1702[0] = null;
	    }
	    if (((Class150) this).aClass120_Sub4Array1702[1] != null) {
		((Class150) this).aClass120_Sub4Array1702[1].method1549();
		((Class150) this).aClass120_Sub4Array1702[1] = null;
	    }
	}
	if (((Class150) this).aBool1699) {
	    if (((Class150) this).aClass163_Sub1_Sub1_1690 != null)
		((Class150) this).aClass528_Sub21_Sub3_1705
		    = new Class528_Sub21_Sub3((((Class150) this)
					       .aClass173_Sub2_1700),
					      Class149.aClass149_1683,
					      Class169.aClass169_1937,
					      ((Class150) this).anInt1694,
					      ((Class150) this).anInt1704,
					      (((Class173_Sub2)
						(((Class150) this)
						 .aClass173_Sub2_1700))
					       .anInt9443));
	    if (((Class150) this).aBool1706)
		((Class150) this).aClass120_Sub4_1703
		    = new Class120_Sub4(((Class150) this).aClass173_Sub2_1700,
					34037, Class149.aClass149_1683,
					Class169.aClass169_1937,
					((Class150) this).anInt1694,
					((Class150) this).anInt1704);
	    else if (((Class150) this).aClass528_Sub21_Sub3_1705 == null)
		((Class150) this).aClass528_Sub21_Sub3_1705
		    = new Class528_Sub21_Sub3((((Class150) this)
					       .aClass173_Sub2_1700),
					      Class149.aClass149_1683,
					      Class169.aClass169_1937,
					      ((Class150) this).anInt1694,
					      ((Class150) this).anInt1704);
	    ((Class150) this).aBool1699 = false;
	    ((Class150) this).aBool1688 = true;
	    ((Class150) this).aBool1693 = true;
	}
	if (((Class150) this).aBool1698) {
	    if (((Class150) this).aClass163_Sub1_Sub1_1690 != null)
		((Class150) this).aClass528_Sub21_Sub3_1692
		    = new Class528_Sub21_Sub3((((Class150) this)
					       .aClass173_Sub2_1700),
					      Class149.aClass149_1676,
					      ((Class150) this).aClass169_1708,
					      ((Class150) this).anInt1694,
					      ((Class150) this).anInt1704,
					      (((Class173_Sub2)
						(((Class150) this)
						 .aClass173_Sub2_1700))
					       .anInt9443));
	    ((Class150) this).aClass120_Sub4Array1702[0]
		= new Class120_Sub4(((Class150) this).aClass173_Sub2_1700,
				    34037, Class149.aClass149_1676,
				    ((Class150) this).aClass169_1708,
				    ((Class150) this).anInt1694,
				    ((Class150) this).anInt1704);
	    ((Class150) this).aClass120_Sub4Array1702[1]
		= (((Class150) this).anInt1707 > 1
		   ? new Class120_Sub4(((Class150) this).aClass173_Sub2_1700,
				       34037, Class149.aClass149_1676,
				       ((Class150) this).aClass169_1708,
				       ((Class150) this).anInt1694,
				       ((Class150) this).anInt1704)
		   : null);
	    ((Class150) this).aBool1698 = false;
	    ((Class150) this).aBool1688 = true;
	    ((Class150) this).aBool1693 = true;
	}
	if (((Class150) this).aBool1688) {
	    if (((Class150) this).aClass163_Sub1_Sub1_1690 != null) {
		((Class150) this).aClass173_Sub2_1700.method2179
		    (((Class150) this).aClass163_Sub1_Sub1_1689, 648644232);
		((Class150) this).aClass163_Sub1_Sub1_1689.method8907(null);
		((Class150) this).aClass163_Sub1_Sub1_1689.method8898(0, null);
		((Class150) this).aClass163_Sub1_Sub1_1689.method8898(1, null);
		((Class150) this).aClass163_Sub1_Sub1_1689.method8898
		    (0, ((Class150) this).aClass120_Sub4Array1702[0]
			    .method8263(0));
		((Class150) this).aClass163_Sub1_Sub1_1689.method8898
		    (1, (((Class150) this).anInt1707 > 1
			 ? ((Class150) this).aClass120_Sub4Array1702[1]
			       .method8263(0)
			 : null));
		if (((Class150) this).aBool1706)
		    ((Class150) this).aClass163_Sub1_Sub1_1689.method8907
			(((Class150) this).aClass120_Sub4_1703.method8262(0));
		((Class150) this).aClass173_Sub2_1700.method2180
		    (((Class150) this).aClass163_Sub1_Sub1_1689, 1829938759);
		((Class150) this).aClass173_Sub2_1700.method2179
		    (((Class150) this).aClass163_Sub1_Sub1_1690, -1173116718);
		((Class150) this).aClass163_Sub1_Sub1_1690.method8907(null);
		((Class150) this).aClass163_Sub1_Sub1_1690.method8898(0, null);
		((Class150) this).aClass163_Sub1_Sub1_1690.method8898
		    (0, ((Class150) this).aClass528_Sub21_Sub3_1692);
		((Class150) this).aClass163_Sub1_Sub1_1690
		    .method8907(((Class150) this).aClass528_Sub21_Sub3_1705);
		((Class150) this).aClass173_Sub2_1700.method2180
		    (((Class150) this).aClass163_Sub1_Sub1_1690, -1460902263);
	    } else {
		((Class150) this).aClass173_Sub2_1700.method2179
		    (((Class150) this).aClass163_Sub1_Sub1_1689, 410410821);
		((Class150) this).aClass163_Sub1_Sub1_1689.method8907(null);
		((Class150) this).aClass163_Sub1_Sub1_1689.method8898(0, null);
		((Class150) this).aClass163_Sub1_Sub1_1689.method8898(1, null);
		((Class150) this).aClass163_Sub1_Sub1_1689.method8898
		    (0, ((Class150) this).aClass120_Sub4Array1702[0]
			    .method8263(0));
		((Class150) this).aClass163_Sub1_Sub1_1689.method8898
		    (1, (((Class150) this).anInt1707 > 1
			 ? ((Class150) this).aClass120_Sub4Array1702[1]
			       .method8263(0)
			 : null));
		if (((Class150) this).aBool1706)
		    ((Class150) this).aClass163_Sub1_Sub1_1689.method8907
			(((Class150) this).aClass120_Sub4_1703.method8262(0));
		else
		    ((Class150) this).aClass163_Sub1_Sub1_1689.method8907
			(((Class150) this).aClass528_Sub21_Sub3_1705);
		((Class150) this).aClass173_Sub2_1700.method2180
		    (((Class150) this).aClass163_Sub1_Sub1_1689, -1648349326);
	    }
	    ((Class150) this).aBool1688 = false;
	    ((Class150) this).aBool1693 = true;
	}
	if (((Class150) this).aBool1693) {
	    ((Class150) this).aClass173_Sub2_1700.method2179
		(((Class150) this).aClass163_Sub1_Sub1_1691, -1319694998);
	    ((Class150) this).aBool1693
		= !((Class150) this).aClass163_Sub1_Sub1_1691.method8897();
	    ((Class150) this).aClass173_Sub2_1700.method2180
		(((Class150) this).aClass163_Sub1_Sub1_1691, -1150720085);
	}
	return !((Class150) this).aBool1693;
    }
    
    boolean method1742() {
	return ((Class150) this).aClass163_Sub1_Sub1_1691 != null;
    }
    
    boolean method1743() {
	return ((Class150) this).aClass163_Sub1_Sub1_1691 != null;
    }
    
    boolean method1744() {
	return ((Class150) this).aClass163_Sub1_Sub1_1691 != null;
    }
    
    boolean method1745() {
	return ((Class150) this).aBool1696;
    }
    
    boolean method1746() {
	return ((Class150) this).aClass163_Sub1_Sub1_1691 != null;
    }
    
    boolean method1747() {
	return ((Class150) this).aBool1696;
    }
    
    boolean method1748() {
	if (((Class150) this).aBool1699) {
	    if (((Class150) this).aClass528_Sub21_Sub3_1705 != null) {
		((Class150) this).aClass528_Sub21_Sub3_1705.method115();
		((Class150) this).aClass528_Sub21_Sub3_1705 = null;
	    }
	    if (((Class150) this).aClass120_Sub4_1703 != null) {
		((Class150) this).aClass120_Sub4_1703.method1549();
		((Class150) this).aClass120_Sub4_1703 = null;
	    }
	}
	if (((Class150) this).aBool1698) {
	    if (((Class150) this).aClass528_Sub21_Sub3_1692 != null) {
		((Class150) this).aClass528_Sub21_Sub3_1692.method115();
		((Class150) this).aClass528_Sub21_Sub3_1692 = null;
	    }
	    if (((Class150) this).aClass120_Sub4Array1702[0] != null) {
		((Class150) this).aClass120_Sub4Array1702[0].method1549();
		((Class150) this).aClass120_Sub4Array1702[0] = null;
	    }
	    if (((Class150) this).aClass120_Sub4Array1702[1] != null) {
		((Class150) this).aClass120_Sub4Array1702[1].method1549();
		((Class150) this).aClass120_Sub4Array1702[1] = null;
	    }
	}
	if (((Class150) this).aBool1699) {
	    if (((Class150) this).aClass163_Sub1_Sub1_1690 != null)
		((Class150) this).aClass528_Sub21_Sub3_1705
		    = new Class528_Sub21_Sub3((((Class150) this)
					       .aClass173_Sub2_1700),
					      Class149.aClass149_1683,
					      Class169.aClass169_1937,
					      ((Class150) this).anInt1694,
					      ((Class150) this).anInt1704,
					      (((Class173_Sub2)
						(((Class150) this)
						 .aClass173_Sub2_1700))
					       .anInt9443));
	    if (((Class150) this).aBool1706)
		((Class150) this).aClass120_Sub4_1703
		    = new Class120_Sub4(((Class150) this).aClass173_Sub2_1700,
					34037, Class149.aClass149_1683,
					Class169.aClass169_1937,
					((Class150) this).anInt1694,
					((Class150) this).anInt1704);
	    else if (((Class150) this).aClass528_Sub21_Sub3_1705 == null)
		((Class150) this).aClass528_Sub21_Sub3_1705
		    = new Class528_Sub21_Sub3((((Class150) this)
					       .aClass173_Sub2_1700),
					      Class149.aClass149_1683,
					      Class169.aClass169_1937,
					      ((Class150) this).anInt1694,
					      ((Class150) this).anInt1704);
	    ((Class150) this).aBool1699 = false;
	    ((Class150) this).aBool1688 = true;
	    ((Class150) this).aBool1693 = true;
	}
	if (((Class150) this).aBool1698) {
	    if (((Class150) this).aClass163_Sub1_Sub1_1690 != null)
		((Class150) this).aClass528_Sub21_Sub3_1692
		    = new Class528_Sub21_Sub3((((Class150) this)
					       .aClass173_Sub2_1700),
					      Class149.aClass149_1676,
					      ((Class150) this).aClass169_1708,
					      ((Class150) this).anInt1694,
					      ((Class150) this).anInt1704,
					      (((Class173_Sub2)
						(((Class150) this)
						 .aClass173_Sub2_1700))
					       .anInt9443));
	    ((Class150) this).aClass120_Sub4Array1702[0]
		= new Class120_Sub4(((Class150) this).aClass173_Sub2_1700,
				    34037, Class149.aClass149_1676,
				    ((Class150) this).aClass169_1708,
				    ((Class150) this).anInt1694,
				    ((Class150) this).anInt1704);
	    ((Class150) this).aClass120_Sub4Array1702[1]
		= (((Class150) this).anInt1707 > 1
		   ? new Class120_Sub4(((Class150) this).aClass173_Sub2_1700,
				       34037, Class149.aClass149_1676,
				       ((Class150) this).aClass169_1708,
				       ((Class150) this).anInt1694,
				       ((Class150) this).anInt1704)
		   : null);
	    ((Class150) this).aBool1698 = false;
	    ((Class150) this).aBool1688 = true;
	    ((Class150) this).aBool1693 = true;
	}
	if (((Class150) this).aBool1688) {
	    if (((Class150) this).aClass163_Sub1_Sub1_1690 != null) {
		((Class150) this).aClass173_Sub2_1700.method2179
		    (((Class150) this).aClass163_Sub1_Sub1_1689, -637025620);
		((Class150) this).aClass163_Sub1_Sub1_1689.method8907(null);
		((Class150) this).aClass163_Sub1_Sub1_1689.method8898(0, null);
		((Class150) this).aClass163_Sub1_Sub1_1689.method8898(1, null);
		((Class150) this).aClass163_Sub1_Sub1_1689.method8898
		    (0, ((Class150) this).aClass120_Sub4Array1702[0]
			    .method8263(0));
		((Class150) this).aClass163_Sub1_Sub1_1689.method8898
		    (1, (((Class150) this).anInt1707 > 1
			 ? ((Class150) this).aClass120_Sub4Array1702[1]
			       .method8263(0)
			 : null));
		if (((Class150) this).aBool1706)
		    ((Class150) this).aClass163_Sub1_Sub1_1689.method8907
			(((Class150) this).aClass120_Sub4_1703.method8262(0));
		((Class150) this).aClass173_Sub2_1700.method2180
		    (((Class150) this).aClass163_Sub1_Sub1_1689, 361136241);
		((Class150) this).aClass173_Sub2_1700.method2179
		    (((Class150) this).aClass163_Sub1_Sub1_1690, -2080149459);
		((Class150) this).aClass163_Sub1_Sub1_1690.method8907(null);
		((Class150) this).aClass163_Sub1_Sub1_1690.method8898(0, null);
		((Class150) this).aClass163_Sub1_Sub1_1690.method8898
		    (0, ((Class150) this).aClass528_Sub21_Sub3_1692);
		((Class150) this).aClass163_Sub1_Sub1_1690
		    .method8907(((Class150) this).aClass528_Sub21_Sub3_1705);
		((Class150) this).aClass173_Sub2_1700.method2180
		    (((Class150) this).aClass163_Sub1_Sub1_1690, 1536569788);
	    } else {
		((Class150) this).aClass173_Sub2_1700.method2179
		    (((Class150) this).aClass163_Sub1_Sub1_1689, 916046739);
		((Class150) this).aClass163_Sub1_Sub1_1689.method8907(null);
		((Class150) this).aClass163_Sub1_Sub1_1689.method8898(0, null);
		((Class150) this).aClass163_Sub1_Sub1_1689.method8898(1, null);
		((Class150) this).aClass163_Sub1_Sub1_1689.method8898
		    (0, ((Class150) this).aClass120_Sub4Array1702[0]
			    .method8263(0));
		((Class150) this).aClass163_Sub1_Sub1_1689.method8898
		    (1, (((Class150) this).anInt1707 > 1
			 ? ((Class150) this).aClass120_Sub4Array1702[1]
			       .method8263(0)
			 : null));
		if (((Class150) this).aBool1706)
		    ((Class150) this).aClass163_Sub1_Sub1_1689.method8907
			(((Class150) this).aClass120_Sub4_1703.method8262(0));
		else
		    ((Class150) this).aClass163_Sub1_Sub1_1689.method8907
			(((Class150) this).aClass528_Sub21_Sub3_1705);
		((Class150) this).aClass173_Sub2_1700.method2180
		    (((Class150) this).aClass163_Sub1_Sub1_1689, 962622346);
	    }
	    ((Class150) this).aBool1688 = false;
	    ((Class150) this).aBool1693 = true;
	}
	if (((Class150) this).aBool1693) {
	    ((Class150) this).aClass173_Sub2_1700.method2179
		(((Class150) this).aClass163_Sub1_Sub1_1691, 421247203);
	    ((Class150) this).aBool1693
		= !((Class150) this).aClass163_Sub1_Sub1_1691.method8897();
	    ((Class150) this).aClass173_Sub2_1700.method2180
		(((Class150) this).aClass163_Sub1_Sub1_1691, 1354784872);
	}
	return !((Class150) this).aBool1693;
    }
    
    boolean method1749() {
	return ((Class150) this).aBool1696;
    }
    
    boolean method1750() {
	for (Class528_Sub8 class528_sub8
		 = ((Class528_Sub8)
		    ((Class150) this).aClass688_1701.method8034(1309289909));
	     class528_sub8 != null;
	     class528_sub8 = (Class528_Sub8) ((Class150) this)
						 .aClass688_1701
						 .method8037(-830796638)) {
	    if (!class528_sub8.method9305())
		return false;
	}
	return true;
    }
    
    boolean method1751() {
	return ((Class150) this).aClass163_Sub1_Sub1_1691 != null;
    }
    
    boolean method1752() {
	if (((Class150) this).aBool1699) {
	    if (((Class150) this).aClass528_Sub21_Sub3_1705 != null) {
		((Class150) this).aClass528_Sub21_Sub3_1705.method115();
		((Class150) this).aClass528_Sub21_Sub3_1705 = null;
	    }
	    if (((Class150) this).aClass120_Sub4_1703 != null) {
		((Class150) this).aClass120_Sub4_1703.method1549();
		((Class150) this).aClass120_Sub4_1703 = null;
	    }
	}
	if (((Class150) this).aBool1698) {
	    if (((Class150) this).aClass528_Sub21_Sub3_1692 != null) {
		((Class150) this).aClass528_Sub21_Sub3_1692.method115();
		((Class150) this).aClass528_Sub21_Sub3_1692 = null;
	    }
	    if (((Class150) this).aClass120_Sub4Array1702[0] != null) {
		((Class150) this).aClass120_Sub4Array1702[0].method1549();
		((Class150) this).aClass120_Sub4Array1702[0] = null;
	    }
	    if (((Class150) this).aClass120_Sub4Array1702[1] != null) {
		((Class150) this).aClass120_Sub4Array1702[1].method1549();
		((Class150) this).aClass120_Sub4Array1702[1] = null;
	    }
	}
	if (((Class150) this).aBool1699) {
	    if (((Class150) this).aClass163_Sub1_Sub1_1690 != null)
		((Class150) this).aClass528_Sub21_Sub3_1705
		    = new Class528_Sub21_Sub3((((Class150) this)
					       .aClass173_Sub2_1700),
					      Class149.aClass149_1683,
					      Class169.aClass169_1937,
					      ((Class150) this).anInt1694,
					      ((Class150) this).anInt1704,
					      (((Class173_Sub2)
						(((Class150) this)
						 .aClass173_Sub2_1700))
					       .anInt9443));
	    if (((Class150) this).aBool1706)
		((Class150) this).aClass120_Sub4_1703
		    = new Class120_Sub4(((Class150) this).aClass173_Sub2_1700,
					34037, Class149.aClass149_1683,
					Class169.aClass169_1937,
					((Class150) this).anInt1694,
					((Class150) this).anInt1704);
	    else if (((Class150) this).aClass528_Sub21_Sub3_1705 == null)
		((Class150) this).aClass528_Sub21_Sub3_1705
		    = new Class528_Sub21_Sub3((((Class150) this)
					       .aClass173_Sub2_1700),
					      Class149.aClass149_1683,
					      Class169.aClass169_1937,
					      ((Class150) this).anInt1694,
					      ((Class150) this).anInt1704);
	    ((Class150) this).aBool1699 = false;
	    ((Class150) this).aBool1688 = true;
	    ((Class150) this).aBool1693 = true;
	}
	if (((Class150) this).aBool1698) {
	    if (((Class150) this).aClass163_Sub1_Sub1_1690 != null)
		((Class150) this).aClass528_Sub21_Sub3_1692
		    = new Class528_Sub21_Sub3((((Class150) this)
					       .aClass173_Sub2_1700),
					      Class149.aClass149_1676,
					      ((Class150) this).aClass169_1708,
					      ((Class150) this).anInt1694,
					      ((Class150) this).anInt1704,
					      (((Class173_Sub2)
						(((Class150) this)
						 .aClass173_Sub2_1700))
					       .anInt9443));
	    ((Class150) this).aClass120_Sub4Array1702[0]
		= new Class120_Sub4(((Class150) this).aClass173_Sub2_1700,
				    34037, Class149.aClass149_1676,
				    ((Class150) this).aClass169_1708,
				    ((Class150) this).anInt1694,
				    ((Class150) this).anInt1704);
	    ((Class150) this).aClass120_Sub4Array1702[1]
		= (((Class150) this).anInt1707 > 1
		   ? new Class120_Sub4(((Class150) this).aClass173_Sub2_1700,
				       34037, Class149.aClass149_1676,
				       ((Class150) this).aClass169_1708,
				       ((Class150) this).anInt1694,
				       ((Class150) this).anInt1704)
		   : null);
	    ((Class150) this).aBool1698 = false;
	    ((Class150) this).aBool1688 = true;
	    ((Class150) this).aBool1693 = true;
	}
	if (((Class150) this).aBool1688) {
	    if (((Class150) this).aClass163_Sub1_Sub1_1690 != null) {
		((Class150) this).aClass173_Sub2_1700.method2179
		    (((Class150) this).aClass163_Sub1_Sub1_1689, -935557004);
		((Class150) this).aClass163_Sub1_Sub1_1689.method8907(null);
		((Class150) this).aClass163_Sub1_Sub1_1689.method8898(0, null);
		((Class150) this).aClass163_Sub1_Sub1_1689.method8898(1, null);
		((Class150) this).aClass163_Sub1_Sub1_1689.method8898
		    (0, ((Class150) this).aClass120_Sub4Array1702[0]
			    .method8263(0));
		((Class150) this).aClass163_Sub1_Sub1_1689.method8898
		    (1, (((Class150) this).anInt1707 > 1
			 ? ((Class150) this).aClass120_Sub4Array1702[1]
			       .method8263(0)
			 : null));
		if (((Class150) this).aBool1706)
		    ((Class150) this).aClass163_Sub1_Sub1_1689.method8907
			(((Class150) this).aClass120_Sub4_1703.method8262(0));
		((Class150) this).aClass173_Sub2_1700.method2180
		    (((Class150) this).aClass163_Sub1_Sub1_1689, 966808155);
		((Class150) this).aClass173_Sub2_1700.method2179
		    (((Class150) this).aClass163_Sub1_Sub1_1690, -1677536701);
		((Class150) this).aClass163_Sub1_Sub1_1690.method8907(null);
		((Class150) this).aClass163_Sub1_Sub1_1690.method8898(0, null);
		((Class150) this).aClass163_Sub1_Sub1_1690.method8898
		    (0, ((Class150) this).aClass528_Sub21_Sub3_1692);
		((Class150) this).aClass163_Sub1_Sub1_1690
		    .method8907(((Class150) this).aClass528_Sub21_Sub3_1705);
		((Class150) this).aClass173_Sub2_1700.method2180
		    (((Class150) this).aClass163_Sub1_Sub1_1690, -1350881461);
	    } else {
		((Class150) this).aClass173_Sub2_1700.method2179
		    (((Class150) this).aClass163_Sub1_Sub1_1689, -839837598);
		((Class150) this).aClass163_Sub1_Sub1_1689.method8907(null);
		((Class150) this).aClass163_Sub1_Sub1_1689.method8898(0, null);
		((Class150) this).aClass163_Sub1_Sub1_1689.method8898(1, null);
		((Class150) this).aClass163_Sub1_Sub1_1689.method8898
		    (0, ((Class150) this).aClass120_Sub4Array1702[0]
			    .method8263(0));
		((Class150) this).aClass163_Sub1_Sub1_1689.method8898
		    (1, (((Class150) this).anInt1707 > 1
			 ? ((Class150) this).aClass120_Sub4Array1702[1]
			       .method8263(0)
			 : null));
		if (((Class150) this).aBool1706)
		    ((Class150) this).aClass163_Sub1_Sub1_1689.method8907
			(((Class150) this).aClass120_Sub4_1703.method8262(0));
		else
		    ((Class150) this).aClass163_Sub1_Sub1_1689.method8907
			(((Class150) this).aClass528_Sub21_Sub3_1705);
		((Class150) this).aClass173_Sub2_1700.method2180
		    (((Class150) this).aClass163_Sub1_Sub1_1689, -444391578);
	    }
	    ((Class150) this).aBool1688 = false;
	    ((Class150) this).aBool1693 = true;
	}
	if (((Class150) this).aBool1693) {
	    ((Class150) this).aClass173_Sub2_1700.method2179
		(((Class150) this).aClass163_Sub1_Sub1_1691, -443794124);
	    ((Class150) this).aBool1693
		= !((Class150) this).aClass163_Sub1_Sub1_1691.method8897();
	    ((Class150) this).aClass173_Sub2_1700.method2180
		(((Class150) this).aClass163_Sub1_Sub1_1691, 909769351);
	}
	return !((Class150) this).aBool1693;
    }
    
    boolean method1753() {
	if (((Class150) this).aBool1699) {
	    if (((Class150) this).aClass528_Sub21_Sub3_1705 != null) {
		((Class150) this).aClass528_Sub21_Sub3_1705.method115();
		((Class150) this).aClass528_Sub21_Sub3_1705 = null;
	    }
	    if (((Class150) this).aClass120_Sub4_1703 != null) {
		((Class150) this).aClass120_Sub4_1703.method1549();
		((Class150) this).aClass120_Sub4_1703 = null;
	    }
	}
	if (((Class150) this).aBool1698) {
	    if (((Class150) this).aClass528_Sub21_Sub3_1692 != null) {
		((Class150) this).aClass528_Sub21_Sub3_1692.method115();
		((Class150) this).aClass528_Sub21_Sub3_1692 = null;
	    }
	    if (((Class150) this).aClass120_Sub4Array1702[0] != null) {
		((Class150) this).aClass120_Sub4Array1702[0].method1549();
		((Class150) this).aClass120_Sub4Array1702[0] = null;
	    }
	    if (((Class150) this).aClass120_Sub4Array1702[1] != null) {
		((Class150) this).aClass120_Sub4Array1702[1].method1549();
		((Class150) this).aClass120_Sub4Array1702[1] = null;
	    }
	}
	if (((Class150) this).aBool1699) {
	    if (((Class150) this).aClass163_Sub1_Sub1_1690 != null)
		((Class150) this).aClass528_Sub21_Sub3_1705
		    = new Class528_Sub21_Sub3((((Class150) this)
					       .aClass173_Sub2_1700),
					      Class149.aClass149_1683,
					      Class169.aClass169_1937,
					      ((Class150) this).anInt1694,
					      ((Class150) this).anInt1704,
					      (((Class173_Sub2)
						(((Class150) this)
						 .aClass173_Sub2_1700))
					       .anInt9443));
	    if (((Class150) this).aBool1706)
		((Class150) this).aClass120_Sub4_1703
		    = new Class120_Sub4(((Class150) this).aClass173_Sub2_1700,
					34037, Class149.aClass149_1683,
					Class169.aClass169_1937,
					((Class150) this).anInt1694,
					((Class150) this).anInt1704);
	    else if (((Class150) this).aClass528_Sub21_Sub3_1705 == null)
		((Class150) this).aClass528_Sub21_Sub3_1705
		    = new Class528_Sub21_Sub3((((Class150) this)
					       .aClass173_Sub2_1700),
					      Class149.aClass149_1683,
					      Class169.aClass169_1937,
					      ((Class150) this).anInt1694,
					      ((Class150) this).anInt1704);
	    ((Class150) this).aBool1699 = false;
	    ((Class150) this).aBool1688 = true;
	    ((Class150) this).aBool1693 = true;
	}
	if (((Class150) this).aBool1698) {
	    if (((Class150) this).aClass163_Sub1_Sub1_1690 != null)
		((Class150) this).aClass528_Sub21_Sub3_1692
		    = new Class528_Sub21_Sub3((((Class150) this)
					       .aClass173_Sub2_1700),
					      Class149.aClass149_1676,
					      ((Class150) this).aClass169_1708,
					      ((Class150) this).anInt1694,
					      ((Class150) this).anInt1704,
					      (((Class173_Sub2)
						(((Class150) this)
						 .aClass173_Sub2_1700))
					       .anInt9443));
	    ((Class150) this).aClass120_Sub4Array1702[0]
		= new Class120_Sub4(((Class150) this).aClass173_Sub2_1700,
				    34037, Class149.aClass149_1676,
				    ((Class150) this).aClass169_1708,
				    ((Class150) this).anInt1694,
				    ((Class150) this).anInt1704);
	    ((Class150) this).aClass120_Sub4Array1702[1]
		= (((Class150) this).anInt1707 > 1
		   ? new Class120_Sub4(((Class150) this).aClass173_Sub2_1700,
				       34037, Class149.aClass149_1676,
				       ((Class150) this).aClass169_1708,
				       ((Class150) this).anInt1694,
				       ((Class150) this).anInt1704)
		   : null);
	    ((Class150) this).aBool1698 = false;
	    ((Class150) this).aBool1688 = true;
	    ((Class150) this).aBool1693 = true;
	}
	if (((Class150) this).aBool1688) {
	    if (((Class150) this).aClass163_Sub1_Sub1_1690 != null) {
		((Class150) this).aClass173_Sub2_1700.method2179
		    (((Class150) this).aClass163_Sub1_Sub1_1689, 907165234);
		((Class150) this).aClass163_Sub1_Sub1_1689.method8907(null);
		((Class150) this).aClass163_Sub1_Sub1_1689.method8898(0, null);
		((Class150) this).aClass163_Sub1_Sub1_1689.method8898(1, null);
		((Class150) this).aClass163_Sub1_Sub1_1689.method8898
		    (0, ((Class150) this).aClass120_Sub4Array1702[0]
			    .method8263(0));
		((Class150) this).aClass163_Sub1_Sub1_1689.method8898
		    (1, (((Class150) this).anInt1707 > 1
			 ? ((Class150) this).aClass120_Sub4Array1702[1]
			       .method8263(0)
			 : null));
		if (((Class150) this).aBool1706)
		    ((Class150) this).aClass163_Sub1_Sub1_1689.method8907
			(((Class150) this).aClass120_Sub4_1703.method8262(0));
		((Class150) this).aClass173_Sub2_1700.method2180
		    (((Class150) this).aClass163_Sub1_Sub1_1689, -2127327204);
		((Class150) this).aClass173_Sub2_1700.method2179
		    (((Class150) this).aClass163_Sub1_Sub1_1690, -979396754);
		((Class150) this).aClass163_Sub1_Sub1_1690.method8907(null);
		((Class150) this).aClass163_Sub1_Sub1_1690.method8898(0, null);
		((Class150) this).aClass163_Sub1_Sub1_1690.method8898
		    (0, ((Class150) this).aClass528_Sub21_Sub3_1692);
		((Class150) this).aClass163_Sub1_Sub1_1690
		    .method8907(((Class150) this).aClass528_Sub21_Sub3_1705);
		((Class150) this).aClass173_Sub2_1700.method2180
		    (((Class150) this).aClass163_Sub1_Sub1_1690, 2014572310);
	    } else {
		((Class150) this).aClass173_Sub2_1700.method2179
		    (((Class150) this).aClass163_Sub1_Sub1_1689, -849969421);
		((Class150) this).aClass163_Sub1_Sub1_1689.method8907(null);
		((Class150) this).aClass163_Sub1_Sub1_1689.method8898(0, null);
		((Class150) this).aClass163_Sub1_Sub1_1689.method8898(1, null);
		((Class150) this).aClass163_Sub1_Sub1_1689.method8898
		    (0, ((Class150) this).aClass120_Sub4Array1702[0]
			    .method8263(0));
		((Class150) this).aClass163_Sub1_Sub1_1689.method8898
		    (1, (((Class150) this).anInt1707 > 1
			 ? ((Class150) this).aClass120_Sub4Array1702[1]
			       .method8263(0)
			 : null));
		if (((Class150) this).aBool1706)
		    ((Class150) this).aClass163_Sub1_Sub1_1689.method8907
			(((Class150) this).aClass120_Sub4_1703.method8262(0));
		else
		    ((Class150) this).aClass163_Sub1_Sub1_1689.method8907
			(((Class150) this).aClass528_Sub21_Sub3_1705);
		((Class150) this).aClass173_Sub2_1700.method2180
		    (((Class150) this).aClass163_Sub1_Sub1_1689, 1880787729);
	    }
	    ((Class150) this).aBool1688 = false;
	    ((Class150) this).aBool1693 = true;
	}
	if (((Class150) this).aBool1693) {
	    ((Class150) this).aClass173_Sub2_1700.method2179
		(((Class150) this).aClass163_Sub1_Sub1_1691, 394315983);
	    ((Class150) this).aBool1693
		= !((Class150) this).aClass163_Sub1_Sub1_1691.method8897();
	    ((Class150) this).aClass173_Sub2_1700.method2180
		(((Class150) this).aClass163_Sub1_Sub1_1691, 1335328037);
	}
	return !((Class150) this).aBool1693;
    }
    
    boolean method1754() {
	if (((Class150) this).aBool1699) {
	    if (((Class150) this).aClass528_Sub21_Sub3_1705 != null) {
		((Class150) this).aClass528_Sub21_Sub3_1705.method115();
		((Class150) this).aClass528_Sub21_Sub3_1705 = null;
	    }
	    if (((Class150) this).aClass120_Sub4_1703 != null) {
		((Class150) this).aClass120_Sub4_1703.method1549();
		((Class150) this).aClass120_Sub4_1703 = null;
	    }
	}
	if (((Class150) this).aBool1698) {
	    if (((Class150) this).aClass528_Sub21_Sub3_1692 != null) {
		((Class150) this).aClass528_Sub21_Sub3_1692.method115();
		((Class150) this).aClass528_Sub21_Sub3_1692 = null;
	    }
	    if (((Class150) this).aClass120_Sub4Array1702[0] != null) {
		((Class150) this).aClass120_Sub4Array1702[0].method1549();
		((Class150) this).aClass120_Sub4Array1702[0] = null;
	    }
	    if (((Class150) this).aClass120_Sub4Array1702[1] != null) {
		((Class150) this).aClass120_Sub4Array1702[1].method1549();
		((Class150) this).aClass120_Sub4Array1702[1] = null;
	    }
	}
	if (((Class150) this).aBool1699) {
	    if (((Class150) this).aClass163_Sub1_Sub1_1690 != null)
		((Class150) this).aClass528_Sub21_Sub3_1705
		    = new Class528_Sub21_Sub3((((Class150) this)
					       .aClass173_Sub2_1700),
					      Class149.aClass149_1683,
					      Class169.aClass169_1937,
					      ((Class150) this).anInt1694,
					      ((Class150) this).anInt1704,
					      (((Class173_Sub2)
						(((Class150) this)
						 .aClass173_Sub2_1700))
					       .anInt9443));
	    if (((Class150) this).aBool1706)
		((Class150) this).aClass120_Sub4_1703
		    = new Class120_Sub4(((Class150) this).aClass173_Sub2_1700,
					34037, Class149.aClass149_1683,
					Class169.aClass169_1937,
					((Class150) this).anInt1694,
					((Class150) this).anInt1704);
	    else if (((Class150) this).aClass528_Sub21_Sub3_1705 == null)
		((Class150) this).aClass528_Sub21_Sub3_1705
		    = new Class528_Sub21_Sub3((((Class150) this)
					       .aClass173_Sub2_1700),
					      Class149.aClass149_1683,
					      Class169.aClass169_1937,
					      ((Class150) this).anInt1694,
					      ((Class150) this).anInt1704);
	    ((Class150) this).aBool1699 = false;
	    ((Class150) this).aBool1688 = true;
	    ((Class150) this).aBool1693 = true;
	}
	if (((Class150) this).aBool1698) {
	    if (((Class150) this).aClass163_Sub1_Sub1_1690 != null)
		((Class150) this).aClass528_Sub21_Sub3_1692
		    = new Class528_Sub21_Sub3((((Class150) this)
					       .aClass173_Sub2_1700),
					      Class149.aClass149_1676,
					      ((Class150) this).aClass169_1708,
					      ((Class150) this).anInt1694,
					      ((Class150) this).anInt1704,
					      (((Class173_Sub2)
						(((Class150) this)
						 .aClass173_Sub2_1700))
					       .anInt9443));
	    ((Class150) this).aClass120_Sub4Array1702[0]
		= new Class120_Sub4(((Class150) this).aClass173_Sub2_1700,
				    34037, Class149.aClass149_1676,
				    ((Class150) this).aClass169_1708,
				    ((Class150) this).anInt1694,
				    ((Class150) this).anInt1704);
	    ((Class150) this).aClass120_Sub4Array1702[1]
		= (((Class150) this).anInt1707 > 1
		   ? new Class120_Sub4(((Class150) this).aClass173_Sub2_1700,
				       34037, Class149.aClass149_1676,
				       ((Class150) this).aClass169_1708,
				       ((Class150) this).anInt1694,
				       ((Class150) this).anInt1704)
		   : null);
	    ((Class150) this).aBool1698 = false;
	    ((Class150) this).aBool1688 = true;
	    ((Class150) this).aBool1693 = true;
	}
	if (((Class150) this).aBool1688) {
	    if (((Class150) this).aClass163_Sub1_Sub1_1690 != null) {
		((Class150) this).aClass173_Sub2_1700.method2179
		    (((Class150) this).aClass163_Sub1_Sub1_1689, -1285737380);
		((Class150) this).aClass163_Sub1_Sub1_1689.method8907(null);
		((Class150) this).aClass163_Sub1_Sub1_1689.method8898(0, null);
		((Class150) this).aClass163_Sub1_Sub1_1689.method8898(1, null);
		((Class150) this).aClass163_Sub1_Sub1_1689.method8898
		    (0, ((Class150) this).aClass120_Sub4Array1702[0]
			    .method8263(0));
		((Class150) this).aClass163_Sub1_Sub1_1689.method8898
		    (1, (((Class150) this).anInt1707 > 1
			 ? ((Class150) this).aClass120_Sub4Array1702[1]
			       .method8263(0)
			 : null));
		if (((Class150) this).aBool1706)
		    ((Class150) this).aClass163_Sub1_Sub1_1689.method8907
			(((Class150) this).aClass120_Sub4_1703.method8262(0));
		((Class150) this).aClass173_Sub2_1700.method2180
		    (((Class150) this).aClass163_Sub1_Sub1_1689, 1291571247);
		((Class150) this).aClass173_Sub2_1700.method2179
		    (((Class150) this).aClass163_Sub1_Sub1_1690, -151661970);
		((Class150) this).aClass163_Sub1_Sub1_1690.method8907(null);
		((Class150) this).aClass163_Sub1_Sub1_1690.method8898(0, null);
		((Class150) this).aClass163_Sub1_Sub1_1690.method8898
		    (0, ((Class150) this).aClass528_Sub21_Sub3_1692);
		((Class150) this).aClass163_Sub1_Sub1_1690
		    .method8907(((Class150) this).aClass528_Sub21_Sub3_1705);
		((Class150) this).aClass173_Sub2_1700.method2180
		    (((Class150) this).aClass163_Sub1_Sub1_1690, 1249075479);
	    } else {
		((Class150) this).aClass173_Sub2_1700.method2179
		    (((Class150) this).aClass163_Sub1_Sub1_1689, 472682177);
		((Class150) this).aClass163_Sub1_Sub1_1689.method8907(null);
		((Class150) this).aClass163_Sub1_Sub1_1689.method8898(0, null);
		((Class150) this).aClass163_Sub1_Sub1_1689.method8898(1, null);
		((Class150) this).aClass163_Sub1_Sub1_1689.method8898
		    (0, ((Class150) this).aClass120_Sub4Array1702[0]
			    .method8263(0));
		((Class150) this).aClass163_Sub1_Sub1_1689.method8898
		    (1, (((Class150) this).anInt1707 > 1
			 ? ((Class150) this).aClass120_Sub4Array1702[1]
			       .method8263(0)
			 : null));
		if (((Class150) this).aBool1706)
		    ((Class150) this).aClass163_Sub1_Sub1_1689.method8907
			(((Class150) this).aClass120_Sub4_1703.method8262(0));
		else
		    ((Class150) this).aClass163_Sub1_Sub1_1689.method8907
			(((Class150) this).aClass528_Sub21_Sub3_1705);
		((Class150) this).aClass173_Sub2_1700.method2180
		    (((Class150) this).aClass163_Sub1_Sub1_1689, 389323964);
	    }
	    ((Class150) this).aBool1688 = false;
	    ((Class150) this).aBool1693 = true;
	}
	if (((Class150) this).aBool1693) {
	    ((Class150) this).aClass173_Sub2_1700.method2179
		(((Class150) this).aClass163_Sub1_Sub1_1691, -986705925);
	    ((Class150) this).aBool1693
		= !((Class150) this).aClass163_Sub1_Sub1_1691.method8897();
	    ((Class150) this).aClass173_Sub2_1700.method2180
		(((Class150) this).aClass163_Sub1_Sub1_1691, 1888521757);
	}
	return !((Class150) this).aBool1693;
    }
    
    boolean method1755() {
	for (Class528_Sub8 class528_sub8
		 = ((Class528_Sub8)
		    ((Class150) this).aClass688_1701.method8034(1898497422));
	     class528_sub8 != null;
	     class528_sub8 = (Class528_Sub8) ((Class150) this)
						 .aClass688_1701
						 .method8037(-1586504266)) {
	    if (!class528_sub8.method9305())
		return false;
	}
	return true;
    }
    
    boolean method1756() {
	if (((Class150) this).aBool1699) {
	    if (((Class150) this).aClass528_Sub21_Sub3_1705 != null) {
		((Class150) this).aClass528_Sub21_Sub3_1705.method115();
		((Class150) this).aClass528_Sub21_Sub3_1705 = null;
	    }
	    if (((Class150) this).aClass120_Sub4_1703 != null) {
		((Class150) this).aClass120_Sub4_1703.method1549();
		((Class150) this).aClass120_Sub4_1703 = null;
	    }
	}
	if (((Class150) this).aBool1698) {
	    if (((Class150) this).aClass528_Sub21_Sub3_1692 != null) {
		((Class150) this).aClass528_Sub21_Sub3_1692.method115();
		((Class150) this).aClass528_Sub21_Sub3_1692 = null;
	    }
	    if (((Class150) this).aClass120_Sub4Array1702[0] != null) {
		((Class150) this).aClass120_Sub4Array1702[0].method1549();
		((Class150) this).aClass120_Sub4Array1702[0] = null;
	    }
	    if (((Class150) this).aClass120_Sub4Array1702[1] != null) {
		((Class150) this).aClass120_Sub4Array1702[1].method1549();
		((Class150) this).aClass120_Sub4Array1702[1] = null;
	    }
	}
	if (((Class150) this).aBool1699) {
	    if (((Class150) this).aClass163_Sub1_Sub1_1690 != null)
		((Class150) this).aClass528_Sub21_Sub3_1705
		    = new Class528_Sub21_Sub3((((Class150) this)
					       .aClass173_Sub2_1700),
					      Class149.aClass149_1683,
					      Class169.aClass169_1937,
					      ((Class150) this).anInt1694,
					      ((Class150) this).anInt1704,
					      (((Class173_Sub2)
						(((Class150) this)
						 .aClass173_Sub2_1700))
					       .anInt9443));
	    if (((Class150) this).aBool1706)
		((Class150) this).aClass120_Sub4_1703
		    = new Class120_Sub4(((Class150) this).aClass173_Sub2_1700,
					34037, Class149.aClass149_1683,
					Class169.aClass169_1937,
					((Class150) this).anInt1694,
					((Class150) this).anInt1704);
	    else if (((Class150) this).aClass528_Sub21_Sub3_1705 == null)
		((Class150) this).aClass528_Sub21_Sub3_1705
		    = new Class528_Sub21_Sub3((((Class150) this)
					       .aClass173_Sub2_1700),
					      Class149.aClass149_1683,
					      Class169.aClass169_1937,
					      ((Class150) this).anInt1694,
					      ((Class150) this).anInt1704);
	    ((Class150) this).aBool1699 = false;
	    ((Class150) this).aBool1688 = true;
	    ((Class150) this).aBool1693 = true;
	}
	if (((Class150) this).aBool1698) {
	    if (((Class150) this).aClass163_Sub1_Sub1_1690 != null)
		((Class150) this).aClass528_Sub21_Sub3_1692
		    = new Class528_Sub21_Sub3((((Class150) this)
					       .aClass173_Sub2_1700),
					      Class149.aClass149_1676,
					      ((Class150) this).aClass169_1708,
					      ((Class150) this).anInt1694,
					      ((Class150) this).anInt1704,
					      (((Class173_Sub2)
						(((Class150) this)
						 .aClass173_Sub2_1700))
					       .anInt9443));
	    ((Class150) this).aClass120_Sub4Array1702[0]
		= new Class120_Sub4(((Class150) this).aClass173_Sub2_1700,
				    34037, Class149.aClass149_1676,
				    ((Class150) this).aClass169_1708,
				    ((Class150) this).anInt1694,
				    ((Class150) this).anInt1704);
	    ((Class150) this).aClass120_Sub4Array1702[1]
		= (((Class150) this).anInt1707 > 1
		   ? new Class120_Sub4(((Class150) this).aClass173_Sub2_1700,
				       34037, Class149.aClass149_1676,
				       ((Class150) this).aClass169_1708,
				       ((Class150) this).anInt1694,
				       ((Class150) this).anInt1704)
		   : null);
	    ((Class150) this).aBool1698 = false;
	    ((Class150) this).aBool1688 = true;
	    ((Class150) this).aBool1693 = true;
	}
	if (((Class150) this).aBool1688) {
	    if (((Class150) this).aClass163_Sub1_Sub1_1690 != null) {
		((Class150) this).aClass173_Sub2_1700.method2179
		    (((Class150) this).aClass163_Sub1_Sub1_1689, -492563988);
		((Class150) this).aClass163_Sub1_Sub1_1689.method8907(null);
		((Class150) this).aClass163_Sub1_Sub1_1689.method8898(0, null);
		((Class150) this).aClass163_Sub1_Sub1_1689.method8898(1, null);
		((Class150) this).aClass163_Sub1_Sub1_1689.method8898
		    (0, ((Class150) this).aClass120_Sub4Array1702[0]
			    .method8263(0));
		((Class150) this).aClass163_Sub1_Sub1_1689.method8898
		    (1, (((Class150) this).anInt1707 > 1
			 ? ((Class150) this).aClass120_Sub4Array1702[1]
			       .method8263(0)
			 : null));
		if (((Class150) this).aBool1706)
		    ((Class150) this).aClass163_Sub1_Sub1_1689.method8907
			(((Class150) this).aClass120_Sub4_1703.method8262(0));
		((Class150) this).aClass173_Sub2_1700.method2180
		    (((Class150) this).aClass163_Sub1_Sub1_1689, 279526863);
		((Class150) this).aClass173_Sub2_1700.method2179
		    (((Class150) this).aClass163_Sub1_Sub1_1690, 353696584);
		((Class150) this).aClass163_Sub1_Sub1_1690.method8907(null);
		((Class150) this).aClass163_Sub1_Sub1_1690.method8898(0, null);
		((Class150) this).aClass163_Sub1_Sub1_1690.method8898
		    (0, ((Class150) this).aClass528_Sub21_Sub3_1692);
		((Class150) this).aClass163_Sub1_Sub1_1690
		    .method8907(((Class150) this).aClass528_Sub21_Sub3_1705);
		((Class150) this).aClass173_Sub2_1700.method2180
		    (((Class150) this).aClass163_Sub1_Sub1_1690, 988478216);
	    } else {
		((Class150) this).aClass173_Sub2_1700.method2179
		    (((Class150) this).aClass163_Sub1_Sub1_1689, 24895527);
		((Class150) this).aClass163_Sub1_Sub1_1689.method8907(null);
		((Class150) this).aClass163_Sub1_Sub1_1689.method8898(0, null);
		((Class150) this).aClass163_Sub1_Sub1_1689.method8898(1, null);
		((Class150) this).aClass163_Sub1_Sub1_1689.method8898
		    (0, ((Class150) this).aClass120_Sub4Array1702[0]
			    .method8263(0));
		((Class150) this).aClass163_Sub1_Sub1_1689.method8898
		    (1, (((Class150) this).anInt1707 > 1
			 ? ((Class150) this).aClass120_Sub4Array1702[1]
			       .method8263(0)
			 : null));
		if (((Class150) this).aBool1706)
		    ((Class150) this).aClass163_Sub1_Sub1_1689.method8907
			(((Class150) this).aClass120_Sub4_1703.method8262(0));
		else
		    ((Class150) this).aClass163_Sub1_Sub1_1689.method8907
			(((Class150) this).aClass528_Sub21_Sub3_1705);
		((Class150) this).aClass173_Sub2_1700.method2180
		    (((Class150) this).aClass163_Sub1_Sub1_1689, 388972208);
	    }
	    ((Class150) this).aBool1688 = false;
	    ((Class150) this).aBool1693 = true;
	}
	if (((Class150) this).aBool1693) {
	    ((Class150) this).aClass173_Sub2_1700.method2179
		(((Class150) this).aClass163_Sub1_Sub1_1691, -1809929994);
	    ((Class150) this).aBool1693
		= !((Class150) this).aClass163_Sub1_Sub1_1691.method8897();
	    ((Class150) this).aClass173_Sub2_1700.method2180
		(((Class150) this).aClass163_Sub1_Sub1_1691, -1254400625);
	}
	return !((Class150) this).aBool1693;
    }
    
    boolean method1757() {
	return ((Class150) this).aBool1696;
    }
    
    boolean method1758(int i, int i_15_, int i_16_, int i_17_) {
	if (((Class150) this).aClass163_Sub1_Sub1_1691 == null
	    || ((Class150) this).aClass688_1701.method8040((byte) -99)
	    || method1734())
	    return false;
	if (((Class150) this).anInt1694 != i_16_
	    || ((Class150) this).anInt1704 != i_17_) {
	    ((Class150) this).anInt1694 = i_16_;
	    ((Class150) this).anInt1704 = i_17_;
	    for (Node node
		     = ((Class150) this).aClass688_1701.method8034(2111323180);
		 node != ((Class150) this).aClass688_1701.aClass528_8655;
		 node = node.aClass528_7106)
		((Class528_Sub8) node).method9297((((Class150) this)
						       .anInt1694),
						      (((Class150) this)
						       .anInt1704));
	    ((Class150) this).aBool1698 = true;
	    ((Class150) this).aBool1699 = true;
	    ((Class150) this).aBool1688 = true;
	}
	if (method1735()) {
	    ((Class150) this).anInt1697 = i;
	    ((Class150) this).anInt1695 = i_15_;
	    ((Class150) this).aBool1696 = true;
	    ((Class150) this).aClass173_Sub2_1700.method8873
		(-((Class150) this).anInt1697,
		 (((Class150) this).anInt1704 + ((Class150) this).anInt1695
		  - ((Class150) this).aClass173_Sub2_1700.method2403
			((byte) -126).method2070()));
	    ((Class150) this).aClass173_Sub2_1700.method2179
		(((Class150) this).aClass163_Sub1_Sub1_1691, 380495897);
	    ((Class150) this).aClass163_Sub1_Sub1_1691.method10327(0);
	    ((Class150) this).aClass173_Sub2_1700.method2268(3, 0);
	    return true;
	}
	return false;
    }
    
    void method1759(int i, int i_18_) {
	if (((Class150) this).aBool1696) {
	    if (((Class150) this).aClass163_Sub1_Sub1_1690 != null) {
		((Class150) this).aClass173_Sub2_1700.method2180
		    (((Class150) this).aClass163_Sub1_Sub1_1690, 1281583842);
		((Class150) this).aClass173_Sub2_1700.method2179
		    (((Class150) this).aClass163_Sub1_Sub1_1689, -1576652478);
		((Class150) this).aClass163_Sub1_Sub1_1689.method10327(0);
		((Class150) this).aClass163_Sub1_Sub1_1690.method8900
		    (0, 0, ((Class150) this).anInt1694,
		     ((Class150) this).anInt1704, 0, 0, true,
		     ((Class150) this).aBool1706);
	    }
	    ((Class150) this).aClass173_Sub2_1700.method8807();
	    ((Class150) this).aClass173_Sub2_1700.method8788(0);
	    ((Class150) this).aClass173_Sub2_1700.method8776(1);
	    ((Class150) this).aClass173_Sub2_1700.method2203();
	    int i_19_ = 0;
	    int i_20_ = 1;
	    int i_21_ = 0;
	    int i_22_ = 0;
	    int i_23_ = 0;
	    Object object = null;
	    for (Class528_Sub8 class528_sub8
		     = (Class528_Sub8) ((Class150) this).aClass688_1701
					   .method8034(1071013926);
		 class528_sub8 != null;
		 class528_sub8
		     = (Class528_Sub8) ((Class150) this).aClass688_1701
					   .method8037(-718615347)) {
		if (!class528_sub8.method9305())
		    i_22_++;
	    }
	    Class528_Sub8[] class528_sub8s = new Class528_Sub8[i_22_];
	    i_22_ = 0;
	    for (Class528_Sub8 class528_sub8
		     = (Class528_Sub8) ((Class150) this).aClass688_1701
					   .method8034(1371352687);
		 class528_sub8 != null;
		 class528_sub8
		     = (Class528_Sub8) ((Class150) this).aClass688_1701
					   .method8037(382234548)) {
		if (!class528_sub8.method9305())
		    class528_sub8s[i_22_++] = class528_sub8;
	    }
	    while (i_21_ < i_22_) {
		for (int i_24_ = 0; i_24_ < i_22_; i_24_++) {
		    Class528_Sub8 class528_sub8 = class528_sub8s[i_24_];
		    if (class528_sub8.method9312() == i_23_) {
			int i_25_ = class528_sub8.method9300();
			for (int i_26_ = 0; i_26_ < i_25_; i_26_++) {
			    ((Class150) this).aClass173_Sub2_1700
				.method8873(0, 0);
			    class528_sub8.method9298(i_26_,
						     (((Class150) this)
						      .aClass120_Sub4Array1702
						      [i_19_]),
						     (((Class150) this)
						      .aClass120_Sub4_1703),
						     i_18_, i);
			    if (i_26_ == i_25_ - 1 && i_21_ == i_22_ - 1) {
				((Class150) this).aClass173_Sub2_1700
				    .method2180
				    ((((Class150) this)
				      .aClass163_Sub1_Sub1_1689),
				     -434270367);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F,
						    (float) (0
							     + (((Class150)
								 this)
								.anInt1704)));
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
				OpenGL.glVertex2i(((Class150) this).anInt1697,
						  ((Class150) this).anInt1695);
				OpenGL.glTexCoord2f(0.0F,
						    (float) ((((Class150) this)
							      .anInt1704)
							     - i_18_));
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glVertex2i(((Class150) this).anInt1697,
						  (((Class150) this).anInt1695
						   + i_18_));
				OpenGL.glTexCoord2f((float) (0 + i),
						    (float) ((((Class150) this)
							      .anInt1704)
							     - i_18_));
				OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
				OpenGL.glVertex2i((((Class150) this).anInt1697
						   + i),
						  (((Class150) this).anInt1695
						   + i_18_));
				OpenGL.glTexCoord2f((float) (0 + i),
						    (float) (0
							     + (((Class150)
								 this)
								.anInt1704)));
				OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
				OpenGL.glVertex2i((((Class150) this).anInt1697
						   + i),
						  ((Class150) this).anInt1695);
				OpenGL.glEnd();
			    } else {
				((Class150) this).aClass163_Sub1_Sub1_1689
				    .method10327(i_20_);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F,
						    (float) (((Class150) this)
							     .anInt1704));
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
				OpenGL.glVertex2i(0, 0);
				OpenGL.glTexCoord2f(0.0F,
						    (float) ((((Class150) this)
							      .anInt1704)
							     - i_18_));
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glVertex2i(0, i_18_);
				OpenGL.glTexCoord2f((float) i,
						    (float) ((((Class150) this)
							      .anInt1704)
							     - i_18_));
				OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
				OpenGL.glVertex2i(i, i_18_);
				OpenGL.glTexCoord2f((float) i,
						    (float) (((Class150) this)
							     .anInt1704));
				OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
				OpenGL.glVertex2i(i, 0);
				OpenGL.glEnd();
			    }
			    class528_sub8.method9299(i_26_);
			    i_20_ = i_20_ + 1 & 0x1;
			    i_19_ = i_19_ + 1 & 0x1;
			}
			i_21_++;
		    }
		}
		i_23_++;
	    }
	    ((Class150) this).aBool1696 = false;
	    object = null;
	}
    }
    
    Class150(Class173_Sub2 class173_sub2) {
	((Class150) this).anInt1695 = 0;
	((Class150) this).anInt1694 = 1;
	((Class150) this).anInt1704 = 1;
	((Class150) this).aClass688_1701 = new Class688();
	((Class150) this).aBool1698 = true;
	((Class150) this).aBool1699 = true;
	((Class150) this).aBool1688 = true;
	((Class150) this).aBool1693 = true;
	((Class150) this).aClass120_Sub4Array1702 = new Class120_Sub4[2];
	((Class150) this).aBool1706 = false;
	((Class150) this).anInt1707 = 0;
	((Class150) this).aClass169_1708 = Class169.aClass169_1935;
	((Class150) this).aClass173_Sub2_1700 = class173_sub2;
	if (((Class173_Sub2) ((Class150) this).aClass173_Sub2_1700).aBool9506
	    && (((Class173_Sub2) ((Class150) this).aClass173_Sub2_1700)
		.aBool9577)) {
	    ((Class150) this).aClass163_Sub1_Sub1_1691
		= ((Class150) this).aClass163_Sub1_Sub1_1689
		= new Class163_Sub1_Sub1(((Class150) this)
					 .aClass173_Sub2_1700);
	    if ((((Class173_Sub2) ((Class150) this).aClass173_Sub2_1700)
		 .anInt9443) > 1
		&& (((Class173_Sub2) ((Class150) this).aClass173_Sub2_1700)
		    .aBool9567)
		&& (((Class173_Sub2) ((Class150) this).aClass173_Sub2_1700)
		    .aBool9568))
		((Class150) this).aClass163_Sub1_Sub1_1691
		    = ((Class150) this).aClass163_Sub1_Sub1_1690
		    = new Class163_Sub1_Sub1(((Class150) this)
					     .aClass173_Sub2_1700);
	}
    }
    
    void method1760() {
	int i = 0;
	boolean bool = false;
	Class169 class169 = Class169.aClass169_1935;
	for (Class528_Sub8 class528_sub8
		 = ((Class528_Sub8)
		    ((Class150) this).aClass688_1701.method8034(1200754454));
	     class528_sub8 != null;
	     class528_sub8 = (Class528_Sub8) ((Class150) this)
						 .aClass688_1701
						 .method8037(1356282816)) {
	    Class169 class169_27_ = class528_sub8.method9303();
	    if (class169_27_.anInt1942 * -1009481111
		> class169.anInt1942 * -1009481111)
		class169 = class169_27_;
	    bool |= class528_sub8.method9301();
	    i += class528_sub8.method9300();
	}
	if (class169 != ((Class150) this).aClass169_1708) {
	    ((Class150) this).aClass169_1708 = class169;
	    ((Class150) this).aBool1698 = true;
	}
	int i_28_ = (((Class150) this).anInt1707 > 2 ? 2
		     : ((Class150) this).anInt1707);
	int i_29_ = i > 2 ? 2 : i;
	if (i_28_ != i_29_) {
	    ((Class150) this).aBool1698 = true;
	    ((Class150) this).aBool1688 = true;
	}
	if (bool != ((Class150) this).aBool1706) {
	    ((Class150) this).aBool1706 = bool;
	    ((Class150) this).aBool1699 = true;
	}
	((Class150) this).anInt1707 = i;
    }
    
    void method1761() {
	int i = 0;
	boolean bool = false;
	Class169 class169 = Class169.aClass169_1935;
	for (Class528_Sub8 class528_sub8
		 = ((Class528_Sub8)
		    ((Class150) this).aClass688_1701.method8034(1847365764));
	     class528_sub8 != null;
	     class528_sub8 = (Class528_Sub8) ((Class150) this)
						 .aClass688_1701
						 .method8037(-1106915352)) {
	    Class169 class169_30_ = class528_sub8.method9303();
	    if (class169_30_.anInt1942 * -1009481111
		> class169.anInt1942 * -1009481111)
		class169 = class169_30_;
	    bool |= class528_sub8.method9301();
	    i += class528_sub8.method9300();
	}
	if (class169 != ((Class150) this).aClass169_1708) {
	    ((Class150) this).aClass169_1708 = class169;
	    ((Class150) this).aBool1698 = true;
	}
	int i_31_ = (((Class150) this).anInt1707 > 2 ? 2
		     : ((Class150) this).anInt1707);
	int i_32_ = i > 2 ? 2 : i;
	if (i_31_ != i_32_) {
	    ((Class150) this).aBool1698 = true;
	    ((Class150) this).aBool1688 = true;
	}
	if (bool != ((Class150) this).aBool1706) {
	    ((Class150) this).aBool1706 = bool;
	    ((Class150) this).aBool1699 = true;
	}
	((Class150) this).anInt1707 = i;
    }
    
    void method1762() {
	((Class150) this).aClass163_Sub1_Sub1_1689 = null;
	((Class150) this).aClass163_Sub1_Sub1_1690 = null;
	((Class150) this).aClass163_Sub1_Sub1_1691 = null;
	((Class150) this).aClass528_Sub21_Sub3_1705 = null;
	((Class150) this).aClass120_Sub4_1703 = null;
	((Class150) this).aClass120_Sub4Array1702 = null;
	((Class150) this).aClass528_Sub21_Sub3_1692 = null;
	if (!((Class150) this).aClass688_1701.method8040((byte) -78)) {
	    for (Node node
		     = ((Class150) this).aClass688_1701.method8034(1213646401);
		 node != ((Class150) this).aClass688_1701.aClass528_8655;
		 node = node.aClass528_7106)
		((Class528_Sub8) node).method9296();
	}
	((Class150) this).anInt1704 = 1;
	((Class150) this).anInt1694 = 1;
    }
}
