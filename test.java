import java.util.ArrayList;
import java.util.Iterator;

public class test {
    public static void main(String[] args){
        
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Seoul");
        cities.add("Tokyo");
        cities.add("Washington, D.C.");
        cities.add("Beijing");

        Iterator iter = cities.iterator();
        while(iter.hasNext()){
            String s = (String)iter.next();
            System.out.println(s);
        }

        /*
        for 사용
        for(Iterator iter = cities.iterator(); iter.hasNext();){
            String s = (String)iter.next();
            System.out.println(s);
        }
        
        */
        
    }
}