class DRoot {
    public static int digital_root(int n) {
        if (n < 10) {
            return n;
        }
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return digital_root(sum);
    }

    public static void main(String[] args) {
        System.out.println(digital_root(942));
    }
}
