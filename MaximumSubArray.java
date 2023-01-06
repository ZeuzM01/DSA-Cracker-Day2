import java.util.Scanner;

public class MaximumSubArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] a = new int[n];
        for (int i =0;i<n;i++){
            a[i] = scanner.nextInt();
        }

        int max = 0;
        int curr =0;

        for (int i =0;i<n;i++) {
            if (curr < 0) {
                curr = 0;
            } else {
                curr += a[i];
            }
            max = Math.max(curr,max);
        }

        System.out.println(max);

    }
}
