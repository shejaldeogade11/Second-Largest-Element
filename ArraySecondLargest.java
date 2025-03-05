package Array;
import java.util.*;
public class ArraySecondLargest {
    public static void main(String[] args) {
        int arr[]={12,34,6,3,76,8};
        // this is second largest using quick sort TC O(nlogn) SC O(1)  BRUTE FORCE APPROACH
        // Arrays.sort(arr);
        // System.out.println(arr[arr.length-2]);

        // this is second largest using loop TC O(n) SC O(1)  Optimal solution APPROACH
        int largest = 0 , sLargest = -1;
        for(int i=1;i<arr.length;i++){
           if(arr[i]> largest) largest = arr[i];
        }
        System.out.println(largest);
        for(int i=1;i<arr.length;i++){
            if(arr[i]>sLargest && arr[i]!= largest) sLargest = arr[i];
        }
        System.out.println(sLargest);
  
    }
}
