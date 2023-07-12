package Day2JavaAssignment;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AreaSquareRectangle {
    private void findArea(int a){
        int area;
        area= 4*a;
        System.out.println("Area of Square :" + area);
    }
    private void findArea(int a, int b){
        int area;
        area= a*b;
        System.out.println("Area of Rectangle  : "+ area);

    }

    public static void main(String[] args) {
        AreaSquareRectangle areaobj = new AreaSquareRectangle();
        System.out.println("Enter the side of square to calculate it's area");
        Scanner sc= new Scanner(System.in);
        int side= sc.nextInt();
        areaobj.findArea(side);
        System.out.println("Enter the langth of the Rectangle :");
        int length= sc.nextInt();
        System.out.println("Enter the breadth of the Rectangle :");
        int breadth= sc.nextInt();
        areaobj.findArea(length, breadth);







    }
}
