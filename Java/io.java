import java.util.Scanner;

public class io {
    
    public void printNumber() {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(x);
        sc.close();
    }

    public static void main(String[] args) {
        io sol = new io();
        sol.printNumber();
    }
}
