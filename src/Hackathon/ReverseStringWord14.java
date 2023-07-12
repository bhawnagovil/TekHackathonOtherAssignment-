package Hackathon;
//Question-Given a string print the reverse of the words string.(Input:  Java Code Output: Code Java)

public class ReverseStringWord14 {
    public static void printWordsinReverseOrder(String str){
        String [] array= str.split(" ");
        System.out.println("Words without reversing the order of String");
        for(String s: array){
            System.out.print(s+ " ");
        }
        System.out.println("Words after reversing the order of String");
        for(int i=array.length-1; i>=0; i-- ){
            System.out.print(array[i]+ " ");
        }
    }
    public static void main(String[] args) {
        printWordsinReverseOrder( "Java Code");
    }


}
