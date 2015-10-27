import java.applet.Applet;
import java.applet.AppletStub;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Properties;

import javax.swing.JFrame;

/**
 * An Applet used for loading the RS3 Client.
 * @author Frosty Teh Snowman <Skype:travis.mccorkle>
 */
public class Loader extends Applet implements AppletStub {

	/**
	 * An generated serial UID.
	 */
	private static final long serialVersionUID = 1670498001014004354L;
	
	/**
	 * Connecting to Rs or a Rsps
	 */
	public static boolean RSPS = true;
	
	/**
	 * Chooses ip based on if Rs or Rsps
	 */
	public static String Host = RSPS ? "127.0.0.1" : "world2.runescape.com";
	
	/**
	 * Boolean to dump packets
	 */
	public static boolean DUMP_PACKETS = true;
	/**
	 * Boolean to dump varps
	 */
	public static boolean DUMP_VARPS = true;
	/**
	 * Boolean to dump varcs
	 */
	public static boolean DUMP_VARCS = true;


	/**
	 * The parameters of the client.
	 */
	private Properties params = new Properties();
	
	/**
	 * The current frame of the client application.
	 */
	public JFrame clientFrame = null;
	
	/**
	 * The main entry point of the current application.
	 * @param args The command line arguments.
	 * @throws IOException 
	 * @throws MalformedURLException 
	 */
	public static void main(String... args) throws MalformedURLException, IOException {
		Loader launch = new Loader();
		launch.readParameters();
		launch.openFrame();
		launch.startClient();
		launch.clientFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/**
	 * Starts the actual client.
	 */
	private void startClient() {
		try {
			Class<?> client_class = Class.forName("client");
            Object v_client = client_class.getConstructor().newInstance();
			client_class.getSuperclass().getMethod("supplyApplet", Applet.class).invoke(v_client, this);
			client_class.getMethod("init").invoke(v_client);
			client_class.getMethod("start").invoke(v_client);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Opens the actual frame application.
	 */
	private void openFrame() {
		clientFrame = new JFrame("#857");
		clientFrame.add(this);
		clientFrame.setVisible(true);
		clientFrame.setSize(800, 600);		
	}

	/**
	 * Reads the parameters text file, and stores the parameters.
	 * @throws IOException 
	 * @throws MalformedURLException 
	 */
	private void readParameters() throws MalformedURLException, IOException {
		if (!RSPS) {
			for (String line : fetchPageDetails()) {
				if (line.contains("<param name=")) {
					String key = line.split("<param name=\"")[1].split("\" ")[0];
					String value = line.split("value=\"")[1].split("\">'")[0];
					if (value.isEmpty())
						value = "";
					params.put(key, value);
				}
			}
		} else {
			params.put("44", "halign=true|valign=true|image=rs_logo.gif,0,-43|rotatingimage=rs3_loading_spinner.gif,0,47,9.6|progress=true,Verdana,13,0xFFFFFF,0,51");
			params.put("46", "false");
			params.put("47", "0");
			params.put("48", "1200");
			params.put("minor", "1");
			params.put("49", "0");
			params.put("java_arguments", "-Xmx384m -Xss2m -Dsun.java2d.noddraw=true -XX:CompileThreshold=1500 -Xincgc -XX:+UseConcMarkSweepGC -XX:+UseParNewGC");
			params.put("haveie6", "true");
			params.put("gamepack", "gamepack9Jxi3d4cJufWHwLrj5jkNFd39Sj2EwIC_164005.jar  code=Rs2Applet.class");
			params.put("major", "857");
			params.put("centerimage", "true");
			params.put("50", "443");
			params.put("51", "http://" + Host);
			params.put("52", "1795457854");
			params.put("10", "false");
			params.put("11", "http://services.runescape.com/m=gamelogspecs/clientstats?data=");
			params.put("image", "http://www.runescape.com/img/game/splash6.gif");
			params.put("12", "0");
			params.put("13", "http://" + Host);
			params.put("14", "");
			params.put("15", "false");
			params.put("-1", "LQJnkk-nCIhlIpFqXCJ0oA");
			params.put("16", "0");
			params.put("17", "false");
			params.put("18", "0");
			params.put("19", "0");
			params.put("0", "xlMQwVzMn71Ix4GuZt66rQ");
			params.put("1", "");
			params.put("2", "43594");
			params.put("3", "0");
			params.put("4", "false");
			params.put("5", "80");
			params.put("6", "1146");
			params.put("7", "225");
			params.put("8", "0");
			params.put("name", "RS");
			params.put("9", "wwGlrZHF5gKN6D3mDdihco3oPeYN2KFybL9hUUFqOvk");
			params.put("20", "");
			params.put("21", "443");
			params.put("22", "43594");
			params.put("23", ".runescape.com");
			params.put("24", "http://" + Host);
			params.put("25", "0");
			params.put("27", "false");
			params.put("28", "9Jxi3d4cJufWHwLrj5jkNFd39Sj2EwIC");
			params.put("29", "");
			params.put("separate_jvm", "true");
			params.put("30", "7");
			params.put("31", "");
			params.put("33", "43594");
			params.put("34", "false");
			params.put("35", "false");
			params.put("36", "443");
			params.put("37", "443");
			params.put("38", "false");
			params.put("39", "0");
			params.put("boxbgcolor", "black");
			params.put("boxborder", "false");
			params.put("40", Host);
			params.put("41", Host);
			params.put("42", "62758");
			params.put("43", "0");


		}
	}

	/*
	 * (non-Javadoc)
	 * @see java.applet.AppletStub#appletResize(int, int)
	 */
	@Override
	public void appletResize(int dimensionX, int dimensionY) {
		super.resize(new Dimension(dimensionX, dimensionY));
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.applet.Applet#getParameter(java.lang.String)
	 */
	@Override
	public String getParameter(String paramName) {
		return (String) params.get(paramName);
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.applet.Applet#getDocumentBase()
	 */
	@Override
	public URL getDocumentBase() {
		try {
			return new URL("http://"+Host);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.applet.Applet#getCodeBase()
	 */
	@Override
	public URL getCodeBase() {
		try {
			return new URL("http://"+Host);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * Fetches the current parameters from the specified address
	 * @return
	 * @throws MalformedURLException
	 * @throws IOException
	 */
	public static ArrayList<String> fetchPageDetails() throws MalformedURLException, IOException {
		ArrayList<String> pageSource = new ArrayList<String>();
		BufferedReader reader = new BufferedReader(new InputStreamReader(new URL("http://"+Host).openStream()));
		String line;
		while ((line = reader.readLine()) != null)
			pageSource.add(line);
		reader.close();
		return pageSource;
	}
	
	/**
	 * {@code dumps the varps}
	 * 
	 * @param value
	 * @param key
	 */
	public static void sendVarps(int i, int i_2) {
		System.out.println("sendVarp(" + i + ", " + i_2 + ");");
	}

	/**
	 * Dumps the varcs
	 * 
	 * @param key
	 * @param val
	 */
	public static void sendVarc(int key, int val) {
		System.out.println("sendVarc(" + key + ", " + val + ");");
	}

}
