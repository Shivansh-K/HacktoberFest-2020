import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {

    public static void main(String[] args) throws UnknownHostException {
        if (args.length == 0){
            args = new String[]{"192.11010610"};
        }
        InetAddress address = InetAddress.getByName(args[0]);
        byte[] bytes = address.getAddress();
        int a = bytes[0] & 0xFF;
        int b = bytes[1] & 0xFF;
        int c = bytes[2] & 0xFF;
        int d = bytes[3] & 0xFF;
        System.out.println(a + "." + b + "." + c + "." + d);
        System.out.println(a + "." + b + "." + ((c << 8) + d));
        System.out.println(a + "." + ((((b << 8) + c) << 8) + d));
        int dec = 0;
        dec = (((((bytes[0] << 8) + bytes[1]) << 8) + bytes[2]) << 8) + bytes[3];
        for (int i = 2; i <= 16; i++) {
            System.out.println(i + ": " + Integer.toString(dec * -1, i));
        }
    }
}
