class Solution 
{
    public int calculate(String s) 
    {
        Stack<Integer> num = new Stack<>();
        Stack<Character> op = new Stack<>();
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('+' ,1 );
        map.put('-' , 1);
        map.put('*',2);
        map.put('/' ,2 );
        for(int i =0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if('0' <= ch && ch <= '9')
            {
                num.push(ch-'0');
            }
            else
            {
                if(op.isEmpty())
                {
                    op.push(ch);
                }
                else if(map.get(op.peek()) < map.get(ch))
                {
                    op.push(ch);
                }
                else
                {

                    int n1 = num.pop();
                    int n2 = s.charAt(++i) - '0';
                    char ch2 = op.pop();
                    if()
                }
            }
        map.put('+' , )

        }        
    }
}