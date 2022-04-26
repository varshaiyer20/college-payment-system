// Java Program for Method Overriding

// Class 1
// Helper class
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;



class Parent extends Exception {
    
    Scanner input = new Scanner(System.in);

    // Method of parent class
    void Print() {

        // Print statement
        System.out.println("Attendance is Mandatory for students and Teachers");
    }
}

// Class 2
// Student Class
class subclass1 extends Parent {
    int number;

    // Method
    void Print() {
        System.out.println("Attendance of the student is?\n");
        int number = input.nextInt();
        if (number > 75) {
            System.out.println("Attendance of the Student is above 75% \n");
        }
    }
}

// Class 3
// Teacher class
class subclass2 extends Parent {
    int teacher_number;

    // Method
    void Print() {

        // Print statement
        System.out.println("Attendance of the Teacher is?\n");
        int teacher_number = input.nextInt();
        if (teacher_number > 75) {
            System.out.println("Attendance of the Teacher is above 75% \n");
        }

    }
}

// Interface implementation
interface Exam
{
    public void permit();
    public void welcome();
    public void admit();
}

//abstract class to inherit interface
abstract class candidate implements Exam
{

    int flag=0;

    //method overriden from interface Exam

    public void welcome()
    {
        System.out.println("Welcome to exam department! \n\n");
    }

    //method overriden from interface Exam
    public void permit()
    {
        Scanner in = new Scanner(System.in); 
        char ch;
        System.out.println("Is attendance of student above 75%?   Y/N");
        ch=in.next().charAt(0);
        if(ch=='Y')
        {
            flag=1;
            System.out.println("Student is  permitted to sit for the exam");
        }

        else if(ch=='N')
        {
            System.out.println("Student is NOT permitted to sit for the exam");
        }
        else{
            System.out.println("Invalid Input!");
        }

    }
}

// A class to inherit abstract class since object of an abstract class cannot be created
class display extends candidate
{
    //method overriden from interface Exam
    public void admit()
    {
        if(flag==1)
            System.out.println("Please collect ypur admit card from exam coordinator");
        else
            System.out.println("Since attendance criteria not fulfilled please appear in next semester");


    }
}


// Class 4
// Main class
class poly {

    // Main driver method
    public static void main(String[] args) {

        // Creating object of class 1
        Parent a;
        a = new Parent();
        a.Print();

        // Now we will be calling print methods
        // inside main() method

        a = new subclass1();
        a.Print();

        a = new subclass2();
        a.Print();

        //Creating an object of class display 
        display ob = new display();
        
        //Calling all overriden methods using pbject of display class
        ob.welcome();
        ob.permit();
        ob.admit();


    }
}
