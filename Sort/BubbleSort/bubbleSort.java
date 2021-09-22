import java.util.Arrays;

public class bubbleSort {
    public void bubSort(int[] Arr) {
        int temp = 0;
        for (int i = 0; i < Arr.length - 1; i++) {
            for (int j = 0; j < Arr.length - i - 1; j++) {
                if (Arr[j] > Arr[j + 1]) {
                    temp = Arr[j];
                    Arr[j] = Arr[j + 1];
                    Arr[j + 1] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        bubbleSort bs = new bubbleSort();
        int[] numArr = { 10, 40, 2, 60, 12 };
        bs.bubSort(numArr);
        System.out.println(Arrays.toString(numArr));
    }
}