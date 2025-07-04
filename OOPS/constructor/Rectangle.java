class Rectangle{
          int length;
          int width;
          Rectangle(int length ,int width){
          this.length=length;
          this .width=width;
          }
         Rectangle(Rectangle R){
          this.length=R.length;
          this .width=R.width;
       System.out.println("length is ="+length+" ,width is="+width);
         }
          public static void main(String args[]){
           Rectangle rec1=new Rectangle(33,44);
           Rectangle rec2=new Rectangle(rec1);
        }
    }
