/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectoop_v1;

/**
 *
 * @author LENOVO
 */
public class Employee implements User{
    
    String idNum;
    String name;
    String pNum;
        
    public Employee(String name, int age, String icNum, String pNum, String address){
        name="";
        idNum = "";
        this.pNum=pNum;
    }

    @Override
    public String getName(){
        return name;
    }
    
    public void setName(String name){
    this.name=name;
    }

    /**
     * @return the idNum
     */
    @Override
    public String getIcNum(){
        return icNum;
    }
    @Override
    public String getIdNum() {
        return idNum;
    }
    
    @Override
    public String getpNum(){
        return pNum;
    }

    /**
     */
    @Override
    public void setIdNum() {
        String id = getIcNum();
        idNum = "E" + id.substring(8, 12); 
    }
    
    
    
}
