#include <iostream>

int incrementer(int);
void afficher(int);

int main()
{
    int compteur = 0;
    afficher(compteur);
    compteur = incrementer(compteur);
    afficher(compteur);
}

///////////////////////////////////////

int incrementer(int n)
{
    return ++n;
}

void afficher(int n)
{
    std::cout << n << std::endl;
}

///////////////////////////////////////

