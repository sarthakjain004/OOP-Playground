#include <bits/stdc++.h>
using namespace std;
class Complex; // forward declaration.
class Calculator
{
public:
    int add(int a, int b)
    {
        return a + b;
    }

    int sumRealComplex(Complex o1, Complex o2);
    int sumCompComplex(Complex o1, Complex o2);
};
class Complex
{
    int a, b;
    // individually declaring functions as frineds.
    // friend int Calculator ::sumRealComplex(Complex o1, Complex o2);
    // friend int Calculator ::sumCompComplex(Complex o1, Complex o2);

    // declaring entire calculator class as friend.
    friend class Calculator;
public:
    void setNumber(int n1, int n2)
    {
        a = n1;
        b = n2;
    }
    void printNumber(void)
    {
        cout << "Your number is " << a << " +i" << b << endl;
    }
};

int Calculator ::sumRealComplex(Complex o1, Complex o2)
{
    return o1.a + o2.a;
}
int Calculator ::sumCompComplex(Complex o1, Complex o2)
{
    return o1.b + o2.b;
}
int main()
{
    Complex o1, o2;
    o1.setNumber(1, 4);
    o2.setNumber(5, 7);
    Calculator c;
    int res = c.sumRealComplex(o1, o2);
    cout << res << endl;
}