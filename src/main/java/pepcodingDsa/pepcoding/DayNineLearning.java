package pepcodingDsa.pepcoding;

import java.util.Stack;

public class DayNineLearning {
    public static void main(String[] args) {
        duplicateBrackets("(((a+b))+(c+d))"); //true
    }

    private static void duplicateBrackets(String s) {
        int x=s.length()-1;
        Stack<Character>st=new Stack<>();
        int i = 0;
        while(i<=x){
           char c=st.push(s.charAt(i));
           if(c==')') {
               if (st.peek() == '(') {
                   System.out.println(true);
                   return;
               } else {
                   while (st.peek() != '(') {
                       st.pop();
                   }
                   st.pop();
               }
           }else{
               st.push(c);
           }
            i++;
        }
        System.out.println(false);
        System.out.println(st);
    }

    private static void subtractTwoArrays(int[] ints, int[] ints1) {
        int k=ints1.length;
        int i=ints.length-1;
        int j=ints1.length-1;
        int arr[]=new int[k];
        while(k>0){
            int d=ints1[j--];
            int d1=i>=0?ints[i--]:0;
            if(d<d1){
                d=d+10;
                ints1[j]=ints1[j]-1;
            }
            int x=d-d1;
            arr[k-1]=x;
            k--;
        }
        int x=0;
        while(x< arr.length){
            if(arr[x]==0){
                x++;
            }else {
                break;
            }
        }
        for(int p=x;p<arr.length;p++){
            System.out.println(arr[p]);
        }

    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
