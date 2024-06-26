package programming2024.June;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Interview18June {
    public static void main(String[] args) {
      String input ="Hello World";
        System.out.println(lengthOfLastWord(input));
    }
    public static int lengthOfLastWord(String s) {
        String input=s.trim();
        int count =0;
        for(int i=input.length()-1;i>=0;i--){

            if(input.charAt(i)!=' '){
                count++;
            }else{
                break;
            }
        }
        return count;
    }

    public static String concatenateString(String str1,String str2){
        String st="";
        int i=str1.length()-1;
        int j=str2.length()-1;

        return st;

    }
}
