package datastructures.arrays;

import java.util.Arrays;

public class Merge2SortedArrays {
	
	public static void main(String[] args) {
		int [] a = new int[2];
		a[0] = 0;
		int [] b = {1};
		merge(a, 1, b, 1);
	}
	
	 public static void merge(int[] nums1, int m, int[] nums2, int n) {
	        int[] merge = new int[m+n];
	        
	        //printArray(nums1, m);
	        
	        while(m>0 || n>0) {
	            
	            int i=0;
	            int j=0;
	            int k=0;
	            
	            while(m>0 && n>0) {
	                if(nums1[i] < nums2[j]) {
	                    merge[k] = nums1[i];
	                    i++;
	                    m--;
	                } else {
	                    merge[k] = nums2[j];
	                    j++;
	                    n--;
	                }
	                k++;
	            }
	            
	            while(m>0) {
	                merge[k] = nums1[i];
	                i++;
	                m--;
	                k++;
	            }
	            
	            while(n>0) {
	                merge[k] = nums2[j];
	                j++;
	                n--;
	                k++;
	            }
	        }
	        
	        nums1 = Arrays.copyOf(merge, merge.length);
	        for (int i=0;i<nums1.length;i++) {
	        	System.out.print(nums1[i])
	        	;
	        }
	    }
	    
	    /* Utility that prints out an array on a line */
	    public static void printArray(int arr[], int size) 
	    {
	        int i;
	        for (i = 0; i < size; i++) 
	            System.out.print(arr[i] + " ");
	 
	        System.out.println("");
	    }
	    
}
