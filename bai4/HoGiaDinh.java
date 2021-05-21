package bai4;

import java.util.Arrays;
import java.util.Scanner;

public class HoGiaDinh{
    private Ngươi[] nguoi;
    private int size;
    private String address;

    public HoGiaDinh (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập size");
        this.size = scanner.nextInt();
        nguoi = new Ngươi[size];
    }

    public int getSize() {

        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập địa chỉ");
        this.address = scanner.nextLine();
        for (int i = 0; i<size; i++){
            System.out.println("thông tin người thứ "+ i);
            Ngươi ng = new Ngươi();
            ng.input();
            nguoi[i] = ng;
        }
    }
    public void display(){
        System.out.println("số người trong hộ gia đình là:");
        for (int i = 0; i<size; i++){
            System.out.println(nguoi[i]);
        }
    }
}
