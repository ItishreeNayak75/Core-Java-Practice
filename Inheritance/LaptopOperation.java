import java.util.Scanner;
class LaptopOperation{
	Scanner sc=new Scanner(System.in);
	private Laptop[] Laptop=new Laptop[5];
	private int count=0;
	public void addLaptop(){
		System.out.println("Enter Laptop Id     : ");
		int newId=sc.nextInt();
		sc.nextLine();

		System.out.println("Enter Brand Name  : ");
		String newName=sc.nextLint();

		System.out.println("Enter  Laptop Capacity : ");
		int newCapacity=sc.nextLint();

		System.out.println("Enter Laptop Price  : ");
		double newPrice=sc.nextDouble();
		
		if(count>=Laptop.length){
			System.out.println("Storage Is Full!");
		}else{
			Laptop lap=new Laptop();
			lap.setId(newId);
			lap.setBrandName(newName);
			lap.setCapacity(newCapacity);
			lap.setPrice(newPrice);
		
			Laptop[count]=lap;
			count++;
			System.out.println("Laptop Added Successfully!");
		}
	}
	
	public void viewLaptop(){
		if(count<=0){
			System.out.println("No such Laptop  Available!");
		}else{
			System.out.println("----------list of Laptop----------------");
			for(int i=0;i<count;i++){
				System.out.println("Laptop "+(i+1));
				System.out.println("Laptop Id    : "+Laptops[i].getId());
				System.out.println("Laptop brandname  : "+Laptops[i].getBrandName());
				System.out.println("Laptop capacity: "+Laptops[i].getCapacity());
				System.out.println("Laptop price : "+Laptops[i].getPrice());
				System.out.println();
			}
		}
	}
	public void updateLaptop(int updateId){
		boolean b=false;
		for(int i=0;i<count;i++){
			if(Laptops[i].getId()==updateId){
				System.out.println("Enter Brand Name   : ");
				String newBrandName=sc.nextLine();
				sc.nextLine();
				System.out.println("Enter Laptop Capacity : ");
				Int newCapacity=sc.nextLine();
				
				System.out.println("Enter Laptop Price  : ");
				double newPrice=sc.nextDouble();
				Laptops[i].setBrandName(newName);
				Laptops[i].setCapacity(newCapacity);
				Laptops[i].setPrice(newPrice);
				b=true;
				System.out.println("LAPtop Updated Successfully!");
			}		
		}
		if(!b){
			System.out.println("Laptop Id Not Found!");
		}
		
	}
              public void deleteLaptop(int deleteid){
                         boolean b=false;
                          int size=0;
                      for (int i = 0; i < size; i++) {
                            if(Laptops[i].getId()==deleteid){ 
                              for (int j = i; j < size - 1; j++) {
                                 Laptops[j] = Laptops[j + 1];
                             }
                                  size--; 
                                 break;
                             }
                               }
                      if (!b) {
                      System.out.println("Laptop Id Not Found!");
                       }
                }
   }













