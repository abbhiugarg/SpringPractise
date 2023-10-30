import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Driver {

    private static String migrateDetail(List<Student> list1, int studentId, String hostelName, String electiveSub) {
        if (studentId < 0){
            return "Please provide valid studentId";
        }
        for (Student stu: list1) {
            if (stu.getRegdNo() == studentId){
                stu.setHostelName(hostelName);
                stu.setElectiveSubject(electiveSub);
                return "Student details update";
            }
        }
        return "Student of id " + studentId + " is not found";
    }

    private static Student getDetails(List<Student> list1, int id) {
        if (id < 0){
            return null;
        }
        for (Student stu: list1) {
            if (stu.getRegdNo() == id){
                return stu;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Wing1","Noida",100,"Abhiu Garg",1,"Java",55);
        Student s2 = new Student("Wing2","Mathura",200,"Ayush",2,"SQL",65);
        Student s3 = new Student("Wing3","Jaipur",300,"Yash",3,"C++",75);
        Student s4 = new Student("Wing4","Pune",400,"Taarak",4,"Python",85);
        Student s5 = new Student("Wing5","Delhi",700,"Monu",5,"Physics",95);

        //System.out.println(s1.getHostelName());
        List<Student> list1 = new ArrayList<>();
        list1.add(s1);
        list1.add(s2);
        list1.add(s3);
        list1.add(s4);
        list1.add(s5);
        //System.out.println(list1.size());

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter student new details");
        int studentId = sc.nextInt();
        String hostelName = sc.next();
        String electiveSub = sc.next();

        String result1 = migrateDetail(list1,studentId,hostelName,electiveSub);
        System.out.println(result1);

        System.out.println("Please enter student id");
        int id = sc.nextInt();
        Student result2 = getDetails(list1,id);
        System.out.println(result2);
        System.out.println(result2.getHostelName());
        System.out.println(result2.getElectiveSubject());
        System.out.println(result2.getStudentName());
    }




}
