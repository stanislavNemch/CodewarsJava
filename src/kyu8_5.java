public class kyu8_5 {

    public class Solution {

        public static String[] stringToArray(String s) {

            String[] words = s.split(" ");

            return words;
        }

    }

    public static void main(String[] args) {

        String[] arrayText = Solution.stringToArray("I love arrays they are my favorite");

        for (String word : arrayText) {
            System.out.print(word + " ");
        }
    }

}
