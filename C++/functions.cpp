#include <iostream> 
#include <string>
#include <typeinfo>

void helloWorld ()
{
    std::cout << "Hello world!" << std::endl;
}

void inputOutputNum () {
    int a;
    std::cout << "Input number: ";
    std::cin >> a;
    std::cout << "Number inputted is: " << a << std::endl;
}

int addition (int x, int y)
{
    return x + y;
}

void displayType (int a) {
    std::cout << typeid(a).name() << std::endl;
}

int main ()
{
    helloWorld();
    inputOutputNum();
    std::cout << addition(2, 8) << std::endl;
    displayType(5);
    return EXIT_SUCCESS;
}
