public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("nav", "647-882-2224", 20.0, 20.0,10.0);
        Student student2 = new Student("tej", "647-882-1114", 40.0, 40.0,20.0);

       Double res1 = student1.totalMarks();
        Double res2 = student2.totalMarks();
      //System.out.println(student.phoneNumber);

        System.out.println("Student#1 " + res1 +" and Student#2 "+res2);
    }
}