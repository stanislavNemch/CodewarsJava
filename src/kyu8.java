
public class kyu8 {

    static class Kata
    {
        public static int[] countPositivesSumNegatives(int[] input) {
            int count = 0;
            int sum = 0;

            if (input != null) {
                if (input.length != 0) {
                    for (int i = 0; i < input.length; i++) {
                        if (input[i] > 0) {
                            count += 1;
                        } else {
                            sum += input[i];
                        }
                    }
                    return input = new int[]{count, sum};
                }
                return input = new int[0];
            }return input = new int[0];
        }
    }

    public static void main(String[] args) {

       int [] array = Kata.countPositivesSumNegatives(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15});

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}
