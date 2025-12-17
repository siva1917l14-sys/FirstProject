import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read size
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Read array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Compute sum
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }

        // Print result
        System.out.println("Sum = " + sum);
    }
}
