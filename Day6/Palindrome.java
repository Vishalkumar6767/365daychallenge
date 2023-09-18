
import java.util.*;
public class Palindrome {
    public static boolean palindromeNumber(int n) {
        // Write your code here.
        int temp = n;
        int rev = 0;
        int digit = 0;
        while (temp != 0) {
            digit = temp % 10;
            rev = rev * 10 + digit;
            temp /= 10;
        }
        if (rev == n)

        {
            return true;
        }

        else

        {
            return false;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        System.out.println(palindromeNumber(n));
        sc.close();
    }
}