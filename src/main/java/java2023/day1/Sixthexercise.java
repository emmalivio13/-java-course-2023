package java2023.day1;
import java.util.Random;
public class Sixthexercise {

	public static void main(String[] args) {
		int secretNumber = generateRandomNumber(0, 1000);
		int attempts = 0; 
		int guess;
		Random r = new Random(); 
		do {
			guess = r.nextInt(1001); //scegli un numero a caso tra 0 e 1000
			attempts++; //aumenta di uno il numero dei tentativi
		} while (guess != secretNumber);
			
		System.out.println("Secret number is: " + secretNumber);
        System.out.println("Number of tries: " + attempts);
	}
	
	//// Numero random tra il minimo (incluso) e il massimo (escluso)
	public static int generateRandomNumber(int min, int max) {
        Random r= new Random();
        return r.nextInt(max - min) + min;
	}
}
