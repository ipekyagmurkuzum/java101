package AdventureGame;

import AdventureGame.location.Location;
import AdventureGame.player.Character;
import AdventureGame.player.Player;
import AdventureGame.player.Samurai;

import java.util.Scanner;

import static AdventureGame.player.Character.getCharInfo;
import static AdventureGame.player.Character.selectCharacter;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String playerName = scanner.nextLine();
        Player player = new Player(playerName);

        System.out.println("Hello, "+ player.getPlayerName() + "Please select a character: \n");
        getCharInfo();
        int characterID = scanner.nextInt();
        Character character = selectCharacter(characterID);

        while (character.getHealth() > 0) {
            System.out.println("Please select your destination: \n " +
                    "1- Safe House\n" +
                    "2- Store\n" +
                    "3- Cave\n" +
                    "4- Forest\n" +
                    "5- River");
            int locationId = scanner.nextInt();
         //

        }
    }
}