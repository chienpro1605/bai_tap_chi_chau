package luyentap_comparator;

import luyentap_comporable.Student;

import java.util.ArrayList;

public class ManagementStudent {
    ArrayList<luyentap_comporable.Student>students = null;

    public ManagementStudent(){
        students = new ArrayList<>();
        students.add(new luyentap_comporable.Student("tu", 20));
        students.add(new luyentap_comporable.Student("anh", 25));
        students.add(new luyentap_comporable.Student("oanh", 40));
        students.add(new luyentap_comporable.Student("ha", 50));
        students.add(new luyentap_comporable.Student("chien", 23));
    }
    public ManagementStudent(ArrayList<luyentap_comporable.Student>students){
        this.students = students;
    }
    void display(){
        for (Student st: students){
            System.out.println(st.toString());
        }
    }
}
