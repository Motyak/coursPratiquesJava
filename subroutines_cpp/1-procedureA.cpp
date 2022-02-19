#include <iostream>

void askUserForHisAgeAndPrintIt()
{
    int age;
    std::cout << "Quel age avez vous ?\n> ";
    std::cin >> age;
    std::cout << "Vous avez " << age << " ans." << std::endl;
}

int main()
{
    askUserForHisAgeAndPrintIt();

    askUserForHisAgeAndPrintIt();
}
