package bai9;

import bai8.QuanLyThe;

import java.util.ArrayList;
import java.util.List;

public class QuanLyBienLai {
    private List<BienLai>list = null;

    public QuanLyBienLai(){
        this.list = new ArrayList<>();
    }
    public void display(){
        for (int i = 0; i<list.size(); i++){
            System.out.println(list.get(i).toString());
        }
        System.out.println("-----------------");
    }
    public void addBienlai(BienLai bienLai){
        list.add(bienLai);
    }
    public int vitriKh(String name){
        for (int i = 0; i<list.size(); i++){
            if (list.get(i).getKh().getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
    public void deleteKh(String name){
        if (vitriKh(name) == -1){
            System.out.println("không tìm thấy");
        }else {
            list.remove(vitriKh(name));
        }
    }
    public void editKh(String name, BienLai bienLai){
        if (vitriKh(name) == -1){
            System.out.println("không tìm thấy");
        }else {
            list.set(vitriKh(name), bienLai);
        }
    }
    public double tinhTiendien(String name){
       for (int i = 0; i<list.size();i++){
           if (list.get(i).getKh().getName().equals(name)){
               return (list.get(i).getChiSomoi() - list.get(i).getChiSocu())*5;
           }
       }
       return -1;
    }
}
