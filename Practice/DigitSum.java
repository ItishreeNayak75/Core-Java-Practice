class DigitSum{
               public static void main(String args[]){
                 int num1=56;
                 int ld= num1%10;
                 int sld=num1/10;
                 int num2 =ld+sld;
                 if(num1%num2==0){
                   System.out.println("sum of digit are divisible");
                 }
                 else{
                   System.out.println("sum of digit are not divisible");
                }
           }
   }