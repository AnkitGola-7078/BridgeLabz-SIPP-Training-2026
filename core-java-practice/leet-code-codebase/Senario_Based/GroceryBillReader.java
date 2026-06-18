import java.io.*;

public class GroceryBillReader {
    public static void main(String[] args) {
        String fileName = "bill.txt";
        int lineCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;// Read each line from the file
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                lineCount++;
            }
            System.out.println("Total number of lines = " + lineCount);

        } catch (FileNotFoundException e) {
            System.out.println("Bill file not found.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/*
Scenario:
A grocery store saves daily bills in a text file.
Task:
Write a program that:
Read the contents of bill.txt.
Displays each line on the console.
Counts the total number of lines in the file.
Concepts: FileReader, BufferedReader

 */