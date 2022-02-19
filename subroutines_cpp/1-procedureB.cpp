#include <iostream>

void askUserForHisAge(int& age)
{
    std::cout << "Quel age avez vous ?\n> ";
    std::cin >> age;
}

void print(int age)
{
    std::cout << "Vous avez " << age << " ans." << std::endl;
}

int main()
{
    int age;

    askUserForHisAge(age);
    print(age);

    askUserForHisAge(age);
    print(age);
}
