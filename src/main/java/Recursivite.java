/*import java.util.Scanner;
import java.lang.Math;

public class Recursivite {
    public static void Calcul() {
        //Initialisation des variables
        int nombre, somme = 0;
        //Initialisation de Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez saisir un nombre entier");
        nombre = sc.nextInt();

        if (nombre == 0) {
            System.out.println("0");
        } else {
            int sommeF = somme(nombre);
            System.out.println(sommeF);
        }
    }

    public static int somme(int nombre) {
        //Calcul de la somme des n premiers carrés
        //Math.sqrt(nombre)
        int somme=0;
        while (nombre >0) {
            somme=somme(nombre);
            nombre=nombre-1;
            System.out.println(somme+ " / "+nombre);
        }


        return nombre;
    }
}

 */
import java.util.Scanner;
public class Recursivite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("saisir une valeur");
        int v = sc.nextInt();
        int S = 0;
        for (int i=1; i<=v;i++){
            S=S+(i*i);

        }System.out.println("la somme des premiers carrées est: "+ S);
    }
}
