/*Andrew McDonald
W0426368
Cyber Security
Assignment #2 - Landscape Calculator
Due: October 31, 2022
*/

import java.util.Scanner; //imports Scanner class
import java.text.DecimalFormat; //imports Decimal Format class

public class Main {
    private static final DecimalFormat df = new DecimalFormat("0.00"); //Defines decimal format

    public static void main(String[] args) {

        System.out.println("Landscape Calculator" + "\n"); //outputs title

        // take inputs
        Scanner input = new Scanner(System.in);

        System.out.println("Enter house number: "); // ask house number
        int houseNo = input.nextInt();

        System.out.println("Enter the property length (feet): "); // ask length
        int length = input.nextInt();

        System.out.println("Enter the property width: "); // ask width
        int width = input.nextInt();

        System.out.println("Select the type of grass: \n 1. fescue \n 2. bentgrass \n 3. campus "); // ask what type of grass
        int grass = input.nextInt();

        System.out.println("Enter the number of trees: "); // ask how many trees
        int trees = input.nextInt();


        // introduce some variables and do some basic math
        int baseLabour = 1000;
        int area = (length * width);
        double grassPrice = 0;
        int overage = 0;
        trees = trees * 100;

        switch (grass) {
            case 1:                 //fescue
                grassPrice = 0.05;
                break;
            case 2:                 //bentgrass
                grassPrice = 0.02;
                break;
            case 3:                 //campus
                 grassPrice = 0.01;
                 break;
        }

        if (area > 5000) {
            overage = 500;
            } else {
            overage = 0;
        }

        //do some last minute math
        double subtotal = area * grassPrice;
        double total = subtotal + trees + baseLabour + overage;


        //output results
        System.out.println ("Total cost for house " + houseNo + " is $" + df.format(total));

    }
}