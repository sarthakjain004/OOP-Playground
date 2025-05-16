#include <bits/stdc++.h>
using namespace std;
// dynamic initialization of objects using constructors.

class BankDeposit
{
    int principal;
    int years;
    float interestRate;
    float returnValue;

public:
    BankDeposit() {}
    BankDeposit(int p, int y, float r)
    {
        principal = p;
        years = y;
        interestRate = r;

        returnValue = principal;
        for (int i = 0; i < years; i++)
        {
            returnValue *= (1 + r);
        }
    }
    BankDeposit(int p, int y, int r)
    {
        principal = p;
        years = y;
        interestRate = float(r) / 100;

        returnValue = principal;
        for (int i = 0; i < years; i++)
        {
            returnValue *= (1 + interestRate);
        }
    }
    void show();
};

void BankDeposit::show()
{
    cout << returnValue << endl;
}

int main()
{
    BankDeposit bd1, bd2, bd3; // need the BankDeposit(){} constructor to make objects like this.

    int p, y;
    float r;
    int R; // percentage form.
    cout << "Enter value of p y and r" << endl;
    cin >> p >> y >> r;
    bd1 = BankDeposit(p, y, r);
    bd1.show();

    cout << "Enter value of p y and r" << endl;
    cin >> p >> y >> R;
    bd1 = BankDeposit(p, y, R);
    bd1.show();
}