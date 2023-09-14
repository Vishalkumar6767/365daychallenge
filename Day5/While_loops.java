package Day5;

import java.util.*;

public class While_loops {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumEven = 0;
        int sumOdd = 0;

        while (n > 0) {
            int r = n % 10;
            if (r % 2 == 0) {
                sumEven += r;

            } else {
                sumOdd += r;
            }
            n /= 10;

        }

        System.out.println(sumEven + " is sum of Even digit " + sumOdd + " Sum of Odd digit");

        sc.close();

    }

}
