import java.util.Arrays;

public class squareSort {
    public static void sqrAndSort(int[] Arr) { // using selection sort O ( n^2)
        int temp = 0, elemSqr = 0, minSqr = 0, min = 0;
        for (int i = 0; i < Arr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < Arr.length; j++) {
                elemSqr = Arr[j] * Arr[j];
                minSqr = Arr[min] * Arr[min];
                if (elemSqr < minSqr)
                    min = j;
            }
            if (i == min) {
                Arr[i] = Arr[min] * Arr[min];
            } else {
                temp = Arr[i];
                Arr[i] = Arr[min] * Arr[min];
                Arr[min] = temp;
            }
        }
        Arr[Arr.length - 1] = Arr[Arr.length - 1] * Arr[Arr.length - 1];
    }

    public static void main(String[] args) {
        int[] numArr = { 5, -1, 0, 4, 6 };
        sqrAndSort(numArr);
        System.out.println(Arrays.toString(numArr));
    }
}
