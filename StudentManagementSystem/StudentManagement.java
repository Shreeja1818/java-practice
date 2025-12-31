import java.util.Scanner;

public class StudentManagement {

    static String[] names = new String[50];
    static int[] ids = new int[50];
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent(sc);
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    searchStudent(sc);
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    static void addStudent(Scanner sc) {
        System.out.print("Enter student ID: ");
        ids[count] = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter student name: ");
        names[count] = sc.nextLine();

        count++;
        System.out.println("Student added successfully!");
    }

    static void viewStudents() {
        if (count == 0) {
            System.out.println("No students found.");
            return;
        }

        System.out.println("\nStudent List:");
        for (int i = 0; i < count; i++) {
            System.out.println("ID: " + ids[i] + ", Name: " + names[i]);
        }
    }

    static void searchStudent(Scanner sc) {
        System.out.print("Enter student ID to search: ");
        int searchId = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (ids[i] == searchId) {
                System.out.println("Student Found!");
                System.out.println("ID: " + ids[i] + ", Name: " + names[i]);
                return;
            }
        }

        System.out.println("Student not found.");
    }
}
