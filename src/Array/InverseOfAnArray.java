package Array;

import java.util.Scanner;

public class InverseOfAnArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the size of array");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.println("please enter the element of array");
            a[i] = sc.nextInt();
        }

      int[] inv = inverseOfanArray(a);
        display(inv);
    }


    public static int[] inverseOfanArray(int []a){
      int []inv=new int[a.length];

        for(int i=0;i<a.length;i++){
           int val=a[i];
           inv[val]=i;
        }
        return inv;
    }
    public static void display(int a[]){
        for(int val: a){
            System.out.println(val);
        }
    }
}
