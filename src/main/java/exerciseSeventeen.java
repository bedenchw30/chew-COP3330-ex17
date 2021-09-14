/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 beden chew
 */
import java.util.Scanner;
public class exerciseSeventeen {
    public static void main(String[] args){
        double ratio;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a 1 if you are a male or a 2 if you are a female: ");
        int gender = input.nextInt();
        if(gender == 1){
           ratio = 0.73;
        }
        else{
           ratio = 0.66;
        }
        System.out.print("How many ounces of alcohol did you have? ");
        double ounces = input.nextDouble();

        System.out.print("What is your weight, in pounds? ");
        double weight = input.nextDouble();

        System.out.print("How many hours has it been since your last drink? ");
        double hours = input.nextDouble();

        double BAC = ounces * 5.14/weight* ratio - .015 * hours;
        System.out.printf("Your BAC is "+ "%.6f",BAC);

        if(BAC >= 0.08){
            System.out.println("\nIt is not legal for you to drive.");
        }
        else
            System.out.println("\nit is legal for you to drive.");
    }
}
