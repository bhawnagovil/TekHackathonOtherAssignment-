package Day2JavaAssignment;
// 2. To find the given year is leap year or not(include century year also)
import java.util.Scanner;

public class LeapYear {
    public boolean checkLeapYear() {
        System.out.println("Enter an Year :: ");
        Scanner sc = new Scanner(System.in);
       int year = sc.nextInt();
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){
            System.out.println("Specified year is  a leap year");
        return true;
    }
        else{
            System.out.println("Specified year is not a leap year");
             return false;
        }
    }


        public static void main(String[] args){
            LeapYear leap= new LeapYear();
            leap.checkLeapYear();


        }
    }

