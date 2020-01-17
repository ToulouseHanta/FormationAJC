import java.util.Scanner;

public class Cahier1_Exo9 {
    public static void main(String[] args) {
        //Initialisation de Scanner
        Scanner sc = new Scanner(System.in);
        double longueur=4.3;
        double largeur=2.5;
        //Conversion de longueur en entier =>4
        //Conversion de largeur en entier => 2
        int aire = (int)longueur*(int)largeur;
        //Conversion de la multiplication en entier
        int aire2 = (int)(longueur*largeur);

        //Affichage de l'aire
        System.out.println("L'aire du rectangle est" + " " + aire + "/" + aire2);
      }
}