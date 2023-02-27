public class ZywOo {
    public static String warnTheSheep(String[] array) {
        int N = 0;
        String text = "wolf";
        for (int i = array.length - 1; i >= 0; i--) {
            if(text.equals(array[i])){
                break;
            }
            N++;
        }//Your code)))
        return N != 0 ?
                "Oi! Sheep number " + N + "! You are about to be eaten by a wolf!" :
                "Pls go away and stop eating my sheep";
    }

    public static void main(String[] args) {
        System.out.println(warnTheSheep(new String[]{"sheep", "wolf", "sheep"}));
    }
}
