class Book{
           String title;
           String author;
           int price;
         Book(String title ,String author){
               this.title=title;
               this.author=author;
                System.out.println("title is :"+title+" , author is :"+author);
         }
          Book(String title ,String author ,int price){
                this.title=title;
                this.author=author;
                this.price=price;
                System.out.println("title is :"+title+" , author is :"+author+" , price ="+price);
           }
   public static void main(String args[]){
       Book B1=new Book("math","RD Sharma");
       Book B2=new Book("physics","pandey",234);
   }
 }