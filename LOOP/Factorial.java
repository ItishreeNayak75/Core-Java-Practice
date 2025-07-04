import   java.util.Scanner;
class Factorial{

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a  number between 1-10 :");
		int  num= sc.nextInt();
		int fact=1;
		int i=2;
		while(i<=num){
			fact=i*fact;
			i++;
		}
		System.out.println(num +" factorial is :  "+fact);
	}
}