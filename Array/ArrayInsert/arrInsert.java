import java.util.Arrays;

public class arrInsert {
    public static void consecFillZero(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                for (int j = arr.length - 1; j > i; j--) {
                    arr[j] = arr[j - 1];

                }
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] numArr = { 2, 0, 1, 3, 4, 0, 5 };
        consecFillZero(numArr);
        System.out.println(Arrays.toString(numArr));
    }
}
