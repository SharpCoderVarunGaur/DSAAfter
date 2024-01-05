package Array;

import java.util.Scanner;

public class BrokenEconomy {
    public  static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number of size of array: ");
        int n=sc.nextInt();
        System.out.println("Please enter the value denominations for  that you want to search");
        int d=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<a.length;i++){
            System.out.println("please enter the digit of arrays in sorted order: ");
            a[i]=sc.nextInt();
        }
        brokenEconomy(a,d);
    }
    public static void brokenEconomy(int[]a,int d ){
        int i=0;
        int j=a.length-1;
        int ceil=0;
        int floor=0;
        while (i<=j){
            int mid=(i+j)/2;
            if(a[mid]==d){
              ceil=floor=a[mid];
                break;
            }else if(d>a[mid]){
                i=mid+1;
                floor=a[mid];
            }else{
                j=mid-1;
                ceil=a[mid];
            }
        }
        System.out.println(ceil);
        System.out.println(floor);
}
}
