import java.util.*;

public class A_NewScheme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 8;
        int S[] = new int[N];
        String ans = "No";
        for (int i = 0; i < N; i++) {
            S[i] = scanner.nextInt();
            if (i > 0 && S[i]-S[i-1]<0) {
                System.out.println(ans);
                System.exit(0);
            }
            if (S[i] < 100 || S[i] > 675) {
                System.out.println(ans);
                System.exit(0);
            }
            if (S[i] % 25 != 0) {
                System.out.println(ans);
                System.exit(0);
            }
        }
        scanner.close();
        ans = "Yes";
        System.out.println(ans);
    }
}

