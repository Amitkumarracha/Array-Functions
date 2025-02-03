
public class MinDistanceFinder {
    // Method to find the index of the first number in the pair with the smallest difference
    public int findMinDifference(int[] array) {
        if (array.length < 2) {
            System.out.println("Array should have at least two elements!");
            return -1; // Return -1 if not possible
        }

        int minDiff = Integer.MAX_VALUE;
        int index = 0;

        for (int i = 0; i < array.length - 1; i++) {
            int diff = Math.abs(array[i] - array[i + 1]);
            if (diff < minDiff) {
                minDiff = diff;
                index = i;
            }
        }
        return index;
    }
}
