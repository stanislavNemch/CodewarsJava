import java.util.Arrays;

public class Two_Dimensional_Array {

    public static int[] flattenAndSort(int[][] array) {
        // Calculate the total length of the new array
        int totalLength = 0;
        for (int[] subArray : array) {
            totalLength += subArray.length;
        }

        // Create a new array with the total length
        int[] flattenedArray = new int[totalLength];

        // Fill the new array with the elements of the 2D array
        int currentIndex = 0;
        for (int[] subArray : array) {
            for (int element : subArray) {
                flattenedArray[currentIndex++] = element;
            }
        }

        // Sort the new array in ascending order
        Arrays.sort(flattenedArray);

        return flattenedArray;
    }

    public static void main(String[] args) {
        int[][] array = {{1, 3, 5} ,{100}, {2, 4, 6}};
        int[] result = flattenAndSort(array);
        System.out.println(Arrays.toString(result));  // Output: [1, 2, 3, 4, 5, 6, 100]
    }
}