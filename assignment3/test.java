/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_3;

/**
 *
 * @author Admin
 */
public class test {
    public static void main(String args[]) {

        Employees emp=new Employees("Md.Khurshhid jahan",1922078042,"khurshid.jahan@northsouth.edu",90000); 
        emp.printStatus();
        
        
        //DBA
        DBA dba=new DBA("Rabbi",1921706642, "rabbi@gmail.com", 56000,"2000"," Online teaching",10);
        dba.printStatus();
        dba.assignProject("Online Teaching",10,"GraphQL");
        dba.printEmployeeYears("2020");
        dba.printAssignedProject();
        
        
        //BackEndDev
        BackEndDev back= new BackEndDev("Anondo",1922079, "nabajit@gmail.com",400000,"2002", "Online pet managment",20,false);
        back.printStatus();
        back.assignProject("Online pet managment", 20, "PHP ");
        back.printEmplomentYears("2020");
        back.printAssignedProject();
        
        //FrontEndDev
        FontEndDev front= new FontEndDev("coco",1931535042,"rb@gmail.com",55000,"1998","Online project managment",30,true,"joe");
        front.printStatus();
        front.assignProject("Online project managment",30, "jQuery");
      
        
        front.printEmplomentYears("2000");
        front.printAssignedProject();


    }
    
    
}


    
}
