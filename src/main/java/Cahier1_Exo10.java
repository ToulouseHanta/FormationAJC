import java.util.Scanner;
public class Cahier1_Exo10 {
        public static void main(String[] args) {
            //Initialisation de Scanner
            Scanner sc = new Scanner(System.in);
            double longueur, largeur, hauteur, volume;
            long nbRadiateurs;

            //Nous allons calculer le nombre de radiateurs nécessaires en fonction des informations de la pièce
            System.out.println("Nous allons calculer le nombre de radiateurs nécessaires en fonction des informations de la pièce");

            //Récupération de la valeur de la longueur au clavier
            System.out.println("Veuillez saisir la longueur");
            longueur = sc.nextDouble();
            //Récupération de la valeur de la largeur au clavier
            System.out.println("Veuillez saisir la largeur");
            largeur = sc.nextDouble();
            //Récupération de la valeur de la hauteur au clavier
            System.out.println("Veuillez saisir la hauteur");
            hauteur = sc.nextDouble();
            //Calcul du volume
            volume = longueur * largeur * hauteur;
            nbRadiateurs = (long) (volume/8);
            if (nbRadiateurs - nbRadiateurs>0)
            {
                System.out.println("Le nombre de radiateurs nécessaire est  :" + " " + (nbRadiateurs+1));
            }
            else
            System.out.println("Le nombre de radiateurs nécessaire est  :" + " " + (nbRadiateurs));
        }
    }





