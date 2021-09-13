/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Carter I. Walker
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        //Necessary variables
        Scanner input = new Scanner(System.in);
        int legalAge = 16;
        int userAge;

        //Age query
        System.out.println("What is your age?");
        userAge = input.nextInt();

        if (userAge >= legalAge)
        {
            System.out.println("You are old enough to legally drive.");
        }
        else
        {
            System.out.println("You are not old enough to legally drive.");
        }
    }
}
