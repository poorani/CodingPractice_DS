public class delArrAllOccur {
    public static int removeElement(int[] nums, int val) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (nums[i] == val) {

                for (int j = i; j < length - 1; j++)
                    nums[j] = nums[j + 1];

                length--;
                i--;
            }

        }
        return length;
    }

    public static void main(String[] args) {
        int arrLen = 0;
        int[] numArr = { 2, 3, 2, 3 };
        arrLen = removeElement(numArr, 3);
        for (int i = 0; i < arrLen; i++) {
            System.out.println(numArr[i]);
        }

    }

}
