package baitap_ungdungmap;

import java.util.*;

public class ManagermentStudent {
    Map<Integer, Student> sinhvien = null;

    public ManagermentStudent() {
        sinhvien = new HashMap<>();
    }
    public void addStudent(int id , Student student){
        sinhvien.put(id, student);
    }
    public void display(){
        Set<Integer>keys = sinhvien.keySet();
        for (Integer key : keys){
            System.out.println(sinhvien.get(key));
        }
        System.out.println("------------------");
    }
    public boolean check(int id){
        if (sinhvien.containsKey(id)){
            return true;
        }
        return false;
    }
    public Student seachStudent(int id){
        return sinhvien.get(id);
    }
    public Student editStudent(int id, Student student){
        return sinhvien.put(id,student);
      }
      public void deleteStudent(int id){
        sinhvien.remove(id);
      }
     public void sortStudent(){
         List<Map.Entry<Integer,Student>> list = new LinkedList<>(sinhvien.entrySet());
         Collections.sort(list, new Comparator<Map.Entry<Integer, Student>>() {
             @Override
             public int compare(Map.Entry<Integer, Student> o1, Map.Entry<Integer, Student> o2) {
                 return o1.getValue().getId() - o2.getValue().getId();
             }
         });
         Map<Integer, Student> map1 = new LinkedHashMap<>();
         for (Map.Entry<Integer,Student> entry : list){
             map1.put(entry.getKey(),entry.getValue());
         }
         this.sinhvien = map1;
     }
}




