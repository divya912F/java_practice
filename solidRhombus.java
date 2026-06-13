/*        *****
         *****
        *****
       *****
      *****   
 */
// solid rhombus


import java.util.*;
public class solidRhombus {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();

        for(int i=rows;i>=1;i--){
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            
            System.out.print("*****");
            /*
            or
            for(intk=1;k<=1;k++)
                System.out.print("*****") 
            */

            
            System.out.print("\n");
        }
        sc.close();
    }
    
}
