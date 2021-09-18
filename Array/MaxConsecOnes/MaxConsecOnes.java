public class MaxConsecOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxLength = 0, length = 0;
        int windowStart = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                if (windowStart == -1) {
                    windowStart = i;
                    length = 0;
                }
                length = length + 1;
            } else {
                if (windowStart != -1) {
                    windowStart = -1;
                    if (length > maxLength)
                        maxLength = length;
                    length = 0;

                }
            }
        }
        if (length > maxLength)
            maxLength = length;
        return maxLength;
    }

    public static void main(String[] args) {
        int[] num = { 1, 1, 0, 1, 1, 1 };
        int maxConsecOnesLen = findMaxConsecutiveOnes(num);
        System.out.println(maxConsecOnesLen);

    }
}