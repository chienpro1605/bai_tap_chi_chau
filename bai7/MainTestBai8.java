package bai7;

import bai8.QuanLyThe;
import bai8.SinhVien;
import bai8.TheMuon;

import java.util.Scanner;

public class MainTestBai8 {
    public static void main(String[] args) {
        QuanLyThe ql = new QuanLyThe();

        TheMuon t1 = new TheMuon(new SinhVien("CHIEN",12, "L1"),"S1",23,34,1);
        TheMuon t2 = new TheMuon(new SinhVien("GA",15, "L2"),"S1",23,34,5);
        TheMuon t3 = new TheMuon(new SinhVien("VIT",15, "L4"),"S1",23,34,4);

        ql.addThe(t1);
        ql.addThe(t2);
        ql.addThe(t3);

        ql.displayCard();

        Scanner sc = new Scanner(System.in);

        System.out.println("nhập mã sách muốn xóa");
        int maa = sc.nextInt();
        ql.delete(maa);
        ql.displayCard();



    }
}
