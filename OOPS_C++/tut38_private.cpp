#include <bits/stdc++.h>
using namespace std;

class Base
{
    int data1; // not inheritable.
public:
    int data2;
    void setData();
    int getdata1();
    int getdata2();
};

void Base ::setData(void)
{
    data1 = 10;
    data2 = 20;
}

int Base ::getdata1(void)
{
    return data1;
}

int Base ::getdata2(void)
{
    return data2;
}

class Derived : private Base
{
    // getdata1, getdata2, setdata are private in here. objects of derived class cannot access these 3 funcs.
    // class is being derived privately visibiility mode.
    int data3;

public:
    void process();
    void display();
};

void Derived ::process(void)
{
    setData();
    data3 = data2 * getdata1();
}
void Derived ::display(void)
{
    cout << "The value of data1 is " << getdata1() << endl;
    cout << "The value of data2 is " << data2 << endl;
    cout << "The value of data3 is " << data3 << endl;
}

int main()
{
    Derived d;
    d.display(); // all are garbage values.
    cout << "Setting 3" << endl;
    d.process();
    d.display();
}