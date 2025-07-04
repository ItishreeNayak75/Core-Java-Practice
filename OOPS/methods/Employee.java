class Employee{
            static String compName="Google";
            String empName;
             static void printcompany(){
                System.out.println(Employee.compName);
             }
              void printemployee(){
		System.out.println(this.empName);
               }
		public static void main(String args[]){
                  Employee.printcompany();

		Employee emp1= new Employee();
                emp1.empName="Rahul";
                emp1.printemployee();
           
		Employee emp2= new Employee();
                emp2.empName="tahul";
                emp2.printemployee();

  		}
        }