/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shop;

import java.util.HashMap;

class Cart {

    HashMap<String, double[]> cart = new HashMap<>();

    void add(String product) {
        String[] arr = product.split(",");

        if (cart.containsKey(arr[0])) {
            double[] item = cart.get(arr[0]);
            item[0] = Double.parseDouble(arr[1]);
            item[1]++;
            cart.replace(arr[0], item);
        } else {
            double[] item = new double[2];

            item[0] = Double.parseDouble(arr[1]);
            item[1] = 1;
            cart.put(arr[0], item);
        }

    }

    void remove(String product) {
        if (product == null) {
            return;
        }

        String[] arr = product.split(",");
        String name = arr[0].trim();
        if (cart.containsKey(name)) {
            double[] item = cart.get(name);
            item[1]--;

            if (item[1] <= 0) {
                cart.remove(name);
                System.out.println("Removed " + name + " from cart.");
            } else {
                cart.replace(name, item);
                System.out.println("Decreased " + name + " quantity to: " + (int) item[1]);
            }
        } else {
            System.out.println("Item not found in your cart!");
        }
    }

    void view() {
        if (cart.isEmpty()) {
            System.out.println("Shopping cart is empty.");
            return;
        }
        System.out.println("\n--- Shopping Cart View ---");

        for (String productName : cart.keySet()) {
            double[] details = cart.get(productName);

            double price = details[0];
            int quantity = (int) details[1];

            System.out.println("- Item: " + productName
                    + " | Price: " + price
                    + " | Quantity: " + quantity
                    + " | Total: " + (price * quantity));
        }

        System.out.println("--------------------------");
    }

    public double getTotalPrice() {
        double grandTotal = 0;

        for (double[] item : cart.values()) {
            double price = item[0];
            double quantity = item[1];

            grandTotal += (price * quantity);
        }

        return grandTotal;
    }
}
