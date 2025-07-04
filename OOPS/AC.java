class AC{
              String brandname;
              int star;
              int warrenty;
              float ton;

               void capacity(){}
                void power(){} 

               public static void main(String args[]){
             		  AC ac1=new AC();
              		  ac1.brandname="Lloyd";
             		  ac1.star=3;
            		  ac1.warrenty=5;
            		  ac1.ton=1.5f;
                  	 System.out.println("AC1: " + ac1.brandname + ", " + ac1.star + " Star, " + ac1.warrenty + " Year Warranty, " + ac1.ton + " Ton");
               System.out.println("------------------------------------------------------------------");

               AC ac2=new AC();
               ac2.brandname="Daikin";
               ac2.star=3;
               ac2.warrenty=10;
               ac2.ton=1.5f;
                 System.out.println("AC2: " + ac2.brandname + ", " + ac2.star + " Star, " + ac2.warrenty + " Year Warranty, " + ac2.ton + " Ton");
                  System.out.println("------------------------------------------------------------------------------------");

              AC ac3=new AC();
              ac3.brandname="Samsung";
               ac3.star=5;
               ac3.warrenty=2;
               ac3.ton=2.0f;
                
                     System.out.println("AC3: " + ac3.brandname + ", " + ac3.star + " Star, " + ac3.warrenty + " Year Warranty, " + ac3.ton + " Ton");
                 }
 }