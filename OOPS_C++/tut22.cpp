#include <bits/stdc++.h>
using namespace std;

class binary
{
    string s;

public:
    void read(void);
    void chk_bin(void);
    void ones(void);
    void display(void);
};

void binary ::read(void)
{
    cout << "Enter a binary number" << endl;
    cin >> s;
}

void binary::chk_bin(void)
{
    for (int i = 0; i < s.size(); i++)
    {
        if (s[i] != '0' && s[i] != '1')
        {
            cout << "Not binary" << endl;
            exit(0);
        }
    }
    cout << "Yes binary" << endl;
}

void binary ::ones(void)
{
    chk_bin();
    for(int i=0;i<s.size();i++)
    {
        if(s[i]=='0') s[i]='1';
        else if(s[i]=='1') s[i] = '0';
    }
}

void binary :: display(void){
    cout<<s<<endl;
}

int main()
{
    // OOPS- Classes and objects.
    /*
    C++ initially called C with classes.
    class -> extension of structures in C.
    structures had limitations
            ->members are public
            ->No methods
    classes = structures + more
    classes can have methods and properties.
    classes can make few members as private and few as public.
    structures in c++ are typedefed.
    you can declare objects along with class declaration.
    class Employee{
        // class def.
    } harry , rohan, rahul;
    rahul.salary = 8 makes no sense if salary is private.
    */
    /*
     Nesting of member functions-
    */
    binary b;
    b.read();
    // b.chk_bin();
    b.ones();
    b.display();
}