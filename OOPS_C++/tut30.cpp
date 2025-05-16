#include <bits/stdc++.h>
using namespace std;

class Complex{
    int a,b;
    public:
    Complex(void);
    Complex(int x, int y);
    void printData(void)
    {
        cout<<a<<" i"<<b<<endl;
    }
}; 

Complex :: Complex(void){ // non parametrised constructor OR default constructor..
    a = 0;
    b = 0;
}

Complex :: Complex(int x,int y) //parametrised constructor.
{
    a = x;
    b = y;
}

int main()
{
    // implicit call
    Complex a(1,10);

    //explicit call.
    Complex b = Complex(5,7);
    a.printData();
    b.printData();
}