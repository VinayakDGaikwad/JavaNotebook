package com.mycompany.javanotebook;

interface vehicle {
    void changeGear(int a);
    void speedUP(int a);
    void applyBrakes(int a);
}

 class bicycle implements vehicle{
     public void changeGear(int a){
        System.out.print("Changed Gear to" +a);
    }
    
    public void speedUP(int a){
        System.out.print("Speed incresed by:" + a + "kmph");
    }
    
    public void applyBrakes(int a){
        System.out.print(a + "% brakes applied.");
    }

}

 class bike implements vehicle{
    @Override
    public void changeGear(int a){
        System.out.print("  Changed Gear to" +a);
    }
    
    public void speedUP(int a){
        System.out.print("  Speed incresed by:" + a + "kmph   ");
    }
    
    public void applyBrakes(int a){
        System.out.print(a + "% brakes applied.  ");
    }
}

class car implements vehicle{
    @Override
    public void changeGear(int a){
        System.out.print("  Changed Gear to" +a);
    }
    
    public void speedUP(int a){
        System.out.print("  Speed incresed by:" + a + "kmph   ");
    }
    
    public void applyBrakes(int a){
        System.out.print(a + "% brakes applied.  ");
    }
}

public class assignment_5 {


    public static void main(String[] args) {
        // TODO code application logic here
   
        vehicle v;    //reference vehicle
        v = new bike();
        v.changeGear(2);
        v.speedUP(20);
        v.applyBrakes(52);
    
        v = new car();
        v.changeGear(2);
        v.speedUP(20);
        v.applyBrakes(52);
        
        v= new bicycle();
        v.changeGear(2);
        v.speedUP(20);
        v.applyBrakes(52);
    
    
    }
    
}
