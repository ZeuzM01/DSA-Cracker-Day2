import java.util.Scanner;

public class MaxChuncksToMakeArraySorted2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int [] a = new int[n];
        for (int i =0;i<n;i++){
            a[i] = scan.nextInt();
        }
        int [] rightMin = new int[n];
        rightMin[n-1] = a[n-1];

        for (int i = n-2;i>=0;i--){
            rightMin[i] = Math.min(rightMin[i+1],a[i]);
        }
        int res = 1;
        int max = Integer.MIN_VALUE;
        for (int i =0;i<n;i++){
             max = Math.max(max,a[i]);

             if(max <= rightMin[i])
                 res++;
        }
        System.out.println(res);
    }
}
