import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String flowers = scan.nextLine();
        int quantity = Integer.parseInt(scan.nextLine());
        int budjet = Integer.parseInt(scan.nextLine());

        double price = 0;
        double totalprice = 0;

        switch (flowers) {
            case "Roses":
                price = 5.00;
                if (quantity > 80) {
                    price = price * 0.90;
                }
                break;
            case "Dahlias":
                price = 3.80;
                if (quantity > 90) {
                    price = price * 0.85;
                }
                break;
            case "Tulips":
                price = 2.80;
                if (quantity > 80) {
                    price = price * 0.85;
                }
                break;
            case "Narcissus":
                price = 3.00;
                if (quantity < 120) {
                    price = price * 1.15;
                }
                break;
            case "Gladiolus":
                price = 2.50;
                if (quantity < 80) {
                    price = price * 1.20;
                }
                break;
        }
        totalprice = price * quantity;
        if (totalprice <= budjet) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", quantity, flowers, budjet - totalprice);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", totalprice - budjet);
        }
    }
}
