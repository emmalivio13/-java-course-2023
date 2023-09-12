package java2023.day1;
import java.util.Scanner;
public class Fifthexercise {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Input the integer: ");
        String integer = scanner.nextLine();
     
        //inizializza il risultato
        int result = 1;
        
        //iterare tra le cifre
        
        for (int i = 0; i < integer.length(); i++) {
            char cifraChar = integer.charAt(i); // Ottenere il carattere corrente
            int cifraInt = Character.getNumericValue(cifraChar); // Convertire il carattere in un intero
            result *= cifraInt; // Moltiplicare la cifra corrente con il risultato parziale
	} 
        System.out.println("The result is: " +result);
	}     
}
