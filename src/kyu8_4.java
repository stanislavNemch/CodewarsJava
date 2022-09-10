
public class kyu8_4 {
    public class Kata {
        public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
            for (int i = 1; i < classPoints.length; i++) {
                classPoints[0] += classPoints[i];
            }
            return (((classPoints[0] + yourPoints) / (classPoints.length + 1)) > yourPoints) ? false : true;
        }
    }

    public static void main(String[] args) {
        System.out.println(Kata.betterThanAverage(new int[]{100, 40, 34, 57, 29, 72, 57, 88}, 75));
        System.out.println(Kata.betterThanAverage(new int[] {2, 3}, 5));
        System.out.println(Kata.betterThanAverage(new int[] {12, 23, 34, 45, 56, 67, 78, 89, 90}, 69));
        System.out.println(Kata.betterThanAverage(new int[] {100, 90}, 11));
    }
}
