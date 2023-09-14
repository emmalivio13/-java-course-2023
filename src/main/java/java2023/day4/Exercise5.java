package java2023.day4;

public class Exercise5 {
	public interface PlanElement {
	    // Define methods related to PlanElement?
	}

	public class Vehicle {
		private String id;

	    public Vehicle(String id) {
	        this.id = id;
	    }
	    //getter method
	    public String getId() {
	        return id;
	    }
	
	}

	public interface Leg extends PlanElement {

	    // Get the mode of travel for this leg
	    public String getMode();

	    // Set the mode of travel for this leg
	    public void setMode(String mode);

	    // Get the departure time for this leg in seconds
	    public double getDepartureTime();

	    // Set the departure time for this leg in seconds
	    public void setDepartureTime(final double seconds);

	    // Get the travel time for this leg in seconds
	    public double getTravelTime();

	    // Set the travel time for this leg in seconds
	    public void setTravelTime(final double seconds);

	    // Set the vehicle for this leg
	    public void setVehicle(Vehicle v);

	    // Get the vehicle for this leg
	    public Vehicle getVehicle();
	}

	public class LegImpl implements Leg {
	    private String mode;
	    private double departureTime;
	    private double travelTime;
	    private Vehicle vehicle;

	    // Constructor
	    public LegImpl(String mode, double departureTime, double travelTime, Vehicle vehicle) {
	        this.mode = mode;
	        this.departureTime = departureTime;
	        this.travelTime = travelTime;
	        this.vehicle = vehicle;
	    }

	    @Override
	    public String getMode() {
	        return mode;
	    }

	    @Override
	    public void setMode(String mode) {
	        this.mode = mode;
	    }

	    @Override
	    public double getDepartureTime() {
	        return departureTime;
	    }

	    @Override
	    public void setDepartureTime(final double seconds) {
	        this.departureTime = seconds;
	    }

	    @Override
	    public double getTravelTime() {
	        return travelTime;
	    }

	    @Override
	    public void setTravelTime(final double seconds) {
	        this.travelTime = seconds;
	    }

	    @Override
	    public void setVehicle(Vehicle v) {
	        this.vehicle = v;
	    }

	    @Override
	    public Vehicle getVehicle() {
	        return vehicle;
	    }

	    // Implement other methods from PlanElement in the same way
	}

}
