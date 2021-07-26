import java.util.*;
import java.io.*;
public class remove_duplicate_letters {
    public static void main(String[] args)throws IOException {
       BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
       String str[]=in.readLine().split(" ");
       LinkedHashSet<String> list=new LinkedHashSet<>();
       for(int i=0; i<str.length;i++){
           list.add(str[i]);
       }
       for(String ch:list){
           System.out.print(ch+" ");
       }
    }
}
