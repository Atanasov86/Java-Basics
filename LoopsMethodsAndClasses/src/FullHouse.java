public class FullHouse {
    public static void main(String[] args) {
        String[] cards = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] suits = {"\u2660", "\u2666", "\u2665", "\u2663"};

        int countFullHouses = 0;

        for (int suit = 0; suit < suits.length; suit++) {
            for (int suit1 = suit + 1; suit1 < suits.length; suit1++) {
                for (int suit2 = suit1 + 1; suit2 < suits.length; suit2++) {
                    for (int pairSuit = 0; pairSuit < suits.length; pairSuit++) {
                        for (int pairSuit1 = pairSuit + 1; pairSuit1 < suits.length; pairSuit1++) {
                            for (int first3Cards = 0; first3Cards < cards.length; first3Cards++) {
                                for (int second2Cards = 0; second2Cards < cards.length; second2Cards++) {
                                    if (first3Cards != second2Cards) {
                                        String currentFullHouse =
                                                "(" + cards[first3Cards] + suits[suit] + " " +
                                                        cards[first3Cards] + suits[suit1] + " " +
                                                        cards[first3Cards] + suits[suit2] + " " +
                                                        cards[second2Cards] + suits[pairSuit] + " " +
                                                        cards[second2Cards] + suits[pairSuit1] + ")";
                                        System.out.println(currentFullHouse);
                                        countFullHouses++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(countFullHouses + " full houses");
    }
}
