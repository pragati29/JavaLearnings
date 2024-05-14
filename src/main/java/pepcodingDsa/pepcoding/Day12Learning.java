package pepcodingDsa.pepcoding;

import java.util.Stack;

//24-02-2024
public class Day12Learning {
    public static void main(String[] args) {
        //nextGreaterElement(new int[]{3, 6, 2, 1, 5, 9, 8, 4, 3, 5});
        nextSmallerElementRight(new int[]{3, 6, 2, 1, 5, 9, 8, 4, 3, 5});
    }

    private static void nextGreaterElement(int[] arr) {
        int[] nge = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for (int i = 1; i < arr.length; i++) {
            while (st.size() > 0 && arr[i] > arr[st.peek()]) {
                int pos = st.peek();
                nge[pos] = arr[i];
                st.pop();
            }
            st.push(i);
        }
        while (st.size() > 0) {
            int pos = st.peek();
            nge[pos] = -1;
            st.pop();
        }
        for (int i = 0; i < nge.length; i++) {
            System.out.println(nge[i]);
        }
    }

    private static void nextSmallerElementRight(int[] arr) {
        int[] nge = new int[arr.length];
        nge[arr.length - 1] = -1;
        Stack<Integer> st = new Stack<>();
        st.push(arr[arr.length - 1]);
        for (int i = arr.length - 2; i >= 0; i--) {
            while (st.size() > 0 && arr[i] >= st.peek()) {
                st.pop();
            }
            if (st.size() == 0) {
                nge[i] = -1;
            } else {
                nge[i] = st.peek();
            }
            st.push(arr[i]);
        }
        System.out.println("Another");
        for (int i = 0; i < nge.length; i++) {
            System.out.println(nge[i]);
        }
    }

}

