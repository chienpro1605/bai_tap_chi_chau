package bai7;

import java.util.ArrayList;
import java.util.List;

public class CBGV {
    private List<Nguoi>list;

    public CBGV() {
        this.list = new ArrayList<>();
    }

    public void display(){
        for (Nguoi ds: list){
            System.out.println(ds.toString());
        }
        System.out.println("--------------------------");
    }
    public void addPerson(Nguoi nguoi){
        list.add(nguoi);
    }
    public int timVitri(String name){
        for (int i = 0; i<list.size(); i++){
            if (list.get(i).getName().equals(name) ){
                return i;
            }
        }
        return -1;
    }
    public void deletePerson(String name){
        if (timVitri(name) == -1){
            System.out.println("không tìm thấy");
        }else {
            list.remove(timVitri(name));
        }
    }
    public double tinhSalary(String name){
       for (int i =0; i<list.size(); i++){
           if (list.get(i).getName().equals(name)){
               return list.get(i).getLuongCung() + list.get(i).getLuongThuong() - list.get(i).getTienPhat();
           }
       }
       return -1;
    }

}
