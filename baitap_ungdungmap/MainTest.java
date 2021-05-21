package baitap_ungdungmap;

import java.util.HashMap;
import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        ManagermentStudent sv = new ManagermentStudent();

        sv.addStudent(12,new Student(12,"chuong",12,"nam dinh", "nu"));
        sv.addStudent(50,new Student(50,"ha",45,"ha noi", "nu"));
        sv.addStudent(15,new Student(15,"may",12,"nam dinh", "nu"));
        sv.addStudent(34,new Student(34,"tu",12,"nam dinh", "nu"));
        sv.addStudent(2,new Student(2,"tu",12,"nam dinh", "nu"));
        sv.addStudent(7,new Student(7,"tu",12,"nam dinh", "nu"));
        sv.display();

        System.out.println(sv.seachStudent(15));

        Scanner sc = new Scanner(System.in);
        System.out.println("nhập id cần sửa");
        int id = sc.nextInt();
        if (sv.check(id)){
            sv.editStudent(id,new Student(15,"may",80,"nam dinh", "nu"));
            sv.display();
        }

        System.out.println("nhập id muốn xóa");
        int idd = sc.nextInt();
        if (sv.check(idd)){
            sv.deleteStudent(idd);
            sv.display();
        }
        sv.sortStudent();

        sv.display();
    }
}
