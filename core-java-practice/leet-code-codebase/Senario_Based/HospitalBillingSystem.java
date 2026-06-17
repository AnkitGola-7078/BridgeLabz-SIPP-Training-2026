// Custom Exception
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class HospitalBillingSystem {
    public static void main(String[] args) {
        try {

            // Division by zero 
            int totalBill = 5000;
            int items = 0;
            int perItemCost = totalBill / items;
            System.out.println("Per item cost: " + perItemCost);

            // Array out-of-bounds (invalid patient index)
            String[] patients = {"John", "Mary"};
            System.out.println("Patient: " + patients[5]);

            // Number format exception (bad input)
            String input = "abc123";
            int amount = Integer.parseInt(input);

            // Payment failure
            int balance = 2000;
            int billAmount = 3000;
            if (billAmount > balance) {
                throw new InsufficientFundsException("Payment failed: Not enough funds!");
            }

        }
        catch (java.lang.ArithmeticException e) {
            System.out.println("Division by zero in billing.");

        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid patient index.");
        } 
        catch (NumberFormatException e) {
            System.out.println("Invalid number format in input.");
        } 
        catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        } 
        finally {
            System.out.println("Billing process completed safely.");
        }
    }
}


