import java.util.Scanner;

public class NumMixer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            int x = scan.nextInt();
            A[i] = x;
        }
        for (int i = 0; i < N; i++) {
            int x = scan.nextInt();
            B[i] = x;
        }
        int x = scan.nextInt();
        int a = 0;
        int b = N - 1;

        if (x > 0) {
            for (int i = 0; i < N; i++) {
                 System.out.printf("%d %d ",A[i],B[b-i]);
            }

        } else {
                for (int i = 0; i < N; i++) {
                 System.out.printf("%d %d ",B[b-i],A[i]);
                 }
        }

    }
}