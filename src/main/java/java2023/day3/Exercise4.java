package java2023.day3;

public class Exercise4 {

	public static void main(String[] args) {
		// Create the PlanElement interface, with no data fields or methods
		interface PlanElement {
		}

		// Create the Activity interface that extends PlanElement
		interface Activity extends PlanElement {
		    // Method to get the end time of the activity
		    double getEndTime();

		    // Method to set the end time of the activity
		    void setEndTime(final double seconds);

		    // Method to get the type of activity
		    String getType();

		    // Method to set the type of activity
		    void setType(final String type);

		    // Method to get the x-coordinate of the activity location
		    double getXCoord();

		    // Method to get the y-coordinate of the activity location
		    double getYCoord();
		}

		// Create an implementation of the Activity interface
		class ActivityImpl implements Activity {
		    private double endTime;
		    private String type;
		    private double xCoord;
		    private double yCoord;

		    // Constructor
		    public ActivityImpl(double endTime, String type, double xCoord, double yCoord) {
		        this.endTime = endTime;
		        this.type = type;
		        this.xCoord = xCoord;
		        this.yCoord = yCoord;
		    }

		    @Override
		    public double getEndTime() {
		        return endTime;
		    }

		    @Override
		    public void setEndTime(final double seconds) {
		        this.endTime = seconds;
		    }

		    @Override
		    public String getType() {
		        return type;
		    }

		    @Override
		    public void setType(final String type) {
		        this.type = type;
		    }

		    @Override
		    public double getXCoord() {
		        return xCoord;
		    }

		    @Override
		    public double getYCoord() {
		        return yCoord;
		    }
		}

	}

}
