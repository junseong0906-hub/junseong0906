import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;

public class test {
    public static void main(String[] args){
        
        Map<String, String> m1 = new HashMap<>();
        m1.put("Windows", "2000");


        Iterator<String> keys = m1.keySet().iterator();
        while(keys.hasNext()){
            String key = keys.next();
            System.out.printf("key = %s, value = %s\n", key, m1.get(key));

        }
    }
}