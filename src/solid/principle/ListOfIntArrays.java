package solid.principle;

import java.util.ArrayList;
import java.util.List;

public class ListOfIntArrays {
    public static void main(String[] args) {
        // Create a List to hold int arrays
        List<int[]> listOfIntArrays = new ArrayList<>();
        
        // Create and add int arrays to the list
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] array3 = {7, 8, 9};

        listOfIntArrays.add(array1);
        listOfIntArrays.add(array2);
        listOfIntArrays.add(array3);

        // Iterate over the list and print each int array
        for (int[] array : listOfIntArrays) {
            for (int value : array) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
