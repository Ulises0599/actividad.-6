import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Hardware {
    public static void Data() {
        String java_version = System.getProperty("java.version");
        String version_message = String.format("\nJava version: %s", java_version);
        System.out.println(version_message);
        
        InetAddress ip;
	try {	
		ip = InetAddress.getLocalHost();
		System.out.println("IP: " + ip.getHostAddress());
		
		NetworkInterface network = NetworkInterface.getByInetAddress(ip);
			
		byte[] mac = network.getHardwareAddress();
			
		System.out.print("MAC: ");
			
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < mac.length; i++) {
			sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));		
		}
		System.out.println(sb.toString());
			
	} catch (UnknownHostException e) {
		e.printStackTrace();
	} catch (SocketException e){
		e.printStackTrace();
        }
         System.out.println(" ");
    }
}
