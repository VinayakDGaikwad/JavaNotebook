public class CountFrequency {
    public static void main(String[] args) {
        int array[] = {3,4,5,6,7,44,44,4,4,4,4,44,4};

        System.out.print(getFrequency(array,4));
    }

    static int getFrequency(int array[], int key){
        int fre = 0;
        for (int c : array){
            if (c == key){
                fre++;
            }
        }
        return fre;
    }
}
