import java.util.ArrayList;
import java.util.Arrays;

public class ArrayConverter {
    // Method to convert array to ArrayList and vice versa
    public void convertArrayAndList(int[] array) {

        if (array.length == 0) {  // ADDED: Prevents empty array processing
            System.out.println("No elements in the array.");
            return;
        }

        // Convert array to ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int num : array) {
            arrayList.add(num);
        }
        System.out.println("Array converted to ArrayList: " + arrayList);

        // Convert ArrayList back to array
        int[] newArray = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            newArray[i] = arrayList.get(i);
        }
        System.out.println("ArrayList converted back to Array: " + Arrays.toString(newArray));
    }
}
