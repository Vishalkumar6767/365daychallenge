package Day10;

import java.util.*;

class CheckPrime {

    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = (isPrime(n));
        if (n != 1 && ans == true) {
            System.out.println("The Number is Prime");
        } else
            System.out.println("the Number is not Prime");
        sc.close();

    }

}