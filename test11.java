import java.util.HashMap;
import java.util.Set;

public class test11 {
    public static void main(String[] args) {
//        String st = "  one  tư  the pho  ";
//        String AB = st.trim();
//        System.out.println(AB);
//        while (AB.indexOf("  ")!=-1){
//            AB = AB.replaceAll("  "," ");
//        }
//        String[] arr = AB.split(" ");
//        for (int i = 0; i< arr.length; i++){
//            System.out.print(arr[i]);
//        }
        HashMap<String, Integer> customers = new HashMap<>();
        customers.put("John", 30);
        customers.put("Mike", 28);
        customers.put("Bill", 32);
        customers.put("Maria", 27);

        Set<String> keys = customers.keySet();
        for (String key: keys){
            System.out.println("Key: " + key + ": " + customers.get(key));
        }
    }
}
