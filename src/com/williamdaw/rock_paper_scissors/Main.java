package com.williamdaw.rock_paper_scissors;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class Main {

    public static void main(String[] args) {
//        String[] valid_guess = {"S", "P", "R"};
        ArrayList<String> valid_guess = new ArrayList<>();
        valid_guess.add("R");
        valid_guess.add("P");
        valid_guess.add("S");
        String input = "";
        boolean valid_input = FALSE;
        while (valid_input == FALSE) {
            System.out.println("Enter R, S or P:");
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextLine().toUpperCase();
            if ((input.length() > 0)&&(valid_guess.contains(input))&&(input.length() < 2)) valid_input = TRUE;
        }
        int random_number = (int) (Math.random() * (3 + 1) - 1);
        String ai_choice = valid_guess.get(random_number - 1);

        if (input.equals(ai_choice)) System.out.println("draw");
        if ((input.equals("R"))&&(ai_choice.equals("S"))) System.out.println("You win");
        if ((input.equals("S"))&&(ai_choice.equals("R"))) System.out.println("You lose");
        if ((input.equals("P"))&&(ai_choice.equals("R"))) System.out.println("You win");
        if ((input.equals("R"))&&(ai_choice.equals("P"))) System.out.println("You lose");
        if ((input.equals("S"))&&(ai_choice.equals("P"))) System.out.println("You win");
        if ((input.equals("P"))&&(ai_choice.equals("S"))) System.out.println("You lose");



    }
}
