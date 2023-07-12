package Day4Assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AssignMentOnArrayConcepts {
    static int n;

    public static void gettingInputInArrayandSaving() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the the array");
        n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element in the index " + i + ":");
            array[i] = sc.nextInt();
        }
    }


    public int addingAllElementOftheArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the the array");
        int n = sc.nextInt();
        int sum = 0;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element in the index " + i + ":");
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            sum = sum + array[i];
        }

        return sum;

    }

    public int findMaximumElementInArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the the array");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element in the index " + i + ":");
            array[i] = sc.nextInt();
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] < array[j]) {
                    max = array[j];
                }
            }

        }
        return max;

    }

    public void findUniqueElementINArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the the array");
        int n = sc.nextInt();
        int[] arrayWithDuplicate = new int[n];
        int size = arrayWithDuplicate.length;
        int[] arrayWithDistinctElement = new int[n];
        int size1 = arrayWithDistinctElement.length;
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element in the index " + i + ":");
            arrayWithDuplicate[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            boolean isUnique = true;
            for (int j = 0; j < size1; j++) {
                if (arrayWithDuplicate[i] == arrayWithDistinctElement[j]) {
                    isUnique = false;
                    break;
                } else {
                    arrayWithDistinctElement[j] = arrayWithDuplicate[i];
                }
            }
            for (i = 0; i < size1; i++) {
                System.out.print(arrayWithDistinctElement[i] + " ");
            }
        }

    }
    public void toAddSumOfTheArrayToEachElementInArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the the array");
        int n = sc.nextInt();
        int sum = 0;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element in the index " + i + ":");
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            sum = sum + array[i];
        }
       for(int i=0; i<array.length; i++){
           array[i]= sum+array[i];
       }
        System.out.println("Array after adding array sum: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }


    }

    public void gettingOnlyEvenNumberInArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the the array");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element in the index " + i + ":");
            array[i] = sc.nextInt();
        }
        int[] arrayWithEvenNumbers = new int[n];
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                arrayWithEvenNumbers[i] = array[i];
            }
        }
        for (int i = 0; i < arrayWithEvenNumbers.length; i++) {
            System.out.println(arrayWithEvenNumbers[i]);
        }
    }

    public boolean checkGivenStringPalindromeOrNot() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String you want to check if palindrome");
        String givenString = sc.next();
        String rev = " ";
        boolean ans = false;
        for (int i = givenString.length() - 1; i >= 0; i--) {
            rev = rev + givenString.charAt(i);
        }
        if (givenString.equals(rev)) {
            ans = true;
        }
        return ans;

    }

    public void findFrequencyOfEachCharacterByCollection(String s) {
        Map<Character, Integer> charMap = new HashMap<>();
        s= s.replace(" ", "");
        char[] chararray = s.toCharArray();
        for (char c : chararray) {

                if (charMap.containsKey(c)) {
                    charMap.put(c, charMap.get(c) + 1);
                } else {
                    charMap.put(c, 1);
                }
            }


            System.out.println(s + " " + charMap);

    }
     public void findFreqOfEachCharacterInGivenStringWithoutCollection(String str){
        str= str.replace(" ", "");
        while(str.length()>1){
            char ch= str.charAt(0);
            System.out.println(ch + " "+countChar(str, ch));
            str= str.replace(""+ch,"");
        }


     }
     public static int countChar(String str, char ch){
     int count= 0;
     while(str.indexOf(ch)!=-1){
         count++;
         str= str.substring(str.indexOf(ch)+1);
     }
     return count;
     }
    public static void moveEvenNumbers(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            while (left < right && nums[left] % 2 == 0) {
                left++;
            }

            while (left < right && nums[right] % 2 != 0) {
                right--;
            }

            if (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
        }
    }
    private static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

        public static void main (String[]args){
            AssignMentOnArrayConcepts ai = new AssignMentOnArrayConcepts();
            System.out.println(ai.addingAllElementOftheArray());
            System.out.println(ai.findMaximumElementInArray());
            ai.findUniqueElementINArray();
            ai.gettingOnlyEvenNumberInArray();
            System.out.println(ai.checkGivenStringPalindromeOrNot());
            ai.findFrequencyOfEachCharacterByCollection("Hello Sweety");
            ai.findFreqOfEachCharacterInGivenStringWithoutCollection("Hello Sweetheart");
            int[] nums = {4, 2, 5, 7, 8, 1, 6, 3};

            System.out.println("Original array: ");
            printArray(nums);

            moveEvenNumbers(nums);

            System.out.println("Array after moving even numbers: ");
            printArray(nums);


        }

    }


