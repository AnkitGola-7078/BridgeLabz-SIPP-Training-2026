package io;
import java.io.*;

public class FeedbackAnalyzer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;

        System.out.println("Enter 5 feedback messages:");
        for (int i = 0; i < 5; i++) {
            String feedback = br.readLine();
            if (feedback.toLowerCase().contains("good")) {
                count++;
            }
        }
        System.out.println("Good Feedback Count = " + count);
    }
}
/*
Customer Feedback Analyzer
An online store receives customer feedback.
Using BufferedReader:
Read 5 feedback messages.


Count how many messages contain the word:good
Display the count.

Example  
Good service
delivery was good
average
good packaging
late delivery											
Output:
Good Feedback Count = 3

*/