package bai_tap_chuong_trinh_tong_hop_oop;

import lam_lai_bai_6.QuanLyHocSinh;

import java.util.Scanner;

public class TestTest {
    public static void main(String[] args) {
        QuanLySinhVien ql = new QuanLySinhVien();
        Scanner sc = new Scanner(System.in);

        while (true){
            Menu();
            System.out.println("nhập lựa chon");
            int option = sc.nextInt();
            switch (option){
                case 1:
                    ql.addStudent();
                    break;
                case 2:
                    ql.editStudent();
                    break;
                case 3:
                    ql.deleteStudent();
                    break;
                case 4:
                    ql.sortgpa();
                    break;
                case 5:
                    ql.sortName();
                    break;
                case 6:
                    ql.display();
                    break;
                case 0:
                    ql.exit();


            }
        }

        }

    public static void Menu() {
        System.out.println("1. thêm sinh viên");
        System.out.println("2. sửa sinh viên theo id");
        System.out.println("3. xóa sinh viên theo id");
        System.out.println("4. sắp xếp sinh viên theo gpa");
        System.out.println("5. sắp xếp sinh viên theo name");
        System.out.println("6. hiển thị sinh viên");
        System.out.println("0. exit ");
    }
}
