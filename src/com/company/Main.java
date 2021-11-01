package com.company;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        double price = 0.0;
        boolean valid = true;
        String pizzaSize ="";
        while (valid == true){
            try {
                System.out.println("pizza size:");
                 pizzaSize = input.next();
            }
            catch(Exception e){
                System.out.println("not a string"+e);
                input.next();
            }
            if (pizzaSize.equals("small")){
                price =7.99;
                valid = false;
            }
            if (pizzaSize.equals("median")){
                price =10.99;
                valid = false;
            }
            if (pizzaSize.equals("large")){
                price =13.99;
                valid = false;
            }
        }

        ArrayList<String> toppings = new ArrayList<>();
        String topping = "";
        int count = 0;
        while (true){
            valid = true;
            while (valid == true) {
                try {
                    System.out.println("topping:");
                    topping = input.next();
                } catch (Exception e) {
                    System.out.println("not a string" + e);
                    input.next();
                }
            }
            if (topping .equals("end")){
                break;
            }
            count++;
            toppings.add(topping);
        }
        price=price+1.25*count;
        System.out.println("pizza toppings:");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println(toppings.get(1));

        }
    }
}
