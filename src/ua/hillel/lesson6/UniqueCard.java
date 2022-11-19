package ua.hillel.lesson6;

public class UniqueCard {
    public static void main(String[] args) {
        Cards uniqueCard1 = new Cards();
        uniqueCard1.suits = "Heards";
        uniqueCard1.values = "2 3 4 5 6 7 8 9 10 Jack Queen King Ace";

        Cards uniqueCard2 = new Cards();
        uniqueCard2.suits = "Clubs";
        uniqueCard2.values = "2 3 4 5 6 7 8 9 10 Jack Queen King Ace";

        Cards uniqueCard3 = new Cards();
        uniqueCard3.suits = "Diamonds";
        uniqueCard3.values = "2 3 4 5 6 7 8 9 10 Jack Queen King Ace";

        Cards uniqueCard4 = new Cards();
        uniqueCard4.suits = "Spades";
        uniqueCard4.values = "2 3 4 5 6 7 8 9 10 Jack Queen King Ace";

        uniqueCard1.cardsInDeck();
        uniqueCard2.cardsInDeck();
        uniqueCard3.cardsInDeck();
        uniqueCard4.cardsInDeck();
    }
}
