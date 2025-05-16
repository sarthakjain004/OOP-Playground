#include <bits/stdc++.h>
using namespace std;

class Simple{
    int data1;
    int data2;
    public:
    Simple(int a, int b = 9){
        data1 = a;
        data2= b;
    }
    // Simple(int a) // compile error->ambiguity.
    // {
    //     data1 = a;
    //     data2 = -1;
    // }
    void printData(void);
};

void Simple::printData(void){
    cout<<data1<<" "<<data2<<endl;
}

int main()
{
    Simple s(1);
    s.printData();
}