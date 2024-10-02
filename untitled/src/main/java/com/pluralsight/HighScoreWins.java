package com.pluralsight;

import java.util.*;

public class HighScoreWins {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] arg){

        String game_score = prompt_for_string("Please enter a game score: ");
        int index_of_divider = game_score.indexOf("|");

        String string_of_teams = game_score.substring(0,index_of_divider);
        String [] teams = string_of_teams.split(":");

        String string_of_score = game_score.substring(index_of_divider + 1);
        String [] array_score = string_of_score.split(":");

        int team0 = Integer.parseInt(array_score[0]);
        int team1 = Integer.parseInt(array_score[1]);

        if(team0 < team1){
            System.out.println("Winner: " + teams[1]);
        }else{
            System.out.println("Winner: " + teams[0]);
        }
    }

    public static String prompt_for_string(String prompt){
        System.out.print(prompt);
        return scanner.nextLine();
    }

}
