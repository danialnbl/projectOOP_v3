/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectoop_v1;

import java.time.LocalDate;


/**
 *
 * @author NABIL
 */
public class Receipt {
    
    protected LocalDate receiptDate;
    private double totalPrice;
    private Customer customer;
    protected Room[] roomBooked;
    private int rooms;

    public Receipt(Customer customer, int rooms) {
        receiptDate = LocalDate.now();
        totalPrice = 0;
        this.rooms = rooms;
        roomBooked = new Room[this.rooms];
        for (int i = 0; i < this.rooms; i++){
            roomBooked[i] = null;
        }
        this.customer = customer;
    }
    
    
    
    public double calculatePrice(){
        double test = 0;
        for (int i = 0; i < roomBooked.length; i++){
            if (roomBooked[i].getFood() == null){
                test = test + roomBooked[i].getPrice();
            } else {
                test = test+ roomBooked[i].getPrice() + roomBooked[i].food.getPrice();
            }
        }
        totalPrice =  test ;
        return totalPrice;
    }
    
    public void printReceipt(){
         totalPrice = calculatePrice();
        System.out.print("\n=====RECEIPT=====\n"
                + "Receipt Date : " + receiptDate + "\n"
                + "Room : ");
        for (int i = 0; i < roomBooked.length; i++){
            System.out.print(roomBooked[i].getRoomNumber() + "\t");
        }
        System.out.println("\n"
                + "=====Booker=====\n"
                + "Booker Name : " + customer.getName() + "\n"
                + "Check In Date : " + customer.getCheckIn() + "\n"
                + "Check Out Date : " + customer.getCheckOut() + "\n"
                + "Total Price : " + totalPrice +"\n"
                + "Total Days : " + customer.getDays() +"\n"
                );
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }


    public LocalDate getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(LocalDate receiptDate) {
        this.receiptDate = receiptDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Room getRoomBooked() {
        return roomBooked[rooms];
    }
    
    public void setRoomBooked(Room roomBooked, int rooms) {

        this.roomBooked[rooms] = roomBooked;
    }

    /**
     * @return the rooms
     */
    public int getRooms() {
        return rooms;
    }

    /**
     * @param rooms the rooms to set
     */
    public void setRooms(int rooms) {
        this.rooms = rooms;
        this.roomBooked = new Room[this.rooms];
    }
    
    
    
}
