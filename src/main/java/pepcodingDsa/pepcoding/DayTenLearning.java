package pepcodingDsa.pepcoding;

import java.util.Stack;

public class DayTenLearning {

    public static void main(String[] args) {
        balancedBrackets("[{}])");
    }

    private static void balancedBrackets(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{' ||ch=='[' ){
                st.push(ch);
            }else if(!st.empty()){
                char chc=st.peek();
                if((chc=='{' &&ch=='}')||(chc=='(' && ch==')')||(chc=='[' && ch==']')){
                    st.pop();
                }
            }else{
                st.push(ch);
            }
        }
        System.out.println(st.empty());

    }
}
