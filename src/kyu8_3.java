public class kyu8_3 {

    public class Paper
    {
        public static int paperWork(int n, int m)
        {
           return (n < 0 || m < 0) ? 0 : (m * n);
        }
    }

    public static void main(String[] args) {
        System.out.println(Paper.paperWork(5, 5));
        System.out.println(Paper.paperWork(-5, 5));
        System.out.println(Paper.paperWork(5, 0));
        System.out.println(Paper.paperWork(5, -5));
    }

}
