#include <iostream>

int askUserForHisAge()
{
    int age;
    std::cout << "Quel age avez vous ?\n> ";
    std::cin >> age;
    return age;
}

void print(int age)
{
    std::cout << "Vous avez " << age << " ans." << std::endl;
}

int main()
{
    print(askUserForHisAge());

    print(askUserForHisAge());
}
