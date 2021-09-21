import java.util.Arrays;

public class stableSelectionSort {
    public static void stableSelSort(int[] Arr) {
        int temp = 0, min = 0;
        for (int i = 0; i < Arr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < Arr.length; j++) {
                if (Arr[j] < Arr[min]) {
                    min = j;
                }
            }
            if (i != min) {

                temp = Arr[min];
                for (int k = min; k > i; k--) {
                    int n = Arr[k - 1];
                    Arr[k] = n;
                }
                Arr[i] = temp;
                System.out.println(Arrays.toString(Arr));
            }
        }
    }

    public static void main(String[] args) {
        int[] numArr = { 2, 3, 4, 1, 2 };
        stableSelSort(numArr);
        System.out.println(Arrays.toString(numArr));

    }
}