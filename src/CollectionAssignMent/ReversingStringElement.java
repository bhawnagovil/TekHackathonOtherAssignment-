package CollectionAssignMent;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

// java Program to store 4 string element and print it in reverse order(don’t use for and while)
public class ReversingStringElement {

    public void reverseString(){
        LinkedList<String> sr= new LinkedList<>();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter five string values");
        for (int i = 0; i < 5; i++) {
            String givingstr = sc.next();
            sr.add(givingstr);
            Collections.reverse(sr);
        }
        System.out.println("Elements in Reverse Order:");
        for (String s : sr) {
            System.out.println(s);
        }


    }
        public static void main(String[] args) {
        ReversingStringElement rs= new ReversingStringElement();
        rs.reverseString();

    }


}
