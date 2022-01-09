package com.mycompany.mavenproject1;

class employee{
    String name;
    String email;
    String address;
    double mobile_no;    

    void printSalary(){
        
        System.out.print("##########payslip");
        System.out.print("Name: " + name);
        System.out.print("Name: " + name);
        System.out.print("Name: " + name);
       
    }

}
class programmer extends employee{
    float basic_pay;
    
    void setBasicPay(String name, float value){
        this.name = name;
        this.basic_pay = value;
    }    
}

class team_lead extends employee{
    float basic_pay;
    team_lead(String name, int basic_pay){
        this.name = name;
        this.basic_pay = basic_pay;
    }
}

class project_maneger extends employee{
    float basic_pay;
    project_maneger(String name, int basic_pay){
        this.name = name;
        this.basic_pay = basic_pay;
    }
}


class assistant_project_maneger extends employee{
    float basic_pay;
    assistant_project_maneger(String name, int basic_pay){
        this.name = name;
        this.basic_pay = basic_pay;
    }
}


public class mainClass {

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}