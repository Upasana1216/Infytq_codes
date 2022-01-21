package infytq;

import java.util.*;
class Santa {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n;

        n = sc.nextInt();
        int p[] = new int[n];
        int h[] = new int[n];

        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        int c = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (p[i] > h[j]) {
                    c++;
                    h[j] -= 1;
                    break;
                }
            }
        }

        System.out.println(n - c);
    }
}