import java.util.Scanner;

public class ExScanner2 {
    public static int exScanner2(){
        //instanciation d'un objet scanner
            Scanner scanner = new Scanner(System.in);
            //affichage dans la console d'un message
            System.out.print("Veuillez entrer un nombre : ");
            //assignation de la valeur saisie dans une variable nombre
            int nombre = scanner.nextInt();
            int result = nombre + nombre;
            scanner.nextLine();// Pour consommer le retour à la ligne
            //renvoi en sortie le nombre saisi précédemment
            return result;
        }
    }
