public class Student {
    private String name;
    private int age;
    private String id;
    private float grade;

    public Student() {
    }

    public Student(String name, int age, String id, float grade) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.grade = grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    public float getGrade() {
        return grade;
    }

    public void UpdateName(String name) {
        this.name = name;
    }

    public void UpdateAge(int age) {
        this.age = age;
    }

    public void UpdateId(String id) {
        this.id = id;
    }

    public void UpdateGrade(float grade) {
        this.grade = grade;
    }

    public void Display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("ID: " + id);
        System.out.println("Grade: " + grade);
    }
}
