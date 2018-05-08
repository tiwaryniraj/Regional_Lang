#include <stdio.h>

int main()
{

    // integer variable declaration
    int num = 12;

    // pointer variable declaration. It stores address of variable num.
    int* p = &num;

    // value of num
    printf("Value : %d", *p);
    printf("\n");

    // memory address of num
    printf("Memory Address : %d", p);
}
