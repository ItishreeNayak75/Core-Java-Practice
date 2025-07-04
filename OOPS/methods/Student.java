class Student{
            static String  schoolname="HighSchool";
             String studentname;
             int rollnumber;
           static void getSchoolName(){
                System.out.println(Student.schoolname);
             }
               void showDetails(){
                       System.out.println(this.studentname);
                        System.out.println(this.rollnumber);
                  }
             public static void main(String args[]){
                  Student.getSchoolName();
              
              Student stu1=new Student();
              stu1.studentname="Bikash";
              stu1.rollnumber=23;
              stu1.showDetails();

             
              Student stu2=new Student();
              stu2.studentname="Akash";
              stu2.rollnumber=24;
              stu2.showDetails();
          }
             
}
                       