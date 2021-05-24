package lam_lai_bai_6;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;

public class QuanLyHocSinh {
    List<HocSinh>list = null;

    public QuanLyHocSinh(){
        this.list = new ArrayList<>();
    }
    public void display(){
        for (HocSinh hocSinh: list){
            System.out.println(hocSinh.toString());
        }
    }
    public void addHocsinh(HocSinh hocSinh){
        list.add(hocSinh);
    }

    public void hienThiHs20(){
        boolean has = false;
        for (int i = 0; i<list.size(); i++){
            if (list.get(i).getAge() == 20){
                System.out.println(list.get(i).toString());
                has = true;
            }
        }
        if (has == false){
            System.out.println("không có học sinh nào 20 tuổi");
        }
    }
    public int demHS(){
        int count = 0;
        for (int i = 0; i<list.size(); i++){
            if (list.get(i).getAge() == 23 && list.get(i).getAddress().equals("DN")){
                count++;
            }
        }
        return count;
    }
}
