package kyu7;
//https://www.codewars.com/kata/57d29ccda56edb4187000052/train/java
//In this kata, your task is to implement an extended version of the famous rock-paper-scissors game. The rules are as follows:
//
//        Scissors cuts Paper
//        Paper covers Rock
//        Rock crushes Lizard
//        Lizard poisons Spock
//        Spock smashes Scissors
//        Scissors decapitates Lizard
//        Lizard eats Paper
//        Paper disproves Spock
//        Spock vaporizes Rock
//        Rock crushes Scissors
//        Task:
//        Given two values from the above game, return the Player result as "Player 1 Won!", "Player 2 Won!", or "Draw!".
//
//        Inputs
//        Values will be given as one of "rock", "paper", "scissors", "lizard", "spock".


public class RockPaperScissorsLizardSpock {
    public static void main(String[] args) {
        System.out.println(rpsls("rock", "lizard"));
    }

    public static String rpsls(String player1, String player2) {
        if ((player1.equals("scissors") && player2.equals("paper")) ||
                (player1.equals("paper") && player2.equals("rock")) ||
                (player1.equals("rock") && player2.equals("lizard")) ||
                (player1.equals("lizard")) && player2.equals("spock") ||
                (player1.equals("spock")) && player2.equals("scissors") ||
                (player1.equals("scissors")) && player2.equals("lizard") ||
                (player1.equals("lizard")) && player2.equals("paper") ||
                (player1.equals("paper")) && player2.equals("spock") ||
                (player1.equals("spock")) && player2.equals("rock") ||
                (player1.equals("rock")) && player2.equals("scissors"))
            return "Player 1 Won!";
        else if (player1.equals(player2))
            return "Draw!";
        else
            return "Player 2 Won!";
    }
}


