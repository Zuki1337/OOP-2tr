class Vehicle {
    private String model;
    private String licensePlate;
    private double rentalPricePerDay;

    public Vehicle(String model, String licensePlate, double rentalPricePerDay) {
        this.model = model;
        this.licensePlate = licensePlate;
        this.rentalPricePerDay = rentalPricePerDay;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    public void setRentalPricePerDay(double rentalPricePerDay) {
        this.rentalPricePerDay = rentalPricePerDay;
    }

    public void displayVehicleDetails() {
        System.out.println("Vehicle Model: " + model);
        System.out.println("License Plate: " + licensePlate);
        System.out.println("Rental Price/Day: $" + rentalPricePerDay);
    }
}

// Client class
class Client {
    private String name;
    private int clientId;
    private String phoneNumber;

    // Constructor
    public Client(String name, int clientId, String phoneNumber) {
        this.name = name;
        this.clientId = clientId;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void displayClientDetails() {
        System.out.println("Client Name: " + name);
        System.out.println("Client ID: " + clientId);
        System.out.println("Phone Number: " + phoneNumber);
    }
}

class RentalService {
    private Vehicle vehicle;
    private Client client;
    private int rentalDays;

    public RentalService(Vehicle vehicle, Client client, int rentalDays) {
        this.vehicle = vehicle;
        this.client = client;
        this.rentalDays = rentalDays;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    public double calculateTotalCost() {
        return vehicle.getRentalPricePerDay() * rentalDays;
    }

    public void displayRentalDetails() {
        System.out.println("--- Rental Details ---");
        client.displayClientDetails();
        vehicle.displayVehicleDetails();
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Rental Cost: $" + calculateTotalCost());
    }
}

public class VehicleRentalService {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Porche 911", "AAA-911", 50);
        Vehicle vehicle2 = new Vehicle("Mercedes S63 AMG", "BBB-963", 60);

        Client client1 = new Client("Leonardo Decaprio", 101, "632-456-7890");
        Client client2 = new Client("Will Smith", 102, "987-654-3210");

        RentalService rental1 = new RentalService(vehicle1, client1, 5);
        RentalService rental2 = new RentalService(vehicle2, client2, 3);

        System.out.println("==== Rental 1 ====");
        rental1.displayRentalDetails();
        System.out.println();

        System.out.println("==== Rental 2 ====");
        rental2.displayRentalDetails();
        System.out.println();

        System.out.println("Comparing Total Rental Costs:");
        if (rental1.calculateTotalCost() > rental2.calculateTotalCost()) {
            System.out.println("Rental 1 is more expensive.");
        } else if (rental1.calculateTotalCost() < rental2.calculateTotalCost()) {
            System.out.println("Rental 2 is more expensive.");
        } else {
            System.out.println("Both rentals have the same total cost.");
        }
    }
}
