package ctci.ch1;

import java.util.HashSet;
import java.util.Set;

public class CheckPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abc";
		String s2 = "cab";
		boolean ans = isPermutation(s1, s2);
		System.out.println(ans);
	}
	
	
	public static boolean isPermutation(String s1, String s2) {
	
		Set<String> set = new HashSet<>();
		
		// add to set
		for (char ch : s1.toCharArray()) {
			set.add(String.valueOf(ch));
		}
		
		// check if present in set
		for(char ch : s2.toCharArray()) {
			if(!set.contains(String.valueOf(ch))) {
				return false;
			}
		}
		
		return true;
	}

}
