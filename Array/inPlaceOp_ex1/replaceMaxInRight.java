import java.util.Arrays;

public class replaceMaxInRight {

    public static int[] replaceElements(int[] arr) {
        // if( arr.length == 1)return -1;
        int max = -1;

        for (int i = 0; i < arr.length - 1; i++) {
            max = i + 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[max])
                    max = j;
            }
            arr[i] = arr[max];
        }
        arr[arr.length - 1] = -1;
        return arr;
    }

    public static void main(String[] args) {
        int[] numArr = { 3, 18, 5, 4, 3, 2, 6 };
        numArr = replaceElements(numArr);
        System.out.println(Arrays.toString(numArr));

    }
}
