import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num;
        
        do{
            System.out.print("0이 아닌 정수 한 개 입력. 100 이상입력시 종료: ");
            num = sc.nextInt();
            if(num == 0) continue;
            else System.out.println(num);
            
        } while (num < 100);

    }
}
