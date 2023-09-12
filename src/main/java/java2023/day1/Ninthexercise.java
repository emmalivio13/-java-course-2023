package java2023.day1;

public class Ninthexercise {

	public static void main(String[] args) {
		int limit = 100000;
		//for loop per considerare ogni numero minore di 10000
        for (int number = 1; number < limit; number++) {
            int sumOfDivisors = 0;
            //Per ogni possibile divisore minore del numero calcola se si tratta di un divisore, se si somma i divisori 
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sumOfDivisors += i;
                }
            }
            //	criterio per controllare se è un numero perfetto	
            if (sumOfDivisors == number) {
                System.out.println(number);
            }
        }
	}

}
