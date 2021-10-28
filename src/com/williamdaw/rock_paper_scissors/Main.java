package com.williamdaw.rock_paper_scissors;

import java.util.Map;
import java.util.Scanner;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class Main {
    public static void main(String[] args) {
        String valid_guess = "SPR";
        int pc_wins = 0;
        int user_wins = 0;

        Map<String, Integer> win_lose_data = Map.of("RS", 1, "SR", 0, "PR", 1, "RP", 0, "SP", 1, "PS", 0);

        while ((pc_wins < 2)&&(user_wins < 2)) {
            String input = "";
            boolean valid_input = FALSE;
            while (valid_input == FALSE) {
                System.out.println("Enter R, S or P:");
                Scanner scanner = new Scanner(System.in);
                input = scanner.nextLine().toUpperCase();
                if ((input.length() > 0)&&(valid_guess.contains(input))&&(input.length() < 2)) valid_input = TRUE;
            }
            int random_number = (int) (Math.random() * (3 + 1) - 1);
            String ai_choice = String.valueOf(valid_guess.toCharArray()[random_number]);

            if (input.equals(ai_choice)) {
                System.out.println("draw");
                continue;
            }
            if (win_lose_data.get(input + ai_choice) == 1) System.out.println("You win"); else System.out.println("You lose");
            if (win_lose_data.get(input + ai_choice) == 1) user_wins++; else pc_wins++;
        }
        System.out.print("You scored " + user_wins + " the computer scored " + pc_wins);
    }
}
