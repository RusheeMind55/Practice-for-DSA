package Basic_DSA;

import java.util.Arrays;

public class Move_Zero_End {
	
	public static void moveZero(int [] num) {
		
		int size = num.length;
		if(size == 0 || size ==1) {
			return;
		}
		int nz=0 , z=0;
		
		while(nz < size ) {
			if(num [nz] != 0) {
				int temp=num[nz];
				num[nz]=num[z];
				num[z]=temp;
				nz++;
				z++;
			}
			else {
				nz++;
			}
		}
		System.out.println(Arrays.toString(num));
}
	public static void main(String[] args) {
		
		int num []= {1,2,3,0,0,6,0,6};
		moveZero(num);
	}

}
