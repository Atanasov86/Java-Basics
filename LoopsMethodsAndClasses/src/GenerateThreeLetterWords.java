import java.util.Scanner;

public class GenerateThreeLetterWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLetters = scanner.nextLine();
        String[] letters = inputLetters.split("");

        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < letters.length; j++) {
                for (int k = 0; k < letters.length; k++) {
                    String currentWord = letters[i] + letters[j] + letters[k];
                    System.out.print(currentWord + " ");
                }
            }
        }
    }
}
