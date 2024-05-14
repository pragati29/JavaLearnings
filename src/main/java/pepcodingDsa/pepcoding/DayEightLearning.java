package pepcodingDsa.pepcoding;

public class DayEightLearning {
    public static void main(String[] args) {
        sumOfTwoArrays(new int[]{9, 9, 9}, new int[]{2});
    }

    private static void sumOfTwoArrays(int[] arr1, int[] arr2) {
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = i > j ? i : j;
        int[] arr = new int[k+2];
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int d1 = i >= 0 ? arr1[i--] : 0;
            int d2 = j >= 0 ? arr2[j--] : 0;
            int sum = d1 + d2 + carry;
            int d = sum % 10;
            carry = sum / 10;
            arr[k+1] = d;
            k--;
        }
        arr[0]=carry;
        Utility.printArray(arr);
    }

    private static void barChart(int[] bars) {
        int x = bars[0];
        for (int i = 0; i < bars.length; i++) {
            if (x < bars[i]) {
                x = bars[i];
            }
        }
        int y = x;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < bars.length; j++) {
                if (y == bars[j]) {
                    System.out.print("* ");
                    bars[j]--;
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
            y--;
        }
    }

    private static void findElement(int[] arr, int d) {
        int x = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == d) {
                x = i;
            }
        }
        System.out.println(x);
    }

    private static void spanArray(int[] arr) {
        int x = arr[0];
        int y = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (x < arr[i]) {
                x = arr[i];
            }
            if (y > arr[i]) {
                y = arr[i];
            }
        }
        System.out.println(x);
        System.out.println(y);
    }


}
