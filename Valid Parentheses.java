class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk=new Stack<Character>();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
            {
                stk.push(s.charAt(i));      
            }
            else
            {
                if(stk.isEmpty())
                {
                    return false;
                }
                else if((stk.peek()=='(' && s.charAt(i)!=')') || (stk.peek()=='{' && s.charAt(i)!='}') || (stk.peek()=='[' && s.charAt(i)!=']'))
                {
                    return false;
                }
                else{
                    stk.pop();
                }
            }
        }
        if(stk.isEmpty())
        {
            return true;
        }
        return false;
    }
}Valid Parentheses
