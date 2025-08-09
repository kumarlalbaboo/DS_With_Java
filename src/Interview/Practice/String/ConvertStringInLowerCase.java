package Interview.Practice.String;

public class ConvertStringInLowerCase {
    public static void main(String[] args) {
        String str = "LALBABOO";

        String res = "";

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                res = res + (char)(ch+32);
            }
        }
        System.out.println(res);
    }
}
