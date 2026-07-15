import java.util.ArrayList;

class CartItem {
    String itemName;
    double price;
    int quantity;

    // Constructor
    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to calculate cost of this item
    double getCost() {
        return price * quantity;
    }
}

public class ShoppingCart {
    ArrayList<CartItem> cart = new ArrayList<>();

    // Add item
    void addItem(String itemName, double price, int quantity) {
        CartItem item = new CartItem(itemName, price, quantity);
        cart.add(item);
        System.out.println(itemName + " added to cart.");
    }

    // Remove item by name
    void removeItem(String itemName) {
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).itemName.equals(itemName)) {
                cart.remove(i);
                System.out.println(itemName + " removed from cart.");
                return;
            }
        }
        System.out.println(itemName + " not found in cart.");
    }

    // Display total cost
    void displayTotalCost() {
        double total = 0;
        for (CartItem item : cart) {
            total += item.getCost();
        }
        System.out.println("Total Cart Cost: " + total);
    }

    public static void main(String[] args) {
        ShoppingCart myCart = new ShoppingCart();

        myCart.addItem("Laptop", 50000.0, 1);
        myCart.addItem("Mouse", 700.0, 2);
        myCart.addItem("Keyboard", 1500.0, 1);

        myCart.displayTotalCost();

        myCart.removeItem("Mouse");
        myCart.displayTotalCost();
    }
}
