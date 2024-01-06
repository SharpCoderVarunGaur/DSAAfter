package Array2D;

import java.util.Scanner;

public class MatrixMultiplication {

    public static void main(String []args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Please enter the row of first a r1: ");
        int r1=sc.nextInt();
        System.out.println("please enter the number of column of a c1");
        int c1=sc.nextInt();

        int [][]a=new int[r1][c1];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                System.out.println("Please enter the elemetn of a of index"+i+""+j+": ");
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Please enter the column of array a and row of b same otherwise logic for matrix is fail");
        System.out.println("Please enter the row of first b r2: ");
        int r2=sc.nextInt();
        System.out.println("please enter the number of column of b c2");
        int c2=sc.nextInt();

        int [][]b=new int[r1][c2];
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[0].length;j++){
                System.out.println("Please enter the elemetn of b of index"+i+""+j+": ");
                b[i][j]=sc.nextInt();
            }
        }
        if (c1 != r2) {
            System.out.print("Invalid input");              //3
            return;
        }
        int[][] ans = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {                  //4
                for (int k = 0; k < c1; k++) {
                    ans[i][j] += (a[i][k] * b[k][j]);
                }
            }

    }
}
}
