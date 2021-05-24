package bai9;

import java.util.Scanner;

public class MainTestBai9 {
    public static void main(String[] args) {
        QuanLyBienLai ql = new QuanLyBienLai();
        BienLai bl1 = new BienLai(new KhachHang("HOA",12,"M1"),100,200,300);
        BienLai bl2 = new BienLai(new KhachHang("QUYEN",34,"M1"),100,200,300);
        BienLai bl3 = new BienLai(new KhachHang("DAT",89,"M1"),100,200,300);
        BienLai bl4 = new BienLai(new KhachHang("TIEN",7,"M1"),100,200,300);

        ql.addBienlai(bl1);
        ql.addBienlai(bl2);
        ql.addBienlai(bl3);
        ql.addBienlai(bl4);

        ql.display();

//        System.out.println("nhập tên khách hàng muốn xóa");
        Scanner scanner = new Scanner(System.in);
//        String name = scanner.nextLine();
//        ql.deleteKh(name);
//        ql.display();

//        System.out.println("nhập tên khách hàng muốn sửa");
//        String name = scanner.nextLine();
//        ql.editKh(name, new BienLai(new KhachHang("CHIEN",34,"M12"),150,400,500));
//        ql.display();

        System.out.println("nhập tên kh muốn xem tiền điện");
        String name = scanner.nextLine();
        System.out.println(ql.tinhTiendien(name));


    }
    }



