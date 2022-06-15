#include <iostream>
#include <string>
#include <sstream>
#include <unistd.h>
#include <cstdio>

using namespace std;
int main() {
    int h, w, bmi;
    string number;

    cout << "-------------------------------\n" << "This program will compute the Body Mass Index (BMI) based\non the height (cm) and weight (kg) provided by the user.\n" << "-------------------------------\n";
    
    cout << "Please Input Height (cm): ";
    getline(cin,number);
    stringstream(number) >> h;

    cout << "Please Input Weight (kg): ";
    getline(cin,number);
    stringstream(number) >> w;
    
    bmi = (w / 100) / (h * h);
    
    if(bmi > 29) {
        printf("Results: Obese");
    }
    else if(bmi > 24) {
        printf("Results: Overweight");
    }
    else if(bmi > 17.5) {
        printf("Results: Normal");
    }
    else {
        printf("Results: Underweight");
    }
    system("pause");
    return 0;
}
