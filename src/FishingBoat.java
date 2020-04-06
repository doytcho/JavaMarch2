import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int budjet = Integer.parseInt(scan.nextLine());
        String season = scan.nextLine();
        int fishers = Integer.parseInt(scan.nextLine());

        double boatPrice = 0.00;

        if (season.equals("Spring")) {
            boatPrice = 3000;
        } else if (season.equals("Winter")) {
            boatPrice = 2600;
        } else {
            boatPrice = 4200;
        }

        if (fishers <= 6) {
            boatPrice = boatPrice * 0.90;
        } else if (fishers <= 11) {
            boatPrice = boatPrice * 0.85;
        } else {
            boatPrice = boatPrice * 0.75;
        }
        if (!season.equals("Autumn") && fishers % 2 == 0) {
            boatPrice = boatPrice * 0.95;
        }
        if (boatPrice <= budjet) {
            System.out.printf("Yes! You have %.2f leva left.", budjet - boatPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", boatPrice - budjet);
        }
    }
}
