package ua.hillel.lesson6;

public class Cards {
    int noOfCards = 54;
    String suits;
    String values;

    public void cardsInDeck(){
        System.out.println("Количество карт в колоде: " +noOfCards);
        System.out.println("Масть: " +suits);
        System.out.println("Номинал масти: " +values);
    }
}
