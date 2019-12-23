import static java.lang.StrictMath.sqrt;
public class JudgePrime {
    public static void main(String[] args) {
        int i = 0;
        for (i = 1; i <= 100; i++) {
            prime(i);
        }

    }
    public static void prime(int number) {
        double i = 0;
        int count = 0;
        for (i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println(number);
        }
    }
}