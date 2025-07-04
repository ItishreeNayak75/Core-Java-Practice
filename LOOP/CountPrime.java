import  java.util.Scanner;
            class CountPrime{
                public static void main(String args[]){
                   int pCount=0;
                   int npCount=0;
                   Scanner sc = new Scanner(System.in);
                  System.out.println("Enter a number  : ");
                  int n=sc.nextInt();
                 
                 
                  while(n!=0)
                   {
                     int ld=n%10;
                     int i=2;
                     int flag =1;
                     while(i<ld)
                      {
                      if (ld%i==0)
                       {
                        flag=0;
                       break;
                      }
                      i++;
                   } //loop end
                   if (flag==1)
                   {
                    pCount=pCount+1;
  
                   }else{
                     npCount++;
                  }
                  n/=10;
              }
             System.out.println("Total prime Digit is "+pCount);
             System.out.println("Total non-prime Digit is "+npCount);

        }
 }
                
                   