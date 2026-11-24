
import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        for (int i = 0; i < 3; i++) {
            try {
                int n = list.get(i);

                System.out.printf("list[%d] = %d\n", i, n);
            }
            catch (IndexOutOfBoundsException e) {
                System.out.printf("인덱스 %d가 범위를 벗어났습니다.\n", i);
            }
        }
    }
}