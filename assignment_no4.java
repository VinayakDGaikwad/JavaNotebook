
import java.util.Scanner;

 abstract class shape {

    double height;
    double width;

    void input() {
        Scanner ss = new Scanner(System.in);
        System.out.print("entre height:");
        height = ss.nextDouble();
        System.out.print("entre width:");
        width = ss.nextDouble();
    }

    abstract void compute_area();
}

 class rectangle extends shape {

    @Override
    void compute_area() {
        double area = this.height * this.width;
        System.out.print("Area of rectangle:" + area);

    }
}

 class triangle extends shape {

    @Override
    void compute_area() {
        double area = (1.0f / 2.0f) * this.height * this.width;
        System.out.print("Area of rectangle:" + area);
    }
 }

public class assignment_no4 {

    public static void main(String[] args) {
        // TODO code application logic here
        shape S;
        
        rectangle R = new rectangle();
        S = R;
        S.input();
        S.compute_area();
        
        triangle T = new triangle();
        S=T;
        T.input();
        T.compute_area();
        

    }

}
