
import java.util.Scanner;

public class Sieve {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("To what number should we find all prime numbers? ");
        int limit = in.nextInt();
        int[] array = new int[limit - 1];
        boolean[] isPrime = new boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = (i + 2);
            //System.out.print(array[i] + ", ");
            isPrime[i] = true;
        }
        int prime = 2;

        for (int i = 0; i < array.length; i++) {
            if (isPrime[i]) {
                for (int k = 2 * array[i]; k <= limit; k += array[i]) {

                    isPrime[k - 2] = false;

                }
            }

        }
        for (int i = 0; i < array.length; i++) {
            if (isPrime[i] == true) {
                System.out.print(array[i] + ", ");
            }
        }
    }
}
