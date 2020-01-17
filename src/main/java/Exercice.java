import java.util.Scanner;
public class Exercice {
    public static void AfficheNomComplet()
    {
            //Initialisation de Scanner
            Scanner sc = new Scanner(System.in);
            //Récupération du nom grâce à la fonction recupNom
            String nom = recupNom();
            //Récupération du nom grâce à la fonction recupPrenom
            String prenom = recupPrenom();
            //On concatène la chaîne et la valeur à afficher avec le +
            //Affichage du mot récupéré
            System.out.println("Le nom complet est : " + nom + " " + prenom);
    }
    //fonction
    public static String recupNom()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir votre nom");
        String nom = sc.nextLine();
        return nom;
    }
    public static String recupPrenom()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir votre prénom");
        String prenom = sc.nextLine();
        return prenom;
    }
}