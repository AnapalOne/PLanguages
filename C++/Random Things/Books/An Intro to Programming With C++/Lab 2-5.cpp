#include <iostream>
using namespace std;

int main () {
	float restaurantBill, billBeforeSalesTax, salesTax, tip10, tip15, tip20;

	cout << "Enter the sales tax: ";
	cin >> salesTax;

	cout << "Enter the restaurant bill: ";
	cin >> restaurantBill;

	billBeforeSalesTax =  restaurantBill - salesTax;
	tip10 = billBeforeSalesTax * .10;
	tip15 = billBeforeSalesTax * .15;
	tip20 = billBeforeSalesTax * .20;

	cout << "The 10% tip is: " << tip10 << endl;
	cout << "The 15% tip is: " << tip15 << endl;
	cout << "The 20% tip is: " << tip20 << endl;
}