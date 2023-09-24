package Day9;
class Gcd{

public static int bruteGcd(int num1, int num2){
    int ans = 1;
    for(int i = 1;i<Math.min(num1,num2);i++){
     if(num1 % i == 0 & num2 % i == 0){
        ans = i;
     }

    }
    
    return ans;
    

}
public static int optimalGcd(int n,int m){
    if(m ==0){
        return n;
    }
    return optimalGcd(m,n%m);
}
    public static void main (String args[]){
        System.out.println(bruteGcd(12,128)+"\n this is a bruteforce result");
        System.out.println(optimalGcd(12,128)+"\n this is a Optimal result");



}

}