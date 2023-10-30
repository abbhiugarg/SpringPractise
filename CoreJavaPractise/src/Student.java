public class Student extends Hostel implements Department{

    private String studentName;
    private int regdNo;
    private String electiveSubject;
    private int avgMarks;

    public Student(String hostelName, String hostelLocation, int noOfRooms, String studentName, int regdNo, String electiveSubject, int avgMarks) {
        super(hostelName, hostelLocation, noOfRooms);
        this.studentName = studentName;
        this.regdNo = regdNo;
        this.electiveSubject = electiveSubject;
        this.avgMarks = avgMarks;
    }

//    public Student(String studentName, int regdNo, String electiveSubject, int avgMarks) {
//        this.studentName = studentName;
//        this.regdNo = regdNo;
//        this.electiveSubject = electiveSubject;
//        this.avgMarks = avgMarks;
//    }

    @Override
    public void displayDeptName() {
        System.out.println(deptName);
    }

    @Override
    public void displayDeptHead() {
        System.out.println(deptHead);
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getRegdNo() {
        return regdNo;
    }

    public void setRegdNo(int regdNo) {
        this.regdNo = regdNo;
    }

    public String getElectiveSubject() {
        return electiveSubject;
    }

    public void setElectiveSubject(String electiveSubject) {
        this.electiveSubject = electiveSubject;
    }

    public int getAvgMarks() {
        return avgMarks;
    }

    public void setAvgMarks(int avgMarks) {
        this.avgMarks = avgMarks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", regdNo=" + regdNo +
                ", electiveSubject='" + electiveSubject + '\'' +
                ", avgMarks=" + avgMarks +
                '}';
    }
    void displayStudentName(){
        System.out.println(this.studentName);
    }
    void displayRegdNo(){
        System.out.println(this.regdNo);
    }
    void displayElectiveSubject(){
        System.out.println(this.electiveSubject);
    }
    void displayAvgMarks(){
        System.out.println(this.avgMarks);
    }
}
