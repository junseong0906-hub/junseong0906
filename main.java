import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        char ch;
        Scanner scanner = new Scanner(System.in);
        do {
            ch = scanner.next().charAt(0); 
            if (ch != 'n') {
            System.out.println(ch);   
        }
        else {
            break;
        }
        } while (true);
    
    }
}
