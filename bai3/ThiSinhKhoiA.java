package bai3;

public class ThiSinhKhoiA extends ThiSinh{
   private final String TOAN = "Toan";
   private final String LY = "Ly";
   private final String Hoa = "Hoa";

    public ThiSinhKhoiA(int soBaoDanh, String name, String address, int mucUuTien) {
        super(soBaoDanh, name, address, mucUuTien);
    }


    @Override
    public String toString() {
        return "CandidateA{" +
                "sobaodanh='" + getSoBaoDanh() + '\'' +
                ", name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", mucuutien=" + getMucUuTien() +
                ", camonhoc = "+ TOAN + LY + Hoa + '}';
    }

}
