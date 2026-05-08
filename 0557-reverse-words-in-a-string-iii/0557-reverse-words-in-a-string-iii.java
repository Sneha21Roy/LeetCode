class Solution {
    public String reverseWords(String s) {
        
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            
            StringBuilder reversed = new StringBuilder(word);
            result.append(reversed.reverse()).append(" ");
        }

        // Remove extra space at the end
        return result.toString().trim();
    }
}