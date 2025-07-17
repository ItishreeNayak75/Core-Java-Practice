import java.util.Scanner;
class StudentCRUDApp{
public static void main(String args[]){
			Scanner sc=new Scanner (System.in);
			StudentServicelmpl service =new StudentServicelmpl();
			while(true){
			System.out.println("Press 1 -Add");
			System.out.println("Press 2 -View");
			System.out.println("Press 3 -Search");
    			System.out.println("Press 4 -Update");
			System.out.println("Press 5 -Delete");
			System.out.println("Press 6 -Exit");
			System.out.println("Enter a choice");
			int choice=sc.nextInt();
			switch(choice){
			case 1:{
				System.out.println("Enter Student id :");
				int id=sc.nextInt();
				System.out.println("Enter Student name :");
				String name=sc.nextLine();
				System.out.println("Enter Student age :");
				int age=sc.nextInt();
				System.out.println("Enter Student course :");
				String course=sc.nextLine();
				service.addStudent(id ,name,age,course);
				break;

			}
			case 2:{
				service.viewAllStudents();
				break;
			}
			case 3:{
				System.out.println("Enter Student id :");
				int sid=sc.nextInt();
				Student s=service.getStudentById(searchId);
				if (s!=null){
					System.out.println("Student id found");
			}	else{
					System.out.println("Student id not found");
					}
				break;
			}
			case 4:{
					System.out.println("Enter Student id for update :");
					int uid=sc.nextInt();
					System.out.println("Enter Student name for update :");
					String nName=sc.nextLine();
					System.out.println("Enter Student age for update :");
					int a=sc.nextInt();
					System.out.println("Enter Student course for update :");
					String c=sc.nextLine();
					service.updateStudent(uid,new Student(uid,nName,a,c));
					break;
					
			}
			case 5:{
					System.out.println("Enter Student id to delete :");
					int did=sc.nextInt();
					service.deleteStudent(deleteid);
					break;
			}
			case 6:{
					System.out.println("Exiting successfully !!");
					break;
			}
			 default:
                                System.out.println("Enter a valid choice between 1 to 6");

			}
		}
	}
  }
