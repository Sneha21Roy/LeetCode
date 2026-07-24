class Solution {
    public int compress(char[] chars) {
        int write = 0;
        int read = 0;

        while (read < chars.length) {
            char current = chars[read];
            int count = 0;

            // Same characters count karo
            while (read < chars.length && chars[read] == current) {
                read++;
                count++;
            }

            // Character write karo
            chars[write] = current;
            write++;

            // Count agar 1 se zyada hai
            if (count > 1) {
                String str = String.valueOf(count);

                for (int i = 0; i < str.length(); i++) {
                    chars[write] = str.charAt(i);
                    write++;
                }
            }
        }

        return write;
    }
}