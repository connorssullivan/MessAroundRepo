import java.util.Scanner;

public class generator {


    public static String generate() {
        Scanner scanner = new Scanner(System.in);
        String lowerAlphabet = "abcdefghijklmnopqrstuvwxyz";
        String upperAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String specialCharecters = "!@#$%^&*()-_+={[}]|:;\"\'<,>.?/\'";

        int random = (int)(3*Math.random()); //maybe use later to switch some things aroung

        //Lowercaseletters
        System.out.println("How many letters does your password have?");
        String ranLetters = "";
        int lettersInput = scanner.nextInt();
        for(int i = 0; i<=lettersInput;i++) {
            int ranNum = (int)(lowerAlphabet.length() * Math.random());
            ranLetters += String.valueOf(lowerAlphabet.charAt(ranNum));
        }

        //UpperCaseLetters
        System.out.println("How many uppercase letters does your password have?");
        int upperCaseInput = scanner.nextInt();
        String ranUpperCase = "";
        for (int i = 0; i < upperCaseInput; i++) {
            int ranNum = (int)(upperAlphabet.length() * Math.random());
            ranUpperCase += String.valueOf(upperAlphabet).charAt(ranNum);
        }

        //Numbers
        System.out.println("How many numbers does your password have?");
        int numbersInput = scanner.nextInt();
        String ranNums = "";
        for (int i = 0; i < numbersInput; i++) {
            int ranNum = (int)(numbers.length() * Math.random());
            ranNums += String.valueOf(numbers).charAt(ranNum);
        }

        System.out.println("How many special charecters does your password have?");
        int specialCharectersInput = scanner.nextInt();
        String ranSpecialCharecters = "";
        for (int i = 0; i < specialCharectersInput; i++) {
            int ranNum = (int)(specialCharecters.length() * Math.random());
            ranSpecialCharecters += String.valueOf(specialCharecters).charAt(ranNum);
        }


        String generatedCharecters = password.fullPassword(new password(ranLetters, ranUpperCase, ranNums, ranSpecialCharecters));

        return generatedCharecters;
    }
}
