#include<iostream>
using namespace std;

class A{
    public:
        int a;
        int b;
    A()
    {
        a = 10;
        b = 20;
    }
};

class B : public A{
    int c = 0;
    int d = 0;
};

int main()
{
    A* a;
    B b;
    a = &b;


}