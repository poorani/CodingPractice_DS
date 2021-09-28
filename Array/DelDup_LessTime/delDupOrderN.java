public class delDupOrderN {
    public static int removeDuplicates(int[] arr) {
        int length = arr.length;

        int uniquePointer = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {

                length--;
                continue;
            }
            arr[uniquePointer + 1] = arr[i + 1];
            uniquePointer++;

        }

        return length;
    }

    public static void main(String[] args) {
        int[] numArr = { 2, 2, 3, 4, 5, 5 };
        int arrLen = removeDuplicates(numArr);
        for (int i = 0; i < arrLen; i++) {
            System.out.println(numArr[i]);
        }
    }

}
