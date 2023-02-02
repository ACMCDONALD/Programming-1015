/*Andrew McDonald
W0426368
Cyber Security
Assignment #3
Due: November 25, 2022
*/
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //initialize the array 'hoursPerDay' and the scanner 'input'
        ArrayList<Integer> hoursPerDay = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);

        //intialize variables
        int i;
        int k;
        int day = 0;
        int mostWorked = 0;

        //take in inputs
        System.out.println("Enter hours worked on Day #1: ");
        int hoursDayOne = input.nextInt();
        hoursPerDay.add(hoursDayOne);
        System.out.println("Enter hours worked on Day #2: ");
        int hoursDayTwo = input.nextInt();
        hoursPerDay.add(hoursDayTwo);
        System.out.println("Enter hours worked on Day #3: ");
        int hoursDayThree = input.nextInt();
        hoursPerDay.add(hoursDayThree);
        System.out.println("Enter hours worked on Day #4: ");
        int hoursDayFour = input.nextInt();
        hoursPerDay.add(hoursDayFour);
        System.out.println("Enter hours worked on Day #5: ");
        int hoursDayFive = input.nextInt();
        hoursPerDay.add(hoursDayFive);

        //calculate total hours worked and average hours worked
        double totalHours = (hoursDayOne + hoursDayTwo + hoursDayThree + hoursDayFour + hoursDayFive);
        double avgHours = (totalHours / 5);

        System.out.println("------------------------------------------------");
        System.out.println("\n\n------------------------------------------------");
        System.out.println("The most hours worked was on:");

        //calculate the day(s) with the most hours worked

        //for (k = 0; k < 4; k++) {
        int dayMostHours = 0;

        for (i = 0; i < 4; i++) {
            if (hoursPerDay.get(i) >= dayMostHours) { // Days with most hours
                dayMostHours = hoursPerDay.get(i);
                day = i + 1;
                mostWorked = hoursPerDay.get(i);
            } else {
                dayMostHours = dayMostHours;
            }
        }
        int mostDay = day;  // for displaying day with mostHours

        System.out.println("Day #" + mostDay + " when you worked " + mostWorked + " hours.");

        System.out.println("------------------------------------------------");
        System.out.println("The total number of hours worked was: " + totalHours);
        System.out.println("The average number of hours worked each day was: " + avgHours);
        System.out.println("------------------------------------------------");
        System.out.println("Days you slacked off (i.e. worked less than 7 hours): ");

        //calculate days worked 7 hours or less
        for (int j = 0; j < hoursPerDay.size(); j++) {
            int dayj = j + 1;
            if (hoursPerDay.get(j) < 7) { // Days with 7 hours or less.
                System.out.println("Day #" + dayj + ": " + hoursPerDay.get(j) + " hours");
            }
        }
    }
}