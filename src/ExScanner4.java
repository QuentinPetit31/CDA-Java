import java.util.Scanner;
public class ExScanner4 {

    public static void exScanner4(Scanner scanner) {
        System.out.println("veuillez saisir l'heure");
        int heure = scanner.nextInt();
        System.out.println("Veuillez saisir les minutes");
        int minute = scanner.nextInt();
        if (minute >= 59) {
            minute = 0;
            heure++;
            if (heure > 23) {
                heure = 0;
            }
        } else {
            minute++;
            if (minute > 59) {
                heure++;
            }
        }
        System.out.println("dans une minutes il sera : " + heure + ":" + minute);
    }

    public void main() {
    }
}