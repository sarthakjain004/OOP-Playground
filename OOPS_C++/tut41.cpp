#include <bits/stdc++.h>
using namespace std;

class Base1
{
protected:
    int base1int;

public:
    void getbase1int()
    {
        cout << "Base1 int is " << base1int << endl;
    }
    void setbase1int(int a)
    {
        base1int = a;
    }
};

class Base2
{
protected:
    int base2int;

public:
    void getbase2int()
    {
        cout << "Base1 int is " << base2int << endl;
    }
    void setbase2int(int a)
    {
        base2int = a;
    }
};

class Derived : public Base1, public Base2
{
    public:
    void show(){
        cout<<"the vlaue of base 1 is "<<base1int<<endl;
        cout<<"the value of base 2 is "<<base2int<<endl;
    }
};

int main()
{
    Derived d;
    d.setbase1int(10);
    d.setbase2int(50);
    d.show();
}