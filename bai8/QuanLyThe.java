package bai8;

import java.util.ArrayList;
import java.util.List;

public class QuanLyThe {
    private List<TheMuon>list = null;

    public QuanLyThe() {
        this.list = new ArrayList<>();
    }
    public void addThe(TheMuon card){
        list.add(card);
    }
    public void displayCard(){
        for (int i = 0; i<list.size();i++){
            System.out.println(list.get(i).toString());
        }
        System.out.println("-------------------------");
    }
  public int timVitri(int maSach){
        for (int i = 0; i<list.size(); i++){
            if (list.get(i).getMaSach() == maSach){
                return i;
            }
        }
        return -1;
  }
  public void delete(int maSach){
        if (timVitri(maSach) == -1){
            System.out.println("không tìm thấy");
        }else {
            list.remove(timVitri(maSach));
        }
  }
}
