package java2024.day2;
import java.util.Scanner;
public class Eighthexercise {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//input the number of integers
		System.out.print("Enter the number of integer ");
        int integerArray = input.nextInt(); 
        
        //define the array to store the integers
        int[] numbers = new int[integerArray];
        
        //enter the integers in the console
        System.out.print("Enter the integers ");
        for (int i = 0; i < integerArray; i++) {
        	numbers[i] = input.nextInt();
        }
        //create an array with unique numbers
        
        int [] uniqueArray = removeDuplicates (numbers);
        System.out.println("Array with duplicates removed:");
        for (int number : uniqueArray) {
            System.out.print(number + " ");
	    }
	}
	
	public static int[] removeDuplicates(int[] list) {
		int[] uniqueList = new int[list.length]; //array with unique numbers
        int uniqueCount = 0; //counter for the unique array
        
        for (int i = 0; i < list.length; i++) {
            boolean isDuplicate = false;
            
            for (int j = 0; j < uniqueCount; j++) {
                if (list[i] == uniqueList[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            
            if (!isDuplicate) {
                uniqueList[uniqueCount] = list[i];
                uniqueCount++;
            }
        }
        //create an array for the results, so with the dimension uniqueCount
	   		int[] result = new int[uniqueCount];
	   		System.arraycopy(uniqueList, 0, result, 0, uniqueCount);
    
    return result;

    }
}
