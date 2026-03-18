#include <iostream>
using namespace std;

void modify (int a)
{
    a = a+10;
}

int main()
{
   int a = 5; 
   modify(a);
   cout<<a<<endl;
   return 0;

}