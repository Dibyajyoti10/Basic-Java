//sum of n even numbers using FOR LOOP


import java .util.Scanner;
public class JAVA_PRACTICE_SET_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obj= new Scanner (System.in);
		System.out.println("Enter a number");
		int a = obj.nextInt();
		int sum=0;
		for(int i=0;i<a;i++) {
			sum = sum +(2*i);
		}
		System.out.println("The sum of first "+ a + "even numbers are :" + sum);
	
	
		
		//print multiplication table of a given number
		int n =5;
		for(int i=0;i<=10;i++) {
			System.out.printf("%d x %d = %d\n" , n,i,n*i);
		}
	
		
		// print multiplication table in reverse order
		int n =10;
		for(int i=10;i!=0;i--) {
			System.out.printf("%d x %d = %d\n" , n,i,n*i);
	}

	
		
		//WAP to find factorial of a given number using loops
		
		int n=5;
		int fact=1;
		for(int i=1;i<n;i++) {
			fact=fact *i;
	}
		System.out.println("The factorial of number "+ n +"is :"+ fact);
	
		
		//print the multiplication table of 8 and sum it
		int n =8;
		int sum=0;
		for(int i=0;i<=10;i++) {
			System.out.printf("%d x %d = %d\n" , n,i,n*i);
			sum +=n*i;
			
		}
		System.out.println("The sum of its values is "+sum);

}
}
