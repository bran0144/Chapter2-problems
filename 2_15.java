import javax.swing.*;

// Returns average of three integers from user input in GUI interface

public class AverageIntegers {
    public static void main(Integer[] args) {


        String title = "Average Integers";

        String response = JOptionPane.showInputDialog(null, 
            "Enter first integer: ", title, JOptionPane.QUESTION_MESSAGE);
        int1 = Double.parseDouble(response); 
        response = JOptionPane.showInputDialog(null,
            "Enter second integer: ", title, JOptionPane.QUESTION_MESSAGE); 
        int2 = Double.parseDouble(response);
        response = JOptionPane.showInputDialog(null, 
            "Enter third integer: ", title, JOptionPane.QUESTION_MESSAGE);
        int3 = Double.parseDouble(response);

        double sum = int1 + int2 + int3;
        double average = sum / 3.0;
        String message = "The average of the three intgers is " + average;
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
    } 

}
