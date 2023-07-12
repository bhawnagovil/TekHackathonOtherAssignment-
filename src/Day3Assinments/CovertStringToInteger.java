package Day3Assinments;
import java.sql.SQLOutput;
import java.util.Scanner;
public class CovertStringToInteger {
    public int convertStrToInt(String s){
        int i= 0;
        try {
             //i = Integer.parseInt(s);
              i= Integer.valueOf(s);
        }
        catch(NumberFormatException n){
            System.out.println("Number is having exception");
            n.printStackTrace();
        }
        return i;
    }
    public String convertIntToString(int i){

     //String s= Integer.toString(i);
        String s= String.valueOf(i);
     return s;
     }
    public void convertstringToChar(String s){
        char[] charaaray= s.toCharArray();
        for(char c: charaaray){
            System.out.println(c);
        }
        System.out.println();

    }
    public static void main(String[] args) {
        CovertStringToInteger i2= new CovertStringToInteger();
        System.out.println("print the string number to convert it to Integer :");
        Scanner sc= new Scanner(System.in);
        String s1= sc.next();
        //System.out.println(i2.convertStrToInt(s1));
        System.out.println("converting string to character array and printing them");
        i2.convertstringToChar(s1);
        sc.close();
        //System.out.println("enter number converting to string");
       // int i= sc.nextInt();
        //System.out.println(i2.convertIntToString(i));


    }
}
