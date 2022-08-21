package studentDatabaseApp;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private String FirstName;
    private String LastName;
    private String studentId;
    private int Class;
    private ArrayList<String> courses = new ArrayList<>();
    private int Fees;
    private static int CourseFees = 600;
    private static int id = 1000;


    //constructor: user to enter students name and year
    Scanner in = new Scanner(System.in);
    public Student() {

        System.out.print("Enter First name of the Student: \n");
        this.FirstName = in.nextLine();
        System.out.print("Enter Last name of the student \n");
        this.LastName = in.nextLine();
        System.out.print("1 - For class V\n2- For class VI\n3- For class VII\n4 - For class VIII\n Enter in which class do you want your admission: ");
        this.Class = in.nextInt();
        setId();
    }


    // Generate an ID
    private void setId(){
        //Class + Number
        id++;
        studentId = Class +" "+id;
    }

    // Enroll in the courses
    public void enroll(){


        do {
            Scanner course = new Scanner(System.in);
            System.out.println("Enter Course name (Q to quit)");
            String abc = course.nextLine();

            if (!abc.equals("Q")){
                courses.add(abc);
            }
            else break;
        }while (true);


        // printing the Courses
        System.out.println("your selected courses are: "+ courses);
        Fees = courses.size() * CourseFees;
    }


    //View balance
    public void viewBalance(){
        System.out.println("Your balance is: "+Fees);
    }



    //pay Tuition fees
    public void payFees(){
        System.out.println("Enter your Payment");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        Fees = Fees - payment;
        System.out.println("Thanks for your payment of "+payment);
        viewBalance();
    }


    //Show status fo the student
    public void showInfo(){
        System.out.println("Name: "+FirstName+ " "+LastName);
        System.out.println("Student ID: "+studentId);
        System.out.println("Courses Enrolled: "+courses);
        System.out.println("Balance: "+Fees);
    }
}
