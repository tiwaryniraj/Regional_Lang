#include <stdio.h>

int main()
{
    char char_array[] = { 'W', 'e', 'l', 'c', 'o', 'm', 'e' };
    int i;
    for (i = 0; i < 7; i++) {
        printf("%c", char_array[i]);
    }
    printf("\n");

    char name[50] = "Abc Bcd";
    printf("%s", name);
    printf("\n");
}
