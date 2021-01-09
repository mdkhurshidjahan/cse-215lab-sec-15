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
public class Backenddev {
     public String working_since;

    public String project_name;

    public int team_members;

    public Boolean scrum_master;

    public BackEndDev(String name,int id,String email,int salary,String working_since,String project_name,int team_members,Boolean scrum) {

        //Using super keywork to inherit name,salry,id from DBA class.

        super(name,id,email,salary,working_since,project_name,team_members);

        scrum_master = scrum;
        this.project_name=project_name;
        this.working_since=working_since;
    }

    public void printEmplomentYears(String working_since) {

        System.out.println("working_since: " +this.working_since);

    }

    public void assignProject(String project_name,int team_members,String server_side_framework) {

                System.out.println("Project Name: "+project_name+". \nTeam Members: "+team_members+". \nServer Side Framework: " +server_side_framework);

    }

    public void printAssignedProject() {

       System.out.println("Project Assigned: " +this.project_name);

    }

}


    

