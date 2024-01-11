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
public class Presidential extends Room{
    
    private double price;
        
    public Presidential(String roomNumber, String customer, char pack){
        super(roomNumber,customer);
        price = 120;
        food = new Food(pack);
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
    
    public char getPack(){
        if (!customer.equals("null")){
            System.out.print(food.getPack());
        }
        return food.getPack();
    }
    
    
    
}
