// wrong
#include <iostream>
using namespace std;

int main () {
	float latexNum, latexPrice, mylarNum, mylarPrice, salesTax, salesTaxRate ,totalCost, subTotal;

	cout << "Enter the number of latex balloons ordered and its price, the number of mylar balloons ordered and its price, and the sales tax." << endl;
	cout << "Separate your inputs with spaces." << endl;

	cin >> latexNum;
	cin >> latexPrice;
	cin >> mylarNum;
	cin >> mylarPrice;
	cin >> salesTaxRate;

	subTotal = (latexNum * latexPrice) + (mylarNum * mylarPrice);
	salesTax = subTotal * salesTaxRate;
	totalCost = subTotal + salesTax;
	cout << "The total cost of the order is: " << totalCost << endl;
}