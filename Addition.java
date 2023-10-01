import java.util.Scanner;

public class Addition {

        public static float add(float first, float second) {
            float addition = first + second;
            return addition;
        }
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (
        Scanner sc = new Scanner(System.in)) {
            float data1, data2;
            System.out.println("Enter the first number:");
            data1 = sc.nextFloat();
            System.out.println("Enter the second number:");
            data2 = sc.nextFloat();
            float answer = add(data1, data2);

            System.out.println(answer);
        }
    }

}
