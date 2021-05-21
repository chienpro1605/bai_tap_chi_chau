package bai6;

import java.util.*;

public class School {
    private List<Student>students;

    public School(){
        this.students = new ArrayList<>();
    }
    public void add(Student student){
        this.students.add(student);
    }
    public void display(){
        for (Student a: students){
            System.out.println(a);
        }
        System.out.println("---------------------------");
    }
    public int seachStudent(String name) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(name)) {
                return i;
            }

        }

        return -1;
    }
    public void updateStudent(String name, Student student){
        int vitri = seachStudent(name);
        if (vitri == -1){
            System.out.println("không tìm thấy");
        }else {
            students.set(vitri, student);
        }
    }
    public void deleteStudent(String name){
        int vitri = seachStudent(name);
        if (vitri == -1){
            System.out.println("không tìm thấy");
        }else {
            students.remove(vitri);
        }
    }
    public void sortStudent(){
        Collections.sort(this.students);
    }
}
