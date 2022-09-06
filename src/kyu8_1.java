public class kyu8_1 {

    public class SmallestIntegerFinder {
        public static int findSmallestInt(int[] args) {

            for (int i = 0; i < args.length; i++) {
                if (args[0] > args[i]){
                    args[0] = args[i];
                }
            }return args[0];
        }
    }

    public static void main(String[] args) {
        int smool = SmallestIntegerFinder.findSmallestInt(new int[]{78,56,232,12,11,43});
        System.out.println(smool);
    }
}
