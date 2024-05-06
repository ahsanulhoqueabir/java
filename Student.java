// package OOP;

public class Student {
    // attributes
    private String name;
    private int rollNumber;
    private int age;
    private char grade;

    // Constructor
    public Student() {
        this.name = null;
        this.rollNumber = 0;
        this.age = 0;
        this.grade = '0';
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public void toDsiplayInfo() {
        System.out.println("Studet information");
        System.out.println("Name: " + getName());
        System.out.println("Roll: " + getRollNumber());
        System.out.println("Age: " + getAge());
        System.out.println("Grade: " + getGrade());

    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("John Doe");
        student.setRollNumber(123456);
        student.setAge(20);
        student.setGrade('A');
        student.toDsiplayInfo();
    }
}