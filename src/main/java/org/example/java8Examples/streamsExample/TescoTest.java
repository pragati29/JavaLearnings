package org.example.java8Examples.streamsExample;

public class TescoTest {

    public static void main(String[] args) {
        // int []arr = new int[]{5,10,5,5,20};
        // System.out.println(requiredChangeOrNot(arr));
        int[] arr = {900, 940, 950, 1100, 1500, 1800};
        int[] dep = {910, 1200, 1120, 1130, 1900, 2000};
        int n = 6;
        System.out.println(findPlatform(arr, dep, n));
    }

    public static boolean requiredChangeOrNot(int arr[]) {
        int countOf5 = 0;
        int countOf10 = 0;
        int countOf20 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 5) countOf5 = countOf5 + 5;
            else if (arr[i] == 10) {
                if (countOf5 >= 5) {
                    countOf5 = countOf5 - 5;
                    countOf10 = countOf10 + 10;
                } else {
                    return false;
                }
            } else {
                if (countOf5 >= 5 && countOf10 >= 10) {
                    countOf5 = countOf5 - 5;
                    countOf10 = countOf10 - 10;
                    countOf20 = countOf20 + 20;
                } else if (countOf5 >= 15) {
                    countOf5 = countOf5 - 15;
                    countOf20 = countOf20 + 20;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static int findPlatform(int arr[], int dep[], int n) {
        int plat_needed = 1;
        int result = 1;
        for (int i = 0; i < n; i++) {
            plat_needed = 1;
            for (int j = 0; j < n; j++) {
                if (i != j)
                    if (arr[i] >= arr[j] && dep[j] >= arr[i])
                        plat_needed++;
            }
            result = Math.max(plat_needed, result);
        }
        return result;
    }
}
