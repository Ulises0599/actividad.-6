
import java.net.SocketException;

public class Software {
    public static void Data () throws SocketException {
        System.out.println("Max Memory   : " +
                   Runtime.getRuntime().maxMemory());
        System.out.println("Total Memory : " +
                    Runtime.getRuntime().totalMemory());
        System.out.println("Free Memory  : " + 
                Runtime.getRuntime().freeMemory());  
    }
    
}
