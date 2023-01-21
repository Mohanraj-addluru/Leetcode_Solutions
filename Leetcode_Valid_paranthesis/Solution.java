class Solution {
    public boolean isValid(String s)
    {
        char[] str = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i<s.length();i++)
        {
            if ( str[i] == '(' || str[i] == '{' || str[i] == '[')
            {
                stack.push(str[i]);
            }
            else if((str[i] == ')' || str[i] == '}' || str[i] == ']') && (stack.size() >=1))
            {
                if(str[i] == ')' && stack.peek() == '(')
                {
                    stack.pop();

                }
                else if(str[i] == '}' && stack.peek() == '{')
                {
                    stack.pop();
                }
                else if(str[i] == ']' && stack.peek() == '[')
                {
                    stack.pop();
                }
                else
                {
                    break;
                }
                System.out.println(stack);
            }
            else
            {
                // break;
                return false;
            }
        }
        if (stack.size() > 0)
        {
            return false;
        }
        else
        {
            return true;
        }

    }
}


