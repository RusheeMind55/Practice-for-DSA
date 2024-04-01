package Basic_DSA;

import java.util.Arrays;

public class RmoveDupl {

	public static void removeDuplicate (int[] ar) {
		
		int rd=0;
		for(int i=0;i < ar.length;i++) {
			if( ar[rd] != ar[i]) {
	 			rd++;
				ar[rd]=ar[i];
				System.out.println(ar[i]);
			}
		}
		
}

	public static void main(String[] args) {
		
		int [] ar= {1,2,3,4,4,5,5,66,66,76};
		removeDuplicate(ar);
	}
}