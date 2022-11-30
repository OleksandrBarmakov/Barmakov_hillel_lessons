package ua.hillel.lesson6;

import java.util.Random;

import static ua.hillel.lesson6.Cards.cards;
import static ua.hillel.lesson6.Cards.noOfCards;

public class Player_name {
    public static void main(String[] args) {

        createDeck();
        shuffleDeck();
        serveCards();


        Players player1 = new Players();
        player1.playerName = "Doyle Brunson";
        player1.age = 89;

        Players player2 = new Players();
        player2.playerName = "Daniel Negreanu";
        player2.age = 48;

        Players player3 = new Players();
        player3.playerName = "Phil Ivey";
        player3.age = 45;

        Players player4 = new Players();
        player4.playerName = "Dan Bilzerian";
        player4.age = 41;

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
    public static void createDeck(){
        String[] suits = {"Heards", "Clubs","Diamonds","Spades"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        int index = 0;
        for (String suit : suits){
            for (String value : values){
                cards[index++] = value + "of" + suit;
            }
        }

    }
    public static void shuffleDeck(){
        Random random = new Random();
        for (int i = 0; i<150; i++){
            int in = random.nextInt(noOfCards);
            int out = random.nextInt(noOfCards);

            String tmpCard = cards[in];
            cards[in] = cards[out];
            cards[out] = tmpCard;
        }
    }

    public static void serveCards(){
        int index=0;
        for (int round =1; round <=5; round++){
            System.out.println("Round " + round);
            for (int player =1; player<5; player++) {
                System.out.println(String.format("Player %d gets card %s%n", player, cards[index++]));
            }
            System.out.println();
        }
    }
}
