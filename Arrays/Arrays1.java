package Arrays;

import java.util.Scanner;

public class Arrays1 {
    Scanner scanner = new Scanner(System.in);

    public void traversal(int []numbers){
        for (int i = 0; i < numbers.length; i++){
            System.out.println("index " +i+ " : Element= "+numbers[i]);
        }
    }

    public void traversal2(int []numbers){
        for(int num : numbers){
            System.out.println(num);
        }
    }

    public void revers_traversal(int []numbers){
        System.out.println("The reverse travesal array elements are: ");
        System.out.println("numbers[index] = element.");
        for(int i = numbers.length-1; i>=0; i--){
            System.out.println("numbers["+i+"]" + " = "+numbers[i]);
        }
    }

    public void input(int []numbers){
        int i ;
        System.out.println("Please enter "+ numbers.length+" numbers:");
        for (i=0; i<numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
    }


}
