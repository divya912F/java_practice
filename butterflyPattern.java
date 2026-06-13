/*   *             *
     * *         * *
     * * *     * * *
     * * * * * * * * 
     * * * * * * * *
     * * *     * * *
     * *         * *
     *             *
 */
//butterfly pattern

// import java.util.*;
// public class butterflyPattern {
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);

//         int n=sc.nextInt();

//         for(int i=1;i<=n;i++){
//             System.out.print("");
//             for(int j=6;j<=0;j++){
//                 System.out.print(" ");
//             }
//             System.out.print("");
//         }
//         sc.close();

//     }
    
// }
import java.util.*;

public class butterflyPattern{
    public static int calculateSum(int a,int b){
        int sum= a+b;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        int sum=calculateSum( a, b);
        System.out.print(sum);
    }

}
