package com.mycompany.javanotebook;

class publication{
    public String title;
    private float price;
    private int quntity;
    
    public void setPrice(float price){
        this.price = price;
    }
    
    public void setQuantity(int quantity){
        this.quntity = quantity;
    }
    
    public float getPrice(){
        return this.price;
    }
    
    public int getQuantity(){
        return this.quntity;
    }
}

class book extends publication{
    String Author;
}

class magzine extends publication{
    
}


public class inheritance {
    public static void main(String[] args) {
        book B1 = new book();
        B1.title = "The Immortal of Mehula";
        B1.Author = "Amish";
        B1.setPrice(200);
        System.out.print(B1.getPrice());
    }
    
}
