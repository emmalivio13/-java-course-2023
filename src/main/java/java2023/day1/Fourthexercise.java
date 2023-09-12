package java2023.day1;
import java.util.Scanner;
public class Fourthexercise {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.println("Input the radius of the circle: ");
        double radius = input.nextDouble();
        final double PI = 3.14159;
        double area = radius * radius* PI;
        System.out.println("The area of the cycle is:" + area);
	}

}
