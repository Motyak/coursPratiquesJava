#include <iostream>

class Compteur
{
  private:
    int i = 0;

  public:
    void incrementer();
    void afficher();
};

int main()
{
    Compteur c;
    c.afficher();
    // L'état de de l'objet est modifié
    c.incrementer();
    c.afficher();
}

///////////////////////////////////////

void Compteur::incrementer()
{
    ++this->i;
}

void Compteur::afficher()
{
    std::cout << this->i << std::endl;
}

///////////////////////////////////////

