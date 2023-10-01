class ReverserString{
    public static void main(String ... args){
        String str = "one two three four five";
        String[] arr = str.split(" ");

        for (int w = 0; w < str.length(); w++){
            reverse(arr[w]);
        }

    }

    private static String reverse(String string) {
        
        char [] stringarr = string.toCharArray();

        int l = string.length();
        for (int w = 0; w < l; w++,l--){
           char c = stringarr[l];
           stringarr[l] = stringarr[w];
           stringarr[w] = c;
        }       

        return new String(stringarr); //don't do .toString()
        
    }
}