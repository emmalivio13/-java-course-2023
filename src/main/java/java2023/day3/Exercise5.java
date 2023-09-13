package java2023.day3;

public class Exercise5 {

	public static void main(String[] args) {
	
		class Vehicle {
		    private String id;

		    public Vehicle(String id) {
		        this.id = id;
		    }
		    //getter method
		    public String getId() {
		        return id;
		    }
		}
		//class car that extents vehicle, with the required variables and getter methods
		class Car extends Vehicle {
		    private int capacity;
		    private double length;
		    private String manufacturer;

		    public Car(String id, int capacity, double length, String manufacturer) {
		        super(id);
		        this.capacity = capacity;
		        this.length = length;
		        this.manufacturer = manufacturer;
		    }

		    public int getCapacity() {
		        return capacity;
		    }

		    public double getLength() {
		        return length;
		    }

		    public String getManufacturer() {
		        return manufacturer;
		    }
		}
		//class bus that extents vehicles, with the required variables and getter methods
		class Bus extends Vehicle {
		    private int standingCapacity;
		    private int sittingCapacity;
		    private double length;
		    private String company;

		    public Bus(String id, int standingCapacity, int sittingCapacity, double length, String company) {
		        super(id);
		        this.standingCapacity = standingCapacity;
		        this.sittingCapacity = sittingCapacity;
		        this.length = length;
		        this.company = company;
		    }

		    public int getStandingCapacity() {
		        return standingCapacity;
		    }

		    public int getSittingCapacity() {
		        return sittingCapacity;
		    }

		    public double getLength() {
		        return length;
		    }

		    public String getCompany() {
		        return company;
		    }
		}

		class LinkWithVehicles {
		    private Vehicle[] vehicles;
		    private int vehicleCount;

		    public LinkWithVehicles() {
		        vehicles = new Vehicle[100]; // Maximum 100 vehicles
		        vehicleCount = 0;
		    }

		    public void addVehicle(Vehicle vehicle) {
		        if (vehicleCount < 100) {
		            vehicles[vehicleCount] = vehicle;
		            vehicleCount++;
		            System.out.println("Vehicle added to the link.");
		        } else {
		            System.out.println("Link is full. Cannot add more vehicles.");
		        }
		    }

		    public void removeVehicle(Vehicle vehicle) {
		        int index = -1;
		        for (int i = 0; i < vehicleCount; i++) {
		            if (vehicles[i].getId().equals(vehicle.getId())) {
		                index = i;
		                break;
		            }
		        }

		        if (index != -1) {
		            // Remove the vehicle and shift the remaining vehicles
		            for (int i = index; i < vehicleCount - 1; i++) {
		                vehicles[i] = vehicles[i + 1];
		            }
		            vehicles[vehicleCount - 1] = null;
		            vehicleCount--;
		            System.out.println("Vehicle removed from the link.");
		        } else {
		            System.out.println("Vehicle not found on the link.");
		        }
		    }

		    public void displayVehicleInfo() {
		        System.out.println("Vehicles on the link:");
		        for (int i = 0; i < vehicleCount;


	}

}
