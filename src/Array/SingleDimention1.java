package Array;

import java.util.Arrays;

public class SingleDimention1 { // class start

    public static void main(String[] args){

        int arr[]= new int[5];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        // arr[5] = 60 // array index out of bounds exception.


        System.out.println (arr.length);
        System.out.println(arr [0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        for (int i: arr){
            System.out.println(i);
        }
    }
}

class SingleDimention2{ // instantiation and initialization of array
    public static void main(String[] args){
        int arr[] = {33,3,4,40};// Declaration, instantiontion,
        for (int i: arr){
            System.out.println(i);

        }
    }}



    class MinMax{

        public static void main( String[] args){
            int[] arr = {-6,-4,30,8,50,10};

            Arrays.sort(arr); // sort method to sort the array in ascending order
            System.out.println(arr[0]); // min number
            System.out.println(arr[arr.length-1]); //max number
        }
}



