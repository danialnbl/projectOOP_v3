/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectoop_v1;
import java.util.Date;
import java.util.Scanner;  

/**
 *
 * @author LENOVO
 */
public class ProjectOOP_v1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
                
        Scanner input = new Scanner(System.in);
        User [] cust = new Customer[140]; //20 rooms * 7 days
        User [] emp = new Employee[20];
        Room [] room = new Room[20];
        Receipt [] receipt = new Receipt[20];
        
        for (int j = 0; j < 140; j++){
            cust[j] = new Customer("null", 0, "null", "null", "null", "null", "null");
        }
        
        //rooms in hotel (10 single, 10 presidential)
        room[0] = new Single("S01","null");
        room[1] = new Single("S02","null");
        room[2] = new Single("S03","null");
        room[3] = new Single("S04","null");
        room[4] = new Single("S05","null");
        room[5] = new Single("S06","null");
        room[6] = new Single("S07","null");
        room[7] = new Single("S08","null");
        room[8] = new Single("S09","null");
        room[9] = new Single("S10","null");
        room[10] = new Presidential("P01","null",'\0');
        room[11] = new Presidential("P02","null",'\0');
        room[12] = new Presidential("P03","null",'\0');
        room[13] = new Presidential("P04","null",'\0');
        room[14] = new Presidential("P05","null",'\0');
        room[15] = new Presidential("P06","null",'\0');
        room[16] = new Presidential("P07","null",'\0');
        room[17] = new Presidential("P08","null",'\0');
        room[18] = new Presidential("P09","null",'\0');
        room[19] = new Presidential("P10","null",'\0');
              
        int i = 0;
        int a = 0;
        while (a == 0){
            //determine user type
            System.out.print("Enter user type [0-User/1-Employee]:  ");
            int userType = input.nextInt();
            
            UserFactory factoryObj=new UserFactory();
            
            User obj1=factoryObj.getInput("");

            if (userType == 1){ //Employee
//                System.out.print("Your name: ");
//                String name = input.next();
//                System.out.print("Your age: ");
//                int age = input.nextInt();
//                System.out.print("Your IC number: ");
//                String icNum = input.next();
//                System.out.print("Your phone number: ");
//                String pNum = input.next();
//                System.out.print("Your address: ");
//                String address = input.next();
//
//                emp[i] = new Employee(name, age, icNum, pNum, address);

                boolean exit = false;
                while (!exit){
                    System.out.println("        << Menu >>");
                    System.out.println("1. Customer List");
                    System.out.println("2. Search Customer Info");
                    System.out.println("3. Remove Customer");
                    System.out.println("4. Exit");

                    System.out.print("Enter your choice: ");
                    int choice = input.nextInt();

                    switch (choice) {
                        case 1: //list of room and cust
                            System.out.println("            <<List of Room>>");
                            System.out.println("---------------Single Room--------------------");
                            for (int j = 0; j < 10; j++){
                                System.out.print((j+1) + ". ");
                                room[j].roomDetail();
                                if (!(room[j].getCustomer()).equals("null")){
                                    if ((room[j].food) != null){
                                        System.out.print(room[j].food.getPack());
                                    }  else if ((room[j].food) == null){
                                        System.out.print("-");
                                    }
                                    for (int k = 0; k < 140; k++){
                                        if ((cust[k].getName()).equals(room[j].getCustomer())){
                                            ((Customer) cust[k]).custDetail();
//                                            cust[k].custDetail();
                                            k = 140;
                                        }
                                    }
                                }
                            }
                            System.out.println("----------------------------------------------\n");
                            System.out.println("---------------Presidential Room--------------");
                            for (int j = 10; j < 20; j++){
                                System.out.print((j+1) + ". ");
                                room[j].roomDetail();
                                ((Presidential)room[j]).getPack();
                                if (!(room[j].getCustomer()).equals("null")){
                                    for (int k = 0; k < 140; k++){
                                        if ((cust[k].getName()).equals(room[j].getCustomer())){
                                            ((Customer) cust[k]).custDetail();
//                                            cust[k].custDetail();
                                            k = 140;
                                        }
                                    }
                                }
                            }
                            System.out.println("----------------------------------------------\n");
                            break;
                        case 2:
                            System.out.print("Search customer name: ");
                            String search = input.next();
                            for (int j = 0; j < 140; j++){
                                if (search.equals(cust[j].getName())){
                                    System.out.print("------------------Customer Info---------------\n");
                                    System.out.print(cust[j].getName() + " || " + cust[j].getpNum() + "\n");
                                    System.out.print(((Customer) cust[j]).getCheckIn() + " || " + ((Customer) cust[j]).getCheckOut() + "\n");
                                    for (int k = 0; k < 20; k++){
                                        if ((room[k].getCustomer()).equals(search)){
                                            String roomNum = room[k].getRoomNumber();
                                            System.out.print(roomNum);
                                            if (room[k].food != null){
                                                System.out.print(" || " + room[k].food.getPack() + "\n");
                                            } else {
                                                System.out.print(" || No food package\n" );
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case 3:
                            System.out.print("Remove customer name: ");
                            String remove = input.next();
                            for (int j = 0; j < 140; j++){
                                if (remove.equals(cust[j].getName())){
                                    System.out.print("-----------------Remove Customer--------------\n");
                                    ((Customer)cust[j]).erase();
                                    for (int k = 0; k < 20; k++){
                                        if ((room[k].getCustomer()).equals(remove)){
                                            room[k].checkOut(room[k].food);  
                                        }
                                    }
                                }
                            }
                            System.out.println(remove + " successfully remove");
                            break;
                        case 4:
                            exit = true;
                            System.out.println("Thank you, goodbye!");
                            break;
                        default:
                            System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                            break;
                    }
                }
                i++;
            } else if (userType == 0){ //customer
                System.out.print("Your name: ");
                String name = input.next();
                System.out.print("Your age: ");
                int age = input.nextInt();
                System.out.print("Your IC number: ");
                String icNum = input.next();
                System.out.print("Your phone number: ");
                String pNum = input.next();
                System.out.print("Your address: ");
                String address = input.next();
                System.out.print("Enter Check-in date (dd/mm/yyyy): ");
                String in = input.next();
                System.out.print("Enter Check-out date (dd/mm/yyyy): ");
                String out = input.next();
                cust[i] = new Customer(name, age, icNum, pNum, address, in, out);
                
                
                
                Customer custO = (Customer)cust[i];
                
                custO.setDays();
                
                System.out.print("How many rooms: ");
                int count = input.nextInt();
                receipt[i] = new Receipt((Customer)cust[i],count);
                int j = 0;
                while (j < count){
                    System.out.print("What room type? [0-Single/1-Presidential]: ");
                    int type = input.nextInt();
                    if (type == 0){
                        System.out.print("Do you want food package? [0-Yes/1-No]: ");
                        int pack = input.nextInt();
                        
                        for (int k = 0; k < 10; k++){
                            if ((room[k].getStatus()).equals("Available")){
                                String roomNum = room[k].getRoomNumber();
                                
                                if (pack == 0){
                                    System.out.println("List of Food Package\n");
                                    System.out.println("A. Breakfast - Lunch - Dinner\n");
                                    System.out.println("B. Breakfast - Lunch\n");
                                    System.out.println("C. Breakfast\n");
                                    System.out.print("Which package? [A/B/C]: ");
                                    char set = input.next().charAt(0);
                                    Food food = new Food(set);
                                    room[k] = new Single(roomNum, food, cust[i].getName());
                                } else {
                                    Food food = new Food('D'); //bil
                                    room[k] = new Single(roomNum, food, cust[i].getName()); //bil
                                }
                                room[k].setStatus("Occupied ");
                                receipt[i].setRoomBooked(room[k],j);
                                k = 11;
                            }
                        }
                    } else if (type == 1){
                        System.out.println("List of Food Package\n");
                        System.out.println("A. Breakfast - Lunch - Dinner\n");
                        System.out.println("B. Breakfast - Lunch\n");
                        System.out.println("C. Breakfast\n");
                        System.out.print("Which package? [A/B/C]: ");
                        char set = input.next().charAt(0);
                        for (int k = 10; k < 20; k++){
                            if ((room[k].getStatus()).equals("Available")){
                                String roomNum = room[k].getRoomNumber();
                                
                                room[k] = new Presidential(roomNum, cust[i].getName(), set);
                                room[k].setStatus("Occupied ");
                                receipt[i].setRoomBooked(room[k],j);
                                k = 21;
                            }
                        }
                    }
                    //receipt[i].calculatePrice();
                    receipt[i].printReceipt();
                    j++;                    
                }
                i++;
            } else { //wrong input
                System.out.println("Invalid input ! Please enter a valid input.");
            }
            
            System.out.print("Continue? [0-Yes/1-No]:  ");
            a = input.nextInt();
            
        }
    }
    
//    private static void listCustomer(){
//        
//                    
//    }
}

