package Hackathon;

public class checkpalindromeMalayalaM12 {
    public static boolean  ifStringPalindrome(String str) {
        boolean ans = true;
        String reverseword = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = str.length() - 1; j >= 0; j--) {
                if (str.charAt(i) != str.charAt(j)) {
                    ans = false;
                } else {
                   reverseword= reverseword+ str.charAt(j);
                    ans = true;
                }
            }
        }
        return ans;

    }
    public static boolean ifNumberPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }

    public static void main(String[] args) {
       if(ifStringPalindrome("MalayalaM")) {
          System.out.println("Given string is palindrome");
        }
      else{
          System.out.println("Given String is not palindrome");
      }
      if(ifNumberPalindrome(2331)){
          System.out.println("Given number is palindrome");
      }
      else{
          System.out.println("Given number is not palindrome");

      }

    }

}
