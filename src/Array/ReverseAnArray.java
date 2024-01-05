package Array;

import java.util.Scanner;

public class ReverseAnArray {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of array");
        int n=sc.nextInt();
        int []a =new int[n];
        for(int i=0;i<a.length;i++){
            System.out.println("please enter the element of array");
            a[i]=sc.nextInt();
        }

        reverseArray(a);
        display(a);

    }

    public static void reverseArray(int []a){
         int i=0;
         int j=a.length-1;
         while(i<j){
             int temp=a[i];
              a[i]=a[j];
              a[j]=temp;
              i++;
              j--;
         }

    }

    public static void display(int a[]){
        for(int val: a){
            System.out.println(val);
        }
    }
}
