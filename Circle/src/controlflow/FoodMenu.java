package controlflow;
import java.util.Scanner;
public class FoodMenu {
	public double subTotal;
    public static double runningTotal;
    private static double itemPrice;
    static boolean ordering = true;
    static Scanner input = new Scanner(System.in);

    public static void menu() {
        System.out.println("Welcome \n1. Burger (Rs 100) \n2. Fries (Rs 150)\n3. Soda (Rs 30) \n4. Chips (Rs 10) \n5. Samosa (Rs 15) \n6. Kachori (Rs 20) \n7. Biriyani (Rs 180) \n8. Fried Rice (Rs 120) \n9. Fruit Salad (Rs 50) \n10. Bill/Done");
    
    System.out.println("Enter your choice");
    }
    public static double itemPrice(int foodItem) {
        if (foodItem == 1) {
            
            System.out.println("You've ordered a burger");
            itemPrice = 100;
        }
        if (foodItem == 2) {
          
            System.out.println("You've ordered fries");
            itemPrice = 150;
        }
        if (foodItem == 3) {
            
            System.out.println("You've ordered a soda");
            itemPrice = 30;
        }
        if (foodItem == 4) {
            
            System.out.println("You've ordered a chips");
            itemPrice = 10;
        }
        if (foodItem == 5) {
            
            System.out.println("You've ordered a samosa");
            itemPrice = 15;
        }
        if (foodItem == 6) {
            
            System.out.println("You've ordered a Kachori");
            itemPrice = 20;
        }
       if (foodItem == 7) {
            
            System.out.println("You've ordered a Biriyani");
            itemPrice = 180;
        }
       if (foodItem == 8) {
           
           System.out.println("You've ordered a Fried Rice");
           itemPrice = 120;
       }
       if (foodItem == 9) {
           
           System.out.println("You've ordered a Fruit Salad");
           itemPrice = 50;
       }
        quantity();
        return itemPrice;
    }
    public static double quantity() {
        System.out.println("Enter quantity");
        double quantity = input.nextDouble();
        subTotal(quantity, itemPrice);
        return quantity;
    }

    public static double subTotal(double quantity, double itemPrice) {
    	    double subTotal = quantity*itemPrice;
    	    System.out.println("Subtotal: "+ subTotal);
    	    runningTotal += subTotal;
    	    return subTotal;
    }

    public static void done(double runningTotal) {
        ordering = false;
        System.out.println(runningTotal);
        System.out.println("Enjoy your meal");
    }

	public static void main(String[] args) {
		
		int menuOption;
        int foodItem = 0;
        input = new Scanner(System.in);
        do {
            double runningTotal = 0;
            menu();
            menuOption = input.nextInt();
            switch (menuOption) {
            case 1:
                foodItem = 1;
                runningTotal += itemPrice(foodItem);
                break;
            case 2:
                foodItem = 2;
                runningTotal += itemPrice(foodItem);
                break;
            case 3:
                foodItem = 3;
                runningTotal += itemPrice(foodItem);
                break;
            case 4:
            	foodItem = 4;
            	runningTotal += itemPrice(foodItem);
                break;
            case 5:
            	foodItem = 5;
            	runningTotal += itemPrice(foodItem);
                break;
            case 6:
            	foodItem = 6;
            	runningTotal += itemPrice(foodItem);
                break; 
            case 7:
            	foodItem = 7;
            	runningTotal += itemPrice(foodItem);
                break;
            case 8:
            	foodItem = 8;
            	runningTotal += itemPrice(foodItem);
                break;
            case 9:
            	foodItem = 9;
            	runningTotal += itemPrice(foodItem);
                break;
            case 10:
                done(runningTotal);
                break;
            default:
                System.out.println("Invalid option.");
            }
        } while (ordering);
        {
            //subTotal(quantity(), itemPrice(foodItem));
            //runningTotal = runningTotal + subTotal(quantity(), itemPrice(foodItem));
            System.out.println("Total amount: " + runningTotal);
        }
		
 }
}
