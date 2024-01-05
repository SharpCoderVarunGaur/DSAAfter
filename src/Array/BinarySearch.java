package Array;

import java.util.Scanner;

public class BinarySearch {
    public  static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number of size of array: ");
        int n=sc.nextInt();
        System.out.println("Please enter the value that you want to search");
        int d=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<a.length;i++){
            System.out.println("please enter the digit of arrays in sorted order: ");
            a[i]=sc.nextInt();
        }
        binarySearch(a,d);
    }

    public static void binarySearch(int[] a ,int d){
        int i=0;
        int j=a.length-1;
        while (i<=j){
            int mid=(i+j)/2;
            if(a[mid]==d){
                System.out.println(mid);
                return ;
            }else if(d>a[mid]){
                i=mid+1;
            }else{
                j=mid-1;
            }
        }




    }
}
