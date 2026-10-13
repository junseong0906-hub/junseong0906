import java.util.Scanner;

public class Homework4 {

    int gcd(int a, int b){
        if (a == b) { return a; }
        else if (a > b) { return gcd(a - b, b); }
        else { return gcd(a, b - a); }
    }

    /*
    반복문 코드

    int gcd(int m, int n) {
        while (n != 0) {
            int temp = m % n;
            m = n;
            n = temp;
        }
        r36eturn m;
    }

    */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Homework4 hw = new Homework4();

        int[] numbers = new int[2];

        System.out.print("두 수를 입력하세요: ");
        for(int i = 0; i < 2; i++){
            numbers[i] = sc.nextInt();    
        }

        int result = hw.gcd(numbers[0], numbers[1]);
        
        System.out.printf("두 수의 최대공약수는 %d입니다.", result);
    }
}