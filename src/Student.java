public class Student {
    String name;
    String phoneNumber;
    Double math;
    Double science;
    Double chemistry;
    public Student (){};

    public Student (String name, String phoneNumber, Double math, Double sc, Double ch){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.math = math;
        this.science = sc;
        this.chemistry = ch;

    }
    public Student (String phone, String nam){
        this(nam,phone, 0.0,0.0,0.0);

    }

    public double totalMarks(){
        return this.math+this.science+this.chemistry;
    }

}
