import java.util.Scanner;

public class ExScanner6 {
    public static double exScanner6() {
        //instanciation d'un objet scanner
        Scanner scanner = new Scanner(System.in);
        //affichage dans la console d'un message

        System.out.println("Veuillez entrer un nombre de feuilles à imprimer : ");
        int nbrPhotocopie = scanner.nextInt();
        double prixPhotocopie =0;
        if(nbrPhotocopie<11){
            prixPhotocopie = 0.10*nbrPhotocopie;
        }
        else if
            (nbrPhotocopie<31){
                prixPhotocopie += ((nbrPhotocopie-10) * 0.09);
            }
            else if
                (nbrPhotocopie>31){
                    prixPhotocopie += 2.8 + ((nbrPhotocopie-30) * 0.08);
            }
            return prixPhotocopie;
        }

    }
