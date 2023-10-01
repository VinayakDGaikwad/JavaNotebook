public class AlternateReverse {
    public static void main(String... arr) {
        String s = "abcdefgi";
        System.out.println((AlternateCase(s)));
    }

    static void swapAlternateString(String string) {
        char[] arr = string.toCharArray();

        for (int i = 0, j = 1; (i < arr.length) && (j < arr.length); i += 2, j += 2) {
            char t = arr[j];
            arr[j] = arr[i];
            arr[j] = t;
        }

    }

    static String AlternateCase(String string) {

        String output = "";

        for (int i = 0; i < string.length(); i++) {
            if (Character.isLowerCase(string.charAt(i))) {
                output += Character.toUpperCase(string.charAt(i));
            } else {

                if (Character.isUpperCase(string.charAt(i))) {
                    output += Character.toLowerCase(string.charAt(i));
                }
            }
        }

        return output;

    }
}
