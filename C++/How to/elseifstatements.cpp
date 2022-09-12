#include <iostream>
using namespace std;

int main() {
    
    string selection;
    int firstnumber, secondnumber, sum;

    cout << "Addition, Multiplication, Subtraction" << endl << "Please choose what operation you would like to use: ";
    cin >> selection;

    if(selection == "Addition") {

        cout << "Please type two numbers:";
        cin >> firstnumber >> secondnumber;

        sum = firstnumber + secondnumber;

        cout << firstnumber << " + " << secondnumber << " = " << sum << endl;
        system("pause");
        return 0;
    }

    else if(selection == "Subtraction") {

        cout << "Please type two numbers:";
        cin >> firstnumber >> secondnumber;

        sum = firstnumber - secondnumber;

        cout << firstnumber << " - " << secondnumber << " = " << sum << endl;
        system("pause");
        return 0;
    }

    else if(selection == "Multiplication") {

        cout << "Please type two numbers:";
        cin >> firstnumber >> secondnumber;

        sum = firstnumber * secondnumber;

        cout << firstnumber << " * " << secondnumber << " = " << sum << endl;
        system("pause");
        return 0;
    } 

    else {

        cout << "That is not a valid operation." << endl;
        system("pause");
        return 0;
    }
}