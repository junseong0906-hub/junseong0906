
public class test {
    public static void main(String[] args){
        int[][] marks = { { 50, 60, 55, 67, 70 }, 
                        { 62, 65, 70, 70, 81 }, 
                        { 72, 66, 77, 80, 69 } };

        // for 반복문 사용
        for (int i= 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                System.out.printf("%d ", marks[i][j]);
            }
            System.out.println("");
        }
        // for each 사용
        for (int[] mArr : marks) { // 각 행을 반복
            for(int m : mArr) {    // 열을 반복
                System.out.printf("%d ", m);
        }
            System.out.println("");
        }
    }
}