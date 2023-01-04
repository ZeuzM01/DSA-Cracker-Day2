import java.util.Arrays;
import java.util.Scanner;

public class MaxProductOF3Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] a = new int[n];

        for (int i =0;i<n;i++){
            a[i] = scan.nextInt();
        }
        Arrays.sort(a);
        System.out.println(Math.max(a[n-1]*a[n-2]*a[n-3],a[0]*a[1]*a[n-1]));
    }
}
