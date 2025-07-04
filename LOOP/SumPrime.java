class SumPrime{
              public static void main(String args[]){
                  int num =7;
                  int flag=1;
                  int i=2;
                  while(i<num/2)
                  {
                      if(num%i==0)
                      {
                            flag=0;
                         break;
                      }
                      i++;
                  }
                  if (flag==1)
                    {
                        System.out.println("number is prime ");
                    }
                  else
                   {
                     System.out.println("number is not prime");
                  }
           }
    } 
                                    
 