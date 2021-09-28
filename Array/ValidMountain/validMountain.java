public class validMountain {
    public static boolean validMountainArray(int[] arr) {
        int increasing = 0, top = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1])
                return false;
            if (arr[i] < arr[i + 1]) {
                increasing = 1;
            } else {
                if (increasing == 1) {
                    top = i;
                    break;
                } else {
                    return false;
                }
            }

        }
        if (top == -1)
            return false;
        for (int j = top; j < arr.length - 1; j++) {
            if (arr[j] <= arr[j + 1])
                return false;
        }
        return true;

    }

    public static void main(String[] args) {

        int[] numArr = { 2, 3, 5, 6, 2, 1 };
        boolean isValidMountain = false;
        isValidMountain = validMountainArray(numArr);
        System.out.println("is this a valid mountain array?" + isValidMountain);
    }

}
