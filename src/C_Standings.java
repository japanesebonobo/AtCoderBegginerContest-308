import java.util.*;

public class C_Standings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        TreeMap<Double, Queue<Integer>> color = new TreeMap<Double, Queue<Integer>>();
        for (int i = 0; i < N; i++) {
            double A = scanner.nextDouble();
            double B = scanner.nextDouble();
            double S = A / (A+B);
            Queue<Integer> H = new LinkedList<>();
            if (color.get(S) != null) {
                color.get(S).add(i+1);
            } else {
                H.add(i+1);
                color.put(S, H);   
            }
        }
        scanner.close();

        NavigableMap<Double, Queue<Integer>> descendingMap = color.descendingMap();
        for (Map.Entry<Double, Queue<Integer>> value : descendingMap.entrySet()) {
            Queue<Integer> Queue = value.getValue();
            while(Queue.size() != 0) {
                System.out.println(Queue.poll());
            }
        }
    }
}

