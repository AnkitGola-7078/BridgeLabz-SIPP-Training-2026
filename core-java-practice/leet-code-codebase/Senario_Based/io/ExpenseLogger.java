package io;
import java.io.*;
import java.util.Scanner;

public class ExpenseLogger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName = "expenses.txt";
        
        try (FileWriter fw = new FileWriter(fileName, true);// append mode
            PrintWriter pw = new PrintWriter(fw)) {//pw write in file
            
            System.out.println("Number of expenses to log: ");
            int n = sc.nextInt();

            sc.nextLine(); // consume the newline character
            for (int i = 0; i < n; i++) {

                System.out.print("Enter category: ");
                String category = sc.nextLine();
                System.out.print("Enter amount: ");
                int amount = sc.nextInt();
                sc.nextLine(); // consume the newline character
                pw.println(category + " - " + amount);
               
            }
            System.out.println("Expense saved successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
       
        
    }
}

/*
Daily Expense Logger
A finance application stores daily expenses.
Create a program that:
Accepts expense details from user.
Stores them in:
expenses.txt

Format:
Food - 200
Travel - 150
Shopping - 500

*/