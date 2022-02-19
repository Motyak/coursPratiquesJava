#include <iostream>

class AgeAsker
{
    int age;

  public:
    AgeAsker()
    {
        std::cout << "Quel age avez vous ?\n> ";
        std::cin>>this->age;
    }

    void printAge()
    {
        std::cout << this->age << std::endl;
    }
};

int main()
{
    {
        AgeAsker asker;
        asker.printAge();
    }

    {
        AgeAsker asker;
        asker.printAge();
    }
}
