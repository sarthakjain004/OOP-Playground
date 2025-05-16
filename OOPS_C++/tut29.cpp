#include <bits/stdc++.h>
using namespace std;


class Complex{
    int a,b;
    public:
    // creating a constructor.
    /*
    Constructor is a special member function
    with the same name as of the class 
    It is automatically invoked whenever an
    object is created.
    It is used to initialize the objects of its class.
    */
    Complex(void); // constructor declaration.
    void printData(void)
    {
        cout<<a<<" "<<b<<endl;
    }
};

Complex :: Complex(void){
    a = 0;
    b = 0;
}
int main()
{
    Complex c;
    c.printData();
}
/*
1. It should be declared in public section of class.
2. Automatically invoked whenever object is created.
3. do not have return types. compile error if add return type. cant do void also.
4. can have default arguments.
5. we cannot refer to their address.
*/