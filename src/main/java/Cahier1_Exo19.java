import java.util.Scanner;

public class Cahier1_Exo19 {
    public static void main(String[] args) {
        //Initialisation de Scanner
        Scanner sc = new Scanner(System.in);
        int pim, poum=0;

        for (int pam = 1; pam <= 5; pam ++)
        {
            //le code exécute le calcul suivant
            poum=poum+pam;
            System.out.println(poum);
        }
    }
}
