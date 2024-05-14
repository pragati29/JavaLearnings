package org.example.leetcodeproblems;

public class March28Problem {
    public static void main(String[] args) {
            myAtoi("  -22faf67");
            // "  -22faf67"
    }
    public static int myAtoi(String s) {
        StringBuilder sb= new StringBuilder();
        int k=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1)=='-'|| (Character.isDigit(s.charAt(i-1))&& !Character.isLetter(s.charAt(i)))){
                k=i;
                sb.append(s.charAt(i-1));
            }else if( Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))){
                continue;
            }
        }
        //sb.append(s.substring());
        System.out.println(sb);
        Integer x=Integer.valueOf(sb.toString());
        System.out.println(x instanceof Integer);
        System.out.println(x);
        return x;
    }
}
