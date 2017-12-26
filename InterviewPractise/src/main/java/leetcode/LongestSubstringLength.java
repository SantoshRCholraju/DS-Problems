package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestSubstringLength {

	public static void main(String[] args) {
		String s = "pwwkew";
		int res = lengthOfLongestSubstring(s);
		System.out.println(res);

	}

	// naive approach  - o(n^3)
	public static int lengthOfLongestSubstring(String s) {
		// use 2 counters -one for length of longest substring, another array to store
		// chars in substring

		int counter = 0, maxlength = 0;
		Set<Character> chars = new HashSet<>();

        int i = 0;
        int j = i;
        while (i < s.length()) {
            if (!chars.contains(s.charAt(j))) {
                // no repeat
                chars.add(s.charAt(j));
                counter++;
                maxlength = Math.max(maxlength, counter);
                j++;
               
            } else {
                // repeat char occurs
                counter = 0;
                chars.clear(); // flush all
                i++;
                j=i;
            }
            if(j>=s.length())
                break;
        }
        return maxlength;
	}
	
	// try to apply sliding window concept for String / arrays
	// optimal - o(n)
	public static int lengthOfLongestSubstringOptimal(String s) {
		// use 2 counters -one for length of longest substring, another array to store
		// chars in substring

		int counter = 0, maxlength = 0;
		Set<Character> chars = new HashSet<>();
		int n = s.length();
        int i = 0, j=0;

        while (i < n && j < n) {
            if (!chars.contains(s.charAt(j))) {
                // no repeat
                chars.add(s.charAt(j));
                counter++;
                maxlength = Math.max(maxlength, counter);
                j++;
               
            } else {
                // repeat char occurs
                counter--;
                chars.remove(s.charAt(i)); // just remove ith element from set
                i++;
            }
            if(j>=s.length())
                break;
        }
        return maxlength;
	}

}
