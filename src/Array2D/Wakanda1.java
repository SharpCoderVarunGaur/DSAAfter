package Array2D;

import java.util.Scanner;

public class Wakanda1 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Please enter the row of  a r1: ");
        int r1=sc.nextInt();
        System.out.println("please enter the number of column of a c1");
        int c1=sc.nextInt();

        int [][]a=new int[r1][c1];
        for(int i=0;i<a.length;i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.println("Please enter the element of a of index" + i + "" + j + ": ");
                a[i][j] = sc.nextInt();
            }
        }
        wakanda(a);

    }
    public static void wakanda(int [][]a){
        for(int i=0;i<a[0].length;i++){
          if(i%2==0){
             for(int j=0;j<a.length;j++){
                 System.out.println(a[j][i]);
             }
          }else{
              for(int j=a.length-1;j>=0;j--){
                  System.out.println(a[j][i]);
              }
          }
        }
    }
}
