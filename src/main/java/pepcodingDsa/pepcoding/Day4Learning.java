package pepcodingDsa.pepcoding;

public class Day4Learning {
    public static void main(String[] args) {
        patternTen(5);
    }

    private static void patternTen(int n) {
     int isp=-1;
     int osp=n/2;
        for(int i=1;i<=n;i++){
          //  System.out.println(isp+","+osp);
            for(int j=1;j<=osp;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j=1;j<=isp;j++){
                System.out.print(" ");
            }
            if(i>1&&i<n){
                System.out.print("*");
            }
            System.out.println();
            if(i<=n/2){
                isp+=2;
                osp--;
            }else{
                osp++;
                isp-=2;
            }
        }
    }

    private static void patternNine(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || i + j == n + 1) {
                    System.out.print("*");
                }
                    System.out.print(" ");

            }
            System.out.println();
        }

    }

    private static void patternEight(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j--) {
                if (i == j) {
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static void patternSeven(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) {
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static void patternSix(int n) {
        int st = (n / 2) + 1;
        int sp = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < st; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < sp; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < st; j++) {
                System.out.print("* ");
            }
            System.out.println();
            if (i <= n / 2) {
                sp += 2;
                st--;
            } else {
                st++;
                sp -= 2;
            }
        }
    }

    private static void patternFive(int n) {
        int sp = n / 2;
        int st = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < sp; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < st; j++) {
                System.out.print(" *");
            }
            System.out.println();
            if (i <= n / 2) {
                sp--;
                st += 2;
            } else {
                sp++;
                st -= 2;
            }
        }
    }


}
