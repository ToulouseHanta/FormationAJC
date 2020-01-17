import java.util.Scanner;

public class Cahier1_Exo14 {
    public static void main(String[] args) {
        //Initialisation de Scanner
        Scanner sc = new Scanner(System.in);
        int xNombre, yNombre;

        //Saisir 2 nombres entiers
        System.out.println("Veuillez saisir un nombre entier");
        xNombre = sc.nextInt();
        System.out.println("Veuillez saisir un deuxième nombre entier");
        yNombre = sc.nextInt();

        //Calcul du produit des 2 nombres mais ce résultat n'est pas affiché
        if (xNombre*yNombre>=0)
        {
            System.out.println("Le produit de ces 2 nombres est positif");
        }
        else {
            System.out.println("Le produit de ces 2 nombres est négatif");
        }
    }
}
