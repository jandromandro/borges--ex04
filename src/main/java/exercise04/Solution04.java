/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Marcos Borges
 */

package exercise04;

/*
Create a simple mad-lib program that prompts for a noun, a verb, an adverb,
and an adjective that injects those into a story that you create.
 */

import java.util.Scanner;

public class Solution04 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter a noun: ");
        String noun = in.nextLine();
        System.out.println("Enter a verb: ");
        String verb = in.nextLine();
        System.out.println("Enter an adjective: ");
        String adjective = in.nextLine();
        System.out.println("Enter an adverb: ");
        String adverb = in.nextLine();
        System.out.println(String.format("Do you %s your %s %s %s? That's hilarious!",verb, adjective ,noun ,adverb));

    }
}
