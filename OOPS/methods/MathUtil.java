import  java.util.Scanner;
class MathUtil{
                 public static int intAdd(int a, int b){
                 		return a+b;
               }
           public static int intMultiply(int a,int b){
                                   return a*b;
                                  }

          public static void main(String args[]){
                  Scanner sc=new Scanner(System.in);
                System.out.println("enter 1st number:");
                    int a=sc.nextInt();
                   System.out.println("enter 2nd number:");
                    int  b=sc.nextInt();
                     int resadd=MathUtil.intAdd(a,b);
                     System.out.println("addition of 2 number is :"+resadd);

                     
                    System.out.println("enter 1st number:");
                     a=sc.nextInt();
                   System.out.println("enter 2nd number:");
                     b=sc.nextInt();
                       int resmul= MathUtil.intMultiply(a,b);
                       System.out.println("multiplication of 2 number is :"+resmul);

           }
    }
