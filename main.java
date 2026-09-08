import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        System.out.println("문자열: " + s);

        int num = sc.nextInt();
        System.out.println("정수: " + num);
        
        String s1 = sc.nextLine();
        System.out.println("나머지 문자열: " + s1);
    }
}
