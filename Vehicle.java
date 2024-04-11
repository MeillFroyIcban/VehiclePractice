import java.util.*;

public class Vehicle {
    private String regNo;
    private String make;
    private int yearOfManufacture;
    private double value;

    public Vehicle(String make, String regNo, int yearOfManufacture, double value) {
        this.make = make;
        this.yearOfManufacture = yearOfManufacture;
        this.value = value;
        this.regNo = regNo;
    }

    public String getregNo() {
        return regNo;
    }

    public String getmake() {
        return make;
    }

    public int getyearOfManufacture() {
        return yearOfManufacture;
    }

    public double getvalue() {
        return value;
    }
    
    public void setvalue(int value) {
        this.value = value;
    }

    public void calculateAge() {
        int Currentyear = 2024;
        int age = Currentyear - yearOfManufacture;
        System.out.print("Current Car Age: " + age);
    }
@Override
    public String toString() {
        return "Reg No: " + regNo + ", make: " + make + ", Year of Manufacture: " + yearOfManufacture + ", value: Php" + value;
    }
}
   