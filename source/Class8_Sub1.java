/* Class8_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;

public class Class8_Sub1 extends Class8
{
    static final String aString10770 = "java.net.useSystemProxies";
    ProxySelector aProxySelector10771 = ProxySelector.getDefault();
    static int anInt10772;
    
    Socket method10051(Proxy proxy, byte i) throws IOException {
	if (proxy.type() == Proxy.Type.DIRECT)
	    return method569(-1537763651);
	java.net.SocketAddress socketaddress = proxy.address();
	if (!(socketaddress instanceof InetSocketAddress))
	    return null;
	InetSocketAddress inetsocketaddress
	    = (InetSocketAddress) socketaddress;
	if (proxy.type() == Proxy.Type.HTTP) {
	    String string = null;
	    try {
		Class var_class
		    = (Class.forName
		       ("sun.net.www.protocol.http.AuthenticationInfo"));
		Method method
		    = var_class.getDeclaredMethod("getProxyAuth",
						  (new Class[]
						   { java.lang.String.class,
						     Integer.TYPE }));
		method.setAccessible(true);
		Object object
		    = method.invoke(null, (new Object[]
					   { inetsocketaddress.getHostName(),
					     new Integer(inetsocketaddress
							     .getPort()) }));
		if (null != object) {
		    Method method_0_
			= (var_class.getDeclaredMethod
			   ("supportsPreemptiveAuthorization", new Class[0]));
		    method_0_.setAccessible(true);
		    if (((Boolean) method_0_.invoke(object, new Object[0]))
			    .booleanValue()) {
			Method method_1_
			    = var_class.getDeclaredMethod("getHeaderName",
							  new Class[0]);
			method_1_.setAccessible(true);
			Method method_2_
			    = (var_class.getDeclaredMethod
			       ("getHeaderValue",
				new Class[] { java.net.URL.class,
					      java.lang.String.class }));
			method_2_.setAccessible(true);
			String string_3_
			    = (String) method_1_.invoke(object, new Object[0]);
			String string_4_
			    = ((String)
			       method_2_.invoke(object,
						(new Object[]
						 { new URL(new StringBuilder
							       ().append
							       ("https://")
							       .append
							       (((Class8_Sub1)
								 this)
								.aString137)
							       .append
							       ("/")
							       .toString()),
						   "https" })));
			string = new StringBuilder().append(string_3_).append
				     (": ").append
				     (string_4_).toString();
		    }
		}
	    } catch (Exception exception) {
		/* empty */
	    }
	    return method10052(inetsocketaddress.getHostName(),
			       inetsocketaddress.getPort(), string, (byte) 47);
	}
	if (proxy.type() == Proxy.Type.SOCKS) {
	    Socket socket = new Socket(proxy);
	    socket.connect(new InetSocketAddress((((Class8_Sub1) this)
						  .aString137),
						 (((Class8_Sub1) this).anInt136
						  * 1935038759)));
	    return socket;
	}
	return null;
    }
    
    Socket method10052(String string, int i, String string_5_, byte i_6_)
	throws IOException {
	Socket socket = new Socket(string, i);
	socket.setSoTimeout(10000);
	OutputStream outputstream = socket.getOutputStream();
	if (null == string_5_)
	    outputstream.write(new StringBuilder().append("CONNECT ").append
				   (((Class8_Sub1) this).aString137).append
				   (":").append
				   (1935038759 * ((Class8_Sub1) this).anInt136)
				   .append
				   (" HTTP/1.0\n\n").toString
				   ().getBytes(Charset.forName("ISO-8859-1")));
	else
	    outputstream.write(new StringBuilder().append("CONNECT ").append
				   (((Class8_Sub1) this).aString137).append
				   (":").append
				   (1935038759 * ((Class8_Sub1) this).anInt136)
				   .append
				   (" HTTP/1.0\n").append
				   (string_5_).append
				   ("\n\n").toString
				   ().getBytes(Charset.forName("ISO-8859-1")));
	outputstream.flush();
	BufferedReader bufferedreader
	    = new BufferedReader(new InputStreamReader(socket
							   .getInputStream()));
	String string_7_ = bufferedreader.readLine();
	if (string_7_ != null) {
	    if (string_7_.startsWith("HTTP/1.0 200")
		|| string_7_.startsWith("HTTP/1.1 200"))
		return socket;
	    if (string_7_.startsWith("HTTP/1.0 407")
		|| string_7_.startsWith("HTTP/1.1 407")) {
		int i_8_ = 0;
		String string_9_ = "proxy-authenticate: ";
		for (string_7_ = bufferedreader.readLine();
		     null != string_7_ && i_8_ < 50; i_8_++) {
		    if (string_7_.toLowerCase().startsWith(string_9_)) {
			string_7_
			    = string_7_.substring(string_9_.length()).trim();
			int i_10_ = string_7_.indexOf(' ');
			if (-1 != i_10_)
			    string_7_ = string_7_.substring(0, i_10_);
			throw new IOException_Sub1(string_7_);
		    }
		    string_7_ = bufferedreader.readLine();
		}
		throw new IOException_Sub1("");
	    }
	}
	outputstream.close();
	bufferedreader.close();
	socket.close();
	return null;
    }
    
    public Socket method568() throws IOException {
	boolean bool = (Boolean.parseBoolean
			(System.getProperty("java.net.useSystemProxies")));
	if (!bool)
	    System.setProperty("java.net.useSystemProxies", "true");
	boolean bool_11_ = 443 == 1935038759 * ((Class8_Sub1) this).anInt136;
	List list;
	List list_12_;
	try {
	    list = (((Class8_Sub1) this).aProxySelector10771.select
		    (new URI(new StringBuilder().append
				 (bool_11_ ? "https" : "http").append
				 ("://").append
				 (((Class8_Sub1) this).aString137)
				 .toString())));
	    list_12_ = (((Class8_Sub1) this).aProxySelector10771.select
			(new URI(new StringBuilder().append
				     (bool_11_ ? "http" : "https").append
				     ("://").append
				     (((Class8_Sub1) this).aString137)
				     .toString())));
	} catch (URISyntaxException urisyntaxexception) {
	    return method569(-1110127713);
	}
	list.addAll(list_12_);
	Object[] objects = list.toArray();
	IOException_Sub1 ioexception_sub1 = null;
	Object[] objects_13_ = objects;
	for (int i = 0; i < objects_13_.length; i++) {
	    Object object = objects_13_[i];
	    Proxy proxy = (Proxy) object;
	    Socket socket;
	    try {
		Socket socket_14_ = method10051(proxy, (byte) -48);
		if (null == socket_14_)
		    continue;
		socket = socket_14_;
	    } catch (IOException_Sub1 ioexception_sub1_15_) {
		ioexception_sub1 = ioexception_sub1_15_;
		continue;
	    } catch (IOException ioexception) {
		continue;
	    }
	    return socket;
	}
	if (null != ioexception_sub1)
	    throw ioexception_sub1;
	return method569(-1454964835);
    }
    
    public Socket method571() throws IOException {
	boolean bool = (Boolean.parseBoolean
			(System.getProperty("java.net.useSystemProxies")));
	if (!bool)
	    System.setProperty("java.net.useSystemProxies", "true");
	boolean bool_16_ = 443 == 1935038759 * ((Class8_Sub1) this).anInt136;
	List list;
	List list_17_;
	try {
	    list = (((Class8_Sub1) this).aProxySelector10771.select
		    (new URI(new StringBuilder().append
				 (bool_16_ ? "https" : "http").append
				 ("://").append
				 (((Class8_Sub1) this).aString137)
				 .toString())));
	    list_17_ = (((Class8_Sub1) this).aProxySelector10771.select
			(new URI(new StringBuilder().append
				     (bool_16_ ? "http" : "https").append
				     ("://").append
				     (((Class8_Sub1) this).aString137)
				     .toString())));
	} catch (URISyntaxException urisyntaxexception) {
	    return method569(1647770151);
	}
	list.addAll(list_17_);
	Object[] objects = list.toArray();
	IOException_Sub1 ioexception_sub1 = null;
	Object[] objects_18_ = objects;
	for (int i = 0; i < objects_18_.length; i++) {
	    Object object = objects_18_[i];
	    Proxy proxy = (Proxy) object;
	    Socket socket;
	    try {
		Socket socket_19_ = method10051(proxy, (byte) -50);
		if (null == socket_19_)
		    continue;
		socket = socket_19_;
	    } catch (IOException_Sub1 ioexception_sub1_20_) {
		ioexception_sub1 = ioexception_sub1_20_;
		continue;
	    } catch (IOException ioexception) {
		continue;
	    }
	    return socket;
	}
	if (null != ioexception_sub1)
	    throw ioexception_sub1;
	return method569(54888376);
    }
    
    public Socket method567(int i) throws IOException {
	boolean bool = (Boolean.parseBoolean
			(System.getProperty("java.net.useSystemProxies")));
	if (!bool)
	    System.setProperty("java.net.useSystemProxies", "true");
	boolean bool_21_ = 443 == 1935038759 * ((Class8_Sub1) this).anInt136;
	List list;
	List list_22_;
	try {
	    list = (((Class8_Sub1) this).aProxySelector10771.select
		    (new URI(new StringBuilder().append
				 (bool_21_ ? "https" : "http").append
				 ("://").append
				 (((Class8_Sub1) this).aString137)
				 .toString())));
	    list_22_ = (((Class8_Sub1) this).aProxySelector10771.select
			(new URI(new StringBuilder().append
				     (bool_21_ ? "http" : "https").append
				     ("://").append
				     (((Class8_Sub1) this).aString137)
				     .toString())));
	} catch (URISyntaxException urisyntaxexception) {
	    return method569(-178071246);
	}
	list.addAll(list_22_);
	Object[] objects = list.toArray();
	IOException_Sub1 ioexception_sub1 = null;
	Object[] objects_23_ = objects;
	for (int i_24_ = 0; i_24_ < objects_23_.length; i_24_++) {
	    Object object = objects_23_[i_24_];
	    Proxy proxy = (Proxy) object;
	    Socket socket;
	    try {
		Socket socket_25_ = method10051(proxy, (byte) -70);
		if (null == socket_25_)
		    continue;
		socket = socket_25_;
	    } catch (IOException_Sub1 ioexception_sub1_26_) {
		ioexception_sub1 = ioexception_sub1_26_;
		continue;
	    } catch (IOException ioexception) {
		continue;
	    }
	    return socket;
	}
	if (null != ioexception_sub1)
	    throw ioexception_sub1;
	return method569(1114574085);
    }
    
    public Socket method570() throws IOException {
	boolean bool = (Boolean.parseBoolean
			(System.getProperty("java.net.useSystemProxies")));
	if (!bool)
	    System.setProperty("java.net.useSystemProxies", "true");
	boolean bool_27_ = 443 == 1935038759 * ((Class8_Sub1) this).anInt136;
	List list;
	List list_28_;
	try {
	    list = (((Class8_Sub1) this).aProxySelector10771.select
		    (new URI(new StringBuilder().append
				 (bool_27_ ? "https" : "http").append
				 ("://").append
				 (((Class8_Sub1) this).aString137)
				 .toString())));
	    list_28_ = (((Class8_Sub1) this).aProxySelector10771.select
			(new URI(new StringBuilder().append
				     (bool_27_ ? "http" : "https").append
				     ("://").append
				     (((Class8_Sub1) this).aString137)
				     .toString())));
	} catch (URISyntaxException urisyntaxexception) {
	    return method569(1548625514);
	}
	list.addAll(list_28_);
	Object[] objects = list.toArray();
	IOException_Sub1 ioexception_sub1 = null;
	Object[] objects_29_ = objects;
	for (int i = 0; i < objects_29_.length; i++) {
	    Object object = objects_29_[i];
	    Proxy proxy = (Proxy) object;
	    Socket socket;
	    try {
		Socket socket_30_ = method10051(proxy, (byte) 0);
		if (null == socket_30_)
		    continue;
		socket = socket_30_;
	    } catch (IOException_Sub1 ioexception_sub1_31_) {
		ioexception_sub1 = ioexception_sub1_31_;
		continue;
	    } catch (IOException ioexception) {
		continue;
	    }
	    return socket;
	}
	if (null != ioexception_sub1)
	    throw ioexception_sub1;
	return method569(1611483282);
    }
    
    Class8_Sub1() {
	/* empty */
    }
}
