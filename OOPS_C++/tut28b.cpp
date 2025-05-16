#include <bits/stdc++.h>
using namespace std;

class c2;

class c1
{
    int val;

public:
    void indata(int a)
    {
        val = a;
    }
    void display(void)
    {
        cout << val << endl;
    }
    friend void exchange(c1 &x, c2&y);
};

class c2
{
    int val2;

public:
    void indata(int a)
    {
        val2 = a;
    }
    void display(void)
    {
        cout << val2 << endl;
    }
    friend void exchange(c1 &x, c2&y);
};

void exchange(c1 &x, c2&y)
{
    int temp = x.val;
    x.val = y.val2;
    y.val2 = temp;
}

int main()
{
    c1 a;
    a.indata(5);
    c2 b;
    b.indata(10);
    exchange(a,b);
    a.display();
    b.display();
}