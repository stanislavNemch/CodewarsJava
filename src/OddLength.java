import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.*;

public class OddLength {
    static int stray(int[] numbers) {

        int number = 0;

        if (numbers[0] == numbers[1]) {
            for (int j : numbers) {
                if (numbers[0] != j) {
                    number = j;
                }
            }
        } else {
            for (int j : numbers) {
                for (int k : numbers) {
                    if (k != j) {
                        number = k;
                    }
                }
            }
        }
        return number;
    }

    public static void main(String[] args) {

        int[] numbers = {1, 1, 2};
        int[] numbersTwo = {17, 17, 3, 17, 17, 17, 17};
        int[] numbersOne = {1, 1, 1, 0};

        System.out.println(stray(numbers));
        System.out.println(stray(numbersTwo));
        System.out.println(stray(numbersOne));
    }
}
