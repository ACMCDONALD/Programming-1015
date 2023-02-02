/*
Andrew McDonald
W0426368
Cyber Security
PROG 1015
Case Study - Hospital Management System
Due: 2 Dec 2022
 */
package hospital_management;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean running = true;

        //[0][x] = hospital name, [1][x] = city, [2][x] = address
        String[][] hospitalList = {{"The Mayo Clinic", "Johns Hopkins", "Princeton Plainsboro Teaching Hospital",
                "IWK", "Victoria General"}, {"Minnesota", "Baltimore", "Princeton",
                "Halifax", "Halifax"}, {"123 Fake St.", "456 Fake St.", "789 Fake St.", "012 Fake St.",
                "345 Fake St."}};
        //[0][x] = doctor name, [1][x] = specialty
        String[][] doctorList = {{"Dr. Octopus", "Dr. Zoidberg", "Dr. Katz", "Dr. Dre", "Dr. Doolittle", "Dr. Quinn",
                "Dr. Pepper", "Dr. Krieger", "Dr. Nick", "Dr. Hibbert" },{"Genetics", "\'Humans\'", "Psychotherapy",
                "Ear, Nose, and Throat", "Human-Animal Relations", "Medicine Woman", "Dental", "Applied Research",
                "Quack", "Family Doctor"}};
        //[0][x] = patient last name, [1][x] = first name, [2][x] = age, [3][x] = complaint
        String[][] patientList = {{"William", "Brad", "Charlie", "David", "Ed"}, {"Douglas", "Bradford", "Charles",
                "Dave", "Eddy"}, {"7", "25", "45", "65", "85"}, {"Belly hurts", "Back hurts", "Arm hurts", "Ear hurts",
                "Foot hurts"}};

        while (running) {
            //header image
           System.out.println("      |___________________________________");
           System.out.println("|-----|- - -|\'\'\'\'|\'\'\'\'|\'\'\'\'|\'\'\'\'|\'\'\'\'|'##\\|__");
           System.out.println("|     |  cc 6    5    4    3    2    1 ### __]==----------------------");
           System.out.println("|-----|___Hospital Management System___##/|");
           System.out.println("      |\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\" ");
            
           System.out.println("\n           Please make a selection \n\n" +
                   "1. List of Hospitals\n2. List of Patients\n3. Search for a Hospital\n4. Exit");
            int selection = input.nextInt(); //take in selection

            switch (selection) {
                case 1:  //select a hospital
                    System.out.println("\n           Please select a hospital\n");
                    Hospitals hospital = new Hospitals();

                    hospital.printHospitalData(hospitalList);

                    int hospitalSelect = input.nextInt();//take hospital input

                    int x = hospitalSelect - 1;

                    Random rand = new Random(); //new instance of random class 'rand'
                    int upperbound = 9; // 0-9
                    int y = rand.nextInt(upperbound); //doctorSelect is a random number between 0-4


                    //assign values from arrays to variables
                    hospital.setName(hospitalList[0][x]);
                    hospital.setAddress(hospitalList[(1)][x]);
                    hospital.setLocation(hospitalList[(2)][x]);
                    hospital.setDoctors(doctorList[0][y]);
                    hospital.setSpecialty(doctorList[(1)][y]);

                    //output
                    System.out.println("\n\n\n-----------------------");
                    System.out.println("-----------------------");
                    System.out.println("Your Hospital:\n--------------\n" + hospital.getName() + "\n" + hospital.getAddress()
                            + "\n" + hospital.getLocation() + "\n-----------------------\nDoctor(s):\n---------\n"
                            + hospital.getDoctors() + "\nSpecialty: " + hospital.getSpecialty());
                    System.out.println("-----------------------");
                    System.out.println("-----------------------\n\n\n");
                    break;

                case 2:  //select a patient
                    System.out.println("\n\n\nPlease select a Patient");
                    Patients patient = new Patients();

                    patient.printPatientData(patientList);

                    int patientSelect = input.nextInt(); //take patient input
                    int z = patientSelect - 1;

                    //assign values to variables
                    patient.setfName(patientList[0][z]);
                    patient.setlName(patientList[1][z]);
                    patient.setAge(patientList[2][z]);
                    patient.setAilments(patientList[3][z]);

                    System.out.println("\n\n\n-----------------------");
                    System.out.println("-----------------------");
                    System.out.println("Patient Info:\n-------------\nName: " + patient.getlName() + ", "
                            + patient.getfName() + "\nAge: " + patient.getAge() + "\nComplaints: "
                            + patient.getAilments());
                    System.out.println("-----------------------");
                    System.out.println("-----------------------\n\n\n");

                    break;

                case 3: // search for a hospital
                    System.out.println("\n           Hospital Search:\n        Please select a city:\n");
                    Hospitals hospital2 = new Hospitals();

                    hospital2.SearchHospital(hospitalList);

                    int citySelect = input.nextInt(); //take city input

                    int q = (citySelect - 1);

                    //assign values from arrays to variables
                    hospital2.setName(hospitalList[0][q]);
                    hospital2.setAddress(hospitalList[(1)][q]);
                    hospital2.setLocation(hospitalList[(2)][q]);

                    String getName = hospitalList[1][q];

                    //output
                    System.out.println("\n\n\n-----------------------");
                    System.out.println("-----------------------");
                    System.out.println("Hospitals in " + getName + ":\n--------------\n" + hospital2.getName() + "\n"
                            + hospital2.getAddress() + "\n" + hospital2.getLocation() + "\n-----------------------\nDoctor(s):\n---------\n"
                            + hospital2.getDoctors() + "\nSpecialty:\n" + hospital2.getSpecialty());
                    System.out.println("-----------------------");
                    System.out.println("-----------------------\n\n\n");
                    break;

                case 4: //exit the program
                    System.out.println("Are you sure you want to quit the Hospital Management System?\n1. Quit \n2. Return ");
                    int quitYN = input.nextInt(); //take quit input

                    if (quitYN == 1){
                        running = false;
                    }
                    break;
                }
            }
        }
    }


