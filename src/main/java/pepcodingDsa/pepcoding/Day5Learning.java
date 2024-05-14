package pepcodingDsa.pepcoding;

public class Day5Learning {
    public static void main(String[] args) {
        patternSeventeen(5);
    }

    private static void patternSeventeen(int n) {
        int sp = n / 2;
        int x = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                if(i==(n+1)/2){
                    System.out.print("*");
                }else{
                System.out.print(" ");}
            }
            for (int j = 1; j <= x; j++) {
                    System.out.print("*");
            }

            if (i <= n / 2) {
                x++;
            } else if (i > n / 2) {
                x--;
            }
            System.out.println();
        }
    }

    private static void patternSixteen(int n) {
        int sp = 2 * n - 3;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                if (j == n) {
                    continue;
                }
                System.out.print(j);
            }
            System.out.println();
            sp -= 2;

        }
    }

    private static void patternFifteen(int n) {
        int sp = n / 2;
        int ex = 1;
        int nu = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < sp; j++) {
                System.out.print("  ");
            }
            int cval = nu;
            for (int j = 1; j <= ex; j++) {
                System.out.print(cval + " ");
                if (j <= ex / 2) {
                    cval++;
                } else {
                    cval--;
                }
            }
            System.out.println();
            if (i <= n / 2) {
                sp--;
                ex = ex + 2;
                nu++;
            } else {
                sp++;
                ex = ex - 2;
                nu--;
            }
        }
    }

    private static void patternFourteen(int n) {
        for (int i = 1; i <= 10; i++) {
            int x = n * i;
            System.out.println(n + " * " + i + " = " + x);
        }
    }

    private static void patternThirteen(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    private static void patternTwelve(int n) {
        int prev = 0;
        int next = 1;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(prev + " ");
                sum = prev + next;
                prev = next;
                next = sum;
            }
            System.out.println();
        }
    }

    private static void patternEleven(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(++count + " ");
            }
            System.out.println();
        }
    }
}
