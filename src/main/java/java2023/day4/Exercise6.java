package java2023.day4;

import java.util.ArrayList;
public class Exercise6 {

	

	interface Activity extends PlanElement {
	    // Define methods related to Activity
	    String getType();
	}

	interface Leg extends PlanElement {
	    // Define methods related to Leg
	    String getMode();
	}

	interface Plan {
	    // Define methods for the Plan interface
	    void setScore(double score);
	    double getScore();
	    ArrayList<PlanElement> getPlanElements();
	    void addLeg(final Leg leg);
	    void addActivity(final Activity act);
	}

	class PlanImpl implements Plan {
	    private double score;
	    private ArrayList<PlanElement> planElements;

	    public PlanImpl() {
	        this.score = 0.0;
	        this.planElements = new ArrayList<>();
	    }

	    @Override
	    public void setScore(double score) {
	        this.score = score;
	    }

	    @Override
	    public double getScore() {
	        return score;
	    }

	    @Override
	    public ArrayList<PlanElement> getPlanElements() {
	        return planElements;
	    }

	    @Override
	    public void addLeg(final Leg leg) {
	        planElements.add(leg);
	    }

	    @Override
	    public void addActivity(final Activity act) {
	        planElements.add(act);
	    }
	}

	class ActivityImpl implements Activity {
	    private String type;

	    public ActivityImpl(String type) {
	        this.type = type;
	    }

	    @Override
	    public String getType() {
	        return type;
	    }
	}

	class LegImpl implements Leg {
	    private String mode;

	    public LegImpl(String mode) {
	        this.mode = mode;
	    }

	    @Override
	    public String getMode() {
	        return mode;
	    }
	}

	public class TestPlan {
	    public static void main(String[] args) {
	        PlanImpl plan = new PlanImpl();

	        // Create activities and legs
	        Activity home = new ActivityImpl("Home");
	        Leg car1 = new LegImpl("car");
	        Activity work = new ActivityImpl("Work");
	        Leg car2 = new LegImpl("car");
	        Activity home2 = new ActivityImpl("Home");

	        // Add activities and legs to the plan
	        plan.addActivity(home);
	        plan.addLeg(car1);
	        plan.addActivity(work);
	        plan.addLeg(car2);
	        plan.addActivity(home2);

	        // Set the score
	        plan.setScore(100.0);

	        // Output the types of activities and modes of legs
	        ArrayList<PlanElement> elements = plan.getPlanElements();
	        for (PlanElement element : elements) {
	            if (element instanceof Activity) {
	                System.out.print(((Activity) element).getType() + " - ");
	            } else if (element instanceof Leg) {
	                System.out.print(((Leg) element).getMode() + " - ");
	            }
	        }
	    }
	}

}
