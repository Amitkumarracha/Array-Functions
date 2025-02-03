import java.util.ArrayList;

public class ArrayFunctions {
    // Method to separate even and odd numbers
    public void separateEvenOdd(int[] array) {

        if (array.length == 0) {
            System.out.println("No elements in the array.");
            return;
        }

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int num : array) {
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }

        System.out.println("Even Numbers: " + even);
        System.out.println("Odd Numbers: " + odd);
    }
}
