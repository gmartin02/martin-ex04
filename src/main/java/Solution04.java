/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Gabriel Martin
 */

/*
 * create Scanner to get user input
 * prompt for noun
 * 'noun' = first user input
 *  prompt for verb
 * 'verb' = second user input
 *  prompt for adjective
 * 'adjective' = third user input
 *  prompt for adverb
 * 'adverb' = fourth user input
 *  printf in the order: verb, adverb, noun, adjective
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
