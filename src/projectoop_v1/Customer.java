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
public class Customer implements User{
    
    String name;
    int age;
    String icNum;
    String pNum;
    String address;
    String idCust;
    int days; 
    String checkIn; 
    String checkOut;
    Receipt receipt;
          
    public Customer (String name, int age, String icNum, String pNum, String address, String checkIn, String checkOut){
        this.name = name;
        idCust = "";
        days = 0;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
//        receipt = new Receipt(checkIn, checkOut, getDays(), ;
    }
   
    

    /**
     * @return the name
     */
    @Override
    public String getName(){ 
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the icNum
     */
    @Override
    public String getIcNum() {
        return icNum;
    }

    /**
     * @param icNum the icNum to set
     */
    public void setIcNum(String icNum) {
        this.icNum = icNum;
    }

    /**
     * @return the pNum
     */
    @Override
    public String getpNum() {
        return pNum;
    }

    /**
     * @param pNum the pNum to set
     */
    public void setpNum(String pNum) {
        this.pNum = pNum;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }
    
    public void erase(){
        setName("null");
        setAge(0);
        setIcNum("null");
        setpNum("null");
        setAddress("null");
        idCust = "";
        days = 0;
        checkIn = "null";
        checkOut = "null";        
    }
    
    public void custDetail(){
        System.out.print("  ||  " + checkIn + "  ||  " + checkOut + "\n");
    }

    /**
     * @return the idCust
     */
    @Override
    public String getIdNum() {
        return idNum;
    }

    /**
     */
    @Override
    public void setIdNum() {
        String id = getIcNum();
        idCust = "C" + id.substring(8, 12); 
    }

    /**
     * @return the days
     */
    public int getDays() {
        String inDate = getCheckIn();
        int in = Integer.parseInt(inDate.substring(0,2));
        String outDate = getCheckOut();
        int out = Integer.parseInt(outDate.substring(0,2));
        days = out - in;
        return days;
    }

    /**
     * @param days the days to set
     */
    public int setDays() {
        String inDate = getCheckIn();
        int in = Integer.parseInt(inDate.substring(0,2));
        String outDate = getCheckOut();
        int out = Integer.parseInt(outDate.substring(0,2));
        days = out - in;
        
        return days;
    }

    /**
     * @return the checkIn
     */
    public String getCheckIn() {
        return checkIn;
    }

    /**
     * @param checkIn the checkIn to set
     */
    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    /**
     * @return the checkOut
     */
    public String getCheckOut() {
        return checkOut;
    }

    /**
     * @param checkOut the checkOut to set
     */
    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }
    
    
    
}
