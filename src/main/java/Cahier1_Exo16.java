import java.util.Scanner;
//cet import va permettre de formater le nombre de chiffres après la virgule
import java.text.DecimalFormat;

public class Cahier1_Exo16 {
    public static void main(String[] args) {
        //Initialisation de Scanner
        Scanner sc = new Scanner(System.in);
        int nombre;
        double pu1 = 0.50;
        double pu2 = 0.40;
        double pu3 = 0.30;
        //on a choisi de mettre 2 chiffres après la virgule
DecimalFormat df = new DecimalFormat("0.00");
        //Saisir le nombre de photocopies à faire
        System.out.println("Veuillez saisir le nombre de photocopies souhaitées");
        nombre = sc.nextInt();

        /* Le programme va déterminer le prix à payer en fonction du nombre de photocopies
          si moins de 10 photocopies, prix unitaire = 0.5€
          entre 10 et 20 photocopies, prix unitaire = 0.4€
          si plus de 20 photocopies, prix unitaire = 0.3€ correspond à pu3
         */
        if (nombre > 20) {
            System.out.println("Vous avez fait " + " " + nombre + " photocopies");
            System.out.println("Vous devez payer :" + " " + df.format(nombre * pu3) + " euros");
        } else {
            if (nombre < 10) {
                System.out.println("Vous avez fait " + " " + nombre + " photocopies");
                System.out.println("Vous devez payer :" + " " + df.format(nombre * pu1) + " euros");
            } else {
                System.out.println("Vous avez fait " + " " + nombre + " photocopies");
                System.out.println("Vous devez payer :" + " " + df.format(nombre * pu2) + " euros");
            }
        }
    }
}
