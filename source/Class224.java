/* Class224 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class224 implements Interface25
{
    int anInt2328;
    boolean aBool2329;
    Class207 this$0;
    public static Class5_Sub18 aClass5_Sub18_2330;
    static int anInt2331;
    
    Class224(Class207 class207, ByteBuffer class528_sub42) {
	((Class224) this).this$0 = class207;
	((Class224) this).anInt2328
	    = class528_sub42.readUnsignedShort(-1424370133) * 507798843;
	((Class224) this).aBool2329
	    = class528_sub42.readUnsignedByte((byte) 77) == 1;
    }
    
    public void method140(Class216 class216, int i) {
	class216.method3036(453585907 * ((Class224) this).anInt2328,
			    ((Class224) this).aBool2329, 694537815);
	class216.method3028
	    (((Class224) this).anInt2328 * 453585907, -631690615)
	    .method2987(2036810803);
    }
    
    public void method141(Class216 class216) {
	class216.method3036(453585907 * ((Class224) this).anInt2328,
			    ((Class224) this).aBool2329, 1720971306);
	class216.method3028
	    (((Class224) this).anInt2328 * 453585907, 1007773236)
	    .method2987(2032677958);
    }
    
    public void method139(Class216 class216) {
	class216.method3036(453585907 * ((Class224) this).anInt2328,
			    ((Class224) this).aBool2329, 2032878882);
	class216.method3028
	    (((Class224) this).anInt2328 * 453585907, 487855835)
	    .method2987(2122330949);
    }
    
    public void method138(Class216 class216) {
	class216.method3036(453585907 * ((Class224) this).anInt2328,
			    ((Class224) this).aBool2329, 1314054893);
	class216.method3028
	    (((Class224) this).anInt2328 * 453585907, 2143992580)
	    .method2987(1970689051);
    }
    
    public static void method3169(boolean bool, boolean bool_0_, int i) {
	if (bool) {
	    Class649.anInt8421 += -1217565889;
	    Class327.method4260(-1980673625);
	}
	if (bool_0_) {
	    Class649.anInt8419 += -1925305261;
	    Class622.method7418(711966036);
	}
    }
    
    static void method3170
	(NPC class645_sub1_sub5_sub1_sub1,
	 boolean bool, int i) {
	if (-1024340783 * Class28.anInt303 < 406) {
	    Class299 class299 = class645_sub1_sub5_sub1_sub1.aClass299_12043;
	    String string = class645_sub1_sub5_sub1_sub1.aString12044;
	    if (null != class299.anIntArray3302) {
		class299
		    = class299.method3996(Class570.playerVarsProvider,
					  Class570.playerVarsProvider, -1465044458);
		if (class299 == null)
		    return;
		string = class299.aString3269;
	    }
	    if (class299.aBool3305) {
		if (0
		    != -807024423 * class645_sub1_sub5_sub1_sub1.anInt12038) {
		    String string_1_
			= (Class673.aClass673_8531 == client.aClass673_11108
			   ? Class39.aClass39_478.method807((Class378_Sub2
							     .aClass668_10123),
							    (byte) 102)
			   : Class39.aClass39_476.method807((Class378_Sub2
							     .aClass668_10123),
							    (byte) 102));
		    string = new StringBuilder().append(string).append
				 (Class364_Sub1.method9171
				  ((-807024423
				    * class645_sub1_sub5_sub1_sub1.anInt12038),
				   (Class108.myPlayer
				    .combatLevel) * 1305140229,
				   1563117295))
				 .append
				 (Class49.aString551).append
				 (string_1_).append
				 (class645_sub1_sub5_sub1_sub1.anInt12038
				  * -807024423)
				 .append
				 (Class49.aString552).toString();
		}
		if (client.aBool10899 && !bool) {
		    Class79 class79
			= ((Class79)
			   (-1 != Class690.anInt8680 * -1138738213
			    ? (Class208.aClass5_Sub10_2239.method63
			       (-1138738213 * Class690.anInt8680, -1772913188))
			    : null));
		    if (0 != (-856748185 * Class296.anInt3249 & 0x2)
			&& (null == class79
			    || (class299.method3999((-1138738213
						     * Class690.anInt8680),
						    (1875093329
						     * class79.anInt809),
						    -1632157373)
				!= 1875093329 * class79.anInt809)))
			Class280.method3738
			    (client.aString10902,
			     new StringBuilder().append
				 (client.aString11175).append
				 (" ").append
				 (Class49.aString553).append
				 (" ").append
				 (Class666.method7905(16776960, (short) 13047))
				 .append
				 (string).toString(),
			     Class528_Sub6.anInt10255 * -555764949, 8, -1,
			     (long) (-34811601 * (class645_sub1_sub5_sub1_sub1
						  .anInt11783)),
			     0, 0, true, false,
			     (long) (-34811601 * (class645_sub1_sub5_sub1_sub1
						  .anInt11783)),
			     false, -1691840010);
		}
		if (!bool) {
		    String[] strings = class299.aStringArray3286;
		    if (client.aBool11063)
			strings
			    = Class148_Sub1.method8268(strings, -874021539);
		    if (null != strings) {
			for (int i_2_ = strings.length - 1; i_2_ >= 0;
			     i_2_--) {
			    if (strings[i_2_] != null
				&& ((class645_sub1_sub5_sub1_sub1.anInt12046
				     * 620032875)
				    & 1 << i_2_) == 0
				&& (class299.aByte3329 == 0
				    || (!(strings[i_2_].equalsIgnoreCase
					  (Class39.aClass39_513.method807
					   (Class378_Sub2.aClass668_10123,
					    (byte) 102)))
					&& !(strings[i_2_].equalsIgnoreCase
					     (Class39.aClass39_405.method807
					      (Class378_Sub2.aClass668_10123,
					       (byte) 102)))))) {
				int i_3_ = 0;
				int i_4_ = -1058229845 * client.anInt11036;
				if (i_2_ == 0)
				    i_3_ = 9;
				if (i_2_ == 1)
				    i_3_ = 10;
				if (2 == i_2_)
				    i_3_ = 11;
				if (i_2_ == 3)
				    i_3_ = 12;
				if (i_2_ == 4)
				    i_3_ = 13;
				if (5 == i_2_)
				    i_3_ = 1003;
				int i_5_
				    = class299.method4003(i_2_, 2146502337);
				if (i_5_ != -1)
				    i_4_ = i_5_;
				Class280.method3738
				    (strings[i_2_],
				     new StringBuilder().append
					 (Class666.method7905(16776960,
							      (short) 1694))
					 .append
					 (string).toString(),
				     ((strings[i_2_].equalsIgnoreCase
				       (Class39.aClass39_513.method807
					(Class378_Sub2.aClass668_10123,
					 (byte) 102)))
				      ? class299.anInt3270 * 897522471 : i_4_),
				     i_3_, -1,
				     (long) (-34811601
					     * (class645_sub1_sub5_sub1_sub1
						.anInt11783)),
				     0, 0, true, false,
				     (long) ((class645_sub1_sub5_sub1_sub1
					      .anInt11783)
					     * -34811601),
				     false, -608300099);
			    }
			}
			if (class299.aByte3329 == 1) {
			    for (int i_6_ = 0; i_6_ < strings.length; i_6_++) {
				if (null != strings[i_6_]
				    && 0 == ((620032875
					      * (class645_sub1_sub5_sub1_sub1
						 .anInt12046))
					     & 1 << i_6_)
				    && ((strings[i_6_].equalsIgnoreCase
					 (Class39.aClass39_513.method807
					  (Class378_Sub2.aClass668_10123,
					   (byte) 102)))
					|| (strings[i_6_].equalsIgnoreCase
					    (Class39.aClass39_405.method807
					     (Class378_Sub2.aClass668_10123,
					      (byte) 102))))) {
				    short i_7_ = 0;
				    if ((-807024423
					 * (class645_sub1_sub5_sub1_sub1
					    .anInt12038))
					> (1305140229
					   * (Class108
					      .myPlayer
					      .combatLevel)))
					i_7_ = (short) 2000;
				    short i_8_ = 0;
				    int i_9_ = -1058229845 * client.anInt11036;
				    if (i_6_ == 0)
					i_8_ = (short) 9;
				    if (i_6_ == 1)
					i_8_ = (short) 10;
				    if (i_6_ == 2)
					i_8_ = (short) 11;
				    if (i_6_ == 3)
					i_8_ = (short) 12;
				    if (i_6_ == 4)
					i_8_ = (short) 13;
				    if (5 == i_6_)
					i_8_ = (short) 1003;
				    if (i_8_ != 0)
					i_8_ += i_7_;
				    int i_10_
					= class299.method4003(i_6_,
							      2142941815);
				    if (i_10_ != -1)
					i_9_ = i_10_;
				    Class280.method3738
					(strings[i_6_],
					 new StringBuilder().append
					     (Class666.method7905
					      (16776960, (short) 4226))
					     .append
					     (string).toString(),
					 ((strings[i_6_].equalsIgnoreCase
					   (Class39.aClass39_513.method807
					    (Class378_Sub2.aClass668_10123,
					     (byte) 102)))
					  ? class299.anInt3270 * 897522471
					  : i_9_),
					 i_8_, -1,
					 (long) ((class645_sub1_sub5_sub1_sub1
						  .anInt11783)
						 * -34811601),
					 0, 0, true, false,
					 (long) ((class645_sub1_sub5_sub1_sub1
						  .anInt11783)
						 * -34811601),
					 false, -1353630084);
				}
			    }
			}
		    }
		}
	    }
	}
    }
    
    static HandshakeOpcode[] method3171(int i) {
	return (new HandshakeOpcode[]
		{ HandshakeOpcode.aClass404_4586, HandshakeOpcode.aClass404_4588,
		  HandshakeOpcode.aClass404_4582, HandshakeOpcode.aClass404_4584,
		  HandshakeOpcode.aClass404_4579, HandshakeOpcode.aClass404_4580,
		  HandshakeOpcode.aClass404_4587, HandshakeOpcode.aClass404_4581,
		  HandshakeOpcode.aClass404_4578, HandshakeOpcode.aClass404_4583,
		  HandshakeOpcode.aClass404_4585, HandshakeOpcode.aClass404_4589 });
    }
}
