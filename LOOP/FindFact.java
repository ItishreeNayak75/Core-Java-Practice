import   java.util.Scanner;
class FindFact{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a int value");
		int  x= sc.nextInt();
		System.out.println("X  value " +x);

		System.out.println("Enter a Double value");
		double  d= sc.nextDouble();
		System.out.println("d  value " +d);

		System.out.println("Enter a String value");
		String  s= sc.next();
		System.out.println("s  value " +s);
		
		System.out.println("Enter a char value");
		char  ch= sc.next().charAt(0);
		System.out.println("ch  value " +ch);



	}
}