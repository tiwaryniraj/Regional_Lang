#include <bits/stdc++.h>
using namespace std;

int main()
{

    // integer variable declaration
    int num = 12;

    // pointer variable declaration. It stores address of variable num.
    int* p = &num;

    // value of num
    cout << "Value : " << *p;
    cout << "\n";

    // memory address of num
    cout << "Memory Address : " << p;
}
