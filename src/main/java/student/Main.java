package student;

import student.entity.Student;
import student.service.StudentService;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        StudentService service = new StudentService();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("\n==== STUDENT MANAGEMENT ====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    scanner.nextLine();
                    System.out.println("Name: ");
                    String name = scanner.nextLine();
                    System.out.println("Email: ");
                    String email = scanner.nextLine();
                    System.out.println("Age:");
                    int age = scanner.nextInt();
                    service.createStudent(name,email,age);
                    System.out.println("Student created: " + name + email + age);
                    break;

                case 2:
                    List<Student> students = service.getStudents();
                    students.forEach(s ->
                            System.out.println(s.getId() + " | " +
                                    s.getName() + " | " +
                                    s.getEmail() + " | " +
                                    s.getAge()));
                    break;

                case 3:
                    scanner.nextLine();
                    System.out.println("Enter student id: ");
                    long id = scanner.nextLong();
                    System.out.println("Enter new student name: ");
                    scanner.nextLine();
                    String newName = scanner.nextLine();
                    service.updateStudent(id,newName);
                    break;

                case 4:
                    System.out.println("Enter id of student to be deleted: ");
                    scanner.nextLine();
                    long deleteId = scanner.nextLong();
                    service.deleteStudent(deleteId);
                    System.out.println("Student deleted!");
                    break;

                case 5:
                    System.exit(0);
            }
        }
    }
}