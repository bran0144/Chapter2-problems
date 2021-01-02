import java.util.*; 

public class GetInputCLI { 
    public static void main(String[] args) { 
        // Create an object named in for input
        Scanner in = new Scanner(System.in); 

        // Declare variables to hold input data
        double height, coefficient; 
        int bounces;
        str color;

        // Prompt the user and read data from the keyboard
        System.out.println("Bouncing Ball: Subproblem 1"); 
        System.out.print("Enter the height: ");
        height = in.nextDouble(); 
        System.out.print("Enter restitution coefficient: "); 
        coefficient = in.nextDouble();
        System.out.print("Enter the number of bounces: ");
        bounces = in.nextInt();
        System.out.print("Enter the color of the ball: ");
        color = in.next();

        String message = "After " + bounces +
            " bounces the height of the " + color + "ball is: " + bounceHeight + " feet";
        System.out.println(message);
    }
}