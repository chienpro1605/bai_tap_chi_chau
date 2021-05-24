package lam_lai_bai_6;

public class HocSinh {
    private String name;
    private int age;
    private String address;
    private int grade;

    public HocSinh(String name, int age, String address, int grade) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.grade = grade;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "HocSinh{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", grade=" + grade +
                '}';
    }
}
