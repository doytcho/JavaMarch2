import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String city = scan.nextLine();
        double salary = Double.parseDouble(scan.nextLine());
        double discount = 0;

        switch (city) {
            case "Sofia":
                if (salary >= 0 && salary <= 500) {
                    discount = 0.05;
                } else if (salary > 500 && salary <= 1000) {
                    discount = 0.07;
                } else if (salary > 1000 & salary <= 10000) {
                    discount = 0.08;
                } else if (salary > 10000) {
                    discount = 0.12;
                }
                break;
            case "Varna":
                if (salary >= 0 && salary <= 500) {
                    discount = 0.045;
                } else if (salary > 500 && salary <= 1000) {
                    discount = 0.075;
                } else if (salary > 1000 & salary <= 10000) {
                    discount = 0.10;
                } else if (salary > 10000) {
                    discount = 0.13;
                }
                break;
            case "Plovdiv":
                if (salary >= 0 && salary <= 500) {
                    discount = 0.055;
                } else if (salary > 500 && salary <= 1000) {
                    discount = 0.08;
                } else if (salary > 1000 & salary <= 10000) {
                    discount = 0.12;
                } else if (salary > 10000) {
                    discount = 0.145;
                }
                break;
        }
        if (discount == 0 || salary <= 0) {
            System.out.println("error");
        } else {
            System.out.printf("%.2f", discount * salary);
        }
    }
}
