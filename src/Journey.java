import org.ietf.jgss.GSSName;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budjet = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();

        double price = 0;
        String destination = "";
        String typeOfVacantion = "";

        if (budjet <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                typeOfVacantion = "Camp";
                price = budjet * 0.30;
            } else {
                typeOfVacantion = "Hotel";
                price = budjet * 0.70;
            }
        } else if (budjet <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                typeOfVacantion = "Camp";
                price = budjet * 0.40;
            } else {
                typeOfVacantion = "Hotel";
                price = budjet * 0.80;
            }
        } else {
            destination = "Europe";
            typeOfVacantion = "Hotel";
            price = budjet * 0.90;
        }
        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", typeOfVacantion, price);
    }
}
