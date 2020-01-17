/*import java.util.Scanner;
public class RapportPizza {
    public static void main(String[] args) {
        try {
            //Initialisation de Scanner
            Scanner sc = new Scanner(System.in);
            int poids1, poids2;
            double prix1, prix2, rapport1, rapport2;

        /*L'utilisateur saisit les informations relatives aux pizzas
        pour chaque pizza, il renseigne le poids en gramme et le prix en euros
        Il faut forcer l'utilisateur à renseigner des prix et poids non négatifs ET différents de 0
         */
          /*  System.out.println("Veuillez saisir le poids en grammes de la pizza n°1");
            poids1 = (int) sc.nextLine();
            while (poids1 <= 0) {
                System.out.println("Veuillez resaisir le poids en grammes de la pizza n°1");
                poids1 = (int) sc.nextLine();
            }
            System.out.println("Veuillez saisir le prix en euros de la pizza n°1");
            prix1 = (double) sc.nextLine();
            while (prix1 <= 0) {
                System.out.println("Veuillez resaisir le prix en euros de la pizza n°1");
                prix1 = (double) sc.nextLine();
            }
            System.out.println("Veuillez saisir le poids en grammes de la pizza n°2");
            poids2 = (int) sc.nextLine();
            while (poids2 <= 0) {
                System.out.println("Veuillez resaisir le poids en grammes de la pizza n°2");
                poids2 = (int) sc.nextLine();
            }
            System.out.println("Veuillez saisir le prix en euros de la pizza n°2");
            prix2 = (int) sc.nextLine();
            while (prix2 <= 0) {
                System.out.println("Veuillez resaisir le poids en grammes de la pizza n°2");
                prix2 = (int) sc.nextLine();
            }
            rapport1 = prix1 / poids1;
            rapport2 = prix2 / poids2;

            //Le calcul du prix / kilo va permettre d'afficher la pizza qui a le meilleur prix au kilo
            if (rapport1 == rapport2) {
                System.out.println("Les 2 pizzas ont le même rapport prix au kilo");
            } else {
                if ((rapport1) > (rapport2)) {
                    System.out.println("La pizza n°2 a un meilleur prix au kilo");
                } else {
                    System.out.println("La pizza n°1 a un meilleur prix au kilo");
                }
            }
        } catch (Exception e) {
            System.out.println("Une exception s'est produite : " +  e.getMessage());
        }
    }
}
*/