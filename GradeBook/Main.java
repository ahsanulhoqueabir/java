public class Main {

    public static void main(String[] args) {
        gradeDB db = new gradeDB();
        System.err.println("Welcome to the grade book for");
        System.err.println("Object Oriented Programming-II Lab");
        System.err.println("====================================================");
        System.err.println("The grades are:");
        db.printGrade();
        db.gradeDistribtion();
    }
}
