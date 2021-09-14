/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 ROBERT MCQUEEN
 */
import java.util.Objects;
import java.util.Scanner;
import java.lang.Object;
public class taxCollector {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
final double TAX = 0.055;
        System.out.print("What is the state? ");
        String state = sc.nextLine();
        System.out.print("What is the order amount? ");
        double amount = sc.nextDouble();

        float subTot = (float)amount;
        double tax =0;


        if(state.equals("WI") || state.equals("wi")){
tax = (TAX * subTot);

        }
float total = (float) (tax + subTot);

        System.out.print("The subtotal is $"+subTot+"\nThe tax is $"+tax+"\nThe total is $"+total);
    }

}
