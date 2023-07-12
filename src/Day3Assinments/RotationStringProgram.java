package Day3Assinments;
// two strings are rotation of each other if having same number of character, same character and rotated around for example
 // abcd string rotation could be bcda, cdab, dcba, appending from one character to all three at the end.
public class RotationStringProgram {
    public static boolean ifOneIsRotationOfAnother(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        else {
            String s3 = s1 + s1;

            return s3.contains(s2);
        }
    }
    public static void main(String[] args) {
        RotationStringProgram pr = new RotationStringProgram();
        System.out.println(pr.ifOneIsRotationOfAnother("Hello", "Olleo"));
    }

}
