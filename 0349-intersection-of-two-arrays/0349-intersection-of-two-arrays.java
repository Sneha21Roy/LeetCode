import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> resultSet = new HashSet<>();

        // Add elements of nums1 to set
        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }

        // Check elements of nums2
        for (int i = 0; i < nums2.length; i++) {
            if (set1.contains(nums2[i])) {
                resultSet.add(nums2[i]);
            }
        }

        // Convert set to array
        int[] result = new int[resultSet.size()];
        int index = 0;

        for (int num : resultSet) {
            result[index++] = num;
        }

        return result;
    }
}