#include <bits/stdc++.h>
using namespace std;

class Employee
{
public:
    int id;
    float salary;

public:
    Employee(int empID)
    {
        id = empID;
        salary = 34.0;
    }
    Employee() {} // needed as the progammer one would use this constructor.
};

// class derived - class name : {{visibility mode}} {{base-class-name}}
// creating a programmer class derived from employee base class.

// default visibility mode is private
// private visib mode- public members of base class become private members of derived class.
// public visib mode- public memebers of base class becomes public only.
// private members of the base class are nevern inherited;.

class Programmer : Employee
{ // IMPORTANT  default visibility mode is private.
public:
    Programmer(int eid)
    {
        id = eid;
    }
    int languageCode = 9;
    void getData()
    {
        cout << id << endl;
    }
};

int main()
{
    Employee harry(1), rohan(2);
    Programmer skillf(10);
    cout << skillf.languageCode << endl;
    // cout<<skillf.id<<endl; //if no visib mode or visib mode is private then compile error as id is then a private member of programmer class.
    skillf.getData();
}