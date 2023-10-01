public class SubStringCounter {
    public static void main(String[] args) {
        String s = "we are learning java string programs. string tunning programming is fun";
        int counter = 0;
        int scanned_till = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf("ing", scanned_till) > -1) {
                scanned_till = s.indexOf("ing", scanned_till) + 3;
                counter++;
            }
        }

        System.out.println(counter);
    }
}
