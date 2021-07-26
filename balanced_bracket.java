import java.io.*;
import java.util.*;
public class balanced_bracket {
    public static void main(String[] args)throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str=in.readLine();
        if(str.length()%2==0){
            Stack<Character> s = new Stack<Character>();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch == '}' && !s.empty()) {
                    if (s.peek() == '{')
                        s.pop();
                    else
                        s.push(ch);
                } else
                    s.push(ch);
            }
            int n = 0;
            int red_len = s.size();
            while (!s.isEmpty() && s.peek() == '{') {
                s.pop();
                n++;
            }
            int len;
            len = red_len / 2 + n % 2;
            System.out.println(len);
        }
        else
        System.out.println(-1);
    }
}
