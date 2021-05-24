package bai7;

import java.util.Scanner;

public class Testbai7 {
    public static void main(String[] args) {
        CBGV ql = new CBGV();

       Nguoi ng1 = new Nguoi(100,200,50,300,"HUY", 12, "HA NOI",1);
       Nguoi ng2 = new Nguoi(100,200,50,300,"HOANG", 12, "HA NOI",2);
       Nguoi ng3 = new Nguoi(100,200,50,300,"TU", 12, "HA NOI",8);
       Nguoi ng4 = new Nguoi(100,200,50,300,"GA", 12, "HA NOI",4);
       Nguoi ng5 = new Nguoi(100,200,50,300,"BO", 12, "HA NOI",12);

       ql.addPerson(ng1);
       ql.addPerson(ng2);
       ql.addPerson(ng3);
       ql.addPerson(ng4);
       ql.addPerson(ng5);

       ql.display();

        Scanner sc = new Scanner(System.in);
//        System.out.println("nhập tên muốn tìm");
//        String name = sc.nextLine();
//        System.out.println(ql.timVitri(name));

//        System.out.println("nhập tên muốn xóa");
//        String name = sc.nextLine();
//        ql.deletePerson(name);
//        ql.display();

        System.out.println("nhập tên muốn tính lương");
        String name = sc.nextLine();
        System.out.println(ql.tinhSalary(name));

    }
}
