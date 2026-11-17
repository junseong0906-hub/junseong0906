import java.util.Map;
import java.util.HashMap;

public class test {
    public static void main(String[] args){
        Map<String, Integer> channels = new HashMap<String, Integer>();
        channels.put("SBS", 6);
        channels.put("KBS1", 9);

        for (Map.Entry<String, Integer> entry : channels.entrySet()) {
            System.out.printf("television networks: %s, channel number: %d\n", 
            entry.getKey(), entry.getValue());
        }
    }
}