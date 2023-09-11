package com.mycompany.javanotebook;

class employee {

    String Emp_name;
    String Emp_id;
    String Emp_email;
    String Emp_Address;
    double mobile_no;
}

//class programmer inherits employee class
class programmer extends employee {

    private float basic_pay;
    private float DA;
    private float HRA;
    private float PF;
    private float Staff_fund_club;

    programmer(String name, float value, String id, String email, String adr, double mobile) {
        this.Emp_name = name;
        this.basic_pay = value;
        this.DA = (97 * this.basic_pay) / 100;
        this.HRA = (10 * this.basic_pay) / 100;
        this.PF = (12 * this.basic_pay) / 100;
        this.Staff_fund_club = (float) ((0.1 * this.basic_pay) / 100);
    }

    void PrintPaySlip() {

        System.out.println("##########Payslip###########");
        System.out.println("Name: " + Emp_name);
        System.out.println("ID: " + Emp_id);
        System.out.println("Address: " + Emp_Address);
        System.out.println("Mobile: " + mobile_no);
        System.out.println("Basic Pay: " + basic_pay);
        System.out.println("DA: " + DA);
        System.out.println("HRA: " + HRA);
        System.out.println("PF: " + PF);
        System.out.println("Staff Fund Club: " + Staff_fund_club);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    }
}

//class team_lead inherits clas empoyee
class team_lead extends employee {

    private float basic_pay;
    private float DA;
    private float HRA;
    private float PF;
    private float Staff_fund_club;

    team_lead(String name, int basic_pay,String id, String email, String adr, double mobile) {
        this.Emp_name = name;
        this.basic_pay = basic_pay;
        this.DA = (97 * this.basic_pay) / 100;
        this.HRA = (10 * this.basic_pay) / 100;
        this.PF = (12 * this.basic_pay) / 100;
        this.Staff_fund_club = (float) ((0.1 * this.basic_pay) / 100);
    }
    
    void PrintPaySlip() {

        System.out.println("##########Payslip###########");
        System.out.println("Name: " + Emp_name);
        System.out.println("ID: " + Emp_id);
        System.out.println("Address: " + Emp_Address);
        System.out.println("Mobile: " + mobile_no);
        System.out.println("Basic Pay: " + basic_pay);
        System.out.println("DA: " + DA);
        System.out.println("HRA: " + HRA);
        System.out.println("PF: " + PF);
        System.out.println("Staff Fund Club: " + Staff_fund_club);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    }
}

//class project_maneger inherits employee
class project_maneger extends employee {

    private float basic_pay;
    private float DA;
    private float HRA;
    private float PF;
    private float Staff_fund_club;

       project_maneger(String name, int basic_pay,String id, String email, String adr, double mobile) {
        this.Emp_name = name;
        this.basic_pay = basic_pay;
        this.DA = (97 * this.basic_pay) / 100;
        this.HRA = (10 * this.basic_pay) / 100;
        this.PF = (12 * this.basic_pay) / 100;
        this.Staff_fund_club = (float) ((0.1 * this.basic_pay) / 100);
    }
    
    void PrintPaySlip() {

        System.out.println("##########Payslip###########");
        System.out.println("Name: " + Emp_name);
        System.out.println("ID: " + Emp_id);
        System.out.println("Address: " + Emp_Address);
        System.out.println("Mobile: " + mobile_no);
        System.out.println("Basic Pay: " + basic_pay);
        System.out.println("DA: " + DA);
        System.out.println("HRA: " + HRA);
        System.out.println("PF: " + PF);
        System.out.println("Staff Fund Club: " + Staff_fund_club);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    }
}

//assistant_project_maneger inherits employee
class assistant_project_maneger extends employee {

    private float basic_pay;
    private float DA;
    private float HRA;
    private float PF;
    private float Staff_fund_club;

    assistant_project_maneger(String name, int basic_pay,String id, String email, String adr, double mobile) {
        this.Emp_name = name;
        this.basic_pay = basic_pay;
        this.DA = (97 * this.basic_pay) / 100;
        this.HRA = (10 * this.basic_pay) / 100;
        this.PF = (12 * this.basic_pay) / 100;
        this.Staff_fund_club = (float) ((0.1 * this.basic_pay) / 100);
    }
    
    void PrintPaySlip() {

        System.out.println("##########Payslip###########");
        System.out.println("Name: " + Emp_name);
        System.out.println("ID: " + Emp_id);
        System.out.println("Address: " + Emp_Address);
        System.out.println("Mobile: " + mobile_no);
        System.out.println("Basic Pay: " + basic_pay);
        System.out.println("DA: " + DA);
        System.out.println("HRA: " + HRA);
        System.out.println("PF: " + PF);
        System.out.println("Staff Fund Club: " + Staff_fund_club);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    }
}

public class assignment_3 {

    public static void main(String[] args) {
        programmer p1;
        p1 = new programmer("Vinayak", 2000, "VINA32", "vd.h@gmail.com", "PUNE", 895623233);
        p1.PrintPaySlip();
        
        team_lead t1;
        t1 = new team_lead("Ajay", 3000, "AJAY43", "vd.f@gami.com", "Auragabad", 465656262);
        t1.PrintPaySlip();
        
        project_maneger pm1;
        pm1 = new project_maneger("Snajana", 5000, "SANJ21", "vin.f@outlook.com", "Karad", 451289631);
        pm1.PrintPaySlip();
        
        assistant_project_maneger apm1;
        apm1 = new assistant_project_maneger("Dilip", 6000, "DIL65", "vd.f@outlook.vom", "BARAMTI", 452126354);
        apm1.PrintPaySlip();
        
    }

}
