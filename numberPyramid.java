/*   1
     12
     123
     1234
     12345
 */

//number pyramid

import java.util.*;
public class numberPyramid {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);

            }
            System.out.print("\n");
        }
        sc.close();
    }

    
}
