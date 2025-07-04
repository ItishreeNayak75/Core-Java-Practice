class Access{
            static int x=45;
            int y;
           static void showStatic(){
              System.out.println(Access.x);
              System.out.println(this.y);
                 }
              void showInstance(){
               System.out.println(Access.x);
               System.out.println(this.y);
               }
             public static void  main(String args[]){
               Access.showStatic();
 
               Access z1=new Access();
               z1.y=35;
               z1.showInstance();

               Access z2=new Access();
               z2.y=55;
               z2.showInstance();
          }
      }