package java2023.day1;

import java.util.Scanner;

public class Ninthexercise1 {

	public static void main(String[] args) {
		//command to input the number N
		Scanner input = new Scanner(System.in);
        System.out.println("Input the number N: ");

        int N = input.nextInt();
        int count = 0;
        int number = 1;

        while (count < N) {
            int sumOfDivisors = 0;
            
            //Se il numero i è un divisore somma tale numero in sumOfDivisors
            for (int i = 1; i <= number/2; i++) {
                if (number % i == 0) {
                    sumOfDivisors += i;
                }
            }
            //se il numero è perfetto vai avanti con il conteggio (count)
            if (sumOfDivisors == number) {
                count++;
                // se il conto dei numeri perfetti è N stampalo
                if (count == N) {
                    System.out.println("The " + N + "-th perfect number is: " + number);
                    
                }
            }
            number++;
        }

        
    }
	

}
