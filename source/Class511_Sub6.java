/* Class511_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class511_Sub6 extends Class511
{
    int anInt10304;
    String aString10305;
    int anInt10306;
    int anInt10307;
    int anInt10308;
    int anInt10309;
    int anInt10310;
    
    Class511_Sub6() {
	/* empty */
    }
    
    static String method9344(Class528_Sub21_Sub11 class528_sub21_sub11,
			     byte i) {
	if (((Class528_Sub21_Sub11) class528_sub21_sub11).aString11584 == null
	    || ((Class528_Sub21_Sub11) class528_sub21_sub11).aString11584
		   .length() == 0) {
	    if ((null
		 != ((Class528_Sub21_Sub11) class528_sub21_sub11).aString11596)
		&& ((Class528_Sub21_Sub11) class528_sub21_sub11)
		       .aString11596.length() > 0)
		return new StringBuilder().append
			   (((Class528_Sub21_Sub11) class528_sub21_sub11)
			    .aString11585)
			   .append
			   (Class39.aClass39_481.method807((Class378_Sub2
							    .aClass668_10123),
							   (byte) 102))
			   .append
			   (((Class528_Sub21_Sub11) class528_sub21_sub11)
			    .aString11596)
			   .toString();
	    return ((Class528_Sub21_Sub11) class528_sub21_sub11).aString11585;
	}
	if (((Class528_Sub21_Sub11) class528_sub21_sub11).aString11596 != null
	    && ((Class528_Sub21_Sub11) class528_sub21_sub11).aString11596
		   .length() > 0)
	    return new StringBuilder().append
		       (((Class528_Sub21_Sub11) class528_sub21_sub11)
			.aString11585)
		       .append
		       (Class39.aClass39_481.method807((Class378_Sub2
							.aClass668_10123),
						       (byte) 102))
		       .append
		       (((Class528_Sub21_Sub11) class528_sub21_sub11)
			.aString11596)
		       .append
		       (Class39.aClass39_481.method807((Class378_Sub2
							.aClass668_10123),
						       (byte) 102))
		       .append
		       (((Class528_Sub21_Sub11) class528_sub21_sub11)
			.aString11584)
		       .toString();
	return new StringBuilder().append
		   (((Class528_Sub21_Sub11) class528_sub21_sub11).aString11585)
		   .append
		   (Class39.aClass39_481
			.method807(Class378_Sub2.aClass668_10123, (byte) 102))
		   .append
		   (((Class528_Sub21_Sub11) class528_sub21_sub11).aString11584)
		   .toString();
    }
    
    public static RuntimeException_Sub4 method9345(Throwable throwable,
						   String string) {
	RuntimeException_Sub4 runtimeexception_sub4;
	if (throwable instanceof RuntimeException_Sub4) {
	    runtimeexception_sub4 = (RuntimeException_Sub4) throwable;
	    StringBuilder stringbuilder = new StringBuilder();
	    RuntimeException_Sub4 runtimeexception_sub4_0_
		= runtimeexception_sub4;
	    ((RuntimeException_Sub4) runtimeexception_sub4_0_).aString11934
		= stringbuilder.append
		      (((RuntimeException_Sub4) runtimeexception_sub4_0_)
		       .aString11934)
		      .append
		      (' ').append
		      (string).toString();
	} else
	    runtimeexception_sub4
		= new RuntimeException_Sub4(throwable, string);
	return runtimeexception_sub4;
    }
    
    public static int method9346(Random random, int i, int i_1_) {
	if (null == random) {
	    random = Class34.aRandom315;
	    if (null == random) {
		synchronized (Class34.anObject316) {
		    if (Class34.aRandom315 == null)
			Class34.aRandom315 = new Random();
		    random = Class34.aRandom315;
		}
	    }
	}
	if (i <= 0)
	    throw new IllegalArgumentException();
	if (Class507.method6152(i, 1128723200))
	    return (int) (((long) random.nextInt() & 0xffffffffL) * (long) i
			  >> 32);
	int i_2_ = -2147483648 - (int) (4294967296L % (long) i);
	int i_3_;
	do
	    i_3_ = random.nextInt();
	while (i_3_ >= i_2_);
	return Class232.method3254(i_3_, i, (byte) 115);
    }
}
