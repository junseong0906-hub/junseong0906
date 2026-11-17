import java.util.Map;
import java.util.HashMap;

class TestCountChars {
    String str;    
    TestCountChars(String s) { str = s; }
    
    Map<Character, Integer> countChars() {
        Map<Character, Integer> wc = new HashMap<Character, Integer>();
        char[] letters = str.toCharArray();
        for (char c : letters) {
            if (wc.containsKey(c)) { 
                wc.put(c, wc.get(c) + 1);
            }  else {
                wc.put(c,1);
            }
        }
        return wc;
    }    
    
    public static void main(String[] args) {
        TestCountChars tcc = new TestCountChars( "sangmyung university");
        Map<Character, Integer> map = tcc.countChars();
        System.out.println(map);
    }
}
