import java.io.*;
import java.sql.*;
//Use: Garbage Collector जब किसी object को destroy करने वाला होता है, तब finalize() method call होता है। referense ke uper dependent hai(deep)
//serialization object covert into byte stream (mainly used for file storage)
//deserialization byte stream convert into object (mainly used for )

public class CheckedExceptionsDemo {
    public static void main(String[] args) {
        // IOException
        try {
            FileWriter fw = new FileWriter("test.txt");
            fw.close();
            fw.write("Hello"); 
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }

        // FileNotFoundException
        try {
            FileReader fr = new FileReader("abc.txt");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException: " + e.getMessage());
        }

    
        //  ClassNotFoundException
        try {
            Class.forName("com.unknown.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException: " + e.getMessage());
        }

    }
}
