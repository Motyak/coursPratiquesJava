public class Pile<T> {

    private T[] contenu;
    private int taille;

    public Pile() {
        this.taille = 0;
    }

    public void inserer(T element) {
        T[] nouveauContenu = (T[])new Object[this.taille + 1];
        nouveauContenu[0] = element;
        for(int i = 0; i < this.taille; ++i)
            nouveauContenu[i + 1] = this.contenu[i];
        this.contenu = nouveauContenu;
        ++this.taille;
    }

    public T retirer() {
        if(this.taille == 0)
            return null;
        T[] nouveauContenu = (T[])new Object[this.taille - 1];
        for(int i = 1; i < this.taille; ++i)
            nouveauContenu[i - 1] = this.contenu[i];
        T elementSupprime = this.contenu[0];
        this.contenu = nouveauContenu;
        --this.taille;
        return elementSupprime;
    }

    public boolean estVide() {
        return this.taille == 0;
    }

}
