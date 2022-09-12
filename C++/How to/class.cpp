#include <iostream>
using namespace std;

class myClass {
    public: 
        int num;
        string text;
};

class classHelloWorld { 
    public:
    void helloWorld() {
        cout << "hello world";
    }
};

class inputClass {
    public: 
    void printAge(int age) {
        cout << "You are " << age << " years old.";
    }
};

int main() {
    myClass callClass;
    classHelloWorld hwClass;
    inputClass ageClass;

    callClass.num = 42;
    callClass.text = "hello world";

    cout << "myClass:\n";
    cout << callClass.num << endl;
    cout << callClass.text << endl;
    cout << "\n";

    cout << "classHelloWorld:\n";
    hwClass.helloWorld();
    cout << "\n\n";

    cout << "inputClass:\n";
    cout << "Enter your age: ";
    int a;
    cin >> a;
    ageClass.printAge(a);
    cout << "\n\n";
}