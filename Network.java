import java.io.*;
import java.net.*;
import java.util.*;
import static java.lang.System.out;
import java.math.BigInteger; 
import java.net.URL; 
import java.net.HttpURLConnection; 
import java.io.BufferedReader; 
import java.io.InputStreamReader; 
import java.util.ArrayList; 

public class Network {
    
    public static void Data () throws SocketException {
    Enumeration<NetworkInterface> nets = NetworkInterface.getNetworkInterfaces();
        for (NetworkInterface netint : Collections.list(nets))
            displayInterfaceInformation(netint);
        }
        
        static void displayInterfaceInformation(NetworkInterface netint) throws SocketException {
        
        out.printf("Display name: %s\n", netint.getDisplayName());
        out.printf("Name: %s\n", netint.getName());
        Enumeration<InetAddress> inetAddresses = netint.getInetAddresses();
        
        for (InetAddress inetAddress : Collections.list(inetAddresses)) {
            out.printf("  InetAddress: %s\n", inetAddress);
        }
        out.printf("\n");
        }    
}
