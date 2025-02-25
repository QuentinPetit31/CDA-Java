import java.util.Scanner;

public class ExScanner5 {

    public static void exScanner5(Scanner scanner) {
        System.out.println("veuillez saisir l'heure");
        int heure = scanner.nextInt();
        System.out.println("Veuillez saisir les minutes");
        int minute = scanner.nextInt();
        System.out.println("Veuillez saisir les secondes");
        int seconde = scanner.nextInt();
        //Test si les seconde sont plus grande ou égale à 59
        if (seconde >= 59) {
            seconde = 0;
            minute++;
            //Test si les minutes sont plus grand que 59
            if (minute > 59) {
                minute = 0;
                heure++;
                //test si les heures sont plus grandes que 23
                if (heure > 23) {
                    heure = 0;
                }
            }
        }
        //Sinon
        else {
            seconde++;
            //test si les secondes sont plus grandes que 59
            if (seconde > 59) {
                minute++;
            }
        }
        System.out.println("dans une seconde il sera : " + heure + ":" + minute + ":" + seconde);
    }

    public void main() {
    }
}