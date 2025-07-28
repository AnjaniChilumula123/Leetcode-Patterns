// Last updated: 7/28/2025, 12:33:13 PM
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack =new Stack<>();
        if(s.length()%2!=0) return false;
        for(int i=0;i<s.length();i++)
        {
          if(s.charAt(i)=='{')
            stack.push('}');
           else if(s.charAt(i)=='[')
            stack.push(']');
             else if(s.charAt(i)=='(')
            stack.push(')');
          else if(stack.isEmpty()||stack.pop()!= s.charAt(i)) return false;
        }
      return stack.isEmpty();
    }
}