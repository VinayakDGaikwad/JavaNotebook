class eve_odd{
        public static void main(String args[]){
        int array[] = {22,34,55,66};
        System.out.println("Even Elements:" + findEven(array));
    }

    static int findEven(int array[]){
        int counter = 0;
        for (int i = 0; i < array.length; i++){
            if ((array[i] % 2) == 0){
                counter++;
            }
        }
        return counter;
    }
}