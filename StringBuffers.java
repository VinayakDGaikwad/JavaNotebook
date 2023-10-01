public class StringBuffers {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Java is fun");

        sb.append("dsf"); // stringbuffer is syncronized (thread safe)
                          // stringbuilder is not sycnronized (not thread safe)

        sb.reverse();

        System.out.println(sb);

    }
}
