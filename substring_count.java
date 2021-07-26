import java.io.*;
public class substring_count {
    public static void main(String[] args)throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String pat,mat;
        mat=in.readLine();
        pat=in.readLine();
        int total_length=0;
        String str[]=mat.split(pat);
        for(String item:str){
            total_length+=item.length();
        }
        int length=(mat.length()-total_length)/pat.length();
        System.out.println(length);
        //Pattern p=Pattern.compile(pat);
        //Matcher m=p.matcher(mat);
        //int count =0;
        //while(m.find()) {
        //    count++;
    }
}
