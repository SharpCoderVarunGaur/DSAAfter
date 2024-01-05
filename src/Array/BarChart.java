package Array;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BarChart {

    public static void main(String []args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Please enter the size of array");
        int n=sc.nextInt();

        int []a =new int[n];
        for(int i=0;i<a.length;i++){
            System.out.println("please enter the element of array");
            a[i]=sc.nextInt();
        }
        barChart(a);
    }

    public static void barChart(int a[]){

        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        for(int i=0;i<max;i++){
            for(int j=0;j<a.length;j++){
                if(a[j]>=max-i){
                    System.out.print("*  ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
