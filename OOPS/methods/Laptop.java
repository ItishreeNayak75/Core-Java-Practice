class Laptop{
                static String brandName="Asus";
                int lapRyzen;
                int lapSSD;
               static void setBrand(){
                        System.out.println(Laptop.brandName);
                }
                void getLaptopInfo(){
                       System.out.println(this.lapRyzen);
                       System.out.println(this.lapSSD);
                }
               public static void main(String args[]){
                     Laptop.setBrand();
        
                     
                       Laptop lap1=new Laptop();
                       lap1.lapRyzen=5;
                       lap1.lapSSD=512;
                       lap1.getLaptopInfo();
 
                       Laptop lap2=new Laptop();
                       lap2.lapRyzen=7;
                       lap2.lapSSD=512;
                       lap2.getLaptopInfo();

                   }
              }