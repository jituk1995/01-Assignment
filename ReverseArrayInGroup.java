//how can i reduce execution time.


import java.util.*;
import java.lang.*;
import java.io.*;

class ReverseArrayInGroup {
	public static void main (String[] args) {
	    Scanner s=new Scanner(System.in);
	    int t=s.nextInt();
	    
	   while(t-- > 0){
      //int size = s.nextInt();
      int n = s.nextInt();
      int k=s.nextInt();
      int [] arr=new int[n];
       for(int i=0; i<n; i++)
		 {
			 arr[i]=s.nextInt();
		 }
      //System.out.print("Original array is: ");
      for (int i = 0; i < n; i++)
         System.out.print(arr[i] + " ");
         System.out.println();
      for (int i = 0; i < n; i += k) {
         int left = i; 
         int right = Math.min(i + k - 1, n - 1);
         int temp;
         while (left < right) {
            temp = arr[left]; 
            arr[left] = arr[right];
            arr[right] = temp;
            left += 1;
            right -= 1;
         }
      }
      
      for (int i = 0; i < n; i++)
      {
         System.out.print(arr[i] + " "); 	//code
      }
      System.out.println();
	   }
	  
	}
}