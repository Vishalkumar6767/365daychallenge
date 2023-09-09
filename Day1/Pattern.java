package Day1;

//Complete the function printSquare() which takes  an integer n  as the input parameter and print the pattern.
// Vishal Kumar
public class Pattern {

    public static void squarePattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Complete the function printTriangle() which takes an integer n as the input
    // parameter and print the pattern.

    public static void printTriangle(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printTriangle1(int n) {
        // code here
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= i + 1; j++) {
                System.out.print(j + " ");

            }
            System.out.println();
        }
    }

    public static void printTriangle2(int n) {
        // code here

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");

            }
            System.out.println();
        }
    }

    public static void printTriangle3(int n) {
        // code here
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n - i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printTriangle4(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

    public static void printTriangle5(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n - i + 1; j++) {
                System.out.print("");
            }
            System.out.println();
        }
    }

    public static void printTriangle6(int n) {
        // code here

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("*");
            }

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();

        }

    }

    public static void printTriangle7(int n) {
        // code here
        for (int i = 1; i <= 2 * n - 1; i++) {

            int star = i;
            if (i > n)
                star = 2 * n - i;
            for (int j = 1; j <= star; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printTriangle8(int n) {
        // code here
        int space = 2 * (n - 1);
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {

                System.out.print(j);
            }

            System.out.println();
            space -= 2;

        }

    }

    public static void main(String[] args) {

        squarePattern(6);
        printTriangle(6);
        printTriangle1(6);
        printTriangle2(6);
        printTriangle3(6);
        printTriangle4(6);
        printTriangle5(6);
        printTriangle6(6);
        printTriangle7(6);
        printTriangle8(6);

    }

}
