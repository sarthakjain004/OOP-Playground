#include <bits/stdc++.h>
using namespace std;

class Point{
    int x,y;
    public:
        Point(int a,int b){
            x = a;
            y = b;
        }

        void displayPoint()
        {
            cout<<"The point is ("<<x<<","<<y<<")"<<endl;
        }
        // double dist(Point&p)
        // {
        //     return sqrt(pow(x-p.x,2) + pow(y-p.y,2));
        // }
        friend double dist(Point& p1, Point& p2);
};

double dist(Point&p1, Point& p2)
{
    return sqrt(pow(p1.x - p2.x,2) + pow(p1.y - p2.y,2));
}

int main()
{
    Point p(1,1);
    p.displayPoint();

    Point q(4,6);
    q.displayPoint();

    cout<<dist(p,q)<<endl;
}