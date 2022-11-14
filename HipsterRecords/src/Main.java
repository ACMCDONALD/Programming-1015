/*Andrew McDonald
W0426368
Cyber Security
Assignment #1
Due: October 7, 2022
*/

import java.util.Scanner; //imports Scanner class
import java.text.DecimalFormat; //imports Decimal Format class


public class Main {
    private static final DecimalFormat df = new DecimalFormat("0.00"); //Defines decimal format

    public static void main(String[] args) {

        //global variables
        double tax = 1.14;  //14% tax

        System.out.println("Hipster's Local Vinyl Records - Customer Order Details" +"\n") ; //outputs title

        // take inputs
        Scanner input = new Scanner(System.in);
        System.out.println ("Enter the customer's Name: " ); // ask for name
        String custName = input.nextLine(); //read and store customer name input

        System.out.println ("Enter the distance in kilometers for delivery: "); // ask distance
        float distance = input.nextFloat(); //read and store distance

        System.out.println ("Enter the cost of the records purchased: "); // ask cost of records
        float purchase = input.nextFloat(); //read and store cost

        // do the math
        float delCost = distance * 15;
        double purCost = purchase * tax;
        double totCost = delCost + purCost;

        //output results
        System.out.println("\n" + "Purchase summary for " + custName);
        System.out.println("Delivery cost: $" + df.format(delCost));
        System.out.println("Purchase cost: $" + df.format(purCost));
        System.out.println("Total cost   : $" + df.format(totCost));
    }
}