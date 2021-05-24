package baitap_ungdungmap;

import java.util.HashMap;
import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
//        ManagermentStudent sv = new ManagermentStudent();
//
//        sv.addStudent(12,new Student(12,"chuong",12,"nam dinh", true));
//        sv.addStudent(50,new Student(50,"ha",45,"ha noi", false));
//        sv.addStudent(15,new Student(15,"may",12,"nam dinh", true));
//        sv.addStudent(34,new Student(34,"tu",12,"nam dinh", false));
//        sv.addStudent(2,new Student(2,"tu",12,"nam dinh", true));
//        sv.addStudent(7,new Student(7,"tu",12,"nam dinh", false));
//        sv.display();
//
//        System.out.println(sv.seachStudent(15));
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhập id cần sửa");
//        int id = sc.nextInt();
//        if (sv.check(id)){
//            sv.editStudent(id,new Student(15,"may",80,"nam dinh", true));
//            sv.display();
//        }
//
//        System.out.println("nhập id muốn xóa");
//        int idd = sc.nextInt();
//        if (sv.check(idd)){
//            sv.deleteStudent(idd);
//            sv.display();
//        }
//        sv.sortStudent();
//
//        sv.display();
        Scanner sc = new Scanner(System.in);
        ManagermentStudent sv = new ManagermentStudent();
        int choice;
        while (true){
            displayMenu();
            System.out.println("nhập lựa chọn:");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("nhập mã sinh viên");
                    int id = sc.nextInt();
                    if (sv.check(id)){
                        System.out.println("mã sinh viên này đã tồn tai, thử lại");
                    }else {
                        System.out.println("nhập tên sinh viên vào đây");
                        String name = sc.next();
                        System.out.println("nhập tuổi ");
                        int age = sc.nextInt();
                        System.out.println("nhập địa chỉ");
                        String address = sc.next();
                        System.out.println("nhập giới tính");
                        boolean gender = sc.nextBoolean();
                        Student sv1 = new Student(id,name,age,address,gender);
                        sv.addStudent(id,sv1);
                    }
                    break;
                case 2:
                    System.out.println("nhập id sinh viên cần sửa");
                    id = sc.nextInt();
                    if (sv.check(id)){
                        System.out.println("nhập tên mới");
                        String name = sc.next();
                        System.out.println("tuổi mới");
                        int age = sc.nextInt();
                        System.out.println("nhập địa chỉ mới");
                        String address = sc.next();
                        System.out.println("nhập giới tính");
                        boolean gender = sc.nextBoolean();
                        Student sv2 = new Student(id, name, age, address, gender);
                        sv.editStudent(id,sv2);
                    }else {
                        System.out.println("không tìm thấy mã sinh viên này");
                    }
                    break;
                case 3:
                    System.out.println("nhập id sinh viên cần xóa");
                    id = sc.nextInt();
                    if (sv.check(id)){
                        sv.deleteStudent(id);
                    }else {
                        System.out.println("k tìm thấy mã sv này");
                    }
                    break;
                case 4:
                    System.out.println("nhập id sv cần tìm");
                    id = sc.nextInt();
                    sv.seachStudent(id);
                    break;
                case 5:
                    System.out.println("danh sách sinh viên là");
                    sv.display();
                    break;
                case 6:
                    sv.sortStudent();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("nhập lại");
            }
        }
    }
    public static void displayMenu(){
        System.out.println("---------------Menu------------------");
        System.out.println("1. thêm sinh viên");
        System.out.println("2. sửa sinh viên");
        System.out.println("3. xóa sinh viên");
        System.out.println("4. tìm kiếm sinh viên");
        System.out.println("5. hiển thị sinh viên");
        System.out.println("6. xắp xếp");
        System.out.println("0. thoát");
        System.out.println("----------------------------------------");
    }
}
