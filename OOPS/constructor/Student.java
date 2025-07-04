class Student{
       int studentId;
       String studentName;
        char grade;
         Student(){
             this(234 ,"Radha" , 'A');
         }
     Student(int studentId ,String studentName ,char grade){
          this.studentId=studentId;
          this.studentName=studentName;
          this.grade=grade;
           System.out.println("studentid is ="+studentId+",studentname= "+studentName+",grade ="+grade);
      }
     public static void main(String args[]){
      Student stu1=new Student();
    }
  }
     