#include <bits/stdc++.h>
using namespace std;
// int count = 0;
// destructor never takes an argument nor does it return any value.
class num{
    public:
    int a;
    static int count;
    public:
        num(){
            count++;
            cout<<"this is the time when constructor is called for obj number "<<count<<endl;
        }

        ~num(){
            cout<<"Destructor called for obj number "<<count<<endl;
            count--;
        }
};

int num::count = 0;

int main()
{
    cout<<"We are inside main func"<<endl;
    cout<<"Creating first obj n1"<<endl;
    num* n1 = new num();
    cout<<n1->a<<endl;
    {
        cout<<"Entering this block"<<endl;
        cout<<"Creating 2 more objects."<<endl;
        num n2,n3;
        cout<<"Exiting this block"<<endl;
    }
    cout<<"back to main"<<endl;
}