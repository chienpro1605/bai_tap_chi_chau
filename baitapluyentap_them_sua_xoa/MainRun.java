package baitapluyentap_them_sua_xoa;

public class MainRun {
    public static void main(String[] args) {
        ManageStudent student = new ManageStudent();
        student.add(new Student(11,"hoa anh dao", 12));
        student.add(new Student(15,"chien", 34));
        student.add(new Student(16,"chuong", 56));
        student.add(new Student(18,"phong", 16));
        student.add(new Student(67,"thuy", 18));
        student.display();
        System.out.println(student.findVitri("phong"));

        student.edit("chien", new Student(23,"CHIEN", 56));
        student.display();

        student.delete("CHIEN");
        student.display();

        student.sortStudent();
        student.display();

    }
}
