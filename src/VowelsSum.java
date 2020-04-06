import java.util.Scanner;

public class VowelsSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        int vowelSum = 0;
        for (int i = 0; i < text.length(); i++) {
            switch (text.charAt(i)) {
                case 'a':
                    vowelSum = vowelSum + 1;
                    break;
                case 'e':
                    vowelSum = vowelSum + 2;
                    break;
                case 'i':
                    vowelSum = vowelSum + 3;
                    break;
                case 'o':
                    vowelSum = vowelSum + 4;
                    break;
                case 'u':
                    vowelSum = vowelSum + 5;
                    break;
            }
        }
        System.out.println(vowelSum);
    }
}
