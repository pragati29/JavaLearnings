package pepcodingDsa.pepcoding;

public class Day11Learning {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 5, 7, 4, 9, 6, 12, 8, 1};
        nextGreaterElementOnRight(arr);
    }

    private static void nextGreaterElementOnRight(int[] arr) {

        int i = 0;
        int j = i + 1;
        int arr1[] = new int[arr.length];
        for (i = 0; i < arr.length - 1; ) {
            if (j == arr.length) {
                arr1[i++] = -1;
                j = i + 1;
            }
            if (j!= arr.length && arr[j] > arr[i]) {
                arr1[i++] = arr[j];
                j = i + 1;
            } else {
                j = j + 1;
            }
        }
        arr1[arr.length-1]=-1;
        Utility.printArray(arr1);
    }
}
