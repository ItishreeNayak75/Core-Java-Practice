import  java.util.Scanner;
              class Table5{
                  public static void main(String args[]){
                     Scanner sc = new Scanner(System.in);
                        System.out.println("Enter a number");
                        int num=sc.nextInt();
                        int i=1;
                        int mul=0;
                        for( i=1 ; i<=10 ; i++ )
                          {
                           mul =num*i;
                               System.out.println(num+"*"+i+"="+mul);
                           } //loop end
                   }
          }