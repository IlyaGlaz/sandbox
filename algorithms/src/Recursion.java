public class Recursion {

    public static void main(String[] args) {
        System.out.println(calculateFactorial(3))
        ;
    }

    public static long calculateFactorial(long n) {
        return (n <= 1) ? 1 :
                n * calculateFactorial(n - 1);
    }
}
