/*        *
         **
        ***
       ****
      *****
 */
//opposite pyramid


import java.util.*;
public class oppositePyramid {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();

        for(int i=row;i>=1;i--){
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(row+1)-i;k++){
                System.out.print("*");

            }
            System.out.print("\n");
        }
        sc.close();
    }
    
}
