#include<bits/stdc++.h>
using namespace std;

typedef struct employee{
    int eID;
    char favChar;
    float salary;
} ep;
// no data hiding in struct.

class Employee{
    private:
        int a,b,c;
    public:
        int d,e;
        void setData(int a1,int b1,int c1); // declaration.
        void getData(){
            cout<<"The value of a is "<<a<<endl;
            cout<<"The value of b is "<<b<<endl;
            cout<<"The value of c is "<<c<<endl;
            cout<<"The value of d is "<<d<<endl;
            cout<<"The value of e is "<<e<<endl;
            // cout<<"The value of a is "<<endl;
        }
};
// this setData is of employee class so use scope resolution operator to tell the compiler this.

void Employee :: setData(int a1,int b1, int c1){
    a = a1;
    b = b1;
    c = c1;
}

int main()
{
    Employee harry;
    // harry.a = 15; throws error as "a" is private field.
    harry.setData(1,2,3); // a,b,c is private.
    harry.d = 10;
    harry.e = 11;
    harry.getData(); // default constructor gives garbage values to uninititalised variables.

}