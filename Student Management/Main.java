import java.util.Scanner;

public class Main {
    static Scanner cin = new Scanner(System.in);

    static boolean isExistStudent(Student[] students, String id) {
        boolean flag = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getId().equals(id)) {
                flag = true;
                return flag;
            }
        }
        return flag;
    }

    public static void createSTD(int n, Student[] students) {

        System.out.println("Enter the details of the Students: ");

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the details of Student " + (i + 1) + ": ");

            System.out.print("Enter the name: ");
            String name = cin.nextLine();

            System.out.print("Enter the age: ");
            int age = cin.nextInt();
            System.out.print("Enter the id: ");
            String id = cin.nextLine();
            System.out.print("Enter the grade: ");
            float grade = cin.nextFloat();
            students[i] = new Student(name, age, id, grade);
        }

    }

    public static void Search(int n, Student[] students) {
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the Student id: ");
            String stdID = cin.nextLine();
            if (students[i].getId().equals(stdID)) {
                students[i].Display();
            }
        }

    }

    public static void Update(int val, String id, Student[] students) {
        switch (val) {
            case 1: {
                System.out.println("Enter the new name: ");
                String name = cin.nextLine();
                for (int i = 0; i < students.length; i++) {
                    if (students[i].getId().equals(id)) {
                        students[i].UpdateName(name);
                    }
                }
                break;
            }
            case 2: {
                System.out.println("Enter the new age: ");
                int age = cin.nextInt();
                for (int i = 0; i < students.length; i++) {
                    if (students[i].getId().equals(id)) {
                        students[i].UpdateAge(age);
                    }
                }
                break;
            }

            case 3: {
                System.out.println("Enter the new grade: ");
                float nage = cin.nextFloat();
                for (int i = 0; i < students.length; i++) {
                    if (students[i].getId().equals(id)) {
                        students[i].UpdateGrade(nage);
                    }
                }
                break;
            }

            case 4: {
                System.out.println("Enter the new id: ");
                String nid = cin.nextLine();
                boolean flag = false;

                while (!flag) {
                    flag = isExistStudent(students, nid);
                    if (flag) {
                        System.out.println("This id is already exist, please enter another id: ");
                        nid = cin.nextLine();
                    }
                }
                for (int i = 0; i < students.length; i++) {
                    if (students[i].getId().equals(id)) {
                        students[i].UpdateId(nid);
                    }
                }
                break;
            }
            default:
                break;
        }
    }

    public static void Delete(String id, Student[] students) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getId().equals(id)) {
                students[i] = null;
            }
        }
    }

    public static void main(String[] args) {
        // Scanner cin = new Scanner(System.in);
        int n = 1;
        Student[] students = new Student[n];

        System.out.println("Enter the number of Students: ");
        n = cin.nextInt();
        System.out.println("What do you want to do? ");
        System.out.println("1- Create Student");
        System.out.println("2- Search for Student");
        System.out.println("3- Update Student");
        System.out.println("4- Delete Student");

        int choice = cin.nextInt();
        switch (choice) {
            case 1:
                createSTD(n, students);
                break;
            case 2:
                Search(n, students);
                break;
            case 3: {
                System.out.println("Enter the id of the student you want to update: ");
                String id = cin.nextLine();
                System.out.println("What do you want to update? \n1 for Name\n2 for Age\n3 for Grade\n4 for ID");
                int val = cin.nextInt();
                Update(val, id, students);
                break;
            }
            case 4: {
                System.out.println("Enter the id of the student you want to delete: ");
                String id = cin.nextLine();
                Delete(id, students);
                break;
            }

            default:
                break;
        }

    }
}