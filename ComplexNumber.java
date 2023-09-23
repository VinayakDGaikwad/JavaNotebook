
/**
 *
 * @author vdg
 */

public class ComplexNumber {
    double real, img;
    // Constructor
    ComplexNumber(double real, double img) {
        this.real = real;
        this.img = img;
    }
 
    public static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2) {
        ComplexNumber temp = new ComplexNumber(0,0);
        temp.real = c1.real + c2.real;
        temp.img = c1.img + c2.img;
 
        return temp;
    }
    public static void main(String args[]){
        ComplexNumber c1 = new ComplexNumber(5.5, 4);
        ComplexNumber c2 = new ComplexNumber(1.2, 3.5);
 
        System.out.println("Complex Number 1: "+ c1.real + " + i"+ c1.img);
        System.out.println("Complx Number 2: "+ c2.real + " + i"+ c2.img);
        
        ComplexNumber temp = sum(c1, c2);
        
        System.out.println(" Sum is "+ temp.real + " + " + temp.img + "i");
    }
}