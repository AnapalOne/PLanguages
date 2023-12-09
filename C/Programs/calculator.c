/*
    This program is a calculator with addition, subtraction, multiplication,
    division functions.

    This program is just practice for C.
*/

#include <stdio.h>

void addition (int a, int b);
void subtraction (int a, int b);
void multiplication (int a, int b);
void division (int a, int b);

int main ()
{
    printf("What type of operation?\n");
    printf("\t[a] Addition");
    printf("\t[s] Subtraction");
    printf("\t[m] Multiplication");
    printf("\t[d] Division\n");

    char operation[0];
    scanf("%c", operation);

    int num1, num2;
    printf("\nEnter first number: ");
    scanf("%d", &num1);
    printf("Enter second number: ");
    scanf("%d", &num2);

    if (operation[0] == 'a') {
        addition(num1, num2);
    } else if (operation[0] == 's') {
        subtraction(num1, num2);
    } else if (operation[0] == 'm') {
        multiplication(num1, num2);
    } else if (operation[0] == 'd') {
        division(num1, num2);
    } else {
        printf("Incorrect character! Please try again.\n");
        return 1;
    }
    
}

void addition (int a, int b)
{
    int ansSum = a + b;
    printf("Your sum is: %d\n", ansSum);
}

void subtraction (int a, int b)
{
    int ansDiff = a - b;
    printf("Your difference is: %d\n", ansDiff);
}

void multiplication (int a, int b)
{
    int ansProd = a * b;
    printf("Your product is: &d\n", ansProd);
}

void division (int a, int b)
{
    float ansQuo = (float) a / (float) b;
    printf("Your quotient is: %.10f\n", ansQuo);
}