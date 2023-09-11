#include <stdio.h>

int calculator(int a, int b);

int main ()
{
    int x, y;
    char hello[] = "hello there";

    x = 5;
    y = 10;
    printf("%s\n", hello);
    printf("%d\n", calculator(x, y));
    return 0;
}

int calculator(int a, int b)
{
    return a + b;
}