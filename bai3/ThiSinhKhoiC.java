package bai3;

public class ThiSinhKhoiC extends ThiSinh{
    private final String VAN = "Van";
    private final String SU = "Su";
    private final String DIA = "Dia";


    public ThiSinhKhoiC(int soBaoDanh, String name, String address, int mucUuTien) {
        super(soBaoDanh, name, address, mucUuTien);
    }


    @Override
    public String toString() {
        return "CandidateA{" +
                "sobaodanh='" + getSoBaoDanh() + '\'' +
                ", name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", mucuutien=" + getMucUuTien() +
                ", khoimonthi = "+ VAN + SU+ DIA+ '}';
    }

}
