package java2024.day2;

import java.util.Scanner;

public class Thirdexercise {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        // Enter 3 cities
        System.out.println("Enter the first city: ");
        String city1 = scanner.nextLine();
        
        System.out.println("Enter the second city: ");
        String city2 = scanner.nextLine();
        
        System.out.println("Enter the third city: ");
        String city3 = scanner.nextLine();

        if (city1.compareToIgnoreCase(city2) > 0) {
            String temp = city1;
            city1 = city2;
            city2 = temp;
            
        }
        
        if (city2.compareToIgnoreCase(city3) > 0) {
            String temp = city2;
            city2 = city3;
            city3 = temp;
            
        }
        if (city1.compareToIgnoreCase(city2) > 0) {
            String temp = city1;
            city1 = city2;
            city2 = temp;
        
        }
        
        System.out.println("The cities in ascending order are: ");
        System.out.println(city1);
        System.out.println(city2);
        System.out.println(city3);
        
	}	
    
}
