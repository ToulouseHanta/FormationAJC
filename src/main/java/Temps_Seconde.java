import java.util.Scanner;

public class Temps_Seconde {
    public static void main(String[] args) {
        //Initialisation des variables
        //int h, m, s;

        //Initialisation de Scanner
        Scanner sc = new Scanner(System.in);
        //saisir l'heure + minutes + secondes

        System.out.println("Veuillez saisir l'heure");
        int h=sc.nextInt();
       System.out.println("Veuillez saisir les minutes");
        int m=sc.nextInt();
       System.out.println("Veuillez saisir l'heure");
        int s=sc.nextInt();
        System.out.println(h + ":" + m + ":" + s);
        System.out.println("équivaut à " + " " + (h*3600+m*60+s) + " secondes");

    }
}

