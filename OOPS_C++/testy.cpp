#include<iostream>
using namespace std;

class Test{
    public:
        Test() { cout<<"Here 1"<<endl;}
        ~Test() {cout<<"here2"<<endl;}

};
int main()
{
    try{
        Test t1;
        throw 10;
    }
    catch(int i)
    {
        cout<<"caught"<<i<<endl;
    }
}