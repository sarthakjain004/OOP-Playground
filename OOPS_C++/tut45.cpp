#include <bits/stdc++.h>
using namespace std;

class student
{
protected:
    int roll_no;

public:
    void set_number(int a)
    {
        roll_no = a;
    }
    void printNumber(void)
    {
        cout << "Your roll no is " << roll_no << endl;
    }
};

class Test : virtual public student
{
protected:
    float maths, physics;

public:
    void set_marks(float m1, float m2)
    {
        maths = m1;
        physics = m2;
    }

    void print_marks(void)
    {
        cout << "Your result is: "
             << "Maths: " << maths
             << " Physics: " << physics << endl;
    }
};

class Sports : virtual public student
{
protected:
    float score;

public:
    void set_score(float sc)
    {
        score = sc;
    }

    void print_score(void)
    {
        cout << "Your PT score is " << score << endl;
    }
};

class Result : public Test, public Sports
{
private:
    float total;

public:
    void display()
    {
        total = maths + physics + score;
        printNumber();
        print_marks();
        print_score();
        cout << "Your total score is " << total << endl;
    }
};

int main()
{
    Result r;
    r.set_number(10);
    r.set_marks(100, 95);
    r.set_score(92);
    r.display();
}