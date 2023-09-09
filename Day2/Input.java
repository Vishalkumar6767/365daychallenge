
package Day2;

public class Input {
    /**
     * @param n
     */
    public static void printTriangle1(int n) {
        int m = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(m + " ");
                m = m + 1;
            }
            System.out.println();
        }
    }

    public static int largestElement(int[] arr, int n) {
        // Write your code here.
        int largest = arr[0];
        for (int i = 0; i <= n - 1; i++) {
            if (arr[i] > largest) {
                largest = arr[i];

            }

        }
        System.out.println(largest);
        return largest;

    }

    public static void main(String []args) {
        printTriangle1(6);

        int arr[] = { 6, 6, 8, 9, 62, 6 };
        int n = arr.length;
        largestElement(arr, n);

    }
}