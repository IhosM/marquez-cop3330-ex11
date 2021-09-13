/*
 *  UCF COP3330 Fall 2021 Assignment 11 Solution
 *  Copyright 2021 Ihosvany Marquez
 */

package Exercise11;
import java.util.Scanner;

public class Solution11
{
    public static void main(String args[])
    {
        System.out.print("How many euros are you exchanging? ");
        Scanner scan = new Scanner(System.in);
        double euros = scan.nextDouble();

        System.out.print("What is the exchange rate? ");
        double rate = scan.nextDouble();

        double CurrencyExchange = (euros * rate);

        System.out.println(euros + " euros at an exchange rate of " + rate + " is");
        double currencyConverted = euros * rate;
        System.out.printf("%.2f U.S dollars.", currencyConverted);

    }

}
