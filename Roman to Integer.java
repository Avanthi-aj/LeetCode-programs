class Solution {
     public static int value(char k)
        {
            Map<Character,Integer> mp = new HashMap<>();
            mp.put('I',1);
            mp.put('V',5);
            mp.put('X',10);
            mp.put('L',50);
            mp.put('C',100);
            mp.put('D',500);
            mp.put('M',1000);
            return mp.get(k);
        }
    public int romanToInt(String s) {
        Stack<Integer> stk=new Stack<Integer>();
        for(int i=0;i<s.length();i++)
        {
            char x=s.charAt(i);
            stk.push(value(x));
        }
        int ans=stk.peek();
        while(stk.size()>1)
        {
            int a=stk.pop();
            int b=stk.peek();
            if(b>=a)
            {
                ans+=b;
            }
            else
            {
                ans-=b;
            }
        }
        return ans;
    }
}
