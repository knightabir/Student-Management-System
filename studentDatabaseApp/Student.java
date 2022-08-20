package studentDatabaseApp;

import java.util.Scanner;

public class Student {
    private String FirstName;
    private String LastName;
    private String gradeYear;
    private int StudentId;
    private String Course;
    private int Fees;
    private static int CourseFees = 600;


    //constructor: user to enter students name and year
    Scanner in = new Scanner(System.in);
    public Student() {
        System.out.println("Enter First name of the Student: \n");
        this.FirstName = in.nextLine();
        System.out.println("Enter Last name of the student \n");
        this.LastName = in.nextLine();

    }


    // Generate an ID

    // Enroll in the courses

    //View balance

    //Show status



}
