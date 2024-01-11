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
public abstract class Room {
    
    protected String roomNumber;
    protected String status;
    protected String customer;
    protected Food food;
        
    public Room(String roomNumber, String customer){
        this.roomNumber = roomNumber;
        this.customer = customer;
        status = "Available";
        food = null;
    }
    
    public Room(String roomNumber, Food food, String customer){
        this.roomNumber = roomNumber;
        this.customer = customer;
        status = "Available";
        this.food = food;
    }
    
    
    
    public void roomDetail(){
        if (customer.equals("null")){
            System.out.print(roomNumber + "  ||  " + status + "\n");
        } else {
            System.out.print(roomNumber + "  ||  " + status + "  ||  " + 
                getCustomer() + "  ||  ");
        }
    }
    
    public void roomPackage(){
        
    }
    
    public void checkOut(Food food){
        customer = "null";
        status = "Available";
        if (food != null){
            food.setPack('\0');
            food.setPrice('\0');
        }
    }

    /**
     * @return the roomNumber
     */
    public String getRoomNumber() {
        return roomNumber + "\t";
    }

    /**
     * @param roomNumber the roomNumber to set
     */
    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the customer
     */
    public String getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }
    
    abstract double getPrice();
    

    
    
    
}
