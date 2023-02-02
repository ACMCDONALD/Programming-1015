package hospital_management;

public class Hospitals {  //create new class called Hospitals
    //define the attributes of the class
    String address;
    String location;
    String doctors;
    String specialty;
    String name;

    //getters
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getLocation() {
        return location;
    }

    public String getDoctors() {
        return doctors;
    }

    public String getSpecialty() {
        return specialty;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDoctors(String doctors) {
        this.doctors = doctors;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }


    public void printHospitalData(String[][] hospitalList) {

        System.out.println("1. " + hospitalList[0][0] + "\n2. " + hospitalList[0][1] + "\n3. "
                + hospitalList[0][2] + "\n4. " + hospitalList[0][3] + "\n5. " + hospitalList[0][4]);
    }

    public void SearchHospital(String[][] hospitalList){

        System.out.println("1. " + hospitalList[1][0] + "\n2. " + hospitalList[1][1] + "\n3. "
                    + hospitalList[1][2] + "\n4. " + hospitalList[1][3] + "\n5. " + hospitalList[1][4]);
        }

    }
