import java.util.Arrays;

public class mergeArrsSort {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int length = m;
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m + n; i++) {
                if (nums2[j] <= nums1[i]) {
                    if (length < m + n) {
                        for (int k = m + n - 1; k > i; k--) {
                            nums1[k] = nums1[k - 1];
                        }
                        nums1[i] = nums2[j];
                        length++;
                        break;
                    }

                } else {
                    if (i == length) {
                        nums1[i] = nums2[j];
                        length++;
                        break;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = { 2, 5, 6 };

        merge(nums1, nums1.length - nums2.length, nums2, nums2.length);
        System.out.println(Arrays.toString(nums1));
    }
}
