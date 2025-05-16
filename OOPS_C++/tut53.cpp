#include<iostream>
using namespace std;

class A{
    int a;
    public:
    int d;
    public:
        void setData(int a){
            // in a = a, the priority is given to local variable so the a(local) = a(class variable.)
            this->a = a;  //without this-> gives garbage value.
        }
        void getData(){
            cout<<"The value of a is "<<a<<endl;
        }
};

class B: public A{
    public:
        void setD(int d)
        {
            this->d = d; //without this-> gives garbage value.
        }
        void getD(){
            cout<<"The value of D is  "<<d<<endl;
        }
};

int main()
{
    // A a;
    // a.setData(4);
    // a.getData();
    B b;
    b.setD(10);
    b.getD();
}