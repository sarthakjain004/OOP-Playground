#include <bits/stdc++.h>
using namespace std;

class Number
{
    int a;

public:
    Number() {} //make default constructor.


    // own copy constructor.
    // in absence of this, default copy constructor is made.
    Number(Number& obj)
    {
        cout<<"Copy Constructor called"<<endl;
        a = obj.a;
    }

    Number(int num)
    {
        a = num;
    }

    void display()
    {
        cout << "The number for this obj is " << a << endl;
    }
    // Number
};

int main()
{
    Number x, y, z(45),z2;
    x.display(); // garbage value
    y.display(); // garbage value
    z.display(); // 45
    Number z1(z);
    /*
    first the compiler checks if a copy contructor exists or not
    if it exists then it used that one'
    if not it makes own default copy constructor
    when no copy constructor is found, the compiler supplies its own copy constructor.
    */
    z1.display(); 
    z2 = z; // only assignment, copy constructor not called since z2 already made.
    Number z3 = z;// yes copy constructor is invoked.

}