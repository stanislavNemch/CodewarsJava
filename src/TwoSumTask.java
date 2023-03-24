import java.util.Arrays;

public class TwoSumTask {

    public static void main(String[] args) {
        int[] arrayOne = {2,7,11,15};
        int[] arrayTwo = {3,2,4};
        int[] arrayFree = {3,3};
        int[] arrayFour = {3,2,3};

        System.out.println(Arrays.toString(twoSum(arrayOne, 9)));
        System.out.println(Arrays.toString(twoSum(arrayTwo, 6)));
        System.out.println(Arrays.toString(twoSum(arrayFree, 6)));
        System.out.println(Arrays.toString(twoSum(arrayFour, 6)));
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] newArray = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    newArray[0] = i;
                    newArray[1] = j;
                }
            }
        }
        return newArray;
    }
}
