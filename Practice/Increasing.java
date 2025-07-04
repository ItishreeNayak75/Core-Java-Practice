class Increasing{
                public static void main(String args[]){
                  int num=457;
                  int ld=num%10;
                  int sld=(num/10)%10;
                  int tld=(num/10)/10;
                  if(ld<sld && sld<tld){
                     System.out.println("numbers are increasing");
                   }
                  else{
                     System.out.println("numbers are not increasing");
                   }
           }
   }