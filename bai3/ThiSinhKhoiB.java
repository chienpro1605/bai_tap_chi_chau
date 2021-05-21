package bai3;

public class ThiSinhKhoiB extends ThiSinh{
    private final String TOAN = "Toan";
    private final String HOA = "Hoa";
    private final String SINH = "Sinh";


    public ThiSinhKhoiB(int soBaoDanh, String name, String address, int mucUuTien) {
        super(soBaoDanh, name, address, mucUuTien);
    }


    @Override
    public String toString() {
        return "CandidateA{" +
                "sobaodanh='" + getSoBaoDanh() + '\'' +
                ", name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", mucuutien=" + getMucUuTien() +
                ", khoimonthi = "+ TOAN + HOA + SINH +'}';
    }

}
