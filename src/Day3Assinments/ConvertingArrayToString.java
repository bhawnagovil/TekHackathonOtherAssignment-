package Day3Assinments;

import java.util.Arrays;

public class ConvertingArrayToString {

    public void intArrayToString(int[]arr){
        String array= Arrays.toString(arr);
        System.out.println(array);
    }
    public void booleanArrayToString(boolean [] boolarr){
        String array= Arrays.toString(boolarr);
        System.out.println(array);

    }
    public void doubleArrayToString(double[] dblArr){
        String array= Arrays.toString(dblArr);
        System.out.println(array);
    }

    public static void main(String[] args) {
        ConvertingArrayToString convert= new ConvertingArrayToString();
        convert.intArrayToString(new int[]{1,2,3,4});
        convert.booleanArrayToString(new boolean[]{true,false,true});
        convert.doubleArrayToString(new double[4]);
    }

}
