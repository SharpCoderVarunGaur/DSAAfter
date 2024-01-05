package Array;

import java.util.Scanner;

public class FindElementInAnArray {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Please enter the size of array :");

        int n=sc.nextInt();

        System.out.println("please enter the digit which you want to find");
        int d=sc.nextInt();
        int []a=new int[n];

        for(int i=0;i<a.length;i++){
            System.out.println("please enter the element of array");
            a[i]=sc.nextInt();
        }
        int i=findElementInAnArray(a,d);
        System.out.println(i);
    }

    public static int findElementInAnArray(int a[],int d){

        for(int i=0;i<a.length;i++){

            if(a[i]==d){
                return i;
            }
        }
        return -1;
    }
}
