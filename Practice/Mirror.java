class Mirror{
             public static void main(String args[]){
             int num1=38;
             int num2=83;
             int ld1=num1%10;
             int sld1=num1/10;
             int ld2=num2%10;
             int sld2=num2/10;
             if(ld1==sld2 && ld2==sld1){
               System.out.println("two numbers are mirror numbers");
             }
              else{
                System.out.println("two numbers are not mirror numbers");
             }
        }
  }