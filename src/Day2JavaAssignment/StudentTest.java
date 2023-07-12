package Day2JavaAssignment;
/*Create the student class with id name phonenumber country
	create constructors
	read the data from user
	store 5 student object
	and print the details in the console*/
import java.util.Scanner;

public class StudentTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student[] students = new Student[5];
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter details for student " + (i+1) + ":");
            System.out.print("ID: ");
            int id = input.nextInt();
            input.nextLine(); // consume newline
            System.out.print("Name: ");
            String name = input.nextLine();
            System.out.print("Phone number: ");
            String phoneNumber = input.nextLine();
            System.out.print("Country: ");
            String country = input.nextLine();
            students[i] = new Student(id, name, phoneNumber, country);
        }
        System.out.println("Details of all students:");
        for (Student student : students) {
            System.out.println("ID: " + student.getId());
            System.out.println("Name: " + student.getName());
            System.out.println("Phone number: " + student.getPhoneNumber());
            System.out.println("Country: " + student.getCountry());
            System.out.println();
        }
    }
}


