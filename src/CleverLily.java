import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int years = Integer.parseInt(scan.nextLine());
        double washingPrice = Double.parseDouble(scan.nextLine());
        int toyPrice = Integer.parseInt(scan.nextLine());
        int toys = 0;
        double money = 10.00;
        double totalSum = 0.00;
        for (int i = 1; i <= years; i++) {
            if (i % 2 == 0) {
                totalSum = totalSum + money-1;
                money = money + 10;
            } else {
                toys++;
            }
        }
        totalSum = totalSum + toys * toyPrice;
        if (totalSum >= washingPrice) {
            System.out.printf("Yes! %.2f", totalSum - washingPrice);
        } else {
            System.out.printf("No! %.2f", washingPrice - totalSum);
        }
    }
}
