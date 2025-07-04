import   java.util.Scanner;
public class NumberGame{
             public static void Armstrong(int num){ 
                    int ld=num%10;
                    int sld=(num/10)%10;
                    int tld=(num/10)/10;
                    int x=(ld*ld*ld)+(sld*sld*sld)+(tld*tld*tld);
                    if(x==num){
                      System.out.println(num+" is a Armstrong number");
                   }else{
                      System.out.println(num+"is  not a Armstrong number");
                   }
                 }
            public static void PrimeNumber(int num){ 
                                 boolean isPrime = true;

                                        if (num <= 1) {
                                     isPrime = false;
                                          } else {
                                                for (int i = 2; i <= num / 2; i++) {
                                                       if (num % i == 0) {
                                                           isPrime = false;
                                                           break ;
                                                      }
                                                 }
                                          }

                               if (isPrime) {
                            System.out.println(num + " is a Prime number.");
                          } else {
                             System.out.println(num + " is Not a Prime number.");
                            }
                      }
                   public static void Perfect(int num){
                                 int sum=0;   
                                  for(int i=1;i<=num/2;i++){
                                       if(num%i==0){
                                       sum=sum+i;
                                      }
                                    }
                                  if(sum==num){
                                      System.out.println(num+"number is Perfect number");
                                   }else{
                                       System.out.println(num+"number is  not  a perfect number");
 
                                  }
                          }
                    public static void Palindrome(int num){
                                 if(num%11==0){
                                    System.out.println(num+"number is a palindrome");
                                       }
                                    else{
                                    System.out.println(num+"number is a palindrome");
                                    }
                        }
                     public static void ZeroOrNot(int num){
                              if(num==0){
                                    System.out.println(num+"is equals to zero");
                                       }
                                    else{
                                    System.out.println(num+"is not equals to zero");
                                    }
                        }
  
               public static void main (String args[]){
                 Scanner sc=new Scanner(System.in);
                 while(true){
                    System.out.println("1-Armstrong");
                    System.out.println("2-PrimeNumbers");
                    System.out.println("3-Perfect");
                    System.out.println("4-Palindrome");
                    System.out.println("5-ZeroOrNot");  
                     System.out.println("6-Stop");  
                   System.out.println("Enter a choice");
                     int choice=sc.nextInt();
                    sc.nextLine();
                    NumberGame obj=new NumberGame();
                    int num;
                    switch(choice) {
                      case 1:  {
                                        System.out.println("Enter a number :");
                                        num=sc.nextInt();
                                           NumberGame.Armstrong(num);
                                            break;
                                    }
                        case 2:  {
                                        System.out.println("Enter a number :");
                                        num=sc.nextInt();
                                         NumberGame.PrimeNumber(num);
                                         break;
                                    }
                        case 3:  {
                                        System.out.println("Enter a number :");
                                        num=sc.nextInt();
                                            NumberGame.Perfect(num);
                                              break;
                                    }
                       case 4:  {
                                        System.out.println("Enter a number :");
                                        num=sc.nextInt();
                                         NumberGame.Palindrome(num);
                                          break;
                                    }
   
			 case 5:  {
                                        System.out.println("Enter a number :");
                                        num=sc.nextInt();
                                         NumberGame.ZeroOrNot(num);
                                         break;
                                    }
                          case 6:  {
                                             break;
                                    }
                       default:
                                System.out.println("Enter a valid choice between 1 to 6");
                         }
                  }
               }
          }
				
                            
   