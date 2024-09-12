public class StudentSchema {
    // all variables---------------
    private String name = "";
    private int age = 0;
    private String address = "";
    private String phoneNumber = "";
    private String email = "";
    private String studentId = "";
    private String department = "";
    private String semester = "";
    private String section = "";
    private String rollNumber = "";
    private String fatherName = "";
    private String motherName = "";
    private String guardianName = "";
    private String guardianPhoneNumber = "";
    private String guardianEmail = "";
    private String guardianAddress = "";
    private String bloodGroup = "";
    private double grade = 0.0;

    // constructor---------------

    public StudentSchema(String name, String rollNumber, int age, double grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
        this.grade = grade;
    }

    // get methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getDepartment() {
        return department;
    }

    public String getSemester() {
        return semester;
    }

    public String getSection() {
        return section;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public String getGuardianName() {
        return guardianName;
    }

    public String getGuardianPhoneNumber() {
        return guardianPhoneNumber;
    }

    public String getGuardianEmail() {
        return guardianEmail;
    }

    public String getGuardianAddress() {
        return guardianAddress;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public double getGrade() {
        return grade;
    }

    // getting basic info of stuent
    public BasicInfo getBasicInfo() {
        return new BasicInfo(name, age, rollNumber, grade);
    }
    public void printBasicInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }

    // necessary classes
    public class BasicInfo {
        private String name;
        private int age;
        private String roll;
        private double grade;

        public BasicInfo(String name, int age, String roll, double grade) {
            this.name = name;
            this.age = age;
            this.roll = roll;
            this.grade = grade;
        }

        public String name() {
            return name;
        }

        public int age() {

            return age;
        }

        public String roll() {
            return roll;
        }

        public double grade() {
            return grade;
        }

    }

}