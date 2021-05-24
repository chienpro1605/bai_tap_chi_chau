package bai10;

public class VanBan {
    private String st;

    public VanBan(){
    }
    public VanBan(String st){
        this.st = st;
    }
    public void vanBanChuan(){
        this.st = st.trim();
        while (st.indexOf("  ")!=-1)
            st = st.replace("  "," ");
    }
    public int demTu(){
        vanBanChuan();
        String[] tu = st.split(" ");
        return tu.length;
    }
    public int demKyTU(){
        vanBanChuan();
        String[] TU = st.split(" ");
        int count = 0;
        for (int i = 0; i<TU.length; i++){
            count+=TU[i].length();
        }
        return count;
    }
}
