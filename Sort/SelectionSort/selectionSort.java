import java.util.Arrays;

public class selectionSort {

    public static void selectSort(int Arr[]) {
        int temp = 0, min = 0;
        for (int i = 0; i < Arr.length - 2; i++) {
            min = i;
            // find the smallest in n-i elements
            for (int j = i + 1; j < Arr.length - 1; j++) {
                if (Arr[j] < Arr[min])
                    min = j;
            }
            // swap with ith element with min element
            temp = Arr[i];
            Arr[i] = Arr[min];
            Arr[min] = temp;
        }
    }

    public static void main(String[] args) {
        int[] numArr = { 34, 12, 35, 10, 6, 7, 50 };

        selectSort(numArr);

        System.out.println(Arrays.toString(numArr));

    }
}