void main (){
    System.out.println("hello world");
}
class Student {
    // Encapsulation
    private String name;
    private int regNo;
    private String dept;
    private int mathsMarks;
    private int phyMarks;
    private int csMarks;

    // Static variable
    static int studentCount = 0;

    // Constructor 1 (name + regNo)
    Student(String name, int regNo) {
        this.name = name;
        this.regNo = regNo;
        this.dept = "Not Assigned";
        studentCount++;
    }

    // Constructor 2 (name + regNo + dept)
    Student(String name, int regNo, String dept) {
        this.name = name;
        this.regNo = regNo;
        this.dept = dept;
        studentCount++;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getRegNo() {
        return regNo;
    }

    public String getDept() {
        return dept;
    }

    public int getMathsMarks() {
        return mathsMarks;
    }

    public int getPhyMarks() {
        return phyMarks;
    }

    public int getCsMarks() {
        return csMarks;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    // Method Overloading - Update Marks
    public void updateMarks(int maths, int phy) {
        this.mathsMarks = maths;
        this.phyMarks = phy;
    }

    public void updateMarks(int maths, int phy, int cs) {
        this.mathsMarks = maths;
        this.phyMarks = phy;
        this.csMarks = cs;
    }

    // Static method
    public static void displayStudentCount() {
        System.out.println("Total Students = " + studentCount);
    }

    // Display details
    public void display() {
        System.out.println("\nStudent Name : " + name);
        System.out.println("Register No  : " + regNo);
        System.out.println("Department   : " + dept);
        System.out.println("Maths Marks  : " + mathsMarks);
        System.out.println("Physics Marks: " + phyMarks);
        System.out.println("CS Marks     : " + csMarks);
    }
}

public class Main {
    public static void main(String[] args) {

        // Instantiation of 3 students
        Student s1 = new Student("Arun", 101);
        Student s2 = new Student("Priya", 102, "CSE");
        Student s3 = new Student("Kavin", 103, "IT");

        // Using overloaded methods
        s1.updateMarks(85, 90, 88);
        s2.updateMarks(92, 89, 95);
        s3.updateMarks(80, 84, 86);

        // Display details
        s1.display();
        s2.display();
        s3.display();

        // Static method call
        Student.displayStudentCount();
    }
}

