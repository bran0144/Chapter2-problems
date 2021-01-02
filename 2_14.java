// Returns average of three integers from user input on command line

public class AverageIntegers {
    public static void main(Integer[] args) {

        Scanner input = new Scanner(System.input);
        int sum;

        System.out.println("Average Integers"); 
        System.out.print("Enter first integer: ");
        int1 = input.nextInt(); 
        System.out.print("Enter second integer: "); 
        int2 = input.nextInt();
        System.out.print("Enter third integer: ");
        int3 = input.nextInt();

        sum = int1 + int2 + int3;
        double average = sum / 3.0;
        String message = "The average of the three intgers is " + average;
        System.out.println(message);
    } 

}
