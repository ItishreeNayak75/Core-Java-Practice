class Library{
                String bookName; 
                static void openHours(){
                System.out.println("Library open from 9AM to 5PM");
               }
               void borrowBook(){
                    System.out.println(this.bookName);
                   }
              public static void main(String args[]){
                  Library.openHours();
               
                   Library book1=new Library();    
                   book1.bookName="RD Sharma";
                   book1.borrowBook();

                   Library book2=new Library();    
                   book2.bookName="AtomicHabit";
                   book2.borrowBook();
                 }
             }