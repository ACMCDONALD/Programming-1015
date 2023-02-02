/*Andrew McDonald
W0426368
Cyber Security
Assignment #3
Due: November 25, 2022
*/
package Cookies;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //initialize arrays 'guideCookies' and 'guideNames'
        //initialize Scanner
        ArrayList<Integer> guideCookies = new ArrayList<Integer>();
        ArrayList<String> guideNames = new ArrayList<String>();
        Scanner input = new Scanner(System.in);

        //ask number of guides + store value
        System.out.println("~ Welcome to the Girl Guide Cookie Sell-off Calculator ~");
        System.out.println("~ Please enter the number of guides selling cookies ~");
        double numGuides = input.nextInt();

        //initialize variables
        int boxes = 0;
        int i;
        double sumBoxes = 0;

        //take inputs of names and sales and put them in their arrays
        for (i = 0; i < numGuides; i++) {
            int useri = i + 1; //increases the value of i so user sees count starting at 1
            System.out.println("Enter the name of guide #" + useri + ": ");
            input.nextLine(); // makes getting a string work
            String name = input.nextLine(); //accept input into name
            guideNames.add(name); //add value in name to guideNames

            System.out.println("Enter the number of boxes sold by " + name + ": ");
            boxes = input.nextInt(); //accept input into boxes
            guideCookies.add(boxes); //add value in boxes to guideCookies
        }

        //get a sum of boxes in guideCookies and calculate average
        for (int j : guideCookies)
            sumBoxes += j;
        double avgBoxes = sumBoxes / numGuides;

        //output begins
        System.out.println("\n\n~ Girl Guide Cookie Sell-off Calculator ~");
        System.out.println("--------------------------------------------------------");
        System.out.println("The average number of boxes sold by each guide was " + avgBoxes + " boxes!");
        System.out.println("---------------------------------------------------------");
        System.out.println("Guide:\t\t\tPrizes Won:");
        System.out.println("---------------------------------------------------------");

        // list names & prizes
        for (int k = 0; k < numGuides; k++) {
            int topSold = guideCookies.get(0);
            Integer topSeller = 0;

            for (int l = 0; l < numGuides; l++) {
                if (guideCookies.get(l) > topSold) {
                    topSold = guideCookies.get(l);
                } else {
                    topSold = topSold;
                }
                if (guideCookies.get(l) == topSold) {
                    topSeller = guideCookies.get(l);

                    }
                }
                if (guideCookies.get(k) == topSeller) {
                    System.out.println(guideNames.get(k) + "\t\t\t-Trip to the Girl Guide Jamboree");
                } else if (guideCookies.get(k) >= avgBoxes) {
                    System.out.println(guideNames.get(k) + "\t\t\t-Super Seller Badge");
                } else if (guideCookies.get(k) >= 1) {
                    System.out.println(guideNames.get(k) + "\t\t\t-Leftover Cookies");
                } else {
                    System.out.println(guideNames.get(k) + "\t\t\t-");
                }
            }
        }
    }
