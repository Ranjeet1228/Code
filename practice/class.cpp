#include <iostream>
using namespace std;

class student
{

    string name;
    int roll_num;
    public:
    student(string name, int roll_num)
    {
        this->name = name;
        this->roll_num = roll_num;
    }

    void print_details()
    {
        cout << "Name of student:- " << name << endl;
        cout << "Roll number of student:- " << roll_num << endl;
    }


};

int main()
{
student s2("Raman",420);;
s2.print_details();

    student *st = new student("ranjeet", 14);
    return 0;
}