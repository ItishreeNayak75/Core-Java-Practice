  class Car{
            static String Compname="AUDI";
            String carname;
               public void drive(){
                        System.out.println(this.carname);
               }
               static void totalCars(){
                        System.out.println(Car.Compname);
                }
               public static void main(String args[]){
                  Car.totalCars();

		  Car car1=new Car();
                  car1.carname="Kutta";
                  car1.drive();

		  Car car2=new Car();
                  car2.carname="Dutta";
                  car2.drive();

                }
         }        