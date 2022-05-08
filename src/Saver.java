import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Saver {

    public static void save(String password) {
        Scanner scanner = new Scanner(System.in);
        File file = new File("passwords.txt");
        FileWriter fw = null;
        try {
            fw = new FileWriter(file,true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        PrintWriter pw = new PrintWriter(fw);

        System.out.println("What is this password for? ");
        String thing = scanner.nextLine();

        System.out.println("Whats your username? ");
        String username = scanner.nextLine();

        pw.println(thing + "\nUsername: " + username + "\nPassword: " + password + "\n");

        pw.close();
    }
}
