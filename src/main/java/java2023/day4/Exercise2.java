package java2023.day4;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;


public class Exercise2 {

	
	    public static void main(String[] args) {
	        // Define a set of vowels
	        HashSet<Character> vowels = new HashSet<>();
	        vowels.add('A');
	        vowels.add('E');
	        vowels.add('I');
	        vowels.add('O');
	        vowels.add('U');

	        // Create a Scanner for user input
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter a text file name
	        System.out.print("Enter the name of the text file: ");
	        String fileName = scanner.nextLine();

	        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
	            String line;
	            int vowelCount = 0;
	            int consonantCount = 0;

	            // Read the file line by line
	            while ((line = reader.readLine()) != null) {
	                line = line.toUpperCase(); // Convert to uppercase for case-insensitive counting

	                for (char c : line.toCharArray()) {
	                    if (Character.isLetter(c)) { // Check if the character is a letter
	                        if (vowels.contains(c)) {
	                            vowelCount++;
	                        } else {
	                            consonantCount++;
	                        }
	                    }
	                }
	            }

	            // Display the results
	            System.out.println("Number of vowels: " + vowelCount);
	            System.out.println("Number of consonants: " + consonantCount);
	        } catch (IOException e) {
	            System.err.println("Error reading the file: " + e.getMessage());
	        } finally {
	            // Close the scanner
	            scanner.close();
	        }
	    }
	}


