#include <bits/stdc++.h>
using namespace std;

class Base{
    protected:
        int a;
    private:
        int b;
};
// for a protected member-
/*                  Public Derivation       Private Derivation      Protected Derivation
    1.Private members Not Inherited.        Not inherited           Not inherited     
    2.Protected "     Protected             Private                 Protected
    3.Public "        Public                Private                 Protected
*/
class Derived : public Base{

};

int main()
{
    Base b;
    Derived d;
    // cout<<b.a<<endl; //a is protected. compile error.
    
}