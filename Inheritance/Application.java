import java.util.Scanner;
class Application{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		LaptopOperation lo=new LaptopOperation();
		while(true){
			System.out.println("1-Add Laptop\n2-View Laptop\n3-Update Laptop\n4-Delete Laptop\n5-exit");
			System.out.println("Enter Choice : ");
			int choice=sc.nextInt();
			sc.nextLine();
		
			switch(choice){
				case 1:{
					lo.addlaptop();
					break;	
				}
				case 2:{
					lo.viewlaptop();
					break;	
				}
				case 3:{
					System.out.println("Enter Laptop Id for Update :");
					int updateId=sc.nextInt();
					lo.updateLaptop(updateId);
					break;	
				}
				case 4:{
                                       System.out.println("Enter Laptop Id for Delete :");
					int deleteId=sc.nextInt();
					lo.deleteLaptop(deleteId);
					break;	
				}
				case 5:{
					return;	
				}
				default :{
				 System.out.println("Enter a valid choice between 1 to 6");
				}
			}
		}
	}
}