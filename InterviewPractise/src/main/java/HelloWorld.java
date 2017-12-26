
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		int[] res = oddNumbers(5,10);
	}
	
	
	static int[] oddNumbers(int l, int r) {
	      
		int size=0;
        if( l%2==0 && r%2 == 0) {
            size = (r-l)/2;
        } else {
            size = (r-l)/2 + 1;
        }
       
       int[] odd = new int[size];
       int j=0;
       for(int i=l;i<=r;i++) {
           if(i%2!=0) {
               odd[j++] = i;
           }
       }

       return odd;
    }
	
	

}
