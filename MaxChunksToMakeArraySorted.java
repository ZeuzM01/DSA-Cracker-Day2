import java.util.Scanner;

public class MaxChunksToMakeArraySorted {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int max = 0;
        int curr = 0;

        for (int i =0;i<n;i++){
            max = Math.max(i,n);

            if(max == i)
                curr++;
        }

        System.out.println(curr);
    }


}
