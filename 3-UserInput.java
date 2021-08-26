/*
https://onlinegdb.com/dwH2vEIXdo
Ouvre cette URL dans Safari et clique sur..
..le bouton 'Run' pour executer le code Java..
..puis tape dans la console ton prénom.
*/

/* 
Ce programme demande à l'utilisateur son prénom..
..puis l'affiche.
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
        
        // ÉCRIRE "Tapez votre prénom, puis pressez la touche ENTRÉE :"
        System.out.println("Tapez votre prénom, puis pressez la touche ENTRÉE :");

        // LIRE prenom
        String prenom = LIRE.nextLine(); // 'nextLine' récupère du texte (String)

        // ÉCRIRE "Vous vous appelez..."
        System.out.println("Vous vous appelez...");

        // ÉCRIRE prenom
        System.out.println(prenom); // <-- pas de guillemets ici car on passe le..
                                    // ..contenu d'une variable pas directement du texte
    }
    // FIN
}
