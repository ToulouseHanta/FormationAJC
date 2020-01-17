import java.util.Scanner;

public class Cahier1_Exo12 {
    public static void main(String[] args) {
        //Initialisation de Scanner
        Scanner sc = new Scanner(System.in);
        int nombreSaisi;

        //L'utilisateur saisit un nombre entier qui peut être négatif
        System.out.println("Saisir un nombre entier");
        nombreSaisi = sc.nextInt();
        if (nombreSaisi > 100)
        {
            System.out.println("Blurp");
            if (nombreSaisi > 200)
            {
                System.out.println("Glop");
            } else
                {
                System.out.println("Pas glop");
                }
        }
        else
            {
            if (nombreSaisi > 50)
            {
                System.out.println("Glurps");
            } else
                {
                System.out.println("Chomp");
                }
             }
    }
    }