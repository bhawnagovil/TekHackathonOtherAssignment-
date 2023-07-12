package Day2Practice;

public class Student {

    int Stuid;
    String StuName;

    int stuRollNo;

   public Student(int id, String name, int rollNo){
       this.Stuid= id;
       this.StuName= name;
       this.stuRollNo= rollNo;
   }

   public String toString() {
       return "RollNo : " + stuRollNo + ", "+ "Student Name : + "+ StuName+", "+ "SudentId : " + stuRollNo ;
   }
   }


