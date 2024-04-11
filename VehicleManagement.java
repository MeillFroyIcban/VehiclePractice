import java.util.*;
public class VehicleManagement{
  public static void main(String[] args) {
        ArrayList<Vehicle> Vehicles = new ArrayList<>();
 while (true) {
            String regNo;
            String make;
            int yearOfManufacture;
            double value;

            Scanner str = new Scanner(System.in);
            Scanner val = new Scanner(System.in);

            System.out.print("\nMenu:\n" +
                    "1. Add a vehicle\n" +
                    "2. Display a list of vehicle details\n" +
                    "3. Delete a vehicle\n" +
                    "4. Sort vehicle list by age\n" +
                    "5. Quit\n\nEnter your choice: ");

            int menu = val.nextInt();

            switch (menu) {
                case 1 -> {
                    System.out.print("Enter registration number: ");
                    regNo = str.next();
                    System.out.print("Enter make: ");
                    make = str.next();
                    System.out.print("Enter Year of Manufacture: ");
                    yearOfManufacture = val.nextInt();
                    System.out.print("Enter Value: ");
                    value = val.nextDouble();

                    Vehicle Car = new Vehicle (regNo, make, yearOfManufacture, value);
                    Vehicles.add(Car);

                    System.out.print("\nVehicle added successfully!");
                }
                case 2 -> {
                    Vehicles.forEach(Vehicle -> {
                        System.out.print("\nReg No: " + Vehicle.getregNo() + ", Make: " + Vehicle.getmake() + ", Year of Manufacture: " + Vehicle.getyearOfManufacture() + ", Value: " + Vehicle.getvalue());
                    });
                }
                case 3 -> {
                    System.out.print("Press [0] to cancel.\nRemove which vehicle?: ");
                    int remove = val.nextInt();

                    if (remove == 0) {
                        break;
                    }
                    else {
                        Vehicles.remove(remove-1); }
                }
                case 4 -> {
                    System.out.print("1. Sort by age (ascending)\n" +
                            "2. Sort by age (descending)\n" +
                            "3. Back to main menu\n\n Enter your choice: ");
                    int sort = val.nextInt();
                    if (sort == 1) {
                        Collections.sort(Vehicles, Comparator.comparingInt(Vehicle::getyearOfManufacture));
                        System.out.println("Vehicles sorted by year of manufacture (ascending).");
                    }
                    else if(sort == 2) {
                        Collections.sort(Vehicles, Comparator.comparingInt(Vehicle::getyearOfManufacture).reversed());
                        System.out.println("Vehicles sorted by year of manufacture (descending).");
                    }
                    else{
                        break;
                    }
                }
                case 5 -> {
                    System.out.print("Are you sure you want to quit?[Y/N]: ");
                    char chc = str.next().charAt(0);

                    if(chc == 'Y' || chc == 'y') {
                        System.out.print("Exiting program...");
                        System.exit(0);
                    }
                    else {
                        break;
                    }
                }
            }
        }
    }
   }
