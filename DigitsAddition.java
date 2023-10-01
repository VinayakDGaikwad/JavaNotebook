public class DigitsAddition {
    public static void main(String... arr) {
        String s = "abc233defgi";
        int ans = 0;
        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                 ans += Character.getNumericValue(ch);
            }
        }

        System.out.println(ans);
    }
}
