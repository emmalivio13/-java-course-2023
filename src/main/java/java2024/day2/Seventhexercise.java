package java2024.day2;
import java.util.Scanner;
public class Seventhexercise {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] scores = new double[100]; //define the array with the max 100 scores
		
		double total = 0.0; 
		int count = 0;
	    
	    
		while (true) {
            System.out.print("Enter a score (negative number to quit): ");
            double score = input.nextDouble(); // if the score is positive enter a new score
            
            if (score < 0) {
                break;  // Exit the loop when a negative number is entered
            }
            
            scores[count] = score;
            total += score; //add the score to the total
            count++; //move the counter to the next score
        }
		
		double average = total / count; 
		int belowaverageCounter = 0;
		int aboveaverageCounter = 0;
		
		for (int i = 0; i < count; i++) {
	            if (scores[i] >= average) { //if the score is below the average 
	                aboveaverageCounter++;
	            } else {
	                belowaverageCounter++; //if the score is over the average
	            }
	     }
		
		System.out.println("The number of scores is: " + count);
		System.out.println("The average is: " + average);
		System.out.println("The number of scores above the average is: " + aboveaverageCounter);
		System.out.println("The number of scores below the average is: " + belowaverageCounter);
		
	}

}
