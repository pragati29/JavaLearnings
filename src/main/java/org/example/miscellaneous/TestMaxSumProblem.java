package org.example.miscellaneous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TestMaxSumProblem {

    public static Integer maximumSum(int[] A, int N, int K)
    {   // Stores sum of subarray having
        // K consecutive elements
        int curr_sum = 0;
        // Stores the maximum sum among all
        // subarrays of size K having
        // consecutive elements
        int max_sum = 0;
        // Traverse the array
        for (int i = 0; i < N - K + 1; i++) {
            // Store K elements of one
            // subarray at a time
            int[] dupl_arr = Arrays.copyOfRange(A, i, i + K);
            // Sort the duplicate array
            // in ascending order
            Arrays.sort(dupl_arr);
           // Checks if elements in subarray
            // are consecutive or not
            Boolean flag = true;
            // Traverse the k elements
            for (int j = 1; j < K; j++) {
                // If not consecutive, break
                if (dupl_arr[j] - dupl_arr[j - 1]
                        != 1) {
                    flag = false;
                    break;
                }
            }
            // If flag is true update the
            // maximum sum
            if (flag) {
                int temp = 0;
                // Stores the sum of elements
                // of the current subarray
                curr_sum = 0;
                for(int x = 0; x < dupl_arr.length; x++){
                    curr_sum += dupl_arr[x];
                }
                // Update the max_sum
                max_sum = Math.max(max_sum,
                        curr_sum);
                // Reset curr_sum
                curr_sum = 0;
            }
        }
        // Return the result
        return max_sum;
    }

    public static int testAnotherApproach(int[] A, int n, int K){
        int maxSum=0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k < j + 1; k++) {
                    sum = sum + A[k];
                }
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }

    // Driver Code
    public static void main(String args[]) {
        int[] arr = { 10, 12, 9, 8, 10, 15, 1, 3, 2 };
        int K = 3;
        int N = arr.length;
        System.out.println(testAnotherApproach(arr, N, K));
        List lis=new ArrayList();
        lis=new LinkedList();
    }

}

