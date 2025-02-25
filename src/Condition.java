import java.util.Scanner;

public class Condition {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //posOrNot(sc);
        //posOrNegOrZero(sc);
        //niveau(sc);
        niveauSwitch(sc);
    }

    public static void posOrNot(Scanner scanner) {
        System.out.println("Veuillez saisir un nombre : ");
        int nbr1 = scanner.nextInt();
        System.out.println("Veuillez saisir un nombre : ");
        int nbr2 = scanner.nextInt();

        if((nbr1 >= 0 && nbr2 >= 0) ||  (nbr1 <= 0 && nbr2 <= 0)) {
            System.out.println("Le produit des 2 nombres est positif");
        }
        else {
            System.out.println("Le produit des 2 nombres est négatif");
        }
    }

    public static void posOrNegOrZero(Scanner scanner) {
        System.out.println("Veuillez saisir un nombre : ");
        int nbr1 = scanner.nextInt();
        System.out.println("Veuillez saisir un nombre : ");
        int nbr2 = scanner.nextInt();
        //test si c'est positif
        if((nbr1 > 0 && nbr2 > 0) ||  (nbr1 < 0 && nbr2 < 0)) {
            System.out.println("Le produit des 2 nombres est positif");
        }
        //test si c'est zéro
        else if(nbr1 == 0 || nbr2 == 0) {
            System.out.println("Le produit des 2 nombres est zéro");
        }
        //test sinon c'est négatif
        else {
            System.out.println("Le produit des 2 nombres est négatif");
        }
    }

    public static void niveau(Scanner scanner) {
        System.out.println("Veuillez saisir un age : ");
        int age = scanner.nextInt();

        if(age >= 12) {
            System.out.println("Le niveau est cadet");
        }
        else if(age >= 10) {
            System.out.println("Le niveau est Minimes");
        }
        else if(age >= 8) {
            System.out.println("Le niveau est Pupille");
        } else if (age >= 6) {
            System.out.println("Le niveau est Poussin");
        }
        else{
            System.out.println("trop jeune");
        }
    }

    public static void niveauSwitch(Scanner scanner) {
        System.out.println("Veuillez saisir un age : ");
        int age = scanner.nextInt();
        switch (age) {
            case 1: case 2: case 3: case 4 : case 5:
                System.out.println("trop jeune");
                break;
            case 6: case 7 :
                System.out.println("Le niveau est Poussin");
                break;
            case 8: case 9:
                System.out.println("Le niveau est Pupille");
                break;
            case 10: case 11:
                System.out.println("Le niveau est Minimes");
                break;
            default:
                System.out.println("Le niveau est cadet");
                break;
        }
    }
}