// Ne contiendra que des méthodes statiques
public class Fonctions {

    // on suppose que n est positif
    public static int factoriel(int n) {
        if(n == 0 || n == 1)
            return 1;
        // sinon: factoriel(n) = n * factoriel(n - 1)
        Pile<Integer> pile = new Pile<>();
        while(n > 1)
            pile.inserer(n--);
        int resultat = 1;
        while(!pile.estVide())
            // resultat: 1 * 2 * ... * n
            resultat = multiplier(resultat, pile.retirer());
        return resultat;
    }

    public static int multiplier(int a, int b) {
        int res = 0;
        for(int i = 1; i <= b; ++i)
            res = ajouter(a, res);
        return res;
    }

    public static int ajouter(int a, int b) {
        for(int i = 1; i <= b; ++i)
            ++a;
        return a;
    }

}
