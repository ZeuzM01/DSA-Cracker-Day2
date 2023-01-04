import java.util.Scanner;

public class LArgestNumberAtleastTwiceOFOther {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int [] a = new int[n];
        for (int i =0;i<n;i++){
            a[i] = scan.nextInt();
        }

        int max = -1, index = -1, second = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                second = max;
                max = a[i];
                index = i;
            } else if (a[i] > second)
                second = a[i];
        }
        System.out.println( second * 2 <= max ? index : -1);

    }
}
