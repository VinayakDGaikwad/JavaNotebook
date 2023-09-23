import java.util.Scanner;

public class dynamic_binding {

    abstract class shape {

        double height;
        double width;

        void input() {
            Scanner ss = new Scanner(System.in);
            System.out.print("entre height:");
            height = ss.nextDouble();
            width = ss.nextDouble();
        }

        abstract void compute_area();
    }

    abstract class rectangle extends shape {

        @Override
        void compute_area() {
            double area = this.height * this.width;
            System.out.print("Area of rectangle:" + area);

        }
    }

    abstract class triangle extends shape {

        @Override
        void compute_area() {
            double area = (1.0f/2.0f) * this.height * this.width;
            System.out.print("Area of rectangle:" + area);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    }

}
