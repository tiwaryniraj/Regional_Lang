#include <stdio.h>

void recursionFunction(int n){
if(n==0) {return;}

    printf("%d \n",n);
        recursionFunction(n-1);
}

int main () {
 recursionFunction(5);
}
