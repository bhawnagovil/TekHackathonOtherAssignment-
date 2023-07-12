package Day2Practice;

import java.util.Scanner;

        public class ArrayPractice {
        public static void main(String[] args) {
        Student[] stuobjs1 = new Student[5];
            for(int i=0 ; i<stuobjs1.length; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the student Id");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the student name");
            String name = sc.next();
            sc.nextLine();
            System.out.println("Enter the student Roll No");
            int rollNO = sc.nextInt();
            stuobjs1[i] = new Student(id, name, rollNO);
        }
            for (Student stu: stuobjs1 ){
                System.out.println(stu);}

            Student[] stuobjs = new Student[5];
        stuobjs[0] = new Student(1, "Bhanu", 5);
        stuobjs[1] = new Student(2, "Shalu", 6);

        stuobjs[2] = new Student(3, "Geeta", 7);
        stuobjs[3] = new Student(4, "Reeta", 8);
        stuobjs[4] = new Student(5, "Meeta", 9);


            System.out.println("\nSaved Student Objects:");
            for (Student student : stuobjs)


                System.out.println(student);



    }

}
