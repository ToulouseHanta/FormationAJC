import java.util.Scanner;

public class Cahier1_Exo11 {
    public static void main(String[] args) {
        //Initialisation de Scanner
        Scanner sc = new Scanner(System.in);
        int nombreSaisi;

        //L'utilisateur saisit un nombre entier qui peut être négatif
        System.out.println("Saisir un nombre entier");
        nombreSaisi = sc.nextInt();
        if ((nombreSaisi%3)==0)
        {
            System.out.println("Ce nombre est divisible par 3");
        }
        else
        {
            System.out.println("Ce nombre n'est pas divisible par 3");
        }
    }
}