class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i += 2 * k) {
            
            int left = i;
            
            // Handle case when remaining chars are less than k
            int right = Math.min(i + k - 1, arr.length - 1);

            // Reverse first k characters
            while (left < right) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        return new String(arr);
    }
}