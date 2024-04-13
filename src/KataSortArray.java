
/*
* You will be given an array of numbers. You have to sort the odd numbers
* in ascending order while leaving the even numbers at their original positions.
* Examples
* [7, 1]  =>  [1, 7]
* [5, 8, 6, 3, 4]  =>  [3, 8, 6, 5, 4]
* [9, 8, 7, 6, 5, 4, 3, 2, 1, 0]  =>  [1, 8, 3, 6, 5, 4, 7, 2, 9, 0]
* */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class KataSortArray {
    public static int[] sortArray(int[] array) {
        List<Integer> oddNumbers = new ArrayList<>();

        // Add the odd numbers to the list
        for (int num : array) {
            if (num % 2 != 0) {
                oddNumbers.add(num);
            }
        }

        // Sort the list of odd numbers
        Collections.sort(oddNumbers);

        // Replace the odd numbers in the array with the sorted odd numbers
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = oddNumbers.get(j++);
            }
        }

        return array;
    }

    public static void main(String[] args) {
        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] result = sortArray(array);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}