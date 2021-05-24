package bai9;

public class BienLai {
    private KhachHang kh;
    private int chiSocu;
    private int chiSomoi;
    private int tienDien;

    public BienLai(KhachHang kh, int chiSocu, int chiSomoi, int tienDien) {
        this.kh = kh;
        this.chiSocu = chiSocu;
        this.chiSomoi = chiSomoi;
        this.tienDien = tienDien;
    }

    public KhachHang getKh() {
        return kh;
    }

    public void setKh(KhachHang kh) {
        this.kh = kh;
    }

    public int getChiSocu() {
        return chiSocu;
    }

    public void setChiSocu(int chiSocu) {
        this.chiSocu = chiSocu;
    }

    public int getChiSomoi() {
        return chiSomoi;
    }

    public void setChiSomoi(int chiSomoi) {
        this.chiSomoi = chiSomoi;
    }

    public int getTienDien() {
        return tienDien;
    }

    public void setTienDien(int tienDien) {
        this.tienDien = tienDien;
    }

    @Override
    public String toString() {
        return "BienLai{" +
                "kh=" + kh +
                ", chiSocu=" + chiSocu +
                ", chiSomoi=" + chiSomoi +
                ", tienDien=" + tienDien +
                '}';
    }
}
