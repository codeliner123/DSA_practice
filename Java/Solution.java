import java.util.Scanner;

public class Solution {
    
    public void printNumber() {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(x);
        sc.close();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.printNumber();
    }
}