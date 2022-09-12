#include <iostream>
using namespace std;

float num, sum;

void neg_or_pos() {
    if(num > 0) {
        sum += num;
    }
}

int main() {
    cout << "Positivity!\nThis program will accept five positive numbers and display the sum. No negative numbers allowed.\n" << "---------------------------------------\n";

    for(int i = 0;i < 5; ++i) {
        cout << "Enter a number: ";
        cin >> num;
        neg_or_pos();
    }

    cout << "\nThe total sum of all numbers equate to: " << sum;
    return 0;
}