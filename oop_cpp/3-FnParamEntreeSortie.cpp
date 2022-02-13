#include <iostream>

void incrementer(int&);
void afficher(int);

int main()
{
    int compteur = 0;
    afficher(compteur);
    // La valeur de compteur est modifiée
    incrementer(compteur);
    afficher(compteur);
}

///////////////////////////////////////

/* n est un paramètre en entrée/sortie,
   on peut modifier sa valeur */
void incrementer(int& n)
{
    ++n;
}

void afficher(int n)
{
    std::cout << n << std::endl;
}

///////////////////////////////////////

