package Array;

import java.util.Scanner;

public class DigitFrequency {

    public static  void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number: ");
          int n=sc.nextInt();
        System.out.println("Please enter the digit for which you have to find a frequency");
         int digit =sc.nextInt();
         int result=digitFrequency(n,digit);
        System.out.println("Here is your result  : "+result);
    }


    public static   int digitFrequency(int n,int d){
        int c=0;
       while(n>0) {
       int temp = n % 10;
       n = n / 10;
       if (temp == d) {
           c++;
       }
   }
        return c;
    }
}
