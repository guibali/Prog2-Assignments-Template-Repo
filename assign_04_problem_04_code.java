
// Abdullah Ibrahim Hassan
// 20216079

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the size of the array
        int n = sc.nextInt();

        
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        Arrays.sort(a);

        
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " "); }
    }
}
 // 04