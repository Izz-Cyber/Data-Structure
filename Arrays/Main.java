package Arrays;

import javax.naming.PartialResultException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        // Arrays1 <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

        /*Arrays1 arr = new Arrays1();

        Scanner scanner = new Scanner(System.in);
        int [] numbers = new int[3];

        //arr.traversal(numbers);
        arr.traversal2(numbers);*/




        /*int[] numbers = {1,2,3,4,5,6};
        Arrays1 arr = new Arrays1();

        arr.traversal2(numbers);
        arr.traversal(numbers);*/



        /*int[] numbers = {1,2,3,4,5,6,7};
        Arrays1 arr = new Arrays1();

        arr.revers_traversal(numbers);*/



        /*Arrays1 arr = new Arrays1();
        int[] numbers = new int[3];
        arr.input(numbers);*/






        // ArraysUpdate    <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

        /*ArraysUpdate arr = new ArraysUpdate();
        int []numbers = {1,2,3,4,5};
        numbers[2] = 7;

        arr.update(numbers,2,10);*/


        // ArraysDelete    <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

        /*ArraysDelete arr = new ArraysDelete();
        int []numbers = {1,2,3,4,5};

        arr.delete(numbers, 2);

        Arrays1 arr1 = new Arrays1();
        arr1.traversal(numbers);*/




        // LinearSearch     <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

        /*LinearSearch arr = new LinearSearch();
        int []numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        //arr.Linear(numbers,100);
        System.out.println(arr.Linear(numbers,10));
        System.out.println(arr.Linear(numbers, 100));
        // or
        int result = arr.Linear(numbers, 5);
        System.out.println(result);
        // or
        int result1 = arr.Linear(numbers, 2);
        if (result1 != -1){
            System.out.println("Value found at index: " +result1);
        }else {
            System.out.println("Value not found!");
        }*/




        // BinarySearch      <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

        BinarySearch arr = new BinarySearch();
        int []numbers = {20,2,3,5,9,6,7,8,4,11,15,12,13,14,10,16,17,18,19,1};
        Arrays.sort(numbers);

        System.out.println("Print all the Arrays After Sorted...");
        Arrays1 arr1 = new Arrays1();
        arr1.traversal(numbers);

        System.out.println("Print the steps to access to the index...");
        //arr.binary(numbers,0,numbers.length-1,5);
        //System.out.println(arr.binary(numbers,0, numbers.length-1,20));
        //System.out.println(arr.binary(numbers,0,numbers.length-1,20));

        int result = arr.binary(numbers, 0, numbers.length-1, 20);
        if (result != -1){
            System.out.println("Value found at index : " +result);
        }else {
            System.out.println("Value not found!");
        }
    }
}
