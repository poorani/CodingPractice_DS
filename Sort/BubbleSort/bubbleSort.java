import java.util.Arrays;

public class bubbleSort {
    public void bubSort(int[] Arr) {
        int temp = 0;
        boolean isSwap = false;
        for (int i = 0; i < Arr.length - 1; i++) {
            isSwap = false;
            System.out.println("pass " + (i + 1));
            for (int j = 0; j < Arr.length - i - 1; j++) {
                if (Arr[j] > Arr[j + 1]) {
                    temp = Arr[j];
                    Arr[j] = Arr[j + 1];
                    Arr[j + 1] = temp;
                    isSwap = true;
                }

            }
            if (isSwap == false)
                break;
        }

    }

    public static void main(String[] args) {
        bubbleSort bs = new bubbleSort();
        int[] numArr = { 50, 40, 32, 25, 3 };
        bs.bubSort(numArr);
        System.out.println(Arrays.toString(numArr));
    }
}