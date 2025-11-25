package Arrays;

public class ArraysDelete {
    public void delete(int []a, int index){
        /*a[index] = 0;
        System.out.println(a[index]);*/

        if (index < 0 || index > a.length){
            System.out.println("Index not Found!");
        }else {
            a[index] = 0;
        }
    }
}
