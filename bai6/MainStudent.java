package bai6;

import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student1 = new Student("chuong",12, "nam dinh",12);
        Student student2 = new Student("hoa",13, "ha noi",12);
        Student student3 = new Student("nam",59, "ha nam",78);
        Student student4 = new Student("viet",18, "viet tri",45);

        School sc = new School();
        sc.add(student1);
        sc.add(student2);
        sc.add(student3);
        sc.add(student4);

        sc.display();

        System.out.println(sc.seachStudent("nam"));

        sc.updateStudent("hoa", new Student("hiep",14, "ha noi", 34));
        sc.display();
        sc.deleteStudent("viet");
        sc.display();

        sc.sortStudent();
        sc.display();
    }
}
