package Arrays;

public class BinarySearch {

    public int binary(int []a,int findex, int lindex, int svalue){
        while (findex <= lindex){
            int mid = (findex+lindex)/2;
            System.out.println("Mid = "+mid);
            if (svalue == a[mid])
                return mid;
            if (svalue > a[mid])
                findex = mid + 1;
            if (svalue < a[mid])
                lindex = mid - 1;

        }
        return -1;
    }
}
