import java.util.ArrayList;
import java.util.List;
import welcome.wel; // user defined package
import java.util.Scanner;

class InvalidAgeException extends Exception {

        public InvalidAgeException(String str) {
                // calling the constructor of parent Exception
                super(str);
        }
}

// method to check the age

public class Main {
        static Scanner input = new Scanner(System.in);

        static void validate(int age) throws InvalidAgeException {
                if (age < 18) {

                        // throw an object of user defined exception
                        throw new InvalidAgeException("age is not valid to vote");
                } else {
                        System.out.println("welcome to vote");
                }
        }

        public static void main(String[] args) {
                Teacher samantha = new Teacher(1, "Samantha", 5000);
                Teacher mala = new Teacher(2, "Mala", 9000);
                Teacher vasudev = new Teacher(3, "Vasudev", 6000);

                List<Teacher> teacherList = new ArrayList<>();
                teacherList.add(samantha);
                teacherList.add(mala);
                teacherList.add(vasudev);

                Student tammana = new Student(1, "Tammana", 40);
                Student radha = new Student(2, "Radha", 70);
                Student jodha = new Student(3, "Jodha", 50);

                List<Student> studentList = new ArrayList<>();
                studentList.add(tammana);
                studentList.add(jodha);
                studentList.add(radha);

                // creating our own user defined package
                wel obj = new wel();
                obj.show();

                // User Defined Exception is being Performed
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
                // using the concept of polymorphism and inheritance

                Parent a = new Parent();
                a = new Parent();
                a.Print();

                // Now we will be calling print methods
                // inside main() method

                a = new subclass1();
                a.Print();

                a = new subclass2();
                a.Print();
                College abc = new College(teacherList, studentList);


                //Creating an object of class display 
                display ob = new display();
        
                //Calling all overriden methods using pbject of display class
                ob.welcome();
                ob.permit();
                ob.admit();

                // Exception performing
                try {

                        // "anindita" is not a number
                        // enter the fees
                        System.out.println("Enter the fees of Tammana");
                        int number = input.nextInt();
                        int num = Integer.parseInt("anindita");
                        tammana.payFees(number);
                        System.out.println(num);
                } catch (NumberFormatException e) {
                        System.out.println(" No number format exception");
                }

                radha.payFees(50000);
                Teacher mina = new Teacher(6, "Mina", 9000);
                abc.addTeacher(mina);
                System.out.println("College has earned Rs." + abc.getTotalMoneyEarned());

                System.out.println(" --------- School's Pay Salary ------");
                samantha.receiveSalary(samantha.getSalary());
                System.out.println(
                                "College has spent for salary to " + samantha.getName() + " and now has Rs."
                                                + abc.getTotalMoneyEarned());
                vasudev.receiveSalary(vasudev.getSalary());
                System.out.println(
                                "College has spent for salary to " + vasudev.getName() + " and now has Rs."
                                                + abc.getTotalMoneyEarned());
                mina.receiveSalary(mina.getSalary());

                System.out.println(
                                "College has spent for salary to " + mina.getName() + " and now has Rs."
                                                + abc.getTotalMoneyEarned());
                System.out.println(radha);
                System.out.println(jodha);
                System.out.println(vasudev);

        }

}