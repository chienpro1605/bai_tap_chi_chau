package luyentap_comporable;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ManagementStudent asc = new ManagementStudent();
        asc.display();
        System.out.println("sắp xếp theo tên");
        Collections.sort(asc.students);
        asc.display();
    }
}
