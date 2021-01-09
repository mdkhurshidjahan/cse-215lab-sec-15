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
public class employee {
    public String name;

    public int id;

    public String email;

    public int salary;

    //Employees constructor as given in the class diagram.

    public employee(String name,int id,String email,int salary) {

        this.name = name;

        this.id=id;

        this.email=email;
        
        this.salary=salary;

    }

    //getname method for getting name

    public String getName() {

        return name;

    }

    //set method to store the name value

    public void setName(String name) {

        this.name = name;

    }

    //method to return id

    public int getId(){

        return id;

    }

    //method to set id

    public void setId(int id){

        this.id = id;

    }

    //method to return email

    public String getEmail() {

        return email;

    }

    //method to set email

    public void setEmail(String email) {

        this.email = email;

    }

    //verifying email using regex expression.

    public Boolean verifyEmail(String email) {

      int count1 = 0, count = 0;
        int pos = 0;
    //check the email if it is right or wrong
        for (int i = 0; i < email.length(); i++) 
        {

            if (email.charAt(i) == '@') 
            {
                count1++;
                pos = i;
            }
            if (email.charAt(i) == '.' && i > pos)
            {
                count++;
            }

        }
        if (count1 == 1 && count != 0)
        {
            return true;

        } 
        else 
        {
            return false;
        }

    }
    
    public double getSalary() {

        return salary;

    }
    
    public void setSalary(int salary){

        this.salary = salary;

    }


    //Printing status.

    public void printStatus() {
    

       
        System.out.println("Employee name is= "+name+"\n"+"Id:"+id+"\n"+"Email:"+email+"\n"+"salary:"+salary);
       
    }

}

  
