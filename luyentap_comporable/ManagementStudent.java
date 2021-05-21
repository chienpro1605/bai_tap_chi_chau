package luyentap_comporable;

import java.util.ArrayList;

public class ManagementStudent {
    ArrayList<Student>students = null;

    public ManagementStudent(){
        students = new ArrayList<>();
        students.add(new Student("tu", 20));
        students.add(new Student("anh", 25));
        students.add(new Student("oanh", 40));
        students.add(new Student("ha", 50));
        students.add(new Student("chien", 23));
    }
    public ManagementStudent(ArrayList<Student>students){
        this.students = students;
    }
    void display(){
        for (Student st: students){
            System.out.println(st.toString());
        }
    }
}
