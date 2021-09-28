public class removeDup {
    public static int removeDuplicates(int[] nums) {
        int length = nums.length;

        for (int i = 0; i < length - 1; i++) {

            if (nums[i] == nums[i + 1]) {
                for (int j = i + 1; j < length - 1; j++) {
                    nums[j] = nums[j + 1];

                }
                length--;
                i--;
            }

        }
        return length;
    }

    public static void main(String[] args) {
        int[] numArr = { 0, 0, 1, 1, 1, 2, 2, 3, 3 };
        int arrLen = removeDuplicates(numArr);
        for (int i = 0; i < arrLen; i++) {
            System.out.println(numArr[i]);
        }
    }
}
