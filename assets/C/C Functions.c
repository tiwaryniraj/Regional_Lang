#include <stdio.h>

int sumValue(int a, int b)
{
    int sum = a + b;
    return sum;
}

void printName(char name[])
{
    printf("Name : %s", name);
}

int main()
{

    int sum = sumValue(12, 7);
    printf("Sum :  %d", sum);
    printf("\n");

    char name[50] = "Abc Bcd";
    printName(name);
}
