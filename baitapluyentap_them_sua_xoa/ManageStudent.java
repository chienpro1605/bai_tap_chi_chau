package baitapluyentap_them_sua_xoa;

import java.util.ArrayList;
import java.util.Collections;

public class ManageStudent {
    ArrayList<Student>students;

    public ManageStudent() {
        this.students = new ArrayList<>();
    }
    public void add(Student student){
        students.add(student);
    }
    public void display(){
        for (int i = 0; i< students.size(); i++){
            System.out.println(students.get(i));
        }
        System.out.println("------------------");
    }
    public int findVitri(String name){
        for (int i = 0; i<students.size(); i++){
            if (students.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
    public void edit(String name, Student student){
        int vitri = findVitri(name);
        if (findVitri(name) == -1){
            System.out.println("không tìm thấy");
        }else {
            students.set(vitri,student);
        }
    }
    public void delete(String name){
        int vitri = findVitri(name);
        if (findVitri(name) == -1){
            System.out.println("không tìm thấy");
        }else {
            students.remove(vitri);
        }
    }
    public void sortStudent(){
        Collections.sort(this.students);
    }

}
