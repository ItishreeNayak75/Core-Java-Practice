class Phone{
               static String OS="Android";
               int number;
              static void getOSName(){
                 System.out.println(Phone.OS);
               }
               void call(){
                     System.out.println(this.number);
                  }
             public static void main(String args[]){
                  Phone.getOSName();
 
                 Phone no1=new Phone();
                 no1.number=637263;
                 no1.call();
               
                 Phone no2=new Phone();
                 no2.number=654763;
                 no2.call();
            }
        }


