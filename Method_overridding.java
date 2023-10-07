public class Method_overridding {
    // Method overriding is "runtime polymorphism"
    // Signature remains the same in child

    public static void main(String[] args) {
        // Upcasting
        //While compiling the left part of object is checked.
        //It gets to know that object of A is created.
        //While running the code right part "new B();" is seen so f2() function of B class gets printed instead of A class f2() function.
        A obj = new B();
        obj.f1();
        obj.f2();

         A obj1 = new A();
         obj1.();
    }
}

class A {
    public void f1() {
        System.out.print('A');
        f2();
    }

    public void f2() {
        System.out.println("B");
    }
}

class B extends A {
    public void f2()
    {
        System.out.println("C");
    }
}