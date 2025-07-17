public class StudentServiceImpl implements StudentOperation {
    public Student[] students = new Student[100];
    public int count = 0;


    public void addStudent(Student student) {
        if (count < students.length) {
            students[count++] = student;
            System.out.println("Student added successfully!");
        } else {
            System.out.println("Student list is full!");
        }
    }

  
    public void viewAllStudents() {
        if (count == 0) {
            System.out.println("No students available.");
        }
        for (int i = 0; i < count; i++) {
            System.out.println(students[i]);
        }
    }

  
    public Student getStudentById(int id) {
        for (int i = 0; i < count; i++) {
            if (students[i].id == id) {
                return students[i];
            }
        }
        return null;
    }

   
    public void updateStudent(int id, Student updatedStudent) {
        for (int i = 0; i < count; i++) {
            if (students[i].id == id) {
                students[i] = updatedStudent;
                System.out.println("Student updated successfully!");
                return;
            }
        }
        System.out.println("Student not found.");
    }

  
    public void deleteStudent(int id) {
        for (int i = 0; i < count; i++) {
            if (students[i].id == id) {
                for (int j = i; j < count - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[--count] = null;
                System.out.println("Student deleted successfully!");
                return;
            }
        }
        System.out.println("Student not found.");
    }
}