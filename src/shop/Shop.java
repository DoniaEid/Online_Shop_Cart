package shop;

import java.util.HashMap;
import java.util.Scanner;

public class Shop {

    public static void main(String[] args) {

        Cart c = new Cart();
        Scanner scanner = new Scanner(System.in);

        HashMap<Integer, String> menu = new HashMap<>();
        int i = 1;
        menu.put(i++, "iPhone 15, 1200.0");
        menu.put(i++, "AirPods Pro, 250.0");
        menu.put(i++, "MacBook Air, 1500.0");
        menu.put(i++, "Apple Watch, 400.0");
        menu.put(i++, "Gaming Mouse, 80.0");

        System.out.println("--- Store Menu ---");
        for (Integer key : menu.keySet()) {
            System.out.println(key + ". " + menu.get(key));
        }

        while (true) {
            System.out.println("\n1.View Cart | 2. Add | 3. Remove | 4 .Total price_product |5. Exit");
            System.out.print("Choice: ");
            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                c.view();
            } else if (choice.equals("2")) {
                System.out.print("Enter Product Number to add: ");
                int id = Integer.parseInt(scanner.nextLine());
                if (menu.containsKey(id)) {
                    c.add(menu.get(id));
                    System.out.println("Added!");
                } else {
                    System.out.println("Invalid ID!");
                }
            } else if (choice.equals("3")) {
                c.view();
                System.out.print("Enter Product Name to remove: ");
                String p = scanner.nextLine();

                String foundProduct = null;

                for (Integer key : menu.keySet()) {
                    if (menu.get(key).contains(p)) {
                        foundProduct = menu.get(key);
                        break;
                    }
                }

                if (foundProduct != null) {
                    c.remove(foundProduct);
                } else {
                    System.out.println("Product not found in store menu!");
                }
            } 
            else if (choice.equals("4")) {
                System.out.println("Total Price of product in Cart:"+c.getTotalPrice());
            } 
            else if (choice.equals("5")) {
                break;
            } 
            else {
                System.out.println("Invalid choice, try again.");
            }
        }
        System.out.println("Done!");

    }

}
