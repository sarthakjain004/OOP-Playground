#include <bits/stdc++.h>
using namespace std;
// ambiguity resolution in inheritance.

class Base1
{
public:
    void greet()
    {
        cout << "How are you?" << endl;
    }
};

class Base2
{
public:
    void greet()
    {
        cout << "Kaise ho?" << endl;
    }
};

class Derived : public Base1, public Base2
{
    int a;

public:
    void greet()
    {
        Base2::greet();
    }
};

class B
{
public:
    void say()
    {
        cout << "Hello World" << endl;
    }
};

class D : public B
{
    int a;

// public:
// this below same say() will override the base class's say() method.
//     void say()
//     {
//         cout << "Hello World my beaytify people" << endl;
//     }
};
int main()
{
    // Derived d;
    // d.greet();
    B b;
    b.say();

    D d;
    d.say();
}