import java.util.Arrays;

public class bubbleSortRecur {
    public static void bubRecSort(int[] Arr, int n) {
        int temp = 0;
        if (n == 1)
            return;
        for (int i = 0; i < n - 1; i++) {
            if (Arr[i] > Arr[i + 1]) {
                temp = Arr[i];
                Arr[i] = Arr[i + 1];
                Arr[i + 1] = temp;
            }
        }
        bubRecSort(Arr, n - 1);
    }

    public static void main(String[] args) {
        int[] numArr = { 10, 4, 20, 10, 30 };
        bubRecSort(numArr, numArr.length);
        System.out.println(Arrays.toString(numArr));

    }
}
