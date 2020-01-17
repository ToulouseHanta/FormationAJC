import java.util.Scanner;

public class Cahier1_Exo13 {
    public static void main(String[] args) {
        //Initialisation de Scanner
        Scanner sc = new Scanner(System.in);
        int temp;

        //L'utilisateur saisit un nombre entier qui peut être négatif
        System.out.println("Entrer la température de l'eau");
        temp = sc.nextInt();
        //Si la température de l'eau est inférieur ou égale à 0, l'eau est à l'état solide
        if (temp <= 0) {
            System.out.println("Etat solide");
        }
        else {
            if (temp >= 100) {
                System.out.println("Etat gazeux");
            } else {
                System.out.println("Etat liquide");
            }
        }
        }
}