// Name: Amitkumar Racha
// PRN: 24070126501
// Batch: A1 (2023-27)

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserInput ui = new UserInput();
        ArrayFunctions functions = new ArrayFunctions();
        MinDistanceFinder minFinder = new MinDistanceFinder();
        ArrayConverter arrayConverter = new ArrayConverter();

        int[] userArray = null;

        while (true) {
            System.out.println("\n===== Menu =====");
            System.out.println("1. Enter Array Elements");
            System.out.println("2. Separate Even and Odd Numbers");
            System.out.println("3. Find Nearest Neighbors with Minimum Difference");
            System.out.println("4. Convert Array to ArrayList and Back");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    userArray = ui.arrayInput();
                    System.out.println("Array stored successfully!");
                    break;

                case 2:
                    if (userArray != null) {
                        functions.separateEvenOdd(userArray);
                    } else {
                        System.out.println("Please enter the array first (Option 1).");
                    }
                    break;

                case 3:
                    if (userArray != null) {
                        int index = minFinder.findMinDifference(userArray);
                        System.out.println("Index of first number in pair: " + index);
                    } else {
                        System.out.println("Please enter the array first (Option 1).");
                    }
                    break;

                case 4:
                    if (userArray != null) {
                        arrayConverter.convertArrayAndList(userArray);
                    } else {
                        System.out.println("Please enter the array first (Option 1).");
                    }
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
