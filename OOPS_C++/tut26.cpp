#include <bits/stdc++.h>
using namespace std;

class Complex
{
    int a, b;

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
    friend Complex sumComplex(Complex o1, Complex o2);
};

Complex sumComplex(Complex o1, Complex o2)
{
    Complex o3;
    o3.setNumber(o1.a + o2.a, o1.b + o2.b);
    return o3;
}

int main()
{
    Complex c1, c2;
    c1.setNumber(1, 4);
    c2.setNumber(5, 8);
    c1.printNumber();
    c2.printNumber();
    Complex c3 = sumComplex(c1,c2);
    c3.printNumber();
}

// properties of friend function-
/*
1. Not in scope of class.
2. since it is not in scope of class, it cnnot be called form the object of that class. c1.sumComplex()== invalid.
3. can be invoked without help of an object.
4. usually contains objects as arguments.
5. can be private or public, doesnt matter.
6. cannot access the memebrs directly by names, need object_name.member_name to access any member.

*/