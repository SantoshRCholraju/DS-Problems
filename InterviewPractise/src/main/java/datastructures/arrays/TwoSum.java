package datastructures.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 7, 11, 15};
		int[] ans = twoSum1(arr, 9);
		System.out.println(Arrays.toString(ans));

	}
	
    
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++) {
            int x = nums[i];
            if(map.containsKey(x))
                return new int[] {map.get(x), i};
            
            int y = target - x;
            map.put(y, i);
                
        }
        throw new IllegalArgumentException("No two sum solution found for :" + target);
     }
    
    public static int[] twoSum1(int[] nums, int target) {
        // use Map to store
        Map<Integer, Integer> map = new HashMap<>(); // K-value of arr ele, V- index of array ele
        int[] res;
        for(int i=0;i<nums.length;i++) {
        	int val = nums[i];
            if(map.containsKey(target - val)) {
                int index = map.get(target - val);
                res = new int[] {index, i};
                System.out.println("Found 2 sum pair");
                return (res);
            } else {
            	map.put(val, i);
            }
        }
        
        return null;
    }
	
	/*public int[] twoSum(int[] nums, int target) {
	    int[] res = new int[2];
	    
	    for (int i=0;i<nums.length;i++) {
	        int x = nums[i];
	        if (x>target) continue;
	        
	        for(int j=i+1;j<nums.length;j++) {
	            int y = nums[j];
	            if(y>target) continue;
	            
	            if((x+y) == target) {
	                //found twoSum, return indices
	                res[0] = i;
	                res[1] = j;
	                return res;
	            }
	        }
	    }
	    // throw new Exception("No two sum solution");
	    throw new IllegalArgumentException("No two sum solution");
	}*/

}
