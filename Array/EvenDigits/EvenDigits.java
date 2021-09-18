public class EvenDigits {
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (findNoOfDigits(nums[i]) % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int findNoOfDigits(int number) {
        int digits = 1;
        while (number / 10 >= 1) {
            number = number / 10;
            digits++;
        }
        return digits;

    }

    public static void main(String[] args) {
        int[] numbers = { 12, 345, 2, 6, 7896 };
        System.out.println(findNumbers(numbers));

    }

}
