import java.util.Scaner;
class Flight{
              static String takeoffPlace;
              static String landingPlace;
               int price;
               int date;
               static void showflightDetails(){
                System.out.println(Flight.takeoffPlace);
                System.out.println("Takeoffplace : "+takeoffplace);
                System.out.println(Flight.landingPlace);
                System.out.println("landingplace : "+landingplace);
                }
               void bookSeat(){
                System.out.println(this.price);
                System.out.println("price is : "+price);
                System.out.println(this.date);
                System.out.println("date is : "+date);
               }
          public static void main(String args[]){
                Scanner sc=new Scanner(System.in);
                   Flight.showflightDetails();
                
                  Flight fly1=new Flight ();
                  fly1.price=234;
                  fly1.date=56;
                   fly1.bookSeat();
           }
      }                
