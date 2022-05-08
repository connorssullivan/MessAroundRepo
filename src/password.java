import java.util.ArrayList;
import java.util.LinkedList;

public class password {
    private String letters;
    private String upperCaseLetters;
    private String numbers;
    private String specialCharecters;

    public String getLetters() {
        return letters;
    }

    public String getUpperCaseLetters() {
        return upperCaseLetters;
    }

    public String getNumbers() {
        return numbers;
    }

    public String getSpecialCharecters() {
        return specialCharecters;
    }

    public password(String letters, String upperCaseLetters, String numbers, String specialCharecters) {
        this.letters = letters;
        this.upperCaseLetters = upperCaseLetters;
        this.numbers = numbers;
        this.specialCharecters = specialCharecters;
    }

    public static String fullPassword(password password) {

        String charecters = password.getLetters() + password.getUpperCaseLetters() + password.getNumbers() + password.getSpecialCharecters();
        //return password.mixPassword(charecters);
        return charecters;
    }

    //broken
    private String mixPassword(String generatedPassword) {
        int random = (int)(3*Math.random());
        char[] g = generatedPassword.toCharArray();
        ArrayList<Character> generatedPasswordArray = new ArrayList<Character>();
        for (int i = 0; i < g.length;i++) {
            generatedPasswordArray.add(g[i]);
        }
        String mixedPassword = "";
        for(int i = 0; i < generatedPasswordArray.size();i++) {
            int ran = (int) (generatedPasswordArray.size() * Math.random()); //ran will contain the index of the charecter I have to get rid of everyloop through
            mixedPassword += generatedPasswordArray.indexOf(ran);
            generatedPasswordArray.remove(ran);
        }
        return mixedPassword;
    }
}
