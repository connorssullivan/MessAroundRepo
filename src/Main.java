<<<<<<< HEAD
import javax.swing.*;
import java.net.InetAddress;

public class Main {
    public static void main(String[] args) throws Exception{
        InetAddress host = InetAddress.getLocalHost();

        String output = "Network Information\nLocal Host IPv4 Address: " +
                host.getHostAddress();

        JOptionPane.showMessageDialog(null, output, "IP Address",
                JOptionPane.WARNING_MESSAGE);
=======
public class Main {
    public static void main(String[] args) {
        String p = generator.generate();
        Saver.save(p);
>>>>>>> 920e41f (Password)
    }
}
