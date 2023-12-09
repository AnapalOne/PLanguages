#include <stdio.h>

int main () 
{
   int* x;
   int y;

   y = 5;
   x = &y;

   printf("This is a normal variable (y): %d\n", y);
   printf("This is a pointer variable (x) to the normal variable (y), displaying the normal variable's address: %d\n", x);
   printf("This is a pointer variable (x) to the normal variable (y), displaying the normal variable's value: %d\n", *x);

}