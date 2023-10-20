package org.example.java8Examples;

public class TescoTest {

    public static void main(String[] args) {
        int []arr = new int[]{5,10,5,5,20};
        System.out.println(requiredChangeOrNot(arr));
    }

    public static boolean requiredChangeOrNot(int arr[]){
        int countOf5=0;
        int countOf10=0;
        int countOf20=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==5)countOf5=countOf5+5;
            else if(arr[i]==10){
                if(countOf5>=5){
                    countOf5=countOf5-5;
                    countOf10=countOf10+10;
                }else{return false;}
            }else {
                if(countOf5>=5 && countOf10>=10){
                    countOf5=countOf5-5;
                    countOf10=countOf10-10;
                    countOf20=countOf20+20;
                }else if(countOf5>=15){
                    countOf5=countOf5-15;
                    countOf20=countOf20+20;
                } else{
                    return false;
                }
            }
        }
        return true;
    }
}
