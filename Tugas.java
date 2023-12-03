import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama host: ");
        String hostName = scanner.nextLine();

        try {
            InetAddress[] addresses = InetAddress.getAllByName(hostName);

            System.out.println("Alamat IP untuk " + hostName + ":");
            for (InetAddress address : addresses) {
                System.out.println(address.getHostAddress());
            }
        } catch (UnknownHostException e) {
            System.out.println("Tidak dapat menemukan alamat IP untuk " + hostName);
        } finally {
            scanner.close();
        }
    }
}
