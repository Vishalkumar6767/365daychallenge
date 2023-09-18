package Day8;

public class Countnumber {
    public static int countDigits(int n) {
        // Write your code here.
        int count = 0;
        System.out.println(n);
        while (n != 0) {
            
            int digit = n % 10;
            count++;
            n = n / 10;
            System.out.print(digit);

        }
        System.out.println();
        return count;

    }

    public static void main(String[] args) {
        System.out.print(countDigits(45673));
    }

}
