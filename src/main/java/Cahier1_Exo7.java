import java.util.Scanner;

public class Cahier1_Exo7 {
    public static void main(String[] args) {
        //Initialisation de Scanner
        Scanner sc = new Scanner(System.in);
        //Récupération du nom au clavier
        System.out.println("Veuillez saisir votre Nom");
        String nom = sc.nextLine();
        //Récupération du prénom au clavier
        System.out.println("Veuillez saisir votre Prenom");
        String prenom = sc.nextLine();
        //Affichage du nom complet
        System.out.println("Votre nom complet est : " + nom + " " + prenom);
        System.out.println("Bienvenue dans la formation POEI!!");
    }
}
