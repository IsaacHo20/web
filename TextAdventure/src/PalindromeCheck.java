import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
    check();
    }

    public static boolean check() {
        System.out.println("Please enter a word.");
        Scanner userInput = new Scanner(System.in);
        String str = userInput.nextLine();
        char[] word = str.toCharArray();
        int f = 0, b = word[word.length -1];
        boolean answer = true;
        while (f < b) {

            if (word[f] == word[b]) {

            } else {
                answer = false;
            }
        }
        return answer;
    }
}