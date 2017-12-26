package leetcode;

import java.util.Stack;

public class ReverseString {

	public static void main(String[] args) {
		String input = "GeeksforGeeks";
		 
        // getBytes() method to convert string 
        // into bytes[].
        byte [] strAsByteArray = input.getBytes();
 
        byte [] result = 
                   new byte [strAsByteArray.length];
 
        // Store result in reverse order into the
        // result byte[]
        for (int i = 0; i<strAsByteArray.length; i++)
            result[i] = 
             strAsByteArray[strAsByteArray.length-i-1];
 
        System.out.println("Byte Array length: " + strAsByteArray.length);
        System.out.println(new String(result));
        
        if (-1 > -3 ) {
        	System.out.println("Yes");
        }

	}
	
	public String reverseString(String s) {
		// Option: 1 use stack - can do in o(n)
		/*StringBuilder rev = new StringBuilder();
		Stack<Character> st = new Stack();


		for(int i=0;i<s.length();i++) {
			st.add(s.charAt(i));
		}

		for(int j=0;j<s.length();j++) {
			rev.append(st.pop());
		}

		return rev.toString();*/
		
		if(s.isEmpty() || s==null) 
			return s;
		
		// Option: 2
	    String reverse = new StringBuilder(s).reverse().toString();
	    return reverse;
	}

}
