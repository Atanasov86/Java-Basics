import java.util.Random;
import java.util.Scanner;

public class RandomHandsOf5Cards {
    public static void main(String[] args) {
        String[] cards = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] suits = {"\u2660", "\u2666", "\u2665", "\u2663"};

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            String firstCard = cards[randomCard()] + suits[randomSuit()];
            String secondCard = cards[randomCard()] + suits[randomSuit()];
            String thirdCard = cards[randomCard()] + suits[randomSuit()];
            String fourthCard = cards[randomCard()] + suits[randomSuit()];
            String fifthCard = cards[randomCard()] + suits[randomSuit()];
            boolean isAllCardsDifferent =
                    firstCard != secondCard &&
                    secondCard != thirdCard &&
                    thirdCard != fourthCard &&
                    fourthCard != fifthCard;
            if (isAllCardsDifferent){
                System.out.println(firstCard + " " + secondCard + " " + thirdCard + " " + fourthCard + " " + fifthCard);
            }
        }


    }

    public static int randomCard(){
        Random random = new Random();
        int randomNumber = random.nextInt(13);
        return randomNumber;
    }

    public static int randomSuit(){
        Random random = new Random();
        int randomNumber = random.nextInt(4);
        return randomNumber;
    }
}
