package programming2024.June;

import java.util.ArrayList;
import java.util.List;

public class Subsequence {
    static List<String> strings=new ArrayList<>();
    /*
    input -> aaa
    output-> a, a, a, aa, aa, aa, aaa
     */
    public static void main(String[] args) {
       String s="aaa";
        findSubsequences(s,"");
        System.out.println(strings);

    }

    private static void findSubsequences(String s, String ans) {
        if(s.length()==0){
            strings.add(ans);
            return;
        }
        findSubsequences(s.substring(1),ans+s.charAt(0));
        findSubsequences(s.substring(1),ans);
    }
}
