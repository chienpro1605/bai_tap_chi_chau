package bai4;

import java.util.Scanner;

public class KhuPho {
    private HoGiaDinh[] hogiadinh;
    private int size;

    public KhuPho(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập size");
        this.size = scanner.nextInt();
        hogiadinh = new HoGiaDinh[size];
    }

    public HoGiaDinh[] getHogiadinh() {
        return hogiadinh;
    }

    public void setHogiadinh(HoGiaDinh[] hogiadinh) {
        this.hogiadinh = hogiadinh;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public void input(){
        for (int i =0; i<size; i++){
            System.out.println("thông tin hộ gia đình thứ  " + i);
            HoGiaDinh hgd = new HoGiaDinh();
            hgd.input();
            hogiadinh[i] = hgd;
        }
    }
    public void display(){
        System.out.println("khu phố có số hộ gia đình là:");
        for (int i = 0; i<size; i++){
            hogiadinh[i].display();
        }
    }

}

