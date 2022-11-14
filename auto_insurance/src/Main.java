/*Andrew McDonald
W0426368
Cyber Security
Assignment #2 - Auto Insurance
Due: October 31, 2022
*/

import java.util.Scanner; //imports Scanner class
import java.text.DecimalFormat; //imports Decimal Format class

public class Main {
    private static final DecimalFormat df = new DecimalFormat("0.00"); //Defines decimal format

    public static void main(String[] args) {

        System.out.println("Auto Insurance Calculator" + "\n"); //outputs title

        // take inputs
        Scanner input = new Scanner(System.in);

        System.out.println("Are you Male or Female: "); // ask gender
        String gender = input.nextLine();

        gender = gender.toLowerCase(); // forces gender input to lowercase

        System.out.println("Enter your age: "); // ask age
        int age = input.nextInt();

        System.out.println("Enter the purchase price of the vehicle: "); // ask price
        double price = input.nextDouble();

        double finalPrice = 0; //initializes finalPrice variable

        if (gender.equals("male")) {                //if gender = male
            if (age >= 15 && age <=24) {            //if age 15-24
                finalPrice= price * 0.25;
            } else if (age >=25 && age <=39) {      //if age 25-39
                finalPrice= price * 0.17;
            } else if (age >=40 && age <=69) {      //if age 40-69
                finalPrice = price * 0.10;
            }
        } else if (gender.equals("female")) {       //if gender = female
            if (age >= 15 && age <=24) {            //if age 15-24
                finalPrice= price * 0.20;
            } else if (age >=25 && age <=39) {      //if age 25-39
                finalPrice= price * 0.15;
            } else if (age >=40 && age <=69) {       //if age 40-69
                finalPrice= price * 0.10;
            }

        }

        finalPrice = finalPrice/12;                 // divides final price by 12 months

        //output result

        System.out.println ("Your monthly insurance will be $ " + df.format(finalPrice));

    }
}