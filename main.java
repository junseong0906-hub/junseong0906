import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
        int i = 3;
        while(i < 7){
            System.out.printf("if 전: i = %d\n", i);
            if(i < 7){
                i += 2;
                System.out.printf("continue 전: i = %d\n", i);
                continue;
            }
            System.out.println("이건 출력 안됨!");
        }
        System.out.printf("i = %d, 이건 출력됨\n", i);
    
    }
}
