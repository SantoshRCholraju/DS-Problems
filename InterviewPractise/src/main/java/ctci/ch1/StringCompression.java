package ctci.ch1;

public class StringCompression {
	/**
	 * input: aabccccaaa
	 * output: a2b1c4a3
	 * @param s
	 * @return
	 */
	/*public static String compressedString(String s) {
		StringBuilder output = new StringBuilder();
		int i=0;
		int len = s.length();
		s = s.trim();
		while(i<len) {
			char c = s.charAt(i);
			int count = 1;
			output.append(c);
			int j=i+1;
			if(j>=len) {
				output.append(count);
				break;
			}
			char d = s.charAt(j);
			// check if next char is same as current char
			while(c==d) {
				count++;
				j++;
				if(j>=len) {
					output.append(count);
					break;
				}
				d = s.charAt(j);
			}
			i = j;
			output.append(count);
		}
		
		return output.toString();
	}*/
	
	public static String compressedString(String s) {
		StringBuilder output = new StringBuilder();
		int i=0;
		int len = s.length();
		s = s.trim();
		
		char[] arr = s.toCharArray();
		char cur = arr[i];
		int count = 1;
		char last = arr[len-1];
		
		while(i<len-1) {
			cur = arr[i];
			int j=i+1;
			char next = arr[j];
			//next char is same as prev
			if (cur == next) {
				count++;
				i++;
			} else {
			// next char is not same
				output.append(cur);
				output.append(count);
				i++;
				count = 1;
			}
		}
		//still need to handle last char
		output.append(last);
		output.append(count);
		
		// check if compressed string len less than original
		if(output.length() < s.length()) {
			return output.toString();
		} else {
			System.out.println("length of compressed string greater than original, compressed: " + output);
			return s;
		}
	}
	
	public static int getCompressionSize(String s) {
		int size = 0;
		
		int i=0;
		int len = s.length();
		s = s.trim();
		
		char[] arr = s.toCharArray();
		char cur = arr[i];
		int count = 1;
		char last = arr[len-1];
		
		while(i<len-1) {
			cur = arr[i];
			int j=i+1;
			char next = arr[j];
			//next char is same as prev
			if (cur == next) {
				count++;
				i++;
			} else {
			// next char is not same
				size += 1; //output.append(cur);
				size += String.valueOf(count).length(); // output.append(count);
				i++;
				count = 1;
			}
		}
		//still need to handle last char
		size += 1 + String.valueOf(count).length();
		//output.append(last);
		//output.append(count);
		
		return size;
	}
	
	public static void main(String[] args) {
		//String res = compressedString("aabccccaaa");
		String s ="aabcccccccccccaaa";
		String res = compressedString(s);
		int size = getCompressionSize(s);
		System.out.println("Compressed size: " + size);
		System.out.println("Compressed String: " + res);
	}

}
