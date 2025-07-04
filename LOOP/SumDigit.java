import   java.util.Scanner;
               class SumDigit{
                      public static void main(String args[]){
                       Scanner sc=new Scanner(System.in);
                         System.out.println("Enter a number : ");
                         int number =sc.nextInt();
                          int sum=0;
                          while(number>0){
                               int ld=number%10;
                                 sum+=ld;
                            number/=10;
                          }
                       System.out.println("sum of digit " +sum);
                  }
         }
            
                       
          
