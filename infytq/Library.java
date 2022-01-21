package infytq;

import java.util.*;
class Library {

    static int comb(int c, int d, int cc, int dd) {
        if (d == 1) return cc * c / dd;
        return comb(c - 1, d - 1, cc * c, dd * d);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a, b, c, d;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        if (a < 1 || b < 2 || c < d) {
            System.out.println("0");
        } 
        else {
            int ans = 1;
            ans *= a;
            ans = ans * b * (b - 1) / 2;
            ans *= comb(c, d, 1, 1);
            System.out.println(ans);
        }
    }
}
