package com.mycompany.javanotebook;

class employe{
    public String name;
    public float salary;
}

class programer extends employe{
    int bonus = 1000;
    
}

public class plymorphism {
    public static void main(String[] args) {
        employe ep1 = new employe();
        ep1.name = "MANGESH";
        
        System.out.print(ep1.name);
    }
    
}
