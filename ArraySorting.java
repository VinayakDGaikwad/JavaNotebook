import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args){
        int[] arrrr = {324,45,6,5,3,434};
        sortArr(arrrr);

        System.out.println(Arrays.toString(arrrr));        
    }

    //bubble sort
    static void sortArr(int[] arr){
        int temp = 0;
        for(int i = 0; i < arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if (arr[j] < arr[i])
                {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i]=temp;
                }
            }
        }
    }
}
