/*  ******
    ******
    ******
    ******  */  
// solid rectange or square

import java.util.*;
public class solidRectangle{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int column=sc.nextInt();


        for(int i=1;i<=rows;i++){
            for(int j=1;j<=column;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        sc.close();
    }
    
}
