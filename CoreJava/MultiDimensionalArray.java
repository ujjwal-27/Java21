import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int outer = (int)(Math.random() * 10);
        int inner = (int)(Math.random() * 10);

        int[][] numbers = new int[outer][inner];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = (int)(Math.random() * 100);
            }
        }

//        System.out.println(Arrays.deepToString(numbers));

        for (int[] number: numbers) {
            for (int num: number) {
                System.out.print(num + " ");
            }

            System.out.println();
        }
    }
}
