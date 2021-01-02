// Prompts user for three int from CL
// Use nextInt from Scanner class
// Compute sum of values and print to screen

import java.util.*;

public class SumIntegers {
    public static void main(Integer[] args) {

        Scanner input = new Scanner(System.input);
        int sum;

        System.out.println("Sum Integers"); 
        System.out.print("Enter first integer: ");
        int1 = input.nextInt(); 
        System.out.print("Enter second integer: "); 
        int2 = input.nextInt();
        System.out.print("Enter third integer: ");
        int3 = input.nextInt();

        sum = int1 + int2 + int3;
        String message = "The sum of the three intgers is " + sum;
        System.out.println(message);
    } 

}

