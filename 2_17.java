import java.util.*;

import javax.swing.JOptionPane; 

public class GetInputGUI { 
    public static void main(String[] args) { 
        // Create an object named in for input
        String title = "Bouncing Ball";

        // Declare variables to hold input data
        double height, coefficient; 
        int bounces;
        str color;

        // Prompt the user and read data from the keyboard
        String response = JOptionPane.showInputDialog(null, "Enter the height: ", 
            title, JOptionPane.QUESTION_MESSAGE); 
        height = Double.parseDouble(response); 
        response = JOptionPane.showInputDialog(null,"Enter restitution coefficient: ", 
            title, JOptionPane.QUESTION_MESSAGE); 
        coefficient = Double.parseDouble(response);
        response = JOptionPane.showInputDialog(null, "Enter the number of bounces: ", 
            title, JOptionPane.QUESTION_MESSAGE);
        bounces = Double.parseDouble(response);
        response = JOptionPane.showInputDialog(null, "Enter the color of the ball: ",
            title, JOptionPane.QUESTION_MESSAGE);
        color = String.parseString(response);

        String message = "After " + bounces +
        " bounces the height of the " + color + "ball is: " + bounceHeight + " feet";
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
    }
}

