#include <iostream>
using namespace std;

void gasMilage () {
	float gas, miles, gasM;

	cout << "Enter your distance in miles: ";
	cin >> miles;

	cout << "Enter your current gas in your tank in gallons: ";
	cin >> gas;

	gasM = miles / gas;
	cout << "Your gas milage is " << gasM << ".";
}

void salaryRaise () {
	float salary, raise, raisedSalary;

	cout << "Enter your current salary: ";
	cin >> salary;

	cout << "Enter the salary raise: ";
	cin >> raise;

	raisedSalary = salary * raise;
	cout << "Your new salary is " << raisedSalary << " and the raise is " << raise << "%.";
}

int main () {
	int num;
	char choice;
	while (true) {

		cout << "What example would you like to run?" << endl;
		cout << "[1] Gas Milage" << endl;
		cout << "[2] Salary Raise" << endl;
		cin >> num;
		
		switch(num) {
			case 1:
				cout << "     --- Gas Milage --- " << endl;
				system("sleep 3");
				gasMilage();
				break;
			case 2:
				cout << "     --- Salary Raise --- " << endl;
				system("sleep 3");
				salaryRaise();
				break;
		}

		cout << endl << "Would you like to pick another? [y/n] ";
		cin >> choice;

		if (choice == 'y') {
			continue;
		} else if (choice == 'n') {
			break;
		} else {
			break;
		}
	}
}
