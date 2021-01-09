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
public class FontEnddev {
        public String working_since;

    public String name;

    /**
     *
     */
    public int team_members;

    public String team_leader;

    //Constructor for FrontEndDev class.

    public FontEndDev(String name,int id,String email,int salary,String working_since,String project_name,int team_members,Boolean scrum,String team_leader) {

        /* super*/(name,id,email,salary,working_since,project_name,team_members,scrum);

        team_leader=team_leader;
        this.project_name=project_name;
        this.working_since=working_since;

    }

    public void printEmplomentYears(String working_since) {

        System.out.println("working_since: " +this.working_since);

    }

    public void assignProject(String project_name,int team_members,String front_end_framework) {
        System.out.println("Project Name: "+project_name+". \nTeam Members: "+team_members+". \nFront End Framework: "+front_end_framework);

    }

    public void printAssignedProject(){

        System.out.println("Project Assigned: " +this.project_name);

    }


    
}
    
    

