public class kyu8_2 {

    public class Positive{

        public static int sum(int[] arr){

            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 0) {
                    sum += arr[i];
                }
            }
            return sum;
        }

    }

    public static void main(String[] args) {
        System.out.println(Positive.sum(new int[]{1,2,3,4,5}));
        System.out.println(Positive.sum(new int[]{-1,-2,-3,-4,-5}));
    }
}
