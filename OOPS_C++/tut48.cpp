#include <bits/stdc++.h>
using namespace std;

// we can use constructors in derived classes in  c++
// if base class contructor is not taking any arguments, then there
// is no need of any constructor in derived clas.

// IMP - if there is one or more arguments in the base class constructor,
// derived class needs to pass arguments to the base class constructor.

// if both base and derived classes have constructors, then base class constructor is executed first.

// SPECIAL SYNTAX-

/*
C++ supports special syntax for passing arguments to multiple or single base classes
The constructor of derived class receives all the arguments at once, and then will pass the calls to the repsective base classes.
The body is called after all the constructors are finsished executing.

SYNTAX-
{{derived-constructor}}(arg1,arg2,arg3,....) : {{Base-1}}(arg1,..), {{Base-2}}(arg2,..)
    {

    }


The constructors for virtual base classes are invoked before a non vitual base class.
if there are multiple virtual base classes then invoked in order delcared.
then Any non virtual base class are constriucted before the derived class constructor is executed.

*/

/*
Case1:
class B: public A{
   // Order of execution of constructor -> first A() then B()
};

Case2:
class A: public B, public C{
    // Order of execution of constructor -> B() then C() and A()
};

Case3:
class A: public B, virtual public C{
    // Order of execution of constructor -> C() then B() and A()
};

*/

class Base1
{
    int data1;

public:
    Base1(int i)
    {
        data1 = i;
        cout << "Base1 class constructor called" << endl;
    }
    void printDataBase1(void)
    {
        cout << "The value of data1 is " << data1 << endl;
    }
};

class Base2
{
    int data2;

public:
    Base2(int i)
    {
        data2 = i;
        cout << "Base2 class constructor called" << endl;
    }
    void printDataBase2(void)
    {
        cout << "The value of data2 is " << data2 << endl;
    }
};

class Derived : public Base2, public Base1
{
    int derived1, derived2;

public:
    Derived(int a, int b, int c, int d) : Base2(b), Base1(a)
    {
        derived1 = c;
        derived2 = d;
        cout << "Derived class constructor called" << endl;
    }
    void printDataDerived(void)
    {
        cout << "The value of derived1 is " << derived1 << endl;
        cout << "The value of derived2 is " << derived2 << endl;
    }
};
int main()
{
    Derived harry(1, 2, 3, 4);
    harry.printDataBase1();
    harry.printDataBase2();
    harry.printDataDerived();
    return 0;
}