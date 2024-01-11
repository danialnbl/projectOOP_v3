/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectoop_v1;
import java.util.Scanner;   

/**
 *
 * @author LENOVO
 */
public class Food {
    
    private char pack;
    private double price;
    Scanner input = new Scanner(System.in);

    public Food(char pack){
        this.pack = pack;
        setPrice(pack);
    }
    
    public Food(char pack, double price){
        this.pack = pack;
        this.price = price;
    }

    public void packList(){
        System.out.println("List of Food Package\n");
        System.out.println("A. Breakfast - Lunch - Dinner\n");
        System.out.println("B. Breakfast - Lunch\n");
        System.out.println("C. Breakfast\n");
        System.out.println("Which package? [A/B/C]: ");
        setPack(input.next().charAt(0));
    }
    
    /**
     * @return the pack
     */
//    public String getPack() {
//        String set = Character.toString(pack);
//        return set;
//    }
//    
    public char getPack() {
        return pack;
    }

    /**
     * @param pack the pack to set
     */
    public void setPack(char pack) {
        this.pack = pack;
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
    public double setPrice(char pack) {
        switch (pack){
            case 'A':
                price = 100.3;
                break;
            case 'B':
                price = 60.8;
                break;
            case 'C':
                price = 30.5;
                break;
            default:
                price = 0;
                break;
        }
        return price;
    }
}