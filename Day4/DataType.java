
package Day4;
import java.util.*;

public class DataType {
    public static int dataTypes(String type) {
        if (type.equals("Integer") || type.equals("Float")) {
            System.out.println(4);
        } else if (type.equals("Long") || type.equals("Double")) {
            System.out.println(8);
        }

        return 1;
    }
    
    public static String compareIfElse(int a, int b) {
        // Write your code here
        if(a>b){
            return "greater";
        }else if(a<b){
            return "smaller";
        }
        else{
            return "equal";
            }
        }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String type = sc.next();
        dataTypes(type);
        compareIfElse(6,7);
        sc.close();
        

    }
}