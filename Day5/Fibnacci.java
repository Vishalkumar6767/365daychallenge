package Day5;
import java.util.Scanner;
public class Fibnacci{
    




    public static int fib(int n, int arr[]) {
        if (n == 0 || n == 1) {
            return n;
        }
        arr[n] = fib(n - 1, arr) + arr[n - 2];
        return arr[n];
    }

    public static void main(String[] args) {

        /*
         * Your class should be named Solution.
         * Read input as specified in the question.
         * Print output as specified in the question.
         * int
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Array[] = new int[n + 1];
        Array[0] = 0;
        Array[1] = 1;
        System.out.println(fib(n, Array));
        sc.close();

    }

}

