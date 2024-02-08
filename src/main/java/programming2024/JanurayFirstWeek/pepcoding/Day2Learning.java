package programming2024.JanurayFirstWeek.pepcoding;

public class Day2Learning {
    public static void main(String[] args) {
        // gcdAndlcm(36,24);
       // gcdAndlcmAnother(36, 36);
        //primefactorisation(3);
        benjamimBulbs(100);
    }

    private static void gcdAndlcm(int i, int i1) {
        int gcd = 0;
        int lcm = 0;
        int x = i > i1 ? i / 2 : i1 / 2;

        for (int j = 2; j <= x; j++) {
            if (i % j == 0 && i1 % j == 0) {
                gcd = j;
            }
        }
        System.out.println(gcd);
        lcm = (i * i1) / gcd;
        System.out.println(lcm);
    }

    private static void gcdAndlcmAnother(int a, int b) {
        int gcd = 0;
        int lcm = 0;
        int p = a;
        int q = b;
        while (a % b != 0) {
            int x = a % b;
            a = b;
            b = x;
        }
        gcd = b;
        System.out.println(b);
        lcm = (p * q) / gcd;
        System.out.println(lcm);

    }

    public static void primefactorisation(int num){
        int i=2;
        while(num!=0&&num!=i){
            if(num/i!=0&&num%i==0 ){
                int x = num / i;
                num = x;
                System.out.println(i);
            }else{
                i=i+1;
            }
        }
        System.out.println(i);
    }

    public static boolean pythagoresTriplet(int x,int y,int z){
        return (x * x) + (y * y) == z * z || ((x * x) + (z * z) == y * y) || ((z * z) + (y * y) == z * z);
    }

    public static void benjamimBulbs(int n){
        int count =0;
        int i=1;

        while(i*i<=n){
            System.out.println(i*i);
            i++;
        }
    }
}
