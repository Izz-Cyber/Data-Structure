package Arrays;

public class ArraysUpdate {
    public void update(int []a, int index, int nvalue){
        /*a[index] = nvalue;
        System.out.println(nvalue);*/

        if (index < 0 || index > a.length){
            System.out.println("Index not found!");
        }
        else{
            a[index] = nvalue;
            System.out.println("The new value is: "+nvalue+ " /n It is found..");
        }


    }
}
