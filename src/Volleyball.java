import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String year = scan.nextLine();
        int holydays = Integer.parseInt(scan.nextLine());
        int weekendsInProvance = Integer.parseInt(scan.nextLine());

        double playWeekendsInSofia = (48 - weekendsInProvance) * 3.0 / 4;
        double playInHolydays = holydays * 2.0 / 3;
        double totalPlay = playWeekendsInSofia + weekendsInProvance + playInHolydays;

        if (year.equals("leap")) {
            totalPlay = totalPlay * 1.15;
        }

        System.out.printf("%.0f", Math.floor(totalPlay));

    }
}
