package leetcode;

public class ReverseInteger {

	public static void main(String[] args) {
		int res = reverse(1234);
		System.out.println(res);
		int res2 = reverse(-901000);
		System.out.println(res2);
		int res3 = reverse(-123);
		System.out.println(res3);
		int res4 = reverse(10);
		System.out.println(res4);
		

	}
	
	public static int reverse(int x) {
        String temp = Integer.toString(x);
        System.out.println("DEBUG:"+temp);
        String temp_reverse;
        char[] reverse = temp.toCharArray();
        
        // check isreverse first ch is sign + or -
        int i=0; 
        int j=temp.length()/2;
        int k=temp.length()-1;
        
        if(temp.charAt(0) == '-' || temp.charAt(0) == '+') {
            reverse[i] = temp.charAt(0);
            i=1;
            //j=temp.length()-1;
        }
            
        for(;i<=k;i++,k--) {
            char x1 = reverse[i];
            reverse[i] = reverse[k];
            reverse[k] = x1; 
        }
        
        temp_reverse = new String(reverse);
        System.out.println("DEBUG:"+temp_reverse);
        if(Long.parseLong(temp_reverse) < Integer.MIN_VALUE || Long.parseLong(temp_reverse) > Integer.MAX_VALUE) {
        	return 0;
        }
        return (int) Integer.parseInt(temp_reverse);
    }

}
