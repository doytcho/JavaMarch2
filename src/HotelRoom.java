import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String mounth = scan.nextLine();
        int nights = Integer.parseInt(scan.nextLine());

        double priceStudio = 0;
        double priceApartment = 0;

        switch (mounth) {
            case "May":
            case "October":
                priceStudio = 50.00;
                priceApartment = 65.00;
                if (nights > 7 && nights <= 14) {
                    priceStudio = priceStudio * 0.95;
                } else if (nights > 14) {
                    priceStudio = priceStudio * 0.70;
                }
                break;
            case "June":
            case "September":
                priceStudio = 75.20;
                priceApartment = 68.70;
                if (nights > 14) {
                    priceStudio = priceStudio * 0.80;
                }
                break;
            case "July":
            case "August":
                priceStudio = 76.00;
                priceApartment = 77.00;
                break;
        }

        if (nights > 14) {
            priceApartment = priceApartment * 0.90;
        }
        System.out.printf("Apartment: %.2f lv.%n", priceApartment * nights);
        System.out.printf("Studio: %.2f lv.", priceStudio * nights);
    }
}
