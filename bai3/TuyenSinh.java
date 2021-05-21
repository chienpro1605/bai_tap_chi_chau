package bai3;

import java.util.Scanner;

public class TuyenSinh {
    private ThiSinh[] thisinh;
    private int index;

    public TuyenSinh(int size) {
        this.thisinh = new ThiSinh[size];
        this.index = 0;
    }

    public int getIndex() {
        return index;
    }

    public void themMoiThiSinh(int option) {
        Scanner scanner = new Scanner(System.in);
        switch (option) {
            case 1:
                System.out.println("nhập số báo danh");
                int sbd = scanner.nextInt();
                System.out.println("nhập tên");
                String name = scanner.next();
                System.out.println("nhập địa chỉ");
                String address = scanner.next();
                System.out.println("nhập mức độ ưu tiên");
                int mucuutien = scanner.nextInt();
                this.thisinh[index] = new ThiSinhKhoiA(sbd, name, address, mucuutien);
                index++;
                break;
            case 2:
                System.out.println("nhập số báo danh");
                int sbd1 = scanner.nextInt();
                System.out.println("nhập tên");
                String name1 = scanner.next();
                System.out.println("nhập địa chỉ");
                String address1 = scanner.next();
                System.out.println("nhập mức độ ưu tiên");
                int mucuutien1 = scanner.nextInt();
                this.thisinh[index] = new ThiSinhKhoiB(sbd1, name1, address1, mucuutien1);
                index++;
                break;
            case 3:
                System.out.println("nhập số báo danh");
                int sbd2 = scanner.nextInt();
                System.out.println("nhập tên");
                String name2 = scanner.next();
                System.out.println("nhập địa chỉ");
                String address2 = scanner.next();
                System.out.println("nhập mức độ ưu tiên");
                int mucuutien2 = scanner.nextInt();
                this.thisinh[index] = new ThiSinhKhoiC(sbd2, name2, address2, mucuutien2);
                index++;
                break;
        }
    }
    public void timKiemThiSinh(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số báo danh thí sinh");
        int sbd = scanner.nextInt();
        boolean finded = false;
        int vitrithisinh = -1;
        for (int i = 0; i<index; i++){
            if (sbd == thisinh[i].getSoBaoDanh()){
                finded = true;
                vitrithisinh = i;
                break;
            }
        }
        if (finded = true){
            System.out.println(thisinh[vitrithisinh]);
        }else {
            System.out.println("không tìm thấy");
        }
    }
    public void displayThiSinh(){
        for (int i = 0; i<index; i++){
            System.out.println(thisinh[i]);
        }
    }
}
