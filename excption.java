import java.util.Scanner;

// class representing custom exception  
class InvalidAgeException extends Exception {

    public InvalidAgeException(String str) {
        // calling the constructor of parent Exception
        super(str);
    }
}

// class that uses custom exception InvalidAgeException
public class excption {
    static Scanner input = new Scanner(System.in);

    // method to check the age
    static void validate(int age) throws InvalidAgeException {
        if (age < 18) {

            // throw an object of user defined exception
            throw new InvalidAgeException("age is not valid to vote");
        } else {
            System.out.println("welcome to vote");
        }
    }

    // main method
    public static void main(String args[]) {

        try {
            // calling the method
            System.out.println("Enter the age of the college Student \n");
            int age = input.nextInt();
            validate(age);
        } catch (InvalidAgeException ex) {
            System.out.println("Caught the exception");

            // printing the message from InvalidAgeException object
            System.out.println("Exception occured: " + ex);
            System.out.println("The age of the student should be greater then 18 years");

        }

        System.out.println("Lets move onto the code");
    }
}