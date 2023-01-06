import java.util.Scanner;

public class SubArrayWithBoundedMAx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int left = scanner.nextInt();
        int right = scanner.nextInt();
        int [] a = new int[n];
        for (int i =0;i<n;i++){
            a[i] = scanner.nextInt();
        }

        int i =0;
        int j =0;
        int ans = 0;
        int smaller =0;

        while (i<n){
            if(a[i] >= right && a[i]<=left){
                smaller = i-j+1;
                ans+=smaller;
            }

            else if (a[i] < right){
                ans+=smaller;
            }
            else {
                j =i+1;
                smaller =0;
            }

            i++;
        }
        System.out.println(ans);
    }
}
