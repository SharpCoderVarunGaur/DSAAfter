package Array;

import java.util.Scanner;

public class RotateAnArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the size of array");
        int n = sc.nextInt();
        System.out.println("Please how many time you want to rotate the array");
        int k=sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.println("please enter the element of array");
            a[i] = sc.nextInt();
        }
        rotateAnArray(a,k);
        display(a);

    }
    public static void rotateAnArray(int a[],int k){
        k=k%a.length;
        if(k<0){
            k +=a.length;
        }
        reverseArray(a,0,a.length-k-1);
        reverseArray(a,a.length-k,a.length-1);
        reverseArray(a,0,a.length-1);

    }

    public static void reverseArray(int []a,int si,int li){

        while(si<li){
            int temp=a[si];
            a[si]=a[li];
            a[li]=temp;
            si++;
            li--;
        }

    }
    public static void display(int a[]){
        for(int val: a){
            System.out.println(val);
        }
    }
}