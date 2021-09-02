/*
 * UCF COP3330 Fall 2021 Exercise 4 Solution
 * Copyright 2021 Gabriel Martin
 */

/*
 * create Scanner to gert user input
 * prompt user for noun
 * 'noun' = first user input
 *  prompt user for verb
 * 'verb' = second user input
 *  prompt user for adjective
 * 'adjective' = third user input
 *  prompt user for adverb
 * 'adverb' = fourth user input
 *  use printf for the output in the order: verb, adverb, noun, adjective with any statement
 */

import java.util.Scanner;

public class Solution04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.print("Enter a noun: ");
        String noun = input.nextLine();

        System.out.print("Enter a verb: ");
        String verb = input.nextLine();

        System.out.print("Enter a adjective: ");
        String adjective = input.nextLine();

        System.out.print("Enter a adverb: ");
        String adverb = input.nextLine();

        System.out.printf("Do you %s your %s %s %s? That's hilarious!", verb, adverb, noun, adjective);
    }
}
