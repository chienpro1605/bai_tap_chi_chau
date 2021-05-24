package bai8;

public class TheMuon {
    public SinhVien sinhVien;
    private String id;
    private int ngayMuon;
    private int ngayThanhToan;
    private int maSach;

    public TheMuon(SinhVien sinhVien, String id, int ngayMuon, int ngayThanhToan, int maSach) {
        this.sinhVien = sinhVien;
        this.id = id;
        this.ngayMuon = ngayMuon;
        this.ngayThanhToan = ngayThanhToan;
        this.maSach = maSach;
    }

    public SinhVien getSinhVien() {
        return sinhVien;
    }

    public void setSinhVien(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(int ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public int getNgayThanhToan() {
        return ngayThanhToan;
    }

    public void setNgayThanhToan(int ngayThanhToan) {
        this.ngayThanhToan = ngayThanhToan;
    }

    public int getMaSach() {
        return maSach;
    }

    public void setMaSach(int maSach) {
        this.maSach = maSach;
    }

    @Override
    public String toString() {
        return "TheMuon{" +
                "sinhVien=" + sinhVien +
                ", id='" + id + '\'' +
                ", ngayMuon=" + ngayMuon +
                ", ngayThanhToan=" + ngayThanhToan +
                ", maSach=" + maSach +
                '}';
    }
}
