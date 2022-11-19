package ua.hillel.lesson6;

public class Player_name {
    public static void main(String[] args) {

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

        player1.playerJoin();
        player2.playerJoin();
        player3.playerJoin();
        player4.playerJoin();


    }
}
