package pepcodingDsa.pepcoding;

public class Day6Learning {

    public static void main(String[] args) {
       // patternNineteen(5);
        int x= (int) (2024* Math.random());
        for(int i=1;i<=8;i++) {
            int y= (int) (20240*i* Math.random());
            System.out.println(y);
        }
    }

    private static void patternNineteen(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i == 1 && j > (n + 1) / 2 && j != n)
                        || (i!=1&&i <= n / 2 && j !=n &&j>(n+1)/2)
                        ) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    private static void patternEighteen(int n) {
        int sp = 0;
        int st = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= st; j++) {
                if (i > 1 && i <= n / 2 && j > 1 && j < st) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
            if (i <= n / 2) {
                sp++;
                st -= 2;
            } else {
                sp--;
                st += 2;
            }
        }

    }
}
