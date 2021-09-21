import java.util.Arrays;

public class stringSelSort {
    public static void selectSort(String[] strArr) {
        String temp = null;
        int min = 0;
        for (int i = 0; i < strArr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < strArr.length; j++) {
                if (strArr[j].compareTo(strArr[min]) < 0) {
                    min = j;
                }
            }
            temp = strArr[i];
            strArr[i] = strArr[min];
            strArr[min] = temp;

        }
    }

    public static void main(String[] args) {
        String[] names = { "poorani", "porali", "andril", "siki" };
        selectSort(names);
        System.out.println(Arrays.toString(names));
    }
}