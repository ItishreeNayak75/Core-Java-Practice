class Student {
    int id;
    String name;
    static String college = "Opentechz";
    {
        System.out.println("Instance Block: Student Created");
    }
    Student(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("Constructor: " + name);
    }
    public static void main(String[] args) {
        Student s1 = new Student(1, "Rahul");
        Student s2 = new Student(2, "Priya");
       }
   }