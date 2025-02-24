import java.util.Scanner;

public class ExScanner3 {
    public static float exScanner3(){
        //instanciation d'un objet scanner
            Scanner scanner = new Scanner(System.in);
            //affichage dans la console d'un message
            System.out.print("Veuillez entrer un nombre : ");
            //assignation de la valeur saisie dans une variable nombre
            float nombre1 = scanner.nextInt();
            float nombre2 = scanner.nextInt();
            float nombre3 = scanner.nextInt();
            float result = (nombre1+nombre2+nombre3)/3;
            scanner.nextLine();// Pour consommer le retour à la ligne
            //renvoi en sortie le nombre saisi précédemment
            return result;
        }
    }
