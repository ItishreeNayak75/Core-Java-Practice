class Oneto100{
               public static void main(String args[]){
                 int n=1;
                 int sum=0;
                 while(n>=1 && n<=10)
                  {
                    int flag=1;
                    int i=2;
                    
                    while (i<n)
                     {
                       if(n%i==0)
                        {
                          flag=0;
                          break;
                         }
                       i++;
                     }//end of inner while loop
                    if(flag==1)
                     {
                     sum=sum+n;
                   }
                   n++;
               } //End of  while Loop
              System.out.println("Sum ="+sum);
          }
    }
                      