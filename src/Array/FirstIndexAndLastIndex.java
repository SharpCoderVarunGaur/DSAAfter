package Array;

import java.util.Scanner;

public class FirstIndexAndLastIndex {
    public static void main(String[] args) throws Exception {
        Scanner ssc=new Scanner(System.in);
        System.out.println("Please enter the number of size of array: ");
        int n = ssc.nextInt();
        System.out.println("Please enter the value that you want to search");
        int data = ssc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("please enter the digit of arrays in sorted order: ");
            arr[i] = ssc.nextInt();
        }


        int left = 0;
        int right = arr.length - 1;
        int fi = -1; // First index = fi

        while (left <= right) {
            int mid = (left + right) / 2;
            if (data > arr[mid]) {
                left = mid + 1;
            } else if (data < arr[mid]) {
                right = mid - 1;
            } else  {
                fi = mid;
                right = mid - 1;
            }
        }

        left = 0;
        right = arr.length - 1;
        int li = -1; // last index = li
        while (left <= right) {
            int mid = (left + right) / 2;
            if (data > arr[mid]) {
                left = mid + 1;
            } else if (data < arr[mid]) {
                right = mid - 1;
            } else  {
                li = mid;
                left = mid + 1;
            }
        }

        System.out.println(fi);
        System.out.println(li);
    }
}
