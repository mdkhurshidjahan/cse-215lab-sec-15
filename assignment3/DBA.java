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
public class DBA {
     public String working_since;

    public String project_name;

    public int team_members;
   

    //Constructor for DBA class.

    public DBA(String name,int id,String email,int salary, String working_since,String project_name,int team_members) {

        super(name,id,email,salary);

        this.working_since = working_since;
        this.project_name= project_name;
        this.team_members=team_members;

    }
    //printing employee years.

    public void printEmployeeYears(String working_since) {

        
        System.out.println("Working Since: " +working_since);

    }

    public void assignProject(String project_name,int team_members,String query_language) {
        

        System.out.println("Project Name: "+project_name+". \nTeam Members: "+team_members+". \nQuery Language: " +query_language);

    }

    public void printAssignedProject() {

        System.out.println("Project Assigned:  " +this.project_name);
        

    }



    
}

    

