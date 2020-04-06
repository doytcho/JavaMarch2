import java.util.Scanner;

public class EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int pow = 1;
        for (int i = 0; i <= n; i += 2) {
            System.out.println(pow);
            pow = pow * 4;
        }
    }
}
