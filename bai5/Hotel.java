package bai5;

import java.util.Scanner;

public class Hotel {
    final private int LOAIPHONGA = 500;
    final private int LOAIPHONGB = 300;
    final private int LOAIPHONGC = 100;
    private final People[] phongA = new People[10];
    private final People[] phongB = new People[10];
    private final People[] phongC = new People[10];
    private int indexA = 0;
    private int indexB = 0;
    private int indexC = 0;

    public Hotel() {
    }

    public int getLOAIPHONGA() {
        return LOAIPHONGA;
    }

    public int getLOAIPHONGB() {
        return LOAIPHONGB;
    }

    public int getLOAIPHONGC() {
        return LOAIPHONGC;
    }

    public void themKhachHang(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tên");
        String name = scanner.nextLine();
        System.out.println("nhập tuổi");
        int age = scanner.nextInt();
        System.out.println("nhập chứng minh thư nhân dân");
        int id = scanner.nextInt();
        System.out.println("bạn muốn chọn loại phòng nào");
        System.out.println("1.loại A  2.loại B    3.loạiC");
        int choice = scanner.nextInt();
        System.out.println("bạn muốn thuê bao nhiêu ngày");
        int songaythue = scanner.nextInt();
        switch (choice){
            case 1:
                phongA[indexA] = new People(name,age,id,songaythue);
                indexA++;
                break;
            case 2:
                phongB[indexB] = new People(name,age,id,songaythue);
                indexB++;
                break;
            case 3:
                phongC[indexC] = new People(name,age,id,songaythue);
                indexC++;
                break;
        }
    }
    public void display(){
        if (indexA>0){
            System.out.println("danh sách phòng loại A:");
            for (int i = 0; i<indexA; i++){
                System.out.println(phongA[i]);
            }
        }
        if (indexB>0){
            System.out.println("danh sách phòng lại B là:");
            for (int i =0; i<indexB; i++){
                System.out.println(phongB[i]);
            }
        }
        if (indexC>0) {
            System.out.println("danh sách phòng lại C là:");
            for (int i = 0; i < indexC; i++) {
                System.out.println(phongC[i]);
            }
        }

    }
    public void xoaKhach(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số cmnd của khách cần xóa");
        int id = scanner.nextInt();
        boolean finded = false;
        int vitrixoa = -1;
        for (int i = 0; i<indexA; i++){
            if (id == phongA[i].getId()){
                phongA[i] = null;
                vitrixoa = i;
                finded = true;
            }
        }
        if (!finded){
            System.out.println("không tìm thấy phòng loại A");
        }else {
            for (int i = vitrixoa; i<indexA; i++){
                phongA[i] = phongA[i+1];
                phongA[i+1] = null;
            }
            indexA--;
        }
        finded = false;
         vitrixoa = -1;
        for (int i = 0; i<indexB; i++){
            if (id == phongB[i].getId()){
                phongB[i] = null;
                vitrixoa = i;
                finded = true;
            }
        }
        if (!finded){
            System.out.println("không tìm thấy phòng loại B");
        }else {
            for (int i = vitrixoa; i<indexB; i++){
                phongB[i] = phongB[i+1];
                phongB[i+1] = null;
            }
            indexB--;
        }
        finded = false;
        vitrixoa = -1;
        for (int i = 0; i<indexC; i++){
            if (id == phongC[i].getId()){
                phongC[i] = null;
                vitrixoa = i;
                finded = true;
            }
        }
        if (!finded){
            System.out.println("không tìm thấy phòng loại C");
        }else {
            for (int i = vitrixoa; i<indexC; i++){
                phongC[i] = phongC[i+1];
                phongC[i+1] = null;
            }
            indexC--;
        }
    }
    public void tinhTien(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số chứng minh nhân dân");
        int id = scanner.nextInt();
        int sum = 0;
        boolean finded = false;
        for (int i = 0; i<indexA; i++){
            if (id == phongA[i].getId()){
                sum+=phongA[i].getSoNgayThue()*LOAIPHONGA;
                finded = true;
            }
        }
        for (int i =0; i<indexB; i++){
            if (id == phongB[i].getId()){
                sum+=phongB[i].getSoNgayThue()*LOAIPHONGB;
                finded = true;
            }
        }
        for (int i =0; i<indexC; i++){
            if (id == phongC[i].getId()){
                sum+=phongC[i].getSoNgayThue()*LOAIPHONGC;
                finded = true;
            }
        }
        if (finded){
            System.out.println("tổng số tiền là:"+ sum);
        }else {
            System.out.println("không tìm thấy số cmnd");
        }
    }
}
