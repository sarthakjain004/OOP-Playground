#include <bits/stdc++.h>
using namespace std;

// count is the static data memeber of class Employee.

class Employee
{
    static int count; // static variables are automatically innitialised to 0.
    // cant do this below-
    // static int count = 1000;
    int id;

public:
    void setData(void)
    {
        count++;
        cout << "Enter ID " << endl;
        cin >> id;
    }
    void getData(void)
    {
        cout << "The id is " << id << " count is " << count;
    }
    // non static functions can access static members also.
    // static member functions cant access non static variables.
    static void getCount(void)
    {
        cout << "the value of count is " << count << endl;
    }
};

int Employee::count; // default val is 0.
// need to do above so as to allocate memory for the static variable.
// if dont, then no mem allocated, compile error. class doesnt make any memory.
// can do this below-
// int Employee:: count = 1000;
int main()
{
    Employee harry, rohan, lovish;
    harry.setData();
    harry.getData();

    Employee::getCount();
    rohan.setData();
    rohan.getData();

    Employee::getCount();
    lovish.setData();
    lovish.getData();

    Employee::getCount();
}