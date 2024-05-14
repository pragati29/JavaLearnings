package pepcodingDsa.pepcoding;

public class Day3Learning {
    public static void main(String[] args) {
        patternFour(5);
    }

    private static void patternOne(int n) {
        for(int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    private static void pattern2(int n){
        for(int i=n;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println(" ");

        }
    }
    private static void patternThree(int n){
        int sp=n;
        for(int i=1;i<=n;i++){
            int j=sp;
            while(j>1){
                System.out.print("  ");
                j--;
            }
            while(j<=i){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            sp--;
        }
    }
    public  static void patternFour(int n){
        int sp=0;
        for(int i=n;i>=1;i--){
            for(int k=1;k<=sp;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println(" ");
            sp++;
        }
    }

}
