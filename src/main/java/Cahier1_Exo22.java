public class Cahier1_Exo22 {
    public static void main(String[] args) {
        //Initialisation de Scanner
        //Scanner sc = new Scanner(System.in);
        int nbHabitants = 87697, annee;
        int seuil = 100000;
        int anneeDepart = 2013;
        double taux = 0.0089;
        annee = anneeDepart;
        while (nbHabitants < seuil)
        {
            annee++;
            nbHabitants *= (int)(1 + taux);
        }
        System.out.println("C'est en " + annee + " qu'on atteindra " + nbHabitants + " habitants");
    }
}
