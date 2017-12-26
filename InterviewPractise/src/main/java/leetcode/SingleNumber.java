package leetcode;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class SingleNumber {

	public static void main(String[] args) {
		int[] arr = {0,5,3,-1,8,6,6,5,3,-1,0};
		int res = singleNumber(arr);
		System.out.println("SingleNumber: " + res);
	}
	
	public static int singleNumber(int[] nums) {
		int single = 0;
		
//        // put everything in hashmap
//        Map<Integer, Integer> map = new HashMap<>();
//        //Hashtable<Integer, Integer> hashTable = new Hashtable<>();
//        for (int i=0;i<nums.length;i++) {
//            if(map.containsKey(nums[i])) {
//            	map.remove(nums[i]);
//            } else {
//            	map.put(nums[i], 1);
//            }
//        }
//        
//        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
//        	return entry.getKey();
//        }
		// use XOR
		for(int i=0;i<nums.length;i++) {
			single = single ^ nums[i]; //XOR
		}
		
		return single;
    }
}
