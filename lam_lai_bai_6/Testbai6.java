package lam_lai_bai_6;

public class Testbai6 {
    public static void main(String[] args) {
        QuanLyHocSinh ql = new QuanLyHocSinh();
        ql.addHocsinh(new HocSinh("AO", 22, "HANOI", 23));
        ql.addHocsinh(new HocSinh("CHIWN", 40, "TD", 12));
        ql.addHocsinh(new HocSinh("HOA", 23, "DN", 5));
        ql.addHocsinh(new HocSinh("PHUONG", 23, "DN", 5));

        ql.display();

        System.out.println("danh sách học sinh 20 tuổi là:");
        ql.hienThiHs20();
        System.out.println("số lượng hs 23 tổi và quê ở DN là:");
        System.out.println(ql.demHS());
    }
}
