import java.util.Arrays;

public class JaggedArray {
    public static void main(String[] args) {
        int outer = (int)(Math.random() * 10); // getting random values for the length/dimension outer array

        int[][] numbers = new int[outer][];

//        numbers[0] =new int[5];  // sample/example

        for (int i = 0; i < outer; i++) {
            int inner = (int)(Math.random() * 10); // getting random values for the length/dimension inner array
            numbers[i] = new int[inner];
        }

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
