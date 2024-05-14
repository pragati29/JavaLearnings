package programming2024.march;

import java.util.ArrayList;
import java.util.List;

public class ProgramOne {
    public static void main(String[] args) {
        //lexographicallyLargest("1134");

        int x=countPairs(new int[]{122,21,21,23},4);
        System.out.println(x);
       /* for(int i=0;i<x.length;i++){
            System.out.println(x[i]);
        }*/



    }
    static boolean checkValidPair(int num1,
                                  int num2)
    {
        String s1 = Integer.toString(num1);
        String s2 = Integer.toString(num2);

        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    return true;
                }
            }
        }
        return false;
    }


    static int countPairs(int []arr, int n)
    {


        int numberOfPairs = 0;
        int x[]=new int[2];
        List<Integer> li=new ArrayList<>();
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)

                if (checkValidPair(arr[i], arr[j])) {
                    numberOfPairs++;
                }

        return numberOfPairs;
    }

    private static void lexographicallyLargest(String number) {
        String []temp=new String[number.length()];
        int k=0;
        for(int i=0;i<number.length();){
            int x= number.charAt(i)-'0';
            int y= number.charAt(i + 1)-'0';
            if(x+y <=9){
                temp[k++]=String.valueOf(x+y);
                i=i+2;
            }else{
                i++;
            }
        }
    }
}
