import java.util.Arrays;

public class VarArray {
    public static void main(String ... args){
        //we can declare array list that is of range 1 to n
        //(...) ellipse operator
        System.out.println(add(3,42423,42,35,345,345));
    }

    static int add(int ... arr){
        return Arrays.stream(arr).sum();
    }
}
