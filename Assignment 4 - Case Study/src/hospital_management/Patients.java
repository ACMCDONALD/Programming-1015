package hospital_management;

public class Patients {

    private String fName;
    private String lName;
    private String age;
    private String ailments;


    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getAge() {
        return age;
    }

    public String getAilments() {
        return ailments;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setAilments(String ailments) {
        this.ailments = ailments;
    }


    public void printPatientData(String [][] patientList){

        System.out.println("1. " + patientList[1][0] + ", " + patientList[0][0] + "\n2. "
                + patientList[1][1] + ", " + patientList[0][1] + "\n3. " + patientList[1][2] + ", "
                + patientList[0][2] + "\n4. " + patientList[1][3] + ", " + patientList[0][3] + "\n5. "
                + patientList[1][4] + ", " + patientList[0][4]);

    }
}
