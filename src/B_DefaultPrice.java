import java.util.*;

public class B_DefaultPrice  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        String C[] = new String[N];
        ArrayList<String> D = new ArrayList<>();
        int P[] = new int[M+1];
        for (int i = 0; i < N; i++) {
            C[i] = scanner.next();
        }
        for (int i = 0; i < M; i++) {
            D.add(scanner.next());
        }
        for (int i = 0; i < M+1; i++) {
            P[i] = scanner.nextInt();
        }
        scanner.close();

        int ans = 0;
        Map<String, Integer> color = new HashMap<String, Integer>();
        for (int i = 0; i < D.size(); i++) {
            color.put(D.get(i), P[i+1]);
        }
        for (int i = 0; i < C.length; i++) {
            if (color.get(C[i]) != null) {
                ans += color.get(C[i]);
            } else {
                ans += P[0];
            }
        }
        System.out.println(ans);
    }
}

