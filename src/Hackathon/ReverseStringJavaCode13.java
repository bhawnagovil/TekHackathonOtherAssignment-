package Hackathon;
//Given a string print the reverse of the string.(Input:  Java Code Output: edoC avaJ)
    public class ReverseStringJavaCode13 {

        public static String printReverseString(String str){
                String reverseword = "";
                for (int i = str.length()-1;i>=0; i--) {
                     reverseword= reverseword+ str.charAt(i);
                        }
              return reverseword;
            }

          public static void main(String[] args) {
          System.out.println(printReverseString("Java Code"));

           }
          }
