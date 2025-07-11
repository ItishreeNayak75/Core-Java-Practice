
package Exception; 
import java.util.Scanner;
        class Odd{
                 static void num(int n) throws IntException{
                      if(n%2!=0){
			throw new IntException ("Number is Odd!");
                      }
                      else{
                        System.out.println("Number is Even!");
                      }
		}
               public static void main(String args[]){
                      Scanner sc=new Scanner(System.in);
                        System.out.println("Enter a number");
                            int n=sc.nextInt();
                         try{
                               num(n);
			      } catch(Exception e){
                                 e.printStackTrace();
				}
			 
 		}
	}