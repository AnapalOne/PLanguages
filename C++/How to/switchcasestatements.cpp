#include <iostream>
using namespace std;

int main() {
    char sussy; //operations
    int fuck, you, amogus = 1; //1st and 2nd number, sum, factorial

    cout << "Addition, Subtraction, Muliplication, Division, Factorial" << endl << "Please enter an operation (+ - * / !):";
    cin >> sussy;

    switch(sussy) {
        case '+':
            cout << "Please enter two numbers:";
            cin >> fuck >> you;

            cout << fuck << " + " << you << " = " << fuck+you << endl;
            break;
        case '-':

            cout << "Please enter two numbers:";
            cin >> fuck >> you;

            cout << fuck << " - " << you << " = " << fuck-you << endl;
            break;
        case '*': 

            cout << "Please enter two numbers:";
            cin >> fuck >> you;

            cout << fuck << " * " << you << " = " << fuck*you << endl;
            break;
        case '/':

            cout << "Please enter two numbers:";
            cin >> fuck >> you;
            if(fuck == 0 || you == 0) {
                cout << "Cannot divide by zero." << endl;
                break;
            }

            cout << fuck << " / " << you << " = " << fuck/you << "\n" << "Remainder: " << fuck%you << endl;
            break;
        case '!':

            cout << "Please enter a number:";
            cin >> fuck;

            if(fuck < 0) {
                cout << "Factorial of a negative number doesn't exist. Please try again." << endl;
            }
            else {
                for(int i = 1;i <= fuck; ++i) {
                    amogus *= i;
                }             
                cout << "Factorial of " << fuck << " = " << amogus << endl;

            }
            break;
        default:
            cout << "That is not a valid operation listed above." << endl;
            break;
    }
    system("pause");
    return 0;
}