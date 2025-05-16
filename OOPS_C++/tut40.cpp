#include <bits/stdc++.h>
using namespace std;

class Student
{
protected:
    int roll_number;

public:
    void set_roll_number(int);
    void get_roll_number(void);
};

void Student ::set_roll_number(int r)
{
    roll_number = r;
}
void Student ::get_roll_number(void)
{
    cout << "The roll number is " << roll_number << endl;
    ;
}

class Exam : public Student
{
protected:
    float maths;
    float physics;

public:
    void set_marks(float, float);
    void get_marks(void);
};

void Exam ::set_marks(float m, float p)
{
    maths = m;
    physics = p;
};

void Exam ::get_marks(void)
{
    cout << "Marks of Maths: " << maths << " Physics: " << physics << endl;
}

class Result: public Exam{
    float percentage;
    public:
        void display(){
            get_roll_number();
            get_marks();
            cout<<"Your percentage is: "<<(maths+physics)/2<<endl;
        }
};

int main()
{
    Result r;
    r.set_roll_number(10);
    r.set_marks(70,80);
    r.display();
}