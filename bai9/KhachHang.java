package bai9;

public class KhachHang {
    private String name;
    private int soNha;
    private String maCongTo;

    public KhachHang(String name, int soNha, String maCongTo) {
        this.name = name;
        this.soNha = soNha;
        this.maCongTo = maCongTo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSoNha() {
        return soNha;
    }

    public void setSoNha(int soNha) {
        this.soNha = soNha;
    }

    public String getMaCongTo() {
        return maCongTo;
    }

    public void setMaCongTo(String maCongTo) {
        this.maCongTo = maCongTo;
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "name='" + name + '\'' +
                ", soNha=" + soNha +
                ", maCongTo='" + maCongTo + '\'' +
                '}';
    }
}
