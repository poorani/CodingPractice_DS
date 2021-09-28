public class searchDouble {
    public static boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == (arr[i] * 2)) {

                    if ((arr[i] == 0 && arr[j] != 0) || (i == j))
                        continue;
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] numArr = { 3, 4, 6, 5 };
        System.out.println("is there an element and its double exists?" + checkIfExist(numArr));
    }

}
