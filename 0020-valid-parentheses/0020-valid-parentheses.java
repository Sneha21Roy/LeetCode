import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
                st.push(ch);// when the character is opening bracket it will be pushed
            }
            else{
                if(st.isEmpty()) return false;// when nothing in stack return false
                char top=st.pop();
                if((ch==')'&& top!='(')|| //when ever the bracket is closed it will give false
                  (ch=='}' && top!='{')||
                  (ch==']' && top!='['))
                  return false;
            }
        }
        return st.isEmpty();
    }
    
}
