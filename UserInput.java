import java.util.Scanner;

public class UserInput {
    // Method to take array input from the user
    public int[] arrayInput() {
        //int[] array = new int[5]; // Fixed-size array
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no. of elements in the array: ");
        int size  = scan.nextInt();
//        System.out.println("Enter 5 numbers:");
//        for (int i = 0; i < array.length; i++) {
//            array[i] = scan.nextInt();

        if (size <= 0) {
            System.out.println("Invalid size! Please enter a positive integer.");
            return new int[0];  // Return an empty array if invalid input
        }

        int[] array = new int[size];

        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }
        return array;
    }
}