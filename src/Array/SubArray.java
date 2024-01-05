package Array;

import java.util.Scanner;

public class SubArray {
    public  static void main(String []args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number of size of array: ");
        int n=sc.nextInt();

        int []a=new int[n];

        for(int i=0;i<a.length;i++){
            System.out.println("please enter the digit of arrays: ");
            a[i]=sc.nextInt();
        }

        subArray(a);


    }

    public static void subArray(int []a){
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(a[k]+" ");
                }
                System.out.println();
            }

        }

    }
}
