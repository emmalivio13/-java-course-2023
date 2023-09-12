package java2024.day2;

public class Sixthexercise {
	public static boolean ValidPassword(String password) {
		
		
        // Check if the password has at least 8 characters
        if (password.length() < 8) {
            return false;
        }
        
        // Check if the password contains at least one digit
        boolean Digit = false;
        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) {
                Digit = true;
                break;
            }
        }
        
        // Check if the password contains a "." character
        if (password.contains(".")) {
            return false;
        }
        
        // Password is valid if it meets all the criteria
        return Digit;
    }
	
	
	
	public static void main(String[] args) {
		String password1 = "Passw1rd"; // Valid password
        String password2 = "abc.xyz";  // Invalid password

        if (ValidPassword(password1)) {
            System.out.println("Password1 is valid.");
        } else {
            System.out.println("Password1 is invalid.");
        }

        if (ValidPassword(password2)) {
            System.out.println("Password2 is valid.");
        } else {
            System.out.println("Password2 is invalid.");
        }

	}

}
