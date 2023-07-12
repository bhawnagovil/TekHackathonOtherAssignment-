package CollectionAssignMent;

import java.util.Collections;
import java.util.HashSet;

//Store 5 student(name,id,major) object in hashset.if 2 objects has same id consider them as duplicate objects using comparable
public class SortingObjectOntheBasisOfID  {

    public static void main(String[] args) {
        HashSet<Student>stu= new HashSet<>(5);
        stu.add(new Student("Ram", 1, "Science"));
        stu.add(new Student("Shyam", 1, "History"));
        stu.add(new Student("Aana", 2, "Math"));
        stu.add(new Student("Bhawna", 3, "English"));
        stu.add(new Student("Akshara", 6, "Chemistry"));
        System.out.println("Sorted set");
        for (Student s : stu) {
            System.out.println(s.getId() + " " + s.getName() + " "+ s.getMajor());
        }





    }




}
