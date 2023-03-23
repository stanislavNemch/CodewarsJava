public class Main {

        public static double getResult(double a, double b) {

            return Math.max(Math.max(a + b, a - b), Math.max(a * b, a / b));
        }

    public static int getDrinks(int numberOfGuests) {
        int drinkGuests = 0;

        for(int i = 0; i <= numberOfGuests; i++) {
            drinkGuests += i;
        }
            return drinkGuests;
    }

    public static int getDrinksWithStep(int guestNumber, int step) {
        int drinkGuests = 0;

        for(int i = 1; i <= guestNumber; i += step) {
            drinkGuests += i;
        }
        return drinkGuests;
    }

    public static int reviewCode(int maxAttempts) {
        int solutionAttempts = 0;

        do {
            solutionAttempts += 1;
        } while(solutionAttempts < maxAttempts);

        return solutionAttempts;
    }

    public static void main(String[] args) {

        System.out.println(reviewCode(2));
        //System.out.println(getDrinksWithStep(0,5));
        //System.out.println(getDrinks(10));
        //System.out.println(getResult(-5, -1));
    }
}