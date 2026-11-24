import java.util.*;

public class test {
    public static void main(String[] args){
        
        StringBuilder sb = new StringBuilder();
        Formatter formatter = new Formatter(sb);
        formatter.format("Hello %s", "ABC");
        System.out.println(sb);
    }
}