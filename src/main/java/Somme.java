import java.util.Scanner;

public class Somme {
    public static void Calcul() {
        //Initialisation des variables
            int somme = 0;
            int nombre;
        //Initialisation de Scanner
        Scanner sc = new Scanner(System.in);
        //Récupération des nombres saisis au clavier
        for (int i = 1; i <= 5; i++)
        {
            //Boucle for
            System.out.println("Veuillez saisir un nombre");
            nombre = sc.nextInt();
            somme = calculSomme(somme,nombre);
        }
        System.out.println("La somme est :"+somme);
    }
//Fonction calcul de la somme des entiers
    private static int calculSomme(int somme, int nombre)
    {
        return somme + nombre;
    }
}