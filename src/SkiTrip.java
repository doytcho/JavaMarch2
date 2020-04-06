import java.util.Scanner;
import java.util.concurrent.atomic.DoubleAccumulator;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        String room = scan.nextLine();
        String mark = scan.nextLine();

        int night = days - 1;
        double price = 0;

        switch (room) {
            case "room for one person":
                price = 18.00;
                break;
            case "apartment":
                price = 25.00;
                if (days < 10) {
                    price = price * 0.70;
                } else if (days <= 15) {
                    price = price * 0.65;
                } else {
                    price = price / 2;
                }
                break;
            case "president apartment":
                price = 35.00;
                if (days < 10) {
                    price = price * 0.90;
                } else if (days <= 15) {
                    price = price * 0.85;
                } else {
                    price = price * 0.80;
                }
                break;
        }
        double totalPrice = price * night;
        if (mark.equals("positive")) {
            totalPrice = totalPrice * 1.25;
        } else {
            totalPrice = totalPrice * 0.90;
        }
        System.out.printf("%.2f", totalPrice);
    }
}
