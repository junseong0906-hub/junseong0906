import java.util.Arrays; 
public class Main { 
public static void main(String[] args) {
        String[] arrToSort = {"apple", "oranges", "bananas", "Strawberry", "Blueberry"};
        Arrays.sort(arrToSort); 
        for(int i = 0; i < arrToSort.length; i++) {
        System.out.print(arrToSort[i] + " ");
        }
    }
} 