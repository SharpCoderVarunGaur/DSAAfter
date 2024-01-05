package Array;

import java.util.Scanner;

public class SpanOfArray {

    public  static void main(String []args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number of count of array: ");
        int n=sc.nextInt();

        int []a=new int[n];

        for(int i=0;i<a.length;i++){
            System.out.println("please enter the digit of arrays: ");
            a[i]=sc.nextInt();
        }

        int span=spanOfArray(a);
        System.out.println("Span of Array is: "+span);
    }
    public static int spanOfArray(int a[]){
        int s=0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
            if(min>a[i]){
                min=a[i];
            }
        }
        s=max-min;
        return s;
    }
}
