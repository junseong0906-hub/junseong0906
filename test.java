import java.util.*;
import java.io.*;

public class test {
    public static void main(String[] args) throws IOException {

        FileOutputStream f = new FileOutputStream("newhello.txt");
        String s = "Hello World";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            f.write((byte) ch);
        }

        f.write('\r');
        f.close();
    }
}