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
public class Single extends Room{
    
    private double price;
        
    public Single(String roomNumber, String customer){
        super(roomNumber,customer);
        price = 90;
    }
    
    public Single(String roomNumber, Food food, String customer){
        super(roomNumber,customer);
        this.food = food;
        price = 90;
    }
    
    public void getPack(){
        if (!customer.equals("null") && food != null){
            System.out.print(food.getPack() + " || ");
        }
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }
    
    
    
}
