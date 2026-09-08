import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float fahrenheit = sc.nextFloat();
        float celsius = ((float)5 / 9) * (fahrenheit - 32);

        System.out.printf("섭씨 온도: %.1f\n", celsius);

    }
}
