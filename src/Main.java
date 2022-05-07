import javax.swing.*;
import java.net.InetAddress;

public class Main {
    public static void main(String[] args) throws Exception{
        InetAddress host = InetAddress.getLocalHost();

        String output = "Network Information\nLocal Host IPv4 Address: " +
                host.getHostAddress();

        JOptionPane.showMessageDialog(null, output, "IP Address",
                JOptionPane.WARNING_MESSAGE);
    }
}
