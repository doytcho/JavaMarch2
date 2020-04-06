import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hourExam = Integer.parseInt(scan.nextLine());
        int minutesExam = Integer.parseInt(scan.nextLine());
        int hourArive = Integer.parseInt(scan.nextLine());
        int minutesArive = Integer.parseInt(scan.nextLine());

        int examInMinutes = hourExam * 60 + minutesExam;
        int ariveInMinutes = hourArive * 60 + minutesArive;

        if (ariveInMinutes > examInMinutes) {
            System.out.println("Late");
            if (ariveInMinutes - examInMinutes < 60) {
                System.out.printf("%d minutes after the start", ariveInMinutes - examInMinutes);
            } else {
                System.out.printf("%d:%02d hours after the start", (ariveInMinutes - examInMinutes) / 60, (ariveInMinutes - examInMinutes) % 60);
            }
        } else if (examInMinutes - ariveInMinutes <= 30) {
            System.out.println("On time");
            System.out.printf("%d minutes before the start", examInMinutes - ariveInMinutes);
        } else if (examInMinutes - ariveInMinutes < 60) {
            System.out.println("Early");
            System.out.printf("%d minutes before the start", examInMinutes - ariveInMinutes);
        } else {
            System.out.println("Early");
            System.out.printf("%d:%02d hours before the start", (examInMinutes - ariveInMinutes) / 60, (examInMinutes - ariveInMinutes) % 60);
        }

    }
}
