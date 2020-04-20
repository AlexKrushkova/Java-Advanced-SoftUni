import java.util.Scanner;

public class RecrusiveFibonacci {

    private static long [] memory;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        memory = new long[n+1];

        long result = getFibb(n);
        System.out.println(result);
    }
    private static long getFibb(int n) {
        if (n<2){
            return 1;
        }
        if (memory[n] != 0){
            return memory[n];
        }
        return  memory[n] = getFibb(n-1) + getFibb(n-2);
    }
}
