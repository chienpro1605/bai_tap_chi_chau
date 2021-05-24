package bai_tap_chuong_trinh_tong_hop_oop;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLySinhVien {
       ArrayList<Student> arr = new ArrayList<>();

    public void addStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập mã số sinh viên");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("nhập tên sinh viên");
        String name = sc.nextLine();

        System.out.println("nhập tuổi sinh viên");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("nhập địa chỉ sinh viên");
        String address = sc.nextLine();

        System.out.println("nhập điểm tb sv");
        double gpa = sc.nextDouble();

        Student student = new Student(id,name,age,address,gpa);
        arr.add(student);
    }
    public void editStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập id sinh viên cần sửa");
        int id = sc.nextInt();
        boolean timThay = false;

        for (int i = 0; i<arr.size(); i++){
            if (arr.get(i).getId() == id){
                System.out.println("nhập tên muốn sửa");
                String name = sc.nextLine();

                System.out.println("nhập tuổi muốn sửa");
                int age = sc.nextInt();

                System.out.println("nhập địa chỉ muốn sửa");
                String address = sc.nextLine();

                System.out.println("nhập điểm trung bình muốn sửa");
                double gpa = sc.nextDouble();

                arr.set(i, new Student(id, name,age, address, gpa ));
                timThay = true;
                break;

            }
        }
        if (timThay = false)
            System.out.println("không tìm thấy");
    }
    public void deleteStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập id sinh viên muốn xóa");
        int id = sc.nextInt();

        int d = -1;
        boolean timThay = false;
        for(int i = 0; i< arr.size(); i++){
            if (arr.get(i).getId()== id){
                d = i;
                timThay = true;
            }
        }
        if (timThay = false){
            System.out.println("không tìm thấy");
        }else {
            arr.remove(d);
        }
    }
    public void sortgpa(){
        arr.sort(Comparator.comparing(Student::getGpa));
    }
    public void sortName(){
        arr.sort(Comparator.comparing(Student::getName));
    }
    public void display(){
        for (Student student: arr){
            System.out.println(student.toString());
        }
    }
    public void exit(){
        System.out.println("tạm biệt");
        System.exit(0);
    }
}

