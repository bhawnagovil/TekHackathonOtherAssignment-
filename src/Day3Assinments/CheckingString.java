package Day3Assinments;

public class CheckingString {

    public void compareStringWithignoringCase(String s1, String s2){
        boolean eic= s1.equalsIgnoreCase(s2);// checking if the strings are same ignoring their case
        System.out.println(eic);
        boolean b= s1.equals(s2);
        System.out.println(b);
    }
    public void compareStringWithEqualCase(String s1, String s2){
       boolean b= s1.equals(s2) ;
        System.out.println(b);

    }

    public void capitalizeFirstLetterOFEachWord(){

    }
    public void findAllSubstringinGivenString(){

    }

    public static void main(String[] args) {
      CheckingString ch= new CheckingString();
      ch.compareStringWithignoringCase("BHANU","bhanu");
      ch.compareStringWithEqualCase("Bhanu", "bhanu");

    }
}
