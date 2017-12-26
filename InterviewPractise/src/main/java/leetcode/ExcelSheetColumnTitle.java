package leetcode;

public class ExcelSheetColumnTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = convertToTitle(1);
		System.out.println(s);
	}
	
	
	public static String convertToTitle(int n) {

        String[] str = new String[10] ;
        int i=0;
        while(n>0) {
        	int rem = n%26;
        	if(rem==0) {
        		str[i++] = String.valueOf('Z');
        		n = (n/26) - 1;
        	} else {
        		char c = (char) ((rem-1) + 'A' + '0');
        		str[i++] = String.valueOf(c) ;
        		n = n/26;
        	}
        }
        
        return String.valueOf(str);
    }
    
  
}
