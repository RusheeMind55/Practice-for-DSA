package practice;

import java.util.Scanner;

public class Practice_090 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Eneter First Number : ");
		int a=sc.nextInt();
		
		System.out.println("Eneter Second Number : ");
		int b=sc.nextInt();
		
		System.out.println("Eneter Third Number : ");
		int c=sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println("a is the largest number : " +a);
		}
		else if(b>a && b>c) {
			System.out.println("b is the largest number : " +b);	
		}
		else {
			System.out.println(" C is the largest number :" +c);
		}
		
		
	}

}
