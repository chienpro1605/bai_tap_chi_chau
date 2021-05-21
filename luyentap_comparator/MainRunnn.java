package luyentap_comparator;

import luyentap_comporable.Student;

import java.util.Collections;
import java.util.Comparator;

public class MainRunnn {
    public static void main(String[] args) {
        ManagementStudent abc = new ManagementStudent();
        System.out.println("xắp xếp theo tên");
        Collections.sort(abc.students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        abc.display();
        System.out.println("sắp xếp theo tuổi");
        Collections.sort(abc.students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        abc.display();
    }

}
