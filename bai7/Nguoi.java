package bai7;

public class Nguoi {
    private double luongCung;
    private double luongThuong;
    private double tienPhat;
    private double tienThucLinh;
    private String name;
    private int age;
    private String address;
    private int MSGV;

    public Nguoi(double luongCung, double luongThuong, double tienPhat,
                 double tienThucLinh, String name, int age, String address, int MSGV) {
        this.luongCung = luongCung;
        this.luongThuong = luongThuong;
        this.tienPhat = tienPhat;
        this.tienThucLinh = tienThucLinh;
        this.name = name;
        this.age = age;
        this.address = address;
        this.MSGV = MSGV;
    }

    public double getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(double luongCung) {
        this.luongCung = luongCung;
    }

    public double getLuongThuong() {
        return luongThuong;
    }

    public void setLuongThuong(double luongThuong) {
        this.luongThuong = luongThuong;
    }

    public double getTienPhat() {
        return tienPhat;
    }

    public void setTienPhat(double tienPhat) {
        this.tienPhat = tienPhat;
    }

    public double getTienThucLinh() {
        return tienThucLinh;
    }

    public void setTienThucLinh(double tienThucLinh) {
        this.tienThucLinh = tienThucLinh;
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

    public int getMSGV() {
        return MSGV;
    }

    public void setMSGV(int MSGV) {
        this.MSGV = MSGV;
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "luongCung=" + luongCung +
                ", luongThuong=" + luongThuong +
                ", tienPhat=" + tienPhat +
                ", tienThucLinh=" + tienThucLinh +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", MSGV=" + MSGV +
                '}';
    }
}
