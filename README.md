# 🛒 Java Console Shopping Cart System

A lightweight, console-based e-commerce simulation built with **Java**. This project demonstrates the efficient use of **HashMaps** for data management, string parsing, and interactive user input handling.

## 🌟 Features
- **Dynamic Store Menu:** Displays available products with unique IDs, names, and prices.
- **Add by ID:** Users can add products to their cart simply by entering the product's ID.
- **Smart Removal:** Supports removing items by searching for the product name (case-insensitive).
- **Quantity Tracking:** Automatically increments or decrements item quantities within the cart.
- **Live Total Calculation:** Calculates the grand total price of all items in the cart in real-time.
- **Robust Error Handling:** Manages invalid inputs and prevents crashes using `try-catch` and input validation.

## 🛠️ Technologies & Concepts
* **Language:** Java 17+
* **Data Structures:** * `HashMap<Integer, String>` for the Store Menu.
    * `HashMap<String, double[]>` for the Shopping Cart (Mapping names to price and quantity).
* **Input Handling:** `Scanner` class with `nextLine()` for clean buffer management.
* **String Manipulation:** `split()`, `trim()`, and `toLowerCase()` for data parsing.

## 🚀 How to Run
1. **Clone the repository:**
   ```bash
   git clone [https://github.com/your-username/online-shopping-cart.git](https://github.com/your-username/online-shopping-cart.git)
