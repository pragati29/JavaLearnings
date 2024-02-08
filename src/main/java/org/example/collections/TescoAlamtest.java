package org.example.collections;

import java.util.Arrays;

public class TescoAlamtest {

    /*
    array1={-5,-4,1,5} arra2={-2,3,6} median=1
     */
    public static void main(String[] args) {
        int []arr1={1,3,7};
        int []arr2={8,9,10,11};
       // System.out.println(median(arr1,arr2));
        usingTemp(arr1,arr2);
    }

    private static int median(int[] arr2, int[] arr1) {
        int x = arr1.length;
        int y = arr2.length;
        int p = 0;
        int q = 0;
        int i = 0;
        int j = 0; //-5,-4,1,5 arr2 -2,3,6
        int n = x + y;
        if (n % 2 == 1) {
            for (int k = 0; k <= n / 2; k++) {
                if (i != x && j != y) {
                    if (arr1[i] < arr2[j]) {
                        p = arr1[i];
                        i++;
                    } else {
                        p = arr2[j];
                        j++;
                    }
                } else if (i < x) {
                    p = arr1[i++];
                } else if (j < y) {
                    p = arr2[j++];
                }
            }
            return p;
        } else {
            for (int k = 0; k <= n / 2; k++) {
                q = p;
                if (i != x && j != y) {
                    p = arr1[i] > arr2[j] ? arr2[j++] : arr1[i++];
                } else if (i < x) {
                    p = arr1[i++];
                } else {
                    p = arr2[j++];
                }
            }
            return (p + q) / 2;
        }

    }

    /*int []merged=new int[x+y];
        int k=0;
        for(int i=0;i<x;i++){
             merged[k++]= arr1[i];
        }
        for(int i=0;i<y;i++){
            merged[k++]= arr2[i];
        }
        Arrays.sort(merged);
        int total=merged.length/2;*/

    static int usingTemp(int[] arr1,int[] arr2){
        int i=0;int j=0;
        int x=arr1.length;
        int y=arr2.length;
        int temp[]=new int[x+y];
        int k=0;
        while(i<x&&j<y){
            if(arr1[i]<arr2[j]){
                temp[k++]=arr1[i++];
            }else{
                temp[k++]=arr2[j++];
            }
        }
        while(i<x){
            temp[k++]=arr1[i++];
        }
        while(j<y){
            temp[k++]=arr2[j++];
        }
        for(int l=0;l<k;l++){
            System.out.println(temp[l]);
        }
        return 0;
    }
}
