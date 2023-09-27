package Day9;

public class Array {
    public static int largest(int arr[],int n){
        int largest = arr[0];
        for(int i = 0; i <= n-1;i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int arr [] = {12,34,12,12,43,2,434,54};
        System.out.println(largest(arr,7));
    }
    
}
