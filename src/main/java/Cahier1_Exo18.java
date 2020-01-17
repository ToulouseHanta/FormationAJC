import java.util.Scanner;
import java.text.DecimalFormat;
public class Cahier1_Exo18 {
    public static void PrixBaguette()
    {
        //Initialisation de Scanner
        Scanner sc = new Scanner(System.in);
        double pu=0.80, pt=0;
        //Code pour formater le nombre de décimales après la virgule.
        DecimalFormat df = new DecimalFormat("0.00");
        //ce code doit être repris lors de l'affichage
        df.format(pt);
        //Cet algorithme doit donner le prix des baguettes d'une baguette à 10 baguettes
        //comme on connait le nombre d'itérations a réaliser (de 1 à 10), on utilise la fonction for
        for (int nombre = 1; nombre <= 10; nombre ++)
        {
            //le code exécute le calcul en fonction du nombre de baguette * par prix unitaire
            pt=nombre*pu;
            System.out.println(+nombre + " " + "baguette(s) coute(nt) " + df.format(pt) + " " + "euros");
        }
    }
}
