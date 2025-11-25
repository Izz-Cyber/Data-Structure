package Arrays;

public class LinearSearch {

    public int Linear(int []a, int svalue){
        for (int i = 0; i < a.length; i++){
            if (svalue == a[i]){
                return i;
            }
        }
        return -1;
    }
}
