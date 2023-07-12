package Day3Assinments;

import java.util.Scanner;

public class findNumberOfWordsInGivenString {
    public static void findNoOfWords( String s){
        System.out.println( s.split("\\s+").length);

    }
    public static int findNumberOfWords(String word){
        int count =0;
        for (String s : word.split(" ")) {
            System.out.println(s);
            count++;
        }
        return count;

    }
    public int findMoreNoOfWords(String str) {
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')) {
                count++;
            }
        }
        return count;

    }
    public static int countWords(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        String[] words = str.split("\\s+");
        return words.length;
    }


    public static void main(String[] args) {
        //findNumberOfWordsInGivenString fd= new findNumberOfWordsInGivenString();
       // System.out.println(fd.findNoOfWords("This is my House"));
       // System.out.println(fd.findNumberOfWords("You can be a programmer"));
        //String s= "Hello Prograaming";
        //System.out.println(s.length());
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.next();
        findNoOfWords(inputString);
        //System.out.println("Number of words in the string: " + wordCount);
        scanner.close();
    }


    }


