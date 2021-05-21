package bai5;

public class People {
  private String name;
  private int age;
  final private int id;
  private int soNgayThue;

    public People(String name, int age, int id, int soNgayThue) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.soNgayThue = soNgayThue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public int getSoNgayThue() {
        return soNgayThue;
    }

    public void setSoNgayThue(int soNgayThue) {
        this.soNgayThue = soNgayThue;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", id=" + id +
                ", soNgayThue=" + soNgayThue +
                '}';
    }
}
