package datastructures.arrays;

public class NextGreatestLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public char nextGreatestLetter(char[] letters, char target) {
	        
        int c = Character.getNumericValue(target);
 	        
        int res = 9999;
        int carryover = 0;
        char ch = target;
        char ch1 = 0;
        
        for(int i=0;i<letters.length;i++) {
           int diff = Character.getNumericValue(letters[i]) - c;
            
           // overflow after z 
           if (diff <= 0) {
        	   if(diff < carryover) {
        		   carryover = diff;
        		   ch1= letters[i];
        	   }
        	  continue;
           }
             
           // no overflow
	        if(diff < res) {
	            res = diff;
	            ch = letters[i];
	        }
        }
        return (ch == target) ? ch1 : ch;
     }

}
