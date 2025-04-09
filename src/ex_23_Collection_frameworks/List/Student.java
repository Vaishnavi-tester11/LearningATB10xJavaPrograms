package ex_23_Collection_frameworks.List;

public class Student {
    private String name;
    private String rollno;
    Student(String name, String RollNo){
        this.name=name;
        this.rollno=RollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public void details(){
        System.out.println("Student Name is : "+ this.name);
        System.out.println("Student RollNo is : " + this.rollno);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollno='" + rollno + '\'' +
                '}';
    }
}
