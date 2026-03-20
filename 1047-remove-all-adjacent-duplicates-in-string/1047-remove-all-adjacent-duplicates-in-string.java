class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++)  
        {
            char ch=s.charAt(i);
            // if stack is empty
            if(st.size()==0){
                st.push(ch);
            }
            //  it remove the duplicate strings
            else if(st.peek()==ch){
                st.pop();
            }
            // for the next element
            else{
                st.push(ch);
            }
        }
        //convert stack to string
        StringBuilder res=new StringBuilder();
        // for adding in string from stack
         for(char c : st) {
            res.append(c);
        }
        
        return res.toString();
    }
}  