import java.util.*;
import java.io.*;
public class bracket_matcher {
    static boolean isBalanced(String str)
    {
        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '{' || ch == '(' || ch == '[')
                st.push(ch);
            else if (ch == '}' || ch == ')' || ch == ']') {
                if (st.isEmpty()) {
                    return false;
                } else if ((ch == '}' && st.peek() == '{') || (ch == ']' && st.peek() == '[')
                        || (ch == ')' && st.peek() == '('))
                    st.pop();
                else
                    return false;
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args)throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the String");
        String str=in.readLine();
        System.out.println(isBalanced(str));
        
    }
}
