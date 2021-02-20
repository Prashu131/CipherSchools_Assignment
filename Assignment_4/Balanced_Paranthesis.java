package Assignment_4;

import java.util.Stack;

public class Balanced_Paranthesis {
    public static boolean isBalanced(String str)
    {
        Stack<Character> s =new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='(' || str.charAt(i)=='[' || str.charAt(i)=='{')
                s.push(str.charAt(i));
            else
            {
                if(s.isEmpty()==true)
                    return true;
                else if(matching(str.charAt(i),s.peek())==false)
                    return false;
                else
                    s.pop();
            }
        }
            return s.isEmpty();
    }
    public static boolean matching(char a, char b)
    {
        return ((a==')' && b=='(') || (a=='{' && b=='}') || (a=='[' && b==']') );
    }

    public static void main(String[] args) {
        String str ="{}[])";
        System.out.println(isBalanced(str));
    }
}
