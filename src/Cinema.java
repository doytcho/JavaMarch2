import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String type = scan.nextLine();
        int row = Integer.parseInt(scan.nextLine());
        int colum = Integer.parseInt(scan.nextLine());

        double price = 0;

        switch (type) {
            case "Premiere":
                price = 12.00;
                break;
            case "Normal":
                price = 7.50;
                break;
            case "Discount":
                price = 5.00;
                break;
        }
        double totalPrice = price * row * colum;
        System.out.printf("%.2f", totalPrice);
    }
}
