#include <bits/stdc++.h>
using namespace std;

struct p_cmp {
    bool operator()(int a, int b)
    {
        return a > b;
    }
};

int main()
{
    // priority queue
    priority_queue<int, vector<int>, p_cmp> p;
    p.push(4);
    p.push(9);
    p.push(2);
    p.push(1);
    p.push(6);

    while (p.empty() == false) {
        cout << p.top() << " ";
        p.pop();
    }
}
