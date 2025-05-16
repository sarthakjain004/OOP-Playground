#include <bits/stdc++.h>
using namespace std;
/*
syntax for initializatoion list in constructor.
constructor (argument-list) : initialization-section
{
    assignment + other code.
}
*/
class Test
{
    int a; // a is declared first. so a is first initialised.
    int b;

public:
    Test(int i, int j) : a(i), b(j)
    // Test(int i, int j) : a(i), b(i + j) //works
    // Test(int i,int j) : a(i), b(2*j) //works
    // Test(int i,int j) : a(i), b(a+j) // works
    // Test(int i,int j) : b(j),a(i+b) // RED flag , a has garbage value. a is delcared first, so it will be initialised first.
    // Test(int i, int j) : a(b+i), b(a+j)// a has garbage value and so b also has garbage value.
    { // a = i and b = j then.
        // body of constructor.
        cout << "Construcotr executed" << endl;
        cout << a << endl
             << b << endl;
    }
};
int main()
{
    Test t(4, 6);
}