package EnumPractice;

import java.util.Scanner;

public class TestEnum {

    public static void main(String[] args) {
        System.out.println("enter the age group");
        Scanner sc= new Scanner(System.in);
        String val= sc.next();
        try {
            CarColors colors= CarColors.valueOf(val.toUpperCase());

            switch (colors) {
                case BLUE -> System.out.println("This car is blue");

                case PINK -> System.out.println("This car is pink");

                case WHITE -> System.out.println("This car is white");
            }
        }
        catch (IllegalArgumentException i){
                System.out.println("argument passed should be a string");
            }


    }
}
