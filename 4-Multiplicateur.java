/*
https://onlinegdb.com/ksXQk6keB
Ouvre cette URL dans Safari et clique sur..
..le bouton 'Run' pour executer le code Java..
..puis tape dans la console deux nombres.
*/

/* 
Ce programme demande à l'utilisateur deux nombres..
..puis affiche leur produit (produit: résultat de a x b)
*/

public class Main
{
    public static void main(String[] args)
    // DEBUT
    {
        // Je créé un 'scanner' pour pouvoir LIRE les inputs de..
        // ..l'utilisateur (on en aura souvent besoin)
        // Utilisation:      String input = LIRE.nextLine();
        java.util.Scanner LIRE = new java.util.Scanner(System.in);
        
        // ÉCRIRE "Tapez un premier nombre à multiplier :"
        System.out.println("Tapez un premier nombre à multiplier :");

        // LIRE premierNombre
        double premierNombre = LIRE.nextDouble(); // 'nextDouble' récupère un nombre

        // ÉCRIRE "Tapez un deuxième nombre à multiplier :"
        System.out.println("Tapez un deuxième nombre à multiplier :");

        // LIRE deuxiemeNombre
        double deuxiemeNombre = LIRE.nextDouble();

        // produit <- premierNombre * deuxiemeNombre
        double produit = premierNombre * deuxiemeNombre;

        // ÉCRIRE "Le résultat de la multiplication est..."
        System.out.println("Le résultat de la multiplication est...");

        // ÉCRIRE produit
        System.out.println(produit); // <-- pas de guillemets ici car on passe le..
                                     // ..contenu d'une variable pas directement du texte
    }
    // FIN
}
