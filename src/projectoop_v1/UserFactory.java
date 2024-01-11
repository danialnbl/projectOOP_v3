/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectoop_v1;

/**
 *
 * @author FIKRI DIN
 */
public class UserFactory {
    public User getInput(String type){
        User obj1=null;
        
        if(type.toLowerCase().equals("customer")){
            obj1=new Customer("",0,"","","","","");
        }
        else if(type.toLowerCase().equals("employee")){
            obj1=new Employee("",0,"","","");
        }
        return obj1;
    }
}
